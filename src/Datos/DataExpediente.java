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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

    public int AddExpediente(Consulta consulta) {
        int Result=0;
        DateFormat first=new SimpleDateFormat("MM/dd/yy");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            Date fecha=first.parse(consulta.getFecha());
            String date=formatter.format(fecha);
            Connection conex=conn.dbConnect();
            CallableStatement cs=conex.prepareCall("{call CIJDATABASE.add_Expediente(?,?,?,?,?)}");
            cs.setString(1, consulta.getTitulo());
            cs.setString(2, consulta.getDescripcion());
            cs.setString(3, date);
            cs.setString(4, Integer.toString(consulta.getNombre().getId()));
            cs.setString(5, Integer.toString(consulta.getMnombre().getId()));
            Result=cs.executeUpdate();
        } catch (ParseException | SQLException e) {
        }
        
        return Result;
    }
    
}
