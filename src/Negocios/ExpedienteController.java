/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.DataExpediente;
import Encapsulamiento.Consulta;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author jmcito
 */
public class ExpedienteController {

    /**
     *
     * @param ExpedienteTable
     * @param expediente
     */
    public void MostrarEx(JTable ExpedienteTable, int expediente) {
        
        DataExpediente mExpediente=new DataExpediente();
        DefaultTableModel dft=new DefaultTableModel();
        ExpedienteTable.setModel(dft);
         dft.addColumn("Paciente");
         dft.addColumn("Consulta");
         dft.addColumn("Descripcion");
         dft.addColumn("Fecha");
         dft.addColumn("Medico");
         
         Object[] campo=new Object[5];
         
 
        int Lista = mExpediente.mostrarExp(expediente).size();
        for (int i = 0; i < Lista; i++) {
            campo[0]=mExpediente.mostrarExp(expediente).get(i).getNombre().getNombre();
            campo[1]=mExpediente.mostrarExp(expediente).get(i).getTitulo();
            campo[2]=mExpediente.mostrarExp(expediente).get(i).getDescripcion();
            campo[3]=mExpediente.mostrarExp(expediente).get(i).getFecha();
            campo[4]=mExpediente.mostrarExp(expediente).get(i).getMnombre().getNombre();
            dft.addRow(campo);
        }
        
    }

   
}
