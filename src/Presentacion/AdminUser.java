/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Encapsulamiento.Usuario;


/**
 *
 * @author jmcito
 */
public class AdminUser extends javax.swing.JFrame {

    /**
     * Creates new form AdminUser
     */
    public AdminUser() {
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

        desktopPane = new javax.swing.JDesktopPane();
        titleLbl = new javax.swing.JLabel();
        medlabl = new javax.swing.JLabel();
        expedienteLbl = new javax.swing.JLabel();
        UserLbl = new javax.swing.JLabel();
        AddPacbtn = new javax.swing.JButton();
        listPacBtn = new javax.swing.JButton();
        Medbtn = new javax.swing.JButton();
        PerfilBtn = new javax.swing.JButton();
        addPaclbl = new javax.swing.JLabel();
        Controllbl = new javax.swing.JLabel();
        medicosLbl = new javax.swing.JLabel();
        perfilLbl = new javax.swing.JLabel();
        AddMedico = new javax.swing.JButton();
        ListMLbl = new javax.swing.JLabel();
        bienvenidoLbl = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Expedientes");

        desktopPane.setBackground(new java.awt.Color(90, 135, 146));
        desktopPane.setForeground(new java.awt.Color(69, 128, 124));

        titleLbl.setForeground(new java.awt.Color(245, 243, 243));
        titleLbl.setText("Administrador de Expedientes");
        desktopPane.add(titleLbl);
        titleLbl.setBounds(350, 10, 220, 20);

        medlabl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/meds.png"))); // NOI18N
        desktopPane.add(medlabl);
        medlabl.setBounds(410, 70, 50, 50);

        expedienteLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconmonstr-user-14-icon-48.png"))); // NOI18N
        desktopPane.add(expedienteLbl);
        expedienteLbl.setBounds(60, 70, 48, 60);

        UserLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/perfil2.png"))); // NOI18N
        desktopPane.add(UserLbl);
        UserLbl.setBounds(720, 70, 50, 50);

        AddPacbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/exportar.png"))); // NOI18N
        AddPacbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPacbtnActionPerformed(evt);
            }
        });
        desktopPane.add(AddPacbtn);
        AddPacbtn.setBounds(50, 140, 60, 60);

        listPacBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/List.png"))); // NOI18N
        listPacBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPacBtnActionPerformed(evt);
            }
        });
        desktopPane.add(listPacBtn);
        listPacBtn.setBounds(50, 210, 60, 60);

        Medbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Medadd.png"))); // NOI18N
        Medbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedbtnActionPerformed(evt);
            }
        });
        desktopPane.add(Medbtn);
        Medbtn.setBounds(400, 140, 60, 60);

        PerfilBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/perfil.png"))); // NOI18N
        PerfilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilBtnActionPerformed(evt);
            }
        });
        desktopPane.add(PerfilBtn);
        PerfilBtn.setBounds(710, 140, 60, 60);

        addPaclbl.setForeground(new java.awt.Color(245, 243, 243));
        addPaclbl.setText("Agregar Paciente");
        desktopPane.add(addPaclbl);
        addPaclbl.setBounds(140, 170, 130, 17);

        Controllbl.setForeground(new java.awt.Color(245, 243, 243));
        Controllbl.setText("Control de Pacientes");
        desktopPane.add(Controllbl);
        Controllbl.setBounds(140, 230, 150, 17);

        medicosLbl.setForeground(new java.awt.Color(245, 243, 243));
        medicosLbl.setText("Agregar Medicos");
        desktopPane.add(medicosLbl);
        medicosLbl.setBounds(500, 160, 130, 17);

        perfilLbl.setForeground(new java.awt.Color(245, 243, 243));
        perfilLbl.setText("Perfil");
        desktopPane.add(perfilLbl);
        perfilLbl.setBounds(800, 160, 37, 17);

        AddMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MedList.png"))); // NOI18N
        AddMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMedicoActionPerformed(evt);
            }
        });
        desktopPane.add(AddMedico);
        AddMedico.setBounds(400, 210, 60, 60);

        ListMLbl.setForeground(new java.awt.Color(245, 243, 243));
        ListMLbl.setText("Lista de Medicos");
        desktopPane.add(ListMLbl);
        ListMLbl.setBounds(500, 230, 130, 17);

        bienvenidoLbl.setText("jLabel1");
        desktopPane.add(bienvenidoLbl);
        bienvenidoLbl.setBounds(630, 30, 250, 17);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void AddPacbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPacbtnActionPerformed
        AddExpedienteIF nuevoPaciente=new AddExpedienteIF();
        desktopPane.add(nuevoPaciente);
        nuevoPaciente.setVisible(true);
    }//GEN-LAST:event_AddPacbtnActionPerformed

    private void listPacBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPacBtnActionPerformed
        ListExpedienteIF listaPaciente=new ListExpedienteIF();
        desktopPane.add(listaPaciente);
        listaPaciente.setVisible(true);
    }//GEN-LAST:event_listPacBtnActionPerformed

    private void MedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedbtnActionPerformed
        MedicoAddIF medicos=new MedicoAddIF();
        desktopPane.add(medicos);
        medicos.setVisible(true);
    }//GEN-LAST:event_MedbtnActionPerformed

    private void PerfilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilBtnActionPerformed
        PerfilIF perfiles=new PerfilIF();
        
        desktopPane.add(perfiles);
        perfiles.setVisible(true);
    }//GEN-LAST:event_PerfilBtnActionPerformed

    public void UsuarioPrincipal(Usuario intro) {
        bienvenidoLbl.setText("Bienvenido "+ intro.getNombre());
        
    }
    
    private void AddMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMedicoActionPerformed
            MedicoListIF listMedico=new MedicoListIF();
            desktopPane.add(listMedico);
            listMedico.setVisible(true);
    }//GEN-LAST:event_AddMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMedico;
    private javax.swing.JButton AddPacbtn;
    private javax.swing.JLabel Controllbl;
    private javax.swing.JLabel ListMLbl;
    private javax.swing.JButton Medbtn;
    private javax.swing.JButton PerfilBtn;
    private javax.swing.JLabel UserLbl;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel addPaclbl;
    private javax.swing.JLabel bienvenidoLbl;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel expedienteLbl;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton listPacBtn;
    private javax.swing.JLabel medicosLbl;
    private javax.swing.JLabel medlabl;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JLabel perfilLbl;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables

    


}
