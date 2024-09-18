package org.example.questions.Utils;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Global {
    public static Question<List<String>> OptionsList(Target selectTarget) {
        return actor -> {
            WebElement selectWebElement = selectTarget.resolveFor(actor);
            List<WebElement> optionElements = selectWebElement.findElements(By.tagName("option"));
            // Crea una lista para almacenar las opciones.
            List<String> listOptions = new ArrayList<>();
            // Itera a través de las opciones y agrega el texto de cada opción a la lista.
            for (WebElement optionElement : optionElements) {
                listOptions.add(optionElement.getText());
            }
            // Imprime las opciones en la consola
            for (String option : listOptions) {
                System.out.println("Lista de Opciones " + option);
            }
            return listOptions;
        };
    }
    // Se obtiene la lista de los li de una lista
    public static Question<List<String>> OptionsListMenus(Target selectTarget, String TagName) {
        return actor -> {
            WebElement selectWebElement = selectTarget.resolveFor(actor);
            List<WebElement> optionElements = selectWebElement.findElements(By.tagName(TagName));
            // Crea una lista para almacenar las opciones.
            List<String> listOptions = new ArrayList<>();
            // Itera a través de las opciones y agrega el texto de cada opción a la lista.
            for (WebElement optionElement : optionElements) {
                listOptions.add(optionElement.getText());
            }
            return listOptions;
        };
    }

    //Obtener el valor de la url actual donde se esta ejecutando el test
    public static Question<String> UrlCurrenly(){
        return actor -> {
            WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
            return driver.getCurrentUrl();
        };
    }
    //Se valida la existencia del atributo para el campos de entrada o Inputs
    // Se deben enviar dos parametros el localizador y el atributo que se piensa validar
    public static Question<Boolean> GetAtributesInput(Target target, String attribute) {
        return actor -> {
            String StatusInput = target.resolveFor(actor).getAttribute(attribute);
            // Si el atributo se encuentra y es igual retornara un true
            // Si el atributo NO se encuentra, la comparación retorna un false dado que al no encontrarlo la comparación sera con un null
            return Objects.equals(StatusInput, attribute);
        };
    }
    // retorna el Valor que tenga el atributo actualmente
    public static Question<String> ValueAtribute(Target target, String attribute) {
        return actor -> target.resolveFor(actor).getAttribute(attribute);
    }
}
