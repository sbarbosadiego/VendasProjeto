/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelUsuarios;
import util.CampoDePesquisa;

/**
 * @author Diego Barbosa
 */
public class ViewUsuario extends javax.swing.JFrame {

    ArrayList<ModelUsuarios> listaModelUsuarios = new ArrayList<ModelUsuarios>();
    ControllerUsuarios controllerUsuarios = new ControllerUsuarios();
    ModelUsuarios modelUsuario = new ModelUsuarios();
    String editarSalvar;

    /**
     * Creates new form ViewUsuario
     */
    public ViewUsuario() {
        initComponents();
        this.listarUsuarios();
        this.habilitarDesabilitarCampos(false);
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
        jtfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableUsuarios = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jtfPesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jtfLogin = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");
        setLocation(new java.awt.Point(600, 150));

        jtfCodigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfCodigo.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Código:");

        jtfNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Login:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Senha:");

        jtableUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableUsuarios.setRowHeight(25);
        jScrollPane1.setViewportView(jtableUsuarios);
        if (jtableUsuarios.getColumnModel().getColumnCount() > 0) {
            jtableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(220);
            jtableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(220);
        }

        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(51, 0, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 153, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jtfPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Pesquisar:");

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jtfLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfNomeUsuario)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtfSenha))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(jtfNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfSenha)
                    .addComponent(jtfLogin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEditar)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

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

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtableUsuarios.getModel();
        final TableRowSorter<TableModel> classifica = new TableRowSorter<>(modelo);
        this.jtableUsuarios.setRowSorter(classifica);
        String pesquisa = this.jtfPesquisa.getText();
        if (CampoDePesquisa.testaString(pesquisa) == true) {
            classifica.setRowFilter(RowFilter.regexFilter(pesquisa, 0));
        } else {
            classifica.setRowFilter(RowFilter.regexFilter(pesquisa.toUpperCase(), 1));
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (editarSalvar.equals("salvar")) {
            this.salvarUsuario();
        } else if (editarSalvar.equals("editar")) {
            this.editarUsuario();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = jtableUsuarios.getSelectedRow();
        int codigoUsuario = (int) jtableUsuarios.getValueAt(linha, 0);
        if (JOptionPane.showConfirmDialog(this, "Excluir Usuario?", "Excluir",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (controllerUsuarios.excluirUsuarioController(codigoUsuario)) {
                JOptionPane.showMessageDialog(this, "Usuario excluído", "ATENÇÃO",
                        JOptionPane.WARNING_MESSAGE);
                this.listarUsuarios();
                this.limparCampos();
                this.habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro de exclusão", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarDesabilitarCampos(true);
        editarSalvar = "salvar";
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarSalvar = "editar";
        int linha = this.jtableUsuarios.getSelectedRow();
        this.habilitarDesabilitarCampos(true);
        try {
            int codigoUsuario = (int) this.jtableUsuarios.getValueAt(linha, 0);
            // Recupera as informações do Usuario no banco de dados
            modelUsuario = controllerUsuarios.retornarUsuarioController(codigoUsuario);
            // Seta os dados recuperados no banco nos campos
            this.jtfCodigo.setText(String.valueOf(modelUsuario.getIdUsuario()));
            this.jtfNomeUsuario.setText(modelUsuario.getUsuarioNome());
            this.jtfLogin.setText(String.valueOf(modelUsuario.getUsuarioLogin()));
            this.jtfSenha.setText(String.valueOf(modelUsuario.getUsuarioSenha()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhum registro selecionado");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }

    /**
     * Método para salvar o cadastro de um usuário no banco de dados.
     */
    private void salvarUsuario() {
        if (this.jtfNomeUsuario.getText().isEmpty() || this.jtfLogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (this.jtfLogin.getText().length() >= 51) {
            JOptionPane.showMessageDialog(null, "Campo Login excede o limite de caractes 50 caracteres!!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (this.jtfNomeUsuario.getText().length() >= 61) {
            JOptionPane.showMessageDialog(null, "Campo Nome excede o limite de caractes 60 caracteres!!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            modelUsuario.setUsuarioNome(this.jtfNomeUsuario.getText().toUpperCase());
            modelUsuario.setUsuarioLogin(this.jtfLogin.getText());
            modelUsuario.setUsuarioSenha(String.valueOf(this.jtfSenha.getPassword()));
            if (controllerUsuarios.salvarUsuarioController(modelUsuario) > 0) {
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!!", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
                this.listarUsuarios();
                this.habilitarDesabilitarCampos(false);
                this.limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario não cadastrado, verifique as informações", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Método para salvar a edição de um registro no banco de dados.
     */
    private void editarUsuario() {
        if (this.jtfNomeUsuario.getText().isEmpty() || this.jtfLogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (this.jtfLogin.getText().length() >= 51) {
            JOptionPane.showMessageDialog(null, "Campo Login excede o limite de caractes 50 caracteres!!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (this.jtfNomeUsuario.getText().length() >= 61) {
            JOptionPane.showMessageDialog(null, "Campo Nome excede o limite de caractes 60 caracteres!!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            modelUsuario.setUsuarioNome(this.jtfNomeUsuario.getText().toUpperCase());
            modelUsuario.setUsuarioLogin(this.jtfLogin.getText());
            modelUsuario.setUsuarioSenha(String.valueOf(this.jtfSenha.getPassword()));
            if (controllerUsuarios.editarUsuarioController(modelUsuario)) {
                JOptionPane.showMessageDialog(this, "Editado com sucesso!!", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
                this.listarUsuarios();
                this.habilitarDesabilitarCampos(false);
                this.limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi aplicado a edição, verifique as informações", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    /**
     * Método para limpar os campos de texto.
     */
    private void limparCampos() {
        this.jtfCodigo.setText("");
        this.jtfNomeUsuario.setText("");
        this.jtfLogin.setText("");
        this.jtfSenha.setText("");
    }
    
    /**
     * Método que habilita e desabilita campos de texto.
     * @param condicao 
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        this.jtfNomeUsuario.setEnabled(condicao);
        this.jtfLogin.setEnabled(condicao);
        this.jtfSenha.setEnabled(condicao);
    }

    /**
     * Retorna os Usuarios cadastrados no banco de dados.
     */
    private void listarUsuarios() {
        listaModelUsuarios = controllerUsuarios.retornaListaUsuariosController();
        DefaultTableModel tabela = (DefaultTableModel) jtableUsuarios.getModel();
        tabela.setNumRows(0);

        int contador = listaModelUsuarios.size();
        for (int c = 0; c < contador; c++) {
            tabela.addRow(new Object[]{
                listaModelUsuarios.get(c).getIdUsuario(),
                listaModelUsuarios.get(c).getUsuarioNome(),
                listaModelUsuarios.get(c).getUsuarioLogin(),
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableUsuarios;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNomeUsuario;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
