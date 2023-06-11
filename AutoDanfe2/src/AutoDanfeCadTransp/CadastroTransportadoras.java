package AutoDanfeCadTransp;

import AutoDanfeCadCliente.ConexaoPG;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class CadastroTransportadoras extends javax.swing.JInternalFrame {

    public CadastroTransportadoras() {
        initComponents();
        btnAtualizarTransp.setEnabled(false);
        btnEdicao.setEnabled(false);
        btnEdicao.setVisible(false);
        populateTable();
        configureTable();

        tfRazaoSocialTransp.setForeground(Color.GRAY);
        tfLogradouroTransp.setForeground(Color.GRAY);
        tfMunicipio.setForeground(Color.GRAY);
        tfCNPJ.setForeground(Color.GRAY);
        tfUF.setForeground(Color.GRAY);
        tfInscricaoEstadual.setForeground(Color.GRAY);

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    private void limparCampos() {
        tfCNPJ.setText("");
        tfInscricaoEstadual.setText("");
        tfLogradouroTransp.setText("");
        tfMunicipio.setText("");
        tfRazaoSocialTransp.setText("");
        tfUF.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfRazaoSocialTransp = new test.RoundedTextField();
        tfCNPJ = new test.RoundedTextField();
        tfLogradouroTransp = new test.RoundedTextField();
        tfMunicipio = new test.RoundedTextField();
        tfInscricaoEstadual = new test.RoundedTextField();
        tfUF = new test.RoundedTextField();
        btnAdicionarTransp = new Components.btnRounded();
        btnRemoverTransp = new Components.btnRounded();
        btnAtualizarTransp = new Components.btnRounded();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Components.table();
        btnEdicao = new Components.btnRounded();

        setMinimumSize(new java.awt.Dimension(1000, 596));
        setPreferredSize(new java.awt.Dimension(1000, 596));

        jPanel1.setBackground(new java.awt.Color(223, 223, 223));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Transportadoras");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(759, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        tfRazaoSocialTransp.setText("Alto-Uruguai Transportadoras");
        tfRazaoSocialTransp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfRazaoSocialTranspFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfRazaoSocialTranspFocusLost(evt);
            }
        });
        tfRazaoSocialTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRazaoSocialTranspActionPerformed(evt);
            }
        });

        tfCNPJ.setText("00.000.000/0000-00");
        tfCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCNPJFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCNPJFocusLost(evt);
            }
        });
        tfCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCNPJActionPerformed(evt);
            }
        });

        tfLogradouroTransp.setText("Rua Das Capivaras");
        tfLogradouroTransp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfLogradouroTranspFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLogradouroTranspFocusLost(evt);
            }
        });

        tfMunicipio.setText("Rio Branco");
        tfMunicipio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfMunicipioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfMunicipioFocusLost(evt);
            }
        });
        tfMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMunicipioActionPerformed(evt);
            }
        });

        tfInscricaoEstadual.setText("000.000.000.000");
        tfInscricaoEstadual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfInscricaoEstadualFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfInscricaoEstadualFocusLost(evt);
            }
        });

        tfUF.setText("AC");
        tfUF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUFFocusLost(evt);
            }
        });

        btnAdicionarTransp.setBackground(new java.awt.Color(0, 153, 153));
        btnAdicionarTransp.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarTransp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionarLogo.png"))); // NOI18N
        btnAdicionarTransp.setText("Adicionar");
        btnAdicionarTransp.setBorderColor(new java.awt.Color(0, 153, 153));
        btnAdicionarTransp.setColor(new java.awt.Color(0, 153, 153));
        btnAdicionarTransp.setColorClick(new java.awt.Color(0, 134, 134));
        btnAdicionarTransp.setColorOver(new java.awt.Color(0, 114, 114));
        btnAdicionarTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarTranspActionPerformed(evt);
            }
        });

        btnRemoverTransp.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoverTransp.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverTransp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelarLogo.png"))); // NOI18N
        btnRemoverTransp.setText("Remover");
        btnRemoverTransp.setBorderColor(new java.awt.Color(153, 0, 0));
        btnRemoverTransp.setColor(new java.awt.Color(153, 0, 0));
        btnRemoverTransp.setColorClick(new java.awt.Color(175, 0, 0));
        btnRemoverTransp.setColorOver(new java.awt.Color(154, 0, 0));
        btnRemoverTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverTranspActionPerformed(evt);
            }
        });

        btnAtualizarTransp.setBackground(new java.awt.Color(191, 189, 189));
        btnAtualizarTransp.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarTransp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atualizarLogo.png"))); // NOI18N
        btnAtualizarTransp.setText("Atualizar");
        btnAtualizarTransp.setBorderColor(new java.awt.Color(191, 189, 189));
        btnAtualizarTransp.setColor(new java.awt.Color(191, 189, 189));
        btnAtualizarTransp.setColorClick(new java.awt.Color(159, 159, 159));
        btnAtualizarTransp.setColorOver(new java.awt.Color(180, 180, 180));
        btnAtualizarTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTranspActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Razão Social:");

        jLabel3.setText("Logradouro:");

        jLabel4.setText("Município:");

        jLabel5.setText("CNPJ:");

        jLabel6.setText("Inscrição Estadual:");

        jLabel7.setText("UF:");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CNPJ", "Razão Social", "IE", "Município", "Logradouro", "UF"
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
        btnEdicao.setText("Sair do modo de Edição");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel2)
                            .addGap(398, 398, 398)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfLogradouroTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfRazaoSocialTransp, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))))
                                    .addGap(59, 59, 59)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                            .addComponent(tfInscricaoEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfUF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizarTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnRemoverTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAdicionarTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfRazaoSocialTransp, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(tfCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfInscricaoEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(tfLogradouroTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(tfUF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void tfRazaoSocialTranspFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfRazaoSocialTranspFocusGained
        if (tfRazaoSocialTransp.getText().equals("Alto-Uruguai Transportadoras")) {
            tfRazaoSocialTransp.setText("");
            tfRazaoSocialTransp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfRazaoSocialTranspFocusGained

    private void tfRazaoSocialTranspFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfRazaoSocialTranspFocusLost
        if (tfRazaoSocialTransp.getText().isEmpty()) {
            tfRazaoSocialTransp.setText("Alto-Uruguai Transportadoras");
            tfRazaoSocialTransp.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfRazaoSocialTranspFocusLost

    private void tfLogradouroTranspFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLogradouroTranspFocusGained
        if (tfLogradouroTransp.getText().equals("Rua Das Capivaras")) {
            tfLogradouroTransp.setText("");
            tfLogradouroTransp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfLogradouroTranspFocusGained

    private void tfLogradouroTranspFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLogradouroTranspFocusLost
        if (tfLogradouroTransp.getText().isEmpty()) {
            tfLogradouroTransp.setText("Rua Das Capivaras");
            tfLogradouroTransp.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfLogradouroTranspFocusLost

    private void tfMunicipioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMunicipioFocusGained
        if (tfMunicipio.getText().equals("Rio Branco")) {
            tfMunicipio.setText("");
            tfMunicipio.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfMunicipioFocusGained

    private void tfMunicipioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMunicipioFocusLost
        if (tfMunicipio.getText().isEmpty()) {
            tfMunicipio.setText("Rio Branco");
            tfMunicipio.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfMunicipioFocusLost

    private void tfCNPJFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCNPJFocusGained
        if (tfCNPJ.getText().equals("00.000.000/0000-00")) {
            tfCNPJ.setText("");
            tfCNPJ.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfCNPJFocusGained

    private void tfCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCNPJFocusLost
        if (tfCNPJ.getText().isEmpty()) {
            tfCNPJ.setText("00.000.000/0000-00");
            tfCNPJ.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfCNPJFocusLost

    private void tfInscricaoEstadualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfInscricaoEstadualFocusGained
        if (tfInscricaoEstadual.getText().equals("000.000.000.000")) {
            tfInscricaoEstadual.setText("");
            tfInscricaoEstadual.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfInscricaoEstadualFocusGained

    private void tfInscricaoEstadualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfInscricaoEstadualFocusLost
        if (tfInscricaoEstadual.getText().isEmpty()) {
            tfInscricaoEstadual.setText("000.000.000.000");
            tfInscricaoEstadual.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfInscricaoEstadualFocusLost

    private void tfUFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUFFocusGained
        if (tfUF.getText().equals("AC")) {
            tfUF.setText("");
            tfUF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfUFFocusGained

    private void tfUFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUFFocusLost
        if (tfUF.getText().isEmpty()) {
            tfUF.setText("AC");
            tfUF.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfUFFocusLost

    private void tfRazaoSocialTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRazaoSocialTranspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRazaoSocialTranspActionPerformed

    private void tfMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMunicipioActionPerformed

    private void btnAdicionarTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarTranspActionPerformed
        if (!verificarCamposCompletosTransp()) {
            return;
        }
        insertTransportadora();
        populateTable();
        limparCampos();
    }//GEN-LAST:event_btnAdicionarTranspActionPerformed

    private void btnRemoverTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverTranspActionPerformed
        removeTransportadoraFromDB();
        removeTransportadoraFromTable();
        limparCampos();
    }//GEN-LAST:event_btnRemoverTranspActionPerformed

    private void btnAtualizarTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTranspActionPerformed

        if (!verificarCamposCompletosTransp()) {
            return;
        }
        updateTransportadoraInDB();
        btnAdicionarTransp.setEnabled(true);
        btnAtualizarTransp.setEnabled(false);
        btnEdicao.setVisible(false);
        btnEdicao.setEnabled(false);
        btnAdicionarTransp.setBackground(new Color(0, 153, 153));
        btnAtualizarTransp.setEnabled(false);
        limparCampos();
    }//GEN-LAST:event_btnAtualizarTranspActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        populateFields();
        btnEdicao.setVisible(true);
        btnEdicao.setEnabled(true);
        btnAdicionarTransp.setEnabled(false);
        if(btnAdicionarTransp.isSelected()){
            JOptionPane.showMessageDialog(null, "Atualize o produto atual ou saia do modo edição para prosseguir");
        }
        btnAdicionarTransp.setBackground(Color.gray);
        btnAtualizarTransp.setBackground(Color.green);
        btnAtualizarTransp.setEnabled(true);
    }//GEN-LAST:event_table1MouseClicked

    private void tfCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCNPJActionPerformed

    private void btnEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdicaoActionPerformed
        limparCampos();
        btnAdicionarTransp.setEnabled(true);
        btnEdicao.setEnabled(false);
        btnEdicao.setVisible(false);
        btnAtualizarTransp.setBackground(new Color(0, 153, 153));
        btnAtualizarTransp.setEnabled(false);
    }//GEN-LAST:event_btnEdicaoActionPerformed

    private void configureTable() {
        table1.setDefaultEditor(Object.class, null);
    }

    private boolean verificarCamposCompletosTransp() {
        boolean camposCompletos = true;
        StringBuilder camposNaoPreenchidos = new StringBuilder();

        if (tfCNPJ.getText().isEmpty() || tfCNPJ.getText().equals("00.000.000/0000-00")) {
            camposCompletos = false;
            camposNaoPreenchidos.append("'CNPJ' ");
        }

        if (tfInscricaoEstadual.getText().isEmpty() || tfInscricaoEstadual.getText().equals("000.000.000.000")) {
            camposCompletos = false;
            camposNaoPreenchidos.append("'Inscrição Estadual' ");
        }

        if (tfLogradouroTransp.getText().isEmpty() || tfLogradouroTransp.getText().equals("Rua Das Capivaras")) {
            camposCompletos = false;
            camposNaoPreenchidos.append("'Logradouro' ");
        }

        if (tfMunicipio.getText().isEmpty() || tfMunicipio.getText().equals("Rio Branco")) {
            camposCompletos = false;
            camposNaoPreenchidos.append("'Município' ");
        }

        if (tfRazaoSocialTransp.getText().isEmpty() || tfRazaoSocialTransp.getText().equals("Alto-Uruguai Transportadoras")) {
            camposCompletos = false;
            camposNaoPreenchidos.append("'Razão Social' ");
        }

        if (tfUF.getText().isEmpty() || tfUF.getText().equals("AC")) {
            camposCompletos = false;
            camposNaoPreenchidos.append("'UF' ");
        }

        if (!camposCompletos) {
            JOptionPane.showMessageDialog(this, "Os campos a seguir não foram preenchidos: " + camposNaoPreenchidos.toString());
            return false;
        }

        return true;
    }

    private void removeTransportadoraFromTable() {
        int selectedRow = table1.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.removeRow(selectedRow);
        }
    }

    private void removeTransportadoraFromDB() {
        int selectedRow = table1.getSelectedRow();
        if (selectedRow >= 0) {
            String cnpj = table1.getValueAt(selectedRow, 2).toString();
            try (java.sql.Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("UPDATE transportadoras SET status_transp = FALSE WHERE CNPJ_transportador = ?")) {
                ps.setString(1, cnpj);
                ps.executeUpdate();

                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(null, "Transportadora removida com sucesso!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao remover transportadora: " + e.getMessage());
            }
        }
    }

    private void updateTransportadoraInDB() {
        try (java.sql.Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("UPDATE transportadoras SET razao_social_transp = ?, logradouro_transportadora = ?, municipio_transportadora = ?, IE_transportadora = ?, UF_transportadora = ? WHERE CNPJ_transportador = ?")) {
            ps.setString(1, tfRazaoSocialTransp.getText());
            ps.setString(2, tfLogradouroTransp.getText());
            ps.setString(3, tfMunicipio.getText());
            ps.setString(4, tfInscricaoEstadual.getText());
            ps.setString(5, tfUF.getText());
            ps.setString(6, tfCNPJ.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Transportadora atualizada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar transportadora: " + e.getMessage());
        }
    }

    private void populateFields() {
        int row = table1.getSelectedRow();
        if (row != -1) {
            tfCNPJ.setText(table1.getValueAt(row, 0).toString());
            tfInscricaoEstadual.setText(table1.getValueAt(row, 1).toString());
            tfLogradouroTransp.setText(table1.getValueAt(row, 2).toString());
            tfMunicipio.setText(table1.getValueAt(row, 3).toString());
            tfRazaoSocialTransp.setText(table1.getValueAt(row, 4).toString());
            tfUF.setText(table1.getValueAt(row, 5).toString());

            tfCNPJ.setForeground(Color.BLACK);
            tfInscricaoEstadual.setForeground(Color.BLACK);
            tfLogradouroTransp.setForeground(Color.BLACK);
            tfMunicipio.setForeground(Color.BLACK);
            tfRazaoSocialTransp.setForeground(Color.BLACK);
            tfUF.setForeground(Color.BLACK);

            btnAdicionarTransp.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma transportadora na tabela");
        }
    }

    public void insertTransportadora() {
        try (java.sql.Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("INSERT INTO transportadoras (razao_social_transp, CNPJ_transportador, IE_transportadora, UF_transportadora, municipio_transportadora, logradouro_transportadora) VALUES (?, ?, ?, ?, ?, ?)")) {
            ps.setString(1, tfRazaoSocialTransp.getText());
            ps.setString(2, tfCNPJ.getText());
            ps.setString(3, tfInscricaoEstadual.getText());
            ps.setString(4, tfUF.getText());
            ps.setString(5, tfMunicipio.getText());
            ps.setString(6, tfLogradouroTransp.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Transportadora adicionada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar transportadora: " + e.getMessage());
        }
    }

    private void populateTable() {
        try (java.sql.Connection conn = ConexaoPG.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT * FROM transportadoras WHERE status_transp = TRUE"); ResultSet rs = ps.executeQuery()) {
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String cnpj = rs.getString("CNPJ_transportador");
                String inscricaoEstadual = rs.getString("IE_transportadora");
                String logradouro = rs.getString("logradouro_transportadora");
                String municipio = rs.getString("municipio_transportadora");
                String razaoSocial = rs.getString("razao_social_transp");
                String uf = rs.getString("UF_transportadora");

                Object[] row = {cnpj, inscricaoEstadual, logradouro, municipio, razaoSocial, uf};
                model.addRow(row);
            }

            DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
            cellRenderer.setForeground(Color.BLACK);
            cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            JTableHeader header = table1.getTableHeader();
            header.setDefaultRenderer(cellRenderer);

            TableColumnModel columnModel = table1.getColumnModel();
            for (int i = 0; i < columnModel.getColumnCount(); i++) {
                columnModel.getColumn(i).setCellRenderer(cellRenderer);
            }

            // Set column names
            columnModel.getColumn(0).setHeaderValue("CNPJ");
            columnModel.getColumn(1).setHeaderValue("Inscrição Estadual");
            columnModel.getColumn(2).setHeaderValue("Logradouro");
            columnModel.getColumn(3).setHeaderValue("Município");
            columnModel.getColumn(4).setHeaderValue("Razão Social");
            columnModel.getColumn(5).setHeaderValue("UF");
            header.repaint();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela transportadoras: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.btnRounded btnAdicionarTransp;
    private Components.btnRounded btnAtualizarTransp;
    private Components.btnRounded btnEdicao;
    private Components.btnRounded btnRemoverTransp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.table table1;
    private test.RoundedTextField tfCNPJ;
    private test.RoundedTextField tfInscricaoEstadual;
    private test.RoundedTextField tfLogradouroTransp;
    private test.RoundedTextField tfMunicipio;
    private test.RoundedTextField tfRazaoSocialTransp;
    private test.RoundedTextField tfUF;
    // End of variables declaration//GEN-END:variables
}
