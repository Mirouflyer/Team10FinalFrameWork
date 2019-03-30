package testOperation;

import base.CommonAPI;
import keywordDriven.Features;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;

public class TestKeywordDriven extends CommonAPI {

    @Test
    public void keywordDriven() throws IOException, InterruptedException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Features features = PageFactory.initElements(driver,Features.class);
        features.selectFeatures(driver);
    }
}
