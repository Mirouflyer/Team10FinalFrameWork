package testHomePageText;

import base.CommonAPI;
import homePageText.InTheSpotlightText;
import homePageText.WalmartServicesText;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestWalmartServicesText extends CommonAPI {

    @Test
    public void walmartServicesText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesText walmartServicesText = PageFactory.initElements(driver, WalmartServicesText.class);
        walmartServicesText.checkWalmartServicesText();
    }

    @Test
    public void groceryPickUpAndDeliveryText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesText walmartServicesText = PageFactory.initElements(driver, WalmartServicesText.class);
        walmartServicesText.checkGroceryPickUpAndDeliveryText();
    }

    @Test
    public void moneyCenterText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesText walmartServicesText = PageFactory.initElements(driver, WalmartServicesText.class);
        walmartServicesText.checkMoneyCenterText();
    }

    @Test
    public void walmartCreditCardText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesText walmartServicesText = PageFactory.initElements(driver, WalmartServicesText.class);
        walmartServicesText.checkWalmartCreditCardText();
    }

    @Test
    public void walmartPayText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesText walmartServicesText = PageFactory.initElements(driver, WalmartServicesText.class);
        walmartServicesText.checkWalmartPayText();
    }

    @Test
    public void weeklyAdText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesText walmartServicesText = PageFactory.initElements(driver, WalmartServicesText.class);
        walmartServicesText.checkWeeklyAdText();
    }

    @Test
    public void otherServicesText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesText walmartServicesText = PageFactory.initElements(driver, WalmartServicesText.class);
        walmartServicesText.checkOtherServicesText();
    }
}
