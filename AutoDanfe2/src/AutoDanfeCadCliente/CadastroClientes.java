package AutoDanfeCadCliente;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class CadastroClientes extends javax.swing.JInternalFrame {

    public CadastroClientes() {
        initComponents();
        
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 596));
        setMinimumSize(new java.awt.Dimension(1000, 596));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 596));

        jpPrincipal.setBackground(new java.awt.Color(223, 223, 223));

        tfRazaoSocialCliente.setText("Razão Social");
        tfRazaoSocialCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfCEPCliente.setText("CEP");
        tfCEPCliente.setPreferredSize(new java.awt.Dimension(108, 22));
        tfCEPCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfMunicipioCliente.setText("Município");
        tfMunicipioCliente.setPreferredSize(new java.awt.Dimension(108, 22));
        tfMunicipioCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfCNPJCliente.setText("CNPJ");
        tfCNPJCliente.setMinimumSize(new java.awt.Dimension(108, 22));
        tfCNPJCliente.setPreferredSize(new java.awt.Dimension(108, 22));
        tfCNPJCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfInscricaoEstadualCliente.setText("Inscrição Estadual");
        tfInscricaoEstadualCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfNumeroResiCliente.setText("Numero Residencial");
        tfNumeroResiCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));

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

        btnAtualizarClientes.setBackground(new java.awt.Color(191, 189, 189));
        btnAtualizarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atualizarLogo.png"))); // NOI18N
        btnAtualizarClientes.setText("Atualizar");
        btnAtualizarClientes.setBorderColor(new java.awt.Color(191, 189, 189));
        btnAtualizarClientes.setBorderPainted(false);
        btnAtualizarClientes.setColor(new java.awt.Color(191, 189, 189));
        btnAtualizarClientes.setColorClick(new java.awt.Color(159, 159, 159));
        btnAtualizarClientes.setColorOver(new java.awt.Color(184, 180, 180));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(btnAtualizarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnRemoverCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAdicionarCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfMunicipioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(tfCEPCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(tfRazaoSocialCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCNPJCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfInscricaoEstadualCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNumeroResiCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRazaoSocialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCNPJCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfInscricaoEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroResiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(246, 246, 246))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
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
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarCLientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCLientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarCLientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.btnRounded btnAdicionarCLientes;
    private Components.btnRounded btnAtualizarClientes;
    private Components.btnRounded btnRemoverCLientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpPrincipal;
    private test.RoundedTextField tfCEPCliente;
    private test.RoundedTextField tfCNPJCliente;
    private test.RoundedTextField tfInscricaoEstadualCliente;
    private test.RoundedTextField tfMunicipioCliente;
    private test.RoundedTextField tfNumeroResiCliente;
    private test.RoundedTextField tfRazaoSocialCliente;
    // End of variables declaration//GEN-END:variables
}
