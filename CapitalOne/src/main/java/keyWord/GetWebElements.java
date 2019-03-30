package keyWord;

import base.CommonAPI;
import dataSource.ExcelReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;

public class GetWebElements extends CommonAPI {

    List<String> expectedAboutElements = new ArrayList<String>();
    List<String> allAboutElements = new ArrayList<String>();

    @FindBy(xpath = "//body[@class='ng-scope']/div[@id='wrapper']/universal-footer[@data-footnotes='[\"CreditWise availability will vary depending on ability to obtain your credit history from TransUnion®\"]']/footer[@id='universal-nav-footer']/div[@id='site-footer']/div[@class='site-footer__s1']/div[@class='ods-wrapper']/div[@class='ods-row site-footer__row-products']/div[2]/div[1] //li")
    List<WebElement> aboutElemnts ;

    public void getItemsFromExcelFile() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
         ExcelReader excelReader = new ExcelReader();
        String [] list = excelReader.getDataFromExcelFileForFeaturesChoice();
        expectedAboutElements.add("Gogo");
        for (int i = 1; i < list.length; i++) {
            expectedAboutElements.add(list[i]);
            System.out.println(i+"-->"+list[i]);
        }
        System.out.println(expectedAboutElements.size());
    }


    public List<WebElement> getAboutElements() {
        return aboutElemnts;
    }

    public void generateAboutElements() throws Exception {

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
            for (WebElement element : getAboutElements()) {
                String text = element.getText();
                Thread.sleep(2000);
                allAboutElements.add(text);
                System.out.println(text);
            }
        System.out.println("About elements "+allAboutElements.size());
        getItemsFromExcelFile();
        Assert.assertEquals(expectedAboutElements, allAboutElements);

    }

}
