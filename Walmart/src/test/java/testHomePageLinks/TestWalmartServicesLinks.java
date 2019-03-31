package testHomePageLinks;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import homePageLinks.WalmartServicesLinks;

public class TestWalmartServicesLinks extends CommonAPI {

    @Test
    public void groceryPickUpAndDeliveryLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesLinks walmartServicesLinks = PageFactory.initElements(driver, WalmartServicesLinks.class);
        walmartServicesLinks.clickOnGroceryPickUpAndDeliveryButton();
    }

    @Test
    public void moneyCenteLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesLinks walmartServicesLinks = PageFactory.initElements(driver, WalmartServicesLinks.class);
        walmartServicesLinks.clickOnMoneyCenterButton();
    }

    @Test
    public void creditCardLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesLinks walmartServicesLinks = PageFactory.initElements(driver, WalmartServicesLinks.class);
        walmartServicesLinks.clickOnWalmartCreditCardButton();
    }

    @Test
    public void walmartPayLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesLinks walmartServicesLinks = PageFactory.initElements(driver, WalmartServicesLinks.class);
        walmartServicesLinks.clickOnWalmartPayButton();
    }

    @Test
    public void weeklyAdLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesLinks walmartServicesLinks = PageFactory.initElements(driver, WalmartServicesLinks.class);
        walmartServicesLinks.clickOnWeeklyAdButton();
    }

    @Test
    public void otherServicesLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WalmartServicesLinks walmartServicesLinks = PageFactory.initElements(driver, WalmartServicesLinks.class);
        walmartServicesLinks.clickOnOtherServicesButton();
    }

}
