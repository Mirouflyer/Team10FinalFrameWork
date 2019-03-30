package testAccount;

import account.CreatNewAccount;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestRegistration extends CommonAPI {
    @Test
    public void testSignUp() throws Exception {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        CreatNewAccount creatNewAccount = PageFactory.initElements(driver, CreatNewAccount.class);
        creatNewAccount.creatAnAccount();
    }
}
