package org.example.tasks.Autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.ui.Autenticacionui.LoginView;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class corporate implements Task {

    public <T extends Actor> void performAs(T actor) {
        // Obtener el WebDriver a través de Serenity
        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

        // Guardar el ID de la ventana original
        String originalWindow = driver.getWindowHandle();

        actor.attemptsTo(
                WaitUntil.the(LoginView.CORPORATE, WebElementStateMatchers.isVisible()).forNoMoreThan(40).seconds(),
                Click.on(LoginView.CORPORATE),

                //Ingreso a Capital Inteligente
                WaitUntil.the(LoginView.SMART_CAPITAL, WebElementStateMatchers.isVisible()).forNoMoreThan(40).seconds(),
                Click.on(LoginView.SMART_CAPITAL)
        );

        // Obtener todos los handles de las ventanas
        Set<String> windowHandles = driver.getWindowHandles();

        // Cambiar a la nueva ventana que no es la original
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Continuar con las siguientes acciones en la nueva ventana
        actor.attemptsTo(
                WaitUntil.the(LoginView.ECONOMIC_NEWS, WebElementStateMatchers.isVisible()).forNoMoreThan(40).seconds(),
                Click.on(LoginView.ECONOMIC_NEWS),
                // Scroll para visualizar la primera noticia
                Scroll.to(LoginView.FIRST_NEWS),
                WaitUntil.the(LoginView.FIRST_NEWS, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Click.on(LoginView.FIRST_NEWS)
        );

        // Si deseas regresar a la ventana original al final de la task
        //driver.switchTo().window(originalWindow);
    }
}
