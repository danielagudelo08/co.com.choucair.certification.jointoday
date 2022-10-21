package co.com.choucair.certification.jointoday.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/welcome?from=signup")
public class LoginPage extends PageObject {

    public static final Target BUTTON_LOGIN =
            Target.the("Button that takes us to the login")
                    .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));

    public static final Target INPUT_USER =
            Target.the("Where are we going to enter our username or email")
                    .located(By.id("username"));

    public static final Target INPUT_PASSWORD =
            Target.the("Where are we going to enter our password")
                    .located(By.id("password"));

    public static final Target BUTTON_TO_SIG_IN =
            Target.the("Button to sign in")
                    .located(By.name("login"));
}
