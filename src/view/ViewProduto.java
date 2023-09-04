/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerProduto;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;
import util.CampoDePesquisa;
import util.FormataValorReal;

/**
 * @author Diego Barbosa da Silva
 */
public class ViewProduto extends javax.swing.JFrame {

    Locale localeBR = new Locale("pt", "BR");
    NumberFormat valorReal = NumberFormat.getCurrencyInstance(localeBR);

    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProduto controllerProdutos = new ControllerProduto();
    ModelProdutos modelProduto = new ModelProdutos();
    String editarSalvar;

    /**
     * Creates new form ViewProduto
     */
    public ViewProduto() {
        initComponents();
        this.listarProdutos();
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
        jtfNomeProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProdutos = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jtfPesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jtfEstoque = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfFabricante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfPreco = new javax.swing.JTextField();
        jtfCusto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setLocation(new java.awt.Point(600, 150));
        setMinimumSize(new java.awt.Dimension(820, 600));

        jtfCodigo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfCodigo.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Cód. do Produto:");

        jtfNomeProduto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Produto:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Estoque:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Fabricante:");

        jtableProdutos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Fabricante", "Produto", "Estoque", "Preço", "Custo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableProdutos.setRowHeight(25);
        jScrollPane1.setViewportView(jtableProdutos);
        if (jtableProdutos.getColumnModel().getColumnCount() > 0) {
            jtableProdutos.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtableProdutos.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtableProdutos.getColumnModel().getColumn(3).setPreferredWidth(60);
            jtableProdutos.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        btnNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(51, 0, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 153, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jtfPesquisa.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisaActionPerformed(evt);
            }
        });
        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Pesquisar:");

        btnPesquisar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPesquisar.setText("Filtrar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jtfEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jtfEstoque.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Custo:");

        jtfFabricante.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Preço:");

