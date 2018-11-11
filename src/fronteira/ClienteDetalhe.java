package fronteira;

import entidade.Helper;
import entidade.Cliente;
import persistencia.ClienteDAO;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Elisson
 */
public class ClienteDetalhe extends javax.swing.JFrame {    
    
    Helper helper = new Helper();
    private int idCliente;
    
    public ClienteDetalhe() {
        initComponents();
        
        formConfig();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgSexo = new javax.swing.ButtonGroup();
        contMasq = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        txtClienteNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtClienteDataNasc = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtClienteCPF = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtClienteRG = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        rbClienteFemi = new javax.swing.JRadioButton();
        rbClienteMasc = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        txtClienteTel = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClienteEnder = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtClienteBairro = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txtClienteCEP = new javax.swing.JFormattedTextField();
        jLabel82 = new javax.swing.JLabel();
        cbxClienteUf = new javax.swing.JComboBox<>();
        jLabel81 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtClienteCidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalhes do Cliente");
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
        jLabel3.setText("DESTALHES DO CLIENTE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(190, 75, 73));
        btnCancelar.setText("Voltar");
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

        txtClienteNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteNome.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteNome.setToolTipText("");
        txtClienteNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteNome.setName(""); // NOI18N
        txtClienteNome.setOpaque(false);
        txtClienteNome.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 59, 77));
        jLabel11.setText("Nome completo");

        txtClienteDataNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteDataNasc.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteDataNasc.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteDataNasc.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 59, 77));
        jLabel12.setText("Data de nascimento");

        txtClienteCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCPF.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteCPF.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCPF.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 59, 77));
        jLabel13.setText("CPF");

        txtClienteRG.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteRG.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteRG.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteRG.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 59, 77));
        jLabel14.setText("RG");

        rbgSexo.add(rbClienteFemi);
        rbClienteFemi.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbClienteFemi.setForeground(new java.awt.Color(11, 19, 25));
        rbClienteFemi.setText("Feminino");
        rbClienteFemi.setFocusPainted(false);
        rbClienteFemi.setOpaque(false);

        rbgSexo.add(rbClienteMasc);
        rbClienteMasc.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbClienteMasc.setForeground(new java.awt.Color(11, 19, 25));
        rbClienteMasc.setText("Masculino");
        rbClienteMasc.setFocusPainted(false);
        rbClienteMasc.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 59, 77));
        jLabel15.setText("Sexo");

        txtClienteTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteTel.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteTel.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtClienteTel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteTel.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 59, 77));
        jLabel16.setText("Telefone");

        txtClienteEnder.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteEnder.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteEnder.setToolTipText("");
        txtClienteEnder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteEnder.setName(""); // NOI18N
        txtClienteEnder.setOpaque(false);
        txtClienteEnder.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(35, 59, 77));
        jLabel18.setText("Endereço");

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

        txtClienteCEP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCEP.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteCEP.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCEP.setOpaque(false);

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(35, 59, 77));
        jLabel82.setText("CEP");

        cbxClienteUf.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cbxClienteUf.setForeground(new java.awt.Color(35, 59, 77));
        cbxClienteUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxClienteUf.setSelectedIndex(12);
        cbxClienteUf.setToolTipText("");
        cbxClienteUf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 8)));
        cbxClienteUf.setFocusable(false);
        cbxClienteUf.setName(""); // NOI18N
        cbxClienteUf.setOpaque(false);

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(35, 59, 77));
        jLabel81.setText("Estado");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(35, 59, 77));
        jLabel80.setText("Cidade");

        txtClienteCidade.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCidade.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCidade.setToolTipText("");
        txtClienteCidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCidade.setName(""); // NOI18N
        txtClienteCidade.setOpaque(false);
        txtClienteCidade.setSelectionColor(new java.awt.Color(35, 59, 77));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel82)
                                        .addComponent(txtClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel81)
                                        .addComponent(cbxClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel18)
                                .addComponent(txtClienteEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtClienteCidade)
                                .addComponent(txtClienteBairro)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel79)
                                        .addComponent(jLabel80))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(77, 77, 77))
                                .addComponent(txtClienteDataNasc))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)))
                        .addComponent(txtClienteNome)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbClienteFemi)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel16)
                                    .addGap(0, 0, 0))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(txtClienteTel)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(30, 30, 30))))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbClienteFemi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel82)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
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
    
    private void formConfig(){
        //Icone do Sistema
        URL url = this.getClass().getResource("/imgIcons/icon.png");  
        Image iconeTitulo;
        iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        
        this.setBackground(new Color(255,255,255,150));
        
        // Posicionamento do Frame
        setLocationRelativeTo(null);
        
        //consultaCliente();
    }
    public void consultaCliente(Cliente cliente){
        Date data = cliente.getData_nasc();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dataString = (java.util.Date) data;
        String dataFormatada = String.valueOf(formato.format(dataString));;
                
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.listarClientes();
        idCliente = cliente.getIdCliente();
        txtClienteNome.setText(cliente.getNome());
        txtClienteDataNasc.setText(dataFormatada);
        txtClienteCPF.setText(cliente.getCpf());
        txtClienteRG.setText(cliente.getRg());
        txtClienteTel.setText(cliente.getTelefone());
        txtClienteEnder.setText(cliente.getEndereco());
        txtClienteBairro.setText(cliente.getBairro());
        txtClienteCEP.setText(cliente.getCep());
        txtClienteCidade.setText(cliente.getCidade());
        cbxClienteUf.setSelectedItem(cliente.getUf());
        if(!cliente.isSexo()){
            rbClienteMasc.setSelected(true);
        }else{
            rbClienteFemi.setSelected(true);
        }
    }
    private void clienteUpDate(){
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dataAtual = new java.util.Date(txtClienteDataNasc.getText().trim());
        Date dataFormatada = Date.valueOf(formato.format(dataAtual));
        boolean sexo;
        sexo = !rbClienteMasc.isSelected();
        
        Cliente cliente = new Cliente();
        cliente.setIdCliente(idCliente);
        cliente.setNome(txtClienteNome.getText().trim());
        cliente.setData_nasc(dataFormatada);
        cliente.setCpf(txtClienteCPF.getText().trim());
        cliente.setRg(txtClienteRG.getText().trim());
        cliente.setTelefone(txtClienteTel.getText().trim());
        cliente.setEndereco(txtClienteEnder.getText().trim());
        cliente.setBairro(txtClienteBairro.getText().trim());
        cliente.setCep(txtClienteCEP.getText().trim());
        cliente.setCidade(txtClienteCidade.getText().trim());
        cliente.setUf(String.valueOf(cbxClienteUf.getSelectedItem()));
        cliente.setSexo(sexo);
        
        ClienteDAO clienteDAO = new ClienteDAO();
        if(clienteDAO.upDate(cliente)){
            consultaCliente(cliente);
            JOptionPane.showMessageDialog(rootPane, "Cadastro Atualizado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falha na atualização");
        }
    }
    
    public void habilitaCampo(boolean habilita){
        this.txtClienteNome.setEditable(habilita);
        this.txtClienteDataNasc.setEditable(habilita);
        this.txtClienteCPF.setEditable(habilita);
        this.txtClienteRG.setEditable(habilita);
        this.rbClienteMasc.setEnabled(habilita);
        this.rbClienteFemi.setEnabled(habilita);
        this.txtClienteTel.setEditable(habilita);
        this.txtClienteEnder.setEditable(habilita);
        this.txtClienteBairro.setEditable(habilita);
        this.txtClienteCEP.setEditable(habilita);
        this.cbxClienteUf.setEnabled(habilita);
        this.txtClienteCidade.setEditable(habilita);
        this.btnSalvar.setVisible(habilita);
    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        clienteUpDate();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        helper.setMouseBtnFormMoved(btnSalvar, 1, null);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        helper.resMouseBtnFormMoved(btnSalvar, 1, null);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        helper.setMouseBtnFormMoved(btnCancelar, 2, null);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        helper.resMouseBtnFormMoved(btnCancelar, 2, null);
    }//GEN-LAST:event_btnCancelarMouseExited
    
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
    private javax.swing.JPanel contMasq;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.ButtonGroup rbgSexo;
    private javax.swing.JTextField txtClienteBairro;
    private javax.swing.JFormattedTextField txtClienteCEP;
    private javax.swing.JFormattedTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteCidade;
    private javax.swing.JFormattedTextField txtClienteDataNasc;
    private javax.swing.JTextField txtClienteEnder;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JFormattedTextField txtClienteRG;
    private javax.swing.JFormattedTextField txtClienteTel;
    // End of variables declaration//GEN-END:variables
}
