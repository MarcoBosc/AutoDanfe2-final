package AutoDanfeMenu;

import Controller.Program;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JButton;

public class Menu extends javax.swing.JInternalFrame {


    public Menu() {
        initComponents();
        
//        Program.getAutoDanfeMenu().setBtnMenuIniciarEnabled(false);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEmitir = new Components.btnRounded();
        btnCancelarNfe = new Components.btnRounded();
        btnEmissaoBoleto = new Components.btnRounded();
        btnCadastroProd = new Components.btnRounded();
        btnCadastroCliente = new Components.btnRounded();
        btnCadastroTransp = new Components.btnRounded();

        jpPrincipal.setBackground(new java.awt.Color(222, 223, 223));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecione a operação desejada");

        btnEmitir.setBorder(null);
        btnEmitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/EmissaoNfe.png"))); // NOI18N
        btnEmitir.setColorClick(new java.awt.Color(102, 102, 102));
        btnEmitir.setColorOver(new java.awt.Color(153, 153, 153));
        btnEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirActionPerformed(evt);
            }
        });

        btnCancelarNfe.setBorder(null);
        btnCancelarNfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CancelarNfe.png"))); // NOI18N
        btnCancelarNfe.setColorClick(new java.awt.Color(102, 102, 102));
        btnCancelarNfe.setColorOver(new java.awt.Color(153, 153, 153));
        btnCancelarNfe.setPreferredSize(new java.awt.Dimension(169, 169));
        btnCancelarNfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNfeActionPerformed(evt);
            }
        });

        btnEmissaoBoleto.setBorder(null);
        btnEmissaoBoleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/EmissaoBoleto.png"))); // NOI18N
        btnEmissaoBoleto.setColorClick(new java.awt.Color(102, 102, 102));
        btnEmissaoBoleto.setColorOver(new java.awt.Color(153, 153, 153));
        btnEmissaoBoleto.setPreferredSize(new java.awt.Dimension(169, 169));
        btnEmissaoBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmissaoBoletoActionPerformed(evt);
            }
        });

        btnCadastroProd.setBorder(null);
        btnCadastroProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CadastroProd.png"))); // NOI18N
        btnCadastroProd.setToolTipText("");
        btnCadastroProd.setColorClick(new java.awt.Color(102, 102, 102));
        btnCadastroProd.setColorOver(new java.awt.Color(153, 153, 153));
        btnCadastroProd.setPreferredSize(new java.awt.Dimension(169, 169));
        btnCadastroProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdActionPerformed(evt);
            }
        });

        btnCadastroCliente.setBorder(null);
        btnCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CadastroClientes.png"))); // NOI18N
        btnCadastroCliente.setColorClick(new java.awt.Color(102, 102, 102));
        btnCadastroCliente.setColorOver(new java.awt.Color(153, 153, 153));
        btnCadastroCliente.setPreferredSize(new java.awt.Dimension(169, 169));
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        btnCadastroTransp.setBorder(null);
        btnCadastroTransp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CadastroTransp.png"))); // NOI18N
        btnCadastroTransp.setColorClick(new java.awt.Color(102, 102, 102));
        btnCadastroTransp.setColorOver(new java.awt.Color(153, 153, 153));
        btnCadastroTransp.setPreferredSize(new java.awt.Dimension(169, 169));
        btnCadastroTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroTranspActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastroTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(btnCancelarNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnEmissaoBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnCadastroProd, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmissaoBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastroProd, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(btnCadastroTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirActionPerformed
        Program.getMenu().setVisible(false);
        Program.getEmissaoNota().setVisible(true);
    }//GEN-LAST:event_btnEmitirActionPerformed

    private void btnCancelarNfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNfeActionPerformed
        Program.getMenu().setVisible(false);
        Program.getCancelamentoNota().setVisible(true);
    }//GEN-LAST:event_btnCancelarNfeActionPerformed

    private void btnEmissaoBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmissaoBoletoActionPerformed
        Program.getMenu().setVisible(false);
        Program.getEmissaoBoleto().setVisible(true);
    }//GEN-LAST:event_btnEmissaoBoletoActionPerformed

    private void btnCadastroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdActionPerformed
        Program.getMenu().setVisible(false);
        Program.getCadastroProdutos().setVisible(true);
    }//GEN-LAST:event_btnCadastroProdActionPerformed

    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        Program.getMenu().setVisible(false);
        Program.getCadastroClientes().setVisible(true);
    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    private void btnCadastroTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroTranspActionPerformed
        Program.getMenu().setVisible(false);
        Program.getCadastroTransportadoras().setVisible(true);
    }//GEN-LAST:event_btnCadastroTranspActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.btnRounded btnCadastroCliente;
    private Components.btnRounded btnCadastroProd;
    private Components.btnRounded btnCadastroTransp;
    private Components.btnRounded btnCancelarNfe;
    private Components.btnRounded btnEmissaoBoleto;
    private Components.btnRounded btnEmitir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpPrincipal;
    // End of variables declaration//GEN-END:variables
}
