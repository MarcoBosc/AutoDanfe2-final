package AutoDanfeMenu;

import Components.btnRounded;
import Controller.Program;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class AutoDanfeMenu extends javax.swing.JFrame {

    public AutoDanfeMenu() {
        initComponents();

        setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/logoAime.png"));
        setIconImage(icon.getImage());

        dpPrincipal.add(Program.getMenu());
        Program.getMenu().setVisible(true);

        dpPrincipal.add(Program.getCadastroClientes());
        Program.getCadastroClientes().setVisible(false);

        dpPrincipal.add(Program.getCadastroTransportadoras());
        Program.getCadastroTransportadoras().setVisible(false);

        dpPrincipal.add(Program.getCadastroProdutos());
        Program.getCadastroProdutos().setVisible(false);

        dpPrincipal.add(Program.getEmissaoBoleto());
        Program.getEmissaoBoleto().setVisible(false);

        dpPrincipal.add(Program.getEmissaoNota());
        Program.getEmissaoNota().setVisible(false);

        dpPrincipal.add(Program.getCancelamentoNota());
        Program.getCancelamentoNota().setVisible(false);

        dpPrincipal.add(Program.getEmissaoProduto());
        Program.getEmissaoProduto().setVisible(false);

        dpPrincipal.add(Program.getEmissaoDefinicoes());
        Program.getEmissaoDefinicoes().setVisible(false);

        dpPrincipal.add(Program.getEmissaoRevisao());
        Program.getEmissaoRevisao().setVisible(false);

        dpPrincipal.add(Program.getEmissaoTransp());
        Program.getEmissaoTransp().setVisible(false);
        File file = new File("json.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Text file created successfully.");
            } else {
                System.out.println("Text file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the text file: " + e.getMessage());
        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpPrincipal = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMenuIniciar = new Components.btnRounded();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Danfe");
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        javax.swing.GroupLayout dpPrincipalLayout = new javax.swing.GroupLayout(dpPrincipal);
        dpPrincipal.setLayout(dpPrincipalLayout);
        dpPrincipalLayout.setHorizontalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dpPrincipalLayout.setVerticalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 65));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aimê Uniformes");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logoAime.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnMenuIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnMenuIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltarLogo.png"))); // NOI18N
        btnMenuIniciar.setText("Menu Inicial");
        btnMenuIniciar.setToolTipText("Retornar ao Menu Inicial");
        btnMenuIniciar.setBorderColor(new java.awt.Color(0, 0, 0));
        btnMenuIniciar.setColor(new java.awt.Color(0, 0, 0));
        btnMenuIniciar.setColorClick(new java.awt.Color(0, 0, 0));
        btnMenuIniciar.setColorOver(new java.awt.Color(0, 0, 0));
        btnMenuIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(396, 396, 396))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(497, 497, 497)
                    .addComponent(jLabel1)
                    .addContainerGap(497, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMenuIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel1)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
            .addComponent(dpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dpPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuIniciarActionPerformed
        Program.getMenu().setVisible(true);
        Program.getCadastroClientes().setVisible(false);
        Program.getCadastroTransportadoras().setVisible(false);
        Program.getCadastroProdutos().setVisible(false);
        Program.getEmissaoBoleto().setVisible(false);
        Program.getEmissaoNota().setVisible(false);
        Program.getCancelamentoNota().setVisible(false);
        Program.getEmissaoProduto().setVisible(false);
        Program.getEmissaoProduto().setVisible(false);
        Program.getEmissaoDefinicoes().setVisible(false);
        Program.getEmissaoRevisao().setVisible(false);
        Program.getEmissaoTransp().setVisible(false);

    }//GEN-LAST:event_btnMenuIniciarActionPerformed

  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutoDanfeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoDanfeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoDanfeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoDanfeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoDanfeMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.btnRounded btnMenuIniciar;
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
