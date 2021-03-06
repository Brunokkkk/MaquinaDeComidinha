package maquinadecomida.tela;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import maquinadecomida.persistência.ProdutoDAO;
import maquinadecomida.persistência.ProdutoDTO;
import maquinadecomidas.Mensagens;
import maquinadecomidas.Validacao;

public class Produtos extends javax.swing.JFrame {

    private float dinheiroDepositado;
    private float produto;
    private final ProdutoDTO ProdutoDTO = new ProdutoDTO();
    private final ProdutoDAO produtoDAO = new ProdutoDAO();
    private ArrayList<ProdutoDTO> listaProdutos;
    private int posicaoX = 20;
    private int posicaoY = 50;
    int numeroDoLado;
    int quantidade = 0;

    public Produtos() throws SQLException {
        initComponents();

        listaProdutos = produtoDAO.montaListaProdutos();
        for (ProdutoDTO produto : listaProdutos) {
            numeroDoLado += 1;
            JLabel produtos = new JLabel();
            produtos.setText("00" + (numeroDoLado) + "- " + produto.getNomeProd() + " (R$) " + produto.getPrecoProd() + ("0"));
            produtos.setBounds(posicaoX, posicaoY, 230, 30);
            posicaoY += 30;
            this.getContentPane().add(produtos);
            if (produto.getCodProd() % 12 == 0) {
                posicaoX += 230;
                posicaoY = 50;

            }

        }
        campoCodigoProduto.setVisible(false);
        botaoComprarProduto.setVisible(false);
        Produto.setVisible(false);
        comprar.setVisible(false);
        campoCodigoProduto.setVisible(false);
        Troco.setVisible(false);
        campoTroco.setVisible(false);
        campoValorCompras.setVisible(false);
        botaoConfCompra.setVisible(false);
        campoValorCompras.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoConfCompra = new javax.swing.JButton();
        botaoVolta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comprar = new javax.swing.JLabel();
        campoValorCompras = new javax.swing.JTextField();
        campoDinheiroDepositado = new javax.swing.JTextField();
        produto001 = new javax.swing.JLabel();
        Produto = new javax.swing.JLabel();
        campoCodigoProduto = new javax.swing.JTextField();
        botaoComprarProduto = new javax.swing.JButton();
        Troco = new javax.swing.JLabel();
        campoTroco = new javax.swing.JTextField();
        botaoInserirDinheiro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/soda.png"))); // NOI18N
        jLabel1.setText("Bebidas(600mL)");

        jLabel2.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/chips.png"))); // NOI18N
        jLabel2.setText("Comidas  e");

        botaoConfCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/check-symbol.png"))); // NOI18N
        botaoConfCompra.setText("Confirmar");
        botaoConfCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfCompraActionPerformed(evt);
            }
        });

        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/reply-all-button.png"))); // NOI18N
        botaoVolta.setText("Voltar");
        botaoVolta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltaMouseClicked(evt);
            }
        });
        botaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor a inserir(R$):");

        comprar.setText("Compras(R$):");

        campoValorCompras.setToolTipText("Total gasto em reais na compra dos produtos.");
        campoValorCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorComprasActionPerformed(evt);
            }
        });

        campoDinheiroDepositado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        campoDinheiroDepositado.setToolTipText("Digite o valor a ser inserido na máquina.");
        campoDinheiroDepositado.setName(""); // NOI18N
        campoDinheiroDepositado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDinheiroDepositadoActionPerformed(evt);
            }
        });

        Produto.setText("Produto(Código)");

        campoCodigoProduto.setToolTipText("Digite o código do produto a ser comprado.");
        campoCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoProdutoActionPerformed(evt);
            }
        });

        botaoComprarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/shopping-cart.png"))); // NOI18N
        botaoComprarProduto.setText("Comprar");
        botaoComprarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarProdutoActionPerformed(evt);
            }
        });

        Troco.setText("Troco(R$):");

        campoTroco.setToolTipText("Troco da compra.");
        campoTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTrocoActionPerformed(evt);
            }
        });

        botaoInserirDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/banknote.png"))); // NOI18N
        botaoInserirDinheiro.setText("Inserir");
        botaoInserirDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirDinheiroActionPerformed(evt);
            }
        });

        jm.setFont(new java.awt.Font("C059", 1, 10)); // NOI18N
        jm.setText("Maior que R$2,00 e menor que R$500,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(488, 488, 488))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(produto001)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoVolta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoConfCompra))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Produto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoComprarProduto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comprar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoValorCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Troco)
                                .addGap(18, 18, 18)
                                .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDinheiroDepositado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoInserirDinheiro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jm)
                                .addGap(139, 139, 139)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(produto001)
                .addGap(371, 371, 371)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoDinheiroDepositado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserirDinheiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jm)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Produto)
                    .addComponent(campoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoComprarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar)
                    .addComponent(campoValorCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Troco)
                    .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfCompra)
                    .addComponent(botaoVolta))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        campoDinheiroDepositado.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoValorComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorComprasActionPerformed


    }//GEN-LAST:event_campoValorComprasActionPerformed

    private void campoTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTrocoActionPerformed


    }//GEN-LAST:event_campoTrocoActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        if (Mensagens.msgConf("Gostaria de sair da tela de compra.")) {
            Principal telaPrincipal = new Principal();
            this.dispose();
            telaPrincipal.setLocationRelativeTo(null);
            telaPrincipal.setVisible(true);
        }
    }//GEN-LAST:event_botaoVoltaActionPerformed

    private void botaoInserirDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirDinheiroActionPerformed

        if (Validacao.validaPreco(campoDinheiroDepositado)) {
            dinheiroDepositado = Integer.valueOf(campoDinheiroDepositado.getText().trim());
            if (dinheiroDepositado > 500) {
                Mensagens.msgAviso("Limite de valor depositado excedido.");
                campoDinheiroDepositado.setText("");
            } else {
                botaoComprarProduto.setVisible(true);
                campoCodigoProduto.setVisible(true);
                Produto.setVisible(true);
                comprar.setVisible(true);
                campoCodigoProduto.setVisible(true);
                Troco.setVisible(true);
                campoTroco.setVisible(true);
                campoValorCompras.setVisible(true);
                campoDinheiroDepositado.setEnabled(false);
                jm.setVisible(false);
                botaoConfCompra.setVisible(true);
                String stringTroco = Float.toString(dinheiroDepositado - produto);
                campoTroco.setText(stringTroco + "0");
                campoTroco.setEnabled(false);
            }
        } else {
            campoDinheiroDepositado.setText("");
        }

    }//GEN-LAST:event_botaoInserirDinheiroActionPerformed

    private void botaoVoltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltaMouseClicked
        Principal pr = new Principal();
        pr.setVisible(false);
    }//GEN-LAST:event_botaoVoltaMouseClicked

    private void botaoConfCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfCompraActionPerformed
        if (Mensagens.msgConf("Gostaria de encerrar a compra.")) {
            Principal pr = new Principal();
            pr.setVisible(true);
            pr.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_botaoConfCompraActionPerformed

    private void campoDinheiroDepositadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDinheiroDepositadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDinheiroDepositadoActionPerformed

    private void botaoComprarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarProdutoActionPerformed
        float produtoTemporario = 1;

        try {
            listaProdutos = produtoDAO.montaListaProdutos();
            if (campoCodigoProduto.getText().isEmpty()) {
                Mensagens.msgAviso("Nenhum código informado.");
            } else {
                int QtProduto = Integer.valueOf(campoCodigoProduto.getText().trim());
                if (QtProduto > 30 || QtProduto < 1) {
                    Mensagens.msgAviso("Código excedendo os limites.");
                } else {
                    for (ProdutoDTO listaProduto : listaProdutos) {
                        if (listaProduto.getCodProd() == Integer.valueOf(campoCodigoProduto.getText())) {
                            produtoTemporario = listaProduto.getPrecoProd() + produto;
                            quantidade = listaProduto.getQtdProd();
                        }
                    }
                    if (quantidade > 0) {
                        if (Float.valueOf(campoDinheiroDepositado.getText()) < produtoTemporario) {
                            Mensagens.msgErro("Valor menor que o valor que desejas comprar");
                        } else {
                            produtoDAO.deletaProd(Integer.valueOf(campoCodigoProduto.getText()));
                            produto = produto + (produtoTemporario - produto);
                            campoValorCompras.setText(Float.toString(produto) + "0");
                            String stringTroco = Float.toString(dinheiroDepositado - produto);
                            campoTroco.setEnabled(false);
                            campoTroco.setText(stringTroco);
                            produtoTemporario = 0;
                            quantidade = quantidade - 1;
                            campoCodigoProduto.setText("");
                        }
                    } else {
                        Mensagens.msgErro("Não foi possivel executar a compra pois o produto acabou no estoque.");
                        campoCodigoProduto.setText("");
                    }
                }
            }
        } catch (Exception e) {
            Mensagens.msgAviso("Código informado invalido");
        }
    }//GEN-LAST:event_botaoComprarProdutoActionPerformed

    private void campoCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Produto;
    private javax.swing.JLabel Troco;
    private javax.swing.JButton botaoComprarProduto;
    private javax.swing.JButton botaoConfCompra;
    private javax.swing.JButton botaoInserirDinheiro;
    private javax.swing.JButton botaoVolta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoCodigoProduto;
    private javax.swing.JTextField campoDinheiroDepositado;
    private javax.swing.JTextField campoTroco;
    private javax.swing.JTextField campoValorCompras;
    private javax.swing.JLabel comprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jm;
    private javax.swing.JLabel produto001;
    // End of variables declaration//GEN-END:variables
}
