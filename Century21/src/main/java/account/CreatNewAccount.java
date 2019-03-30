package account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;

public class CreatNewAccount {
    List<String> interestedOptionList = new ArrayList<String>();

    @FindBy(how = How.XPATH, using = "//div[@class='user hidden-md-down']//span[@class='user-message']")
    public static WebElement registerButton;

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-block btn-outline btn-lg']")
    public static WebElement createAccountButton;


    @FindBy(how = How.XPATH, using = "//input[@id='registration-form-fname']")
    public static WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@id='registration-form-lname']")
    public static WebElement lastName;

    @FindBy(how = How.XPATH, using = "//input[@id='registration-form-phone']")
    public static WebElement phoneNumber;

    @FindBy(how = How.XPATH, using = "//input[@id='registration-form-email']")
    public static WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@id='registration-form-password']")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@id='registration-form-password-confirm']")
    public static WebElement confirmPassword;


    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Next Step')]")
    public static WebElement nextStepButton;

    @FindBy(how = How.XPATH, using = "//input[@id='dwfrm_completeRegistration_addressFields_companyName']")
    public static WebElement companyName;

    @FindBy(how = How.XPATH, using = "//input[@id='dwfrm_completeRegistration_addressFields_address1']")
    public static WebElement address;

    @FindBy(how = How.XPATH, using = "//input[@id='dwfrm_completeRegistration_addressFields_city']")
    public static WebElement cityName;

    @FindBy(how = How.XPATH, using = "//option[@value='NY']")
    public static WebElement state;

    @FindBy(how = How.XPATH, using = "//input[@id='dwfrm_completeRegistration_addressFields_postalCode']")
    public static WebElement zipcode;

    @FindBy(how = How.XPATH, using = "//option[@value='US']")
    public static WebElement country;

    @FindBy(how = How.XPATH, using = "//input[@id='dwfrm_completeRegistration_dateOfBirth_month']")
    public static WebElement DOBMonth;

    @FindBy(how = How.XPATH, using = "//input[@id='dwfrm_completeRegistration_dateOfBirth_day']")
    public static WebElement DOBDate;

    @FindBy(how = How.XPATH, using = "//input[@id='dwfrm_completeRegistration_dateOfBirth_year']")
    public static WebElement DOBYear;

    @FindBy(how = How.XPATH, using = "//div[@class='custom-checkbox']")
    public static WebElement checkEmailReferences;

    //div[@class='d-flex flex-column flex-wrap interests']//label
    @FindBy(how = How.XPATH, using = "//div[@class='d-flex flex-column flex-wrap interests']//div[@class='custom-checkbox']") //input[@type='checkbox']")
    List<WebElement> interestedTopics;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-block btn-dark']")
    public static WebElement accountCreationButton;


    public static WebElement getRegisterButton() {
        return registerButton;
    }

    public static WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public static WebElement getFirstName() {
        return firstName;
    }

    public static WebElement getLastName() {
        return lastName;
    }

    public static WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public static WebElement getEmail() {
        return email;
    }

    public static WebElement getPassword() {
        return password;
    }

    public static WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public static WebElement getNextStepButton() {
        return nextStepButton;
    }

    public static WebElement getCompanyName() {
        return companyName;
    }

    public static WebElement getAddress() {
        return address;
    }

    public static WebElement getCityName() {
        return cityName;
    }

    public static WebElement getState() {
        return state;
    }

    public static WebElement getZipcode() {
        return zipcode;
    }

    public static WebElement getCountry() {
        return country;
    }

    public static WebElement getDOBMonth() {
        return DOBMonth;
    }

    public static WebElement getDOBDate() {
        return DOBDate;
    }

    public static WebElement getDOBYear() {
        return DOBYear;
    }

    public static WebElement getCheckEmailReferences() {
        return checkEmailReferences;
    }

    public static WebElement getAccountCreationButton() {
        return accountCreationButton;
    }

    public List<WebElement> getInterestedTopics() {
        return interestedTopics;
    }

    public void clickOnRegisterButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getRegisterButton().click();
    }

    public void submitCreateAccountButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCreateAccountButton().click();
    }

    public void enterFirstName(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getFirstName().sendKeys(value);
    }

    public void enterLastName(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getLastName().sendKeys(value);
    }

    public void enterPhoneNumber(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getPhoneNumber().sendKeys(value);
    }

    public void enterEmail(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEmail().sendKeys(value);
    }

    public void enterPassword(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPassword().sendKeys(value);
    }

    public void enterConfirmedPassword(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getConfirmPassword().sendKeys(value);
    }
    public void submitNextStepBUtton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getNextStepButton().click();
    }

    public void enterConpanyName(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCompanyName().sendKeys(value);
    }

    public void enterAddress(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAddress().sendKeys(value);
    }

    public void enterCity(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCityName().sendKeys(value);
    }

    public void selectState() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getState().click();
    }

    public void enterZipcode(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getZipcode().sendKeys(value);
    }
    public void selectCountry() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCountry().click();
    }

    public void enterDOBDate(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getDOBDate().sendKeys(value);
    }

    public void enterDOBMonth(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getDOBMonth().sendKeys(value);
    }
    public void enterDOBYear(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getDOBYear().sendKeys(value);
    }

    public void submitCheckEmailReferences() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCheckEmailReferences().click();
    }

    public void submitAccountCreationButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCheckEmailReferences().click();
    }

    public void checkAllInterestedElements() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));

        for (WebElement element : getInterestedTopics()) {
            String text = element.getText();
//            element.click();
//            Thread.sleep(1000);
//            element.click();
//            Thread.sleep(1000);
//            interestedOptionList.add(text);
            System.out.println("*****"+text);
        }
    }

    public void creatAnAccount() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnRegisterButton();
        submitCreateAccountButton();
        enterFirstName("birloylok");
        enterLastName("Emoddrynuhjl");
        enterPhoneNumber("3472741431");
        enterEmail("byyok6oi7ou74zk@gamil.com");
        enterPassword("2255Yuuk*");
        enterConfirmedPassword("2255Yuuk*");
        submitNextStepBUtton();
        enterConpanyName("Apollo");
        enterAddress("25 23rd street");
        enterCity("New Yok");
        selectState();
        enterZipcode("117895");
        selectCountry();
        enterDOBDate("25");
        enterDOBMonth("02");
        enterDOBYear("1990");
        submitCheckEmailReferences();
        checkAllInterestedElements();
        Thread.sleep(1000);
        submitAccountCreationButton();
        Thread.sleep(2000);
    }
}