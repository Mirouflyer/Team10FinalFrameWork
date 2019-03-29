package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPageExel;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;
import java.util.concurrent.CancellationException;

public class TestSearchPageExcel extends CommonAPI {

    @Test
    public void searchPageExcel() throws Exception, IOException, CancellationException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPageExel searchPageExel = PageFactory.initElements(driver,SearchPageExel.class);
        searchPageExel.searchItemsAndSubmitButtonFromExcelFile();
    }
}
