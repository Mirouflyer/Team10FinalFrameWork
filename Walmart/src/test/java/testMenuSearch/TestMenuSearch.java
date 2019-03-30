package testMenuSearch;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.MenuPage;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;

import static datasource.DataBase.filePath;

public class TestMenuSearch extends CommonAPI {

    @Test
    public void menuSearch() throws Exception, IOException, SQLException,ClassNotFoundException {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnXpath("//span[@class='zhEWD a15HBc a3AVUF a3cA6X'][contains(text(),'\uE943')]");
        MenuPage.readMenuText(driver,filePath);
    }
}
