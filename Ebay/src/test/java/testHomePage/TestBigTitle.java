package testHomePage;

import base.CommonAPI;
import homePage.BigTitles;
import logOut.LogOutPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestBigTitle extends CommonAPI {
    @Test
    public void getSignOutFromMyAccount() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        BigTitles bigTitles = PageFactory.initElements(driver, BigTitles.class);
        bigTitles.clickOnTitles();
    }
}
