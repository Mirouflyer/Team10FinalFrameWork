package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignIn extends CommonAPI {

    @FindBy(css = "#header-account-toggle")
    public WebElement clickOnAccountButton;

    @FindBy(xpath = "//a[@title='Sign In']//div[@class='a35M3c a15HBc y9t7h a11c4I ZhdgG a2_BWe']")
    public WebElement clickOnSignInPage;

    @FindBy(css = "#email")
    public WebElement emailInput;

    @FindBy(css = "#password")
    public WebElement passwordInput;

    @FindBy(css =".button.m-margin-top")
    public WebElement clickOnSignInButton;

    public WebElement getClickOnAccountButton() {
        return clickOnAccountButton;
    }

    public WebElement getClickOnSignInPage() {
        return clickOnSignInPage;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getClickOnSignInButton() {
        return clickOnSignInButton;
    }

    public void clickOnAccountButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnAccountButton().click();
    }

    public void clickOnSignInPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnSignInPage().click();
    }

    public void typeEmail(String email){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEmailInput().sendKeys(email);
    }

    public void typePassword (String password){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPasswordInput().sendKeys(password);
    }

    public void clickOnSignInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnSignInButton().click();
    }

    public void signInAccoount(String email, String password){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnAccountButton();
        clickOnSignInPage();
        typeEmail(email);
        typePassword(password);
        clickOnSignInButton();
    }

}
