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
    
}
