/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcenaria.tela.material;

import marcenaria.dado.ModuloConector;
import marcenaria.dado.Table;
import marcenaria.material.Chapa;
import marcenaria.pessoa.Layout;
import marcenaria.tela.pessoa.Control;

/**
 * 02/07/2017
 *
 * @author Carlos Eduardo dos Santos Figueiredo
 */
public class TelaChapa extends javax.swing.JInternalFrame {

    /**
     * Creates new form Chapa
     */
    public TelaChapa() {
       if(Table.VerificarNaoExistirTabela(Chapa.getTABELA())){
           Chapa.criadaChapa();
       }
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

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChapa = new javax.swing.JTable();
        lblFornecedor = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        lblComprimento = new javax.swing.JLabel();
        txtComprimento = new javax.swing.JTextField();
        txtLagura = new javax.swing.JTextField();
        lblLargura = new javax.swing.JLabel();
        txtEspessura = new javax.swing.JTextField();
        lblEspessura = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnADD = new javax.swing.JButton();
        btnDELETE = new javax.swing.JButton();
        btnEDIT = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();

        jButton3.setText("ADD");

        setMaximumSize(Layout.getMaximo());
        setMinimumSize(Layout.getMaximo()
        );
        setPreferredSize(Layout.getMaximo()
        );

        tbChapa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Produto", "Comprimento", "Largura", "Espessura", "Quantidade", "Preço unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbChapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChapaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbChapaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbChapa);

        lblFornecedor.setText("Fornecedor:");

        txtFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFornecedorMousePressed(evt);
            }
        });

        lblProduto.setText("Produto: ");

        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        lblComprimento.setText("Comprimento: ");

        txtComprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComprimentoActionPerformed(evt);
            }
        });

        txtLagura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLaguraActionPerformed(evt);
            }
        });

        lblLargura.setText("Largura: ");

        txtEspessura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspessuraActionPerformed(evt);
            }
        });

        lblEspessura.setText("Espessura: ");

        lblPreco.setText("Preço: ");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        btnADD.setText("ADD");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnDELETE.setText("DELE");

        btnEDIT.setText("EDIT");

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        lblQuantidade.setText("Quantidade: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduto)
                            .addComponent(lblComprimento)
                            .addComponent(lblLargura)
                            .addComponent(lblEspessura)
                            .addComponent(lblPreco)
                            .addComponent(lblQuantidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComprimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLagura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEspessura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnADD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEDIT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDELETE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedor)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComprimento)
                    .addComponent(txtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLargura)
                    .addComponent(txtLagura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspessura)
                    .addComponent(txtEspessura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADD)
                    .addComponent(btnEDIT)
                    .addComponent(btnDELETE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtComprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComprimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComprimentoActionPerformed

    private void txtLaguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaguraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLaguraActionPerformed

    private void txtEspessuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspessuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspessuraActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void tbChapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChapaMouseClicked
        Control.SetarCampo(txtQuantidade, txtProduto, txtComprimento, txtLagura, txtEspessura, txtPreco, tbChapa);
    }//GEN-LAST:event_tbChapaMouseClicked

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed

Chapa.adicionarChapa(Control.deJTextparaInt(txtProduto), Control.deJTextparaDouble(txtComprimento), Control.deJTextparaDouble(txtLagura), Control.deJTextparaDouble(txtEspessura), Control.deJTextparaDouble(txtPreco), txtProduto.getText(),txtFornecedor.getText());

    }//GEN-LAST:event_btnADDActionPerformed

    private void tbChapaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChapaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbChapaMouseReleased

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtFornecedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFornecedorMousePressed
        
    }//GEN-LAST:event_txtFornecedorMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnEDIT;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComprimento;
    private javax.swing.JLabel lblEspessura;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblLargura;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTable tbChapa;
    private javax.swing.JTextField txtComprimento;
    private javax.swing.JTextField txtEspessura;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtLagura;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
