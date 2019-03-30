package dataSource;

import utility.DataReader;

import java.io.IOException;

public class ExcelReader {
    DataReader dataReader = new DataReader();
    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        String path = System.getProperty("user.dir")+"\\data\\XLBook1.xls";
        String [] data = dataReader.fileReader2(path,0);
        return data;
    }
}

