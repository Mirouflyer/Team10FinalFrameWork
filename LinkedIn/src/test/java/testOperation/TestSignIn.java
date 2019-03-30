package testOperation;

import base.CommonAPI;
import operation.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestSignIn extends CommonAPI {

    @Test
    public void signIn(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SignIn signIn = PageFactory.initElements(driver, SignIn.class);
        signIn.signIn("kingArtur@gmail,com","123456");
    }
}
