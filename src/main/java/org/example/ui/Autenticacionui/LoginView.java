package org.example.ui.Autenticacionui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {

    public static Target CORPORATE = Target.the("Opción corporativos")
            .located(By.id("header-empresas"));
    public static Target SMART_CAPITAL = Target.the("Opción Capital Inteligente")
            .located(By.xpath("//*[@id=\"headerMain\"]/div[2]/div[1]/nav/ul/li[5]/a"));
    public static Target ECONOMIC_NEWS = Target.the("Opción Capital Inteligente")
            .located(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a"));
    public static Target FIRST_NEWS = Target.the("Opción Capital Inteligente")
            .located(By.xpath("//*[@id=\"capital_inteligente\"]/div[1]/div[1]/div[2]/h2/a"));



}
