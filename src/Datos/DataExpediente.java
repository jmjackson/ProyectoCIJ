/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.Consulta;
import Encapsulamiento.Medico;
import Encapsulamiento.Paciente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jmcito
 */


public class DataExpediente {
    DataConexion conn;

    public DataExpediente() {
        conn=new DataConexion();
    }
    
    public ArrayList<Paciente> mostrarExp(Paciente paciente) {
        ArrayList listExp=null;
        Consulta expediente;
        Paciente pacientes;
        Medico medico;
        
        try {
            Connection conex=conn.dbConnect();
            CallableStatement cs= conex.prepareCall("call CIJDATABASE.ConsultaExpediente(?)");
            cs.setString(1, Integer.toString(paciente.getId()));
            ResultSet rs=cs.executeQuery();
            
            while (rs.next()) {
                expediente=new Consulta();
                medico =new Medico();
                pacientes=new Paciente();
                expediente.setId(Integer.parseInt(rs.getString(1)));
                expediente.setTitulo(rs.getString(2));
                expediente.setDescripcion(rs.getString(3));
                expediente.setFecha(rs.getString(4));
             
                
                
            }
                   
            
        } catch (SQLException | NumberFormatException e) {
            
        }
        
        
        return listExp;
    }
    
}
