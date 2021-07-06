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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxt_qtdVeliculos = new javax.swing.JTextField();
        jPanel_mapa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jB_simular = new javax.swing.JButton();
        jB_finalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Digite a quatidade máxima veículos deseja mostrar:");

        jtxt_qtdVeliculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_qtdVeliculosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel_mapaLayout = new javax.swing.GroupLayout(jPanel_mapa);
        jPanel_mapa.setLayout(jPanel_mapaLayout);
        jPanel_mapaLayout.setHorizontalGroup(
            jPanel_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_mapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel_mapaLayout.setVerticalGroup(
            jPanel_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        jB_simular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jB_simular.setText("Simular");
        jB_simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_simularActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_simular, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_qtdVeliculos, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jB_finalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_qtdVeliculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jB_simular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_mapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_qtdVeliculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_qtdVeliculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_qtdVeliculosActionPerformed

    private void jB_simularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_simularActionPerformed
        controleMapa.iniciar();
        int qtdCarros = 1;
        controleMapa.definirCarros(qtdCarros);
        
    }//GEN-LAST:event_jB_simularActionPerformed

    private void jB_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_finalizarActionPerformed
        controleMapa.parar();
    }//GEN-LAST:event_jB_finalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_finalizar;
    private javax.swing.JButton jB_simular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel_mapa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxt_qtdVeliculos;
    // End of variables declaration//GEN-END:variables

    JLabel imageLabel = new JLabel();
    private ImageIcon quarteirao = new ImageIcon("./quarteiroes/1.png");

    @Override
    public void definirQuatCarros(int value) {
        jtxt_qtdVeliculos.setText("" + value);

    }

    @Override
    public void definirQuatCarrosErro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jTable1.setRowHeight(40);
        jTable1.setModel(modeloTab);
        jTable1.setOpaque(false);
        jTable1.setDefaultRenderer(Object.class, new ImagemMapa());
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setPreferredSize(new Dimension(0, 0));
        for (int i = 0; i < jTable1.getColumnModel().getColumnCount(); i++) {
            TableColumn column = jTable1.getColumnModel().getColumn(i);
            column.setHeaderRenderer(renderer);
            column.setPreferredWidth(40);
        }

        jTable1.setIntercellSpacing(new Dimension(0, 0));

    }

    public ImageIcon paint(int fila, int coluna, int matriz[][]) {
        if (matriz[fila][coluna] == 0) {
            return quarteirao;
        } else {
            return controleMapa.estrada(fila, coluna);
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

    @Override
    public void velocidadeInvalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
