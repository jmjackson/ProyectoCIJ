/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.DataUser;
import Encapsulamiento.Usuario;
import Presentacion.AdminUser;
import Presentacion.UserPerfil;


import javax.swing.JOptionPane;

/**
 *
 * @author jmcito
 */
public class UserController {
    

    public void LoginAcceso(Usuario user) {
        DataUser verificacion=new DataUser();
        
        Usuario intro=verificacion.LoginUser(user);
        if((intro.getUsuario().equals(user.getUsuario()))&&
                (user.getUsuario().equals(intro.getUsuario()))){
            AdminUser adminpanel=new AdminUser();
            adminpanel.setVisible(true);
            adminpanel.UsuarioPrincipal(intro);
            

        }
        
    }

    public void AddUser(Usuario user) {
        
        int result;
    DataUser agregarUsuario=new DataUser();
    result=agregarUsuario.UserAdd(user);
        if (result>0) {
            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Confirme sus Datos");
        }
        
    }

    public  Usuario MostrarUsuario(String text) {
        Usuario perfil;
        DataUser usuario=new DataUser();
        perfil=usuario.usuario(text);
        
        return perfil;
    }

    public void EditarUser(Usuario update) {
        DataUser updateDataUser=new DataUser();
        int res;
        res = updateDataUser.EditUser(update);
        if (res>0) {
            JOptionPane.showMessageDialog(null, "Sus datos se han actualizado correctamente");
        }
    }


    
    
}
