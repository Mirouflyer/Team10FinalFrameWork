package searchInHPageDB;

import base.CommonAPI;
import dataSources.DataBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static base.CommonAPI.convertToString;

public class SearchTitlesFromDB extends CommonAPI {

    DataBase dataBase = new DataBase();

    @FindBy(xpath = "//div[@id='search-button']")
    public static WebElement search;
    @FindBy(xpath = "//input[@id='search-input-field']")
    public static WebElement typeOnSearch;

    //getters
    public static WebElement getSearch() { return search; }

    public static WebElement getTypeOnSearch() { return typeOnSearch; }


    //runMethods
    public void clickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearch().click();
    }
    public void searchFor(String bigTitle) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName())+ " "+ bigTitle);
        getTypeOnSearch().sendKeys(bigTitle,Keys.ENTER);
    }
    public void clearInPut(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getTypeOnSearch().clear();
    }

    //Get BigTitles From DB and search in Cnn webSite
    public void searchItemAndSubmit() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataBase.getItemListFromDB();

        //searchFor(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            clickOnSearch();
            clearInPut();
            searchFor(list.get(i));
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }
    }
}
