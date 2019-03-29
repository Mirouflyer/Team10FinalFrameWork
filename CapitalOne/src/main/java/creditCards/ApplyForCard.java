package creditCards;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class ApplyForCard extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Credit Cards')]")
    public static WebElement creditCard;
    @FindBy(xpath = "//div[@class='row']//th[1]//apply-now-button[1]//a[1]  ")
    public static WebElement applyNow;
    @FindBy(xpath = "//input[@name='firstName']")
    public static WebElement firstName;
    @FindBy(xpath = "//input[@id='middleInitial']")
    public static WebElement middleName;
    @FindBy(xpath = "//input[@id='lastName']")
    public static WebElement lastName;
    @FindBy(xpath = "//input[@id='dateOfBirth']")
    public static WebElement dateOfBirth;
    @FindBy(xpath = "//input[@id='socialSecurityNumber']")
    public static WebElement socialS;
    @FindBy(xpath = "//button[@id='citizenYes']")
    public static WebElement citizenYes;
    @FindBy(xpath = "//textarea[@id='combinedStreetAddress']")
    public static WebElement combinedStreetAddress;
    @FindBy(xpath = "//input[@id='streetAddress2']")
    public static WebElement streetAddress2;
    @FindBy(xpath = "//input[@id='email']")
    public static WebElement email;
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public static WebElement phoneNumber;
    @FindBy(xpath = "//div[@id='checkingOrSavings_input']//button[@title='open dropdown'] ")
    public static WebElement checkingOrSavings;
    @FindBy(xpath = "//div[@id='employmentStatus_input']//button[@title='open dropdown']  ")
    public static WebElement employmentStatus;
    @FindBy(xpath = "//input[@id='annualIncome']")
    public static WebElement annualIncome;
    @FindBy(xpath = "//input[@id='monthlyRentMortgage']")
    public static WebElement monthlyRentMortgage;
    @FindBy(xpath = "//button[@id='cashAdvanceYes']")
    public static WebElement cashAdvanceYes;
    @FindBy(xpath = "//button[@id='cashAdvanceYes']")
    public static WebElement paymentDueAlertYes;
    @FindBy(xpath = "//span[@class='nub-esign']")
    public static WebElement agreeCondition;
    @FindBy(xpath = "//button[@id='continueToSubmit']")
    public static WebElement continueToSubmit;

    //getters
    public static WebElement getCreditCard() { return creditCard; }

    public static WebElement getApplyNow() { return applyNow; }

    public static WebElement getFirstName() { return firstName; }

    public static WebElement getMiddleName() { return middleName; }

    public static WebElement getLastName() { return lastName; }

    public static WebElement getDateOfBirth() { return dateOfBirth; }

    public static WebElement getSocialS() { return socialS; }

    public static WebElement getCitizenYes() { return citizenYes; }

    public static WebElement getCombinedStreetAddress() { return combinedStreetAddress; }

    public static WebElement getStreetAddress2() { return streetAddress2; }

    public static WebElement getEmail() { return email; }

    public static WebElement getPhoneNumber() { return phoneNumber; }

    public static WebElement getCheckingOrSavings() { return checkingOrSavings; }

    public static WebElement getEmploymentStatus() { return employmentStatus; }

    public static WebElement getAnnualIncome() { return annualIncome; }

    public static WebElement getMonthlyRentMortgage() { return monthlyRentMortgage; }

    public static WebElement getCashAdvanceYes() { return cashAdvanceYes; }

    public static WebElement getPaymentDueAlertYes() { return paymentDueAlertYes; }

    public static WebElement getAgreeCondition() { return agreeCondition; }

    public static WebElement getContinueToSubmit() { return continueToSubmit; }

    //runMethods
    public void clickOnCreditCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCard().click();
    }
    public void clickOnApplyNow() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getApplyNow().click();

    }
    public void clickOnFirstName(String firstName) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for(String windowHandle : driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        getFirstName().sendKeys(firstName, Keys.TAB);
    }
    public void clickOnMiddleName(String middleName) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMiddleName().sendKeys(middleName, Keys.TAB);
    }
    public void clickOnLastName(String lastName) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getLastName().sendKeys(lastName, Keys.TAB);
    }
    public void clickOnDateOfBirth(String dateOfBirth) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getDateOfBirth().sendKeys(dateOfBirth, Keys.TAB);
    }
    public void clickOnSocialS(String socialS) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSocialS().sendKeys(socialS, Keys.TAB);
    }
    public void clickOnCitizenYes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCitizenYes().click();
    }
    public void clickOnCombinedStreetAddress(String combinedStreetAddress) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCombinedStreetAddress().sendKeys(combinedStreetAddress, Keys.TAB);
    }
    public void clickOnStreetAddress2(String streetAddress2) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getStreetAddress2().sendKeys(streetAddress2, Keys.TAB);
    }
    public void clickOnEmail(String email) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEmail().sendKeys(email, Keys.TAB);
    }
    public void clickOnPhoneNumber(String phoneNumber) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPhoneNumber().sendKeys(phoneNumber, Keys.TAB);
    }
    public void clickOnCheckingOrSavings() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCheckingOrSavings().click();
    }
    public void clickOnEmploymentStatus() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getEmploymentStatus().click();
    }
    public void clickOnAnnualIncome(String annualIncome) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAnnualIncome().sendKeys(annualIncome, Keys.TAB);
    }
    public void clickOnMonthlyRentMortgage(String monthlyRentMortgage) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMonthlyRentMortgage().sendKeys(monthlyRentMortgage, Keys.TAB);
    }
    public void clickOnCashAdvanceYes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getCashAdvanceYes().click();
    }
    public void clickOnPaymentDueAlertYes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getPaymentDueAlertYes().click();
    }
    public void clickOnAgreeCondition() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAgreeCondition().click();
    }
    public void clickOnContinueToSubmit() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getContinueToSubmit().click();
    }
    //useRunMethods
    public void useFindMeMethods(String firstName, String middleName, String lastName,String dateOfBirth, String socialS, String streetAddress,
                                 String streetAddress2, String email, String phoneNumber, String annualIncome,String monthlyRentMortgage) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCreditCard();
        clickOnApplyNow();


        clickOnFirstName(firstName);
        clickOnMiddleName(middleName);
        clickOnLastName(lastName);
        clickOnDateOfBirth(dateOfBirth);
        clickOnSocialS(socialS);
        clickOnCitizenYes();
        clickOnCombinedStreetAddress(streetAddress);
        clickOnStreetAddress2(streetAddress2);
        clickOnEmail(email);
        clickOnPhoneNumber(phoneNumber);
        clickOnCheckingOrSavings();
        clickOnEmploymentStatus();
        clickOnAnnualIncome(annualIncome);
        clickOnMonthlyRentMortgage( monthlyRentMortgage);
        clickOnCashAdvanceYes();
        clickOnPaymentDueAlertYes();
        clickOnAgreeCondition();
        clickOnContinueToSubmit();

    }

}
