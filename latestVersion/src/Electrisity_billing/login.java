/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrisity_billing;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class login {
    private int id;
    private String usernaame;
    private String password;
    
    login(){
        
    }
 //constractor operators
    login( int id ,String username,String password){
        this.id=id;
        this.usernaame=username;
        this.password=password;
    }
//constractor admin
    login(String username, String password) {
       this.usernaame=username;
        this.password=password;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the usernaame
     */
    public String getUser_naame() {
        return usernaame;
    }

    /**
     * @param usernaame the usernaame to set
     */
    public void setUsernaame(String usernaame) {
        this.usernaame = usernaame;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    public int  log2 (){
          
try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ElectricityBilling;";
             String user = "";
             String pass = "12345";
        try (Connection con = DriverManager.getConnection(dbURL, user, pass)) {
            String sql ="select username ,password  from  operatoer where username=? and password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, getUser_naame());
            pst.setString(2, getPassword());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            JOptionPane.showMessageDialog(null, "username and password matched" );
               opertar_view l = new opertar_view();
                l.setLocation(200, 200);
                l.setVisible(true);
              
            }
            else{
                JOptionPane.showMessageDialog(null, "username OR password not correct ");
                  
                
            }
             con.close();
        }
        
    } catch(HeadlessException | ClassNotFoundException | SQLException e){
      JOptionPane.showMessageDialog(null, e );
        
    }
        return 0;
    
   }
     
  }
