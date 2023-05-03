package AutoDanfeEmissaoNota;

import Controller.Program;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class EmissaoDestinatario extends javax.swing.JInternalFrame {


    public EmissaoDestinatario() {
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(988, 35));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Automação de Nf-e");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("1. Destinatário");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("2. Produtos");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("3. Definições");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("4. Transporte");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
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
                .addContainerGap(176, Short.MAX_VALUE))
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

        tfPesquisarEmpresa.setText("Aime Uniformes");
        tfPesquisarEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPesquisarEmpresaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesquisarEmpresaFocusLost(evt);
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
        jScrollPane1.setViewportView(table1);

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Pesquisar por nome ou CNPJ");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProxProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(tfPesquisarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnProxProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProxProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxProdActionPerformed
        Program.getEmissaoNota().setVisible(false);
        Program.getEmissaoProduto().setVisible(true);
    }//GEN-LAST:event_btnProxProdActionPerformed

    private void tfPesquisarEmpresaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarEmpresaFocusGained
        tfPesquisarEmpresa.setText("");
    }//GEN-LAST:event_tfPesquisarEmpresaFocusGained

    private void tfPesquisarEmpresaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarEmpresaFocusLost
         if (tfPesquisarEmpresa.getText().isEmpty()) {
            tfPesquisarEmpresa.setText("Aimê Uniformes");
         }
    }//GEN-LAST:event_tfPesquisarEmpresaFocusLost


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
