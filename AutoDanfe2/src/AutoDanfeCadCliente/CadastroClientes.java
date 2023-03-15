/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AutoDanfeCadCliente;

/**
 *
 * @author marco
 */
public class CadastroClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroClientes
     */
    public CadastroClientes() {
        initComponents();
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
        tfRazaoSocial = new test.RoundedTextField();
        tfCEP = new test.RoundedTextField();
        tfMunicipio = new test.RoundedTextField();
        tfCNPJ = new test.RoundedTextField();
        roundedTextField1 = new test.RoundedTextField();
        tfNumeroResi = new test.RoundedTextField();
        btnAdicionar = new Components.btnRounded();
        btnRemover = new Components.btnRounded();
        btnRounded3 = new Components.btnRounded();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 596));
        setMinimumSize(new java.awt.Dimension(1000, 596));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 596));

        jpPrincipal.setBackground(new java.awt.Color(223, 223, 223));

        tfRazaoSocial.setText("Razão Social");
        tfRazaoSocial.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfCEP.setText("CEP");
        tfCEP.setPreferredSize(new java.awt.Dimension(108, 22));
        tfCEP.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfMunicipio.setText("Município");
        tfMunicipio.setPreferredSize(new java.awt.Dimension(108, 22));
        tfMunicipio.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfCNPJ.setText("CNPJ");
        tfCNPJ.setMinimumSize(new java.awt.Dimension(108, 22));
        tfCNPJ.setPreferredSize(new java.awt.Dimension(108, 22));
        tfCNPJ.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        roundedTextField1.setText("Inscrição Estadual");
        roundedTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfNumeroResi.setText("Numero Residencial");
        tfNumeroResi.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        btnAdicionar.setBackground(new java.awt.Color(0, 153, 153));
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionarLogo.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorderColor(new java.awt.Color(0, 153, 153));
        btnAdicionar.setBorderPainted(false);
        btnAdicionar.setColor(new java.awt.Color(0, 153, 153));
        btnAdicionar.setColorClick(new java.awt.Color(0, 134, 134));
        btnAdicionar.setColorOver(new java.awt.Color(0, 114, 114));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(153, 0, 0));
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelarLogo.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorderColor(new java.awt.Color(153, 0, 0));
        btnRemover.setBorderPainted(false);
        btnRemover.setColor(new java.awt.Color(153, 0, 0));
        btnRemover.setColorClick(new java.awt.Color(175, 0, 0));
        btnRemover.setColorOver(new java.awt.Color(154, 0, 0));

        btnRounded3.setBackground(new java.awt.Color(191, 189, 189));
        btnRounded3.setForeground(new java.awt.Color(255, 255, 255));
        btnRounded3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atualizarLogo.png"))); // NOI18N
        btnRounded3.setText("Atualizar");
        btnRounded3.setBorderColor(new java.awt.Color(191, 189, 189));
        btnRounded3.setBorderPainted(false);
        btnRounded3.setColor(new java.awt.Color(191, 189, 189));
        btnRounded3.setColorClick(new java.awt.Color(159, 159, 159));
        btnRounded3.setColorOver(new java.awt.Color(184, 180, 180));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(btnRounded3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(tfCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(tfRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNumeroResi, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroResi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRounded3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.btnRounded btnAdicionar;
    private Components.btnRounded btnRemover;
    private Components.btnRounded btnRounded3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpPrincipal;
    private test.RoundedTextField roundedTextField1;
    private test.RoundedTextField tfCEP;
    private test.RoundedTextField tfCNPJ;
    private test.RoundedTextField tfMunicipio;
    private test.RoundedTextField tfNumeroResi;
    private test.RoundedTextField tfRazaoSocial;
    // End of variables declaration//GEN-END:variables
}
