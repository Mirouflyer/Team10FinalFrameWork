package operation;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class FindCollegue extends CommonAPI {

    @FindBy(xpath="//input[@placeholder='First name']")
    public WebElement firstNameInput;

    @FindBy(xpath="//input[@placeholder='Last name']")
    public WebElement lastNameInput;

    @FindBy(xpath="//input[@value='Search']")
    public WebElement searchButton;

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void typeFirstName(String firstName){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ firstName);
        getFirstNameInput().sendKeys(firstName);
    }

    public void typeLastName(String lastName){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " " +lastName);
        getLastNameInput().sendKeys(lastName);
    }

    public void clickOnSearchButton(){
        getSearchButton().click();
    }

    public void findCollegue(String firstName, String lastName){
        typeFirstName(firstName);
        typeLastName(lastName);
        clickOnSearchButton();
    }
}
