package stepdefinations.Autenticacion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.tasks.Autenticacion.corporate;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class logInSteps {

    @Given("^(.*) tiene acceso a la URL")
    public void onTheBelGoHome(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(Open.browserOn().
                thePageNamed("pages.URLBANCOLOMBIA"));

    }

    @When("^ingresa a corporativos, actualidad económica$")
    public void selectCorporate() {
        OnStage.theActorInTheSpotlight().attemptsTo();
        theActorInTheSpotlight().attemptsTo(
                new corporate()
        );
    }

    @When("^valido el PDF$")
    public void ValidateFullPDF() {
        /*
        OnStage.theActorInTheSpotlight().attemptsTo();
        theActorInTheSpotlight().attemptsTo(
                new corporate()
        );
         */
    }



}
