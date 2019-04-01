package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class InTheSpotlightLinks extends CommonAPI {

    @FindBy(xpath = "//div[5]//ul[1]//li[1]")
    public WebElement ellensListButton;

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Electronics')]")
    public WebElement electronicsButton;

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Toys')]")
    public WebElement toysButton;

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Video Games')]")
    public WebElement videoGamesButton;

    @FindBy(xpath = "//a[contains(text(),'Home Products')]")
    public WebElement homeProductsButton;

    @FindBy(xpath = "//a[@class='a2HAz5 vf-footer-link a1-dPg'][contains(text(),'Clothing')]")
    public WebElement clothingButton;

    public WebElement getEllensListButton() {
        return ellensListButton;
    }

    public WebElement getElectronicsButton() {
        return electronicsButton;
    }

    public WebElement getToysButton() {
        return toysButton;
    }

    public WebElement getVideoGamesButton() {
        return videoGamesButton;
    }

    public WebElement getHomeProductsButton() {
        return homeProductsButton;
    }

    public WebElement getClothingButton() {
        return clothingButton;
    }

    public void clickOnEllensListButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEllensListButton().click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    public void clickOnElectronicsButton()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getElectronicsButton().click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    public void clickOnToysButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getToysButton().click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    public void clickOnVideoGamesButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getVideoGamesButton().click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    public void clickOnHomeProductsButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHomeProductsButton().click();
        driver.navigate().back();
    }

    public void clickOnClothingButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClothingButton().click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
}
