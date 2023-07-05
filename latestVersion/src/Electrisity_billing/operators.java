/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrisity_billing;
import electricitybillingsystem.user;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class operators{
    private int id;
    private String username;
    private String password;
    private String name;
    private String address;
    private String phone ;
    private float salary;

 operators() {
        
    }
    operators(int id ,String user,String pass,String name,String address ,String phone , float salary) 
    {
        
        this.id=id;
        this.username=user;
        this.password=pass;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    
 
    public void setId(int id) {
        this.id = id;
    }

   
    public String getUsername() {
        return username;
    }

   
    public void setUsername(String username) {
        this.username = username;
    }

   
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    
    public String getAddress() {
        return address;
    }

   
    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getPhone() {
        return phone;
    }

   
    public void setPhone(String phone) {
        this.phone = phone;
    }

   
    public float getSalary() {
        return salary;
    }

   
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
     public static void main(String[] args) {
     }
     
     public void Addoperators(operators c) throws SQLException {
          
          
         String sql = "insert into operatoer  (username ,password ,name,address,phone,salary) values ('" + c.getUsername() + "' ,'" + c.getPassword() + "','" + c.getName() + "' , '" + c.getAddress() + "' , '" + c.getPhone()+ "' ,"+c.getSalary()+");";
         st.executeUpdate(sql);
         JOptionPane.showMessageDialog(null, "Added Successfully", "Add operator", JOptionPane.INFORMATION_MESSAGE);
      
     }
        
        public void Deleteoperators(int operator_id) throws SQLException {
         
            
            String sql = "delete from operatoer where id = " +operator_id;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete operator", JOptionPane.INFORMATION_MESSAGE);
          
     }
    
        
         public void Saveoperators(operators c) throws SQLException {
      
            
           String sql = "update operatoer set  username ='" + c.getUsername() + "' , password ='" + c.getPassword() + "'  , name ='" + c.getName() + "' , address= '" +  c.getAddress() + "' , phone = '" + c.getPhone() + "' , salary = "+c.getSalary()+" where id = "+c.getId();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Edited Successfully", "Edit operator", JOptionPane.INFORMATION_MESSAGE);
            
      }
              public void stopmeter(int cust_Id) throws SQLException {
         
           db o= new db();   // connection
            String sql = "delete from customer where id = " +cust_Id;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "stop Successfully", "Delete customer", JOptionPane.INFORMATION_MESSAGE);
            db. CloseConnection();  // close connection
              }}





