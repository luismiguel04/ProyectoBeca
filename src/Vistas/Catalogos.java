/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;
import Metodos.Mprograma;
import Metodos.Mservicio;
import Clases.Programa;
import Clases.Servicio;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Mayra Garrido
 */
public class Catalogos extends javax.swing.JPanel {

    /**
     * Creates new form Catalogos
     */
    
    Mprograma pro = new Mprograma();
    Programa prog ;
    Mservicio ser = new Mservicio();
    Servicio servi;
    public Catalogos() {
        initComponents();
        pro.consulta(JCBprograma);
        ser.consulta(JCBservicio);
        JTnombre.enable(false);
        JTlugar.enable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JBnuevo = new javax.swing.JButton();
        JCBprograma = new javax.swing.JComboBox<>();
        JBeditar = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTnombre = new javax.swing.JTextField();
        JTid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        JCBservicio = new javax.swing.JComboBox<>();
        JBnuevolugar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JTlugar = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JBeditarlugar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Catalogos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Programas de becas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 24))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBnuevo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JBnuevo.setText("Nuevo");
        JBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(JBnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        JCBprograma.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JCBprograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBprogramaActionPerformed(evt);
            }
        });
        jPanel2.add(JCBprograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 430, -1));

        JBeditar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JBeditar.setText("Editar");
        JBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeditarActionPerformed(evt);
            }
        });
        jPanel2.add(JBeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        JBguardar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JBguardar.setText("Guardar");
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });
        jPanel2.add(JBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 120, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del programa de becas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        JTnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTnombreActionPerformed(evt);
            }
        });
        jPanel2.add(JTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 530, -1));
        jPanel2.add(JTid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("ID :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setText("Guardar Cambios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 580, 650));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lugares de servicio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JCBservicio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JCBservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBservicioActionPerformed(evt);
            }
        });
        jPanel3.add(JCBservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 380, -1));

        JBnuevolugar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JBnuevolugar.setText("Nuevo Lugar");
        JBnuevolugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevolugarActionPerformed(evt);
            }
        });
        jPanel3.add(JBnuevolugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("ID del Lugar:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        JTlugar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(JTlugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 500, -1));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Lugar donde se realiza el servicio");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        JBeditarlugar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JBeditarlugar.setText("Editar Lugar");
        JBeditarlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeditarlugarActionPerformed(evt);
            }
        });
        jPanel3.add(JBeditarlugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        jButton2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jButton3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton3.setText("Guardar Cambios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 46, 560, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        // TODO add your handling code here:
        String Nombre = JTnombre.getText();
       this.agregar(Nombre);
     
         pro.consulta(JCBprograma);
         JTnombre.setText("Selecione una opci??n");
         JTnombre.enable(false);
         
    }//GEN-LAST:event_JBguardarActionPerformed

    private void JTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTnombreActionPerformed

    private void JBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevoActionPerformed
        // TODO add your handling code here:
        JTnombre.enable(true);
        JTnombre.setText("");
        JTnombre.requestFocus();
    }//GEN-LAST:event_JBnuevoActionPerformed

    private void JCBprogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBprogramaActionPerformed
        // TODO add your handling code here:
        String progr = JCBprograma.getSelectedItem().toString();
        JTnombre.setText(progr);
        
        
        JTnombre.enable(false);
        
    }//GEN-LAST:event_JCBprogramaActionPerformed

    private void JBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeditarActionPerformed
        // TODO add your handling code here:
        JTnombre.enable(true);
        JTnombre.requestFocus();
    }//GEN-LAST:event_JBeditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBnuevolugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevolugarActionPerformed
        // TODO add your handling code here:
         JTlugar.enable(true);
        JTlugar.setText("");
        JTlugar.requestFocus();
    }//GEN-LAST:event_JBnuevolugarActionPerformed

    private void JCBservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBservicioActionPerformed
        // TODO add your handling code here:
         String servi= JCBservicio.getSelectedItem().toString();
         JTlugar.setText(servi);
         JTlugar.enable(false);
    }//GEN-LAST:event_JCBservicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Nombre = JTlugar.getText();
     
        Mservicio ser = new Mservicio();
        servi = new Servicio();
        servi.setNombre(Nombre);
        ser.insertar(servi);
        ser.consulta(JCBservicio);
         JTlugar.setText("Selecione una opci??n");
         JTlugar.enable(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JBeditarlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeditarlugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBeditarlugarActionPerformed
 public void agregar(String nombre){
        Mprograma pro = new Mprograma();
        prog = new Programa();
        prog.setNombre(nombre);
        pro.insertar(prog);
       
    }
     public void modificar(String nombre, int id){
        Mprograma pro = new  Mprograma();
        prog = new Programa();
        
        prog.setId_programa(id);
        prog.setNombre(nombre);
       
        
        pro.Modificar(prog);
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBeditar;
    private javax.swing.JButton JBeditarlugar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBnuevo;
    private javax.swing.JButton JBnuevolugar;
    private javax.swing.JComboBox<String> JCBprograma;
    private javax.swing.JComboBox<String> JCBservicio;
    private javax.swing.JTextField JTid;
    private javax.swing.JTextField JTlugar;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
