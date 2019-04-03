package testHomePageText;

import base.CommonAPI;

import homePageText.InTheSpotlightText;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestInTheSpotlightText extends CommonAPI {

    @Test
    public void inTheSpotlightText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightText inTheSpotlightText = PageFactory.initElements(driver, InTheSpotlightText.class);
        inTheSpotlightText.checkInTheSpotlightText();
    }

    @Test
    public void ellensListText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightText inTheSpotlightText = PageFactory.initElements(driver, InTheSpotlightText.class);
        inTheSpotlightText.checkEllensListText();
    }

    @Test
    public void electronicsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightText inTheSpotlightText = PageFactory.initElements(driver, InTheSpotlightText.class);
        inTheSpotlightText.checkElectronicsText();
    }

    @Test
    public void toysText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightText inTheSpotlightText = PageFactory.initElements(driver, InTheSpotlightText.class);
        inTheSpotlightText.checkToysText();
    }

    @Test
    public void videoGamesText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightText inTheSpotlightText = PageFactory.initElements(driver, InTheSpotlightText.class);
        inTheSpotlightText.checkVideoGamesText();
    }

    @Test
    public void homeProductsText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightText inTheSpotlightText = PageFactory.initElements(driver, InTheSpotlightText.class);
        inTheSpotlightText.checkHomeProductsText();
    }

    @Test
    public void clothingText() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InTheSpotlightText inTheSpotlightText = PageFactory.initElements(driver, InTheSpotlightText.class);
        inTheSpotlightText.checkClothingText();
    }
}
