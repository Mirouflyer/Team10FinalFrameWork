package menu;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.MenuPage;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class MenuTest extends CommonAPI {
    @Test
    public void testMenu() throws Exception {
        MenuPage menuPage = new MenuPage();
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
//        driver.findElement(By.xpath("//div[@class='search-button']")).click();
        driver.findElement(By.xpath("//div[@class='search-button']")).click();
        driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("man", Keys.ENTER);
        menuPage.readMenuText(driver);
    }

}
