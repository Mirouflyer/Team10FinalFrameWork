package testHomePageLinks;

import base.CommonAPI;
import homePageLinks.WalmartComLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestWalmartComLinks extends CommonAPI {

    @Test
    public void walmartLabsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComLinks walmartComLinks = PageFactory.initElements(driver, WalmartComLinks.class);
        walmartComLinks.clickOnWalmartLabsButton();
    }

    @Test
    public void ourAdsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComLinks walmartComLinks = PageFactory.initElements(driver, WalmartComLinks.class);
        walmartComLinks.clickOnOurAdsButton();
    }

    @Test
    public void termsOfUseLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComLinks walmartComLinks = PageFactory.initElements(driver, WalmartComLinks.class);
        walmartComLinks.clickOnTermsOfUseButton();
    }

    @Test
    public void sellOnPrivacySecurityLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComLinks walmartComLinks = PageFactory.initElements(driver, WalmartComLinks.class);
        walmartComLinks.clickOnPrivacySecurityButton();
    }

    @Test
    public void califPrivacyRightsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComLinks walmartComLinks = PageFactory.initElements(driver, WalmartComLinks.class);
        walmartComLinks.clickOnCalifPrivacyRightsButton();
    }

    @Test
    public void taxExemptProgramLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComLinks walmartComLinks = PageFactory.initElements(driver, WalmartComLinks.class);
        walmartComLinks.clickOnTaxExemptProgramButton();
    }

}
