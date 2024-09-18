package org.example.questions.Autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvatarClientQuestions implements Question {
    private WebDriver driver;
    @Override
    public String answeredBy(Actor actor) {
        WebElement imagenElement = (WebElement) WebElementQuestion.the(By.cssSelector(".avatar")).answeredBy(actor);
        String currentImage = imagenElement.getAttribute("src");
        return currentImage;
    }

    public static Question<String> value() {
        return new AvatarClientQuestions();
    }
}