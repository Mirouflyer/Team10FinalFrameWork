package testHomePageText;

import base.CommonAPI;
import homePageText.WalmartComText;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestWalmartComText extends CommonAPI {

    @Test
    public void walmartComText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComText walmartComText = PageFactory.initElements(driver, WalmartComText.class);
        walmartComText.checkWalmartComText();
    }

    @Test
    public void walmartLabsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComText walmartComText = PageFactory.initElements(driver, WalmartComText.class);
        walmartComText.checkWalmartLabsText();
    }

    @Test
    public void ourAdsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComText walmartComText = PageFactory.initElements(driver, WalmartComText.class);
        walmartComText.checkOurAdsText();
    }

    @Test
    public void termsOfUseText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComText walmartComText = PageFactory.initElements(driver, WalmartComText.class);
        walmartComText.checkTermsOfUseText();
    }

    @Test
    public void privacySecurityText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComText walmartComText = PageFactory.initElements(driver, WalmartComText.class);
        walmartComText.checkPrivacySecurityText();
    }

    @Test
    public void califPrivacyRightsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComText walmartComText = PageFactory.initElements(driver, WalmartComText.class);
        walmartComText.checkCalifPrivacyRightsText();
    }

    @Test
    public void taxExemptProgramText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartComText walmartComText = PageFactory.initElements(driver, WalmartComText.class);
        walmartComText.checkTaxExemptProgramText();
    }
}
