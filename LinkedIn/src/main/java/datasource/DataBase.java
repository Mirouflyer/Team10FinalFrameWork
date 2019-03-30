package datasource;

import database.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static String filePath = "/Users/mirouflyer/Desktop/ FrameWorkProject/Team10FinalFramework/LinkedIn/src/test/resources/secret.properties";
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataInDB(){
        List<String> list = getFirstName();
        List<String> list1 = getLastName();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"LinkedInMemberFirstName","items",filePath);
        connectToSqlDB.insertDataFromArrayListToSqlTable(list1,"LinkedInMemberLastName","items",filePath);

    }

    public static List<String> getFirstName(){
        List<String> itemList = new ArrayList<String>();
        itemList.add("Youcef");
        itemList.add(("Samir"));
        itemList.add(("Ferhat"));
        itemList.add("Bryan");
        itemList.add("Steve");
        itemList.add("Paul");

        return itemList;
    }

    public static List<String> getLastName(){
        List<String> itemList = new ArrayList<String>();
        itemList.add("Hargas");
        itemList.add(("Ait Ouarab"));
        itemList.add(("Saadi"));
        itemList.add("Jordano");
        itemList.add("Andersson");
        itemList.add("Paugba");

        return itemList;
    }

    public List<String> getItemListFromDBFirstName() throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("LinkedInMemberFirstName","items",filePath);
        return list ;
    }

    public List<String> getItemListFromDBLastName() throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("LinkedInMemberLastName","items",filePath);
        return list ;
    }

    public static void main(String[] args) throws  Exception, IOException, SQLException, ClassNotFoundException {
       // insertDataInDB();


        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("LinkedInMemberFirstName", "items", filePath);
        for (String st : list) {
            System.out.println(st);
        }
        List<String> list1 = connectToSqlDB.readDataBase("LinkedInMemberLastName","items",filePath);
        for(String st:list1){
        System.out.println(st);
    }
}
}
