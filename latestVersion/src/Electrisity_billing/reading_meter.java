/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrisity_billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Emad Amin
 */
public class reading_meter extends db{
    private int metercode;
    private int operator_id;
    private float kilometers;
    private int month;
    private float bill;
    private int card_num;
    
    reading_meter()throws SQLException{
        
    }
    
   reading_meter(int operator_id ,int metercode , float kilometers , float bill, int month )throws SQLException{
        this.operator_id=operator_id;
        this.metercode=metercode;
        this.kilometers=kilometers;
        this.bill=bill;
        this.month=month;
               
    }
    
  reading_meter(int metercode,int card) throws SQLException{
    this.metercode=metercode;
    this.card_num=card;
       }
 

  reading_meter(int metercode, float reading, int month)  throws SQLException{
       this.metercode=metercode;
        this.kilometers=reading;
         this.month=month;
    }
    /**
     * @return the metercode
     */
    public int getMetercode() {
        return metercode;
    }

    /**
     * @param metercode the metercode to set
     */
    public void setMetercode(int metercode) {
        this.metercode = metercode;
    }

    /**
     * @return the cust_id
     */
    public int getopretor_id() {
        return operator_id;
    }

    /**
     * @param cust_id the cust_id to set
     */
    public void setoperator_id(int operator_id) {
        this.operator_id = operator_id;
    }

    /**
     * @return the kilometers
     */
    public float getKilometers() {
        return kilometers;
    }

    /**
     * @param kilometers the kilometers to set
     */
    public void setKilometers(float kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the bill
     */
    public float getBill() {
        return bill;
    }

    /**
     * @param bill the bill to set
     */
    public void setBill(float bill) {
        this.bill = bill;
    }
    
    
    /**
     * @return the card_num
     */
    public int getCard_num() {
        return card_num;
    }

    /**
     * @param card_num the card_num to set
     */
    public void setCard_num(int card_num) {
        this.card_num = card_num;
    }
    
     public static void main(String[] args) {
    // TODO Auto-generated method stub

    
}
     //********************** methods ******************************************
     
     
    public void Add(reading_meter c) throws SQLException {
         db o= new db();   // connection
         String sql = "insert into Reading_Meter  (operator_id,metercode, Kilometers ,bill, month) values ("+c.getopretor_id()+"," + c.getMetercode() + " ," + c.getKilometers() + "," + c.getBill() + ","+c.getMonth()+");";
         st.executeUpdate(sql);
        
         db. CloseConnection();  // close connection
     }
     
    public void  TotalPrice (reading_meter m) throws SQLException{
          
        db o= new db();   // connection
        double Total= bill*kilometers;
        String sql = " update Reading_Meter set bill  = " + Total + "  where metercode = "+m.getMetercode();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Added Successfully", "Add  total ", JOptionPane.INFORMATION_MESSAGE);
        db. CloseConnection();  // close connection
          
        
   }
    
    

    
}

