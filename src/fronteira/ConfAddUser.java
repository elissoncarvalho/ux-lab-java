package fronteira;

import entidade.Helper;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Elisson
 */
public class ConfAddUser extends javax.swing.JFrame {
    
    Helper helper = new Helper();
    
    public ConfAddUser() {
        initComponents();
        
        formConfig();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contMasq = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCadastra = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClienteCod = new javax.swing.JTextField();
        txtClienteCPF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtClienteCPF1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rbClienteMasc = new javax.swing.JRadioButton();
        rbClienteFemi = new javax.swing.JRadioButton();
        txtSenha = new javax.swing.JPasswordField();
        txtSenhaConfir = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Novo Usuário");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        contMasq.setBackground(new java.awt.Color(255, 255, 255));
        contMasq.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 167, 230)));
        contMasq.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 167, 230)));

        jPanel2.setBackground(new java.awt.Color(0, 167, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(240, 249, 253));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 247, 253));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Adicionar Novo Usuário");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnCadastra.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastra.setForeground(new java.awt.Color(0, 128, 200));
        btnCadastra.setText("Cadastrar");
        btnCadastra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 200)));
        btnCadastra.setContentAreaFilled(false);
        btnCadastra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastra.setFocusPainted(false);
        btnCadastra.setOpaque(true);
        btnCadastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastraMouseExited(evt);
            }
        });
        btnCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(190, 75, 73));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 75, 73)));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 59, 77));
        jLabel11.setText("Nome completo");

        txtClienteNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteNome.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteNome.setToolTipText("");
        txtClienteNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteNome.setName(""); // NOI18N
        txtClienteNome.setOpaque(false);
        txtClienteNome.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 59, 77));
        jLabel10.setText("Código");

        txtClienteCod.setEditable(false);
        txtClienteCod.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCod.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCod.setText("# 0013899");
        txtClienteCod.setToolTipText("");
        txtClienteCod.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCod.setName(""); // NOI18N
        txtClienteCod.setOpaque(false);
        txtClienteCod.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtClienteCPF.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCPF.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCPF.setToolTipText("");
        txtClienteCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCPF.setName(""); // NOI18N
        txtClienteCPF.setOpaque(false);
        txtClienteCPF.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 59, 77));
        jLabel13.setText("Usuário");

        txtClienteCPF1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCPF1.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCPF1.setToolTipText("");
        txtClienteCPF1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCPF1.setName(""); // NOI18N
        txtClienteCPF1.setOpaque(false);
        txtClienteCPF1.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 59, 77));
        jLabel14.setText("E-mail");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 59, 77));
        jLabel15.setText("Senha");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 59, 77));
        jLabel16.setText("Confirmar Senha");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(35, 59, 77));
        jLabel17.setText("Nível de Acesso");

        rbClienteMasc.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbClienteMasc.setForeground(new java.awt.Color(11, 19, 25));
        rbClienteMasc.setText("Usuário");
        rbClienteMasc.setFocusPainted(false);
        rbClienteMasc.setOpaque(false);

        rbClienteFemi.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbClienteFemi.setForeground(new java.awt.Color(11, 19, 25));
        rbClienteFemi.setText("Administrador");
        rbClienteFemi.setFocusPainted(false);
        rbClienteFemi.setOpaque(false);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(35, 59, 77));
        txtSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtSenha.setOpaque(false);
        txtSenha.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtSenhaConfir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtSenhaConfir.setForeground(new java.awt.Color(35, 59, 77));
        txtSenhaConfir.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtSenhaConfir.setOpaque(false);
        txtSenhaConfir.setSelectionColor(new java.awt.Color(35, 59, 77));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtClienteNome)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(txtSenhaConfir, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtClienteCPF1))
                                .addGap(50, 50, 50))))
                    .addComponent(jLabel17)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbClienteFemi))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtSenha))
                        .addGap(322, 322, 322))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(0, 0, 0)
                            .addComponent(txtSenhaConfir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbClienteFemi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contMasqLayout = new javax.swing.GroupLayout(contMasq);
        contMasq.setLayout(contMasqLayout);
        contMasqLayout.setHorizontalGroup(
            contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
            .addGroup(contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contMasqLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        contMasqLayout.setVerticalGroup(
            contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contMasqLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(contMasq, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastraActionPerformed

    private void btnCadastraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastraMouseEntered
        helper.setMouseBtnFormMoved(btnCadastra, 1, null);
    }//GEN-LAST:event_btnCadastraMouseEntered

    private void btnCadastraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastraMouseExited
        helper.resMouseBtnFormMoved(btnCadastra, 1, null);
    }//GEN-LAST:event_btnCadastraMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        helper.setMouseBtnFormMoved(btnCancelar, 2, null);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        helper.resMouseBtnFormMoved(btnCancelar, 2, null);
    }//GEN-LAST:event_btnCancelarMouseExited
    private void formConfig(){
        //Icone do Sistema
        URL url = this.getClass().getResource("/imgIcons/icon.png");  
        Image iconeTitulo;
        iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        
        this.setBackground(new Color(255,255,255,150));
        
        // Posicionamento do Frame
        setLocationRelativeTo(null);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfAddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastra;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JPanel contMasq;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbClienteFemi;
    private javax.swing.JRadioButton rbClienteMasc;
    private javax.swing.JTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteCPF1;
    private javax.swing.JTextField txtClienteCod;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenhaConfir;
    // End of variables declaration//GEN-END:variables
}
