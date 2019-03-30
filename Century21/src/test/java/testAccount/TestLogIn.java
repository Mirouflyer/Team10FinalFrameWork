package testAccount;

import account.CreatNewAccount;
import account.LogIn;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestLogIn extends CommonAPI {
    @Test
    public void signIn() throws InterruptedException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        LogIn logIn = PageFactory.initElements(driver, LogIn.class);
        logIn.signInToAccount();

    }
}
