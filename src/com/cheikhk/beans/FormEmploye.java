/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheikhk.beans;

import com.cheikh.database.beans.ManageDB;
import com.mbengue.beans.Employe;
import com.mbengue.beans.Employer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tidia
 */
public class FormEmploye extends javax.swing.JFrame {
    Float heur_Comm;
    Float heur_Golf;

    /**
     * Creates new form FormEmploye
     */
    public FormEmploye() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PrenomText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NomText = new javax.swing.JTextField();
        heurTravail = new javax.swing.JTextField();
        thText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ButtonAjouter = new javax.swing.JButton();
        typeText = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        heureText = new javax.swing.JTextField();
        sal_baseText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Formulaire d'ajout d'employer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, 45));

        jLabel2.setText("Prénom");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 158, 35));
        jPanel1.add(PrenomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 440, 35));

        jLabel3.setText("Nom");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 117, 38));

        jLabel4.setText("nombre d'heure de tavail");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 186, 36));

        jLabel5.setText("taux horaire");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 126, 32));
        jPanel1.add(NomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 440, 38));
        jPanel1.add(heurTravail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 440, 36));
        jPanel1.add(thText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 440, 40));

        jLabel7.setText("type d'empoyer");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 126, 35));

        ButtonAjouter.setText("Ajouter");
        ButtonAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAjouterMouseClicked(evt);
            }
        });
        ButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAjouterActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 430, 50));

        typeText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Ingénieur" }));
        typeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTextActionPerformed(evt);
            }
        });
        jPanel1.add(typeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 440, 49));

        jLabel8.setText("heure en dehors du travail");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 200, 55));

        heureText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heureTextActionPerformed(evt);
            }
        });
        jPanel1.add(heureText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 440, 47));

        sal_baseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sal_baseTextActionPerformed(evt);
            }
        });
        jPanel1.add(sal_baseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 440, 47));

        jLabel9.setText("Salaire de base");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 200, 55));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_typeTextActionPerformed

    private void ButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAjouterActionPerformed
               // TODO add your handling code here:
      
        
    }//GEN-LAST:event_ButtonAjouterActionPerformed

    private void heureTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heureTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heureTextActionPerformed

    private void sal_baseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sal_baseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sal_baseTextActionPerformed

    private void ButtonAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAjouterMouseClicked
           ManageDB manager=new ManageDB();
            Connection conn=manager.ConnectionDB();
            if(typeText.getSelectedItem().toString().equals("Ingénieur")){
                heur_Comm=Float.parseFloat(heureText.getText());
                int valDefaut=0;
                heur_Golf=(float)valDefaut;
            }else{
                int valDefaut=0;
               heur_Comm=(float)valDefaut;
               heur_Golf=Float.parseFloat(heureText.getText());
            }
            Float ht=Float.parseFloat(heurTravail.getText());
            Float th=Float.parseFloat(thText.getText());
            Employer empl=new Employer(PrenomText.getText(), NomText.getText(), Float.parseFloat(sal_baseText.getText().toString()),Float.parseFloat( heurTravail.getText().toString()),Float.parseFloat(thText.getText().toString()), heur_Golf, heur_Comm);
            empl.payeHebdo();
            String sql = "insert into employe (prenom, nom, taux_horaire, nombre_heure, type_employe, heure_communication, heure_golf,salaire_base,Salaire) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,empl.getNom());
            ps.setString(2, empl.getPrenom());
            ps.setFloat(3, empl.getTaux_horaire());
            ps.setFloat(4, empl.getNb_heur());
            ps.setString(5, typeText.getSelectedItem().toString());
            ps.setFloat(6, empl.getHeur_Comm());
            ps.setFloat(7, empl.getHeur_Golf());
            ps.setFloat(8, empl.getSal_base());
            ps.setFloat(9, empl.getSalaire());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Enregistrement réussi");
        
        } catch (SQLException ex) {
            Logger.getLogger(FormEmploye.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonAjouterMouseClicked

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
            java.util.logging.Logger.getLogger(FormEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEmploye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAjouter;
    private javax.swing.JTextField NomText;
    private javax.swing.JTextField PrenomText;
    private javax.swing.JTextField heurTravail;
    private javax.swing.JTextField heureText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sal_baseText;
    private javax.swing.JTextField thText;
    private javax.swing.JComboBox<String> typeText;
    // End of variables declaration//GEN-END:variables
}
