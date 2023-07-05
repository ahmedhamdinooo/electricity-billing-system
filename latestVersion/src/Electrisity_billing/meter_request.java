/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrisity_billing;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emad Amin
 */
public class meter_request extends db{
    private int id;
    private String customer_name;
    private int customer_id;
    private float price;
    private String area;
    private String attachment;
    
   meter_request()throws SQLException{
        
    }

    meter_request(int i, String name, int cust_id,  String area, String attachment) throws SQLException{
       this.id=i;
       this.customer_name=name;
       this.customer_id=cust_id;
       this.price=price;
       this.area=area;
       this.attachment=attachment;
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
     * @return the customer_name
     */
    public String getCustomer_name() {
        return customer_name;
    }

    /**
     * @param customer_name the customer_name to set
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    /**
     * @return the customer_id
     */
    public int getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the attachment
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * @param attachment the attachment to set
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
    
          public static void main(String[] args) {
    // TODO Auto-generated method stub

    
}
    
    
    
    
    
    
    //********************************* methods ********************************
    
     public void AddAttachment(meter_request add) throws SQLException{
         db o= new db();   // connection
     String sql = "insert into METER_REQUEST (customer_name,customer_id,Area,attachment) values (' " +add.getCustomer_name() + "' ,"+add.getCustomer_id()+"  ,'"+add.getArea()+"','"+add.getAttachment()+"');";
     st.executeUpdate(sql);
     JOptionPane.showMessageDialog(null, "Added Successfully", "Add REQUEST", JOptionPane.INFORMATION_MESSAGE);
        db. CloseConnection();  // close connection
            
    }
    
     
   
    
    
    
    
}
