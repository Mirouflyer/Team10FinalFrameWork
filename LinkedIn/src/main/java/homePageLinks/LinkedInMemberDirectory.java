package homePageLinks;

import base.CommonAPI;
import database.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class LinkedInMemberDirectory extends CommonAPI {

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-a']")
    public WebElement aButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-b']")
    public WebElement bButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-c']")
    public WebElement cButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-d']")
    public WebElement dButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-e']")
    public WebElement eButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-f']")
    public WebElement fButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-g']")
    public WebElement gButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-h']")
    public WebElement hButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-i']")
    public WebElement iButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-j']")
    public WebElement jButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-k']")
    public WebElement kButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-l']")
    public WebElement lButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-m']")
    public WebElement mButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-n']")
    public WebElement nButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-o']")
    public WebElement oButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-p']")
    public WebElement pButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-q']")
    public WebElement qButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-r']")
    public WebElement rButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-s']")
    public WebElement sButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-t']")
    public WebElement tButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-u']")
    public WebElement uButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-v']")
    public WebElement vButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-w']")
    public WebElement wButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-x']")
    public WebElement xButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-y']")
    public WebElement yButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/directory/people-z']")
    public WebElement zButton;

    @FindBy(xpath = "//a[contains(text(),'More')]")
    public WebElement moreButton;

    @FindBy(xpath = "//a[contains(text(),'Browse by country/region')]")
    public WebElement browseByCountryRegionButton;

    public WebElement getaButton() {
        return aButton;
    }

    public WebElement getbButton() {
        return bButton;
    }

    public WebElement getcButton() {
        return cButton;
    }

    public WebElement getdButton() {
        return dButton;
    }

    public WebElement geteButton() {
        return eButton;
    }

    public WebElement getfButton() {
        return fButton;
    }

    public WebElement getgButton() {
        return gButton;
    }

    public WebElement gethButton() {
        return hButton;
    }

    public WebElement getiButton() {
        return iButton;
    }

    public WebElement getjButton() {
        return jButton;
    }

    public WebElement getkButton() {
        return kButton;
    }

    public WebElement getlButton() {
        return lButton;
    }

    public WebElement getmButton() {
        return lButton;
    }

    public WebElement getnButton() {
        return nButton;
    }

    public WebElement getoButton() {
        return oButton;
    }

    public WebElement getpButton() {
        return pButton;
    }

    public WebElement getqButton() {
        return qButton;
    }

    public WebElement getrButton() {
        return rButton;
    }

    public WebElement getsButton() {
        return sButton;
    }

    public WebElement gettButton() {
        return tButton;
    }

    public WebElement getuButton() {
        return uButton;
    }

    public WebElement getvButton() {
        return vButton;
    }

    public WebElement getwButton() {
        return wButton;
    }

    public WebElement getxButton() {
        return xButton;
    }

    public WebElement getyButton() {
        return yButton;
    }

    public WebElement getzButton() {
        return zButton;
    }

    public WebElement getMoreButton() {
        return moreButton;
    }

    public WebElement getBrowseByCountryRegionButton() {
        return browseByCountryRegionButton;
    }

    public void clickOnAButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getaButton().click();
        driver.navigate().back();
    }

    public void clickOnBButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getbButton().click();
        driver.navigate().back();
    }
    public void clickOnCButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getcButton().click();
        driver.navigate().back();
    }
    public void clickOnDButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getdButton().click();
        driver.navigate().back();
    }
    public void clickOnEButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        geteButton().click();
        driver.navigate().back();
    }
    public void clickOnFButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getfButton().click();
        driver.navigate().back();
    }
    public void clickOnGButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getgButton().click();
        driver.navigate().back();
    }
    public void clickOnHButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        gethButton().click();
        driver.navigate().back();
    }
    public void clickOnIButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getiButton().click();
        driver.navigate().back();
    }
    public void clickOnJButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getjButton().click();
        driver.navigate().back();
    }
    public void clickOnKButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getkButton().click();
        driver.navigate().back();
    }
    public void clickOnLButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getlButton().click();
        driver.navigate().back();
    }
    public void clickOnMButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getmButton().click();
        driver.navigate().back();
    }
    public void clickONButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getnButton().click();
        driver.navigate().back();
    }
    public void clickOnOButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getoButton().click();
        driver.navigate().back();
    }
    public void clickOnPButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getpButton().click();
        driver.navigate().back();
    }
    public void clickOnQButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getqButton().click();
        driver.navigate().back();
    }
    public void clickOnRButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getrButton().click();
        driver.navigate().back();
    }
    public void clickOnSButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getsButton().click();
        driver.navigate().back();
    }
    public void clickOnTButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        gettButton().click();
        driver.navigate().back();
    }
    public void clickOnUButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getuButton().click();
        driver.navigate().back();
    }
    public void clickOnVButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getvButton().click();
        driver.navigate().back();
    }
    public void clickOnWButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getwButton().click();
        driver.navigate().back();
    }
    public void clickOnXButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getxButton().click();
        driver.navigate().back();
    }
    public void clickOnYButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getyButton().click();
        driver.navigate().back();
    }
    public void clickOnZButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getzButton().click();
        driver.navigate().back();
    }
    public void clickOnMoreButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMoreButton().click();
        driver.navigate().back();
    }
    public void clickOnbrowseByCountryRegionButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBrowseByCountryRegionButton().click();
        driver.navigate().back();
    }
    public void clickOnButtons(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnAButton();
        clickOnBButton();
        clickOnCButton();
        clickOnDButton();
        clickOnEButton();
        clickOnFButton();
        clickOnGButton();
        clickOnHButton();
        clickOnIButton();
        clickOnJButton();
        clickOnKButton();
        clickOnLButton();
        clickOnMButton();
        clickONButton();
        clickOnOButton();
        clickOnPButton();
        clickOnQButton();
        clickOnRButton();
        clickOnSButton();
        clickOnTButton();
        clickOnUButton();
        clickOnVButton();
        clickOnWButton();
        clickOnXButton();
        clickOnYButton();
        clickOnZButton();
        clickOnMoreButton();
        clickOnbrowseByCountryRegionButton();
    }

}
