/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jmcito
 */
public class DataUser {

    DataConexion conn;
    public DataUser() {
        conn=new DataConexion();
    }
    

    public Usuario LoginUser(Usuario user)  {
       Usuario principal = null;
       int fila=0;
        try {
            Connection cn=conn.dbConnect();
            CallableStatement cs=cn.prepareCall("{call CIJDATABASE.verifylogin(?,?)}");
            cs.setString(1, user.getUsuario());
            cs.setString(2, user.getPassword());
            ResultSet rs=cs.executeQuery();
        } catch (Exception e) {
        }
       
       return principal;
    }
    
}
