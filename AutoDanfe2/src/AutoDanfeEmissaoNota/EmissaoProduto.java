package AutoDanfeEmissaoNota;

import Controller.Program;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class EmissaoProduto extends javax.swing.JInternalFrame {


    public EmissaoProduto() {
        initComponents();

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
        table1 = new Components.table();

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
        tfValor.setText("39,80");
        tfValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfValorFocusLost(evt);
            }
        });

        tfQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfQuantidade.setText("0");
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camisa Social Azul Grafil ML M", "Calça Azul M", "Camiseta  Azul ML XGG" }));
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

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table1);

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
                        .addGap(0, 12, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarDest, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextDefinitions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextDefinitionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextDefinitionsActionPerformed
        Program.getEmissaoProduto().setVisible(false);
        Program.getEmissaoDefinicoes().setVisible(true);
    }//GEN-LAST:event_btnNextDefinitionsActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnVoltarDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDestActionPerformed
        Program.getEmissaoProduto().setVisible(false);
        Program.getEmissaoNota().setVisible(true);
    }//GEN-LAST:event_btnVoltarDestActionPerformed

    private void tfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantidadeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private Components.table table1;
    private Components.table tableItems;
    private test.RoundedTextField tfQuantidade;
    private test.RoundedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
