/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author theam
 */
public class C_manageAccount extends javax.swing.JFrame {
String loggedUname=null;
String loggedUid=null;

boolean canEdit=false;
    /**
     * Creates new form C_manageAccount
     */
    public C_manageAccount() {
        initComponents();
    }
    public void OnStart(String uid,String name){
        loggedUname=name;
        loggedUid=uid;
        loadUserInfo();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        unametf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addrtf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phonetf = new javax.swing.JFormattedTextField();
        passpnotf = new javax.swing.JFormattedTextField();
        savepan = new javax.swing.JPanel();
        savelab = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pwdtf = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        statuslab = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bcklab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setText("Username");

        unametf.setEditable(false);

        jLabel4.setText("phone");

        jLabel5.setText("address");

        addrtf.setEditable(false);

        jLabel6.setText("passport no");

        phonetf.setEditable(false);
        phonetf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        passpnotf.setEditable(false);
        passpnotf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        savepan.setBackground(new java.awt.Color(0, 102, 204));
        savepan.setToolTipText("");

        savelab.setForeground(new java.awt.Color(255, 255, 255));
        savelab.setText("     SAVE CHANGES");
        savelab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savelab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savelabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savelabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savelabMouseExited(evt);
            }
        });

        javax.swing.GroupLayout savepanLayout = new javax.swing.GroupLayout(savepan);
        savepan.setLayout(savepanLayout);
        savepanLayout.setHorizontalGroup(
            savepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(savelab, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        savepanLayout.setVerticalGroup(
            savepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(savelab, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jLabel8.setText("password");

        pwdtf.setEditable(false);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlinedb/refresh_icon.png"))); // NOI18N
        jLabel9.setText("refresh");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(153, 153, 153));
        jRadioButton1.setText("Edit details");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addrtf)
                            .addComponent(unametf)
                            .addComponent(phonetf)
                            .addComponent(passpnotf)
                            .addComponent(pwdtf, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                    .addComponent(jRadioButton1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(savepan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(unametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phonetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addrtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passpnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pwdtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(savepan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0,0,0,150));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 410, 240));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Here you can edit your");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" information");

        statuslab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statuslab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statuslab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0,0,0,150));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 230));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   < BACK");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 588, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        bcklab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlinedb/apintcmng.jpg"))); // NOI18N
        getContentPane().add(bcklab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MousePressed
        // TODO add your handling code here:
        
        rbclicked();
       
    }//GEN-LAST:event_jRadioButton1MousePressed
    private void rbclicked(){
        JTextField jtfarr[]={unametf,addrtf};
        JFormattedTextField jffarr[]={phonetf,passpnotf};
        
        
        
        //toggle editmode
        if(canEdit){
            canEdit=false;
        }else{
            canEdit=true;
        }
        
       // 
        
            
            for(int i=0;i<jtfarr.length;i++){
                jtfarr[i].setEditable(canEdit);
            }
            for(int i=0;i<jffarr.length;i++){
                jffarr[i].setEditable(canEdit);
            }
            pwdtf.setEditable(canEdit);
            
    }
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        loadUserInfo();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void savelabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelabMouseClicked
        // TODO add your handling code here:
        String uname=unametf.getText().trim();
        String addr=addrtf.getText().trim();
        String phone=""+phonetf.getText().trim();
        String passpno=""+passpnotf.getText();
        String upwd=pwdtf.getText();
        String fpwd=getPwdCalc(upwd,loggedUid);
        
        try{
             Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/airdb","root",""); 
                Statement stmt=con.createStatement();
                Statement stmt1=con.createStatement();
                Statement stmt2=con.createStatement();
                String sql1="select * from user where not userid='"+loggedUid+"' and uname='"+uname+"'";
                String sql="update user set uname='"+uname+"',upwd='"+fpwd+"' where userid='"+loggedUid+"'";
                String sql2="update user_details set cname='"+uname+"',phone='"+phone+"',address='"+addr+"',passport_no='"+passpno+"' where cid='"+loggedUid+"'";
     
                ResultSet rs1=stmt1.executeQuery(sql1);
                
                if(rs1.next()){
                    statuslab.setText("That username is already taken");
                }
                else{
                    stmt1.executeUpdate(sql);
                    stmt2.executeUpdate(sql2);
                    loggedUname=uname;
                    statuslab.setText("Changed details");
                    
                    rbclicked();
                    jRadioButton1.setSelected(canEdit);
                    
                }
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
        
        
    }//GEN-LAST:event_savelabMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        CustomerMenu cm=new CustomerMenu();
        cm.OnStart(loggedUid, loggedUname);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void savelabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelabMouseEntered
        // TODO add your handling code here:
        AirlineDB.SetHoverTheme(savelab, savepan);
    }//GEN-LAST:event_savelabMouseEntered

    private void savelabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelabMouseExited
        // TODO add your handling code here:
        AirlineDB.ResetHoverTheme(savelab, savepan);
    }//GEN-LAST:event_savelabMouseExited
    private String getPwdCalc(String newpwd,String uid){
        String fpwd=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/airdb","root",""); 
                Statement stmt=con.createStatement();
                String sql="select upwd from user where userid='"+uid+"'";
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next()){
                    String oldpwd=rs.getString(1);
                    
                   
                    if(!oldpwd.equals(newpwd)&&(newpwd!=null)&&(!(newpwd.equals("")))){
                        fpwd=newpwd;
                    }else{
                        fpwd=oldpwd;
                    }
                }else{
                    statuslab.setText("Error finding pwd");
                }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error " +e);
        }
        
        return fpwd;
    }
    
    private void loadUserInfo(){
        String uname=loggedUname;
        String addr=null;
        String phone=null;
        String passpno=null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/airdb","root",""); 
                
                Statement stmt1=con.createStatement();
                String sql1="select * from user_details where cid='"+loggedUid+"'";
     
                ResultSet rs1=stmt1.executeQuery(sql1);
                if(rs1.next()){
                    phone=rs1.getString(3);
                    addr=rs1.getString(4);
                    passpno=rs1.getString(5);
                }else{
                    statuslab.setText("Error with query or user not found");
                }
                
                
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error e"+e);
        }
        unametf.setText(uname);
        phonetf.setText(phone);
        addrtf.setText(addr);
        passpnotf.setText(passpno);
    }
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
            java.util.logging.Logger.getLogger(C_manageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_manageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_manageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_manageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_manageAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrtf;
    private javax.swing.JLabel bcklab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JFormattedTextField passpnotf;
    private javax.swing.JFormattedTextField phonetf;
    private javax.swing.JPasswordField pwdtf;
    private javax.swing.JLabel savelab;
    private javax.swing.JPanel savepan;
    private javax.swing.JLabel statuslab;
    private javax.swing.JTextField unametf;
    // End of variables declaration//GEN-END:variables
}