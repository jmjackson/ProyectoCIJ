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
    
    /**
     *
     * @param paciente
     * @return
     */
    public ArrayList<Consulta> mostrarExp(int paciente) {
        ArrayList listExp=new ArrayList();
      
        Consulta expediente;
        Paciente pacientes;
        Medico medico;
        
        try {
            Connection conex=conn.dbConnect();
            CallableStatement cs= conex.prepareCall("call CIJDATABASE.ConsultaExpediente(?)");
            cs.setString(1, Integer.toString(paciente));
            ResultSet rs=cs.executeQuery();
            String Nombre;
            String MedicoN;
            while (rs.next()) {
                expediente=new Consulta();
                
                
                expediente.setId(Integer.parseInt(rs.getString(1)));
                expediente.setTitulo(rs.getString(2));
                expediente.setDescripcion(rs.getString(3));
                expediente.setFecha(rs.getString(4));
                expediente.setNombre(new Paciente(Integer.parseInt(rs.getString(5)),
                        Integer.parseInt(rs.getString(6)),rs.getString(7),
                        rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)
                ));
                expediente.setMnombre(new Medico(Integer.parseInt(rs.getString(12)),
                rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),
                rs.getString(17)));
                
                listExp.add(expediente);
                
                
                
            }
                   
            
        } catch (SQLException | NumberFormatException e) {
            
        }
        
        
        return listExp;
    }
    
}
