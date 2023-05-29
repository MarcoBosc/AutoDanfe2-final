package AutoDanfeCadCliente;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import AutoDanfeCadCliente.apiCEP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroClientes extends javax.swing.JInternalFrame {

    public CadastroClientes() {
        initComponents();
        tfRazaoSocialCliente.setForeground(Color.GRAY);
        tfCEPCliente.setForeground(Color.GRAY);
        tfMunicipioCliente.setForeground(Color.GRAY);
        tfCNPJCliente.setForeground(Color.GRAY);
        tfInscricaoEstadualCliente.setForeground(Color.GRAY);
        tfNumeroResiCliente.setForeground(Color.GRAY);

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        tfRazaoSocialCliente = new test.RoundedTextField();
        tfCEPCliente = new test.RoundedTextField();
        tfMunicipioCliente = new test.RoundedTextField();
        tfCNPJCliente = new test.RoundedTextField();
        tfInscricaoEstadualCliente = new test.RoundedTextField();
        tfNumeroResiCliente = new test.RoundedTextField();
        btnAdicionarCLientes = new Components.btnRounded();
        btnRemoverCLientes = new Components.btnRounded();
        btnAtualizarClientes = new Components.btnRounded();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Components.table();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 596));
        setMinimumSize(new java.awt.Dimension(1000, 596));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 596));

        jpPrincipal.setBackground(new java.awt.Color(223, 223, 223));

        tfRazaoSocialCliente.setText("Aimê Uniformes e Cia Ltda");
        tfRazaoSocialCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfRazaoSocialCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfRazaoSocialClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfRazaoSocialClienteFocusLost(evt);
            }
        });

        tfCEPCliente.setText("99700-274");
        tfCEPCliente.setPreferredSize(new java.awt.Dimension(108, 22));
        tfCEPCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfCEPCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCEPClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCEPClienteFocusLost(evt);
            }
        });

        tfMunicipioCliente.setText("Erechim");
        tfMunicipioCliente.setPreferredSize(new java.awt.Dimension(108, 22));
        tfMunicipioCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfMunicipioCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfMunicipioClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfMunicipioClienteFocusLost(evt);
            }
        });
        tfMunicipioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMunicipioClienteActionPerformed(evt);
            }
        });

        tfCNPJCliente.setText("01.834.341.0001-23");
        tfCNPJCliente.setMinimumSize(new java.awt.Dimension(108, 22));
        tfCNPJCliente.setPreferredSize(new java.awt.Dimension(108, 22));
        tfCNPJCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfCNPJCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCNPJClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCNPJClienteFocusLost(evt);
            }
        });

        tfInscricaoEstadualCliente.setText("388.108.598.269");
        tfInscricaoEstadualCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfInscricaoEstadualCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfInscricaoEstadualClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfInscricaoEstadualClienteFocusLost(evt);
            }
        });

        tfNumeroResiCliente.setText("41");
        tfNumeroResiCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfNumeroResiCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNumeroResiClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNumeroResiClienteFocusLost(evt);
            }
        });

        btnAdicionarCLientes.setBackground(new java.awt.Color(0, 153, 153));
        btnAdicionarCLientes.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarCLientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionarLogo.png"))); // NOI18N
        btnAdicionarCLientes.setText("Adicionar");
        btnAdicionarCLientes.setBorderColor(new java.awt.Color(0, 153, 153));
        btnAdicionarCLientes.setBorderPainted(false);
        btnAdicionarCLientes.setColor(new java.awt.Color(0, 153, 153));
        btnAdicionarCLientes.setColorClick(new java.awt.Color(0, 134, 134));
        btnAdicionarCLientes.setColorOver(new java.awt.Color(0, 114, 114));
        btnAdicionarCLientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCLientesActionPerformed(evt);
            }
        });

        btnRemoverCLientes.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoverCLientes.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverCLientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelarLogo.png"))); // NOI18N
        btnRemoverCLientes.setText("Remover");
        btnRemoverCLientes.setBorderColor(new java.awt.Color(153, 0, 0));
        btnRemoverCLientes.setBorderPainted(false);
        btnRemoverCLientes.setColor(new java.awt.Color(153, 0, 0));
        btnRemoverCLientes.setColorClick(new java.awt.Color(175, 0, 0));
        btnRemoverCLientes.setColorOver(new java.awt.Color(154, 0, 0));
        btnRemoverCLientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCLientesActionPerformed(evt);
            }
        });

        btnAtualizarClientes.setBackground(new java.awt.Color(191, 189, 189));
        btnAtualizarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atualizarLogo.png"))); // NOI18N
        btnAtualizarClientes.setText("Atualizar");
        btnAtualizarClientes.setBorderColor(new java.awt.Color(191, 189, 189));
        btnAtualizarClientes.setBorderPainted(false);
        btnAtualizarClientes.setColor(new java.awt.Color(191, 189, 189));
        btnAtualizarClientes.setColorClick(new java.awt.Color(159, 159, 159));
        btnAtualizarClientes.setColorOver(new java.awt.Color(184, 180, 180));
        btnAtualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClientesActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CNPJ", "Razão Social", "IE", "CEP", "Município", "Nº Residencial"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel2.setText("Razão Social:");

        jLabel3.setText("CEP:");

        jLabel4.setText("Município:");

        jLabel5.setText("CNPJ:");

        jLabel6.setText("Inscrião Estadual:");

        jLabel7.setText("Número Residencial:");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395))
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpPrincipalLayout.createSequentialGroup()
                                .addGap(0, 441, Short.MAX_VALUE)
                                .addComponent(btnAtualizarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnRemoverCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnAdicionarCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpPrincipalLayout.createSequentialGroup()
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCEPCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                    .addComponent(tfRazaoSocialCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfMunicipioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfCNPJCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfInscricaoEstadualCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfNumeroResiCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRazaoSocialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCNPJCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfInscricaoEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroResiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarCLientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCLientesActionPerformed
        insertCliente();
        populateTable();
    }//GEN-LAST:event_btnAdicionarCLientesActionPerformed

    private void tfRazaoSocialClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfRazaoSocialClienteFocusGained
        if (tfRazaoSocialCliente.getText().equals("Aimê Uniformes e Cia Ltda")) {
            tfRazaoSocialCliente.setText("");
            tfRazaoSocialCliente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfRazaoSocialClienteFocusGained

    private void tfRazaoSocialClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfRazaoSocialClienteFocusLost
        if (tfRazaoSocialCliente.getText().isEmpty()) {
            tfRazaoSocialCliente.setText("Aimê Uniformes e Cia Ltda");
            tfRazaoSocialCliente.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfRazaoSocialClienteFocusLost

    private void tfCEPClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCEPClienteFocusGained
        if (tfCEPCliente.getText().equals("99700-274")) {
            tfCEPCliente.setText("");
            tfCEPCliente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfCEPClienteFocusGained

    private void tfCEPClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCEPClienteFocusLost
        if (tfCEPCliente.getText().isEmpty()) {
            tfCEPCliente.setText("99700-274");
            tfCEPCliente.setForeground(Color.GRAY);
        } else {
            String CEP = getCEP();
            apiCEP api = new apiCEP(CEP);
            String cidade = api.getCidade();
            tfMunicipioCliente.setText(cidade);
            tfMunicipioCliente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfCEPClienteFocusLost

    public String getCEP() {
        String CEP = tfCEPCliente.getText();
        return CEP;
    }

    private void tfMunicipioClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMunicipioClienteFocusGained
        if (tfMunicipioCliente.getText().equals("Erechim")) {
            tfMunicipioCliente.setText("");
            tfMunicipioCliente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfMunicipioClienteFocusGained

    private void tfMunicipioClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMunicipioClienteFocusLost
        if (tfMunicipioCliente.getText().isEmpty()) {
            tfMunicipioCliente.setText("Erechim");
            tfMunicipioCliente.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfMunicipioClienteFocusLost

    private void tfCNPJClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCNPJClienteFocusGained
        if (tfCNPJCliente.getText().equals("01.834.341.0001-23")) {
            tfCNPJCliente.setText("");
            tfCNPJCliente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfCNPJClienteFocusGained

    private void tfCNPJClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCNPJClienteFocusLost
        if (tfCNPJCliente.getText().isEmpty()) {
            tfCNPJCliente.setText("01.834.341.0001-23");
            tfCNPJCliente.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfCNPJClienteFocusLost

    private void tfInscricaoEstadualClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfInscricaoEstadualClienteFocusGained
        if (tfInscricaoEstadualCliente.getText().equals("388.108.598.269")) {
            tfInscricaoEstadualCliente.setText("");
            tfInscricaoEstadualCliente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfInscricaoEstadualClienteFocusGained

    private void tfInscricaoEstadualClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfInscricaoEstadualClienteFocusLost
        if (tfInscricaoEstadualCliente.getText().isEmpty()) {
            tfInscricaoEstadualCliente.setText("388.108.598.269");
            tfInscricaoEstadualCliente.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfInscricaoEstadualClienteFocusLost

    private void tfNumeroResiClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroResiClienteFocusGained
        if (tfNumeroResiCliente.getText().equals("41")) {
            tfNumeroResiCliente.setText("");
            tfNumeroResiCliente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfNumeroResiClienteFocusGained

    private void tfNumeroResiClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroResiClienteFocusLost
        if (tfNumeroResiCliente.getText().isEmpty()) {
        tfNumeroResiCliente.setText("41");
        tfNumeroResiCliente.setForeground(Color.GRAY);
    }
    }//GEN-LAST:event_tfNumeroResiClienteFocusLost

    private void tfMunicipioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMunicipioClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMunicipioClienteActionPerformed

    private void btnAtualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClientesActionPerformed
        updateCliente();
        populateTable();
        btnAdicionarCLientes.setEnabled(true);
    }//GEN-LAST:event_btnAtualizarClientesActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        populateFields();
    }//GEN-LAST:event_table1MouseClicked

    private void btnRemoverCLientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCLientesActionPerformed
        int selectedRow = table1.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.removeRow(selectedRow);
        }
        removeClienteFromDB();
    }//GEN-LAST:event_btnRemoverCLientesActionPerformed
    private void removeClienteFromDB() {
        int selectedRow = table1.getSelectedRow();
        if (selectedRow >= 0) {
            String cnpj = table1.getValueAt(selectedRow, 1).toString();
            Connection conn = ConexaoPG.getConnection();
            if (conn != null) {
                try {
                    PreparedStatement ps = conn.prepareStatement("DELETE FROM clientes WHERE CNPJ_cliente = ?");
                    ps.setString(1, cnpj);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover cliente: " + e.getMessage());
                } finally {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                    }
                }
            }
        }
    }

    private void updateCliente() {
        Connection conn = ConexaoPG.getConnection();

        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("UPDATE clientes SET cnpj=?, ie=?, municipio=?, numero_residencia=?, razao_social=? WHERE cep=?");
                ps.setString(1, tfCNPJCliente.getText());
                ps.setString(2, tfInscricaoEstadualCliente.getText());
                ps.setString(3, tfMunicipioCliente.getText());
                ps.setString(4, tfNumeroResiCliente.getText());
                ps.setString(5, tfRazaoSocialCliente.getText());
                ps.setString(6, tfCEPCliente.getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente: " + e.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                }
            }
        }
    }

    private void populateFields() {
        int row = table1.getSelectedRow();
        if (row != -1) {
            tfRazaoSocialCliente.setText(table1.getValueAt(row, 1).toString());
            tfCNPJCliente.setText(table1.getValueAt(row, 2).toString());
            tfInscricaoEstadualCliente.setText(table1.getValueAt(row, 3).toString());
            tfCEPCliente.setText(table1.getValueAt(row, 4).toString());
            tfNumeroResiCliente.setText(table1.getValueAt(row, 5).toString());
            btnAdicionarCLientes.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente na tabela");
        }
    }

    public void insertCliente() {
        String cep = tfCEPCliente.getText();
        apiCEP api = new apiCEP(cep);
        String rua = api.getRua();
        String bairro = api.getBairro();
        String cidade = api.getCidade();
        String estado = api.getEstado();

        Connection conn = ConexaoPG.getConnection();

        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("INSERT INTO clientes (razao_social_cliente, CNPJ_cliente, IE_cliente, CEP_cliente, uf_cliente, bairro_cliente, municipio_cliente, Logradouro_cliente, num_residencial) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                ps.setString(4, cep);
                ps.setString(2, tfCNPJCliente.getText());
                ps.setString(3, tfInscricaoEstadualCliente.getText());
                ps.setString(7, cidade);
                ps.setString(9, tfNumeroResiCliente.getText());
                ps.setString(1, tfRazaoSocialCliente.getText());
                ps.setString(8, rua);
                ps.setString(6, bairro);
                ps.setString(5, estado);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao adicionar cliente: " + e.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                }
            }
        }
    }

    private void populateTable() {
        Connection conn = ConexaoPG.getConnection();

        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM clientes");
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                model.setRowCount(0);

                while (rs.next()) {
                    String cep = rs.getString("cep");
                    String cnpj = rs.getString("cnpj");
                    String ie = rs.getString("ie");
                    String municipio = rs.getString("municipio");
                    String num_residencia = rs.getString("numero_residencia");
                    String razao_social = rs.getString("razao_social");
                    String rua = rs.getString("rua");
                    String bairro = rs.getString("bairro");
                    String estado = rs.getString("estado");

                    Object[] row = {cep, cnpj, ie, municipio, num_residencia, razao_social, rua, bairro, estado};
                    model.addRow(row);
                }

                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela clientes : " + e.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.btnRounded btnAdicionarCLientes;
    private Components.btnRounded btnAtualizarClientes;
    private Components.btnRounded btnRemoverCLientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPrincipal;
    private Components.table table1;
    private test.RoundedTextField tfCEPCliente;
    private test.RoundedTextField tfCNPJCliente;
    private test.RoundedTextField tfInscricaoEstadualCliente;
    private test.RoundedTextField tfMunicipioCliente;
    private test.RoundedTextField tfNumeroResiCliente;
    private test.RoundedTextField tfRazaoSocialCliente;
    // End of variables declaration//GEN-END:variables
}
