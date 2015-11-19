/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Encapsulamiento.Paciente;
import Negocios.ExpedienteController;
import Negocios.PacienteController;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jmcito
 */
public class ListExpedienteIF extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListExpediente
     */
    PacienteController pacientelista=new PacienteController();
    public ListExpedienteIF() {
        initComponents();
        pacientelista.MostrarPacient(ExpedienteTable);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloLbl = new javax.swing.JLabel();
        ExpedienteTxt = new javax.swing.JTextField();
        NombreTxt = new javax.swing.JTextField();
        ApellidoTxt = new javax.swing.JTextField();
        DireccionTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ExpedienteTable = new javax.swing.JTable();
        ExpedienteLbl = new javax.swing.JLabel();
        NombreLbl = new javax.swing.JLabel();
        ApellidoLbl = new javax.swing.JLabel();
        DireccionLbl = new javax.swing.JLabel();
        FcechaLbl = new javax.swing.JLabel();
        ActivoLbl = new javax.swing.JLabel();
        MostrarEBtn = new javax.swing.JButton();
        EditarBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();
        FechaIngreso = new javax.swing.JTextField();
        ActivoCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Expedientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloLbl.setText("Control de Expediente");
        getContentPane().add(TituloLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 12, -1, -1));

        ExpedienteTxt.setEditable(false);
        ExpedienteTxt.setEnabled(false);
        getContentPane().add(ExpedienteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 47, 190, -1));
        getContentPane().add(NombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 86, 190, -1));
        getContentPane().add(ApellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 119, 190, -1));
        getContentPane().add(DireccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 47, 190, -1));

        ExpedienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ExpedienteTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 193, 733, 134));

        ExpedienteLbl.setText("# Expediente");
        getContentPane().add(ExpedienteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, -1, -1));

        NombreLbl.setText("Nombre");
        getContentPane().add(NombreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 91, -1, -1));

        ApellidoLbl.setText("Apellido");
        getContentPane().add(ApellidoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 124, -1, -1));

        DireccionLbl.setText("Dirección");
        getContentPane().add(DireccionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 52, -1, -1));

        FcechaLbl.setText("Fecha Entrada");
        getContentPane().add(FcechaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 80, -1, -1));

        ActivoLbl.setText("Activo");
        getContentPane().add(ActivoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 118, -1, -1));

        MostrarEBtn.setText("Mostrar Expediente");
        getContentPane().add(MostrarEBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        EditarBtn.setText("Editar");
        EditarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EditarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 90, -1));

        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ActualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 120, -1));

        FechaIngreso.setEditable(false);
        FechaIngreso.setEnabled(false);
        getContentPane().add(FechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 190, -1));

        ActivoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Seleccionar --", "Activo", "No Activo" }));
        getContentPane().add(ActivoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 113, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtnActionPerformed
        
        
        Paciente paciente=updatePaciente();
         ExpedienteTxt.setText(Integer.toString(paciente.getExpediente()));
         NombreTxt.setText(paciente.getNombre());
         ApellidoTxt.setText(paciente.getApellido());
         DireccionTxt.setText(paciente.getDireccion());
         FechaIngreso.setText(paciente.getFechaEntrada());
         ActivoCombo.setSelectedItem(paciente.getActivo());
         
         
            
        
        
    }//GEN-LAST:event_EditarBtnActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
       Paciente Upaciente;
       Upaciente=updatePaciente();
       
        JTextField[] campos= new JTextField[3];
        campos[0]=NombreTxt;
        campos[1]=ApellidoTxt;
        campos[2]=DireccionTxt;
        
        
        for (JTextField campo : campos) {
            if (campo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
            return;    
            }
        }
        
       Paciente update=new Paciente();
       update.setId(Upaciente.getId());
       update.setExpediente(Upaciente.getExpediente());
       update.setNombre(NombreTxt.getText());
       update.setApellido(ApellidoTxt.getText());
       update.setDireccion(DireccionTxt.getText());
       update.setFechaEntrada(Upaciente.getFechaEntrada());
       update.setActivo(ActivoCombo.getSelectedItem().toString());
       
        PacienteController updateEx=new PacienteController();
        updateEx.Actualizar(update);
    }//GEN-LAST:event_ActualizarBtnActionPerformed
private Paciente updatePaciente() {
       Paciente update= new Paciente();
       
       int Fila=ExpedienteTable.getSelectedRow();
           if (Fila>=0) {
               
            update.setId(Integer.parseInt(String.valueOf(ExpedienteTable.getValueAt(Fila, 0))));
            update.setExpediente(Integer.parseInt(String.valueOf(ExpedienteTable.getValueAt(Fila, 1))));
            update.setNombre(String.valueOf(ExpedienteTable.getValueAt(Fila, 2)));
            update.setApellido(String.valueOf(ExpedienteTable.getValueAt(Fila, 3)));
            update.setDireccion(String.valueOf(ExpedienteTable.getValueAt(Fila, 4)));
            update.setFechaEntrada(String.valueOf(ExpedienteTable.getValueAt(Fila, 5)));
            update.setActivo(String.valueOf(ExpedienteTable.getValueAt(Fila, 6)));
       
       
    }return update;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ActivoCombo;
    private javax.swing.JLabel ActivoLbl;
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JLabel ApellidoLbl;
    private javax.swing.JTextField ApellidoTxt;
    private javax.swing.JLabel DireccionLbl;
    private javax.swing.JTextField DireccionTxt;
    private javax.swing.JButton EditarBtn;
    private javax.swing.JLabel ExpedienteLbl;
    private javax.swing.JTable ExpedienteTable;
    private javax.swing.JTextField ExpedienteTxt;
    private javax.swing.JLabel FcechaLbl;
    private javax.swing.JTextField FechaIngreso;
    private javax.swing.JButton MostrarEBtn;
    private javax.swing.JLabel NombreLbl;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JLabel TituloLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    

    }