package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class CheckHomePage extends CommonAPI {
    @FindBy(xpath = "//h3[text()='Break in New Kicks']")
    public static WebElement breakWebElement;

    @FindBy(xpath = "//h3[text()='Winning Tech']")
    public static WebElement winningTechWebElement;

    @FindBy(xpath = "//h3[text()='Everything Auto']")
    public static WebElement everythingAutoWebElement;

    @FindBy(xpath = "//h3[text()='Spruce up Your Yard']")
    public static WebElement spruceWebElement;

    @FindBy(xpath = "//h3[text()='Gear for All Sports']")
    public static WebElement gaerForAllSprortsWebElement;

    @FindBy(xpath = "//h3[text()='Action-Packed Toys']")
    public static WebElement actionPackedToysWebElement;

    @FindBy(xpath = "//h3[text()='Merch for #1 Fans']")
    public static WebElement merchForFansWebElement;

    @FindBy(xpath = "//div[@class='hl-cta__default hl-loyalty__call-to-action']")
    public static WebElement takeYourShotWebElement;

    @FindBy(xpath = " //li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Electronics')]")
    public static WebElement electrociWebElement;

    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Collectibles & Art')]")
    public static WebElement collectiblesWebElement;

    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Home & Garden')]")
    public static WebElement homeAndGardenWebElement;

    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Sporting Goods')]")
    public static WebElement sprotingGoodsWebElement;

    @FindBy(xpath = "//div[@class='hl-cat-nav']//li[9]")
    public static WebElement toysWebElement;

    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Business & Industrial')]")
    public static WebElement businessAndIndustrialWebElement;

    @FindBy(xpath = "//div[@class='hl-cat-nav']//li[11]")
    public static WebElement musicWebElement;

    @FindBy(xpath = "//div[@id='gh-top']//ul[@id='gh-topl']//li")
    List<WebElement> topBarElements;

    public static org.openqa.selenium.WebElement getBreakWebElement() {
        return breakWebElement;
    }

    public static org.openqa.selenium.WebElement getWinningTechWebElement() {
        return winningTechWebElement;
    }

    public static org.openqa.selenium.WebElement getElectrociWebElement() {
        return electrociWebElement;
    }

    public static org.openqa.selenium.WebElement getCollectiblesWebElement() {
        return collectiblesWebElement;
    }

    public static org.openqa.selenium.WebElement getHomeAndGardenWebElement() {
        return homeAndGardenWebElement;
    }

    public static org.openqa.selenium.WebElement getSprotingGoodsWebElement() {
        return sprotingGoodsWebElement;
    }

    public static org.openqa.selenium.WebElement getToysWebElement() {
        return toysWebElement;
    }

    public static org.openqa.selenium.WebElement getBusinessAndIndustrialWebElement() {
        return businessAndIndustrialWebElement;
    }

    public static org.openqa.selenium.WebElement getMusicWebElement() {
        return musicWebElement;
    }

    public List<org.openqa.selenium.WebElement> getTopBarElements() {
        return topBarElements;
    }

    public static WebElement getEverythingAutoWebElement() {
        return everythingAutoWebElement;
    }

    public static WebElement getSpruceWebElement() {
        return spruceWebElement;
    }

    public static WebElement getGaerForAllSprortsWebElement() {
        return gaerForAllSprortsWebElement;
    }

    public static WebElement getActionPackedToysWebElement() {
        return actionPackedToysWebElement;
    }

    public static WebElement getMerchForFansWebElement() {
        return merchForFansWebElement;
    }

    public static WebElement getTakeYourShotWebElement() {
        return takeYourShotWebElement;
    }

    public void clickOnBreakWebElement(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
       getBreakWebElement().click();
   }
    public void clickOnWinningTechnWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getWinningTechWebElement();
    }

    public void clickOnEverythingAutoWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEverythingAutoWebElement().click();
    }

    public void clickOnSpruceWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSpruceWebElement().click();
    }

    public void clickOnHomeAndGardenWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getHomeAndGardenWebElement().click();
    }

    public void clickOnGearForAllSportsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getGaerForAllSprortsWebElement().click();
    }

    public void clickOnToysWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getToysWebElement().click();
    }

    public void clickOnActionPuckedToysWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getActionPackedToysWebElement().click();
    }

    public void clickOnMerchForFansWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMerchForFansWebElement().click();
    }

    public void clickOnTakeYourShotWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getTakeYourShotWebElement().click();
    }
    public void clickOnElectrociWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getElectrociWebElement().click();
    }

    public void clickOnBusinessAndIndustrialWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBusinessAndIndustrialWebElement().click();
    }

    public void clickOnMusicWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMusicWebElement().click();
    }

    public void clickOnSprotingGoodsWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSprotingGoodsWebElement().click();
    }
    public void clickOnCollectiblesWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCollectiblesWebElement().click();
    }

    public void clickOnTopBarElemts() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        for (WebElement element : getTopBarElements()) {
            String text = element.getText();
            element.click();
            Thread.sleep(1500);
            //            searchIncludingBox.add(text);
            System.out.println(text);
        }
    }
 }

