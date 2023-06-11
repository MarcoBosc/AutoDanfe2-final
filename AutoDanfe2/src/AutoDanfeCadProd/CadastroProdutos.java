package AutoDanfeCadProd;

import AutoDanfeCadCliente.ConexaoPG;
import Controller.Program;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroProdutos extends javax.swing.JInternalFrame {

    public CadastroProdutos() {
        initComponents();
        btnAtualizarProd.setEnabled(false);
        btnEdicao.setVisible(false);
        btnEdicao.setEnabled(false);
        configureTable();
        populateTable();

        tfCodProd.setForeground(Color.GRAY);
        tfNCM.setForeground(Color.GRAY);
        tfNomeProd.setForeground(Color.GRAY);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    private void limparCampos() {
        tfCodProd.setText("");
        tfNCM.setText("");
        tfNomeProd.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNomeProd = new test.RoundedTextField();
        tfNCM = new test.RoundedTextField();
        tfCodProd = new test.RoundedTextField();
        btnAdicionarProd = new Components.btnRounded();
        btnRemoverProd = new Components.btnRounded();
        btnAtualizarProd = new Components.btnRounded();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Components.table();
        btnEdicao = new Components.btnRounded();

        setMaximumSize(new java.awt.Dimension(1000, 596));
        setMinimumSize(new java.awt.Dimension(1000, 596));
        setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel1.setBackground(new java.awt.Color(223, 223, 223));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        tfNomeProd.setText("Camisa");
        tfNomeProd.setLineColor(new java.awt.Color(75, 110, 175));
        tfNomeProd.setMargin(new java.awt.Insets(1, 3, 1, 3));
        tfNomeProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNomeProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeProdFocusLost(evt);
            }
        });
        tfNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeProdActionPerformed(evt);
            }
        });

        tfNCM.setText("00000000");
        tfNCM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNCMFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNCMFocusLost(evt);
            }
        });

        tfCodProd.setText("0000000");
        tfCodProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCodProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodProdFocusLost(evt);
            }
        });

        btnAdicionarProd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdicionarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionarLogo.png"))); // NOI18N
        btnAdicionarProd.setText("Adicionar");
        btnAdicionarProd.setBorderColor(new java.awt.Color(0, 153, 153));
        btnAdicionarProd.setColor(new java.awt.Color(0, 153, 153));
        btnAdicionarProd.setColorClick(new java.awt.Color(0, 134, 134));
        btnAdicionarProd.setColorOver(new java.awt.Color(0, 114, 114));
        btnAdicionarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdActionPerformed(evt);
            }
        });

        btnRemoverProd.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoverProd.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelarLogo.png"))); // NOI18N
        btnRemoverProd.setText("Remover");
        btnRemoverProd.setBorderColor(new java.awt.Color(153, 0, 0));
        btnRemoverProd.setColor(new java.awt.Color(153, 0, 0));
        btnRemoverProd.setColorClick(new java.awt.Color(175, 0, 0));
        btnRemoverProd.setColorOver(new java.awt.Color(154, 0, 0));
        btnRemoverProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdActionPerformed(evt);
            }
        });

        btnAtualizarProd.setBackground(new java.awt.Color(191, 189, 189));
        btnAtualizarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atualizarLogo.png"))); // NOI18N
        btnAtualizarProd.setText("Atualizar");
        btnAtualizarProd.setBorderColor(new java.awt.Color(191, 189, 189));
        btnAtualizarProd.setColor(new java.awt.Color(191, 189, 189));
        btnAtualizarProd.setColorClick(new java.awt.Color(159, 159, 159));
        btnAtualizarProd.setColorOver(new java.awt.Color(180, 180, 180));
        btnAtualizarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProdActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Produto:");

        jLabel3.setText("NCM do Produto:");

        jLabel4.setText("Código do Produto:");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "NCM"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btnEdicao.setBackground(new java.awt.Color(191, 189, 189));
        btnEdicao.setForeground(new java.awt.Color(255, 255, 255));
        btnEdicao.setText("Sair do modo Edição");
        btnEdicao.setBorderColor(new java.awt.Color(191, 189, 189));
        btnEdicao.setColor(new java.awt.Color(191, 189, 189));
        btnEdicao.setColorClick(new java.awt.Color(159, 159, 159));
        btnEdicao.setColorOver(new java.awt.Color(180, 180, 180));
        btnEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNCM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfNomeProd, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                                .addGap(67, 67, 67)
                                .addComponent(tfCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel2)
                            .addGap(377, 377, 377)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(btnEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAtualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnRemoverProd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnAdicionarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCodProd, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(tfNomeProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(tfNCM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverProd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeProdFocusGained
        if (tfNomeProd.getText().equals("Camisa")) {
            tfNomeProd.setText("");
            tfNomeProd.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfNomeProdFocusGained

    private void tfNomeProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeProdFocusLost
        if (tfNomeProd.getText().isEmpty()) {
            tfNomeProd.setText("Camisa");
            tfNomeProd.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfNomeProdFocusLost

    private void tfCodProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodProdFocusGained
        if (tfCodProd.getText().equals("0000000")) {
            tfCodProd.setText("");
            tfCodProd.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfCodProdFocusGained

    private void tfCodProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodProdFocusLost
        if (tfCodProd.getText().isEmpty()) {
            tfCodProd.setText("0000000");
            tfCodProd.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfCodProdFocusLost

    private void tfNCMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNCMFocusGained
        if (tfNCM.getText().equals("00000000")) {
            tfNCM.setText("");
            tfNCM.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfNCMFocusGained

    private void tfNCMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNCMFocusLost
        if (tfNCM.getText().isEmpty()) {
            tfNCM.setText("00000000");
            tfNCM.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfNCMFocusLost

    private void tfNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeProdActionPerformed

    private void btnRemoverProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdActionPerformed
        removeProdutoFromDB();
        limparCampos();
    }//GEN-LAST:event_btnRemoverProdActionPerformed

    private void btnAdicionarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdActionPerformed
        if (!verificarCamposCompletos()) {
            return; // Interrompe a execução do evento
        }

        insertProduto();
        populateTable();
        limparCampos();
        Program.getEmissaoProduto().populateComboBox();
    }//GEN-LAST:event_btnAdicionarProdActionPerformed

    private void btnAtualizarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProdActionPerformed
        if (!verificarCamposCompletos()) {
            return; // Interrompe a execução do evento
        }
        updateProduto();
        populateTable();
        limparCampos();
        btnAdicionarProd.setEnabled(true);
        btnEdicao.setEnabled(false);
        btnEdicao.setVisible(false);
        btnAdicionarProd.setBackground(new Color(0, 153, 153));
        btnAtualizarProd.setEnabled(false);
    }//GEN-LAST:event_btnAtualizarProdActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        populateFields();
        btnAtualizarProd.setEnabled(true);
        btnEdicao.setVisible(true);
        btnEdicao.setEnabled(true);
        btnAdicionarProd.setEnabled(false);
        if (btnAdicionarProd.isSelected()) {
            JOptionPane.showMessageDialog(null, "Atualize o produto atual ou saia do modo edição para prosseguir");
        }
        btnAdicionarProd.setBackground(Color.GRAY);
        btnAtualizarProd.setBackground(Color.green);
    }//GEN-LAST:event_table1MouseClicked

    private void btnEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdicaoActionPerformed
        limparCampos();
        btnAdicionarProd.setEnabled(true);
        btnEdicao.setEnabled(false);
        btnEdicao.setVisible(false);
        btnAdicionarProd.setBackground(new Color(0, 153, 153));
        btnAtualizarProd.setEnabled(false);
    }//GEN-LAST:event_btnEdicaoActionPerformed

    private void configureTable() {
        table1.setDefaultEditor(Object.class, null);
    }

    private boolean verificarCamposCompletos() {
        if (tfCodProd.getText().isEmpty() || tfCodProd.getText().equals("0920900")) {
            JOptionPane.showMessageDialog(this, "O campo 'Código do Produto' não foi preenchido.");
            return false;
        }

        if (tfNCM.getText().isEmpty() || tfNCM.getText().equals("09012100")) {
            JOptionPane.showMessageDialog(this, "O campo 'NCM' não foi preenchido.");
            return false;
        }

        if (tfNomeProd.getText().isEmpty() || tfNomeProd.getText().equals("JALECO ML BRANCO M")) {
            JOptionPane.showMessageDialog(this, "O campo 'Nome do Produto' não foi preenchido.");
            return false;
        }

        return true;
    }

    private void removeProdutoFromDB() {
        int selectedRow = table1.getSelectedRow();
        if (selectedRow >= 0) {
            String idProduto = table1.getValueAt(selectedRow, 0).toString();
            try (java.sql.Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("UPDATE produtos SET status_produto = FALSE WHERE id_produto = ?")) {
                ps.setInt(1, Integer.parseInt(idProduto));
                ps.executeUpdate();

                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao remover produto: " + e.getMessage());
            }
        }
    }

    private void updateProduto() {
        int selectedRow = table1.getSelectedRow();
        if (selectedRow >= 0) {
            String idProduto = table1.getValueAt(selectedRow, 0).toString();
            try (java.sql.Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("UPDATE produtos SET NCM=?, nome_produto=? WHERE id_produto=?")) {
                ps.setInt(1, Integer.parseInt(tfNCM.getText()));
                ps.setString(2, tfNomeProd.getText());
                ps.setInt(3, Integer.parseInt(idProduto));
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar produto: " + e.getMessage());
            }
        }
    }

    private void populateFields() {
        int row = table1.getSelectedRow();
        if (row != -1) {
            tfCodProd.setText(table1.getValueAt(row, 1).toString());
            tfNCM.setText(table1.getValueAt(row, 2).toString());
            tfNomeProd.setText(table1.getValueAt(row, 3).toString());
            tfCodProd.setForeground(Color.BLACK);
            tfNCM.setForeground(Color.BLACK);
            tfNomeProd.setForeground(Color.BLACK);

            btnAdicionarProd.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela");
        }
    }

    public void insertProduto() {
        try (Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("INSERT INTO produtos (cod_produto, nome_produto, NCM) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, Integer.parseInt(tfCodProd.getText()));
            ps.setString(2, tfNomeProd.getText());
            ps.setInt(3, Integer.parseInt(tfNCM.getText()));
            ps.executeUpdate();

            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                int generatedId = generatedKeys.getInt(1);
            }

            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valor para inteiro: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar produto: " + e.getMessage());
        }
    }

    private void populateTable() {
        try (java.sql.Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT * FROM produtos WHERE status_produto = TRUE;"); ResultSet rs = ps.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.setColumnCount(4);
            model.setRowCount(0);

            while (rs.next()) {
                int idProduto = rs.getInt("id_produto");
                String codigoProduto = rs.getString("cod_produto");
                String ncm = rs.getString("NCM");
                String nomeProduto = rs.getString("nome_produto");

                Object[] row = {idProduto, codigoProduto, ncm, nomeProduto};
                model.addRow(row);
            }
            rs.close();

            DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
            cellRenderer.setForeground(Color.BLACK);
            cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            JTableHeader header = table1.getTableHeader();
            header.setDefaultRenderer(cellRenderer);

            TableColumnModel columnModel = table1.getColumnModel();
            for (int i = 0; i < columnModel.getColumnCount(); i++) {
                columnModel.getColumn(i).setCellRenderer(cellRenderer);
            }

            columnModel.getColumn(0).setHeaderValue("ID");
            columnModel.getColumn(1).setHeaderValue("Código Produto");
            columnModel.getColumn(2).setHeaderValue("NCM");
            columnModel.getColumn(3).setHeaderValue("Nome Produto");

            header.repaint();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela produtos: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.btnRounded btnAdicionarProd;
    private Components.btnRounded btnAtualizarProd;
    private Components.btnRounded btnEdicao;
    private Components.btnRounded btnRemoverProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.table table1;
    private test.RoundedTextField tfCodProd;
    private test.RoundedTextField tfNCM;
    private test.RoundedTextField tfNomeProd;
    // End of variables declaration//GEN-END:variables
}
