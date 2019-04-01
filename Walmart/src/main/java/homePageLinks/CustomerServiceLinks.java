package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class CustomerServiceLinks extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Help Center')]")
    public WebElement helpCenterButton;

    @FindBy(xpath = "//a[contains(text(),'Returns')]")
    public WebElement returnsButton;

    @FindBy(xpath = "//a[contains(text(),'Product Recalls')]")
    public WebElement productRecallsButton;

    @FindBy(xpath = "//div[4]//ul[1]//li[4]")
    public WebElement accessibilityButton;

    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    public WebElement contactUsButton;

    @FindBy(xpath = "//a[contains(text(),'Store Pickup')]")
    public WebElement storePickupButton;

    public WebElement getHelpCenterButton() {
        return helpCenterButton;
    }

    public WebElement getReturnsButton() {
        return returnsButton;
    }

    public WebElement getProductRecallsButton() {
        return productRecallsButton;
    }

    public WebElement getAccessibilityButton() {
        return accessibilityButton;
    }

    public WebElement getContactUsButton() {
        return contactUsButton;
    }

    public WebElement getStorePickupButton() {
        return storePickupButton;
    }

    public void clickOnHelpCenterButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHelpCenterButton().click();
        driver.navigate().back();
    }

    public void clickOnReturnsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getReturnsButton().click();
        driver.navigate().back();
    }

    public void clickOnProductRecallsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getProductRecallsButton().click();
        driver.navigate().back();
    }

    public void clickOnAccessibilityButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAccessibilityButton().click();
        driver.navigate().back();
    }

    public void clickOnContactUsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getContactUsButton().click();
        driver.navigate().back();
    }

    public void clickOnStorePickupButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getStorePickupButton().click();
        driver.navigate().back();
    }
}
