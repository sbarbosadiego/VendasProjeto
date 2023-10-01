/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Diego Barbosa da Silva
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
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

        uJPanelImagem1 = new componentes.UJPanelImagem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmOpcoes = new javax.swing.JMenu();
        jmSair = new javax.swing.JMenuItem();
        jmCadastro = new javax.swing.JMenu();
        jmClientes = new javax.swing.JMenuItem();
        jmProdutos = new javax.swing.JMenuItem();
        jmUsuarios = new javax.swing.JMenuItem();
        jmVenda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmRelatorio = new javax.swing.JMenu();
        jmSobre = new javax.swing.JMenu();
        jmProjeto = new javax.swing.JMenuItem();

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema - Projeto Vendas");
        setMinimumSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        jmOpcoes.setText("Opções");
        jmOpcoes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jmSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jmSair.setText("Sair");
        jmSair.setToolTipText("");
        jmSair.setName(""); // NOI18N
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jmOpcoes.add(jmSair);

        jMenuBar1.add(jmOpcoes);

        jmCadastro.setText("Cadastro");
        jmCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmCadastro.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jmClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jmClientes.setText("Clientes");
        jmClientes.setHideActionText(true);
        jmClientes.setName(""); // NOI18N
        jmClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClientesActionPerformed(evt);
            }
        });
        jmCadastro.add(jmClientes);

        jmProdutos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jmProdutos.setText("Produtos");
        jmProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdutosActionPerformed(evt);
            }
        });
        jmCadastro.add(jmProdutos);

        jmUsuarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jmUsuarios.setText("Usuários");
        jmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosActionPerformed(evt);
            }
        });
        jmCadastro.add(jmUsuarios);

        jMenuBar1.add(jmCadastro);

        jmVenda.setText("Venda");
        jmVenda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Fira Sans", 0, 14)); // NOI18N
        jMenuItem1.setText("Pré-Venda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmVenda.add(jMenuItem1);

        jMenuBar1.add(jmVenda);

        jmRelatorio.setText("Relatório");
        jmRelatorio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuBar1.add(jmRelatorio);

        jmSobre.setText("Sobre");
        jmSobre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jmProjeto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jmProjeto.setText("Projeto");
        jmProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmProjetoMouseClicked(evt);
            }
        });
        jmProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProjetoActionPerformed(evt);
            }
        });
        jmSobre.add(jmProjeto);

        jMenuBar1.add(jmSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSairActionPerformed

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        new ViewCliente().setVisible(true);
    }//GEN-LAST:event_jmClientesActionPerformed

    private void jmProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmProjetoMouseClicked

    }//GEN-LAST:event_jmProjetoMouseClicked

    private void jmProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProjetoActionPerformed
        try {
            URI link = new URI("https://github.com/sbarbosadiego/VendasProjeto");
            Desktop.getDesktop().browse(link);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmProjetoActionPerformed

    private void jmProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdutosActionPerformed
        new ViewProduto().setVisible(true);
    }//GEN-LAST:event_jmProdutosActionPerformed

    private void jmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosActionPerformed
        new ViewUsuario().setVisible(true);
    }//GEN-LAST:event_jmUsuariosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new ViewPreVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenu jmOpcoes;
    private javax.swing.JMenuItem jmProdutos;
    private javax.swing.JMenuItem jmProjeto;
    private javax.swing.JMenu jmRelatorio;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuItem jmUsuarios;
    private javax.swing.JMenu jmVenda;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
