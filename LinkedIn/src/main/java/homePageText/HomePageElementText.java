package homePageText;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;


import javax.xml.xpath.XPath;

public class HomePageElementText extends CommonAPI {

    @FindBy(xpath="//h3[contains(text(),'Browse LinkedIn')]")
    public WebElement browseLinkedInText;

    @FindBy(xpath="//h3[contains(text(),'Directories')]")
    public WebElement directoriesText;

    @FindBy(xpath="//h3[contains(text(),'General')]")
    public WebElement generalText;

    @FindBy(xpath = "//h3[contains(text(),'Business Solutions')]")
    public WebElement businessSolutionsText;

    @FindBy(xpath = "//h3[contains(text(),'LinkedIn member directory:')]")
    public WebElement linkedInmemberdirectoryText;

    @FindBy(xpath = ("//h3[contains(text(),'Find a colleague')]"))
    public WebElement findAcolleagueText;

    @FindBy(xpath = "//span[@class='agreement']")
    public WebElement agreementText;

    @FindBy(xpath = "//label[contains(text(),'Password (6 or more characters)')]")
    public WebElement  password6OrMoreCharactersText;

    @FindBy(xpath = "//section[@class='form-body']//label[@class='reg-field__label'][contains(text(),'Email')]")
    public  WebElement emailText;

    @FindBy(xpath = "//label[@for='reg-lastname']")
    public WebElement lastNameText;

    @FindBy(xpath = "//label[@for='reg-firstname']")
    public WebElement firstNameText;

    @FindBy(xpath = "//h3[@class='subtitle']")
    public WebElement subtitleText;

    @FindBy(xpath = "//h2[@class='title']")
    public WebElement titleText;

    public WebElement getBrowseLinkedInText() {
        return browseLinkedInText;
    }

    public WebElement getDirectoriesText() {
        return directoriesText;
    }

    public WebElement getGeneralText() {
        return generalText;
    }

    public WebElement getBusinessSolutionsText() {
        return businessSolutionsText;
    }

    public WebElement getLinkedInmemberdirectoryText() {
        return linkedInmemberdirectoryText;
    }

    public WebElement getFindAcolleagueText() {
        return findAcolleagueText;
    }

    public WebElement getAgreementText() {
        return agreementText;
    }

    public WebElement getPassword6OrMoreCharactersText() {
        return password6OrMoreCharactersText;
    }

    public WebElement getEmailText() {
        return emailText;
    }

    public WebElement getLastNameText() {
        return lastNameText;
    }

    public WebElement getFirstNameText() {
        return firstNameText;
    }

    public WebElement getSubtitleText() {
        return subtitleText;
    }

    public WebElement getTitleText() {
        return titleText;
    }

    public void getTextBrowseLinkedIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getBrowseLinkedInText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Browse LinkedIn");
    }

    public void getTextDirectories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getDirectoriesText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Directories");
    }

    public void getTextGeneral(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getGeneralText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"General");
    }

    public void getTextBusinessSolutions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getBusinessSolutionsText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Business Solutions");
    }

    public void getTextLinkedInmemberdirectory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getLinkedInmemberdirectoryText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"LinkedIn member directory:");
    }

    public void getTextFindAcolleague(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getFindAcolleagueText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Find a colleague");
    }

    public void getTextAgreement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getAgreementText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"By clicking Join now, you agree to the LinkedIn User Agreement, Privacy Policy, and Cookie Policy.");
    }

    public void getTextPassword6OrMoreCharacters(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getPassword6OrMoreCharactersText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Password (6 or more characters)");
    }

    public void getTextEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getEmailText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Email");
    }

    public void getTextLastName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getLastNameText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Last name");
    }

    public void getTextFirstName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getFirstNameText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"First name");
    }

    public void getTextSubtitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getSubtitleText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Get started - it's free.");
    }

    public void getTextTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text = getTitleText().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Be great at what you do");
    }

    public void getTextAndCheck(){
        getTextBrowseLinkedIn();
        getTextDirectories();
        getTextGeneral();
        getTextBusinessSolutions();
        getTextLinkedInmemberdirectory();
        getTextFindAcolleague();
        getTextAgreement();
        getTextPassword6OrMoreCharacters();
        getTextEmail();
        getTextLastName();
        getTextFirstName();
        getTextSubtitle();
        getTextTitle();
    }

}
