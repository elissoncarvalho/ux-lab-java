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
public class ExameUrinaRotina extends javax.swing.JFrame {
    
    Helper helper = new Helper();
    
    public ExameUrinaRotina() {
        initComponents();
        
        formConfig();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contMasq = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtAfCor = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtAfDens = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtAfAspecto = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtAfPh = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtSedCelEpitel = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtSedHem = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtSedLeuc = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtSedCilin = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Urina Rotina");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        contMasq.setBackground(new java.awt.Color(255, 255, 255));
        contMasq.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 167, 230)));
        contMasq.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 167, 230), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 167, 230));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel3.setBackground(new java.awt.Color(240, 249, 253));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 247, 253));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Urina Rotina");
        jPanel6.add(jLabel3, new java.awt.GridBagConstraints());

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 490, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(11, 19, 25));
        jLabel45.setText("Aspectos físicos");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(11, 19, 25));
        jLabel46.setText("Cor");

        txtAfCor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtAfCor.setForeground(new java.awt.Color(11, 19, 25));
        txtAfCor.setToolTipText("");
        txtAfCor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtAfCor.setName(""); // NOI18N
        txtAfCor.setOpaque(false);
        txtAfCor.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtAfCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAfCorActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(11, 19, 25));
        jLabel48.setText("Densidade");

        txtAfDens.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtAfDens.setForeground(new java.awt.Color(11, 19, 25));
        txtAfDens.setToolTipText("");
        txtAfDens.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtAfDens.setName(""); // NOI18N
        txtAfDens.setOpaque(false);
        txtAfDens.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtAfDens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAfDensActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(11, 19, 25));
        jLabel47.setText("Aspecto");

        txtAfAspecto.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtAfAspecto.setForeground(new java.awt.Color(11, 19, 25));
        txtAfAspecto.setToolTipText("");
        txtAfAspecto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtAfAspecto.setName(""); // NOI18N
        txtAfAspecto.setOpaque(false);
        txtAfAspecto.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtAfAspecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAfAspectoActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(11, 19, 25));
        jLabel51.setText("PH");

        txtAfPh.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtAfPh.setForeground(new java.awt.Color(11, 19, 25));
        txtAfPh.setToolTipText("");
        txtAfPh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtAfPh.setName(""); // NOI18N
        txtAfPh.setOpaque(false);
        txtAfPh.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtAfPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAfPhActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(11, 19, 25));
        jLabel49.setText("Sedimentoscopia");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(11, 19, 25));
        jLabel54.setText("Células epiteliais");

        txtSedCelEpitel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSedCelEpitel.setForeground(new java.awt.Color(11, 19, 25));
        txtSedCelEpitel.setToolTipText("");
        txtSedCelEpitel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtSedCelEpitel.setName(""); // NOI18N
        txtSedCelEpitel.setOpaque(false);
        txtSedCelEpitel.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtSedCelEpitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSedCelEpitelActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(11, 19, 25));
        jLabel55.setText("Hemácias");

        txtSedHem.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSedHem.setForeground(new java.awt.Color(11, 19, 25));
        txtSedHem.setToolTipText("");
        txtSedHem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtSedHem.setName(""); // NOI18N
        txtSedHem.setOpaque(false);
        txtSedHem.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtSedHem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSedHemActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(11, 19, 25));
        jLabel60.setText("Leucócitos");

        txtSedLeuc.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSedLeuc.setForeground(new java.awt.Color(11, 19, 25));
        txtSedLeuc.setToolTipText("");
        txtSedLeuc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtSedLeuc.setName(""); // NOI18N
        txtSedLeuc.setOpaque(false);
        txtSedLeuc.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtSedLeuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSedLeucActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(11, 19, 25));
        jLabel59.setText("Cilindros");

        txtSedCilin.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSedCilin.setForeground(new java.awt.Color(11, 19, 25));
        txtSedCilin.setToolTipText("");
        txtSedCilin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtSedCilin.setName(""); // NOI18N
        txtSedCilin.setOpaque(false);
        txtSedCilin.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtSedCilin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSedCilinActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 19, 25));
        jLabel18.setText("por campo");

        jLabel17.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(11, 19, 25));
        jLabel17.setText("por campo");

        jLabel20.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(11, 19, 25));
        jLabel20.setText("por campo");

        jLabel19.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(11, 19, 25));
        jLabel19.setText("por campo");

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

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 128, 200));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 200)));
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setFocusPainted(false);
        btnSalvar.setOpaque(true);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarMouseExited(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)
                            .addComponent(txtAfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)
                            .addComponent(txtAfDens, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAfPh, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(txtAfAspecto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSedLeuc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSedCilin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSedCelEpitel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSedHem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel49))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel54))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSedCelEpitel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jLabel48))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAfDens, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSedHem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel47)
                        .addGap(0, 0, 0)
                        .addComponent(txtAfAspecto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel51)
                        .addGap(0, 0, 0)
                        .addComponent(txtAfPh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel60)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSedLeuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel59)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSedCilin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 40, 470, 360));

        javax.swing.GroupLayout contMasqLayout = new javax.swing.GroupLayout(contMasq);
        contMasq.setLayout(contMasqLayout);
        contMasqLayout.setHorizontalGroup(
            contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
            .addGroup(contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contMasqLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        contMasqLayout.setVerticalGroup(
            contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contMasqLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(contMasq, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAfCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAfCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfCorActionPerformed

    private void txtAfDensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAfDensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfDensActionPerformed

    private void txtAfAspectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAfAspectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfAspectoActionPerformed

    private void txtAfPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAfPhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfPhActionPerformed

    private void txtSedCelEpitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSedCelEpitelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSedCelEpitelActionPerformed

    private void txtSedHemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSedHemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSedHemActionPerformed

    private void txtSedLeucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSedLeucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSedLeucActionPerformed

    private void txtSedCilinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSedCilinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSedCilinActionPerformed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        helper.setMouseBtnFormMoved(btnCancelar, 2, null);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        helper.resMouseBtnFormMoved(btnCancelar, 2, null);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        helper.setMouseBtnFormMoved(btnSalvar, 1, null);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        helper.resMouseBtnFormMoved(btnSalvar, 1, null);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalvarActionPerformed
    
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
            java.util.logging.Logger.getLogger(ExameUrinaRotina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExameUrinaRotina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExameUrinaRotina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExameUrinaRotina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExameUrinaRotina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JPanel contMasq;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtAfAspecto;
    private javax.swing.JTextField txtAfCor;
    private javax.swing.JTextField txtAfDens;
    private javax.swing.JTextField txtAfPh;
    private javax.swing.JTextField txtSedCelEpitel;
    private javax.swing.JTextField txtSedCilin;
    private javax.swing.JTextField txtSedHem;
    private javax.swing.JTextField txtSedLeuc;
    // End of variables declaration//GEN-END:variables
}
