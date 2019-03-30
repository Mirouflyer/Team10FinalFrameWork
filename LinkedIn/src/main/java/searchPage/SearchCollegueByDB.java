package searchPage;

import base.CommonAPI;
import datasource.DataBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchCollegueByDB extends CommonAPI {

    DataBase dataBase = new DataBase();

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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getFirstNameInput().sendKeys(firstName);
    }

    public void typeLastName(String lastName){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getLastNameInput().sendKeys(lastName);
    }

    public void clickOnSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearchButton().click();
    }

    public void driveBack(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        driver.navigate().back();
    }

    public void searchItemAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<String> list  = dataBase.getItemListFromDBFirstName();
        List<String> list1 = dataBase.getItemListFromDBLastName();
        for (int i = 0; i < list.size(); i++) {
            typeFirstName(list.get(i));
            typeLastName(list1.get(i));
            clickOnSearchButton();
            driveBack();
        }
    }
}
