/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import controller.CMapa;
import controller.observador.MapaObservador;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Brenda Paetzoldt e Robson de Jesus
 */
public class Simulacao extends javax.swing.JFrame implements MapaObservador {

    private CMapa controleMapa;

    private static Simulacao instance = null;

    public static Simulacao getIntance() {
        if (instance == null) {
            instance = new Simulacao();
        }
        return instance;
    }

    /**
     * Creates new form Configurar_simulacao
     */
    public Simulacao() {
        initComponents();
        setLocationRelativeTo(null);
        controleMapa = CMapa.getIntance();
        controleMapa.anexarMapa(this);
        setResizable(false);
        controleMapa.carregarMapa();
        jB_finalizar.setEnabled(false);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_mapa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxt_qtdVeliculos = new javax.swing.JTextField();
        jB_simular = new javax.swing.JButton();
        jTable1 = new javax.swing.JTable();
        jB_finalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Digite a quatidade máxima veículos deseja mostrar:");

        jtxt_qtdVeliculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_qtdVeliculosActionPerformed(evt);
            }
        });

        jB_simular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jB_simular.setText("Simular");
        jB_simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_simularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_qtdVeliculos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addComponent(jB_simular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_qtdVeliculos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_simular, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_mapaLayout = new javax.swing.GroupLayout(jPanel_mapa);
        jPanel_mapa.setLayout(jPanel_mapaLayout);
        jPanel_mapaLayout.setHorizontalGroup(
            jPanel_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel_mapaLayout.setVerticalGroup(
            jPanel_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTable1.setBackground(java.awt.SystemColor.control);

        jB_finalizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jB_finalizar.setText("Finalizar simulação");
        jB_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jB_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_mapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jB_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_finalizarActionPerformed
        controleMapa.parar();
        jtxt_qtdVeliculos.setText("");

    }//GEN-LAST:event_jB_finalizarActionPerformed

    private void jB_simularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_simularActionPerformed

        if ((jtxt_qtdVeliculos.getText().isEmpty()) || !jtxt_qtdVeliculos.getText().matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(rootPane, "Digite algum número inteiro");
            jtxt_qtdVeliculos.setText("");
        } else {
            controleMapa.iniciar();
            controleMapa.definirCarros(Integer.parseInt(jtxt_qtdVeliculos.getText().toString()));
        }
    }//GEN-LAST:event_jB_simularActionPerformed

    private void jtxt_qtdVeliculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_qtdVeliculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_qtdVeliculosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_finalizar;
    private javax.swing.JButton jB_simular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_mapa;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxt_qtdVeliculos;
    // End of variables declaration//GEN-END:variables

    JLabel imageLabel = new JLabel();
    private ImageIcon quarteirao = new ImageIcon("./quarteiroes/1.png");

    @Override
    public void definirQuatCarros(int valor) {
        jtxt_qtdVeliculos.setText("" + valor);
    }

    @Override
    public void definirTabela(int[][] matriz, int filas, int colunas) {

        DefaultTableModel modeloTab = new DefaultTableModel() {

            @Override
            public int getRowCount() {
                return controleMapa.getFilas();
            }

            @Override
            public int getColumnCount() {
                return controleMapa.getColunas();
            }

            @Override
            public Object getValueAt(int Filai, int colunaI) {
                try {
                    return paint(Filai, colunaI, matriz);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                    return null;
                }
            }
        };

        modeloTab.setRowCount(filas);
        modeloTab.setColumnCount(colunas);
        jTable1.setRowHeight(30);
        jTable1.setModel(modeloTab);
        jTable1.setDefaultRenderer(Object.class, new ImagemMapa());
        jTable1.setIntercellSpacing(new Dimension(1, 1));

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setPreferredSize(new Dimension(30, 30));
        for (int i = 0; i < jTable1.getColumnModel().getColumnCount(); i++) {
            TableColumn column = jTable1.getColumnModel().getColumn(i);
            column.setHeaderRenderer(renderer);
            column.setPreferredWidth(20);
        }

    }

    public ImageIcon paint(int fila, int coluna, int matriz[][]) {
        if (matriz[fila][coluna] == 0) {
            return quarteirao;
        } else {
            return controleMapa.Estrada(fila, coluna);
        }

    }

    @Override
    public void redefinirPintar() {
        jTable1.repaint();
    }

    @Override
    public void definirBotao(boolean on) {
        if (on) {
            jB_simular.setEnabled(false);
            jB_finalizar.setEnabled(true);
        } else {
            jB_simular.setEnabled(true);
            jB_finalizar.setEnabled(false);

        }
    }

}
