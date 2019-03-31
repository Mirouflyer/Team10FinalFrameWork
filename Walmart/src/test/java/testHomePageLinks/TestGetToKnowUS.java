package testHomePageLinks;

import base.CommonAPI;
import homePageLinks.GetToKnowUs;
import homePageLinks.WalmartServicesLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestGetToKnowUS extends CommonAPI {

    @Test
    public void ourCompanyLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUs getToKnowUs = PageFactory.initElements(driver, GetToKnowUs.class);
        getToKnowUs.clickOnOurCompanyButton();
    }

    @Test
    public void digitalMuseumLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUs getToKnowUs = PageFactory.initElements(driver, GetToKnowUs.class);
        getToKnowUs.clickOnDigitalMuseumButton();
    }

    @Test
    public void ourSuppliersLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       GetToKnowUs getToKnowUs = PageFactory.initElements(driver, GetToKnowUs.class);
       getToKnowUs.clickOnOurSuppliersButton();
    }

    @Test
    public void sellOnWalmartComLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUs getToKnowUs = PageFactory.initElements(driver, GetToKnowUs.class);
        getToKnowUs.clickOnSellOnWalmartComButton();
    }

    @Test
    public void advertiseWithUsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUs getToKnowUs = PageFactory.initElements(driver, GetToKnowUs.class);
        getToKnowUs.clickOnAdvertiseWithUsButton();
    }

    @Test
    public void careersLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUs getToKnowUs = PageFactory.initElements(driver, GetToKnowUs.class);
        getToKnowUs.clickOnCareersButton();
    }


}
