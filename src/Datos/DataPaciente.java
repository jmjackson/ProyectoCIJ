/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import Encapsulamiento.Paciente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    public ArrayList<Paciente> MostrarPaciente() {
       ArrayList listapaciente =new ArrayList();
       Paciente paciente;
       
        try {
            Connection cn= conn.dbConnect();
            CallableStatement cs=cn.prepareCall("{call CIJDATABASE.ConsultPaciente()}");
            ResultSet st=cs.executeQuery();
            while (st.next()) {
                paciente=new Paciente();
                paciente.setId(Integer.parseInt(st.getString(1)));
                paciente.setExpediente(Integer.parseInt(st.getString(2)));
                paciente.setNombre(st.getString(3));
                paciente.setApellido(st.getString(4));
                paciente.setDireccion(st.getString(5));
                paciente.setFechaEntrada(st.getString(6));
                paciente.setActivo(st.getString(7));
                
                listapaciente.add(paciente);
                
                
            }
        } catch (SQLException | NumberFormatException e) {
        }
       return listapaciente;
               
    }

    public int ActualizarP(Paciente update) {
       int result=0;
        try {
            Connection conx=conn.dbConnect();
            CallableStatement cs=conx.prepareCall("{call CIJDATABASE.UpdatePacientes(?,?,?,?,?,?)}");
            cs.setString(1, Integer.toString(update.getExpediente()));
            cs.setString(2, update.getNombre());
            cs.setString(3, update.getApellido());
            cs.setString(4, update.getDireccion());
            cs.setString(5, update.getFechaEntrada());
            cs.setString(6, update.getActivo());
            result=cs.executeUpdate();
        } catch (Exception e) {
        }
       
       return result;
    }

    
    
}
