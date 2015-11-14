/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Encapsulamiento.Medico;
import Encapsulamiento.Usuario;
import Negocios.MedicoController;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jmcito
 */
public class MedicoAddIF extends javax.swing.JInternalFrame {

    /**
     * Creates new form MedicoAddIF
     */
    public MedicoAddIF() {
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

        nameLbl = new javax.swing.JLabel();
        especialidadLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        telefonoLbl = new javax.swing.JLabel();
        descripcionLbl = new javax.swing.JLabel();
        TitleLbl = new javax.swing.JLabel();
        AcceptBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        nombreText = new javax.swing.JTextField();
        especialidadText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        telefonoText = new javax.swing.JTextField();
        descripcionText = new javax.swing.JTextField();
        fondoLbl = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Medicos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLbl.setForeground(new java.awt.Color(254, 254, 254));
        nameLbl.setText("Nombre");
        getContentPane().add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 73, -1, -1));

        especialidadLbl.setForeground(new java.awt.Color(254, 254, 254));
        especialidadLbl.setText("Especialidad");
        getContentPane().add(especialidadLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 106, -1, -1));

        emailLbl.setForeground(new java.awt.Color(254, 254, 254));
        emailLbl.setText("Email");
        getContentPane().add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 139, -1, -1));

        telefonoLbl.setForeground(new java.awt.Color(254, 254, 254));
        telefonoLbl.setText("Telefono");
        getContentPane().add(telefonoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 178, -1, -1));

        descripcionLbl.setForeground(new java.awt.Color(254, 254, 254));
        descripcionLbl.setText("Descripcion");
        getContentPane().add(descripcionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 211, -1, -1));

        TitleLbl.setText("Agregar Medicos");
        getContentPane().add(TitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 12, -1, -1));

        AcceptBtn.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        AcceptBtn.setText("Aceptar");
        AcceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AcceptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 251, -1, -1));

        CancelBtn.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        CancelBtn.setText("Cancelar");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 251, -1, -1));
        getContentPane().add(nombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 68, 236, -1));
        getContentPane().add(especialidadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 101, 236, -1));
        getContentPane().add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 134, 236, -1));
        getContentPane().add(telefonoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 173, 236, -1));
        getContentPane().add(descripcionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 206, 236, -1));

        fondoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo.jpg"))); // NOI18N
        getContentPane().add(fondoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
       JTextField[]campos=new JTextField[5];
       campos[0]=nombreText;
       campos[1]=especialidadText;
       campos[2]=emailText;
       campos[3]=telefonoText;
       campos[4]=descripcionText;
       
        for (JTextField campo : campos) {
            
            campo.setText(null);
               
        }
       
        
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void AcceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBtnActionPerformed
        if (nombreText.getText().isEmpty()&&especialidadText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre y una especialidad");
            return;
        }
        Medico medico=new Medico();
        medico.setNombre(nombreText.getText());
        medico.setEspecialidad(especialidadText.getText());
        medico.setEmail(emailText.getText());
        medico.setTelefono(telefonoText.getText());
        medico.setDescripcion(descripcionText.getText());
        
        MedicoController addMedico=new MedicoController();
        addMedico.AddMedico(medico);
        this.setVisible(false);
    }//GEN-LAST:event_AcceptBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JLabel descripcionLbl;
    private javax.swing.JTextField descripcionText;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel especialidadLbl;
    private javax.swing.JTextField especialidadText;
    private javax.swing.JLabel fondoLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel telefonoLbl;
    private javax.swing.JTextField telefonoText;
    // End of variables declaration//GEN-END:variables
}
