package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPageDB;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchPageDB extends CommonAPI {

    @Test
    public void searchPage() throws Exception, IOException, SQLException, ClassNotFoundException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPageDB searchPage = PageFactory.initElements(driver, SearchPageDB.class);
        searchPage.searchItemAndSubmitButton();
    }
}
