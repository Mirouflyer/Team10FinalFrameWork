package keywordDriven;

import base.CommonAPI;
import datasource.ExcelReader;
import operation.FindCollegue;
import operation.SignIn;
import operation.SignUp;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import reporting.TestLogger;

import java.io.IOException;

public class Features extends CommonAPI {

    public void  selectLanguage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnXpath("//label[@class='lang-selector-state-label']");
        clickOnXpath("//button[@data-locale='ar_AE']");
    }

    public void signUp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
       typeOnXpath("//input[@id='reg-firstname']", "Lion");
       typeOnXpath("//input[@id='reg-lastname']", "tiger");
       typeOnXpath("//input[@id='reg-email']", "lion_tiger@hotmail.com");
       typeOnXpath("//input[@id='reg-password']", "123456");
       clickOnXpath("//input[@id='registration-submit']");

    }
    public void signIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        typeOnXpath("//input[@id='login-email']", "lion_tiger@hotmail.com");
        typeOnXpath("//input[@id='login-password']", "123456");
        clickOnXpath("//input[@id='login-submit']");
        driver.navigate().back();

    }
    public void findCollegue(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        typeOnXpath("//input[@placeholder='الاسم الأول']", "Lion");
        typeOnXpath("//input[@placeholder='اسم العائلة']", "tiger");
        clickOnXpath("//input[@value='بحث']");

    }

    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        switch(featureName){
            case "selectLanguage":
                selectLanguage();
                break;
                case "signUp":
                signUp();
                break;
            case "signIn":
                signIn();
                break;
            case "findCollegue":
                findCollegue();
                break;
                default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        ExcelReader excelReader = new ExcelReader();
        String [] testSteps = excelReader.getStepsTestExcelFile();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
