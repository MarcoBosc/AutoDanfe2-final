package AutoDanfeEmissaoNota;

import AutoDanfeCadCliente.ConexaoPG;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Controller.Program;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Vector;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.NumberFormatter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EmissaoProduto extends javax.swing.JInternalFrame {

    public EmissaoProduto() {
        initComponents();
        populateComboBox();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnNextDefinitions = new Components.btnRounded();
        btnAddItem = new Components.btnRounded();
        btnRemoveItem = new Components.btnRounded();
        btnVoltarDest = new Components.btnRounded();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        tableItems = new Components.table();
        tfValor = new test.RoundedTextField();
        tfQuantidade = new test.RoundedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaItens = new Components.table();

        setMaximumSize(new java.awt.Dimension(1000, 596));
        setMinimumSize(new java.awt.Dimension(1000, 596));
        setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel1.setBackground(new java.awt.Color(223, 223, 223));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 596));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Automação de Nf-e");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel2.setText("1. Destinatário");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("2. Produtos");

        jLabel3.setText("3. Definições");

        jLabel5.setText("4. Transporte");

        jLabel6.setText("5. Revisão Geral");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        btnNextDefinitions.setBackground(new java.awt.Color(0, 153, 153));
        btnNextDefinitions.setForeground(new java.awt.Color(255, 255, 255));
        btnNextDefinitions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconNext.png"))); // NOI18N
        btnNextDefinitions.setText("Próximo");
        btnNextDefinitions.setBorderColor(new java.awt.Color(0, 153, 153));
        btnNextDefinitions.setColor(new java.awt.Color(0, 153, 153));
        btnNextDefinitions.setColorClick(new java.awt.Color(0, 116, 116));
        btnNextDefinitions.setColorOver(new java.awt.Color(0, 127, 127));
        btnNextDefinitions.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNextDefinitions.setMaximumSize(new java.awt.Dimension(142, 30));
        btnNextDefinitions.setMinimumSize(new java.awt.Dimension(142, 30));
        btnNextDefinitions.setPreferredSize(new java.awt.Dimension(142, 30));
        btnNextDefinitions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextDefinitionsActionPerformed(evt);
            }
        });

        btnAddItem.setBackground(new java.awt.Color(0, 153, 153));
        btnAddItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionarLogo.png"))); // NOI18N
        btnAddItem.setText("Adicionar");
        btnAddItem.setBorderColor(new java.awt.Color(0, 153, 153));
        btnAddItem.setColor(new java.awt.Color(0, 153, 153));
        btnAddItem.setColorClick(new java.awt.Color(0, 116, 116));
        btnAddItem.setColorOver(new java.awt.Color(0, 127, 127));
        btnAddItem.setIconTextGap(8);
        btnAddItem.setMaximumSize(new java.awt.Dimension(142, 30));
        btnAddItem.setMinimumSize(new java.awt.Dimension(142, 30));
        btnAddItem.setPreferredSize(new java.awt.Dimension(142, 30));
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnRemoveItem.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoveItem.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/removeIcon.png"))); // NOI18N
        btnRemoveItem.setText("Remover");
        btnRemoveItem.setBorderColor(new java.awt.Color(153, 0, 0));
        btnRemoveItem.setColor(new java.awt.Color(153, 0, 0));
        btnRemoveItem.setColorClick(new java.awt.Color(126, 0, 0));
        btnRemoveItem.setColorOver(new java.awt.Color(135, 2, 2));
        btnRemoveItem.setIconTextGap(8);
        btnRemoveItem.setMaximumSize(new java.awt.Dimension(142, 30));
        btnRemoveItem.setMinimumSize(new java.awt.Dimension(142, 30));
        btnRemoveItem.setPreferredSize(new java.awt.Dimension(142, 30));
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });

        btnVoltarDest.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltarDest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconBack.png"))); // NOI18N
        btnVoltarDest.setText("Voltar");
        btnVoltarDest.setBorderColor(new java.awt.Color(204, 204, 204));
        btnVoltarDest.setColor(new java.awt.Color(204, 204, 204));
        btnVoltarDest.setColorClick(new java.awt.Color(159, 159, 159));
        btnVoltarDest.setColorOver(new java.awt.Color(184, 184, 184));
        btnVoltarDest.setMaximumSize(new java.awt.Dimension(142, 30));
        btnVoltarDest.setMinimumSize(new java.awt.Dimension(142, 30));
        btnVoltarDest.setPreferredSize(new java.awt.Dimension(142, 30));
        btnVoltarDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarDestActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconList.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel8.setText("Lista de itens");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel9.setText("Total:");

        lbTotal.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lbTotal.setText("R$0,00");

        tableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "NCM", "Quantidade", "Valor Unitário"
            }
        ));
        tableItems.setMinimumSize(new java.awt.Dimension(75, 200));
        tableItems.setPreferredSize(new java.awt.Dimension(75, 200));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(lbTotal)
                .addGap(71, 71, 71))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(tableItems, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(lbTotal))
                    .addComponent(jLabel7))
                .addGap(328, 328, 328))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(tableItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        tfValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfValorFocusLost(evt);
            }
        });

        tfQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfQuantidadeFocusLost(evt);
            }
        });
        tfQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeActionPerformed(evt);
            }
        });

        jComboBox1.setMinimumSize(new java.awt.Dimension(239, 31));
        jComboBox1.setPreferredSize(new java.awt.Dimension(239, 31));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Pesquise pelo nome do item:");

        jLabel11.setText("Quantidade:");

        jLabel12.setText("Valor:");

        TabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "NCM", "Quantidade", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaItens);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btnRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltarDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNextDefinitions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNextDefinitions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarDest, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextDefinitionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextDefinitionsActionPerformed
        writeJsonToFile();
        Program.getEmissaoProduto().setVisible(false);
        Program.getEmissaoDefinicoes().setVisible(true);
    }//GEN-LAST:event_btnNextDefinitionsActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        populateTabelaItens();
        updateSumTotal();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnVoltarDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDestActionPerformed
        Program.getEmissaoProduto().setVisible(false);
        Program.getEmissaoNota().setVisible(true);
    }//GEN-LAST:event_btnVoltarDestActionPerformed

    private void tfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantidadeActionPerformed

    private void tfValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfValorFocusGained
        tfValor.setText("");
    }//GEN-LAST:event_tfValorFocusGained

    private void tfValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfValorFocusLost
        if (tfValor.getText().isEmpty()) {
            tfValor.setText("39,80");
        }
    }//GEN-LAST:event_tfValorFocusLost

    private void tfQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfQuantidadeFocusGained
        tfQuantidade.setText("");
    }//GEN-LAST:event_tfQuantidadeFocusGained

    private void tfQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfQuantidadeFocusLost
        if (tfQuantidade.getText().isEmpty()) {
            tfQuantidade.setText("0");
        }
    }//GEN-LAST:event_tfQuantidadeFocusLost

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
        removeSelectedRow();
        updateSumTotal();
    }//GEN-LAST:event_btnRemoveItemActionPerformed
    private void removeSelectedRow() {
        int selectedRowIndex = TabelaItens.getSelectedRow();
        if (selectedRowIndex != -1) {
            DefaultTableModel model = (DefaultTableModel) TabelaItens.getModel();
            model.removeRow(selectedRowIndex);
        } else {
            JOptionPane.showMessageDialog(null, "No row selected.");
        }
    }

    private void populateTabelaItens() {
        DefaultTableModel model = (DefaultTableModel) TabelaItens.getModel();
        model.setColumnCount(7);

        String quantidade = tfQuantidade.getText();
        String valor = tfValor.getText().replace(",", ".");
        double total = Integer.parseInt(quantidade) * Double.parseDouble(valor);
        String formattedTotal = String.format("%.2f", total);
        formattedTotal = formattedTotal.replace(".", ",");
        String nomeProduto = jComboBox1.getSelectedItem().toString();
        String idProduto = "";
        String codigoProduto = "";
        String ncmProduto = "";

        try (java.sql.Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT id_produto, cod_produto, NCM FROM produtos WHERE nome_produto = ?")) {
            ps.setString(1, nomeProduto);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    idProduto = rs.getString("id_produto");
                    codigoProduto = rs.getString("cod_produto");
                    ncmProduto = rs.getString("NCM");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o ID do produto: " + e.getMessage());
        }
        Object[] row = {codigoProduto, nomeProduto, ncmProduto, quantidade, valor, formattedTotal, idProduto};
        model.addRow(row);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setForeground(Color.BLACK);
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        JTableHeader header = TabelaItens.getTableHeader();
        header.setDefaultRenderer(cellRenderer);

        TableColumnModel columnModel = TabelaItens.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setCellRenderer(cellRenderer);
        }

        columnModel.getColumn(0).setHeaderValue("Código");
        columnModel.getColumn(1).setHeaderValue("Descrição");
        columnModel.getColumn(2).setHeaderValue("NCM");
        columnModel.getColumn(3).setHeaderValue("Quantidade");
        columnModel.getColumn(4).setHeaderValue("Valor Unitário");
        columnModel.getColumn(5).setHeaderValue("Total");
        columnModel.getColumn(6).setHeaderValue("ID Produto");

        header.repaint();
        TabelaItens.repaint();

    }

    private void populateComboBox() {
        try (java.sql.Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT * FROM produtos ORDER BY nome_produto ASC"); ResultSet rs = ps.executeQuery()) {

            jComboBox1.removeAllItems();

            while (rs.next()) {
                String nomeProduto = rs.getString("nome_produto");
                jComboBox1.addItem(nomeProduto);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela produtos: " + e.getMessage());
        }
    }

    private double calculateSumTotal() {
        DefaultTableModel model = (DefaultTableModel) TabelaItens.getModel();
        int rowCount = model.getRowCount();

        int totalColumnIndex = getColumnIndex("Total");
        double sumTotal = 0.0;
        for (int i = 0; i < rowCount; i++) {
            String totalValue = model.getValueAt(i, totalColumnIndex).toString();
            double totalProduct = Double.parseDouble(totalValue.replace(",", "."));
            sumTotal += totalProduct;
        }
        return sumTotal;
    }

    private void updateSumTotal() {
        double sumTotal = calculateSumTotal();
        lbTotal.setText(String.format("R$ %.2f", sumTotal));
    }

    private int getColumnIndex(String columnName) {
        DefaultTableModel model = (DefaultTableModel) TabelaItens.getModel();
        TableColumnModel columnModel = TabelaItens.getColumnModel();

        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            TableColumn tableColumn = columnModel.getColumn(i);
            if (tableColumn.getHeaderValue().equals(columnName)) {
                return tableColumn.getModelIndex();
            }
        }

        return -1;
    }

    private String readJsonFromFile() {
        String fileName = "json.txt";
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        return contentBuilder.toString();
    }

    private void writeJsonToFile() {
        try {
            String fileName = "json.txt";
            StringBuilder jsonContent = new StringBuilder();

            jsonContent.append("  \"itens\": [\n");

            DefaultTableModel model = (DefaultTableModel) TabelaItens.getModel();
            int rowCount = model.getRowCount();

            for (int i = 0; i < rowCount; i++) {
                String idProduto = model.getValueAt(i, 6).toString();
                String quantidade = model.getValueAt(i, 3).toString();
                String valorUnidade = model.getValueAt(i, 4).toString();

                jsonContent.append("    {\n");
                jsonContent.append("      \"id_prod\": \"" + idProduto + "\",\n");
                jsonContent.append("      \"quantidade\": \"" + quantidade + "\",\n");
                jsonContent.append("      \"valor_unidade\": \"" + valorUnidade + "\"\n");
                jsonContent.append("    }");

                if (i < rowCount - 1) {
                    jsonContent.append(",");
                }

                jsonContent.append("\n");
            }

            jsonContent.append("  ]\n");

            String fileContent = readJsonFromFile();
            if (fileContent.isEmpty()) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                    writer.write(jsonContent.toString());
                    System.out.println("Data written to the JSON file successfully.");
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the JSON file: " + e.getMessage());
                }
            } else {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                    writer.newLine();
                    writer.write(jsonContent.toString());
                    System.out.println("Data written to the JSON file successfully.");
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the JSON file: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the JSON object: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.table TabelaItens;
    private Components.btnRounded btnAddItem;
    private Components.btnRounded btnNextDefinitions;
    private Components.btnRounded btnRemoveItem;
    private Components.btnRounded btnVoltarDest;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotal;
    private Components.table tableItems;
    private test.RoundedTextField tfQuantidade;
    private test.RoundedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
