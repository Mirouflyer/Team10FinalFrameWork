package testHomePageLinks;

import base.CommonAPI;
import homePageLinks.CustomerServiceLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestCustomerServiceLinks extends CommonAPI {

    @Test
    public void helpCenterLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceLinks customerServiceLinks = PageFactory.initElements(driver, CustomerServiceLinks.class);
        customerServiceLinks.clickOnHelpCenterButton();
    }

    @Test
    public void returnsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceLinks customerServiceLinks = PageFactory.initElements(driver, CustomerServiceLinks.class);
        customerServiceLinks.clickOnReturnsButton();
    }

    @Test
    public void productRecallsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceLinks customerServiceLinks = PageFactory.initElements(driver, CustomerServiceLinks.class);
        customerServiceLinks.clickOnProductRecallsButton();
    }

    @Test
    public void accessibilityLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceLinks customerServiceLinks = PageFactory.initElements(driver, CustomerServiceLinks.class);
        customerServiceLinks.clickOnAccessibilityButton();
    }

    @Test
    public void contactUsLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceLinks customerServiceLinks = PageFactory.initElements(driver, CustomerServiceLinks.class);
        customerServiceLinks.clickOnContactUsButton();
    }

    @Test
    public void storePickupLink() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceLinks customerServiceLinks = PageFactory.initElements(driver, CustomerServiceLinks.class);
        customerServiceLinks.clickOnStorePickupButton();
    }

}
