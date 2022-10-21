package co.com.choucair.certification.jointoday.stepdefinitions;

import co.com.choucair.certification.jointoday.tasks.CompleteTheForm;
import co.com.choucair.certification.jointoday.tasks.Login;
import co.com.choucair.certification.jointoday.tasks.OpenUp;
import co.com.choucair.certification.jointoday.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class JoinTodayStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Daniel wants to create an account on uTest$")
    public void thanDanielWantsToCreateAnAccountOnUTest() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), Register.onThePage());

    }


    @When("^he fills out the registration form$")
    public void heFillsOutTheRegistrationForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteTheForm.Fill());

    }

    @Then("^he creates his account on uTest$")
    public void heCreatesHisAccountOnUTest() {
        OnStage.theActorCalled("Daniel").attemptsTo(Login.pageLogin());

    }
}
