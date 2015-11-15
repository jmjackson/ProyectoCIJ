/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Encapsulamiento.Paciente;
import Negocios.PacienteController;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jmcito
 */
public class AddExpedienteIF extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddExpedienteIF
     */
    public AddExpedienteIF() {
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

        ExpedienteLbl = new javax.swing.JLabel();
        NombreLbl = new javax.swing.JLabel();
        apellidoLbl = new javax.swing.JLabel();
        direccionLbl = new javax.swing.JLabel();
        fechaLbl = new javax.swing.JLabel();
        activoLbl = new javax.swing.JLabel();
        ExpedienteTxt = new javax.swing.JTextField();
        NombreTxt = new javax.swing.JTextField();
        ApellidoTxt = new javax.swing.JTextField();
        DireccionTxt = new javax.swing.JTextField();
        FechaCombo = new datechooser.beans.DateChooserCombo();
        ActiveCombo = new javax.swing.JComboBox();
        cancelarBtn = new javax.swing.JButton();
        agregarBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        logoLbl = new javax.swing.JLabel();
        fondoLbl = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Paciente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExpedienteLbl.setBackground(new java.awt.Color(254, 254, 254));
        ExpedienteLbl.setForeground(new java.awt.Color(254, 254, 254));
        ExpedienteLbl.setText("Expediente");
        getContentPane().add(ExpedienteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 89, -1, -1));

        NombreLbl.setBackground(new java.awt.Color(254, 254, 254));
        NombreLbl.setForeground(new java.awt.Color(254, 254, 254));
        NombreLbl.setText("Nombre");
        getContentPane().add(NombreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 119, -1, -1));

        apellidoLbl.setBackground(new java.awt.Color(254, 254, 254));
        apellidoLbl.setForeground(new java.awt.Color(254, 254, 254));
        apellidoLbl.setText("Apellido");
        getContentPane().add(apellidoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 152, -1, -1));

        direccionLbl.setBackground(new java.awt.Color(254, 254, 254));
        direccionLbl.setForeground(new java.awt.Color(254, 254, 254));
        direccionLbl.setText("Direccion");
        getContentPane().add(direccionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 192, -1, -1));

        fechaLbl.setBackground(new java.awt.Color(254, 254, 254));
        fechaLbl.setForeground(new java.awt.Color(254, 254, 254));
        fechaLbl.setText("Fecha Ingreso");
        getContentPane().add(fechaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 228, -1, -1));

        activoLbl.setBackground(new java.awt.Color(254, 254, 254));
        activoLbl.setForeground(new java.awt.Color(254, 254, 254));
        activoLbl.setText("Activo");
        getContentPane().add(activoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 253, -1, -1));
        getContentPane().add(ExpedienteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 81, 246, -1));
        getContentPane().add(NombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 114, 246, -1));
        getContentPane().add(ApellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 147, 246, -1));
        getContentPane().add(DireccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 187, 246, -1));

        FechaCombo.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    FechaCombo.setCalendarPreferredSize(new java.awt.Dimension(250, 200));
    FechaCombo.setFieldFont(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 12));
    getContentPane().add(FechaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 220, 246, -1));

    ActiveCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Seleccionado --", "Activo", "No Activo" }));
    getContentPane().add(ActiveCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 253, 246, -1));

    cancelarBtn.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
    cancelarBtn.setText("Cancelar");
    cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cancelarBtnActionPerformed(evt);
        }
    });
    getContentPane().add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 90, -1));

    agregarBtn.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
    agregarBtn.setText("Agregar");
    agregarBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarBtnActionPerformed(evt);
        }
    });
    getContentPane().add(agregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 90, -1));

    titleLbl.setForeground(new java.awt.Color(254, 254, 254));
    titleLbl.setText("Agregar Paciente Por Primera Vez");
    getContentPane().add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 12, -1, -1));

    logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/exportar.png"))); // NOI18N
    getContentPane().add(logoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 12, -1, -1));

    fondoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo.jpg"))); // NOI18N
    getContentPane().add(fondoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 360));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
               JTextField[]campos=new JTextField[4];
        campos[0]=ExpedienteTxt;
        campos[1]=NombreTxt;
        campos[2]=ApellidoTxt;
        campos[3]=DireccionTxt;
        
        for (JTextField campo : campos) {
            if (campo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Uno o mas campos estan vacios");
                return;
            }   
          }
        Paciente p=new Paciente();
        p.setExpediente(Integer.parseInt(ExpedienteTxt.getText()));
        p.setNombre(NombreTxt.getText());
        p.setApellido(ApellidoTxt.getText());
        p.setDireccion(DireccionTxt.getText());
        SimpleDateFormat fechaInput=new SimpleDateFormat("yyyy-MM-dd");
        p.setFechaEntrada(fechaInput.format(FechaCombo.getDateFormat()));
        p.setActivo(ActiveCombo.getSelectedItem().toString());
        
        PacienteController addpac=new PacienteController();
        addpac.AddPaciente(p);
        
        
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        JTextField[]campos=new JTextField[4];
        campos[0]=ExpedienteTxt;
        campos[1]=NombreTxt;
        campos[2]=ApellidoTxt;
        campos[3]=DireccionTxt;
        
        for (JTextField campo : campos) {
            campo.setText(null);
                
            }
        
    
    }//GEN-LAST:event_cancelarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ActiveCombo;
    private javax.swing.JTextField ApellidoTxt;
    private javax.swing.JTextField DireccionTxt;
    private javax.swing.JLabel ExpedienteLbl;
    private javax.swing.JTextField ExpedienteTxt;
    private datechooser.beans.DateChooserCombo FechaCombo;
    private javax.swing.JLabel NombreLbl;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JLabel activoLbl;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JLabel apellidoLbl;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel direccionLbl;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JLabel fondoLbl;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
