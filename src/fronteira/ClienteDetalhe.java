
package fronteira;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import entidade.Helper;

/**
 *
 * @author Elisson
 */
public class ClienteDetalhe extends javax.swing.JFrame {

    Helper helper = new Helper();
    
    public ClienteDetalhe() {
        initComponents();
        
        //Icone do Sistema
        URL url = this.getClass().getResource("/imgIcons/icon.png");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        // Posicionamento do Frame
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    /*private void verifMasq()
    {   // Efeito Mascara Branca
        if(helper.StatusMasq == true)
        {
            helper.showMasq(contBorda, contMasq);
        }
        else
        {
            helper.showMasq(contBorda, contMasq);
        }
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtClienteConv = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtClienteEnder = new javax.swing.JTextField();
        rbClienteFemi = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        rbClienteMasc = new javax.swing.JRadioButton();
        txtClienteBairro = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txtClienteCidade = new javax.swing.JTextField();
        cbxClienteUf = new javax.swing.JComboBox<>();
        jLabel80 = new javax.swing.JLabel();
        txtClienteCod = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txtClienteCEP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        txtClienteDataNasc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtClienteCPF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtClienteRG = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtClienteTel = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalhes do Cliente");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        setName("ClienteDetalhe"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 167, 230)));

        jPanel2.setBackground(new java.awt.Color(0, 167, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(240, 249, 253));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 247, 253));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESTALHES DO CLIENTE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 59, 77));
        jLabel16.setText("Telefone");

        txtClienteConv.setEditable(false);
        txtClienteConv.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteConv.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteConv.setToolTipText("");
        txtClienteConv.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteConv.setName(""); // NOI18N
        txtClienteConv.setOpaque(false);
        txtClienteConv.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(35, 59, 77));
        jLabel17.setText("Convênio");

        txtClienteEnder.setEditable(false);
        txtClienteEnder.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteEnder.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteEnder.setToolTipText("");
        txtClienteEnder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteEnder.setName(""); // NOI18N
        txtClienteEnder.setOpaque(false);
        txtClienteEnder.setSelectionColor(new java.awt.Color(35, 59, 77));

        rbClienteFemi.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbClienteFemi.setForeground(new java.awt.Color(11, 19, 25));
        rbClienteFemi.setText("Feminino");
        rbClienteFemi.setEnabled(false);
        rbClienteFemi.setFocusPainted(false);
        rbClienteFemi.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(35, 59, 77));
        jLabel18.setText("Endereço");

        rbClienteMasc.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbClienteMasc.setForeground(new java.awt.Color(11, 19, 25));
        rbClienteMasc.setText("Masculino");
        rbClienteMasc.setEnabled(false);
        rbClienteMasc.setFocusPainted(false);
        rbClienteMasc.setOpaque(false);

        txtClienteBairro.setEditable(false);
        txtClienteBairro.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteBairro.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteBairro.setToolTipText("");
        txtClienteBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteBairro.setName(""); // NOI18N
        txtClienteBairro.setOpaque(false);
        txtClienteBairro.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(35, 59, 77));
        jLabel79.setText("Bairro");

        txtClienteCidade.setEditable(false);
        txtClienteCidade.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCidade.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCidade.setToolTipText("");
        txtClienteCidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCidade.setName(""); // NOI18N
        txtClienteCidade.setOpaque(false);
        txtClienteCidade.setSelectionColor(new java.awt.Color(35, 59, 77));

        cbxClienteUf.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cbxClienteUf.setForeground(new java.awt.Color(35, 59, 77));
        cbxClienteUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxClienteUf.setSelectedIndex(12);
        cbxClienteUf.setToolTipText("");
        cbxClienteUf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 8)));
        cbxClienteUf.setEnabled(false);
        cbxClienteUf.setFocusable(false);
        cbxClienteUf.setName(""); // NOI18N
        cbxClienteUf.setOpaque(false);

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(35, 59, 77));
        jLabel80.setText("Cidade");

        txtClienteCod.setEditable(false);
        txtClienteCod.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCod.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCod.setText("# 0013899");
        txtClienteCod.setToolTipText("");
        txtClienteCod.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCod.setName(""); // NOI18N
        txtClienteCod.setOpaque(false);
        txtClienteCod.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 59, 77));
        jLabel10.setText("Código");

        txtClienteNome.setEditable(false);
        txtClienteNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteNome.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteNome.setToolTipText("");
        txtClienteNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteNome.setName(""); // NOI18N
        txtClienteNome.setOpaque(false);
        txtClienteNome.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(35, 59, 77));
        jLabel81.setText("Estado");

        txtClienteCEP.setEditable(false);
        txtClienteCEP.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCEP.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCEP.setToolTipText("");
        txtClienteCEP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCEP.setName(""); // NOI18N
        txtClienteCEP.setOpaque(false);
        txtClienteCEP.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 59, 77));
        jLabel11.setText("Nome completo");

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(35, 59, 77));
        jLabel82.setText("CEP");

        txtClienteDataNasc.setEditable(false);
        txtClienteDataNasc.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteDataNasc.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteDataNasc.setToolTipText("");
        txtClienteDataNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteDataNasc.setName(""); // NOI18N
        txtClienteDataNasc.setOpaque(false);
        txtClienteDataNasc.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 59, 77));
        jLabel12.setText("Data de nascimento");

        txtClienteCPF.setEditable(false);
        txtClienteCPF.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCPF.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCPF.setToolTipText("");
        txtClienteCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCPF.setName(""); // NOI18N
        txtClienteCPF.setOpaque(false);
        txtClienteCPF.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 59, 77));
        jLabel13.setText("CPF");

        txtClienteRG.setEditable(false);
        txtClienteRG.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteRG.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteRG.setToolTipText("");
        txtClienteRG.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteRG.setName(""); // NOI18N
        txtClienteRG.setOpaque(false);
        txtClienteRG.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 59, 77));
        jLabel14.setText("RG");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 59, 77));
        jLabel15.setText("Sexo");

        txtClienteTel.setEditable(false);
        txtClienteTel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteTel.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteTel.setToolTipText("");
        txtClienteTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteTel.setName(""); // NOI18N
        txtClienteTel.setOpaque(false);
        txtClienteTel.setSelectionColor(new java.awt.Color(35, 59, 77));

        btnCancelar.setBackground(new java.awt.Color(190, 75, 73));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Voltar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.setOpaque(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(40, 124, 162));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Editar");
        btnSalvar.setBorderPainted(false);
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setFocusPainted(false);
        btnSalvar.setOpaque(true);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(txtClienteTel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(txtClienteConv)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(txtClienteEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClienteBairro)
                                    .addComponent(jLabel79)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel82))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel81)
                                    .addComponent(cbxClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClienteCidade)
                                    .addComponent(jLabel80)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(txtClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbClienteFemi)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(0, 0, 0)
                            .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(0, 0, 0)
                            .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbClienteFemi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteConv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel80)
                            .addGap(0, 0, 0)
                            .addComponent(txtClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel81)
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(cbxClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteDetalhe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JComboBox<String> cbxClienteUf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbClienteFemi;
    private javax.swing.JRadioButton rbClienteMasc;
    private javax.swing.JTextField txtClienteBairro;
    private javax.swing.JTextField txtClienteCEP;
    private javax.swing.JTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteCidade;
    private javax.swing.JTextField txtClienteCod;
    private javax.swing.JTextField txtClienteConv;
    private javax.swing.JTextField txtClienteDataNasc;
    private javax.swing.JTextField txtClienteEnder;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtClienteRG;
    private javax.swing.JTextField txtClienteTel;
    // End of variables declaration//GEN-END:variables
}
