package co.com.choucair.certification.jointoday.tasks;

import co.com.choucair.certification.jointoday.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Login implements Task {

    private LoginPage loginPage;
    public static Login pageLogin(){
        return Tasks.instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginPage),
                Click.on(LoginPage.BUTTON_LOGIN),
                Enter.theValue("daniel323prueba@gmail.com").into(LoginPage.INPUT_USER),
                Enter.theValue("Daniel123456789@").into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_TO_SIG_IN)

        );
    }
}
