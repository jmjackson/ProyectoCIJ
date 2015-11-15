/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.DataPaciente;
import Encapsulamiento.Paciente;
import javax.swing.JOptionPane;

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
    
}
