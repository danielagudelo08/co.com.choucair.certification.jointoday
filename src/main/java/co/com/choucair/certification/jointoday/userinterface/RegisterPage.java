package co.com.choucair.certification.jointoday.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    public static final Target REGISTER_BUTTON =
            Target.the("Button that shows us the registration form")
                    .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_FIRST_NAME =
            Target.the("Where are we going to enter our first name")
                    .located(By.name("firstName"));
    public static final Target INPUT_LAST_NAME =
            Target.the("Where are we going to enter our last name")
                    .located(By.name("lastName"));
    public static final Target INPUT_EMAIL_ADDRESS =
            Target.the("Where are we going to enter our email address")
                    .located(By.id("email"));
    public static final Target INPUT_MONTH_OF_BIRTH =
            Target.the("Where are we going to enter our month of birth")
                    .located(By.id("birthMonth"));
    public static final Target INPUT_DAY_OF_BIRTH =
            Target.the("Where are we going to enter our day of birth")
                    .located(By.id("birthDay"));
    public static final Target INPUT_YEAR_OF_BIRTH =
            Target.the("Where are we going to enter our year of birth")
                    .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_LOCATION =
            Target.the("Button that takes us to next location")
                    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));

    public static final Target INPUT_CITY =
            Target.the("Where are we going to enter our city")
                    .located(By.id("city"));

    public static final Target INPUT_ZIP_CODE =
            Target.the("Where are we going to enter the zip code of the city")
                    .located(By.id("zip"));

    public static final Target INPUT_COUNTRY =
            Target.the("Where are we going to enter our country")
                    .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group-box > div.row > div.col-xs-12.col-sm-12.col-md-6.col-lg-6.location > div:nth-child(4) > div.ui-select > div > div > div.ui-select-match > span"));

    public static final Target BUTTON_NEXT_DEVICES =
            Target.the("Button that take us to next devices")
                    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

    public static final Target BUTTON_NEXT_LAST_STEP =
            Target.the("Button that take us to next last step")
                    .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > div:nth-child(2) > div > a > span"));

    public static final Target INPUT_PASSWORD =
            Target.the("Where are we going to enter our password")
                    .located(By.id("password"));

    public static final Target INPUT_PASSWORD_AGAIN =
            Target.the("Where are we going to enter our password again")
                    .located(By.id("confirmPassword"));

    public static final Target BUTTON_CHECK_TERMS_OF_USE =
            Target.the("Button to check the terms of use")
                    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target BUTTON_CHECK_PRIVACY =
            Target.the("Button to check te privacy & security policy")
                    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));


    public static final Target BUTTON_FINAL =
            Target.the("Button to create our account")
                    .located(By.cssSelector("#laddaBtn > span"));



}
