package AutoDanfeEmissaoNota;

import AutoDanfeCadCliente.ConexaoPG;
import AutoDanfeMenu.AutoDanfeMenu;
import Controller.Program;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import org.json.JSONException;

public class EmissaoDestinatario extends javax.swing.JInternalFrame {

    public EmissaoDestinatario() {
        initComponents();
        populateTable();
        configureTable();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    private void configureTable() {
        table1.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnProxProd = new Components.btnRounded();
        tfPesquisarEmpresa = new test.RoundedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Components.table();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 596));

        jpPrincipal.setBackground(new java.awt.Color(223, 223, 223));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(988, 35));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Automação de Nf-e");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setText("1. Destinatário");

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

        btnProxProd.setBackground(new java.awt.Color(0, 153, 153));
        btnProxProd.setForeground(new java.awt.Color(255, 255, 255));
        btnProxProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconNext.png"))); // NOI18N
        btnProxProd.setText("Próximo");
        btnProxProd.setBorderColor(new java.awt.Color(0, 153, 153));
        btnProxProd.setColor(new java.awt.Color(0, 153, 153));
        btnProxProd.setColorClick(new java.awt.Color(0, 116, 116));
        btnProxProd.setColorOver(new java.awt.Color(0, 127, 127));
        btnProxProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnProxProd.setMaximumSize(new java.awt.Dimension(142, 30));
        btnProxProd.setMinimumSize(new java.awt.Dimension(142, 30));
        btnProxProd.setPreferredSize(new java.awt.Dimension(142, 30));
        btnProxProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxProdActionPerformed(evt);
            }
        });

        tfPesquisarEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPesquisarEmpresaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesquisarEmpresaFocusLost(evt);
            }
        });
        tfPesquisarEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarEmpresaKeyReleased(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel7.setText("Pesquisar por nome:");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProxProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(tfPesquisarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnProxProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProxProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxProdActionPerformed
        if (!verificarSelecaoTabela()) {
            return;
        }
        String razaoSocial = tfPesquisarEmpresa.getText();
        searchCnpjAndWriteToJson(razaoSocial);
        Program.getEmissaoNota().setVisible(false);
        Program.getEmissaoProduto().setVisible(true);
    }//GEN-LAST:event_btnProxProdActionPerformed

    private void tfPesquisarEmpresaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarEmpresaFocusGained
        tfPesquisarEmpresa.setText("");
    }//GEN-LAST:event_tfPesquisarEmpresaFocusGained

    private void tfPesquisarEmpresaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarEmpresaFocusLost

    }//GEN-LAST:event_tfPesquisarEmpresaFocusLost

    private void tfPesquisarEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarEmpresaKeyReleased
        searchRows();
    }//GEN-LAST:event_tfPesquisarEmpresaKeyReleased

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        setSelectedRazaoSocial();
    }//GEN-LAST:event_table1MouseClicked

    public void populateTable() {
        Connection conn = ConexaoPG.getConnection();

        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM clientes WHERE status_cliente = TRUE ORDER BY razao_social_cliente");
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                model.setColumnCount(9);
                model.setRowCount(0);

                while (rs.next()) {
                    String cep = rs.getString("CEP_cliente");
                    String cnpj = rs.getString("CNPJ_cliente");
                    String ie = rs.getString("IE_cliente");
                    String municipio = rs.getString("municipio_cliente");
                    String num_residencia = rs.getString("num_residencial");
                    String razao_social = rs.getString("razao_social_cliente");
                    String rua = rs.getString("Logradouro_cliente");
                    String bairro = rs.getString("bairro_cliente");
                    String estado = rs.getString("uf_cliente");

                    Object[] rowData = {cnpj, razao_social, ie, cep, municipio, num_residencia, rua, bairro, estado};
                    model.addRow(rowData);
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
                columnModel.getColumn(0).setHeaderValue("CNPJ");
                columnModel.getColumn(1).setHeaderValue("Razão Social");
                columnModel.getColumn(2).setHeaderValue("IE");
                columnModel.getColumn(3).setHeaderValue("CEP");
                columnModel.getColumn(4).setHeaderValue("Município");
                columnModel.getColumn(5).setHeaderValue("Núm. Residência");
                columnModel.getColumn(6).setHeaderValue("Logradouro");
                columnModel.getColumn(7).setHeaderValue("Bairro");
                columnModel.getColumn(8).setHeaderValue("UF");
                header.repaint();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela clientes: " + e.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                }
            }
        }
    }

    private void addSearchListener() {
        tfPesquisarEmpresa.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                searchRows();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                searchRows();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                searchRows();
            }
        });
    }

    private void searchRows() {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table1.setRowSorter(sorter);

        String searchText = tfPesquisarEmpresa.getText();
        if (searchText.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
        }
    }

    private void setSelectedRazaoSocial() {
        int row = table1.getSelectedRow();
        if (row != -1) {
            String razaoSocial = table1.getValueAt(row, 1).toString();
            tfPesquisarEmpresa.setText(razaoSocial);
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

    private void writeJsonToFile(String cnpj) {
        try {
            String fileName = "json.txt";
            String jsonContent = "{\n"
                    + "  \"id_destinatario\": \"" + cnpj + "\",\n";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(jsonContent);
                System.out.println("CNPJ written to the JSON file successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the JSON file: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the JSON object: " + e.getMessage());
        }
    }

    private void searchCnpjAndWriteToJson(String razaoSocial) {
        Connection conn = ConexaoPG.getConnection();

        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT CNPJ_cliente FROM clientes WHERE razao_social_cliente = ?");
                ps.setString(1, razaoSocial);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String cnpj = rs.getString("CNPJ_cliente");
                    writeJsonToFile(cnpj);
                    /// preciso que o java pule uma linha aqui para quando ele escrever o próximo item do json que ele seja escrito na linha abaixo.
                } else {
                    System.out.println("No matching CNPJ found for the given razao social: " + razaoSocial);
                }

                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar o CNPJ: " + e.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                }
            }
        }
    }

    private String getCnpjFromDatabase(String razaoSocial) {
        Connection conn = ConexaoPG.getConnection();
        String cnpj = "";

        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT cnpj FROM clientes WHERE razao_social_cliente = ?");
                ps.setString(1, razaoSocial);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    cnpj = rs.getString("cnpj");
                }

                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar o CNPJ no banco de dados: " + e.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                }
            }
        }

        return cnpj;
    }

    private boolean verificarSelecaoTabela() {
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um Destinatário");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.btnRounded btnProxProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPrincipal;
    private Components.table table1;
    private test.RoundedTextField tfPesquisarEmpresa;
    // End of variables declaration//GEN-END:variables
}
