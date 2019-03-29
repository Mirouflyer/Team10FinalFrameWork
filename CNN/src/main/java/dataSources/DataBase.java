package dataSources;

import database.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static String filePath = "D:\\Team10FinalFrameWork\\CNN\\src\\test\\resources\\sercret.properties";
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    //insertToDataBase
    public static void insertDataInDB(){
        List<String> list = getItemValue();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"CnnBigTitles","items",filePath);

    }

    public static List<String> getItemValue(){
        List<String> titlesList = new ArrayList<String>();
        titlesList.add("US");
        titlesList.add(("World"));
        titlesList.add(("Politics"));
        titlesList.add("Business");
        titlesList.add("Opinion");
        titlesList.add("Health");
        titlesList.add("Sports");
        titlesList.add("Video");

        return titlesList;
    }

    // readFromDataBase
    public List<String> getItemListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("CnnBigTitles","items",filePath);
        return list ;
    }

    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
        //insertDataInDB();


        //neededLocallyToConnectAndReadFromDB
 ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
 List<String> list = connectToSqlDB.readDataBase("CnnBigTitles","items",filePath);
 for(String st:list){
 System.out.println(st);
 }
    }
}

