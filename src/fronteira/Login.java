package fronteira;

import javax.swing.JFrame;
import entidade.Loggar;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    
    Loggar      loggar      = new Loggar();
    Principal   principal   = new Principal();
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        lblMsg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - BIOLAB Análises Clínicas - UX LAB 1.0");
        setMaximumSize(new java.awt.Dimension(840, 420));
        setMinimumSize(new java.awt.Dimension(840, 420));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 59, 77));
        jPanel1.setLayout(null);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/bioLabLogo1.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setIconTextGap(0);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 80, 250, 250);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/fundoLogin.jpg"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setIconTextGap(0);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 420, 420);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 420));

        jPanel2.setBackground(new java.awt.Color(0, 167, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(35, 59, 77));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setBackground(new java.awt.Color(35, 59, 77));
        btnMinimizar.setForeground(new java.awt.Color(35, 59, 77));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Horizontal_Line_12px_2.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setFocusable(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 40, 40));

        btnSair.setBackground(new java.awt.Color(35, 59, 77));
        btnSair.setForeground(new java.awt.Color(35, 59, 77));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Delete_18px_4.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel3.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblMsg.setBackground(new java.awt.Color(190, 75, 73));
        lblMsg.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(255, 255, 255));
        lblMsg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblMsg.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 15));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 59, 77));
        jLabel1.setText("Entrar");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(35, 59, 77));
        lblUsuario.setText("Usuário");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario.setName(""); // NOI18N
        txtUsuario.setNextFocusableComponent(txtSenha);
        txtUsuario.setOpaque(false);
        txtUsuario.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(35, 59, 77));
        lblSenha.setText("Senha");

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(35, 59, 77));
        txtSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtSenha.setNextFocusableComponent(btnEntrar);
        txtSenha.setOpaque(false);
        txtSenha.setSelectionColor(new java.awt.Color(35, 59, 77));

        btnEntrar.setBackground(new java.awt.Color(35, 59, 77));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusable(false);
        btnEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrar.setOpaque(true);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblSenha))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(lblUsuario)
                .addGap(0, 0, 0)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addGap(0, 0, 0)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 290, 340));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 420, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void login(){
        if((1+1) != 2)
        {
            lblMsg.setText("<html><p>Preencha todos os campos, por favor. Não me Deixe! :(.</p>");
            lblMsg.setOpaque(true);
        }
        else
        {
            loggar.setUsuario(txtUsuario.getText().trim());
            loggar.setSenha(new String(txtSenha.getPassword()).trim());

            if(loggar.isLogadoStatus() == true)
            {
                this.setVisible(!true);
                principal.setVisible(true);
            }
            else
            {
                erroLogin();
            }
        }
    }
    private void erroLogin()
    {
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0,new java.awt.Color(190,75,73)));
        txtSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(190,75,73)));
        lblUsuario.setForeground(new java.awt.Color(190,75,73)); 
        lblSenha.setForeground(new java.awt.Color(190,75,73));
        lblMsg.setText("<html><p>Usuario ou Senha Icorretos. Por favor tente novamente.</p>");
        lblMsg.setOpaque(true);
    }
    
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        login();
    }//GEN-LAST:event_btnEntrarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEntrar;
    private javax.swing.JToggleButton btnMinimizar;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
