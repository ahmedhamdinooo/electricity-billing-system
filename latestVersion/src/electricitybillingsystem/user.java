
//admen part 1
package electricitybillingsystem;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author name
 */
    public class user {
    private int id;
    private String usernaame;
    private String password;
    
    user(){
        
    }
 //constractor operators
    user( int id ,String username,String password){
        this.id=id;
        this.usernaame=username;
        this.password=password;
    }
//constractor admin
    user(String username, String password) {
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

    
   // ***********     methods   *******************
    
    public void log (){
          
try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ElectricityBilling;";
             String user = "ashref";
             String pass = "123456";
        try (Connection con = DriverManager.getConnection(dbURL, user, pass)) {
             String sql ="  select username ,password  from  users where username=? and password=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, getUser_naame());
            pst.setString(2, getPassword());
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "username and password matched" );
                
                admin_options l = new admin_options();
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
    
   }
    
    
    //admin part 2
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
    try {  
        Class.forName("com.mysql.jdbc.Driver");  
        // establish connection  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Studentinformation", "root", "");  
        Statement statement = con.createStatement();  
        statement.executeUpdate("INSERT INTO student VALUES(" + jTextField1.getText() + ",'" + jTextField2.getText() + "'," + jTextField3.getText() + ")");  
        JOptionPane.showMessageDialog(null, "Record inserted...");  
        statement.close();  
        con.close();  
        Referesh(); //Calling Referesh() method  
    } catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);  
    }  
}  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {  
    try {  
        Class.forName("com.mysql.jdbc.Driver");  
        // establish connection  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Studentinformation", "root", "");  
        Statement stmt = con.createStatement();  
        stmt.execute("UPDATE student SET name='" + jTextField2.getText() + "',marks=" + jTextField3.getText() + " WHERE roll=" + jTextField1.getText() + "");  
        JOptionPane.showMessageDialog(null, "Record is updated...");  
        stmt.close();  
        con.close();  
        Referesh(); //Calling Referesh() method  
    } catch (SQLException | ClassNotFoundException se) {  
        JOptionPane.showMessageDialog(null, se);  
    }  
}  
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {  
    try {  
        Class.forName("com.mysql.jdbc.Driver");  
        // establish connection  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Studentinformation", "root", "");  
        Statement statement = con.createStatement();  
        statement.executeUpdate("DELETE FROM student WHERE roll=" + jTextField1.getText() + "");  
        JOptionPane.showMessageDialog(null, "Record deleted...");  
        statement.close();  
        con.close();  
        Referesh(); //Calling Referesh() method  
    } catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);  
    }  
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
