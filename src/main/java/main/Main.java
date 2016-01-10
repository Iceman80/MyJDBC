package main;


import dbService.DBException;
import dbService.DBService;
import dbService.dataSets.UsersDataSet;


public class Main {
    public static void main(String[] args) {
        DBService dbService = new DBService();
        try {
            long userId = dbService.addUser("tully","123");
            System.out.println("Added user id: " + userId);
            long userId1 = dbService.addUser("tully1", "000");
            System.out.println("Added user id: " + userId1);
            long userId2 = dbService.addUser("Boss","pass");
            System.out.println("Added user id: " + userId2);

            UsersDataSet dataSet = dbService.getUser(userId);
            System.out.println("User data set: " + dataSet);
            UsersDataSet dataSet2 = dbService.getUser(userId2);
            System.out.println("User data set: " + dataSet2.getName()+" Password: "+ dataSet2.getPassword());


//            dbService.cleanUp();
        } catch (DBException e) {
            e.printStackTrace();
        }
    }
}
