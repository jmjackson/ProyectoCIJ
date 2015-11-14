/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.DataUser;
import Encapsulamiento.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author jmcito
 */
public class UserController {
    

    public void LoginAcceso(Usuario user) {
        DataUser verificacion=new DataUser();
        Usuario intro=verificacion.LoginUser(user);
        JOptionPane.showConfirmDialog(null, ""+intro.getNombre());
    }

    public void AddUser(Usuario user) {
        
        int result=0;
    DataUser agregarUsuario=new DataUser();
    result=agregarUsuario.UserAdd(user);
        if (result>0) {
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Confirme sus Datos");
        }
        
    }
    
}
