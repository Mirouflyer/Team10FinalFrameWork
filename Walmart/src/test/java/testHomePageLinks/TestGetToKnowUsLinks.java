package testHomePageLinks;

import base.CommonAPI;
import homePageLinks.GetToKnowUsLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestGetToKnowUsLinks extends CommonAPI {

    @Test
    public void ourCompanyLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsLinks getToKnowUsLinks = PageFactory.initElements(driver, GetToKnowUsLinks.class);
        getToKnowUsLinks.clickOnOurCompanyButton();
    }

    @Test
    public void digitalMuseumLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsLinks getToKnowUsLinks = PageFactory.initElements(driver, GetToKnowUsLinks.class);
        getToKnowUsLinks.clickOnDigitalMuseumButton();
    }

    @Test
    public void ourSuppliersLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       GetToKnowUsLinks getToKnowUsLinks = PageFactory.initElements(driver, GetToKnowUsLinks.class);
       getToKnowUsLinks.clickOnOurSuppliersButton();
    }

    @Test
    public void sellOnWalmartComLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsLinks getToKnowUsLinks = PageFactory.initElements(driver, GetToKnowUsLinks.class);
        getToKnowUsLinks.clickOnSellOnWalmartComButton();
    }

    @Test
    public void advertiseWithUsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsLinks getToKnowUsLinks = PageFactory.initElements(driver, GetToKnowUsLinks.class);
        getToKnowUsLinks.clickOnAdvertiseWithUsButton();
    }

    @Test
    public void careersLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetToKnowUsLinks getToKnowUsLinks = PageFactory.initElements(driver, GetToKnowUsLinks.class);
        getToKnowUsLinks.clickOnCareersButton();
    }


}
