package homePageText;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class CustomerServiceText extends CommonAPI {

    @FindBy(xpath = "//div[@class='a15HBc a11c4I']//span[@class='cdCnv Fclw- a2AN3A'][contains(text(),'Customer Service')]")
    public WebElement customerServiceText;

    @FindBy(xpath = "//a[contains(text(),'Help Center')]")
    public WebElement helpCenterText;

    @FindBy(xpath = "//a[contains(text(),'Returns')]")
    public WebElement returnsText;

    @FindBy(xpath = "//a[contains(text(),'Product Recalls')]")
    public WebElement productRecallsText;

    @FindBy(xpath = "//div[4]//ul[1]//li[4]")
    public WebElement accessibilityText;

    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    public WebElement contactUsText;

    @FindBy(xpath = "//a[contains(text(),'Store Pickup')]")
    public WebElement storePickupText;

    public WebElement getCustomerServiceText() {
        return customerServiceText;
    }

    public WebElement getHelpCenterText() {
        return helpCenterText;
    }

    public WebElement getReturnsText() {
        return returnsText;
    }

    public WebElement getProductRecallsText() {
        return productRecallsText;
    }

    public WebElement getAccessibilityText() {
        return accessibilityText;
    }

    public WebElement getContactUsText() {
        return contactUsText;
    }

    public WebElement getStorePickupText() {
        return storePickupText;
    }

    public void checkCustomerServiceText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getCustomerServiceText().getText();
        Assert.assertEquals(text,"Customer Service");
    }

    public void checkHelpCenterText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getHelpCenterText().getText();
        Assert.assertEquals(text,"Help Center");
    }

    public void checkReturnsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getReturnsText().getText();
        Assert.assertEquals(text,"Returns");
    }

    public void checkProductRecallsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getProductRecallsText().getText();
        Assert.assertEquals(text,"Product Recalls");
    }

    public void checkAccessibilityText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getAccessibilityText().getText();
        Assert.assertEquals(text,"Accessibility");
    }

    public void checkContactUsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getContactUsText().getText();
        Assert.assertEquals(text,"Contact Us");
    }

    public void checkStorePickupText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text =  getStorePickupText().getText();
        Assert.assertEquals(text,"Store Pickup");
    }
}
