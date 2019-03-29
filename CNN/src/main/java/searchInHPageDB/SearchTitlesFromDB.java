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
    @FindBy(xpath = "//div[@class='cnn-search__fields']//input[@type='text'] ")
    public static WebElement search2;

    //getters
    public static WebElement getSearch() { return search; }

    public static WebElement getTypeOnSearch() { return typeOnSearch; }

    public static WebElement getSearch2() { return search2; }


    //runMethods
    public void clickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearch().click();
    }
    public void searchFor(String bigTitle) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName())+ " "+ bigTitle);
        getTypeOnSearch().sendKeys(bigTitle,Keys.ENTER);
    }
    public void searchFor2(String bigTitle) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName())+ " "+ bigTitle);
        getSearch2().sendKeys(bigTitle,Keys.ENTER);
    }
    public void clearInPut(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getTypeOnSearch().clear();
    }

    //Get BigTitles From DB and search in Cnn webSite
    public void searchItemAndSubmit() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataBase.getItemListFromDB();
        clickOnSearch();
        searchFor(list.get(0));
        driver.findElement(By.xpath("//div[@class='cnn-search__fields']//input[@type='text'] ")).clear();
//        for (int i = 1; i < list.size(); i++) {
//            searchFor(list.get(i));
//            Thread.sleep(1500);
//            driver.navigate().back();
//            clearInPut();
//
//        }
    }
}
