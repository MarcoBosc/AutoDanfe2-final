package AutoDanfeEmissaoNota;

import AutoDanfeCadCliente.ConexaoPG;
import Controller.Program;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EmissaoTransp extends javax.swing.JInternalFrame {

    public EmissaoTransp() {
        initComponents();
        LbAviso.setVisible(false);
        populateComboBox();
        CBMeiodeTransp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desabilitarCamposSeNecessario();
            }
        });

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
        btnNextRevisao = new Components.btnRounded();
        btnVoltarDef = new Components.btnRounded();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        CBMeiodeTransp = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CbTransp = new javax.swing.JComboBox<>();
        tbEspecie = new test.RoundedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        tbQuantidadeVol = new test.RoundedTextField();
        jLabel11 = new javax.swing.JLabel();
        lbPesoBruto = new test.RoundedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tbPesoLiquido = new test.RoundedTextField();
        LbAviso = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1000, 596));
        setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel1.setBackground(new java.awt.Color(223, 223, 223));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 596));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 596));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Automação de Nf-e");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel2.setText("1. Destinatário");

        jLabel4.setText("2. Produtos");

        jLabel3.setText("3. Definições");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
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
                .addContainerGap(183, Short.MAX_VALUE))
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

        btnNextRevisao.setBackground(new java.awt.Color(0, 153, 153));
        btnNextRevisao.setForeground(new java.awt.Color(255, 255, 255));
        btnNextRevisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconNext.png"))); // NOI18N
        btnNextRevisao.setText("Próximo");
        btnNextRevisao.setBorderColor(new java.awt.Color(0, 153, 153));
        btnNextRevisao.setColor(new java.awt.Color(0, 153, 153));
        btnNextRevisao.setColorClick(new java.awt.Color(0, 116, 116));
        btnNextRevisao.setColorOver(new java.awt.Color(0, 127, 127));
        btnNextRevisao.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNextRevisao.setMaximumSize(new java.awt.Dimension(142, 30));
        btnNextRevisao.setMinimumSize(new java.awt.Dimension(142, 30));
        btnNextRevisao.setPreferredSize(new java.awt.Dimension(142, 30));
        btnNextRevisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextRevisaoActionPerformed(evt);
            }
        });

        btnVoltarDef.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltarDef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconBack.png"))); // NOI18N
        btnVoltarDef.setText("Voltar");
        btnVoltarDef.setBorderColor(new java.awt.Color(204, 204, 204));
        btnVoltarDef.setColor(new java.awt.Color(204, 204, 204));
        btnVoltarDef.setColorClick(new java.awt.Color(159, 159, 159));
        btnVoltarDef.setColorOver(new java.awt.Color(184, 184, 184));
        btnVoltarDef.setMaximumSize(new java.awt.Dimension(142, 30));
        btnVoltarDef.setMinimumSize(new java.awt.Dimension(142, 30));
        btnVoltarDef.setPreferredSize(new java.awt.Dimension(142, 30));
        btnVoltarDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarDefActionPerformed(evt);
            }
        });

        jLabel7.setText("Meio de transporte");

        CBMeiodeTransp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 - Contratação do Frete por conta do Remetente (CIF)", "1 - Contratação do Frete por conta do Destinatário (FOB)", "2 - Contratação do Frete por conta de Terceiros", "3 - Transporte Próprio por conta do Remetente", "4 - Transporte Próprio por conta do Destinatário", "9 - Sem frete" }));

        jLabel9.setText("Selecione a transportadora:");

        CbTransp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        CbTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbTranspActionPerformed(evt);
            }
        });

        tbEspecie.setPreferredSize(new java.awt.Dimension(125, 22));

        jLabel10.setText("Espécie de volume:");

        jLabel11.setText("Peso Liquido(kg):");

        jLabel12.setText("Qtd. Volumes:");

        jLabel13.setText("Peso Bruto(kg):");

        tbPesoLiquido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPesoLiquidoActionPerformed(evt);
            }
        });

        LbAviso.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        LbAviso.setForeground(new java.awt.Color(153, 153, 153));
        LbAviso.setText("Para essa Opção de meio de transporte não precisará completar os campos abaixo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBMeiodeTransp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbTransp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(323, 323, 323))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnVoltarDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNextRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(tbPesoLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbPesoBruto, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(tbQuantidadeVol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(LbAviso)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBMeiodeTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(LbAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbQuantidadeVol, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPesoBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbPesoLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 147, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNextRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltarDef, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))))
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

    private void btnVoltarDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDefActionPerformed
        Program.getEmissaoTransp().setVisible(false);
        Program.getEmissaoDefinicoes().setVisible(true);
    }//GEN-LAST:event_btnVoltarDefActionPerformed

    private void btnNextRevisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextRevisaoActionPerformed
        System.out.println("Botão 'Next Revisão' acionado.");

    if (!verificarCamposCompletos()) {
        System.out.println("Campos não estão completos. O evento será interrompido.");
        return;
    }

    System.out.println("Campos estão completos. Continuando a execução do evento...");

    writeJsonToFile();
    System.out.println("writeJsonToFile() executado com sucesso.");

    executarJsonToString();
    System.out.println("executarJsonToString() executado com sucesso.");

    Program.getEmissaoTransp().setVisible(false);
    System.out.println("Visibilidade de Program.getEmissaoTransp() alterada para false.");

    Program.getEmissaoRevisao().setVisible(true);
    System.out.println("Visibilidade de Program.getEmissaoRevisao() alterada para true.");

    Program.getEmissaoRevisao().lerArquivoTxt("string.txt");
    System.out.println("Program.getEmissaoRevisao().lerArquivoTxt() executado com sucesso.");

    }//GEN-LAST:event_btnNextRevisaoActionPerformed

    private void CbTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbTranspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbTranspActionPerformed

    private void tbPesoLiquidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPesoLiquidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPesoLiquidoActionPerformed

    private void populateComboBox() {
        try (Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT * FROM transportadoras ORDER BY razao_social_transp ASC"); ResultSet rs = ps.executeQuery()) {

            CbTransp.removeAllItems();

            while (rs.next()) {
                String nomeTransportadora = rs.getString("razao_social_transp");
                CbTransp.addItem(nomeTransportadora);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela transportadoras: " + e.getMessage());
        }
    }

    private Object[] getTransportData() {
        String meioTransp = CBMeiodeTransp.getSelectedItem().toString();
        String especie = "";
        int quantidadeVol = 0;
        double pesoLiquido = 0.0;
        double pesoBruto = 0.0;

        if (meioTransp.startsWith("0") || meioTransp.startsWith("1") || meioTransp.startsWith("2")) {
            especie = tbEspecie.getText();
            quantidadeVol = Integer.parseInt(tbQuantidadeVol.getText());
            pesoLiquido = Double.parseDouble(tbPesoLiquido.getText());
            pesoBruto = Double.parseDouble(lbPesoBruto.getText());
        }

        Object[] transportData = new Object[5];
        transportData[0] = meioTransp;
        transportData[1] = getSelectedTransportadoraId();
        JSONObject volumeData = new JSONObject();
        volumeData.put("especie", especie);
        volumeData.put("qtd_volume", quantidadeVol);
        volumeData.put("peso_liq", pesoLiquido);
        volumeData.put("peso_bruto", pesoBruto);
        transportData[2] = volumeData;

        return transportData;
    }

    private int getSelectedTransportadoraId() {
        int selectedId = 0;
        String selectedTransportadora = CbTransp.getSelectedItem().toString();

        try (Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT id_transportadora FROM transportadoras WHERE razao_social_transp = ?");) {
            ps.setString(1, selectedTransportadora);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                selectedId = rs.getInt("id_transportadora");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o ID da transportadora: " + e.getMessage());
        }

        return selectedId;
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
        String meioTransp = CBMeiodeTransp.getSelectedItem().toString();
        String transportadora = (String) CbTransp.getSelectedItem();
        String especie = "";
        int quantidadeVol = 0;
        double pesoLiquido = 0.0;
        double pesoBruto = 0.0;

        if (meioTransp.startsWith("0") || meioTransp.startsWith("1") || meioTransp.startsWith("2")) {
            especie = tbEspecie.getText();
            quantidadeVol = Integer.parseInt(tbQuantidadeVol.getText());
            pesoLiquido = Double.parseDouble(tbPesoLiquido.getText());
            pesoBruto = Double.parseDouble(lbPesoBruto.getText());
        }

        try {
            String fileName = "json.txt";
            StringBuilder jsonContent = new StringBuilder();

            jsonContent.append("  \"transportadora\": {\n");
            jsonContent.append("   \"meio_transporte\": \"" + meioTransp + "\",\n");
            jsonContent.append("    \"id_transp\": \"" + getSelectedTransportadoraId() + "\",\n");
            jsonContent.append("    \"razao_social\": \"" + transportadora + "\",\n");
            jsonContent.append("    \"especie\": \"" + especie + "\",\n");
            jsonContent.append("    \"quantidadeVol\": \"" + quantidadeVol + "\",\n");
            jsonContent.append("    \"peso_liquido\": \"" + pesoLiquido + "\",\n");
            jsonContent.append("    \"peso_bruto\": \"" + pesoBruto + "\"\n");
            jsonContent.append("  }\n");
            jsonContent.append("}\n");

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

    private void executarJsonToString() {
        ProcessBuilder pb = new ProcessBuilder("python3", "jsonToString.py");

        try {
            // Iniciar o processo e esperar pela sua conclusão
            Process p = pb.start();
            p.waitFor();

            // Imprimir a saída do processo, se houver
            if (p.getInputStream().available() > 0) {
                byte[] buffer = new byte[1024];
                int bytesRead = p.getInputStream().read(buffer);
                System.out.println(new String(buffer, 0, bytesRead));
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void desabilitarCamposSeNecessario() {
        String opcaoSelecionada = CBMeiodeTransp.getSelectedItem().toString();

        if (opcaoSelecionada.equals("3 - Transporte Próprio por conta do Remetente")
                || opcaoSelecionada.equals("4 - Transporte Próprio por conta do Destinatário")
                || opcaoSelecionada.equals("9 - Sem frete")) {

            lbPesoBruto.setEnabled(false);
            tbEspecie.setEnabled(false);
            tbPesoLiquido.setEnabled(false);
            tbQuantidadeVol.setEnabled(false);
            LbAviso.setVisible(true);
        } else {

            lbPesoBruto.setEnabled(true);
            tbEspecie.setEnabled(true);
            tbPesoLiquido.setEnabled(true);
            tbQuantidadeVol.setEnabled(true);
            LbAviso.setVisible(false);
        }
    }

    private boolean verificarCamposCompletos() {

        String selectedItem = CBMeiodeTransp.getSelectedItem().toString();
        boolean opcoesSelecionadas = selectedItem.startsWith("0") || selectedItem.startsWith("1") || selectedItem.startsWith("2");

        boolean segundaCbSelecionada = CbTransp.getSelectedIndex() != -1;

        if (opcoesSelecionadas) {

            if (lbPesoBruto.getText().isEmpty() || tbEspecie.getText().isEmpty()
                    || tbPesoLiquido.getText().isEmpty() || tbQuantidadeVol.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios antes de prosseguir.");
                return false;
            }
        } else if (!segundaCbSelecionada) {
            JOptionPane.showMessageDialog(this, "Selecione uma transportadora antes de prosseguir.");
            return false;
        }

        if (opcoesSelecionadas) {
            if (lbPesoBruto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, " 'Peso Bruto' não foi preenchido. Preencha-o antes de prosseguir.");
                return false;
            }

            if (tbEspecie.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, " 'Espécie de volume' não foi preenchido. Preencha-o antes de prosseguir.");
                return false;
            }

            if (tbPesoLiquido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "'Peso Líquido' não foi preenchido. Preencha-o antes de prosseguir.");
                return false;
            }

            if (tbQuantidadeVol.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "'Quantidade de Volumes' não foi preenchido. Preencha-o antes de prosseguir.");
                return false;
            }
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBMeiodeTransp;
    private javax.swing.JComboBox<String> CbTransp;
    private javax.swing.JLabel LbAviso;
    private Components.btnRounded btnNextRevisao;
    private Components.btnRounded btnVoltarDef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private test.RoundedTextField lbPesoBruto;
    private test.RoundedTextField tbEspecie;
    private test.RoundedTextField tbPesoLiquido;
    private test.RoundedTextField tbQuantidadeVol;
    // End of variables declaration//GEN-END:variables
}
