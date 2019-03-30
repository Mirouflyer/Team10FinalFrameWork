package testSearchPage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import searchPage.SearchCollegueByDB;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchCollegueByDB extends CommonAPI {

    @Test
    public void searchCollegueByDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchCollegueByDB searchCollegueByDB = PageFactory.initElements(driver,SearchCollegueByDB.class);
        searchCollegueByDB.searchItemAndSubmitButton();
    }
}
