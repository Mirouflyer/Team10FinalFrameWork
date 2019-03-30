package testKeyWord;

import base.CommonAPI;
import keyWord.GetWebElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestGetWebElements extends CommonAPI {

    @Test
    public void compareElements() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetWebElements getWebElements = PageFactory.initElements(driver, GetWebElements.class);
        getWebElements.generateAboutElements();
    }
}
