package pages;

import base.CommonAPI;
import datasource.DataBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static base.CommonAPI.convertToString;

public class SearchPage extends CommonAPI {
    DataBase dataBase = new DataBase();


    @FindBy(how = How.XPATH, using = "//div[@class='search-button']") // Search Button
    public static WebElement searchInputWebElementButton;

    @FindBy(how = How.XPATH, using = "//input[@id='search-field']") // Search Field
    public static WebElement searchInputWebElement;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'View all search results')]") // Search Buttom
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElementButton() {
        return searchInputWebElementButton;
    }

    public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElementButton().click();
        getSearchInputWebElement().sendKeys(value,Keys.ENTER);

    }

    public void submitSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }

    public void clearInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }

    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataBase.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
           // submitSearchButton();
            clearInput();

        }
    }

    public void searchItemsAndSubmitButton(WebDriver driver1) throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataBase.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
            //submitSearchButton();
            Thread.sleep(1500);
            //clearInput();
        }
    }


    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<String> itemList = dataBase.getItemsListFromDB();
        for (String st : itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

}
