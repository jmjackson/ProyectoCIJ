/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.DataExpediente;
import Encapsulamiento.Paciente;
import javax.swing.JTable;



/**
 *
 * @author jmcito
 */
public class ExpedienteController {

    public void MostrarEx(JTable ExpedienteTable, Paciente paciente) {
        
        DataExpediente mExpediente=new DataExpediente();
        mExpediente.mostrarExp(paciente);
    }

   
}
