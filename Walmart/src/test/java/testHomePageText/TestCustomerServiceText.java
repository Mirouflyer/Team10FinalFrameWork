package testHomePageText;


import base.CommonAPI;
import homePageText.CustomerServiceText;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestCustomerServiceText extends CommonAPI {

    @Test
    public void customerServiceText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceText customerServiceText = PageFactory.initElements(driver, CustomerServiceText.class);
        customerServiceText.checkCustomerServiceText();
    }

    @Test
    public void helpCenterText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceText customerServiceText = PageFactory.initElements(driver, CustomerServiceText.class);
        customerServiceText.checkHelpCenterText();
    }

    @Test
    public void returnsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceText customerServiceText = PageFactory.initElements(driver, CustomerServiceText.class);
        customerServiceText.checkReturnsText();
    }

    @Test
    public void productRecallsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceText customerServiceText = PageFactory.initElements(driver, CustomerServiceText.class);
        customerServiceText.checkProductRecallsText();
    }

    @Test
    public void accessibilityText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceText customerServiceText = PageFactory.initElements(driver, CustomerServiceText.class);
        customerServiceText.checkAccessibilityText();
    }

    @Test
    public void contactUsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceText customerServiceText = PageFactory.initElements(driver, CustomerServiceText.class);
        customerServiceText.checkContactUsText();
    }

    @Test
    public void storePickupText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerServiceText customerServiceText = PageFactory.initElements(driver, CustomerServiceText.class);
        customerServiceText.checkStorePickupText();
    }

}
