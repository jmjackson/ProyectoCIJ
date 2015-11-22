/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;



import Encapsulamiento.Consulta;
import Encapsulamiento.Medico;
import Encapsulamiento.Paciente;
import Negocios.ExpedienteController;
import Negocios.MedicoController;
import Negocios.PacienteController;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



/**
 *
 * @author jmcito
 */
public class ExpedienteShowIf extends javax.swing.JInternalFrame {

    /**
     * Creates new form ExpedienteShowIf
     */
    ExpedienteController expediente=new ExpedienteController();
    public ExpedienteShowIf() {
        initComponents();
      
        Obtenermedicos();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expedienteLbl = new javax.swing.JLabel();
        resExpediente = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        resNombre = new javax.swing.JLabel();
        apellidoLbl = new javax.swing.JLabel();
        resApellido = new javax.swing.JLabel();
        activoLbl = new javax.swing.JLabel();
        ResActivo = new javax.swing.JLabel();
        Consultatitlelbl = new javax.swing.JLabel();
        descripcionLbl = new javax.swing.JLabel();
        fechaLbl = new javax.swing.JLabel();
        medicoLbl = new javax.swing.JLabel();
        consultaTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionTxt = new javax.swing.JTextArea();
        ComboFecha = new datechooser.beans.DateChooserCombo();
        comboMedico = new javax.swing.JComboBox();
        acceptBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExpedienteTable = new javax.swing.JTable();
        fechaIngresoLbl = new javax.swing.JLabel();
        ResFechaLbl = new javax.swing.JLabel();
        fondolbl = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        expedienteLbl.setForeground(new java.awt.Color(254, 254, 254));
        expedienteLbl.setText("#Expediente:");
        getContentPane().add(expedienteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 29, -1, -1));

