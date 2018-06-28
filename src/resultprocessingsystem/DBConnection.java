/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resultprocessingsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    public static Connection getconn()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultprocsys","root","root");
            return con;
            }catch(Exception E){
                E.printStackTrace();
                return null;
        }
    }
    
    public static Dimension getScreenSize()
    {
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        return d;   
    }
}
