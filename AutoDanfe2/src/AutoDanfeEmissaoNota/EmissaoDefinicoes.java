package AutoDanfeEmissaoNota;

import Controller.Program;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class EmissaoDefinicoes extends javax.swing.JInternalFrame {

    private List<String> datesList = new ArrayList<>();

    public EmissaoDefinicoes() {
        initComponents();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    private void addToDatesList() {
        String dateValue = dateParcela.getDate();
        datesList.add(dateValue);
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
        btnNextTransp = new Components.btnRounded();
        btnVoltarProd = new Components.btnRounded();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddParcela = new Components.btnRounded();
        btnRemover = new Components.btnRounded();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaParcelas = new Components.RoundedTextArea();
        dateParcela = new Components.FormattedDateEntry();
        jLabel8 = new javax.swing.JLabel();
        radioBtnEstadual = new javax.swing.JRadioButton();
        radioBtnInterestadual = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        tbOrdemCompra = new test.RoundedTextField();

        setMinimumSize(new java.awt.Dimension(1000, 596));
        setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel1.setBackground(new java.awt.Color(223, 223, 223));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Automação de Nf-e");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel2.setText("1. Destinatário");

        jLabel4.setText("2. Produtos");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
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

        btnNextTransp.setBackground(new java.awt.Color(0, 153, 153));
        btnNextTransp.setForeground(new java.awt.Color(255, 255, 255));
        btnNextTransp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconNext.png"))); // NOI18N
        btnNextTransp.setText("Próximo");
        btnNextTransp.setBorderColor(new java.awt.Color(0, 153, 153));
        btnNextTransp.setColor(new java.awt.Color(0, 153, 153));
        btnNextTransp.setColorClick(new java.awt.Color(0, 116, 116));
        btnNextTransp.setColorOver(new java.awt.Color(0, 127, 127));
        btnNextTransp.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNextTransp.setMaximumSize(new java.awt.Dimension(142, 30));
        btnNextTransp.setMinimumSize(new java.awt.Dimension(142, 30));
        btnNextTransp.setPreferredSize(new java.awt.Dimension(142, 30));
        btnNextTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextTranspActionPerformed(evt);
            }
        });

        btnVoltarProd.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconBack.png"))); // NOI18N
        btnVoltarProd.setText("Voltar");
        btnVoltarProd.setBorderColor(new java.awt.Color(204, 204, 204));
        btnVoltarProd.setColor(new java.awt.Color(204, 204, 204));
        btnVoltarProd.setColorClick(new java.awt.Color(159, 159, 159));
        btnVoltarProd.setColorOver(new java.awt.Color(184, 184, 184));
        btnVoltarProd.setMaximumSize(new java.awt.Dimension(142, 30));
        btnVoltarProd.setMinimumSize(new java.awt.Dimension(142, 30));
        btnVoltarProd.setPreferredSize(new java.awt.Dimension(142, 30));
        btnVoltarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarProdActionPerformed(evt);
            }
        });

        jLabel7.setText("Adicionar parcelas:");

        btnAddParcela.setBackground(new java.awt.Color(0, 153, 153));
        btnAddParcela.setForeground(new java.awt.Color(255, 255, 255));
        btnAddParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionarLogo.png"))); // NOI18N
        btnAddParcela.setText("Adicionar");
        btnAddParcela.setBorderColor(new java.awt.Color(0, 153, 153));
        btnAddParcela.setColor(new java.awt.Color(0, 153, 153));
        btnAddParcela.setColorClick(new java.awt.Color(2, 122, 122));
        btnAddParcela.setColorOver(new java.awt.Color(1, 142, 142));
        btnAddParcela.setMaximumSize(new java.awt.Dimension(114, 30));
        btnAddParcela.setMinimumSize(new java.awt.Dimension(114, 30));
        btnAddParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddParcelaActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(153, 0, 0));
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/removeIcon.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorderColor(new java.awt.Color(153, 0, 0));
        btnRemover.setColor(new java.awt.Color(153, 0, 0));
        btnRemover.setColorClick(new java.awt.Color(108, 3, 3));
        btnRemover.setColorOver(new java.awt.Color(131, 2, 2));
        btnRemover.setMaximumSize(new java.awt.Dimension(114, 30));
        btnRemover.setMinimumSize(new java.awt.Dimension(114, 30));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        txaParcelas.setColumns(20);
        txaParcelas.setRows(5);
        txaParcelas.setText("Parcelas adicionadas:");
        txaParcelas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txaParcelasFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txaParcelas);

        dateParcela.setBackground(new java.awt.Color(223, 223, 223));
        dateParcela.setMinimumSize(new java.awt.Dimension(128, 43));

        jLabel8.setBackground(new java.awt.Color(223, 223, 223));
        jLabel8.setText("Tipo de operação:");

        radioBtnEstadual.setText("Estadual");
        radioBtnEstadual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnEstadualActionPerformed(evt);
            }
        });

        radioBtnInterestadual.setText("Interestadual");
        radioBtnInterestadual.setToolTipText("");
        radioBtnInterestadual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnInterestadualActionPerformed(evt);
            }
        });

        jLabel9.setText("Ordem de compra:");

        tbOrdemCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbOrdemCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAddParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(dateParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtnInterestadual)
                            .addComponent(radioBtnEstadual)
                            .addComponent(jLabel8))
                        .addGap(426, 426, 426))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbOrdemCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(428, 428, 428))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnVoltarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNextTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(dateParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtnEstadual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnInterestadual)
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbOrdemCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextTranspActionPerformed
        if (!verificarCamposPreenchidos()) {
            return;
        }
        saveRadioButtonSelection();
        Program.getEmissaoDefinicoes().setVisible(false);
        Program.getEmissaoTransp().setVisible(true);
        writeJsonToFile();
    }//GEN-LAST:event_btnNextTranspActionPerformed

    private void btnVoltarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarProdActionPerformed
        Program.getEmissaoDefinicoes().setVisible(false);
        Program.getEmissaoProduto().setVisible(true);
    }//GEN-LAST:event_btnVoltarProdActionPerformed

    private void txaParcelasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txaParcelasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txaParcelasFocusGained

    private void btnAddParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddParcelaActionPerformed
        appendDateFromFormattedDateEntryToTextArea();
        addToDatesList();
        String data = dateParcela.getDate();
        datesList.add(data);
        dateParcela.setDate(null);
    }//GEN-LAST:event_btnAddParcelaActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        removeFromDatesList();
        clearTextArea();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void radioBtnEstadualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnEstadualActionPerformed
        if (radioBtnEstadual.isSelected()) {
            radioBtnInterestadual.setSelected(false);
        }
    }//GEN-LAST:event_radioBtnEstadualActionPerformed

    private void tbOrdemCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbOrdemCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbOrdemCompraActionPerformed

    private void radioBtnInterestadualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnInterestadualActionPerformed
        if (radioBtnInterestadual.isSelected()) {
            radioBtnEstadual.setSelected(false);
        }
    }//GEN-LAST:event_radioBtnInterestadualActionPerformed

    private void appendDateFromFormattedDateEntryToTextArea() {
        String dateText = dateParcela.getDate();
        String currentText = txaParcelas.getText();
        String newText = currentText + "\n" + dateText;
        txaParcelas.setText(newText);
    }

    private void removeFromDatesList() {
        if (!datesList.isEmpty()) {
            datesList.remove(datesList.size() - 1);
        }
    }

    private void clearTextArea() {
        String text = txaParcelas.getText();
        if (!text.isEmpty()) {
            int lastIndex = text.lastIndexOf("\n");
            if (lastIndex >= 0) {
                txaParcelas.setText(text.substring(0, lastIndex));
            } else {
                txaParcelas.setText("");
            }
        }
    }

    private void saveRadioButtonSelection() {
        List<String> parcelas = new ArrayList<>();
        String tipoOp = "";
        String ordemCompra = "";

        if (radioBtnEstadual.isSelected()) {
            tipoOp = "estadual";
            String textFieldValue = tbOrdemCompra.getText();
            ordemCompra = textFieldValue;
        }

        if (radioBtnInterestadual.isSelected()) {
            tipoOp = "interestadual";
            String textFieldValue = tbOrdemCompra.getText();
            ordemCompra = textFieldValue;
        }

        parcelas.addAll(datesList);

        JSONObject json = new JSONObject();

        json.put("parcelas", new JSONArray(parcelas));
        json.put("tipo_op", tipoOp);
        json.put("ordem_compra", ordemCompra);

    }

    private void writeJsonToFile() {
        try {
            String fileName = "json.txt";
            StringBuilder jsonContent = new StringBuilder();
            String OrdemCompra = tbOrdemCompra.getText();
            String tipoOp = "Interestadual";
            if (radioBtnEstadual.isSelected()) {
                tipoOp = "estadual";
            }
            jsonContent.append("\"definicoes\": {\n");

            // Adicionar as parcelas
            jsonContent.append("   \"parcelas\": [");

            for (int i = 0; i < datesList.size(); i++) {
                String parcela = "\"" + datesList.get(i) + "\"";
                jsonContent.append(parcela);

                if (i < datesList.size() - 1) {
                    jsonContent.append(", ");
                }
            }

            jsonContent.append("],\n");

            jsonContent.append("    \"tipo_op\": \"" + tipoOp + "\",\n");
            jsonContent.append("    \"tbOrdemCompra\": \"" + OrdemCompra + "\"\n");
            jsonContent.append("  },\n");

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
                    writer.write("," + jsonContent.toString());
                    System.out.println("Data written to the JSON file successfully.");
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the JSON file: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the JSON object: " + e.getMessage());
        }
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

    private boolean verificarCamposPreenchidos() {
        String textoParcelas = txaParcelas.getText().trim();
        String textoPadrao = "Parcelas adicionadas:";
        if (textoParcelas.isEmpty() || textoParcelas.equals(textoPadrao)) {
            JOptionPane.showMessageDialog(this, "Adicione parcelas antes de prosseguir.");
            return false;
        }

        // Verificar se pelo menos um dos JRadioButtons radioBtnEstadual ou radioBtnInterestadual foi selecionado
        if (!radioBtnEstadual.isSelected() && !radioBtnInterestadual.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de operação antes de seguir.");
            return false;
        }

        // Verificar se RoundedTextField tbOrdemCompra foi preenchido
        if (tbOrdemCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite uma ordem de compra antes de prosseguir");
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.btnRounded btnAddParcela;
    private Components.btnRounded btnNextTransp;
    private Components.btnRounded btnRemover;
    private Components.btnRounded btnVoltarProd;
    private Components.FormattedDateEntry dateParcela;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radioBtnEstadual;
    private javax.swing.JRadioButton radioBtnInterestadual;
    private test.RoundedTextField tbOrdemCompra;
    private Components.RoundedTextArea txaParcelas;
    // End of variables declaration//GEN-END:variables
}
