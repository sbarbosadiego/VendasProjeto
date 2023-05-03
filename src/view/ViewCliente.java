/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerCliente;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import model.ModelClientes;
import util.CampoDePesquisa;

/**
 * @author Diego Barbosa
 */
public class ViewCliente extends javax.swing.JFrame {

    ArrayList<ModelClientes> listaModelClientes = new ArrayList<ModelClientes>();
    ControllerCliente controllerCliente = new ControllerCliente();
    ModelClientes modelCliente = new ModelClientes();
    String editarSalvar;

    /**
     * Creates new form ViewCliente
     */
    public ViewCliente() {
        initComponents();
        this.listarClientes();
        this.habilitarDesabilitarCampos(false);
        this.formatarCep();
        this.formatarTelefone();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbUF = new javax.swing.JComboBox<>();
        jtfCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableCliente = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jtfNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfComplemento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jtfCep = new javax.swing.JFormattedTextField();
        jtfTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setLocation(new java.awt.Point(600, 150));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 540));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nome:");

        jtfNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jtfCodigo.setBackground(new java.awt.Color(242, 242, 242));
        jtfCodigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfCodigo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Telefone:");

        jtfEndereco.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Endereço:");

        jtfBairro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Bairro:");

        jcbUF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        jtfCidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("UF:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("CEP:");

        jtableCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableCliente.setRowHeight(25);
        jScrollPane1.setViewportView(jtableCliente);
        if (jtableCliente.getColumnModel().getColumnCount() > 0) {
            jtableCliente.getColumnModel().getColumn(0).setMinWidth(70);
            jtableCliente.getColumnModel().getColumn(0).setPreferredWidth(70);
            jtableCliente.getColumnModel().getColumn(0).setMaxWidth(70);
            jtableCliente.getColumnModel().getColumn(1).setMinWidth(150);
            jtableCliente.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtableCliente.getColumnModel().getColumn(2).setMinWidth(120);
            jtableCliente.getColumnModel().getColumn(2).setPreferredWidth(120);
            jtableCliente.getColumnModel().getColumn(3).setMinWidth(120);
            jtableCliente.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(51, 0, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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

        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
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

        jtfNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Número:");

        jtfComplemento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Complemento:");

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Pesquisar:");

        jtfPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jtfCep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jtfTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jcbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jtfComplemento)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jtfBairro))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jtfTelefone))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)
                                .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30))
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbUF)
                            .addComponent(jtfCep))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = jtableCliente.getSelectedRow();
        int codigoProduto = (int) jtableCliente.getValueAt(linha, 0);
        if (JOptionPane.showConfirmDialog(this, "Excluir Cliente?", "Excluir",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (controllerCliente.excluirClienteController(codigoProduto)) {
                JOptionPane.showMessageDialog(this, "Cliente excluído", "ATENÇÃO",
                        JOptionPane.WARNING_MESSAGE);
                this.listarClientes();
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (editarSalvar.equals("salvar")) {
            this.salvarCliente();
        } else if (editarSalvar.equals("editar")) {
            this.editarProduto();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarSalvar = "editar";
        int linha = this.jtableCliente.getSelectedRow();
        this.habilitarDesabilitarCampos(true);
        try {
            int codigoCliente = (int) this.jtableCliente.getValueAt(linha, 0);
            modelCliente = controllerCliente.retornarClienteController(codigoCliente);
            this.jtfCodigo.setText(String.valueOf(modelCliente.getIdCliente()));
            this.jtfNome.setText(modelCliente.getClienteNome());
            this.jtfTelefone.setText(modelCliente.getClienteTelefone());
            this.jtfEndereco.setText(modelCliente.getClienteEndereco());
            this.jtfBairro.setText(modelCliente.getClienteBairro());
            this.jtfCidade.setText(modelCliente.getClienteCidade());
            this.jtfCep.setText(modelCliente.getClienteCep());
            this.jtfNumero.setText(modelCliente.getClienteNumero());
            this.jtfComplemento.setText(modelCliente.getClienteComplemento());
            this.jcbUF.setSelectedItem(modelCliente.getClienteUf());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhum registro selecionado");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtableCliente.getModel();
        final TableRowSorter<TableModel> classifica = new TableRowSorter<>(modelo);
        this.jtableCliente.setRowSorter(classifica);
        String pesquisa = this.jtfPesquisa.getText();
        if (CampoDePesquisa.testaString(pesquisa) == true) {
            classifica.setRowFilter(RowFilter.regexFilter(pesquisa, 0));
        } else {
            classifica.setRowFilter(RowFilter.regexFilter(pesquisa.toUpperCase(), 1));
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    /**
     * Método para salvar o cadastro de um usuário no banco de dados.
     */
    private void salvarCliente() {
        if (this.jtfNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (this.jtfNome.getText().length() >= 61) {
            JOptionPane.showMessageDialog(null, "Campo Nome excede o limite de 60 caracteres!!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            modelCliente.setClienteNome(this.jtfNome.getText().toUpperCase());
            modelCliente.setClienteTelefone(this.jtfTelefone.getText());
            modelCliente.setClienteEndereco(this.jtfEndereco.getText().toUpperCase());
            modelCliente.setClienteBairro(this.jtfBairro.getText().toUpperCase());
            modelCliente.setClienteCidade(this.jtfCidade.getText().toUpperCase());
            modelCliente.setClienteCep(this.jtfCep.getText());
            modelCliente.setClienteNumero(this.jtfNumero.getText());
            modelCliente.setClienteComplemento(this.jtfComplemento.getText().toUpperCase());
            modelCliente.setClienteUf(this.jcbUF.getSelectedItem().toString());
            if (controllerCliente.salvarClienteController(modelCliente) > 0) {
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!!", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
                this.listarClientes();
                this.habilitarDesabilitarCampos(false);
                this.limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Cliente não cadastrado, verifique as informações", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Método para salvar a edição de um registro no banco de dados.
     */
    private void editarProduto() {
        if (this.jtfNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else if (this.jtfNome.getText().length() >= 61) {
            JOptionPane.showMessageDialog(null, "Campo Nome excede o limite de 60 caracteres!!", "ATENÇÃO",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            modelCliente.setClienteNome(this.jtfNome.getText().toUpperCase());
            modelCliente.setClienteTelefone(this.jtfTelefone.getText());
            modelCliente.setClienteEndereco(this.jtfEndereco.getText().toUpperCase());
            modelCliente.setClienteBairro(this.jtfBairro.getText().toUpperCase());
            modelCliente.setClienteCidade(this.jtfCidade.getText().toUpperCase());
            modelCliente.setClienteCep(this.jtfCep.getText());
            modelCliente.setClienteNumero(this.jtfNumero.getText());
            modelCliente.setClienteComplemento(this.jtfComplemento.getText().toUpperCase());
            modelCliente.setClienteUf(this.jcbUF.getSelectedItem().toString());
            if (controllerCliente.editarClienteController(modelCliente)) {
                JOptionPane.showMessageDialog(this, "Editado com sucesso!!", "ATENÇÃO",
                        JOptionPane.INFORMATION_MESSAGE);
                this.listarClientes();
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
        this.jtfNome.setText("");
        this.jtfTelefone.setText("");
        this.jtfEndereco.setText("");
        this.jtfBairro.setText("");
        this.jtfCidade.setText("");
        this.jtfCep.setText("");
        this.jtfNumero.setText("");
        this.jtfComplemento.setText("");
    }

    /**
     * Método que habilita e desabilita campos de texto.
     *
     * @param condicao
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        this.jtfNome.setEnabled(condicao);
        this.jtfTelefone.setEnabled(condicao);
        this.jtfEndereco.setEnabled(condicao);
        this.jtfBairro.setEnabled(condicao);
        this.jtfCidade.setEnabled(condicao);
        this.jtfCep.setEnabled(condicao);
        this.jcbUF.setEnabled(condicao);
        this.jtfNumero.setEnabled(condicao);
        this.jtfComplemento.setEnabled(condicao);
    }

    /**
     * Retorna os clientes cadastrados no banco de dados.
     */
    private void listarClientes() {
        listaModelClientes = controllerCliente.retornaListaClientesController();
        DefaultTableModel tabela = (DefaultTableModel) jtableCliente.getModel();
        tabela.setNumRows(0);

        int contador = listaModelClientes.size();
        for (int c = 0; c < contador; c++) {
            tabela.addRow(new Object[]{
                listaModelClientes.get(c).getIdCliente(),
                listaModelClientes.get(c).getClienteNome(),
                listaModelClientes.get(c).getClienteCidade(),
                listaModelClientes.get(c).getClienteTelefone()
            });
        }
    }

    /**
     * Formatar campo de CEP.
     */
    private void formatarCep() {
        try {
            MaskFormatter mask = new MaskFormatter("#####-###");
            mask.install(jtfCep);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível formatar campo", "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Formatar campo de telefone.
     */
    private void formatarTelefone() {
        try {
            MaskFormatter mask = new MaskFormatter("(##) #####-####");
            mask.install(jtfTelefone);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível formatar campo", "ERRO",
                    JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbUF;
    private javax.swing.JTable jtableCliente;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JFormattedTextField jtfCep;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfComplemento;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JFormattedTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
