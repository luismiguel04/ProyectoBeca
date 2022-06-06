/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;
import Metodos.Mprograma;
import Clases.Programa;
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
    public Catalogos() {
        initComponents();
        pro.consulta(JCBprograma,JTid);
        JTnombre.enable(false);
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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Programa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 24))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBnuevo.setText("Nuevo");
        JBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(JBnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        JCBprograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBprogramaActionPerformed(evt);
            }
        });
        jPanel2.add(JCBprograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 300, -1));

        JBeditar.setText("Editar");
        JBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeditarActionPerformed(evt);
            }
        });
        jPanel2.add(JBeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        JBguardar.setText("Guardar");
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });
        jPanel2.add(JBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, -1, -1));

        jLabel1.setText("Nombre del programa de becas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        JTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTnombreActionPerformed(evt);
            }
        });
        jPanel2.add(JTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 530, -1));
        jPanel2.add(JTid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, -1));

        jLabel3.setText("ID :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jButton1.setText("Guardar Cambios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 580, 650));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 46, 560, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        // TODO add your handling code here:
        String Nombre = JTnombre.getText();
       this.agregar(Nombre);
     
         pro.consulta(JCBprograma,JTid);
         JTnombre.setText("Selecione una opción");
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
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBnuevo;
    private javax.swing.JComboBox<String> JCBprograma;
    private javax.swing.JTextField JTid;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
