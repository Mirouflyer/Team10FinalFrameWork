package homePageText;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class WalmartComText extends CommonAPI {

    @FindBy(xpath = "//span[@class='cdCnv Fclw- a2AN3A'][contains(text(),'Walmart.com')]")
    public WebElement walmartComText;

    @FindBy(xpath = "//a[contains(text(),'Walmart Labs')]")
    public WebElement walmartLabsText;

    @FindBy(xpath = "//a[contains(text(),'Our Ads')]")
    public WebElement ourAdsText;

    @FindBy(xpath = "//a[contains(text(),'Terms of Use')]")
    public WebElement termsOfUseText;

    @FindBy(xpath = "//a[contains(text(),'Privacy & Security')]")
    public WebElement privacySecurityText;

    @FindBy(xpath = "//a[contains(text(),'Calif. Privacy Rights')]")
    public WebElement califPrivacyRightsText;

    @FindBy(xpath = "//a[contains(text(),'Tax Exempt Program')]")
    public WebElement taxExemptProgramText;

    public WebElement getWalmartComText() {
        return walmartComText;
    }

    public WebElement getWalmartLabsText() {
        return walmartLabsText;
    }

    public WebElement getOurAdsText() {
        return ourAdsText;
    }

    public WebElement getTermsOfUseText() {
        return termsOfUseText;
    }

    public WebElement getPrivacySecurityText() {
        return privacySecurityText;
    }

    public WebElement getCalifPrivacyRightsText() {
        return califPrivacyRightsText;
    }

    public WebElement getTaxExemptProgramText() {
        return taxExemptProgramText;
    }

    public void checkWalmartComText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getWalmartComText().getText();
        Assert.assertEquals(text,"Walmart.com");
    }

    public void checkWalmartLabsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getWalmartLabsText().getText();
        Assert.assertEquals(text,"Walmart Labs");
    }

    public void checkOurAdsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getOurAdsText().getText();
        Assert.assertEquals(text,"Our Ads");
    }

    public void checkTermsOfUseText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getTermsOfUseText().getText();
        Assert.assertEquals(text,"Terms of Use");
    }

    public void checkPrivacySecurityText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getPrivacySecurityText().getText();
        Assert.assertEquals(text,"Privacy & Security");
    }

    public void checkCalifPrivacyRightsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getCalifPrivacyRightsText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Calif. Privacy Rights");
    }

    public void checkTaxExemptProgramText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getTaxExemptProgramText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Tax Exempt Program");
    }
}
