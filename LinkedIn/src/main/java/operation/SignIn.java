package operation;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignIn extends CommonAPI {

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement signInButton;

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public void typeEmail(String email){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ email);
        getEmailInput().sendKeys(email);
    }

    public void typePassword(String password){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ password);
        getPasswordInput().sendKeys(password);
    }

    public void clickSiginIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignInButton().click();
    }

    public void signIn(String email, String password){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeEmail(email);
        typePassword(password);
        clickSiginIn();
    }
}