        jtfPreco.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfPrecoFocusLost(evt);
            }
        });

        jtfCusto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCustoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel1)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNomeProduto)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtfFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = jtableProdutos.getSelectedRow();
        int codigoProduto = (int) jtableProdutos.getValueAt(linha, 0);
        if (JOptionPane.showConfirmDialog(this, "Excluir Produto?", "Excluir",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (controllerProdutos.excluirProdutoController(codigoProduto)) {
                JOptionPane.showMessageDialog(this, "Produto excluído", "ATENÇÃO",
                        JOptionPane.WARNING_MESSAGE);
                this.listarProdutos();
                this.limparCampos();
                this.habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro de exclusão", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtableProdutos.getModel();
        final TableRowSorter<TableModel> classifica = new TableRowSorter<>(modelo);
        this.jtableProdutos.setRowSorter(classifica);
        String pesquisa = this.jtfPesquisa.getText();
        if (CampoDePesquisa.testaString(pesquisa) == true) {
            classifica.setRowFilter(RowFilter.regexFilter(pesquisa, 0));
        } else {
            classifica.setRowFilter(RowFilter.regexFilter(pesquisa.toUpperCase(), 1));
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (editarSalvar.equals("salvar")) {
            this.salvarProduto();
        } else if (editarSalvar.equals("editar")) {
            this.editarProduto();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarSalvar = "editar";
        int linha = this.jtableProdutos.getSelectedRow();
        this.habilitarDesabilitarCampos(true);
        double preco = 0;
        try {
            int codigoProduto = (int) this.jtableProdutos.getValueAt(linha, 0);
            // Recupera as informações do produto no banco de dados
            modelProduto = controllerProdutos.retornarProdutoController(codigoProduto);
            // Seta os dados recuperados no banco nos campos
            this.jtfCodigo.setText(String.valueOf(modelProduto.getIdProduto()));
            this.jtfNomeProduto.setText(modelProduto.getProdutoNome());
            this.jtfFabricante.setText(modelProduto.getProdutoFabricante());
            this.jtfEstoque.setText(String.valueOf(modelProduto.getProdutoEstoque()));
            this.jtfPreco.setText(FormataValorReal.formatarDoubleReal(modelProduto.getProdutoPreco()));
            this.jtfCusto.setText(FormataValorReal.formatarDoubleReal(modelProduto.getProdutoCusto()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhum registro selecionado");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarDesabilitarCampos(true);
        editarSalvar = "salvar";
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisaActionPerformed

    private void jtfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.btnPesquisar.requestFocus();
        }
    }//GEN-LAST:event_jtfPesquisaKeyPressed

    private void jtfPrecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPrecoFocusLost
        jtfPreco.setText(FormataValorReal.formatarReal(this.jtfPreco.getText()));
    }//GEN-LAST:event_jtfPrecoFocusLost

    private void jtfCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCustoFocusLost
        jtfCusto.setText(FormataValorReal.formatarReal(this.jtfCusto.getText()));
    }//GEN-LAST:event_jtfCustoFocusLost

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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    /**
     * Método para salvar um novo produto cadastrado no banco de dados.
     */
    private void salvarProduto() {
        if (this.jtfNomeProduto.getText().isEmpty() || this.jtfEstoque.getText().isEmpty() || this.jtfPreco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (this.jtfNomeProduto.getText().length() >= 101) {
            JOptionPane.showMessageDialog(null, "Campo Produto excede o limite de 100 caracteres!!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            modelProduto.setProdutoNome(this.jtfNomeProduto.getText().toUpperCase());
            modelProduto.setProdutoFabricante(this.jtfFabricante.getText().toUpperCase());
            modelProduto.setProdutoEstoque(Integer.parseInt(this.jtfEstoque.getText()));
            modelProduto.setProdutoPreco(FormataValorReal.retornarRealDouble(this.jtfPreco.getText()));
            modelProduto.setProdutoCusto(FormataValorReal.retornarRealDouble(this.jtfCusto.getText()));
            if (controllerProdutos.salvarProdutoController(modelProduto) > 0) {
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!!", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
                this.listarProdutos();
                this.habilitarDesabilitarCampos(false);
                this.limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Produto não cadastrado, verifique as informações", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Método para salvar a edição de um registro no banco de dados.
     */
    private void editarProduto() {
        if (this.jtfNomeProduto.getText().isEmpty() || this.jtfEstoque.getText().isEmpty() || this.jtfPreco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (this.jtfNomeProduto.getText().length() >= 101) {
            JOptionPane.showMessageDialog(null, "Excede o limite de 100 caracteres!!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            modelProduto.setProdutoNome(this.jtfNomeProduto.getText().toUpperCase());
            modelProduto.setProdutoFabricante(this.jtfFabricante.getText().toUpperCase());
            modelProduto.setProdutoEstoque(Integer.parseInt(this.jtfEstoque.getText()));
            modelProduto.setProdutoPreco(FormataValorReal.retornarRealDouble(this.jtfPreco.getText()));
            modelProduto.setProdutoCusto(FormataValorReal.retornarRealDouble(this.jtfCusto.getText()));
            if (controllerProdutos.editarProdutoController(modelProduto)) {
                JOptionPane.showMessageDialog(this, "Editado com sucesso!!", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
                this.listarProdutos();
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
        this.jtfNomeProduto.setText("");
        this.jtfEstoque.setText("");
        this.jtfPreco.setText("");
        this.jtfFabricante.setText("");
        this.jtfCusto.setText("");
    }

    /**
     * Método que habilita e desabilita campos de texto.
     *
     * @param condicao
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        this.jtfNomeProduto.setEnabled(condicao);
        this.jtfEstoque.setEnabled(condicao);
        this.jtfPreco.setEnabled(condicao);
        this.jtfCusto.setEnabled(condicao);
        this.jtfFabricante.setEnabled(condicao);
    }

    /**
     * Retorna os produtos cadastrados no banco de dados.
     */
    private void listarProdutos() {
        listaModelProdutos = controllerProdutos.retornaListaProdutosController();
        DefaultTableModel tabela = (DefaultTableModel) jtableProdutos.getModel();
        tabela.setNumRows(0);

        int contador = listaModelProdutos.size();
        for (int c = 0; c < contador; c++) {
            tabela.addRow(new Object[]{
                listaModelProdutos.get(c).getIdProduto(),
                listaModelProdutos.get(c).getProdutoFabricante(),
                listaModelProdutos.get(c).getProdutoNome(),
                listaModelProdutos.get(c).getProdutoEstoque(),
                valorReal.format(listaModelProdutos.get(c).getProdutoPreco()),
                valorReal.format(listaModelProdutos.get(c).getProdutoCusto())
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableProdutos;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfCusto;
    private javax.swing.JFormattedTextField jtfEstoque;
    private javax.swing.JTextField jtfFabricante;
    private javax.swing.JTextField jtfNomeProduto;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfPreco;
    // End of variables declaration//GEN-END:variables
}
