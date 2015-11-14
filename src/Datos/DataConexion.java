/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jmcito
 */
public class DataConexion {
    
    private Connection Conn=null;
    
    String server="jdbc:mysql://localhost/CIJDATABASE";
    String user="root";
    String password="2030";
    
    public Connection dbConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conn= DriverManager.getConnection(server,user,password);
           
            
        } catch (ClassNotFoundException | SQLException e) {
        }
        
        return Conn;
    }
}
