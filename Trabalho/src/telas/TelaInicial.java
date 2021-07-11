/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controller.CSimulacao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.observador.NovaSimulacaoObservador;


/**
 *
 * @author Brenda Paetzoldt e Robson de Jesus
 */
public class TelaInicial extends javax.swing.JFrame implements NovaSimulacaoObservador {

    CSimulacao controlMap;
    Simulacao simulacao;

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
        controlMap = CSimulacao.getIntance();
        controlMap.attachMap(this);
        buttonGroup.add(jRadio_semafaro);
        buttonGroup.add(jRadio_monitores);
        jRadio_semafaro.setSelected(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jb_mapa1 = new javax.swing.JButton();
        jb_mapa3 = new javax.swing.JButton();
        jb_mapa2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadio_semafaro = new javax.swing.JRadioButton();
        jRadio_monitores = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jb_mapa1.setBackground(new java.awt.Color(255, 255, 255));
        jb_mapa1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb_mapa1.setForeground(new java.awt.Color(102, 102, 102));
        jb_mapa1.setText("Mapa 1");
        jb_mapa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mapa1ActionPerformed(evt);
            }
        });

        jb_mapa3.setBackground(new java.awt.Color(255, 255, 255));
        jb_mapa3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb_mapa3.setForeground(new java.awt.Color(102, 102, 102));
        jb_mapa3.setText("Mapa 3");
        jb_mapa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mapa3ActionPerformed(evt);
            }
        });

        jb_mapa2.setBackground(new java.awt.Color(255, 255, 255));
        jb_mapa2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jb_mapa2.setForeground(new java.awt.Color(102, 102, 102));
        jb_mapa2.setText("Mapa 2");
        jb_mapa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mapa2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jRadio_semafaro.setBackground(new java.awt.Color(102, 102, 102));
        jRadio_semafaro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadio_semafaro.setForeground(new java.awt.Color(255, 255, 255));
        jRadio_semafaro.setText("Semáfaro");
        jRadio_semafaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_semafaroActionPerformed(evt);
            }
        });

        jRadio_monitores.setBackground(new java.awt.Color(102, 102, 102));
        jRadio_monitores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadio_monitores.setForeground(new java.awt.Color(255, 255, 255));
        jRadio_monitores.setText("Monitor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jRadio_semafaro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadio_monitores)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadio_semafaro)
                    .addComponent(jRadio_monitores))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jb_mapa3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(jb_mapa2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(jb_mapa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_mapa1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_mapa2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_mapa3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_mapa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mapa1ActionPerformed
        try {
            controlMap.escolherMapa(1, jRadio_semafaro.isSelected());
        } catch (IOException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jb_mapa1ActionPerformed

    private void jb_mapa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mapa3ActionPerformed

        try {
            controlMap.escolherMapa(3, jRadio_semafaro.isSelected());
        } catch (IOException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
     }//GEN-LAST:event_jb_mapa3ActionPerformed

    private void jb_mapa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mapa2ActionPerformed

        try {
            controlMap.escolherMapa(2, jRadio_semafaro.isSelected());
        } catch (IOException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
     }//GEN-LAST:event_jb_mapa2ActionPerformed

    private void jRadio_semafaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_semafaroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadio_semafaroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadio_monitores;
    private javax.swing.JRadioButton jRadio_semafaro;
    private javax.swing.JButton jb_mapa1;
    private javax.swing.JButton jb_mapa2;
    private javax.swing.JButton jb_mapa3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void escolheMapa() {
        simulacao = Simulacao.getIntance();
        simulacao.setVisible(true);
        this.dispose();
    }
}
