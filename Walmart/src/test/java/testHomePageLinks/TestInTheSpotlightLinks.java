package testHomePageLinks;

import base.CommonAPI;
import homePageLinks.InTheSpotlightLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestInTheSpotlightLinks extends CommonAPI {

    @Test
    public void ellensListLink() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightLinks inTheSpotlightLinks = PageFactory.initElements(driver, InTheSpotlightLinks.class);
        inTheSpotlightLinks.clickOnEllensListButton();
    }

    @Test
    public void electronicsLink() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightLinks inTheSpotlightLinks = PageFactory.initElements(driver, InTheSpotlightLinks.class);
        inTheSpotlightLinks.clickOnElectronicsButton();
    }

    @Test
    public void toysLink() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightLinks inTheSpotlightLinks = PageFactory.initElements(driver, InTheSpotlightLinks.class);
        inTheSpotlightLinks. clickOnToysButton();
    }

    @Test
    public void videoGamesLink() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightLinks inTheSpotlightLinks = PageFactory.initElements(driver, InTheSpotlightLinks.class);
        inTheSpotlightLinks.clickOnVideoGamesButton();
    }

    @Test
    public void homeProductsLink() throws Exception{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightLinks inTheSpotlightLinks = PageFactory.initElements(driver, InTheSpotlightLinks.class);
        inTheSpotlightLinks.clickOnHomeProductsButton();
    }

    @Test
    public void clothingLink() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightLinks inTheSpotlightLinks = PageFactory.initElements(driver, InTheSpotlightLinks.class);
        inTheSpotlightLinks.clickOnClothingButton();
    }

}
