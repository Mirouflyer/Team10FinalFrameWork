package testHomePageText;

import base.CommonAPI;
import homePageText.GetToKnowUsText;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class testGetToKnowUsText extends CommonAPI {

    @Test
    public void getToKnowUsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsText getToKnowUsText = PageFactory.initElements(driver, GetToKnowUsText.class);
        getToKnowUsText.checkGetToKnowUsText();
    }

    @Test
    public void ourCompanyText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsText getToKnowUsText = PageFactory.initElements(driver, GetToKnowUsText.class);
        getToKnowUsText.checkOurCompanyText();
    }

    @Test
    public void digitalMuseumText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsText getToKnowUsText = PageFactory.initElements(driver, GetToKnowUsText.class);
        getToKnowUsText.checkDigitalMuseumText();
    }

    @Test
    public void ourSuppliersText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsText getToKnowUsText = PageFactory.initElements(driver, GetToKnowUsText.class);
        getToKnowUsText.checkOurSuppliersText();
    }

    @Test
    public void sellOnWalmartComText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsText getToKnowUsText = PageFactory.initElements(driver, GetToKnowUsText.class);
        getToKnowUsText.checkSellOnWalmartComText();
    }

    @Test
    public void advertiseWithUsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsText getToKnowUsText = PageFactory.initElements(driver, GetToKnowUsText.class);
        getToKnowUsText.checkAdvertiseWithUsText();
    }

    @Test
    public void careersText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsText getToKnowUsText = PageFactory.initElements(driver, GetToKnowUsText.class);
        getToKnowUsText. checkCareersText();
    }
}
