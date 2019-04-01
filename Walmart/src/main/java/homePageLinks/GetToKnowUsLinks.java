package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class GetToKnowUsLinks extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Our Company')]")
    public WebElement ourCompanyButton;

    @FindBy(xpath = "//a[contains(text(),'Digital Museum')]")
    public WebElement digitalMuseumButton;

    @FindBy(xpath = "//a[contains(text(),'Our Suppliers')]")
    public WebElement ourSuppliersButton;

    @FindBy(xpath = "//a[contains(text(),'Sell on Walmart.com')]")
    public WebElement sellOnWalmartComButton;

    @FindBy(xpath = "//a[contains(text(),'Advertise With Us')]")
    public WebElement advertiseWithUsButton;

    @FindBy(xpath = "//a[contains(text(),'Careers')]")
    public WebElement careersButton;

    public WebElement getOurCompanyButton() {
        return ourCompanyButton;
    }

    public WebElement getDigitalMuseumButton() {
        return digitalMuseumButton;
    }

    public WebElement getOurSuppliersButton() {
        return ourSuppliersButton;
    }

    public WebElement getSellOnWalmartComButton() {
        return sellOnWalmartComButton;
    }

    public WebElement getAdvertiseWithUsButton() {
        return advertiseWithUsButton;
    }

    public WebElement getCareersButton() {
        return careersButton;
    }

    public void clickOnOurCompanyButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getOurCompanyButton().click();
        driver.navigate().back();
    }

    public void clickOnDigitalMuseumButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getDigitalMuseumButton().click();
        driver.navigate().back();
    }

    public void clickOnOurSuppliersButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getOurSuppliersButton().click();
        driver.navigate().back();
    }

    public void clickOnSellOnWalmartComButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSellOnWalmartComButton().click();
        driver.navigate().back();
    }

    public void clickOnAdvertiseWithUsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAdvertiseWithUsButton().click();
        driver.navigate().back();
    }

    public void clickOnCareersButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCareersButton().click();
        driver.navigate().back();
    }

}
