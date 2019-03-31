package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;
import static base.CommonAPI.driver;

public class BigTitles extends CommonAPI {
    List<String> actualTitles = new ArrayList<String>();
    List<String> expectedTitles = new ArrayList<String>();

    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']//li[@class='hl-cat-nav__js-tab']")
    List<WebElement> bigTitlesSet;

    public List<WebElement> getBigTitlesSet() {
        return bigTitlesSet;
    }

    public void clickOnTitles() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        expectedTitles.add("Motors");
        expectedTitles.add("Fashion");
        expectedTitles.add("Electronics");
        expectedTitles.add("Collectibles & Art");
        expectedTitles.add("Home & Garden");
        expectedTitles.add("Sporting Goods");
        expectedTitles.add("Toys");
        expectedTitles.add("Business & Industrial");
        expectedTitles.add("Music");

        for (WebElement element : getBigTitlesSet()) {
            String text = element.getText();
            actualTitles.add(text);
            System.out.println(text);
        }
        Assert.assertEquals(actualTitles, expectedTitles);
    }
}