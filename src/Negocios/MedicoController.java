/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.DataMedico;
import Encapsulamiento.Medico;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jmcito
 */
public class MedicoController {

    public void AddMedico(Medico medico) {
        int result=0;
        DataMedico MedicoData=new DataMedico();
        result=MedicoData.AgregarMedico(medico);
        if(result>0){
            JOptionPane.showMessageDialog(null, "Datos agregados Correctamente");
        }
        else{
        JOptionPane.showMessageDialog(null, "Sus Datos no Fueron Agregados");
        }
        
    }

    public void MostrarMedicos(JTable medicoT) {
        DefaultTableModel modelt=new DefaultTableModel();
        medicoT.setModel(modelt);
        DataMedico datoslist=new DataMedico();
        
       
        
        modelt.addColumn("Item");
        modelt.addColumn("Nombre");
        modelt.addColumn("Especialidad");
        modelt.addColumn("Email");
        modelt.addColumn("Telefono");
        modelt.addColumn("Descripcion");
        
        Object[] column=new Object[6];
        
        int numregistro=datoslist.ListMedico().size();
        
        for (int i = 0; i <numregistro; i++) {
            column[0]=Integer.toString(datoslist.ListMedico().get(i).getId());
            column[1]=datoslist.ListMedico().get(i).getNombre();
            column[2]=datoslist.ListMedico().get(i).getEspecialidad();
            column[3]=datoslist.ListMedico().get(i).getEmail();
            column[4]=datoslist.ListMedico().get(i).getTelefono();
            column[5]=datoslist.ListMedico().get(i).getDescripcion();
            modelt.addRow(column);
        }
   }
    
}
