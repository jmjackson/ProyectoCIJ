/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.Usuario;
import java.sql.*;


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

    public int UserAdd(Usuario user) {
        int result=0;
        try {
            Connection cn=conn.dbConnect();
            CallableStatement cs=cn.prepareCall("{call CIJDATABASE.add_User(?,?,?,?)}");
            cs.setString(1, user.getNombre());
            cs.setString(2, user.getEmail());
            cs.setString(3, user.getUsuario());
            cs.setString(4, user.getPassword());
            
            result=cs.executeUpdate();
            
        } catch (Exception e) {
        }
        return result;
    }
    
}
