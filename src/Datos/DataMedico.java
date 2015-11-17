/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.Medico;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author jmcito
 */
public class DataMedico {


    
    DataConexion conn;

    public DataMedico() {
       conn=new DataConexion();
    }
    
    
   public int Actualizar(Medico actualizarM) {
        int result=0;
        
        try {
            Connection conex=conn.dbConnect();
            CallableStatement cs=conex.prepareCall("{call CIJDATABASE.UpdateMedicos(?,?,?,?,?,?)}");
            cs.setString(1, Integer.toString(actualizarM.getId()));
            cs.setString(2, actualizarM.getNombre());
            cs.setString(3, actualizarM.getEspecialidad());
            cs.setString(4, actualizarM.getEmail());
            cs.setString(5, actualizarM.getTelefono());
            cs.setString(6, actualizarM.getDescripcion());
            result=cs.executeUpdate();
            
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
       }
        
        return result;
    }
    
    
    public int AgregarMedico(Medico medico) {
        int result=0;
        
        try {
            Connection cn=conn.dbConnect();
            CallableStatement cs=cn.prepareCall("{call CIJDATABASE.add_Medicos(?,?,?,?,?)}");
            cs.setString(1, medico.getNombre());
            cs.setString(2, medico.getEspecialidad());
            cs.setString(3, medico.getEmail());
            cs.setString(4, medico.getTelefono());
            cs.setString(5, medico.getDescripcion());
            result=cs.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return result;
    }
    
    public ArrayList<Medico> ListMedico(){
        ArrayList listaMedico=new ArrayList();
        Medico medico;
        try {
            Connection cn=conn.dbConnect();
            PreparedStatement ps=cn.prepareStatement("Select Id,Nombre,Especialidad,Email,Telefono,Descripcion from CIJDATABASE.Medicos");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                medico=new Medico();    
                medico.setId(Integer.parseInt(rs.getString(1)));
                medico.setNombre(rs.getString(2));
                medico.setEspecialidad(rs.getString(3));
                medico.setEmail(rs.getString(4));
                medico.setTelefono(rs.getString(5));
                medico.setDescripcion(rs.getString(6));
                listaMedico.add(medico);
            }
            
        } catch (SQLException | NumberFormatException e) {
        }
        
        return listaMedico;
    }
    
}
