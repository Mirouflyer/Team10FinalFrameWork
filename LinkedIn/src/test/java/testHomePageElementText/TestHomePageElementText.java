package testHomePageElementText;

import base.CommonAPI;
import homePageText.HomePageElementText;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestHomePageElementText extends CommonAPI {

    @Test
    public void homePageElementText(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        HomePageElementText homePageElementText = PageFactory.initElements(driver,HomePageElementText.class);
        homePageElementText.getTextAndCheck();
    }
}
