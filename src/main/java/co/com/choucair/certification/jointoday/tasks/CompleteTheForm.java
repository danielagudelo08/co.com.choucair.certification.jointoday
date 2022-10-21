package co.com.choucair.certification.jointoday.tasks;

import co.com.choucair.certification.jointoday.userinterface.RegisterPage;
import cucumber.runtime.Timeout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;


public class CompleteTheForm implements Task {
    public static CompleteTheForm Fill() {
        return Tasks.instrumented(CompleteTheForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                (Performable) Enter.theValue("Daniel").into(RegisterPage.INPUT_FIRST_NAME),
                Enter.theValue("Agudelo").into(RegisterPage.INPUT_LAST_NAME),
                Enter.theValue("daniel323prueba@gmail.com").into(RegisterPage.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText("March").from(RegisterPage.INPUT_MONTH_OF_BIRTH),
                SelectFromOptions.byVisibleText("23").from(RegisterPage.INPUT_DAY_OF_BIRTH),
                SelectFromOptions.byVisibleText("1999").from(RegisterPage.INPUT_YEAR_OF_BIRTH),
                Click.on(RegisterPage.BUTTON_NEXT_LOCATION),
                Enter.theValue("050005").into(RegisterPage.INPUT_ZIP_CODE),
                Click.on(RegisterPage.BUTTON_NEXT_DEVICES),
                Click.on(RegisterPage.BUTTON_NEXT_LAST_STEP),
                Enter.theValue("Daniel123456789@").into(RegisterPage.INPUT_PASSWORD),
                Enter.theValue("Daniel123456789@").into(RegisterPage.INPUT_PASSWORD_AGAIN),
                Click.on(RegisterPage.BUTTON_CHECK_TERMS_OF_USE),
                Click.on(RegisterPage.BUTTON_CHECK_PRIVACY),
                Click.on(RegisterPage.BUTTON_FINAL)




        );
    }
}