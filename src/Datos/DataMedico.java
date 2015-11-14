/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.Medico;
import java.sql.*;

/**
 *
 * @author jmcito
 */
public class DataMedico {
    
    DataConexion conn;

    public DataMedico() {
       conn=new DataConexion();
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
    
}
