package testHomePageLinks;

import base.CommonAPI;
import homePageLinks.GetToKnowUs;
import homePageLinks.WalmartCom;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestWalmartCom extends CommonAPI {

    @Test
    public void walmartLabsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartCom walmartCom = PageFactory.initElements(driver,WalmartCom.class);
        walmartCom.clickOnWalmartLabsButton();
    }

    @Test
    public void ourAdsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartCom walmartCom = PageFactory.initElements(driver,WalmartCom.class);
        walmartCom.clickOnOurAdsButton();
    }

    @Test
    public void termsOfUseLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartCom walmartCom = PageFactory.initElements(driver,WalmartCom.class);
        walmartCom.clickOnTermsOfUseButton();
    }

    @Test
    public void sellOnPrivacySecurityLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartCom walmartCom = PageFactory.initElements(driver,WalmartCom.class);
        walmartCom.clickOnPrivacySecurityButton();
    }

    @Test
    public void califPrivacyRightsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartCom walmartCom = PageFactory.initElements(driver,WalmartCom.class);
        walmartCom.clickOnCalifPrivacyRightsButton();
    }

    @Test
    public void taxExemptProgramLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartCom walmartCom = PageFactory.initElements(driver,WalmartCom.class);
        walmartCom.clickOnTaxExemptProgramButton();
    }

}
