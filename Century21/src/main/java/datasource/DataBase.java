package datasource;

import database.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static String filePath = "C:\\Users\\Youcef\\Desktop\\FinalFrameWork\\Team10FinalFrameWork\\Century21\\src\\test\\resources\\secret.properties";

    public static void insertDataIntoDB() {
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list, "ItemList", "items", filePath);
    }

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Pants");
        itemsList.add("tshirt for man");
        itemsList.add("dress");
        itemsList.add("shoes for women");
        itemsList.add("jackets");
        itemsList.add("accessories");

        return itemsList;
    }

    public List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items", filePath);
        return list;
    }

    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("ItemList", "items", filePath);
        for (String st : list) {
            System.out.println(st);
        }
    }
}