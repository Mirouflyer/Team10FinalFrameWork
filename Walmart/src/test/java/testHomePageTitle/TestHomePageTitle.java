package testHomePageTitle;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import javax.smartcardio.CommandAPDU;

public class TestHomePageTitle extends CommonAPI {

    @Test
    public void homePageTitle(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String title = driver.getTitle();
        Assert.assertEquals(title,"Walmart.com | Save Money. Live Better.");
    }
}
