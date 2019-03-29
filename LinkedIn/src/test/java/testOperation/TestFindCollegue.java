package testOperation;

import base.CommonAPI;
import operation.FindCollegue;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import javax.activation.CommandInfo;

public class TestFindCollegue extends CommonAPI {

    @Test
    public void browseLinkedInLinks() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FindCollegue findCollegue = PageFactory.initElements(driver, FindCollegue.class);
        findCollegue.findCollegue("Eduardo", "Arus");
        Thread.sleep(2000);
    }
}
