package pages;

import base.CommonAPI;
import keyword.ExcelReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;

public class SearchPageExel extends CommonAPI {

    @FindBy(how = How.CSS, using ="#global-search-input" )
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".a1qUqR.a2GoU-.GlobalHeaderSearchbar-submit.a2btJm" )
    public static WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement(){
        return searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement(){
        return submitButtonWebElement;
    }

    public void searchFor(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ value);
        getSearchInputWebElement().sendKeys(value);
    }

    public void submitSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();

    }

    public void clearInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }

    public void searchItemsAndSubmitButtonFromExcelFile() throws Exception, IOException, ClassNotFoundException  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        ExcelReader excelReader = new ExcelReader();
        String [] list = excelReader.getDataFromExcelFile();
        for(int i=1; i<list.length; i++) {
            searchFor(list[i]);
            submitSearchButton();
            clearInput();
        }
    }
}
