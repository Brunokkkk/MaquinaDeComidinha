/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecomida.tela;

import java.sql.SQLException;
import maquinadecomida.persistência.UsuarioDAO;
import maquinadecomida.persistência.UsuarioDTO;
import maquinadecomidas.Mensagens;

/**
 *
 * @author Windows
 */
public class cadastroAdm extends javax.swing.JFrame {

    private String novaSenha;
    private String novoNome;
    private static UsuarioDTO usuarioDTO = new UsuarioDTO();

    public cadastroAdm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoCadasNomeAdm = new javax.swing.JTextField();
        botaoCadastraAdm = new javax.swing.JButton();
        botaoVolta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoCadasSenhaAdm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoCadasNomeAdm.setToolTipText("Digite o nome do administrador a ser cadastrado.");

        botaoCadastraAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/check-symbol.png"))); // NOI18N
        botaoCadastraAdm.setText("Cadastrar");
        botaoCadastraAdm.setToolTipText("");
        botaoCadastraAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraAdmActionPerformed(evt);
            }
        });

        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/reply-all-button.png"))); // NOI18N
        botaoVolta.setText("Voltar");
        botaoVolta.setToolTipText("");
        botaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastrar novo administrador");

        jLabel1.setText("Nome admin:");

        jLabel2.setText("Senha admin:");

        campoCadasSenhaAdm.setToolTipText("Digite uma senha de acesso para o administrador..\t");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(campoCadasNomeAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoCadasSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoVolta)
                                .addGap(18, 18, 18)
                                .addComponent(botaoCadastraAdm)))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCadasNomeAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCadasSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastraAdm)
                    .addComponent(botaoVolta))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastraAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraAdmActionPerformed
        novoNome = campoCadasNomeAdm.getText().trim();
        novaSenha = String.valueOf(campoCadasSenhaAdm.getPassword()).trim();
        if (novoNome.isEmpty() || novaSenha.isEmpty()) {
            Mensagens.msgAviso("Verifique se todos os campos foram preenchidos corretamente.");
        } else {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            try {
                usuarioDAO.atualizaUsuario(novoNome, novaSenha);
                Mensagens.msgInfo("Dados cadastrados com sucesso.");
                OpcaoAdmin op = new OpcaoAdmin();
                op.setVisible(true);
                op.setLocationRelativeTo(null);
                this.dispose();
            } catch (SQLException ex) {
                Mensagens.msgErro("Não foi possivel concluir o cadastro. \n Deu erro no banco de dados.Por favor contate o suporte técnico da BLW");
                ex.printStackTrace();
                campoCadasNomeAdm.requestFocus();
            }
        }
    }//GEN-LAST:event_botaoCadastraAdmActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        OpcaoAdmin volta = new OpcaoAdmin();
        volta.setVisible(true);
        volta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botaoVoltaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastraAdm;
    private javax.swing.JButton botaoVolta;
    private javax.swing.JTextField campoCadasNomeAdm;
    private javax.swing.JPasswordField campoCadasSenhaAdm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
