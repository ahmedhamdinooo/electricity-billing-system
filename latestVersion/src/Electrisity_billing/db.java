/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrisity_billing;
import java.sql.*;
import javax.swing.JOptionPane;



public class db {
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    Connection conn;
    Statement st;

    public db() throws SQLException {
        
        try {
        
             String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ElectricityBilling;";
             String user = "";
             String pass = "123456";
            conn = DriverManager.getConnection(dbURL, user, pass);
            st = conn.createStatement();
        }
        
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CloseConnection() throws SQLException
    {
        st.close();
        conn.close(); 
    }
    
}