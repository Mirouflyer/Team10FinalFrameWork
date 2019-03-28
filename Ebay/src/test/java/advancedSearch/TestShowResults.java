package advancedSearch;

import advancedSearchItem.ShowResults;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestShowResults extends CommonAPI {

    @Test
    public void buyingFormatsTest() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        ShowResults showResults = PageFactory.initElements(driver, ShowResults.class);
        showResults.checkAllResultsCheckBox();
    }
}