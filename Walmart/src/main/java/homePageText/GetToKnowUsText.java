package homePageText;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class GetToKnowUsText extends CommonAPI {

    @FindBy(xpath = "//div[@class='a15HBc a11c4I']//span[@class='cdCnv Fclw- a2AN3A'][contains(text(),'Get to Know Us')]")
    public WebElement getToKnowUsText;

    @FindBy(xpath = "//a[contains(text(),'Our Company')]")
    public WebElement ourCompanyText;

    @FindBy(xpath = "//a[contains(text(),'Digital Museum')]")
    public WebElement digitalMuseumText;

    @FindBy(xpath = "//a[contains(text(),'Our Suppliers')]")
    public WebElement ourSuppliersText;

    @FindBy(xpath = "//a[contains(text(),'Sell on Walmart.com')]")
    public WebElement sellOnWalmartComText;

    @FindBy(xpath = "//a[contains(text(),'Advertise With Us')]")
    public WebElement advertiseWithUsText;

    @FindBy(xpath = "//a[contains(text(),'Careers')]")
    public WebElement careersText;

    public WebElement getGetToKnowUsText() {
        return getToKnowUsText;
    }

    public WebElement getOurCompanyText() {
        return ourCompanyText;
    }

    public WebElement getDigitalMuseumText() {
        return digitalMuseumText;
    }

    public WebElement getOurSuppliersText() {
        return ourSuppliersText;
    }

    public WebElement getSellOnWalmartComText() {
        return sellOnWalmartComText;
    }

    public WebElement getAdvertiseWithUsText() {
        return advertiseWithUsText;
    }

    public WebElement getCareersText() {
        return careersText;
    }

    public void checkGetToKnowUsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getGetToKnowUsText().getText();
        Assert.assertEquals(text,"Get to Know Us");
    }

    public void checkOurCompanyText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getOurCompanyText().getText();
        Assert.assertEquals(text,"Our Company");
    }

    public void checkDigitalMuseumText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getDigitalMuseumText().getText();
        Assert.assertEquals(text,"Digital Museum");
    }

    public void checkOurSuppliersText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getOurSuppliersText().getText();
        Assert.assertEquals(text,"Our Suppliers");
    }

    public void checkSellOnWalmartComText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getSellOnWalmartComText().getText();
        Assert.assertEquals(text,"Sell on Walmart.com");
    }

    public void checkAdvertiseWithUsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getAdvertiseWithUsText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Advertise With Us");
    }

    public void checkCareersText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text =  getCareersText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Careers");
    }
}
