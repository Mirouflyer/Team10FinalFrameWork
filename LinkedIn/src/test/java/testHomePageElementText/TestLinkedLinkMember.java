package testHomePageElementText;

import base.CommonAPI;
import homePageLinks.LinkedInMemberDirectory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestLinkedLinkMember extends CommonAPI {

    @Test
    public void linkedInMember(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        LinkedInMemberDirectory linkedInMemberDirectory = PageFactory.initElements(driver,LinkedInMemberDirectory.class);
        linkedInMemberDirectory.clickOnButtons();
    }
}
