package homePageText;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class InTheSpotlightText extends CommonAPI {

    @FindBy(xpath = "//span[contains(text(),'In The Spotlight')]")
    public WebElement inTheSpotlightText;

    @FindBy(xpath = "//div[5]//ul[1]//li[1]")
    public WebElement ellensListText;

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Electronics')]")
    public WebElement electronicsText;

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Toys')]")
    public WebElement toysText;

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Video Games')]")
    public WebElement videoGamesText;

    @FindBy(xpath = "//a[contains(text(),'Home Products')]")
    public WebElement homeProductsText;

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Clothing')]")
    public WebElement clothingText;

    public WebElement getInTheSpotlightText() {
        return inTheSpotlightText;
    }

    public WebElement getEllensListText() {
        return ellensListText;
    }

    public WebElement getElectronicsText() {
        return electronicsText;
    }

    public WebElement getToysText() {
        return toysText;
    }

    public WebElement getVideoGamesText() {
        return videoGamesText;
    }

    public WebElement getHomeProductsText() {
        return homeProductsText;
    }

    public WebElement getClothingText() {
        return clothingText;
    }

    public void checkInTheSpotlightText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getInTheSpotlightText().getText();
        Assert.assertEquals(text,"In The Spotlight");
    }

    public void checkEllensListText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getEllensListText().getText();
        Assert.assertEquals(text,"Ellen's List");
    }

    public void checkElectronicsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getElectronicsText().getText();
        Assert.assertEquals(text,"Electronics");
    }

    public void checkToysText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getToysText().getText();
        Assert.assertEquals(text,"Toys");
    }

    public void checkVideoGamesText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getVideoGamesText().getText();
        Assert.assertEquals(text,"Video Games");
    }

    public void checkHomeProductsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getHomeProductsText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Home Products");
    }

    public void checkClothingText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text =  getClothingText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Clothing");
    }
}
