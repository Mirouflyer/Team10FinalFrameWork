package testOperation;

import base.CommonAPI;
import operation.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestSignUp extends CommonAPI {

    @Test
    public void signUp(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SignUp signUp = PageFactory.initElements(driver,SignUp.class);
        signUp.createAnAccount("king","Artur","kingArtur@gmail.com","123456");
    }
}
