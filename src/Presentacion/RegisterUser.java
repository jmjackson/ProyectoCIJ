/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Encapsulamiento.Usuario;
import Negocios.UserController;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jmcito
 */
public class RegisterUser extends javax.swing.JFrame {

    /**
     * Creates new form RegisterUser
     */
    public RegisterUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombrelbl = new javax.swing.JLabel();
        Emallbl = new javax.swing.JLabel();
        usuarioLbl = new javax.swing.JLabel();
        PasswordLbl = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        userTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();
        addUserbtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        fondolbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombrelbl.setBackground(new java.awt.Color(255, 254, 254));
        Nombrelbl.setText("Nombre");
        getContentPane().add(Nombrelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 59, -1, -1));

        Emallbl.setBackground(new java.awt.Color(255, 254, 254));
        Emallbl.setText("Email");
        getContentPane().add(Emallbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 92, -1, -1));

        usuarioLbl.setBackground(new java.awt.Color(255, 254, 254));
        usuarioLbl.setText("Usuario");
        getContentPane().add(usuarioLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 125, -1, -1));

        PasswordLbl.setBackground(new java.awt.Color(255, 254, 254));
        PasswordLbl.setText("Contraseña");
        getContentPane().add(PasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 164, -1, -1));
        getContentPane().add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 54, 158, -1));
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 87, 158, -1));
        getContentPane().add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 120, 158, -1));
        getContentPane().add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 159, 158, -1));

        addUserbtn.setText("Registrarse");
        addUserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addUserbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 212, -1, -1));

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 212, -1, -1));

        titleLbl.setText("REGISTRAR USUARIO");
        getContentPane().add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 12, -1, -1));

        fondolbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo.jpg"))); // NOI18N
        getContentPane().add(fondolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
    JTextField[] campos=new JTextField[4];
    campos[0]=nombreTxt;
    campos[1]=emailTxt;
    campos[2]=userTxt;
    campos[3]=passwordTxt;
    
        for (JTextField campo : campos) {
            campo.setText(null);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addUserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserbtnActionPerformed
        JTextField[] campos=new JTextField[4];
            campos[0]=nombreTxt;
            campos[1]=emailTxt;
            campos[2]=userTxt;
            campos[3]=passwordTxt;
            
        for (JTextField campo : campos) {
            if (campo.getText().isEmpty()) {
                JOptionPane.showConfirmDialog(null, "Uno o más campos vacios");
                return;
            }
            
        }
        Usuario user=new Usuario();
        user.setNombre(nombreTxt.getText());
        user.setEmail(emailTxt.getText());
        user.setUsuario(userTxt.getText());
        user.setPassword(passwordTxt.getText());
        UserController addUser=new UserController();
        addUser.AddUser(user);
        this.setVisible(false);

        
    }//GEN-LAST:event_addUserbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Emallbl;
    private javax.swing.JLabel Nombrelbl;
    private javax.swing.JLabel PasswordLbl;
    private javax.swing.JButton addUserbtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel fondolbl;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField userTxt;
    private javax.swing.JLabel usuarioLbl;
    // End of variables declaration//GEN-END:variables
}