        resExpediente.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        resExpediente.setForeground(new java.awt.Color(254, 254, 254));
        resExpediente.setText("none");
        getContentPane().add(resExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 29, -1, -1));

        nombreLbl.setForeground(new java.awt.Color(254, 254, 254));
        nombreLbl.setText("Nombre:");
        getContentPane().add(nombreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 58, -1, -1));

        resNombre.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        resNombre.setForeground(new java.awt.Color(254, 254, 254));
        resNombre.setText("none");
        getContentPane().add(resNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 58, -1, -1));

        apellidoLbl.setForeground(new java.awt.Color(254, 254, 254));
        apellidoLbl.setText("Apellido:");
        getContentPane().add(apellidoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 87, -1, -1));

        resApellido.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        resApellido.setForeground(new java.awt.Color(254, 254, 254));
        resApellido.setText("none");
        getContentPane().add(resApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 87, -1, -1));

        activoLbl.setForeground(new java.awt.Color(254, 254, 254));
        activoLbl.setText("Activo:");
        getContentPane().add(activoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 116, -1, -1));

        ResActivo.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        ResActivo.setForeground(new java.awt.Color(254, 254, 254));
        ResActivo.setText("none");
        getContentPane().add(ResActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 116, -1, -1));

        Consultatitlelbl.setForeground(new java.awt.Color(254, 254, 254));
        Consultatitlelbl.setText("Titulo de Consulta");
        getContentPane().add(Consultatitlelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 24, -1, -1));

        descripcionLbl.setForeground(new java.awt.Color(254, 254, 254));
        descripcionLbl.setText("Descripcion");
        getContentPane().add(descripcionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 58, -1, -1));

        fechaLbl.setForeground(new java.awt.Color(254, 254, 254));
        fechaLbl.setText("Fecha");
        getContentPane().add(fechaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 199, -1, -1));

        medicoLbl.setForeground(new java.awt.Color(254, 254, 254));
        medicoLbl.setText("Medico");
        getContentPane().add(medicoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 240, -1, -1));
        getContentPane().add(consultaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 19, 234, -1));

        DescripcionTxt.setColumns(20);
        DescripcionTxt.setRows(5);
        jScrollPane1.setViewportView(DescripcionTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 58, 234, 108));
        getContentPane().add(ComboFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 189, 234, -1));

        comboMedico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 235, 234, -1));

        acceptBtn.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        acceptBtn.setText("Ingresar Consulta");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });
        getContentPane().add(acceptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        cancelBtn.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

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
        jScrollPane2.setViewportView(ExpedienteTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 269, 715, 170));

        fechaIngresoLbl.setForeground(new java.awt.Color(254, 254, 254));
        fechaIngresoLbl.setText("Fecha Ingreso:");
        getContentPane().add(fechaIngresoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        ResFechaLbl.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        ResFechaLbl.setForeground(new java.awt.Color(254, 254, 254));
        ResFechaLbl.setText("none");
        getContentPane().add(ResFechaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        fondolbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo.jpg"))); // NOI18N
        getContentPane().add(fondolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        consultaTxt.setText(null);
        DescripcionTxt.setText(null);
        int dialogresult=JOptionPane.showConfirmDialog(null, "¿Desea cancelar?","Aviso",JOptionPane.YES_NO_OPTION);
        if (dialogresult==0) {
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        Consulta consulta=new Consulta();
        consulta.setTitulo(consultaTxt.getText());
        consulta.setDescripcion(DescripcionTxt.getText());
        consulta.setFecha(ComboFecha.getText());
        String medicoId=comboMedico.getSelectedItem().toString();
        String[]medicoGI;
        medicoGI = medicoId.split(Pattern.quote("."));
        String Id=medicoGI[0];
        String Nombre=medicoGI[1];
        Medico medco=new Medico();
        medco.setId(Integer.parseInt(Id));
        medco.setNombre(Nombre);
        Paciente paciente;
        PacienteController pControl;
        pControl = new PacienteController();
        paciente=pControl.mostrarPaciente(Integer.parseInt(resExpediente.getText()));
        String activo = paciente.getActivo();
        consulta.setNombre(paciente);
        consulta.setMnombre(medco);
        
        ExpedienteController nuevoExp=new ExpedienteController();
        nuevoExp.AddExp(consulta);

        
    }//GEN-LAST:event_acceptBtnActionPerformed
     //Mostrar Medico en el combobox
    private void Obtenermedicos() {
            ArrayList listaMedico;
           MedicoController MedicoControl=new MedicoController();
           listaMedico=MedicoControl.ObtenerM();
           Medico medico=new Medico();
           int registros=listaMedico.size();
           comboMedico.removeAllItems();
           for (int i = 0; i < registros; i++) {
             comboMedico.addItem(MedicoControl.ObtenerM().get(i).getId()+"."+MedicoControl
             .ObtenerM().get(i).getNombre());
         }

     }           
    //llamar paciente para los datos del paciente
    void PacienteDatos(int mostrar) {
        PacienteController mostrarP=new PacienteController();
        Paciente paciente;
        paciente=mostrarP.mostrarPaciente(mostrar);
        
      resExpediente.setText(Integer.toString(paciente.getExpediente()));
      resNombre.setText(paciente.getNombre());
      resApellido.setText(paciente.getApellido());
      ResActivo.setText(paciente.getActivo());
      ResFechaLbl.setText(paciente.getFechaEntrada());
       
      ExpedienteController expmostrar=new ExpedienteController();
      expmostrar.MostrarEx(ExpedienteTable, mostrar);
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo ComboFecha;
    private javax.swing.JLabel Consultatitlelbl;
    private javax.swing.JTextArea DescripcionTxt;
    private javax.swing.JTable ExpedienteTable;
    private javax.swing.JLabel ResActivo;
    private javax.swing.JLabel ResFechaLbl;
    private javax.swing.JButton acceptBtn;
    private javax.swing.JLabel activoLbl;
    private javax.swing.JLabel apellidoLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox comboMedico;
    private javax.swing.JTextField consultaTxt;
    private javax.swing.JLabel descripcionLbl;
    private javax.swing.JLabel expedienteLbl;
    private javax.swing.JLabel fechaIngresoLbl;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JLabel fondolbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel medicoLbl;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JLabel resApellido;
    private javax.swing.JLabel resExpediente;
    private javax.swing.JLabel resNombre;
    // End of variables declaration//GEN-END:variables


    
    
}
