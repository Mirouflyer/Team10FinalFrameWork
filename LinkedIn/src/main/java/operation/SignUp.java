package operation;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignUp extends CommonAPI {

    @FindBy(xpath = "//input[@id='reg-firstname']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='reg-lastname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='reg-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='reg-password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//input[@id='registration-submit']")
    public WebElement joinNowButton;


    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getJoinNowButton() {
        return joinNowButton;
    }

    public void typeFirstName(String firstName){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ firstName);
        getFirstNameInput().sendKeys(firstName);
    }

    public void typeLastName(String lastName){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ lastName);
        getLastNameInput().sendKeys(lastName);
    }

    public void typeEmail(String email){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ email);
      getEmailInput().sendKeys(email);
    }

    public void typePasswors(String password){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ password);
        getPasswordInput().sendKeys(password);
    }

    public void clickJoinNowButton(){
        getJoinNowButton().click();
    }

    public void createAnAccount(String firstName, String lastName, String email, String password){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeFirstName(firstName);
        typeLastName(lastName);
        typeEmail(email);
        typePasswors(password);
        clickJoinNowButton();
    }
}