/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.DataPaciente;
import Encapsulamiento.Paciente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jmcito
 */
public class PacienteController {

    public void AddPaciente(Paciente p) {
        DataPaciente AddPaciente=new DataPaciente();
        int res;
        res=AddPaciente.AgregarPaciente(p);
        if (res>0) {
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
        }
    }

    public void MostrarPacient(JTable ExpedienteTable) {
        DataPaciente ShowList=new DataPaciente();
        
        DefaultTableModel dft=new DefaultTableModel();
        ExpedienteTable.setModel(dft);
        
        dft.addColumn("Item");
        dft.addColumn("Expediente");
        dft.addColumn("Nombre");
        dft.addColumn("Apellido");
        dft.addColumn("Direccion");
        dft.addColumn("Fecha Ingreso");
        dft.addColumn("Activo");
        
        Object[] campos=new Object[7];
        int datos=ShowList.MostrarPaciente().size();
        for (int i = 0; i < datos; i++) {
            
            campos[0]=ShowList.MostrarPaciente().get(i).getId();
            campos[1]=ShowList.MostrarPaciente().get(i).getExpediente();
            campos[2]=ShowList.MostrarPaciente().get(i).getNombre();
            campos[3]=ShowList.MostrarPaciente().get(i).getApellido();
            campos[4]=ShowList.MostrarPaciente().get(i).getDireccion();
            campos[5]=ShowList.MostrarPaciente().get(i).getFechaEntrada();
            campos[6]=ShowList.MostrarPaciente().get(i).getActivo();
            dft.addRow(campos);
                   
        }
    }
    
}
