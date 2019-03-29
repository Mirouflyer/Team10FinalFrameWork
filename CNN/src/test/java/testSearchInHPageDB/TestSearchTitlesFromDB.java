package testSearchInHPageDB;

import base.CommonAPI;
import menu.CnnMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import searchInHPageDB.SearchTitlesFromDB;


import java.io.IOException;
import java.sql.SQLDataException;

public class TestSearchTitlesFromDB extends CommonAPI {
    @Test
    public void searchBigTitles()throws Exception, IOException, SQLDataException, ClassNotFoundException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchTitlesFromDB searchTitlesFromDB = PageFactory.initElements(driver, SearchTitlesFromDB.class);
        searchTitlesFromDB.searchItemAndSubmit();
    }
}
