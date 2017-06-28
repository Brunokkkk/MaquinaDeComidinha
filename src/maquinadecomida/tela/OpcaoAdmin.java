/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecomida.tela;

/**
 *
 * @author informatica
 */
public class OpcaoAdmin extends javax.swing.JFrame {

    /**
     * Creates new form OpcaoAdmin
     */
    public OpcaoAdmin() {
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

        botaoLoginAdm = new javax.swing.JButton();
        botaoCadastroAdm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoVolta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoLoginAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/create-new-pencil-button.png"))); // NOI18N
        botaoLoginAdm.setText("Alterar Produtos");
        botaoLoginAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginAdmActionPerformed(evt);
            }
        });

        botaoCadastroAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/create-group-button.png"))); // NOI18N
        botaoCadastroAdm.setText("Cadastrar Administrador");
        botaoCadastroAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroAdmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Opções do Administrador");

        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/reply-all-button.png"))); // NOI18N
        botaoVolta.setText("Voltar");
        botaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botaoCadastroAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVolta)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botaoLoginAdm))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botaoLoginAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCadastroAdm)
                .addGap(30, 30, 30)
                .addComponent(botaoVolta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLoginAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginAdmActionPerformed
        // TODO add your handling code here:
        AtualizarMaq at = new AtualizarMaq();
        at.setVisible(true);
    }//GEN-LAST:event_botaoLoginAdmActionPerformed

    private void botaoCadastroAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroAdmActionPerformed
        // TODO add your handling code here:
        cadastroAdm ca = new cadastroAdm();
        ca.setVisible(true);
    }//GEN-LAST:event_botaoCadastroAdmActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        // TODO add your handling code here:
        Principal pr = new Principal();
        pr.setVisible(true);
    }//GEN-LAST:event_botaoVoltaActionPerformed

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
            java.util.logging.Logger.getLogger(OpcaoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcaoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcaoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcaoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcaoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastroAdm;
    private javax.swing.JButton botaoLoginAdm;
    private javax.swing.JButton botaoVolta;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
