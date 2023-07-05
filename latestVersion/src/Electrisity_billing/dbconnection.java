/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrisity_billing;
import java.sql.*;

public class dbconnection {




public static void main(String[] args) {
    // TODO Auto-generated method stub

    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ElectricityBilling;";
    String user = "";
    String pass = "12345";
    try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


    Connection myConn = DriverManager.getConnection(dbURL, user, pass);
    try {
    Statement myStmt = myConn.createStatement();

    try {
    ResultSet myRs = myStmt.executeQuery("Select * from customer");



        while (myRs.next())
        {
            System.out.println(myRs.getString(""));
            System.out.println(myRs.getString("123456"));
        }
    }
    catch (SQLException e)
    {
        System.out.println("Error with query");
      
    }
    }

    catch (SQLException e)
    {
        System.out.println("Error connecting to database");
    }
    }

    catch (ClassNotFoundException | SQLException e)
    {
        System.out.println(e);
    }
}
} 