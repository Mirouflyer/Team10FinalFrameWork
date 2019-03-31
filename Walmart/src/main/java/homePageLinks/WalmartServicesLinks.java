package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class WalmartServicesLinks extends CommonAPI {

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Grocery Pickup & Delivery')]")
    public WebElement groceryPickUpAndDeliveryButton;

    @FindBy(xpath = "//a[contains(text(),'MoneyCenter')]")
    public WebElement moneyCenterButton;

    @FindBy(xpath = "//a[contains(text(),'Walmart Credit Card')]")
    public WebElement walmartCreditCardButton;

    @FindBy(xpath = "//a[contains(text(),'Walmart Pay')]")
    public WebElement walmartPayButton;

    @FindBy(xpath = "//a[contains(text(),'Weekly Ad')]")
    public WebElement weeklyAdButton;

    @FindBy(xpath = "//a[contains(text(),'Other Services')]")
    public WebElement otherServicesButton;

    public WebElement getGroceryPickUpAndDeliveryButton() {
        return groceryPickUpAndDeliveryButton;
    }

    public WebElement getMoneyCenterButton() {
        return moneyCenterButton;
    }

    public WebElement getWalmartCreditCardButton() {
        return walmartCreditCardButton;
    }

    public WebElement getWalmartPayButton() {
        return walmartPayButton;
    }

    public WebElement getWeeklyAdButton() {
        return weeklyAdButton;
    }

    public WebElement getOtherServicesButton() {
        return otherServicesButton;
    }

    public void clickOnGroceryPickUpAndDeliveryButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getGroceryPickUpAndDeliveryButton().click();
        driver.navigate().back();
    }

    public void clickOnMoneyCenterButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMoneyCenterButton().click();
        driver.navigate().back();
    }

    public void clickOnWalmartCreditCardButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getWalmartCreditCardButton().click();
        driver.navigate().back();
    }

    public void clickOnWalmartPayButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getWalmartPayButton().click();
        driver.navigate().back();
    }

    public void clickOnWeeklyAdButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getWeeklyAdButton().click();
        driver.navigate().back();
    }

    public void clickOnOtherServicesButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getOtherServicesButton().click();
        driver.navigate().back();
    }


}
