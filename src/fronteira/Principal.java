
package fronteira;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Principal extends javax.swing.JFrame {
    
    Hemograma       hemograma      = new Hemograma();
    Bioquimica      bioquimica     = new Bioquimica();
    UrinaRotina     urinaRotina    = new UrinaRotina();
    SangueOculto    sangueOculto   = new SangueOculto();
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        
        divExame.setVisible(false);
        divCliente.setVisible(false);
        divConfigura.setVisible(false);
        divCadastraCliente.setVisible(false);
        divCadastraResultado.setVisible(false);
        divRelatorioExame.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contBorda = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JToggleButton();
        btnExame = new javax.swing.JToggleButton();
        btnCliente = new javax.swing.JToggleButton();
        btnConfigura = new javax.swing.JToggleButton();
        barNotifq = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        divInicio = new javax.swing.JPanel();
        btnInicioCadasCliente = new javax.swing.JToggleButton();
        btnInicioCadsResulExam = new javax.swing.JToggleButton();
        btnInicoGerarRelat = new javax.swing.JToggleButton();
        divExame = new javax.swing.JPanel();
        divNavExame = new javax.swing.JPanel();
        btnCadastraPedido = new javax.swing.JToggleButton();
        btnCadastraResultado = new javax.swing.JToggleButton();
        btnRelatorioExame = new javax.swing.JToggleButton();
        txtBuscar1 = new javax.swing.JTextField();
        btnBuscar5 = new javax.swing.JToggleButton();
        divCadastraExame = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtCodPedido = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDataPedido = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtConvenio = new javax.swing.JTextField();
        jpnExames = new javax.swing.JPanel();
        cbxHemograma = new javax.swing.JCheckBox();
        cbxGlicose = new javax.swing.JCheckBox();
        cbxAcidoUrico = new javax.swing.JCheckBox();
        cbxUreia = new javax.swing.JCheckBox();
        cbxCoatinina = new javax.swing.JCheckBox();
        cbxColesterolTotal = new javax.swing.JCheckBox();
        cbxColesterolFracionado = new javax.swing.JCheckBox();
        cbxTriglicerides = new javax.swing.JCheckBox();
        cbxTgoTgp = new javax.swing.JCheckBox();
        cbxGamaGt = new javax.swing.JCheckBox();
        cbxBilirrubina = new javax.swing.JCheckBox();
        cbxUrinaRotina = new javax.swing.JCheckBox();
        cbxEpf = new javax.swing.JCheckBox();
        cbxSangueOculto = new javax.swing.JCheckBox();
        btnCadastraExame = new javax.swing.JToggleButton();
        btnCadastraExame2 = new javax.swing.JToggleButton();
        divCadastraResultado = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtCodPedido1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtDataPedido1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtConvenio1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtCodCliente1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        btnHemograma = new javax.swing.JToggleButton();
        btnBioquimica = new javax.swing.JToggleButton();
        btnUrinaRotina = new javax.swing.JToggleButton();
        btnSangueOculto = new javax.swing.JToggleButton();
        divRelatorioExame = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnBuscar7 = new javax.swing.JToggleButton();
        btnBuscar8 = new javax.swing.JToggleButton();
        btnBuscar9 = new javax.swing.JToggleButton();
        divCliente = new javax.swing.JPanel();
        divNavCliente = new javax.swing.JPanel();
        btnconsultaCliente = new javax.swing.JToggleButton();
        btnCadastraCliente = new javax.swing.JToggleButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();
        divConsultaCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBuscar2 = new javax.swing.JToggleButton();
        btnBuscar1 = new javax.swing.JToggleButton();
        btnBuscar3 = new javax.swing.JToggleButton();
        divCadastraCliente = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtUsuario3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtUsuario4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUsuario5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtUsuario6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtUsuario7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtUsuario8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtUsuario9 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txtUsuario10 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        txtUsuario11 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txtUsuario12 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        btnBuscar4 = new javax.swing.JToggleButton();
        btnBuscar6 = new javax.swing.JToggleButton();
        divConfigura = new javax.swing.JPanel();
        btnSair9 = new javax.swing.JToggleButton();
        btnSair8 = new javax.swing.JToggleButton();
        btnSair6 = new javax.swing.JToggleButton();
        btnSair7 = new javax.swing.JToggleButton();
        btnSair10 = new javax.swing.JToggleButton();
        btnSair11 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIOLAB Análises Clínicas - UX LAB 1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contBorda.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 167, 230)));
        contBorda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(0, 167, 230));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/bioLabLogo.png"))); // NOI18N
        jLabel2.setToolTipText("Bio Lab - Análises Clínicas");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 160));

        nav.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 160));

        btnInicio.setBackground(new java.awt.Color(0, 128, 200));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Home_18px.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 40, 0, 0));
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusable(false);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicio.setIconTextGap(30);
        btnInicio.setNextFocusableComponent(btnExame);
        btnInicio.setOpaque(true);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        nav.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 160, 282, 50));

        btnExame.setBackground(new java.awt.Color(0, 167, 230));
        btnExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExame.setForeground(new java.awt.Color(255, 255, 255));
        btnExame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Test_Passed_18px.png"))); // NOI18N
        btnExame.setText("Exames");
        btnExame.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 40, 0, 0));
        btnExame.setBorderPainted(false);
        btnExame.setContentAreaFilled(false);
        btnExame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExame.setFocusable(false);
        btnExame.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExame.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExame.setIconTextGap(30);
        btnExame.setNextFocusableComponent(btnCliente);
        btnExame.setOpaque(true);
        btnExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExameActionPerformed(evt);
            }
        });
        nav.add(btnExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 210, 282, 50));

        btnCliente.setBackground(new java.awt.Color(0, 167, 230));
        btnCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Management_18px.png"))); // NOI18N
        btnCliente.setText("Clientes");
        btnCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 40, 0, 0));
        btnCliente.setBorderPainted(false);
        btnCliente.setContentAreaFilled(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.setFocusable(false);
        btnCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCliente.setIconTextGap(30);
        btnCliente.setNextFocusableComponent(btnConfigura);
        btnCliente.setOpaque(true);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        nav.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 260, 282, 50));

        btnConfigura.setBackground(new java.awt.Color(0, 167, 230));
        btnConfigura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfigura.setForeground(new java.awt.Color(255, 255, 255));
        btnConfigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Wrench_18px.png"))); // NOI18N
        btnConfigura.setText("Configurações");
        btnConfigura.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 40, 0, 0));
        btnConfigura.setBorderPainted(false);
        btnConfigura.setContentAreaFilled(false);
        btnConfigura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfigura.setFocusable(false);
        btnConfigura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfigura.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfigura.setIconTextGap(30);
        btnConfigura.setNextFocusableComponent(btnCadastraResultado);
        btnConfigura.setOpaque(true);
        btnConfigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguraActionPerformed(evt);
            }
        });
        nav.add(btnConfigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 310, 282, 50));

        contBorda.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 280, 620));

        barNotifq.setBackground(new java.awt.Color(255, 255, 255));
        barNotifq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setBackground(new java.awt.Color(35, 59, 77));
        btnMinimizar.setForeground(new java.awt.Color(35, 59, 77));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Subtract_18px.png"))); // NOI18N
        btnMinimizar.setToolTipText("Minimizar Janela");
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
        barNotifq.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 50));

        btnSair.setBackground(new java.awt.Color(35, 59, 77));
        btnSair.setForeground(new java.awt.Color(35, 59, 77));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Delete_18px.png"))); // NOI18N
        btnSair.setToolTipText("Fechar Aplicação");
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.setNextFocusableComponent(btnMinimizar);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        barNotifq.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 40, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 59, 77));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_User_Shield_22px_2.png"))); // NOI18N
        jLabel1.setText("Administrador");
        jLabel1.setToolTipText("Nível de Acesso");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barNotifq.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 140, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 59, 77));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Male_User_22px.png"))); // NOI18N
        jLabel3.setText("$NomeDeUsuario");
        jLabel3.setToolTipText("Usuário");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barNotifq.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 50));

        contBorda.add(barNotifq, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 2, 830, 50));

        divInicio.setBackground(new java.awt.Color(255, 255, 255));

        btnInicioCadasCliente.setBackground(new java.awt.Color(35, 59, 77));
        btnInicioCadasCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInicioCadasCliente.setForeground(new java.awt.Color(35, 59, 77));
        btnInicioCadasCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Registration_32px.png"))); // NOI18N
        btnInicioCadasCliente.setText("<html><p style=\"text-align:center\">Cadastrar Cliente");
        btnInicioCadasCliente.setToolTipText("");
        btnInicioCadasCliente.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnInicioCadasCliente.setContentAreaFilled(false);
        btnInicioCadasCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicioCadasCliente.setFocusable(false);
        btnInicioCadasCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicioCadasCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicioCadasCliente.setIconTextGap(15);
        btnInicioCadasCliente.setNextFocusableComponent(btnMinimizar);
        btnInicioCadasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioCadasClienteActionPerformed(evt);
            }
        });

        btnInicioCadsResulExam.setBackground(new java.awt.Color(35, 59, 77));
        btnInicioCadsResulExam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInicioCadsResulExam.setForeground(new java.awt.Color(35, 59, 77));
        btnInicioCadsResulExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Edit_File_32px.png"))); // NOI18N
        btnInicioCadsResulExam.setText("<html><p style=\"text-align:center\">Cadastrar Resultado</p><p style=\"text-align:center\"> de Exame\n");
        btnInicioCadsResulExam.setToolTipText("");
        btnInicioCadsResulExam.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 10)));
        btnInicioCadsResulExam.setContentAreaFilled(false);
        btnInicioCadsResulExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicioCadsResulExam.setFocusable(false);
        btnInicioCadsResulExam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicioCadsResulExam.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicioCadsResulExam.setIconTextGap(8);
        btnInicioCadsResulExam.setInheritsPopupMenu(true);
        btnInicioCadsResulExam.setNextFocusableComponent(btnMinimizar);
        btnInicioCadsResulExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioCadsResulExamActionPerformed(evt);
            }
        });

        btnInicoGerarRelat.setBackground(new java.awt.Color(35, 59, 77));
        btnInicoGerarRelat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInicoGerarRelat.setForeground(new java.awt.Color(35, 59, 77));
        btnInicoGerarRelat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Play_Graph_Report_32px.png"))); // NOI18N
        btnInicoGerarRelat.setText("<html><p style=\"text-align:center\">Gerar Relatório ");
        btnInicoGerarRelat.setToolTipText("");
        btnInicoGerarRelat.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnInicoGerarRelat.setContentAreaFilled(false);
        btnInicoGerarRelat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicoGerarRelat.setFocusable(false);
        btnInicoGerarRelat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicoGerarRelat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicoGerarRelat.setIconTextGap(15);
        btnInicoGerarRelat.setNextFocusableComponent(btnMinimizar);
        btnInicoGerarRelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicoGerarRelatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divInicioLayout = new javax.swing.GroupLayout(divInicio);
        divInicio.setLayout(divInicioLayout);
        divInicioLayout.setHorizontalGroup(
            divInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divInicioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnInicioCadasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnInicioCadsResulExam, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnInicoGerarRelat, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        divInicioLayout.setVerticalGroup(
            divInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divInicioLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(divInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicioCadasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioCadsResulExam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicoGerarRelat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        contBorda.add(divInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 52, 830, 570));

        divExame.setBackground(new java.awt.Color(255, 255, 255));
        divExame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        divNavExame.setBackground(new java.awt.Color(0, 167, 230));
        divNavExame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastraPedido.setBackground(new java.awt.Color(0, 128, 200));
        btnCadastraPedido.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCadastraPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastraPedido.setText("Cadastrar Pedido");
        btnCadastraPedido.setBorder(null);
        btnCadastraPedido.setBorderPainted(false);
        btnCadastraPedido.setContentAreaFilled(false);
        btnCadastraPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastraPedido.setFocusable(false);
        btnCadastraPedido.setNextFocusableComponent(btnCadastraResultado);
        btnCadastraPedido.setOpaque(true);
        btnCadastraPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraPedidoActionPerformed(evt);
            }
        });
        divNavExame.add(btnCadastraPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        btnCadastraResultado.setBackground(new java.awt.Color(0, 167, 230));
        btnCadastraResultado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCadastraResultado.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastraResultado.setText("Cadastrar Resultados");
        btnCadastraResultado.setBorder(null);
        btnCadastraResultado.setBorderPainted(false);
        btnCadastraResultado.setContentAreaFilled(false);
        btnCadastraResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastraResultado.setFocusable(false);
        btnCadastraResultado.setNextFocusableComponent(btnRelatorioExame);
        btnCadastraResultado.setOpaque(true);
        btnCadastraResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraResultadoActionPerformed(evt);
            }
        });
        divNavExame.add(btnCadastraResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 140, 50));

        btnRelatorioExame.setBackground(new java.awt.Color(0, 167, 230));
        btnRelatorioExame.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRelatorioExame.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorioExame.setText("Relatorio de Exames");
        btnRelatorioExame.setBorder(null);
        btnRelatorioExame.setBorderPainted(false);
        btnRelatorioExame.setContentAreaFilled(false);
        btnRelatorioExame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorioExame.setFocusable(false);
        btnRelatorioExame.setOpaque(true);
        btnRelatorioExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioExameActionPerformed(evt);
            }
        });
        divNavExame.add(btnRelatorioExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 140, 50));

        txtBuscar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtBuscar1.setForeground(new java.awt.Color(40, 124, 162));
        txtBuscar1.setText("Buscar exame...");
        txtBuscar1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));
        divNavExame.add(txtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 200, 30));

        btnBuscar5.setBackground(new java.awt.Color(0, 128, 200));
        btnBuscar5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar5.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar5.setText("Buscar");
        btnBuscar5.setBorder(null);
        btnBuscar5.setBorderPainted(false);
        btnBuscar5.setContentAreaFilled(false);
        btnBuscar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar5.setFocusable(false);
        btnBuscar5.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar5.setOpaque(true);
        btnBuscar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar5ActionPerformed(evt);
            }
        });
        divNavExame.add(btnBuscar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 80, 30));

        divExame.add(divNavExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        divCadastraExame.setBackground(new java.awt.Color(255, 255, 255));
        divCadastraExame.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(35, 59, 77));
        jLabel19.setText("Cód. Pedido");

        txtCodPedido.setEditable(false);
        txtCodPedido.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCodPedido.setForeground(new java.awt.Color(35, 59, 77));
        txtCodPedido.setText("# 000087");
        txtCodPedido.setToolTipText("");
        txtCodPedido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtCodPedido.setName(""); // NOI18N
        txtCodPedido.setOpaque(false);
        txtCodPedido.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtCodPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPedidoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(35, 59, 77));
        jLabel22.setText("Cód. Cliente");

        txtCodCliente.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCodCliente.setForeground(new java.awt.Color(35, 59, 77));
        txtCodCliente.setToolTipText("");
        txtCodCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtCodCliente.setName(""); // NOI18N
        txtCodCliente.setOpaque(false);
        txtCodCliente.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(35, 59, 77));
        jLabel20.setText("Nome Completo");

        txtNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(35, 59, 77));
        txtNome.setToolTipText("");
        txtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtNome.setName(""); // NOI18N
        txtNome.setOpaque(false);
        txtNome.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(35, 59, 77));
        jLabel21.setText("Data do Pedido");

        txtDataPedido.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtDataPedido.setForeground(new java.awt.Color(35, 59, 77));
        txtDataPedido.setToolTipText("");
        txtDataPedido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtDataPedido.setName(""); // NOI18N
        txtDataPedido.setOpaque(false);
        txtDataPedido.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtDataPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPedidoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(35, 59, 77));
        jLabel23.setText("Convênio");

        txtConvenio.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio.setForeground(new java.awt.Color(35, 59, 77));
        txtConvenio.setToolTipText("");
        txtConvenio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio.setName(""); // NOI18N
        txtConvenio.setOpaque(false);
        txtConvenio.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvenioActionPerformed(evt);
            }
        });

        jpnExames.setOpaque(false);
        jpnExames.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxHemograma.setBackground(new java.awt.Color(255, 255, 255));
        cbxHemograma.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxHemograma.setForeground(new java.awt.Color(35, 59, 77));
        cbxHemograma.setText("Hemograma");
        cbxHemograma.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxHemograma.setBorderPainted(true);
        cbxHemograma.setFocusable(false);
        cbxHemograma.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxHemograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxHemograma.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxHemograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHemogramaActionPerformed(evt);
            }
        });
        jpnExames.add(cbxHemograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 62));

        cbxGlicose.setBackground(new java.awt.Color(255, 255, 255));
        cbxGlicose.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxGlicose.setForeground(new java.awt.Color(35, 59, 77));
        cbxGlicose.setText("Glicose");
        cbxGlicose.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxGlicose.setBorderPainted(true);
        cbxGlicose.setFocusable(false);
        cbxGlicose.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxGlicose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxGlicose.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxGlicose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGlicoseActionPerformed(evt);
            }
        });
        jpnExames.add(cbxGlicose, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 62));

        cbxAcidoUrico.setBackground(new java.awt.Color(255, 255, 255));
        cbxAcidoUrico.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxAcidoUrico.setForeground(new java.awt.Color(35, 59, 77));
        cbxAcidoUrico.setText("Ácido úrico");
        cbxAcidoUrico.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxAcidoUrico.setBorderPainted(true);
        cbxAcidoUrico.setFocusable(false);
        cbxAcidoUrico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxAcidoUrico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxAcidoUrico.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxAcidoUrico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAcidoUricoActionPerformed(evt);
            }
        });
        jpnExames.add(cbxAcidoUrico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 130, 62));

        cbxUreia.setBackground(new java.awt.Color(255, 255, 255));
        cbxUreia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxUreia.setForeground(new java.awt.Color(35, 59, 77));
        cbxUreia.setText("Ureia");
        cbxUreia.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxUreia.setBorderPainted(true);
        cbxUreia.setFocusable(false);
        cbxUreia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxUreia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxUreia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxUreia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUreiaActionPerformed(evt);
            }
        });
        jpnExames.add(cbxUreia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 140, 62));

        cbxCoatinina.setBackground(new java.awt.Color(255, 255, 255));
        cbxCoatinina.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxCoatinina.setForeground(new java.awt.Color(35, 59, 77));
        cbxCoatinina.setText("Coatinina");
        cbxCoatinina.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxCoatinina.setBorderPainted(true);
        cbxCoatinina.setFocusable(false);
        cbxCoatinina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxCoatinina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxCoatinina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxCoatinina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCoatininaActionPerformed(evt);
            }
        });
        jpnExames.add(cbxCoatinina, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 130, 62));

        cbxColesterolTotal.setBackground(new java.awt.Color(255, 255, 255));
        cbxColesterolTotal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxColesterolTotal.setForeground(new java.awt.Color(35, 59, 77));
        cbxColesterolTotal.setText("Colesterol Total");
        cbxColesterolTotal.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxColesterolTotal.setBorderPainted(true);
        cbxColesterolTotal.setFocusable(false);
        cbxColesterolTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxColesterolTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxColesterolTotal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxColesterolTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxColesterolTotalActionPerformed(evt);
            }
        });
        jpnExames.add(cbxColesterolTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 130, 62));

        cbxColesterolFracionado.setBackground(new java.awt.Color(255, 255, 255));
        cbxColesterolFracionado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxColesterolFracionado.setForeground(new java.awt.Color(35, 59, 77));
        cbxColesterolFracionado.setText("Colesterol Frações");
        cbxColesterolFracionado.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 2)));
        cbxColesterolFracionado.setBorderPainted(true);
        cbxColesterolFracionado.setFocusable(false);
        cbxColesterolFracionado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxColesterolFracionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxColesterolFracionado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxColesterolFracionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxColesterolFracionadoActionPerformed(evt);
            }
        });
        jpnExames.add(cbxColesterolFracionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, 62));

        cbxTriglicerides.setBackground(new java.awt.Color(255, 255, 255));
        cbxTriglicerides.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxTriglicerides.setForeground(new java.awt.Color(35, 59, 77));
        cbxTriglicerides.setText("Triglicerides");
        cbxTriglicerides.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxTriglicerides.setBorderPainted(true);
        cbxTriglicerides.setFocusable(false);
        cbxTriglicerides.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxTriglicerides.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxTriglicerides.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxTriglicerides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTrigliceridesActionPerformed(evt);
            }
        });
        jpnExames.add(cbxTriglicerides, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 130, 62));

        cbxTgoTgp.setBackground(new java.awt.Color(255, 255, 255));
        cbxTgoTgp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxTgoTgp.setForeground(new java.awt.Color(35, 59, 77));
        cbxTgoTgp.setText("TGO/TGP");
        cbxTgoTgp.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxTgoTgp.setBorderPainted(true);
        cbxTgoTgp.setFocusable(false);
        cbxTgoTgp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxTgoTgp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxTgoTgp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxTgoTgp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTgoTgpActionPerformed(evt);
            }
        });
        jpnExames.add(cbxTgoTgp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 140, 62));

        cbxGamaGt.setBackground(new java.awt.Color(255, 255, 255));
        cbxGamaGt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxGamaGt.setForeground(new java.awt.Color(35, 59, 77));
        cbxGamaGt.setText("Gama GT");
        cbxGamaGt.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxGamaGt.setBorderPainted(true);
        cbxGamaGt.setFocusable(false);
        cbxGamaGt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxGamaGt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxGamaGt.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxGamaGt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGamaGtActionPerformed(evt);
            }
        });
        jpnExames.add(cbxGamaGt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 62));

        cbxBilirrubina.setBackground(new java.awt.Color(255, 255, 255));
        cbxBilirrubina.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxBilirrubina.setForeground(new java.awt.Color(35, 59, 77));
        cbxBilirrubina.setText("Bilirrubina");
        cbxBilirrubina.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxBilirrubina.setBorderPainted(true);
        cbxBilirrubina.setFocusable(false);
        cbxBilirrubina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxBilirrubina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxBilirrubina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxBilirrubina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBilirrubinaActionPerformed(evt);
            }
        });
        jpnExames.add(cbxBilirrubina, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 130, 62));

        cbxUrinaRotina.setBackground(new java.awt.Color(255, 255, 255));
        cbxUrinaRotina.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxUrinaRotina.setForeground(new java.awt.Color(35, 59, 77));
        cbxUrinaRotina.setText("Urina Rotina");
        cbxUrinaRotina.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxUrinaRotina.setBorderPainted(true);
        cbxUrinaRotina.setFocusable(false);
        cbxUrinaRotina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxUrinaRotina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxUrinaRotina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxUrinaRotina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUrinaRotinaActionPerformed(evt);
            }
        });
        jpnExames.add(cbxUrinaRotina, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 62));

        cbxEpf.setBackground(new java.awt.Color(255, 255, 255));
        cbxEpf.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxEpf.setForeground(new java.awt.Color(35, 59, 77));
        cbxEpf.setText("EPF");
        cbxEpf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxEpf.setBorderPainted(true);
        cbxEpf.setFocusable(false);
        cbxEpf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxEpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxEpf.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxEpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEpfActionPerformed(evt);
            }
        });
        jpnExames.add(cbxEpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 130, 62));

        cbxSangueOculto.setBackground(new java.awt.Color(255, 255, 255));
        cbxSangueOculto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxSangueOculto.setForeground(new java.awt.Color(35, 59, 77));
        cbxSangueOculto.setText("Sangue Oculto");
        cbxSangueOculto.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxSangueOculto.setBorderPainted(true);
        cbxSangueOculto.setFocusable(false);
        cbxSangueOculto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxSangueOculto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxSangueOculto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxSangueOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSangueOcultoActionPerformed(evt);
            }
        });
        jpnExames.add(cbxSangueOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 140, 62));

        btnCadastraExame.setBackground(new java.awt.Color(190, 75, 73));
        btnCadastraExame.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCadastraExame.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastraExame.setText("Cancelar");
        btnCadastraExame.setBorder(null);
        btnCadastraExame.setBorderPainted(false);
        btnCadastraExame.setContentAreaFilled(false);
        btnCadastraExame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastraExame.setFocusPainted(false);
        btnCadastraExame.setNextFocusableComponent(btnCadastraResultado);
        btnCadastraExame.setOpaque(true);
        btnCadastraExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraExameActionPerformed(evt);
            }
        });

        btnCadastraExame2.setBackground(new java.awt.Color(0, 167, 230));
        btnCadastraExame2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCadastraExame2.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastraExame2.setText("Salvar");
        btnCadastraExame2.setBorder(null);
        btnCadastraExame2.setBorderPainted(false);
        btnCadastraExame2.setContentAreaFilled(false);
        btnCadastraExame2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastraExame2.setFocusPainted(false);
        btnCadastraExame2.setNextFocusableComponent(btnCadastraResultado);
        btnCadastraExame2.setOpaque(true);
        btnCadastraExame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraExame2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divCadastraExameLayout = new javax.swing.GroupLayout(divCadastraExame);
        divCadastraExame.setLayout(divCadastraExameLayout);
        divCadastraExameLayout.setHorizontalGroup(
            divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraExameLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel19)
                .addGap(35, 35, 35)
                .addComponent(jLabel22)
                .addGap(35, 35, 35)
                .addComponent(jLabel20)
                .addGap(211, 211, 211)
                .addComponent(jLabel21)
                .addGap(55, 55, 55)
                .addComponent(jLabel23))
            .addGroup(divCadastraExameLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(divCadastraExameLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jpnExames, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(divCadastraExameLayout.createSequentialGroup()
                .addGap(522, 522, 522)
                .addComponent(btnCadastraExame2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastraExame, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        divCadastraExameLayout.setVerticalGroup(
            divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraExameLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20)
                    .addGroup(divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jLabel23)))
                .addGap(0, 0, 0)
                .addGroup(divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jpnExames, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastraExame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastraExame2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        divExame.add(divCadastraExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 520));

        divCadastraResultado.setBackground(new java.awt.Color(255, 255, 255));
        divCadastraResultado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(35, 59, 77));
        jLabel24.setText("Cód. Pedido");

        txtCodPedido1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCodPedido1.setForeground(new java.awt.Color(35, 59, 77));
        txtCodPedido1.setToolTipText("");
        txtCodPedido1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtCodPedido1.setName(""); // NOI18N
        txtCodPedido1.setOpaque(false);
        txtCodPedido1.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtCodPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPedido1ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(35, 59, 77));
        jLabel27.setText("Data do Pedido");

        txtDataPedido1.setEditable(false);
        txtDataPedido1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtDataPedido1.setForeground(new java.awt.Color(35, 59, 77));
        txtDataPedido1.setToolTipText("");
        txtDataPedido1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtDataPedido1.setName(""); // NOI18N
        txtDataPedido1.setOpaque(false);
        txtDataPedido1.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtDataPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPedido1ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(35, 59, 77));
        jLabel28.setText("Convênio");

        txtConvenio1.setEditable(false);
        txtConvenio1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio1.setForeground(new java.awt.Color(35, 59, 77));
        txtConvenio1.setToolTipText("");
        txtConvenio1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio1.setName(""); // NOI18N
        txtConvenio1.setOpaque(false);
        txtConvenio1.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtConvenio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvenio1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(35, 59, 77));
        jLabel25.setText("Cód. Cliente");

        txtCodCliente1.setEditable(false);
        txtCodCliente1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCodCliente1.setForeground(new java.awt.Color(35, 59, 77));
        txtCodCliente1.setToolTipText("");
        txtCodCliente1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtCodCliente1.setName(""); // NOI18N
        txtCodCliente1.setOpaque(false);
        txtCodCliente1.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtCodCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCliente1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(35, 59, 77));
        jLabel26.setText("Nome Completo");

        txtNome1.setEditable(false);
        txtNome1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNome1.setForeground(new java.awt.Color(35, 59, 77));
        txtNome1.setToolTipText("");
        txtNome1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtNome1.setName(""); // NOI18N
        txtNome1.setOpaque(false);
        txtNome1.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome1ActionPerformed(evt);
            }
        });

        btnHemograma.setBackground(new java.awt.Color(255, 255, 255));
        btnHemograma.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHemograma.setForeground(new java.awt.Color(35, 59, 77));
        btnHemograma.setText("Hemograma");
        btnHemograma.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)));
        btnHemograma.setContentAreaFilled(false);
        btnHemograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHemograma.setFocusPainted(false);
        btnHemograma.setNextFocusableComponent(btnCadastraResultado);
        btnHemograma.setOpaque(true);
        btnHemograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHemogramaActionPerformed(evt);
            }
        });

        btnBioquimica.setBackground(new java.awt.Color(255, 255, 255));
        btnBioquimica.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBioquimica.setForeground(new java.awt.Color(35, 59, 77));
        btnBioquimica.setText("Bioquímica");
        btnBioquimica.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)));
        btnBioquimica.setContentAreaFilled(false);
        btnBioquimica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBioquimica.setFocusPainted(false);
        btnBioquimica.setNextFocusableComponent(btnCadastraResultado);
        btnBioquimica.setOpaque(true);
        btnBioquimica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBioquimicaActionPerformed(evt);
            }
        });

        btnUrinaRotina.setBackground(new java.awt.Color(255, 255, 255));
        btnUrinaRotina.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnUrinaRotina.setForeground(new java.awt.Color(35, 59, 77));
        btnUrinaRotina.setText("Urina Rotina");
        btnUrinaRotina.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)));
        btnUrinaRotina.setContentAreaFilled(false);
        btnUrinaRotina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUrinaRotina.setFocusPainted(false);
        btnUrinaRotina.setNextFocusableComponent(btnCadastraResultado);
        btnUrinaRotina.setOpaque(true);
        btnUrinaRotina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrinaRotinaActionPerformed(evt);
            }
        });

        btnSangueOculto.setBackground(new java.awt.Color(255, 255, 255));
        btnSangueOculto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSangueOculto.setForeground(new java.awt.Color(35, 59, 77));
        btnSangueOculto.setText("<html>\n<p style=\"text-align:center\">EPF</p>\n<p>Sangue Oculto</p>");
        btnSangueOculto.setActionCommand("<html>\n<p><center> EPF</center></p>\n\n<p>Sangue Oculto</p>\n\n</html");
        btnSangueOculto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)));
        btnSangueOculto.setContentAreaFilled(false);
        btnSangueOculto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSangueOculto.setFocusPainted(false);
        btnSangueOculto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSangueOculto.setNextFocusableComponent(btnCadastraResultado);
        btnSangueOculto.setOpaque(true);
        btnSangueOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSangueOcultoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divCadastraResultadoLayout = new javax.swing.GroupLayout(divCadastraResultado);
        divCadastraResultado.setLayout(divCadastraResultadoLayout);
        divCadastraResultadoLayout.setHorizontalGroup(
            divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraResultadoLayout.createSequentialGroup()
                .addGroup(divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(divCadastraResultadoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel24)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel27)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divCadastraResultadoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(txtCodPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtConvenio1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraResultadoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel25)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel26))
                    .addGroup(divCadastraResultadoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(txtCodCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraResultadoLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnHemograma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnBioquimica, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraResultadoLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnUrinaRotina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnSangueOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(122, 122, 122))
        );
        divCadastraResultadoLayout.setVerticalGroup(
            divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraResultadoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGroup(divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConvenio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGroup(divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHemograma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBioquimica, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUrinaRotina, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSangueOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        divExame.add(divCadastraResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 520));

        divRelatorioExame.setBackground(new java.awt.Color(255, 255, 255));
        divRelatorioExame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(18, 12, 30));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "0001", "Elisson Carvalho de Araujo", "123.123.123.12", "Pendente"},
                {null, null, null, null, null}
            },
            new String [] {
                "Cód. Pedido", "Cód. Cliente", "Nome Completo", "CPF", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(25);
        jTable2.setRowMargin(2);
        jTable2.setSelectionBackground(new java.awt.Color(0, 128, 200));
        jTable2.setSelectionForeground(new java.awt.Color(232, 230, 236));
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        divRelatorioExame.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 770, 430));

        btnBuscar7.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar7.setForeground(new java.awt.Color(0, 167, 230));
        btnBuscar7.setText("Detalhes");
        btnBuscar7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 124, 162), 2));
        btnBuscar7.setBorderPainted(false);
        btnBuscar7.setContentAreaFilled(false);
        btnBuscar7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar7.setFocusPainted(false);
        btnBuscar7.setFocusable(false);
        btnBuscar7.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar7ActionPerformed(evt);
            }
        });
        divRelatorioExame.add(btnBuscar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 80, 30));

        btnBuscar8.setBackground(new java.awt.Color(0, 167, 230));
        btnBuscar8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar8.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar8.setText("Editar");
        btnBuscar8.setBorder(null);
        btnBuscar8.setBorderPainted(false);
        btnBuscar8.setContentAreaFilled(false);
        btnBuscar8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar8.setFocusPainted(false);
        btnBuscar8.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar8.setOpaque(true);
        btnBuscar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar8ActionPerformed(evt);
            }
        });
        divRelatorioExame.add(btnBuscar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 80, 30));

        btnBuscar9.setBackground(new java.awt.Color(190, 75, 73));
        btnBuscar9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar9.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar9.setText("Excluir");
        btnBuscar9.setBorder(null);
        btnBuscar9.setBorderPainted(false);
        btnBuscar9.setContentAreaFilled(false);
        btnBuscar9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar9.setFocusPainted(false);
        btnBuscar9.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar9.setOpaque(true);
        btnBuscar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar9ActionPerformed(evt);
            }
        });
        divRelatorioExame.add(btnBuscar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 80, 30));

        divExame.add(divRelatorioExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 520));

        contBorda.add(divExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 52, 830, 570));

        divCliente.setBackground(new java.awt.Color(255, 255, 255));
        divCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        divCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        divNavCliente.setBackground(new java.awt.Color(0, 167, 230));
        divNavCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnconsultaCliente.setBackground(new java.awt.Color(0, 128, 200));
        btnconsultaCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnconsultaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnconsultaCliente.setText("Consultar Cliente");
        btnconsultaCliente.setBorder(null);
        btnconsultaCliente.setBorderPainted(false);
        btnconsultaCliente.setContentAreaFilled(false);
        btnconsultaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconsultaCliente.setFocusable(false);
        btnconsultaCliente.setNextFocusableComponent(btnCadastraResultado);
        btnconsultaCliente.setOpaque(true);
        btnconsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultaClienteActionPerformed(evt);
            }
        });
        divNavCliente.add(btnconsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        btnCadastraCliente.setBackground(new java.awt.Color(0, 167, 230));
        btnCadastraCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCadastraCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastraCliente.setText("Cadastrar Cliente");
        btnCadastraCliente.setBorder(null);
        btnCadastraCliente.setBorderPainted(false);
        btnCadastraCliente.setContentAreaFilled(false);
        btnCadastraCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastraCliente.setFocusable(false);
        btnCadastraCliente.setNextFocusableComponent(btnCadastraResultado);
        btnCadastraCliente.setOpaque(true);
        btnCadastraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraClienteActionPerformed(evt);
            }
        });
        divNavCliente.add(btnCadastraCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 50));

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 167, 230));
        txtBuscar.setText("Buscar cliente...");
        txtBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));
        divNavCliente.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 200, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 128, 200));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusable(false);
        btnBuscar.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar.setOpaque(true);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        divNavCliente.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 80, 30));

        divCliente.add(divNavCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        divConsultaCliente.setBackground(new java.awt.Color(255, 255, 255));
        divConsultaCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(18, 12, 30));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"# 1412", "Elisson Carvalho de Araujo", "Rua Brasil, Nª 09", "Flavio de Oliveira"},
                {"# 1413", "Elisson Carvalho de Araujo", "Rua Brasil, Nª 09", "Flavio de Oliveira"},
                {"# 1413", "Elisson Carvalho de Araujo", "Rua Brasil, Nª 09", "Flavio de Oliveira"},
                {"# 1413", "Elisson Carvalho de Araujo", "Rua Brasil, Nª 09", "Flavio de Oliveira"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "# Código", "Nome", "Endereço", "Bairro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(2);
        jTable1.setSelectionBackground(new java.awt.Color(0, 128, 200));
        jTable1.setSelectionForeground(new java.awt.Color(232, 230, 236));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        divConsultaCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 770, 440));

        btnBuscar2.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar2.setForeground(new java.awt.Color(0, 167, 230));
        btnBuscar2.setText("Detalhes");
        btnBuscar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 124, 162), 2));
        btnBuscar2.setBorderPainted(false);
        btnBuscar2.setContentAreaFilled(false);
        btnBuscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar2.setFocusPainted(false);
        btnBuscar2.setFocusable(false);
        btnBuscar2.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });
        divConsultaCliente.add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 80, 30));

        btnBuscar1.setBackground(new java.awt.Color(0, 167, 230));
        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setText("Editar");
        btnBuscar1.setBorder(null);
        btnBuscar1.setBorderPainted(false);
        btnBuscar1.setContentAreaFilled(false);
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar1.setFocusPainted(false);
        btnBuscar1.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar1.setOpaque(true);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        divConsultaCliente.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 80, 30));

        btnBuscar3.setBackground(new java.awt.Color(190, 75, 73));
        btnBuscar3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar3.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar3.setText("Excluir");
        btnBuscar3.setBorder(null);
        btnBuscar3.setBorderPainted(false);
        btnBuscar3.setContentAreaFilled(false);
        btnBuscar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar3.setFocusPainted(false);
        btnBuscar3.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar3.setOpaque(true);
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });
        divConsultaCliente.add(btnBuscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 80, 30));

        divCliente.add(divConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 520));

        divCadastraCliente.setBackground(new java.awt.Color(255, 255, 255));
        divCadastraCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtUsuario.setEditable(false);
        txtUsuario.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario.setText("# 0013899");
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario.setName(""); // NOI18N
        txtUsuario.setOpaque(false);
        txtUsuario.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 59, 77));
        jLabel10.setText("Código");

        txtUsuario1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario1.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario1.setToolTipText("");
        txtUsuario1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario1.setName(""); // NOI18N
        txtUsuario1.setOpaque(false);
        txtUsuario1.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 59, 77));
        jLabel11.setText("Nome completo");

        txtUsuario2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario2.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario2.setToolTipText("");
        txtUsuario2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario2.setName(""); // NOI18N
        txtUsuario2.setOpaque(false);
        txtUsuario2.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 59, 77));
        jLabel12.setText("Data de nascimento");

        txtUsuario3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario3.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario3.setToolTipText("");
        txtUsuario3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario3.setName(""); // NOI18N
        txtUsuario3.setOpaque(false);
        txtUsuario3.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 59, 77));
        jLabel13.setText("CPF");

        txtUsuario4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario4.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario4.setToolTipText("");
        txtUsuario4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario4.setName(""); // NOI18N
        txtUsuario4.setOpaque(false);
        txtUsuario4.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 59, 77));
        jLabel14.setText("RG");

        txtUsuario5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario5.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario5.setToolTipText("");
        txtUsuario5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario5.setName(""); // NOI18N
        txtUsuario5.setOpaque(false);
        txtUsuario5.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario5ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 59, 77));
        jLabel15.setText("Sexo");

        txtUsuario6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario6.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario6.setToolTipText("");
        txtUsuario6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario6.setName(""); // NOI18N
        txtUsuario6.setOpaque(false);
        txtUsuario6.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario6ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 59, 77));
        jLabel16.setText("Telefone");

        txtUsuario7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario7.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario7.setToolTipText("");
        txtUsuario7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario7.setName(""); // NOI18N
        txtUsuario7.setOpaque(false);
        txtUsuario7.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario7ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(35, 59, 77));
        jLabel17.setText("Convênio");

        txtUsuario8.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario8.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario8.setToolTipText("");
        txtUsuario8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario8.setName(""); // NOI18N
        txtUsuario8.setOpaque(false);
        txtUsuario8.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario8ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(35, 59, 77));
        jLabel18.setText("Endereço");

        txtUsuario9.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario9.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario9.setToolTipText("");
        txtUsuario9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario9.setName(""); // NOI18N
        txtUsuario9.setOpaque(false);
        txtUsuario9.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario9ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(35, 59, 77));
        jLabel79.setText("Bairro");

        txtUsuario10.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario10.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario10.setToolTipText("");
        txtUsuario10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario10.setName(""); // NOI18N
        txtUsuario10.setOpaque(false);
        txtUsuario10.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario10ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(35, 59, 77));
        jLabel80.setText("Cidade");

        txtUsuario11.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario11.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario11.setToolTipText("");
        txtUsuario11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario11.setName(""); // NOI18N
        txtUsuario11.setOpaque(false);
        txtUsuario11.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario11ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(35, 59, 77));
        jLabel81.setText("Estado");

        txtUsuario12.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtUsuario12.setForeground(new java.awt.Color(35, 59, 77));
        txtUsuario12.setToolTipText("");
        txtUsuario12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtUsuario12.setName(""); // NOI18N
        txtUsuario12.setOpaque(false);
        txtUsuario12.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtUsuario12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario12ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(35, 59, 77));
        jLabel82.setText("CEP");

        btnBuscar4.setBackground(new java.awt.Color(0, 128, 200));
        btnBuscar4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar4.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar4.setText("Cadastrar");
        btnBuscar4.setBorder(null);
        btnBuscar4.setBorderPainted(false);
        btnBuscar4.setContentAreaFilled(false);
        btnBuscar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar4.setFocusPainted(false);
        btnBuscar4.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar4.setOpaque(true);
        btnBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar4ActionPerformed(evt);
            }
        });

        btnBuscar6.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar6.setForeground(new java.awt.Color(0, 128, 200));
        btnBuscar6.setText("Limpar Formulário");
        btnBuscar6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 124, 162), 2));
        btnBuscar6.setBorderPainted(false);
        btnBuscar6.setContentAreaFilled(false);
        btnBuscar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar6.setFocusPainted(false);
        btnBuscar6.setFocusable(false);
        btnBuscar6.setNextFocusableComponent(btnCadastraResultado);
        btnBuscar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divCadastraClienteLayout = new javax.swing.GroupLayout(divCadastraCliente);
        divCadastraCliente.setLayout(divCadastraClienteLayout);
        divCadastraClienteLayout.setHorizontalGroup(
            divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtUsuario8, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divCadastraClienteLayout.createSequentialGroup()
                                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel82))
                                .addGap(18, 18, 18)
                                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel81))))
                        .addGap(18, 18, 18)
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79)
                            .addComponent(txtUsuario9, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80)
                            .addComponent(txtUsuario10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(btnBuscar6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(divCadastraClienteLayout.createSequentialGroup()
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(divCadastraClienteLayout.createSequentialGroup()
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(txtUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(txtUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)))
                        .addGroup(divCadastraClienteLayout.createSequentialGroup()
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(txtUsuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(txtUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        divCadastraClienteLayout.setVerticalGroup(
            divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                .addComponent(jLabel80)
                                .addGap(0, 0, 0)
                                .addComponent(txtUsuario10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addGap(0, 0, 0)
                                .addComponent(txtUsuario12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addGap(0, 0, 0)
                        .addComponent(txtUsuario11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        divCliente.add(divCadastraCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 520));

        contBorda.add(divCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 52, 830, 570));

        divConfigura.setBackground(new java.awt.Color(255, 255, 255));

        btnSair9.setBackground(new java.awt.Color(35, 59, 77));
        btnSair9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSair9.setForeground(new java.awt.Color(35, 59, 77));
        btnSair9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Registration_32px.png"))); // NOI18N
        btnSair9.setText("<html><p>Editar Usuários");
        btnSair9.setToolTipText("");
        btnSair9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnSair9.setContentAreaFilled(false);
        btnSair9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair9.setFocusable(false);
        btnSair9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSair9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair9.setIconTextGap(15);
        btnSair9.setNextFocusableComponent(btnMinimizar);
        btnSair9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair9ActionPerformed(evt);
            }
        });

        btnSair8.setBackground(new java.awt.Color(35, 59, 77));
        btnSair8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSair8.setForeground(new java.awt.Color(35, 59, 77));
        btnSair8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Add_User_Male_32px.png"))); // NOI18N
        btnSair8.setText("<html><p>Adicionar Novo</p><p> Usuário");
        btnSair8.setToolTipText("");
        btnSair8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnSair8.setContentAreaFilled(false);
        btnSair8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair8.setFocusable(false);
        btnSair8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSair8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair8.setIconTextGap(15);
        btnSair8.setNextFocusableComponent(btnMinimizar);
        btnSair8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair8ActionPerformed(evt);
            }
        });

        btnSair6.setBackground(new java.awt.Color(35, 59, 77));
        btnSair6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSair6.setForeground(new java.awt.Color(35, 59, 77));
        btnSair6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Data_Protection_32px.png"))); // NOI18N
        btnSair6.setText("Realizar Backup");
        btnSair6.setToolTipText("");
        btnSair6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnSair6.setContentAreaFilled(false);
        btnSair6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair6.setFocusable(false);
        btnSair6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSair6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair6.setIconTextGap(15);
        btnSair6.setNextFocusableComponent(btnMinimizar);
        btnSair6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair6ActionPerformed(evt);
            }
        });

        btnSair7.setBackground(new java.awt.Color(35, 59, 77));
        btnSair7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSair7.setForeground(new java.awt.Color(35, 59, 77));
        btnSair7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Data_Backup_32px.png"))); // NOI18N
        btnSair7.setText("Restaurar Backup");
        btnSair7.setToolTipText("");
        btnSair7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnSair7.setContentAreaFilled(false);
        btnSair7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair7.setFocusable(false);
        btnSair7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSair7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair7.setIconTextGap(15);
        btnSair7.setNextFocusableComponent(btnMinimizar);
        btnSair7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair7ActionPerformed(evt);
            }
        });

        btnSair10.setBackground(new java.awt.Color(35, 59, 77));
        btnSair10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSair10.setForeground(new java.awt.Color(35, 59, 77));
        btnSair10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Maintenance_32px.png"))); // NOI18N
        btnSair10.setText("<html>Configurar <p>Aplicação");
        btnSair10.setToolTipText("");
        btnSair10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnSair10.setContentAreaFilled(false);
        btnSair10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair10.setFocusable(false);
        btnSair10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSair10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair10.setIconTextGap(15);
        btnSair10.setNextFocusableComponent(btnMinimizar);
        btnSair10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair10ActionPerformed(evt);
            }
        });

        btnSair11.setBackground(new java.awt.Color(35, 59, 77));
        btnSair11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSair11.setForeground(new java.awt.Color(35, 59, 77));
        btnSair11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Play_Graph_Report_32px.png"))); // NOI18N
        btnSair11.setText("Gerar Relatório ");
        btnSair11.setToolTipText("");
        btnSair11.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnSair11.setContentAreaFilled(false);
        btnSair11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair11.setFocusable(false);
        btnSair11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSair11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair11.setIconTextGap(15);
        btnSair11.setNextFocusableComponent(btnMinimizar);
        btnSair11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divConfiguraLayout = new javax.swing.GroupLayout(divConfigura);
        divConfigura.setLayout(divConfiguraLayout);
        divConfiguraLayout.setHorizontalGroup(
            divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divConfiguraLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divConfiguraLayout.createSequentialGroup()
                        .addComponent(btnSair10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnSair11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(divConfiguraLayout.createSequentialGroup()
                            .addComponent(btnSair6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(btnSair7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(divConfiguraLayout.createSequentialGroup()
                            .addComponent(btnSair8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(btnSair9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(145, 145, 145))
        );
        divConfiguraLayout.setVerticalGroup(
            divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divConfiguraLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        contBorda.add(divConfigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 52, 830, 570));

        getContentPane().add(contBorda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1114, 624));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Btn Colors
    private void setBtnColor(JToggleButton btn)
    {
        btn.setBackground(new Color(0,128,200));
    }
    private void resetBtnColor(JToggleButton btn)
    {
        btn.setBackground(new Color(0,167,230));
    }
    
    private void setCbxColor(JCheckBox check)
    {
        check.setBackground(new Color(75,190,73));
        check.setForeground(Color.white);
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 190, 73)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    private void restCbxColor(JCheckBox check)
    {
        check.setBackground(Color.white);
        check.setForeground(new Color(35,59,77));
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35,59,77)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    // Fim Colors
    // Ações On Click Navegação
    private void clickMouseInicio()
    {
        setBtnColor(btnInicio);
        divInicio.setVisible(true);
        
        resetBtnColor(btnExame);
        resetBtnColor(btnCliente);
        resetBtnColor(btnConfigura);
        divExame.setVisible(false);
        divCliente.setVisible(false);
        divConfigura.setVisible(false);
    }
    private void clickMouseExame()
    {
        setBtnColor(btnExame);
        divExame.setVisible(true);
        
        resetBtnColor(btnInicio);
        resetBtnColor(btnCliente);
        resetBtnColor(btnConfigura);
        divInicio.setVisible(false);
        divCliente.setVisible(false);
        divConfigura.setVisible(false);
    }
    private void clickMouseCliente()
    {
        setBtnColor(btnCliente);
        resetBtnColor(btnInicio);
        resetBtnColor(btnExame);
        resetBtnColor(btnConfigura);
        divInicio.setVisible(!true);
        divExame.setVisible(!true);
        divCliente.setVisible(true);
        divConfigura.setVisible(!true);
    }
    private void clickMouseConfiguracao()
    {
        setBtnColor(btnConfigura);
        resetBtnColor(btnExame);
        resetBtnColor(btnInicio);
        resetBtnColor(btnCliente);
        divInicio.setVisible(!true);
        divCliente.setVisible(!true);
        divExame.setVisible(!true);
        divConfigura.setVisible(true);
    }
    
    private void clickMouseExamePedido()
    {
        setBtnColor(btnCadastraPedido);
        resetBtnColor(btnCadastraResultado);
        resetBtnColor(btnRelatorioExame);
        divCadastraExame.setVisible(true);
        divCadastraResultado.setVisible(!true);
        divRelatorioExame.setVisible(!true);
    }
    private void clickMouseExameCadastra()
    {
        setBtnColor(btnCadastraResultado);
        resetBtnColor(btnCadastraPedido);
        resetBtnColor(btnRelatorioExame);
        divCadastraExame.setVisible(!true);
        divCadastraResultado.setVisible(true);
        divRelatorioExame.setVisible(!true);
    }
    private void clickMouseExameRelatorio()
    {
        setBtnColor(btnRelatorioExame);
        resetBtnColor(btnCadastraPedido);
        resetBtnColor(btnCadastraResultado);
        divCadastraExame.setVisible(!true);
        divCadastraResultado.setVisible(!true);
        divRelatorioExame.setVisible(true);
    }
    private void clickMouseClienteConsulta()
    {
        divConsultaCliente.setVisible(true);
        divCadastraCliente.setVisible(!true);
        setBtnColor(btnconsultaCliente);
        resetBtnColor(btnCadastraCliente);
    }
    private void clickMouseClienteCadastra()
    {
        divConsultaCliente.setVisible(!true);
        divCadastraCliente.setVisible(true);
        setBtnColor(btnCadastraCliente);
        resetBtnColor(btnconsultaCliente);   
    }
    private void clickMouseAtalhoCadClie()
    {
        setBtnColor(btnCliente);
        divCliente.setVisible(true);
        
        resetBtnColor(btnExame);
        resetBtnColor(btnInicio);
        resetBtnColor(btnConfigura);
        divInicio.setVisible(false);
        divExame.setVisible(false);
        divConfigura.setVisible(false);
        
        divConsultaCliente.setVisible(false);
        divCadastraCliente.setVisible(true);
        setBtnColor(btnCadastraCliente);
        resetBtnColor(btnconsultaCliente);
    }

    
    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConfiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguraActionPerformed
        clickMouseConfiguracao();
    }//GEN-LAST:event_btnConfiguraActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        clickMouseCliente();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameActionPerformed
        clickMouseExame();
    }//GEN-LAST:event_btnExameActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        clickMouseInicio();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCadastraPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraPedidoActionPerformed
        clickMouseExamePedido();
    }//GEN-LAST:event_btnCadastraPedidoActionPerformed

    private void btnCadastraResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraResultadoActionPerformed
        clickMouseExameCadastra();
    }//GEN-LAST:event_btnCadastraResultadoActionPerformed

    private void btnRelatorioExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioExameActionPerformed
        clickMouseExameRelatorio();
    }//GEN-LAST:event_btnRelatorioExameActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnconsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultaClienteActionPerformed
        clickMouseClienteConsulta();
    }//GEN-LAST:event_btnconsultaClienteActionPerformed

    private void btnCadastraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraClienteActionPerformed
        clickMouseClienteCadastra();
    }//GEN-LAST:event_btnCadastraClienteActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1ActionPerformed

    private void txtUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario2ActionPerformed

    private void txtUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario3ActionPerformed

    private void txtUsuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario4ActionPerformed

    private void txtUsuario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario5ActionPerformed

    private void txtUsuario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario6ActionPerformed

    private void txtUsuario7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario7ActionPerformed

    private void txtUsuario8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario8ActionPerformed

    private void txtUsuario9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario9ActionPerformed

    private void txtUsuario10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario10ActionPerformed

    private void txtUsuario11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario11ActionPerformed

    private void txtUsuario12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario12ActionPerformed

    private void btnBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar4ActionPerformed

    private void btnBuscar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar6ActionPerformed

    private void btnBuscar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar5ActionPerformed

    private void btnBuscar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar9ActionPerformed

    private void btnBuscar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar8ActionPerformed

    private void btnBuscar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar7ActionPerformed

    private void txtCodPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodPedidoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDataPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPedidoActionPerformed

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConvenioActionPerformed
    
    // Inicio Cadastrar Pedidos 
    private void cbxGlicoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGlicoseActionPerformed
        
        if(cbxGlicose.isSelected())
        {
            setCbxColor(cbxGlicose);
        }
        else
        {
            restCbxColor(cbxGlicose);
        }
    }//GEN-LAST:event_cbxGlicoseActionPerformed

    private void cbxHemogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHemogramaActionPerformed
         
        if(cbxHemograma.isSelected())
        {
            setCbxColor(cbxHemograma);
        }
        else
        {
            restCbxColor(cbxHemograma);
        }
    }//GEN-LAST:event_cbxHemogramaActionPerformed

    private void cbxAcidoUricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAcidoUricoActionPerformed
        if(cbxAcidoUrico.isSelected())
        {
            setCbxColor(cbxAcidoUrico);
        }
        else
        {
            restCbxColor(cbxAcidoUrico);
        }
    }//GEN-LAST:event_cbxAcidoUricoActionPerformed

    private void cbxUreiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUreiaActionPerformed
        if(cbxUreia.isSelected())
        {
            setCbxColor(cbxUreia);
        }
        else
        {
            restCbxColor(cbxUreia);
        }
    }//GEN-LAST:event_cbxUreiaActionPerformed

    private void cbxCoatininaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCoatininaActionPerformed
        if(cbxCoatinina.isSelected())
        {
            setCbxColor(cbxCoatinina);
        }
        else
        {
            restCbxColor(cbxCoatinina);
        }
    }//GEN-LAST:event_cbxCoatininaActionPerformed

    private void cbxColesterolTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxColesterolTotalActionPerformed
        if(cbxColesterolTotal.isSelected())
        {
            setCbxColor(cbxColesterolTotal);
        }
        else
        {
            restCbxColor(cbxColesterolTotal);
        }
    }//GEN-LAST:event_cbxColesterolTotalActionPerformed

    private void cbxColesterolFracionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxColesterolFracionadoActionPerformed
        if(cbxColesterolFracionado.isSelected())
        {
            setCbxColor(cbxColesterolFracionado);
        }
        else
        {
            restCbxColor(cbxColesterolFracionado);
        }
    }//GEN-LAST:event_cbxColesterolFracionadoActionPerformed

    private void cbxTrigliceridesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTrigliceridesActionPerformed
        if(cbxTriglicerides.isSelected())
        {
            setCbxColor(cbxTriglicerides);
        }
        else
        {
            restCbxColor(cbxTriglicerides);
        }
    }//GEN-LAST:event_cbxTrigliceridesActionPerformed

    private void cbxTgoTgpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTgoTgpActionPerformed
        if(cbxTgoTgp.isSelected())
        {
            setCbxColor(cbxTgoTgp);
        }
        else
        {
            restCbxColor(cbxTgoTgp);
        }
    }//GEN-LAST:event_cbxTgoTgpActionPerformed

    private void cbxGamaGtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGamaGtActionPerformed
        if(cbxGamaGt.isSelected())
        {
            setCbxColor(cbxGamaGt);
        }
        else
        {
            restCbxColor(cbxGamaGt);
        }
    }//GEN-LAST:event_cbxGamaGtActionPerformed

    private void cbxBilirrubinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBilirrubinaActionPerformed
        if(cbxBilirrubina.isSelected())
        {
            setCbxColor(cbxBilirrubina);
        }
        else
        {
            restCbxColor(cbxBilirrubina);
        }
    }//GEN-LAST:event_cbxBilirrubinaActionPerformed

    private void cbxUrinaRotinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUrinaRotinaActionPerformed
        if(cbxUrinaRotina.isSelected())
        {
            setCbxColor(cbxUrinaRotina);
        }
        else
        {
            restCbxColor(cbxUrinaRotina);
        }
    }//GEN-LAST:event_cbxUrinaRotinaActionPerformed

    private void cbxEpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEpfActionPerformed
        if(cbxEpf.isSelected())
        {
            setCbxColor(cbxEpf);
        }
        else
        {
            restCbxColor(cbxEpf);
        }
    }//GEN-LAST:event_cbxEpfActionPerformed

    private void cbxSangueOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSangueOcultoActionPerformed
        if(cbxSangueOculto.isSelected())
        {
            setCbxColor(cbxSangueOculto);
        }
        else
        {
            restCbxColor(cbxSangueOculto);
        }
    }//GEN-LAST:event_cbxSangueOcultoActionPerformed

    private void btnCadastraExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraExameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastraExameActionPerformed

    private void txtCodPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPedido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodPedido1ActionPerformed

    private void txtCodCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCliente1ActionPerformed

    private void txtNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome1ActionPerformed

    private void txtDataPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPedido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPedido1ActionPerformed

    private void txtConvenio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvenio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConvenio1ActionPerformed

    private void btnCadastraExame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraExame2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastraExame2ActionPerformed

    private void btnBioquimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBioquimicaActionPerformed
        bioquimica.setVisible(true);
    }//GEN-LAST:event_btnBioquimicaActionPerformed

    private void btnHemogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHemogramaActionPerformed
        hemograma.setVisible(true);
    }//GEN-LAST:event_btnHemogramaActionPerformed

    private void btnUrinaRotinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrinaRotinaActionPerformed
        urinaRotina.setVisible(true);
    }//GEN-LAST:event_btnUrinaRotinaActionPerformed

    private void btnSangueOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSangueOcultoActionPerformed
        sangueOculto.setVisible(true);
    }//GEN-LAST:event_btnSangueOcultoActionPerformed

    private void btnInicioCadasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioCadasClienteActionPerformed
        clickMouseAtalhoCadClie();
    }//GEN-LAST:event_btnInicioCadasClienteActionPerformed

    private void btnInicioCadsResulExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioCadsResulExamActionPerformed
        setBtnColor(btnExame);
        divExame.setVisible(true);
        
        resetBtnColor(btnInicio);
        resetBtnColor(btnCliente);
        resetBtnColor(btnConfigura);
        divInicio.setVisible(false);
        divCliente.setVisible(false);
        divConfigura.setVisible(false);
        
        setBtnColor(btnCadastraResultado);
        resetBtnColor(btnCadastraPedido);
        resetBtnColor(btnRelatorioExame);
        divCadastraExame.setVisible(!true);
        divCadastraResultado.setVisible(true);
        divRelatorioExame.setVisible(!true);
    }//GEN-LAST:event_btnInicioCadsResulExamActionPerformed

    private void btnInicoGerarRelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicoGerarRelatActionPerformed
        setBtnColor(btnConfigura);
        divConfigura.setVisible(true);
        
        resetBtnColor(btnExame);
        resetBtnColor(btnInicio);
        resetBtnColor(btnCliente);
        divInicio.setVisible(false);
        divCliente.setVisible(false);
        divExame.setVisible(false);
    }//GEN-LAST:event_btnInicoGerarRelatActionPerformed

    private void btnSair6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair6ActionPerformed

    private void btnSair7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair7ActionPerformed

    private void btnSair8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair8ActionPerformed

    private void btnSair9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair9ActionPerformed

    private void btnSair10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair10ActionPerformed

    private void btnSair11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair11ActionPerformed
    //Fim Cadastra Pedidos
    
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barNotifq;
    private javax.swing.JToggleButton btnBioquimica;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JToggleButton btnBuscar1;
    private javax.swing.JToggleButton btnBuscar2;
    private javax.swing.JToggleButton btnBuscar3;
    private javax.swing.JToggleButton btnBuscar4;
    private javax.swing.JToggleButton btnBuscar5;
    private javax.swing.JToggleButton btnBuscar6;
    private javax.swing.JToggleButton btnBuscar7;
    private javax.swing.JToggleButton btnBuscar8;
    private javax.swing.JToggleButton btnBuscar9;
    private javax.swing.JToggleButton btnCadastraCliente;
    private javax.swing.JToggleButton btnCadastraExame;
    private javax.swing.JToggleButton btnCadastraExame2;
    private javax.swing.JToggleButton btnCadastraPedido;
    private javax.swing.JToggleButton btnCadastraResultado;
    private javax.swing.JToggleButton btnCliente;
    private javax.swing.JToggleButton btnConfigura;
    private javax.swing.JToggleButton btnExame;
    private javax.swing.JToggleButton btnHemograma;
    private javax.swing.JToggleButton btnInicio;
    private javax.swing.JToggleButton btnInicioCadasCliente;
    private javax.swing.JToggleButton btnInicioCadsResulExam;
    private javax.swing.JToggleButton btnInicoGerarRelat;
    private javax.swing.JToggleButton btnMinimizar;
    private javax.swing.JToggleButton btnRelatorioExame;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JToggleButton btnSair10;
    private javax.swing.JToggleButton btnSair11;
    private javax.swing.JToggleButton btnSair6;
    private javax.swing.JToggleButton btnSair7;
    private javax.swing.JToggleButton btnSair8;
    private javax.swing.JToggleButton btnSair9;
    private javax.swing.JToggleButton btnSangueOculto;
    private javax.swing.JToggleButton btnUrinaRotina;
    private javax.swing.JToggleButton btnconsultaCliente;
    private javax.swing.JCheckBox cbxAcidoUrico;
    private javax.swing.JCheckBox cbxBilirrubina;
    private javax.swing.JCheckBox cbxCoatinina;
    private javax.swing.JCheckBox cbxColesterolFracionado;
    private javax.swing.JCheckBox cbxColesterolTotal;
    private javax.swing.JCheckBox cbxEpf;
    private javax.swing.JCheckBox cbxGamaGt;
    private javax.swing.JCheckBox cbxGlicose;
    private javax.swing.JCheckBox cbxHemograma;
    private javax.swing.JCheckBox cbxSangueOculto;
    private javax.swing.JCheckBox cbxTgoTgp;
    private javax.swing.JCheckBox cbxTriglicerides;
    private javax.swing.JCheckBox cbxUreia;
    private javax.swing.JCheckBox cbxUrinaRotina;
    private javax.swing.JPanel contBorda;
    private javax.swing.JPanel divCadastraCliente;
    private javax.swing.JPanel divCadastraExame;
    private javax.swing.JPanel divCadastraResultado;
    private javax.swing.JPanel divCliente;
    private javax.swing.JPanel divConfigura;
    private javax.swing.JPanel divConsultaCliente;
    private javax.swing.JPanel divExame;
    private javax.swing.JPanel divInicio;
    private javax.swing.JPanel divNavCliente;
    private javax.swing.JPanel divNavExame;
    private javax.swing.JPanel divRelatorioExame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel jpnExames;
    private javax.swing.JPanel nav;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodCliente1;
    private javax.swing.JTextField txtCodPedido;
    private javax.swing.JTextField txtCodPedido1;
    private javax.swing.JTextField txtConvenio;
    private javax.swing.JTextField txtConvenio1;
    private javax.swing.JTextField txtDataPedido;
    private javax.swing.JTextField txtDataPedido1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario1;
    private javax.swing.JTextField txtUsuario10;
    private javax.swing.JTextField txtUsuario11;
    private javax.swing.JTextField txtUsuario12;
    private javax.swing.JTextField txtUsuario2;
    private javax.swing.JTextField txtUsuario3;
    private javax.swing.JTextField txtUsuario4;
    private javax.swing.JTextField txtUsuario5;
    private javax.swing.JTextField txtUsuario6;
    private javax.swing.JTextField txtUsuario7;
    private javax.swing.JTextField txtUsuario8;
    private javax.swing.JTextField txtUsuario9;
    // End of variables declaration//GEN-END:variables
}
