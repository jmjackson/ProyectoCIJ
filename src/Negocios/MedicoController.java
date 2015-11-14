/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.DataMedico;
import Encapsulamiento.Medico;
import javax.swing.JOptionPane;

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
    
}
