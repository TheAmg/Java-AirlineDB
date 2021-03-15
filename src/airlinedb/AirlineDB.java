/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinedb;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author theam
 */
public class AirlineDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login log=new Login();
        log.setVisible(true);
    }
    public static void SetHoverTheme(JLabel lb,JPanel pan){
        pan.setBackground(new java.awt.Color(204,204,204));
        lb.setForeground(new java.awt.Color(0,0,0));
    }
    public static void ResetHoverTheme(JLabel lb,JPanel pan){
        pan.setBackground(new java.awt.Color(0,102,204));
        lb.setForeground(new java.awt.Color(255,255,255));
    }
    
}
