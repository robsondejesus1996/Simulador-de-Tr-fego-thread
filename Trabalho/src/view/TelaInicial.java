/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CJogo;
import observer.ObsJogo;

/**
 *
 * @author Brenda Paetzoldt e Robson de Jesus
 */
public class TelaInicial extends javax.swing.JFrame implements ObsJogo {

       private CJogo controlMap;

    private static TelaInicial instance = null;

    public static TelaInicial getIntance() {
        if (instance == null) {
            instance = new TelaInicial();
        }
        return instance;
    }

    /**
     * Creates new form Main
     */
    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jb_mapa1 = new javax.swing.JButton();
        jb_mapa3 = new javax.swing.JButton();
        jb_mapa2 = new javax.swing.JButton();
        jRadio_semafaro = new javax.swing.JRadioButton();
        jRadio_monitores = new javax.swing.JRadioButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb_mapa1.setBackground(new java.awt.Color(255, 255, 255));
        jb_mapa1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb_mapa1.setText("Mapa 1");
        jb_mapa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mapa1ActionPerformed(evt);
            }
        });

        jb_mapa3.setBackground(new java.awt.Color(255, 255, 255));
        jb_mapa3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb_mapa3.setText("Mapa 3");
        jb_mapa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mapa3ActionPerformed(evt);
            }
        });

        jb_mapa2.setBackground(new java.awt.Color(255, 255, 255));
        jb_mapa2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb_mapa2.setText("Mapa 2");
        jb_mapa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mapa2ActionPerformed(evt);
            }
        });

        jRadio_semafaro.setText("Semáfaro");
        jRadio_semafaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_semafaroActionPerformed(evt);
            }
        });

        jRadio_monitores.setText("Monitor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jb_mapa3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jRadio_semafaro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadio_monitores)
                .addGap(70, 70, 70))
            .addComponent(jb_mapa2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(jb_mapa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadio_monitores)
                    .addComponent(jRadio_semafaro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jb_mapa1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_mapa2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_mapa3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_mapa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mapa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_mapa1ActionPerformed

    private void jb_mapa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mapa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_mapa3ActionPerformed

    private void jb_mapa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mapa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_mapa2ActionPerformed

    private void jRadio_semafaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_semafaroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadio_semafaroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JRadioButton jRadio_monitores;
    private javax.swing.JRadioButton jRadio_semafaro;
    private javax.swing.JButton jb_mapa1;
    private javax.swing.JButton jb_mapa2;
    private javax.swing.JButton jb_mapa3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void escolheMapa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
