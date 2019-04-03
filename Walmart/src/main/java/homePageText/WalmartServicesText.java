package homePageText;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class WalmartServicesText extends CommonAPI {

    @FindBy(xpath = "//div[@class='a15HBc a11c4I']//span[@class='cdCnv Fclw- a2AN3A'][contains(text(),'Walmart Services')]")
    public WebElement walmartServicesText;

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Grocery Pickup & Delivery')]")
    public WebElement groceryPickUpAndDeliveryText;

    @FindBy(xpath = "//a[contains(text(),'MoneyCenter')]")
    public WebElement moneyCenterText;

    @FindBy(xpath = "//a[contains(text(),'Walmart Credit Card')]")
    public WebElement walmartCreditCardText;

    @FindBy(xpath = "//a[contains(text(),'Walmart Pay')]")
    public WebElement walmartPayText;

    @FindBy(xpath = "//a[contains(text(),'Weekly Ad')]")
    public WebElement weeklyAdText;

    @FindBy(xpath = "//a[contains(text(),'Other Services')]")
    public WebElement otherServicesText;

    public WebElement getWalmartServicesText() {
        return walmartServicesText;
    }

    public WebElement getGroceryPickUpAndDeliveryText() {
        return groceryPickUpAndDeliveryText;
    }

    public WebElement getMoneyCenterText() {
        return moneyCenterText;
    }

    public WebElement getWalmartCreditCardText() {
        return walmartCreditCardText;
    }

    public WebElement getWalmartPayText() {
        return walmartPayText;
    }

    public WebElement getWeeklyAdText() {
        return weeklyAdText;
    }

    public WebElement getOtherServicesText() {
        return otherServicesText;
    }

    public void checkWalmartServicesText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getWalmartServicesText().getText();
        Assert.assertEquals(text,"Walmart Services");
    }

    public void checkGroceryPickUpAndDeliveryText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getGroceryPickUpAndDeliveryText().getText();
        Assert.assertEquals(text,"Grocery Pickup & Delivery");
    }

    public void checkMoneyCenterText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getMoneyCenterText().getText();
        Assert.assertEquals(text,"MoneyCenter");
    }

    public void checkWalmartCreditCardText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getWalmartCreditCardText().getText();
        Assert.assertEquals(text,"Walmart Credit Card");
    }

    public void checkWalmartPayText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getWalmartPayText().getText();
        Assert.assertEquals(text,"Walmart Pay");
    }

    public void checkWeeklyAdText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getWeeklyAdText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Weekly Ad");
    }

    public void checkOtherServicesText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getOtherServicesText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Other Services");
    }
}
