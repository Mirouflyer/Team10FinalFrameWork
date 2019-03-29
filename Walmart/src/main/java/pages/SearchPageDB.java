package pages;

import base.CommonAPI;
import datasource.DataBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPageDB extends CommonAPI {

    DataBase dataBase = new DataBase();

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

    public void searchItemAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataBase.getItemListFromDB();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }

}
