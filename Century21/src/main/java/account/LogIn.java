package account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class LogIn {
    @FindBy(how = How.XPATH, using = "//div[@class='user hidden-md-down']//span[@class='user-message']")
    public static WebElement logInButton;

    @FindBy(how = How.XPATH, using = "//input[@id='login-form-email']")
    public static WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@id='login-form-password']")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'LOG IN')]")
    public static WebElement logInButtonSubmition;

    public static WebElement getLogInButtonButton() {
        return logInButton;
    }

    public static WebElement getEmail() {
        return email;
    }

    public static WebElement getPassword() {
        return password;
    }

    public static WebElement getLogInButtonSubmition() {
        return logInButtonSubmition;
    }

    public void clickOnLogInButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getLogInButtonButton().click();
    }
    public void enterEmail(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEmail().sendKeys(value);
    }
    public void enterPassword(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPassword().sendKeys(value);
    }

    public void submitLogInButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getLogInButtonButton().click();
    }

    public void signInToAccount() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnLogInButton();
        enterEmail("bdqqjkwfjjeedkv458cmly20@gamil.com");
        enterPassword("2255Yuuk*");
        submitLogInButton();
        Thread.sleep(2000);
    }
}
