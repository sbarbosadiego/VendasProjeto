/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerCliente;
import controller.ControllerProduto;
import controller.ControllerVenda;
import controller.ControllerVendasCliente;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCliente;
import model.ModelProdutos;
import model.ModelVendasCliente;

/**
 * @author Diego Barbosa da Silva
 */
public class ViewVenda extends javax.swing.JFrame {

    Locale localeBR = new Locale("pt", "BR");

    ModelCliente modelCliente = new ModelCliente();
    ControllerCliente controllerCliente = new ControllerCliente();
    ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();

    ModelProdutos modelProdutos = new ModelProdutos();
    ControllerProduto controllerProduto = new ControllerProduto();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    
    ControllerVendasCliente controllerVendasCliente = new ControllerVendasCliente();
    ArrayList<ModelVendasCliente> listalModelVendasClientes = new ArrayList<>();
    
    ControllerVenda controllerVenda = new ControllerVenda();
    

    DefaultListModel modelo;
    int Enter = 0;

    /**
     * Creates new form ViewVendas
     */
    public ViewVenda() {
        initComponents();
        modelo = new DefaultListModel();
        this.listaPesquisarCliente.setVisible(false);
        this.listaPesquisarProduto.setVisible(false);
        this.listaPesquisarCliente.setModel(modelo);
        this.listaPesquisarProduto.setModel(modelo);
        listarPesquisaClientes();
        listarPesquisaProdutos();
        listarVendasClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        listaPesquisarCliente = new javax.swing.JList<>();
        listaPesquisarProduto = new javax.swing.JList<>();
        campoPesquisaProduto = new javax.swing.JTextField();
        campoPesquisaCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigoVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodigoProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        jtfQuantidade = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfDesconto = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutosVenda = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jtfValorTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(877, 675));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaPesquisarCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        listaPesquisarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaPesquisarClienteMousePressed(evt);
            }
        });
        jPanel1.add(listaPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 63, 516, 93));

        listaPesquisarProduto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        listaPesquisarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaPesquisarProdutoMousePressed(evt);
            }
        });
        jPanel1.add(listaPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 131, 396, 93));

        campoPesquisaProduto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        campoPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaProdutoActionPerformed(evt);
            }
        });
        campoPesquisaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaProdutoKeyReleased(evt);
            }
        });
        jPanel1.add(campoPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 103, 400, 30));

        campoPesquisaCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        campoPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaClienteActionPerformed(evt);
            }
        });
        campoPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaClienteKeyReleased(evt);
            }
        });
        jPanel1.add(campoPesquisaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 35, 520, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Cód. do Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jtfCodigoCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoClienteActionPerformed(evt);
            }
        });
        jtfCodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoClienteKeyReleased(evt);
            }
        });
        jPanel1.add(jtfCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 150, 31));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 10, -1, -1));

        jtfCodigoVenda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jtfCodigoVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 35, 150, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Cód. da Venda:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Cód. do Produto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        jtfCodigoProduto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoProdutoActionPerformed(evt);
            }
        });
        jtfCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoProdutoKeyReleased(evt);
            }
        });
        jPanel1.add(jtfCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, 150, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Quantidade:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 78, -1, -1));

        btnAdicionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 103, 115, 30));

        jtfQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jtfQuantidade.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfQuantidadeKeyPressed(evt);
            }
        });
        jPanel1.add(jtfQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 103, 144, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Valor Total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 557, -1, 30));

        jtfDesconto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDescontoFocusLost(evt);
            }
        });
        jtfDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescontoActionPerformed(evt);
            }
        });
        jPanel1.add(jtfDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 558, 110, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Desconto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 557, -1, 30));

        btnNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 600, 100, 30));

        btnSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 153, 51));
        btnSalvar.setText("Salvar");
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 600, 100, 30));

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 100, 30));

        jtProdutosVenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Prod.", "Produto", "Qtd.", "Valor Un.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProdutosVenda);
        if (jtProdutosVenda.getColumnModel().getColumnCount() > 0) {
            jtProdutosVenda.getColumnModel().getColumn(0).setMinWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(0).setPreferredWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(0).setMaxWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(1).setPreferredWidth(160);
            jtProdutosVenda.getColumnModel().getColumn(2).setMinWidth(70);
            jtProdutosVenda.getColumnModel().getColumn(2).setPreferredWidth(70);
            jtProdutosVenda.getColumnModel().getColumn(2).setMaxWidth(70);
            jtProdutosVenda.getColumnModel().getColumn(3).setMinWidth(100);
            jtProdutosVenda.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtProdutosVenda.getColumnModel().getColumn(3).setMaxWidth(100);
            jtProdutosVenda.getColumnModel().getColumn(4).setMinWidth(100);
            jtProdutosVenda.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtProdutosVenda.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 857, 400));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("Produto:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 78, -1, -1));

        jtfValorTotal.setEditable(false);
        jtfValorTotal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jtfValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 558, 190, 30));

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("Pesquisar:");

        jtPesquisar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesquisarActionPerformed(evt);
            }
        });
        jtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPesquisarKeyPressed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnPesquisar.setText("Filtrar");

        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Venda", "Cliente", "Total", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtVendas);

        jbExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbExcluir.setForeground(new java.awt.Color(255, 0, 0));
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbEditar.setText("Editar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Vendas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoProdutoActionPerformed

    private void jtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPesquisarActionPerformed

    private void jtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.btnPesquisar.requestFocus();
        }
    }//GEN-LAST:event_jtPesquisarKeyPressed

    private void jtfQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.btnAdicionar.requestFocus();
        }
    }//GEN-LAST:event_jtfQuantidadeKeyPressed

    private void campoPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaClienteActionPerformed
        this.listaPesquisarCliente.setVisible(true);
        Enter = 1;
    }//GEN-LAST:event_campoPesquisaClienteActionPerformed

    private void campoPesquisaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaClienteKeyReleased
        if (Enter == 0) {
            this.listarPesquisaClientes();
        } else {
            Enter = 0;
        }
    }//GEN-LAST:event_campoPesquisaClienteKeyReleased

    private void listaPesquisarClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPesquisarClienteMousePressed
        this.recuperarPesquisaCliente();
        this.listaPesquisarCliente.setVisible(false);
    }//GEN-LAST:event_listaPesquisarClienteMousePressed

    private void jtfCodigoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoClienteKeyReleased
        try {
            if (Enter == 0) {
                this.recuperarClienteCodigo();
            } else {
                Enter = 0;
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jtfCodigoClienteKeyReleased

    private void campoPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaProdutoActionPerformed
        this.listaPesquisarProduto.setVisible(true);
        Enter = 1;
    }//GEN-LAST:event_campoPesquisaProdutoActionPerformed

    private void campoPesquisaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaProdutoKeyReleased
        if (Enter == 0) {
            this.listarPesquisaProdutos();
        } else {
            Enter = 0;
        }
    }//GEN-LAST:event_campoPesquisaProdutoKeyReleased

    private void listaPesquisarProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPesquisarProdutoMousePressed
        this.recuperarPesquisaProduto();
        this.listaPesquisarProduto.setVisible(false);
    }//GEN-LAST:event_listaPesquisarProdutoMousePressed

    private void jtfCodigoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoKeyReleased
        try {
            if (Enter == 0) {
                this.recuperarProdutoCodigo();
            } else {
                Enter = 0;
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jtfCodigoProdutoKeyReleased

    private void jtfCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoClienteActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = this.jtVendas.getSelectedRow();
        int codigo = (int) this.jtVendas.getValueAt(linha, 0);
        if (JOptionPane.showConfirmDialog(this, "Excluir Venda?", "Excluir",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (controllerVenda.excluirVendaController(codigo)) {
                JOptionPane.showMessageDialog(this, "Venda excluída", "ATENÇÃO",
                        JOptionPane.WARNING_MESSAGE);
                listarVendasClientes();
            } else {
                JOptionPane.showMessageDialog(this, "Erro de exclusão", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (jtfQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe a quantidade", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            modelProdutos = controllerProduto.retornarProdutoController(Integer.parseInt(jtfCodigoProduto.getText()));
            // Inicia a linha na tabela
            DefaultTableModel modeloCadastro = (DefaultTableModel) this.jtProdutosVenda.getModel();
            double quantidade = Double.parseDouble(this.jtfQuantidade.getText());
            NumberFormat valorReal = NumberFormat.getCurrencyInstance(localeBR);
            int contador = 0;
            for (int i = 0; i < contador; i++) {
                modeloCadastro.setNumRows(0);
            }

            modeloCadastro.addRow(new Object[]{
                modelProdutos.getIdProduto(),
                modelProdutos.getProdutoNome(),
                this.jtfQuantidade.getText(),
                valorReal.format(modelProdutos.getProdutoPreco()),
                valorReal.format(quantidade * modelProdutos.getProdutoPreco())
            });
            
            limparCamposProduto();
            somaValorTotalProdutos();
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void jtfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDescontoFocusLost
        somaValorTotalProdutos();
    }//GEN-LAST:event_jtfDescontoFocusLost

    private void jtfDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescontoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparTela();
    }//GEN-LAST:event_btnNovoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVenda().setVisible(true);
            }
        });
    }

    /**
     * Lista os clientes na pesquisa dinâmica.
     */
    private void listarPesquisaClientes() {
        String nomeCliente = this.campoPesquisaCliente.getText();
        listaModelCliente = controllerCliente.retornarListarPesquisaClientesController(nomeCliente);
        modelo.removeAllElements();
        for (int c = 0; c < listaModelCliente.size(); c++) {
            modelo.addElement(listaModelCliente.get(c).getClienteNome());
        }
        if (this.campoPesquisaCliente.getText().isEmpty()) {
            this.listaPesquisarCliente.setVisible(false);
        } else {
            this.listaPesquisarCliente.setVisible(true);
        }
    }
    
    /**
     * Listar vendas.
     */
    private void listarVendasClientes() {
        listalModelVendasClientes = controllerVendasCliente.retornaListaVendasClientesController();
        DefaultTableModel tabela = (DefaultTableModel) this.jtVendas.getModel();
        tabela.setNumRows(0);
                
        NumberFormat total = NumberFormat.getCurrencyInstance(localeBR);
        
        int contador = listalModelVendasClientes.size();
        for (int c = 0; c < contador; c++) {
            tabela.addRow(new Object[]{
                listalModelVendasClientes.get(c).getModelVenda().getIdVenda(),
                listalModelVendasClientes.get(c).getModelCliente().getClienteNome(),
                total.format(listalModelVendasClientes.get(c).getModelVenda().getVendaValorLiquido()),
                listalModelVendasClientes.get(c).getModelVenda().getVendaData()
            });
        }
    }
    
    /**
     * Lista os produtos na pesquisa dinâmica.
     */
    private void listarPesquisaProdutos() {
        String nomeProduto = this.campoPesquisaProduto.getText();
        listaModelProdutos = controllerProduto.retornarListarPesquisaProdutosController(nomeProduto);
        modelo.removeAllElements();
        for (int c = 0; c < listaModelProdutos.size(); c++) {
            modelo.addElement(listaModelProdutos.get(c).getProdutoNome());
        }
        if (this.campoPesquisaProduto.getText().isEmpty()) {
            this.listaPesquisarProduto.setVisible(false);
        } else {
            this.listaPesquisarProduto.setVisible(true);
        }
    }

    /**
     * Recupera informações do cliente na pesquisa dinâmica.
     */
    private void recuperarPesquisaCliente() {
        String nome = this.listaPesquisarCliente.getSelectedValue();
        this.campoPesquisaCliente.setText(nome);
        modelCliente = controllerCliente.retornarClienteNomeController(nome);
        this.jtfCodigoCliente.setText(String.valueOf(modelCliente.getIdCliente()));
    }
    
    /**
     * Recupera informações do produto na pesquisa dinâmica.
     */
    private void recuperarPesquisaProduto() {
        String produto = this.listaPesquisarProduto.getSelectedValue();
        this.campoPesquisaProduto.setText(produto);
        modelProdutos = controllerProduto.retornarProdutoNomeController(produto);
        this.jtfCodigoProduto.setText(String.valueOf(modelProdutos.getIdProduto()));
    }

    /**
     * Recupera informações do cliente pelo código.
     */
    private void recuperarClienteCodigo() {
        int codigo = Integer.parseInt(this.jtfCodigoCliente.getText());
        modelCliente = controllerCliente.retornarClienteController(codigo);
        this.campoPesquisaCliente.setText(modelCliente.getClienteNome());
    }
    
    /**
     * Recupera informações do produto pelo código.
     */
    private void recuperarProdutoCodigo() {
        int codigo = Integer.parseInt(this.jtfCodigoProduto.getText());
        modelProdutos = controllerProduto.retornarProdutoController(codigo);
        this.campoPesquisaProduto.setText(modelProdutos.getProdutoNome());
    }
    
    /**
     * Método para limpar campos do produto e quantidade
     */
    private void limparCamposProduto() { 
        this.jtfCodigoProduto.setText("");
        this.campoPesquisaProduto.setText("");
        this.jtfQuantidade.setText("");
    }
    
    /**
     * Limpar tela de cadastro.
     */
    private void limparTela() {
        this.jtfCodigoCliente.setText("");
        this.campoPesquisaCliente.setText("");
        this.jtfCodigoProduto.setText("");
        this.campoPesquisaProduto.setText("");
        this.jtfQuantidade.setText("");
        this.jtfValorTotal.setText("");
        this.jtfDesconto.setText("");
        DefaultTableModel tabela = (DefaultTableModel) this.jtProdutosVenda.getModel();
        tabela.setNumRows(0);
    }
    
    /**
     * Realiza a soma dos produtos.
     */
    private void somaValorTotalProdutos() {
        double somaTotal = 0, valor;
        int contador = jtProdutosVenda.getRowCount();
        NumberFormat valorReal = NumberFormat.getCurrencyInstance(localeBR);

        for (int i = 0; i < contador; i++) {
            String valorString = jtProdutosVenda.getValueAt(i, 4).toString();
            try {
                Number number = valorReal.parse(valorString);
                valor = number.doubleValue();
                somaTotal += valor;
            } catch (ParseException e) {
                System.out.println("Erro ao converter o valor: " + e.getMessage());
            }
        }

        jtfValorTotal.setText(valorReal.format(somaTotal));
        try {
            descontoVenda();
        } catch (NumberFormatException e) {

        }
    }
    
    /**
     * Aplicar desconto no valor total da venda.
     */
    private void descontoVenda() {
        NumberFormat valorReal = NumberFormat.getCurrencyInstance(localeBR);
        String valorString = jtfValorTotal.getText();
        double valorTotal = 0;
        double desconto = Double.parseDouble(jtfDesconto.getText());
        try {
            Number number = valorReal.parse(valorString);
            valorTotal = number.doubleValue();
            valorTotal = valorTotal - (valorTotal * (desconto / 100));
        } catch (ParseException e) {
            System.out.println("Erro ao converter o valor: " + e.getMessage());
        }
        jtfValorTotal.setText(valorReal.format(valorTotal));
    }
        
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoPesquisaCliente;
    private javax.swing.JTextField campoPesquisaProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTable jtProdutosVenda;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTextField jtfCodigoCliente;
    private javax.swing.JTextField jtfCodigoProduto;
    private javax.swing.JTextField jtfCodigoVenda;
    private javax.swing.JFormattedTextField jtfDesconto;
    private javax.swing.JFormattedTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorTotal;
    private javax.swing.JList<String> listaPesquisarCliente;
    private javax.swing.JList<String> listaPesquisarProduto;
    // End of variables declaration//GEN-END:variables
}
