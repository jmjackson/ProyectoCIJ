/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Encapsulamiento.Paciente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author jmcito
 */
public class DataPaciente {

    DataConexion conn;

    public DataPaciente() {
        conn=new DataConexion();
    }
    
    
    public int AgregarPaciente(Paciente p) {
           
  
            DateFormat first=new SimpleDateFormat("MM/dd/yy");
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            
 
        int Result=0;
        try {
            Date fecha=first.parse(p.getFechaEntrada());
            String date=formatter.format(fecha);

            Connection accesodb=conn.dbConnect();
            CallableStatement cs=accesodb.prepareCall("{call CIJDATABASE.add_Paciente(?,?,?,?,?,?)}");
            cs.setString(1, Integer.toString(p.getExpediente()));
            cs.setString(2, p.getNombre());
            cs.setString(3, p.getApellido());
            cs.setString(4, p.getDireccion());
            cs.setString(5, date);
            cs.setString(6, p.getActivo());
            
            Result=cs.executeUpdate();
            
        } catch (ParseException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e.toString());
        }
        return Result;
    }
    
}
