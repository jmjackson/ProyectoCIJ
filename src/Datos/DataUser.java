/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.Usuario;

import java.awt.HeadlessException;
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
            if (rs.next()){
                principal=new Usuario();
                principal.setId(Integer.parseInt(rs.getString("Id")));
                principal.setNombre(rs.getString("Nombre"));
                principal.setEmail(rs.getString("Email"));
                principal.setUsuario(rs.getString("NUsuario"));
                principal.setPassword(rs.getString("Password"));
                
            }
            else   {
               JOptionPane.showMessageDialog(null, "password incorrecto");

            }
        } catch (SQLException | HeadlessException e) {
            
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
    
    public Usuario usuario(String user){
        Usuario consulta=null;
        try {
            Connection conex=conn.dbConnect();
            Statement st=conex.createStatement();
            ResultSet rs=st.executeQuery("select Id, Nombre, Email,NUsuario,Password from CIJDATABASE.Usuarios where NUsuario = '"+user+"'");
            while (rs.next()) {                
                consulta=new Usuario();
                consulta.setId(Integer.parseInt(rs.getString(1)));
                consulta.setNombre(rs.getString(2));
                consulta.setEmail(rs.getString(3));
                consulta.setUsuario(rs.getString(4));
                consulta.setPassword(rs.getString(5));
            }
        } catch (SQLException | NumberFormatException e) {
        }
        
        return consulta;
    }
}
