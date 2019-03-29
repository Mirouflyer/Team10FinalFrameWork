package testCreditCards;

import accessToAccout.OnLineAccess;
import base.CommonAPI;
import creditCards.ApplyForCard;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestApplyCard extends CommonAPI {
    @Test
    public void testAccess(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ApplyForCard applyForCard = PageFactory.initElements(driver, ApplyForCard.class);
        applyForCard.useFindMeMethods("ffff","ff","ssss", "222222",
                "111 11 1111","1234df sdff","3456ggg","qwwe@gmail.com",
                "1231231223","120k","9k");
    }
}


