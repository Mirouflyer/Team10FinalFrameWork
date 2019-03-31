package testHomePage;

import base.CommonAPI;
import homePage.CheckHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestCheckHomePage extends CommonAPI {
    @Test
    public void testMotorsWebElement() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnBreakWebElement();
    }
    @Test
    public void testFashionWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnWinningTechnWebElement();
    }
    @Test
    public void testElectronicsWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnElectrociWebElement();
    }

    @Test
    public void testCollectiblesWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnCollectiblesWebElement();
    }

    @Test
    public void testHomeAndGardenWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnHomeAndGardenWebElement();
    }

    @Test
     public void testSportingsGoodsWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnSprotingGoodsWebElement();
    }

    @Test
    public void testToysWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnToysWebElement();
    }

    @Test
    public void testBusinessAndIndustrialWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnBusinessAndIndustrialWebElement();
    }

    @Test
    public void testMusicWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnMusicWebElement();
    }

    @Test
    public void testEverythingAutoWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnEverythingAutoWebElement();
    }

    @Test
    public void testSpruceWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnSpruceWebElement();
    }

    @Test
    public void testGearForAllSportsWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnGearForAllSportsWebElement();
    }

    @Test
    public void testActionPackedToysWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnActionPuckedToysWebElement();
    }

    @Test
    public void testMerchForFansWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnMerchForFansWebElement();
    }

    @Test
    public void testTakeYourShortWebElement(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CheckHomePage checkHomePage  = PageFactory.initElements(driver, CheckHomePage.class);
        checkHomePage.clickOnTakeYourShotWebElement();
    }
}