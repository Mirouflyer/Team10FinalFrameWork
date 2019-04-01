package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class WalmartComLinks extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Walmart Labs')]")
    public WebElement walmartLabsButton;

    @FindBy(xpath = "//a[contains(text(),'Our Ads')]")
    public WebElement ourAdsButton;

    @FindBy(xpath = "//a[contains(text(),'Terms of Use')]")
    public WebElement termsOfUseButton;

    @FindBy(xpath = "//a[contains(text(),'Privacy & Security')]")
    public WebElement privacySecurityButton;

    @FindBy(xpath = "//a[contains(text(),'Calif. Privacy Rights')]")
    public WebElement califPrivacyRightsButton;

    @FindBy(xpath = "//a[contains(text(),'Tax Exempt Program')]")
    public WebElement taxExemptProgramButton;

    public WebElement getWalmartLabsButton() {
        return walmartLabsButton;
    }

    public WebElement getOurAdsButton() {
        return ourAdsButton;
    }

    public WebElement getTermsOfUseButton() {
        return termsOfUseButton;
    }

    public WebElement getPrivacySecurityButton() {
        return privacySecurityButton;
    }

    public WebElement getCalifPrivacyRightsButton() {
        return califPrivacyRightsButton;
    }

    public WebElement getTaxExemptProgramButton() {
        return taxExemptProgramButton;
    }

    public void clickOnWalmartLabsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getWalmartLabsButton().click();
        driver.navigate().back();
    }

    public void clickOnOurAdsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getOurAdsButton().click();
        driver.navigate().back();
    }

    public void clickOnTermsOfUseButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTermsOfUseButton().click();
        driver.navigate().back();
    }

    public void clickOnPrivacySecurityButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPrivacySecurityButton().click();
        driver.navigate().back();
    }

    public void clickOnCalifPrivacyRightsButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCalifPrivacyRightsButton().click();
        driver.navigate().back();
    }

    public void clickOnTaxExemptProgramButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTaxExemptProgramButton().click();
        driver.navigate().back();
    }
}
