package AutoDanfeEmissaoNota;

import Controller.Program;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author marco
 */
public class EmissaoRevisao extends javax.swing.JInternalFrame {

    public EmissaoRevisao() {
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
        btnEmitirNfe = new Components.btnRounded();
        btnVoltarTransp = new Components.btnRounded();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaRevisaoNota = new javax.swing.JTextArea();

        setMinimumSize(new java.awt.Dimension(1000, 596));

        jPanel1.setBackground(new java.awt.Color(223, 223, 223));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Automação de Nf-e");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jLabel2.setText("1. Destinatário");

        jLabel4.setText("2. Produtos");

        jLabel3.setText("3. Definições");

        jLabel5.setText("4. Transporte");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
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
                .addContainerGap(222, Short.MAX_VALUE))
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

        btnEmitirNfe.setBackground(new java.awt.Color(0, 153, 153));
        btnEmitirNfe.setForeground(new java.awt.Color(255, 255, 255));
        btnEmitirNfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emitirIcon.png"))); // NOI18N
        btnEmitirNfe.setText("Emitir Nf-e");
        btnEmitirNfe.setBorderColor(new java.awt.Color(0, 153, 153));
        btnEmitirNfe.setColor(new java.awt.Color(0, 153, 153));
        btnEmitirNfe.setColorClick(new java.awt.Color(0, 116, 116));
        btnEmitirNfe.setColorOver(new java.awt.Color(0, 127, 127));
        btnEmitirNfe.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEmitirNfe.setIconTextGap(8);
        btnEmitirNfe.setMaximumSize(new java.awt.Dimension(142, 30));
        btnEmitirNfe.setMinimumSize(new java.awt.Dimension(142, 30));
        btnEmitirNfe.setPreferredSize(new java.awt.Dimension(142, 30));
        btnEmitirNfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirNfeActionPerformed(evt);
            }
        });

        btnVoltarTransp.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltarTransp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconBack.png"))); // NOI18N
        btnVoltarTransp.setText("Voltar");
        btnVoltarTransp.setBorderColor(new java.awt.Color(204, 204, 204));
        btnVoltarTransp.setColor(new java.awt.Color(204, 204, 204));
        btnVoltarTransp.setColorClick(new java.awt.Color(159, 159, 159));
        btnVoltarTransp.setColorOver(new java.awt.Color(184, 184, 184));
        btnVoltarTransp.setMaximumSize(new java.awt.Dimension(142, 30));
        btnVoltarTransp.setMinimumSize(new java.awt.Dimension(142, 30));
        btnVoltarTransp.setPreferredSize(new java.awt.Dimension(142, 30));
        btnVoltarTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTranspActionPerformed(evt);
            }
        });

        TaRevisaoNota.setEditable(false);
        TaRevisaoNota.setColumns(20);
        TaRevisaoNota.setRows(5);
        jScrollPane1.setViewportView(TaRevisaoNota);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltarTransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(649, 649, 649)
                        .addComponent(btnEmitirNfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmitirNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmitirNfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirNfeActionPerformed
        ///Emissao da nota
    }//GEN-LAST:event_btnEmitirNfeActionPerformed

    private void btnVoltarTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTranspActionPerformed
        Program.getEmissaoRevisao().setVisible(false);
        Program.getEmissaoTransp().setVisible(true);
    }//GEN-LAST:event_btnVoltarTranspActionPerformed

    private static class Item {
        private String valorUnidade;
        private String idProd;
        private String quantidade;

        public Item(String valorUnidade, String idProd, String quantidade) {
            this.valorUnidade = valorUnidade;
            this.idProd = idProd;
            this.quantidade = quantidade;
        }
    }
    
    
    public void populateRevisaoNotaTextArea() {
        try {
            // Abre o arquivo JSON
            FileReader reader = new FileReader("json.txt");

            // Converte o arquivo em objeto JSON
            JSONObject jsonObject = new JSONObject(reader);

            // Obtém os valores das variáveis do JSON
            String idDestinatario = jsonObject.getString("id_destinatario");

            JSONArray itensArray = jsonObject.getJSONArray("itens");
            // Percorre o array de itens
            for (int i = 0; i < itensArray.length(); i++) {
                JSONObject itemObject = itensArray.getJSONObject(i);
                String valorUnidade = itemObject.getString("valor_unidade");
                String idProd = itemObject.getString("id_prod");
                String quantidade = itemObject.getString("quantidade");

                // Faça o que for necessário com os valores do item
                // Exemplo: criar um objeto Item e adicioná-lo a uma lista
                Item item = new Item(valorUnidade, idProd, quantidade);
                // listaDeItens.add(item);
            }

            JSONArray parcelasArray = jsonObject.getJSONArray("parcelas");
            // Percorre o array de parcelas
            for (int i = 0; i < parcelasArray.length(); i++) {
                String parcela = parcelasArray.getString(i);

                // Faça o que for necessário com cada parcela
            }

            String tipoOp = jsonObject.getString("tipo_op");
            String ordemCompra = jsonObject.getString("ordem_compra");

            JSONObject volumeObject = jsonObject.getJSONObject("volume");
            String especie = volumeObject.getString("especie");
            int pesoBruto = volumeObject.getInt("peso_bruto");
            int qtdVolume = volumeObject.getInt("qtd_volume");
            int pesoLiq = volumeObject.getInt("peso_liq");

            int idTransportadora = jsonObject.getInt("id_transportadora");
            String meioTransp = jsonObject.getString("meio_transp");

            System.out.println("tipoOp: " + tipoOp);
            System.out.println("ordemCompra: " + ordemCompra);
            System.out.println("especie: " + especie);
            System.out.println("pesoBruto: " + pesoBruto);
            System.out.println("qtdVolume: " + qtdVolume);
            System.out.println("pesoLiq: " + pesoLiq);
            System.out.println("idTransportadora: " + idTransportadora);
            System.out.println("meioTransp: " + meioTransp);

            // Fechar o leitor de arquivo
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }   
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TaRevisaoNota;
    private Components.btnRounded btnEmitirNfe;
    private Components.btnRounded btnVoltarTransp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
