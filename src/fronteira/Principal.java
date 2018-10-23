
package fronteira;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

import entidade.*;

public class Principal extends javax.swing.JFrame {
    
    VerifExaRult        verifExaRult    = new VerifExaRult();
    ExameHemograma      hemograma       = new ExameHemograma();
    ExameBioquimica     bioquimica      = new ExameBioquimica();
    ExameUrinaRotina    urinaRotina     = new ExameUrinaRotina();
    ExameSangueOculto   sangueOculto    = new ExameSangueOculto();
    ExameGeraRelatorio  exameGeraRel    = new ExameGeraRelatorio();
    ClienteDetalhe      clienteDetalhe  = new ClienteDetalhe();
    ConfAddUser         confAddUser     = new ConfAddUser();
    ConfEdtUser         confEdtUser     = new ConfEdtUser();         
    
    private String iconsBg;
    
    // Paleta Cores
    private String corAzul1    = "0, 167, 230";
    private String corAzul2    = "0, 128, 200";
    private String corAzul3    = "40, 124, 162";
    private String corAzul4    = "35, 58, 76";
    private String corBranco1  = "255, 255, 255";
    private String corBranco2  = "229, 229, 229";
    private String corPreto    = "18, 12, 30";
    private String corVerde    = "75, 190, 73";
    private String corVermelho = "75, 190, 73";
    
    public Principal(){
        initComponents();
        setLocationRelativeTo(null);
        //Icone do Sistema
        URL url = this.getClass().getResource("/imgIcons/icon.png");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
        
        divNaoInicia();
        verificaActive();
        verificaStatus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgSexo = new javax.swing.ButtonGroup();
        contBorda = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        LogoTipo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JToggleButton();
        btnExame = new javax.swing.JToggleButton();
        btnCliente = new javax.swing.JToggleButton();
        btnConfigura = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        barNotifq = new javax.swing.JPanel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblNivelAcesso = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();
        divInicio = new javax.swing.JPanel();
        btnInicioCadasCliente = new javax.swing.JToggleButton();
        btnInicioCadsResulExam = new javax.swing.JToggleButton();
        btnInicioConfRelat = new javax.swing.JToggleButton();
        divExame = new javax.swing.JPanel();
        divNavExame = new javax.swing.JPanel();
        btnCadastraPedido = new javax.swing.JToggleButton();
        btnCadastraResultado = new javax.swing.JToggleButton();
        btnRelatorioExame = new javax.swing.JToggleButton();
        divCadastraExame = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtExPedCodPedido = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtExPedCodCliente = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtExPedNome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtExPedDataPedido = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtExPedConvenio = new javax.swing.JTextField();
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
        btnHemoPedSalvar = new javax.swing.JToggleButton();
        btnHemoPedCancelar = new javax.swing.JToggleButton();
        divCadastraResultado = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtCodPedidoResult = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtDataPedidoResult = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtConvenioResult = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtCodClienteResult = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNomeResult = new javax.swing.JTextField();
        btnHemograma = new javax.swing.JToggleButton();
        btnBioquimica = new javax.swing.JToggleButton();
        btnUrinaRotina = new javax.swing.JToggleButton();
        btnSangueOculto = new javax.swing.JToggleButton();
        divRelatorioExame = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnExameDetalhe = new javax.swing.JToggleButton();
        btnExameEdit = new javax.swing.JToggleButton();
        btnExameExcluir = new javax.swing.JToggleButton();
        divCliente = new javax.swing.JPanel();
        divNavCliente = new javax.swing.JPanel();
        btnconsultaCliente = new javax.swing.JToggleButton();
        btnCadastraCliente = new javax.swing.JToggleButton();
        divConsultaCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnClienteDetalhe = new javax.swing.JToggleButton();
        btnClienteEdit = new javax.swing.JToggleButton();
        btnClienteExcluir = new javax.swing.JToggleButton();
        divCadastraCliente = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtClienteCod = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtClienteDataNasc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtClienteCPF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtClienteRG = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rbClienteMasc = new javax.swing.JRadioButton();
        rbClienteFemi = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txtClienteTel = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtClienteConv = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtClienteEnder = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txtClienteBairro = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        txtClienteCidade = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        txtClienteCEP = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        cbxClienteUf = new javax.swing.JComboBox<>();
        btnClienteLimparFor = new javax.swing.JToggleButton();
        btnClienteCadastra = new javax.swing.JToggleButton();
        divConfigura = new javax.swing.JPanel();
        btnConfAddUser = new javax.swing.JToggleButton();
        btnConfEdtUser = new javax.swing.JToggleButton();
        btnConfBackup = new javax.swing.JToggleButton();
        btnConfRestBackup = new javax.swing.JToggleButton();
        btnConfAplic = new javax.swing.JToggleButton();
        btnConfRelatorio = new javax.swing.JToggleButton();
        contMasq = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIOLAB Análises Clínicas - UX LAB 1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contBorda.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 167, 230)));
        contBorda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(0, 167, 230));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoTipo.setOpaque(false);
        LogoTipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/bioLabLogo.png"))); // NOI18N
        jLabel2.setToolTipText("Bio Lab - Análises Clínicas");
        LogoTipo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 160));

        nav.add(LogoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 160));

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

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/UXLAB.png"))); // NOI18N
        jLabel4.setToolTipText("UxLab - Versão 1.0.0");
        nav.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 280, 70));

        contBorda.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 280, 620));

        barNotifq.setBackground(new java.awt.Color(255, 255, 255));
        barNotifq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(35, 59, 77));
        lblNomeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Male_User_22px.png"))); // NOI18N
        lblNomeUsuario.setText("$NomeDeUsuario");
        lblNomeUsuario.setToolTipText("Usuário");
        lblNomeUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barNotifq.add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 50));

        lblNivelAcesso.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNivelAcesso.setForeground(new java.awt.Color(35, 59, 77));
        lblNivelAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_User_Shield_22px_2.png"))); // NOI18N
        lblNivelAcesso.setText("Administrador");
        lblNivelAcesso.setToolTipText("Nível de Acesso");
        lblNivelAcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barNotifq.add(lblNivelAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 140, 50));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setForeground(new java.awt.Color(35, 59, 77));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Subtract_18px.png"))); // NOI18N
        btnMinimizar.setToolTipText("Minimizar Janela");
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setFocusable(false);
        btnMinimizar.setOpaque(true);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        barNotifq.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 50));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setForeground(new java.awt.Color(35, 59, 77));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Delete_18px.png"))); // NOI18N
        btnSair.setToolTipText("Fechar Aplicação");
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.setNextFocusableComponent(btnMinimizar);
        btnSair.setOpaque(true);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        barNotifq.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 40, 50));

        contBorda.add(barNotifq, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 2, 830, 50));

        divInicio.setBackground(new java.awt.Color(255, 255, 255));

        btnInicioCadasCliente.setBackground(new java.awt.Color(255, 255, 255));
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
        btnInicioCadasCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioCadasClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioCadasClienteMouseExited(evt);
            }
        });
        btnInicioCadasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioCadasClienteActionPerformed(evt);
            }
        });

        btnInicioCadsResulExam.setBackground(new java.awt.Color(35, 59, 77));
        btnInicioCadsResulExam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInicioCadsResulExam.setForeground(new java.awt.Color(35, 59, 77));
        btnInicioCadsResulExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Edit_File_32px.png"))); // NOI18N
        btnInicioCadsResulExam.setText("Cadastrar Resultado");
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
        btnInicioCadsResulExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioCadsResulExamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioCadsResulExamMouseExited(evt);
            }
        });
        btnInicioCadsResulExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioCadsResulExamActionPerformed(evt);
            }
        });

        btnInicioConfRelat.setBackground(new java.awt.Color(255, 255, 255));
        btnInicioConfRelat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInicioConfRelat.setForeground(new java.awt.Color(35, 59, 77));
        btnInicioConfRelat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Play_Graph_Report_32px.png"))); // NOI18N
        btnInicioConfRelat.setText("Gerar Relátorio");
        btnInicioConfRelat.setToolTipText("");
        btnInicioConfRelat.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnInicioConfRelat.setContentAreaFilled(false);
        btnInicioConfRelat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicioConfRelat.setFocusable(false);
        btnInicioConfRelat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicioConfRelat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicioConfRelat.setIconTextGap(15);
        btnInicioConfRelat.setNextFocusableComponent(btnMinimizar);
        btnInicioConfRelat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioConfRelatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioConfRelatMouseExited(evt);
            }
        });
        btnInicioConfRelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioConfRelatActionPerformed(evt);
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
                .addComponent(btnInicioConfRelat, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        divInicioLayout.setVerticalGroup(
            divInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divInicioLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(divInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicioConfRelat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioCadasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioCadsResulExam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        divExame.add(divNavExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        divCadastraExame.setBackground(new java.awt.Color(255, 255, 255));
        divCadastraExame.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(35, 59, 77));
        jLabel19.setText("Cód. Pedido");

        txtExPedCodPedido.setEditable(false);
        txtExPedCodPedido.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtExPedCodPedido.setForeground(new java.awt.Color(35, 59, 77));
        txtExPedCodPedido.setText("# 000087");
        txtExPedCodPedido.setToolTipText("");
        txtExPedCodPedido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtExPedCodPedido.setName(""); // NOI18N
        txtExPedCodPedido.setOpaque(false);
        txtExPedCodPedido.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(35, 59, 77));
        jLabel22.setText("Cód. Cliente");

        txtExPedCodCliente.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtExPedCodCliente.setForeground(new java.awt.Color(35, 59, 77));
        txtExPedCodCliente.setToolTipText("");
        txtExPedCodCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtExPedCodCliente.setName(""); // NOI18N
        txtExPedCodCliente.setOpaque(false);
        txtExPedCodCliente.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(35, 59, 77));
        jLabel20.setText("Nome Completo");

        txtExPedNome.setEditable(false);
        txtExPedNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtExPedNome.setForeground(new java.awt.Color(35, 59, 77));
        txtExPedNome.setToolTipText("");
        txtExPedNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtExPedNome.setName(""); // NOI18N
        txtExPedNome.setOpaque(false);
        txtExPedNome.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(35, 59, 77));
        jLabel21.setText("Data do Pedido");

        txtExPedDataPedido.setEditable(false);
        txtExPedDataPedido.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtExPedDataPedido.setForeground(new java.awt.Color(35, 59, 77));
        txtExPedDataPedido.setToolTipText("");
        txtExPedDataPedido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtExPedDataPedido.setName(""); // NOI18N
        txtExPedDataPedido.setOpaque(false);
        txtExPedDataPedido.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(35, 59, 77));
        jLabel23.setText("Convênio");

        txtExPedConvenio.setEditable(false);
        txtExPedConvenio.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtExPedConvenio.setForeground(new java.awt.Color(35, 59, 77));
        txtExPedConvenio.setToolTipText("");
        txtExPedConvenio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtExPedConvenio.setName(""); // NOI18N
        txtExPedConvenio.setOpaque(false);
        txtExPedConvenio.setSelectionColor(new java.awt.Color(35, 59, 77));

        jpnExames.setOpaque(false);
        jpnExames.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxHemograma.setBackground(new java.awt.Color(255, 255, 255));
        cbxHemograma.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbxHemograma.setForeground(new java.awt.Color(35, 59, 77));
        cbxHemograma.setText("Hemograma");
        cbxHemograma.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cbxHemograma.setBorderPainted(true);
        cbxHemograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxHemograma.setFocusable(false);
        cbxHemograma.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxHemograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxHemograma.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxHemograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxHemogramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxHemogramaMouseExited(evt);
            }
        });
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
        cbxGlicose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxGlicose.setFocusable(false);
        cbxGlicose.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxGlicose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxGlicose.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxGlicose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxGlicoseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxGlicoseMouseExited(evt);
            }
        });
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
        cbxAcidoUrico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxAcidoUrico.setFocusable(false);
        cbxAcidoUrico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxAcidoUrico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxAcidoUrico.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxAcidoUrico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxAcidoUricoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxAcidoUricoMouseExited(evt);
            }
        });
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
        cbxUreia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxUreia.setFocusable(false);
        cbxUreia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxUreia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxUreia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxUreia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxUreiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxUreiaMouseExited(evt);
            }
        });
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
        cbxCoatinina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxCoatinina.setFocusable(false);
        cbxCoatinina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxCoatinina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxCoatinina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxCoatinina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxCoatininaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxCoatininaMouseExited(evt);
            }
        });
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
        cbxColesterolTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxColesterolTotal.setFocusable(false);
        cbxColesterolTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxColesterolTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxColesterolTotal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxColesterolTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxColesterolTotalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxColesterolTotalMouseExited(evt);
            }
        });
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
        cbxColesterolFracionado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxColesterolFracionado.setFocusable(false);
        cbxColesterolFracionado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxColesterolFracionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxColesterolFracionado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxColesterolFracionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxColesterolFracionadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxColesterolFracionadoMouseExited(evt);
            }
        });
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
        cbxTriglicerides.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxTriglicerides.setFocusable(false);
        cbxTriglicerides.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxTriglicerides.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxTriglicerides.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxTriglicerides.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxTrigliceridesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxTrigliceridesMouseExited(evt);
            }
        });
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
        cbxTgoTgp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxTgoTgp.setFocusable(false);
        cbxTgoTgp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxTgoTgp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxTgoTgp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxTgoTgp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxTgoTgpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxTgoTgpMouseExited(evt);
            }
        });
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
        cbxGamaGt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxGamaGt.setFocusable(false);
        cbxGamaGt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxGamaGt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxGamaGt.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxGamaGt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxGamaGtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxGamaGtMouseExited(evt);
            }
        });
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
        cbxBilirrubina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxBilirrubina.setFocusable(false);
        cbxBilirrubina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxBilirrubina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxBilirrubina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxBilirrubina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxBilirrubinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxBilirrubinaMouseExited(evt);
            }
        });
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
        cbxUrinaRotina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxUrinaRotina.setFocusable(false);
        cbxUrinaRotina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxUrinaRotina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxUrinaRotina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxUrinaRotina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxUrinaRotinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxUrinaRotinaMouseExited(evt);
            }
        });
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
        cbxEpf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxEpf.setFocusable(false);
        cbxEpf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxEpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxEpf.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxEpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxEpfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxEpfMouseExited(evt);
            }
        });
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
        cbxSangueOculto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxSangueOculto.setFocusable(false);
        cbxSangueOculto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxSangueOculto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png"))); // NOI18N
        cbxSangueOculto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Checked_18px.png"))); // NOI18N
        cbxSangueOculto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxSangueOcultoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxSangueOcultoMouseExited(evt);
            }
        });
        cbxSangueOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSangueOcultoActionPerformed(evt);
            }
        });
        jpnExames.add(cbxSangueOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 140, 62));

        btnHemoPedSalvar.setBackground(new java.awt.Color(0, 167, 230));
        btnHemoPedSalvar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHemoPedSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnHemoPedSalvar.setText("Salvar");
        btnHemoPedSalvar.setBorder(null);
        btnHemoPedSalvar.setBorderPainted(false);
        btnHemoPedSalvar.setContentAreaFilled(false);
        btnHemoPedSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHemoPedSalvar.setFocusPainted(false);
        btnHemoPedSalvar.setNextFocusableComponent(btnCadastraResultado);
        btnHemoPedSalvar.setOpaque(true);
        btnHemoPedSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHemoPedSalvarActionPerformed(evt);
            }
        });

        btnHemoPedCancelar.setBackground(new java.awt.Color(190, 75, 73));
        btnHemoPedCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHemoPedCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnHemoPedCancelar.setText("Cancelar");
        btnHemoPedCancelar.setBorder(null);
        btnHemoPedCancelar.setBorderPainted(false);
        btnHemoPedCancelar.setContentAreaFilled(false);
        btnHemoPedCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHemoPedCancelar.setFocusPainted(false);
        btnHemoPedCancelar.setNextFocusableComponent(btnCadastraResultado);
        btnHemoPedCancelar.setOpaque(true);
        btnHemoPedCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHemoPedCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divCadastraExameLayout = new javax.swing.GroupLayout(divCadastraExame);
        divCadastraExame.setLayout(divCadastraExameLayout);
        divCadastraExameLayout.setHorizontalGroup(
            divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraExameLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraExameLayout.createSequentialGroup()
                        .addComponent(btnHemoPedSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnHemoPedCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(divCadastraExameLayout.createSequentialGroup()
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
                            .addComponent(txtExPedCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtExPedCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtExPedNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtExPedDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtExPedConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jpnExames, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
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
                    .addComponent(txtExPedCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExPedCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExPedNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExPedDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExPedConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jpnExames, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHemoPedSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHemoPedCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        divExame.add(divCadastraExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 520));

        divCadastraResultado.setBackground(new java.awt.Color(255, 255, 255));
        divCadastraResultado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(35, 59, 77));
        jLabel24.setText("Cód. Pedido");

        txtCodPedidoResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCodPedidoResult.setForeground(new java.awt.Color(35, 59, 77));
        txtCodPedidoResult.setToolTipText("");
        txtCodPedidoResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtCodPedidoResult.setName(""); // NOI18N
        txtCodPedidoResult.setOpaque(false);
        txtCodPedidoResult.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(35, 59, 77));
        jLabel27.setText("Data do Pedido");

        txtDataPedidoResult.setEditable(false);
        txtDataPedidoResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtDataPedidoResult.setForeground(new java.awt.Color(35, 59, 77));
        txtDataPedidoResult.setToolTipText("");
        txtDataPedidoResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtDataPedidoResult.setName(""); // NOI18N
        txtDataPedidoResult.setOpaque(false);
        txtDataPedidoResult.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(35, 59, 77));
        jLabel28.setText("Convênio");

        txtConvenioResult.setEditable(false);
        txtConvenioResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenioResult.setForeground(new java.awt.Color(35, 59, 77));
        txtConvenioResult.setToolTipText("");
        txtConvenioResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenioResult.setName(""); // NOI18N
        txtConvenioResult.setOpaque(false);
        txtConvenioResult.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(35, 59, 77));
        jLabel25.setText("Cód. Cliente");

        txtCodClienteResult.setEditable(false);
        txtCodClienteResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCodClienteResult.setForeground(new java.awt.Color(35, 59, 77));
        txtCodClienteResult.setToolTipText("");
        txtCodClienteResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtCodClienteResult.setName(""); // NOI18N
        txtCodClienteResult.setOpaque(false);
        txtCodClienteResult.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(35, 59, 77));
        jLabel26.setText("Nome Completo");

        txtNomeResult.setEditable(false);
        txtNomeResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNomeResult.setForeground(new java.awt.Color(35, 59, 77));
        txtNomeResult.setToolTipText("");
        txtNomeResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtNomeResult.setName(""); // NOI18N
        txtNomeResult.setOpaque(false);
        txtNomeResult.setSelectionColor(new java.awt.Color(35, 59, 77));

        btnHemograma.setBackground(new java.awt.Color(255, 255, 255));
        btnHemograma.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHemograma.setForeground(new java.awt.Color(35, 59, 77));
        btnHemograma.setText("Hemograma");
        btnHemograma.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)));
        btnHemograma.setContentAreaFilled(false);
        btnHemograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHemograma.setEnabled(false);
        btnHemograma.setFocusPainted(false);
        btnHemograma.setNextFocusableComponent(btnCadastraResultado);
        btnHemograma.setOpaque(true);
        btnHemograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHemogramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHemogramaMouseExited(evt);
            }
        });
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
        btnBioquimica.setEnabled(false);
        btnBioquimica.setFocusPainted(false);
        btnBioquimica.setNextFocusableComponent(btnCadastraResultado);
        btnBioquimica.setOpaque(true);
        btnBioquimica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBioquimicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBioquimicaMouseExited(evt);
            }
        });
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
        btnUrinaRotina.setEnabled(false);
        btnUrinaRotina.setFocusPainted(false);
        btnUrinaRotina.setNextFocusableComponent(btnCadastraResultado);
        btnUrinaRotina.setOpaque(true);
        btnUrinaRotina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUrinaRotinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUrinaRotinaMouseExited(evt);
            }
        });
        btnUrinaRotina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrinaRotinaActionPerformed(evt);
            }
        });

        btnSangueOculto.setBackground(new java.awt.Color(255, 255, 255));
        btnSangueOculto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSangueOculto.setForeground(new java.awt.Color(35, 59, 77));
        btnSangueOculto.setText("<html>EPF\n<p>Sangue Oculto</p>");
        btnSangueOculto.setActionCommand("<html>\n<p><center> EPF</center></p>\n\n<p>Sangue Oculto</p>\n\n</html");
        btnSangueOculto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)));
        btnSangueOculto.setContentAreaFilled(false);
        btnSangueOculto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSangueOculto.setEnabled(false);
        btnSangueOculto.setFocusPainted(false);
        btnSangueOculto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSangueOculto.setNextFocusableComponent(btnCadastraResultado);
        btnSangueOculto.setOpaque(true);
        btnSangueOculto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSangueOcultoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSangueOcultoMouseExited(evt);
            }
        });
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
                        .addComponent(txtCodPedidoResult, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataPedidoResult, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtConvenioResult, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraResultadoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel25)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel26))
                    .addGroup(divCadastraResultadoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(txtCodClienteResult, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtCodPedidoResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataPedidoResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConvenioResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGroup(divCadastraResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodClienteResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
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
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        btnExameDetalhe.setBackground(new java.awt.Color(255, 255, 255));
        btnExameDetalhe.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnExameDetalhe.setForeground(new java.awt.Color(0, 167, 230));
        btnExameDetalhe.setText("Gerar Relatório");
        btnExameDetalhe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 124, 162), 2));
        btnExameDetalhe.setBorderPainted(false);
        btnExameDetalhe.setContentAreaFilled(false);
        btnExameDetalhe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExameDetalhe.setFocusPainted(false);
        btnExameDetalhe.setFocusable(false);
        btnExameDetalhe.setNextFocusableComponent(btnCadastraResultado);
        btnExameDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExameDetalheActionPerformed(evt);
            }
        });

        btnExameEdit.setBackground(new java.awt.Color(0, 167, 230));
        btnExameEdit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnExameEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnExameEdit.setText("Editar");
        btnExameEdit.setBorder(null);
        btnExameEdit.setBorderPainted(false);
        btnExameEdit.setContentAreaFilled(false);
        btnExameEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExameEdit.setFocusPainted(false);
        btnExameEdit.setNextFocusableComponent(btnCadastraResultado);
        btnExameEdit.setOpaque(true);
        btnExameEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExameEditActionPerformed(evt);
            }
        });

        btnExameExcluir.setBackground(new java.awt.Color(190, 75, 73));
        btnExameExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnExameExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExameExcluir.setText("Excluir");
        btnExameExcluir.setBorder(null);
        btnExameExcluir.setBorderPainted(false);
        btnExameExcluir.setContentAreaFilled(false);
        btnExameExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExameExcluir.setFocusPainted(false);
        btnExameExcluir.setNextFocusableComponent(btnCadastraResultado);
        btnExameExcluir.setOpaque(true);
        btnExameExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExameExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divRelatorioExameLayout = new javax.swing.GroupLayout(divRelatorioExame);
        divRelatorioExame.setLayout(divRelatorioExameLayout);
        divRelatorioExameLayout.setHorizontalGroup(
            divRelatorioExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divRelatorioExameLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(divRelatorioExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divRelatorioExameLayout.createSequentialGroup()
                        .addComponent(btnExameDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnExameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnExameExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        divRelatorioExameLayout.setVerticalGroup(
            divRelatorioExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divRelatorioExameLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(divRelatorioExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExameDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExameExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
        divNavCliente.add(btnconsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

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
        divNavCliente.add(btnCadastraCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 140, 50));

        divCliente.add(divNavCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        divConsultaCliente.setBackground(new java.awt.Color(255, 255, 255));

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

        btnClienteDetalhe.setBackground(new java.awt.Color(255, 255, 255));
        btnClienteDetalhe.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnClienteDetalhe.setForeground(new java.awt.Color(0, 167, 230));
        btnClienteDetalhe.setText("Detalhes");
        btnClienteDetalhe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 124, 162), 2));
        btnClienteDetalhe.setBorderPainted(false);
        btnClienteDetalhe.setContentAreaFilled(false);
        btnClienteDetalhe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteDetalhe.setFocusPainted(false);
        btnClienteDetalhe.setFocusable(false);
        btnClienteDetalhe.setNextFocusableComponent(btnCadastraResultado);
        btnClienteDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteDetalheActionPerformed(evt);
            }
        });

        btnClienteEdit.setBackground(new java.awt.Color(0, 167, 230));
        btnClienteEdit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnClienteEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnClienteEdit.setText("Editar");
        btnClienteEdit.setBorder(null);
        btnClienteEdit.setBorderPainted(false);
        btnClienteEdit.setContentAreaFilled(false);
        btnClienteEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteEdit.setFocusPainted(false);
        btnClienteEdit.setNextFocusableComponent(btnCadastraResultado);
        btnClienteEdit.setOpaque(true);
        btnClienteEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteEditActionPerformed(evt);
            }
        });

        btnClienteExcluir.setBackground(new java.awt.Color(190, 75, 73));
        btnClienteExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnClienteExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnClienteExcluir.setText("Excluir");
        btnClienteExcluir.setBorder(null);
        btnClienteExcluir.setBorderPainted(false);
        btnClienteExcluir.setContentAreaFilled(false);
        btnClienteExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteExcluir.setFocusPainted(false);
        btnClienteExcluir.setNextFocusableComponent(btnCadastraResultado);
        btnClienteExcluir.setOpaque(true);
        btnClienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divConsultaClienteLayout = new javax.swing.GroupLayout(divConsultaCliente);
        divConsultaCliente.setLayout(divConsultaClienteLayout);
        divConsultaClienteLayout.setHorizontalGroup(
            divConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divConsultaClienteLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(divConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divConsultaClienteLayout.createSequentialGroup()
                        .addComponent(btnClienteDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClienteEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClienteExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        divConsultaClienteLayout.setVerticalGroup(
            divConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divConsultaClienteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(divConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClienteDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(divConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClienteEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClienteExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        divCliente.add(divConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 520));

        divCadastraCliente.setBackground(new java.awt.Color(255, 255, 255));
        divCadastraCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

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

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 59, 77));
        jLabel12.setText("Data de nascimento");

        txtClienteDataNasc.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteDataNasc.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteDataNasc.setToolTipText("");
        txtClienteDataNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteDataNasc.setName(""); // NOI18N
        txtClienteDataNasc.setOpaque(false);
        txtClienteDataNasc.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 59, 77));
        jLabel13.setText("CPF");

        txtClienteCPF.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCPF.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCPF.setToolTipText("");
        txtClienteCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCPF.setName(""); // NOI18N
        txtClienteCPF.setOpaque(false);
        txtClienteCPF.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 59, 77));
        jLabel14.setText("RG");

        txtClienteRG.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteRG.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteRG.setToolTipText("");
        txtClienteRG.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteRG.setName(""); // NOI18N
        txtClienteRG.setOpaque(false);
        txtClienteRG.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 59, 77));
        jLabel15.setText("Sexo");

        rbgSexo.add(rbClienteMasc);
        rbClienteMasc.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbClienteMasc.setForeground(new java.awt.Color(11, 19, 25));
        rbClienteMasc.setText("Masculino");
        rbClienteMasc.setFocusPainted(false);
        rbClienteMasc.setOpaque(false);

        rbgSexo.add(rbClienteFemi);
        rbClienteFemi.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbClienteFemi.setForeground(new java.awt.Color(11, 19, 25));
        rbClienteFemi.setText("Feminino");
        rbClienteFemi.setFocusPainted(false);
        rbClienteFemi.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 59, 77));
        jLabel16.setText("Telefone");

        txtClienteTel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteTel.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteTel.setToolTipText("");
        txtClienteTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteTel.setName(""); // NOI18N
        txtClienteTel.setOpaque(false);
        txtClienteTel.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(35, 59, 77));
        jLabel17.setText("Convênio");

        txtClienteConv.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteConv.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteConv.setToolTipText("");
        txtClienteConv.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteConv.setName(""); // NOI18N
        txtClienteConv.setOpaque(false);
        txtClienteConv.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(35, 59, 77));
        jLabel18.setText("Endereço");

        txtClienteEnder.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteEnder.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteEnder.setToolTipText("");
        txtClienteEnder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteEnder.setName(""); // NOI18N
        txtClienteEnder.setOpaque(false);
        txtClienteEnder.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(35, 59, 77));
        jLabel79.setText("Bairro");

        txtClienteBairro.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteBairro.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteBairro.setToolTipText("");
        txtClienteBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteBairro.setName(""); // NOI18N
        txtClienteBairro.setOpaque(false);
        txtClienteBairro.setSelectionColor(new java.awt.Color(35, 59, 77));

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

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(35, 59, 77));
        jLabel82.setText("CEP");

        txtClienteCEP.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtClienteCEP.setForeground(new java.awt.Color(35, 59, 77));
        txtClienteCEP.setToolTipText("");
        txtClienteCEP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCEP.setName(""); // NOI18N
        txtClienteCEP.setOpaque(false);
        txtClienteCEP.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(35, 59, 77));
        jLabel81.setText("Estado");

        cbxClienteUf.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cbxClienteUf.setForeground(new java.awt.Color(35, 59, 77));
        cbxClienteUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxClienteUf.setSelectedIndex(12);
        cbxClienteUf.setToolTipText("");
        cbxClienteUf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 8)));
        cbxClienteUf.setFocusable(false);
        cbxClienteUf.setName(""); // NOI18N
        cbxClienteUf.setNextFocusableComponent(txtClienteCidade);
        cbxClienteUf.setOpaque(false);

        btnClienteLimparFor.setBackground(new java.awt.Color(255, 255, 255));
        btnClienteLimparFor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnClienteLimparFor.setForeground(new java.awt.Color(0, 128, 200));
        btnClienteLimparFor.setText("Limpar Formulário");
        btnClienteLimparFor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 124, 162), 2));
        btnClienteLimparFor.setBorderPainted(false);
        btnClienteLimparFor.setContentAreaFilled(false);
        btnClienteLimparFor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteLimparFor.setFocusPainted(false);
        btnClienteLimparFor.setFocusable(false);
        btnClienteLimparFor.setNextFocusableComponent(btnCadastraResultado);
        btnClienteLimparFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteLimparForActionPerformed(evt);
            }
        });

        btnClienteCadastra.setBackground(new java.awt.Color(0, 128, 200));
        btnClienteCadastra.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnClienteCadastra.setForeground(new java.awt.Color(255, 255, 255));
        btnClienteCadastra.setText("Cadastrar");
        btnClienteCadastra.setBorder(null);
        btnClienteCadastra.setBorderPainted(false);
        btnClienteCadastra.setContentAreaFilled(false);
        btnClienteCadastra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteCadastra.setFocusPainted(false);
        btnClienteCadastra.setNextFocusableComponent(btnCadastraResultado);
        btnClienteCadastra.setOpaque(true);
        btnClienteCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteCadastraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divCadastraClienteLayout = new javax.swing.GroupLayout(divCadastraCliente);
        divCadastraCliente.setLayout(divCadastraClienteLayout);
        divCadastraClienteLayout.setHorizontalGroup(
            divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(btnClienteLimparFor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClienteCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(divCadastraClienteLayout.createSequentialGroup()
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(txtClienteTel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(txtClienteConv)))
                        .addGroup(divCadastraClienteLayout.createSequentialGroup()
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divCadastraClienteLayout.createSequentialGroup()
                                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel82))
                                    .addGap(18, 18, 18)
                                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel81)
                                        .addComponent(cbxClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel18)
                                .addComponent(txtClienteEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtClienteCidade)
                                .addComponent(txtClienteBairro)
                                .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel79)
                                        .addComponent(jLabel80))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(divCadastraClienteLayout.createSequentialGroup()
                            .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18)
                                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(txtClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                    .addGap(18, 18, 18)
                                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                            .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rbClienteFemi)))))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(150, 150, 150))
        );
        divCadastraClienteLayout.setVerticalGroup(
            divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbClienteFemi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteConv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbxClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClienteLimparFor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        divCliente.add(divCadastraCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 520));

        contBorda.add(divCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 52, 830, 570));

        divConfigura.setBackground(new java.awt.Color(255, 255, 255));

        btnConfAddUser.setBackground(new java.awt.Color(35, 59, 77));
        btnConfAddUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfAddUser.setForeground(new java.awt.Color(35, 59, 77));
        btnConfAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Add_User_Male_32px.png"))); // NOI18N
        btnConfAddUser.setText("<html><p>Adicionar Novo</p><p> Usuário");
        btnConfAddUser.setToolTipText("");
        btnConfAddUser.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnConfAddUser.setContentAreaFilled(false);
        btnConfAddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfAddUser.setFocusable(false);
        btnConfAddUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfAddUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfAddUser.setIconTextGap(15);
        btnConfAddUser.setNextFocusableComponent(btnMinimizar);
        btnConfAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfAddUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfAddUserMouseExited(evt);
            }
        });
        btnConfAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfAddUserActionPerformed(evt);
            }
        });

        btnConfEdtUser.setBackground(new java.awt.Color(35, 59, 77));
        btnConfEdtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfEdtUser.setForeground(new java.awt.Color(35, 59, 77));
        btnConfEdtUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Registration_32px.png"))); // NOI18N
        btnConfEdtUser.setText("<html><p>Editar Usuários");
        btnConfEdtUser.setToolTipText("");
        btnConfEdtUser.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnConfEdtUser.setContentAreaFilled(false);
        btnConfEdtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfEdtUser.setFocusable(false);
        btnConfEdtUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfEdtUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfEdtUser.setIconTextGap(15);
        btnConfEdtUser.setNextFocusableComponent(btnMinimizar);
        btnConfEdtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfEdtUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfEdtUserMouseExited(evt);
            }
        });
        btnConfEdtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfEdtUserActionPerformed(evt);
            }
        });

        btnConfBackup.setBackground(new java.awt.Color(35, 59, 77));
        btnConfBackup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfBackup.setForeground(new java.awt.Color(35, 59, 77));
        btnConfBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Data_Protection_32px.png"))); // NOI18N
        btnConfBackup.setText("Realizar Backup");
        btnConfBackup.setToolTipText("");
        btnConfBackup.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnConfBackup.setContentAreaFilled(false);
        btnConfBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfBackup.setFocusable(false);
        btnConfBackup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfBackup.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfBackup.setIconTextGap(15);
        btnConfBackup.setNextFocusableComponent(btnMinimizar);
        btnConfBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfBackupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfBackupMouseExited(evt);
            }
        });
        btnConfBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfBackupActionPerformed(evt);
            }
        });

        btnConfRestBackup.setBackground(new java.awt.Color(35, 59, 77));
        btnConfRestBackup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfRestBackup.setForeground(new java.awt.Color(35, 59, 77));
        btnConfRestBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Data_Backup_32px.png"))); // NOI18N
        btnConfRestBackup.setText("Restaurar Backup");
        btnConfRestBackup.setToolTipText("");
        btnConfRestBackup.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnConfRestBackup.setContentAreaFilled(false);
        btnConfRestBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfRestBackup.setFocusable(false);
        btnConfRestBackup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfRestBackup.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfRestBackup.setIconTextGap(15);
        btnConfRestBackup.setNextFocusableComponent(btnMinimizar);
        btnConfRestBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfRestBackupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfRestBackupMouseExited(evt);
            }
        });
        btnConfRestBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfRestBackupActionPerformed(evt);
            }
        });

        btnConfAplic.setBackground(new java.awt.Color(35, 59, 77));
        btnConfAplic.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfAplic.setForeground(new java.awt.Color(35, 59, 77));
        btnConfAplic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Maintenance_32px.png"))); // NOI18N
        btnConfAplic.setText("<html>Configurar <p>Aplicação");
        btnConfAplic.setToolTipText("");
        btnConfAplic.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnConfAplic.setContentAreaFilled(false);
        btnConfAplic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfAplic.setFocusable(false);
        btnConfAplic.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfAplic.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfAplic.setIconTextGap(15);
        btnConfAplic.setNextFocusableComponent(btnMinimizar);
        btnConfAplic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfAplicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfAplicMouseExited(evt);
            }
        });
        btnConfAplic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfAplicActionPerformed(evt);
            }
        });

        btnConfRelatorio.setBackground(new java.awt.Color(35, 59, 77));
        btnConfRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfRelatorio.setForeground(new java.awt.Color(35, 59, 77));
        btnConfRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Play_Graph_Report_32px.png"))); // NOI18N
        btnConfRelatorio.setText("Gerar Relatório ");
        btnConfRelatorio.setToolTipText("");
        btnConfRelatorio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
        btnConfRelatorio.setContentAreaFilled(false);
        btnConfRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfRelatorio.setFocusable(false);
        btnConfRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfRelatorio.setIconTextGap(15);
        btnConfRelatorio.setNextFocusableComponent(btnMinimizar);
        btnConfRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfRelatorioMouseExited(evt);
            }
        });
        btnConfRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfRelatorioActionPerformed(evt);
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
                        .addComponent(btnConfAplic, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnConfRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(divConfiguraLayout.createSequentialGroup()
                            .addComponent(btnConfBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(btnConfRestBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(divConfiguraLayout.createSequentialGroup()
                            .addComponent(btnConfAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(btnConfEdtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(145, 145, 145))
        );
        divConfiguraLayout.setVerticalGroup(
            divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divConfiguraLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfEdtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfRestBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(divConfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfAplic, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        contBorda.add(divConfigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 52, 830, 570));

        getContentPane().add(contBorda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1114, 624));

        contMasq.setBackground(new java.awt.Color(255, 255, 255));
        contMasq.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 167, 230)));

        javax.swing.GroupLayout contMasqLayout = new javax.swing.GroupLayout(contMasq);
        contMasq.setLayout(contMasqLayout);
        contMasqLayout.setHorizontalGroup(
            contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        contMasqLayout.setVerticalGroup(
            contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(contMasq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1114, 624));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Transicoes de cor ao passar o mouse por cima
    private void setMouseBtnSMMoved(JToggleButton btn){
        btn.setBackground(new java.awt.Color(229, 229, 229));
    }
    private void resMouseBtnSMMoved(JToggleButton btn){
        btn.setBackground(new java.awt.Color(255, 255, 255));
    }
    
    private void setMouseBtnMoved(JToggleButton btn, String iconsBg){
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconsBg)));
        btn.setForeground(new java.awt.Color(0,167,230));
        btn.setBorder(javax.swing.BorderFactory.createCompoundBorder
                        (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,167,230)), 
                        javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
    }
    private void resMouseBtnMoved(JToggleButton btn, String iconsBg){
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconsBg)));
        btn.setForeground(new java.awt.Color(35,59,77));
        btn.setBorder(javax.swing.BorderFactory.createCompoundBorder
                        (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35,59,77)), 
                        javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20)));
    }
    private void setMouseCbxMoved(JCheckBox cbx){
        if(!cbx.isSelected()){
            cbx.setForeground(new java.awt.Color(0,167,230));
            cbx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px_1.png")));
            cbx.setBorder(javax.swing.BorderFactory.createCompoundBorder
                            (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new 
                            java.awt.Color(0,167,230)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        }
    }
    private void resMouseCbxMoved(JCheckBox cbx){   
        if(!cbx.isSelected()){
            cbx.setForeground(new java.awt.Color(35,59,77));
            cbx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png")));
            cbx.setBorder(javax.swing.BorderFactory.createCompoundBorder
                            (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new 
                            java.awt.Color(35,59,77)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        } else {
            cbx.setForeground(new java.awt.Color(255, 255, 255));
            cbx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/icons8_Circle_18px.png")));
            cbx.setBorder(javax.swing.BorderFactory.createCompoundBorder
                            (javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new 
                            java.awt.Color(75, 190, 73)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        }
    }
    private void setMouseBtnFormMoved(JToggleButton btn){
        
    }
    private void resMouseBtnFormMoved(JToggleButton btn){
        
    }
    public void verificaActive(){   // Verifica se o Exame esta Ativado
        // ExameHemograma
        if(verifExaRult.isActiveHemograma() == true){
            this.btnHemograma.setEnabled(true);
        }
        // ExameBioquimica
        if(verifExaRult.isActiveBioquimica() == true){
            this.btnBioquimica.setEnabled(true);
        }
        // Urina Rotina
        if(verifExaRult.isActiveUrinaRotina() == true){
            this.btnUrinaRotina.setEnabled(true);
        }
        // Sangue Oculto
        if(verifExaRult.isActiveSangueOculto() == true){
            this.btnSangueOculto.setEnabled(true);
        }
    }
    public void verificaStatus(){   // Verifica se o Exame esta Concluido
        // ExameHemograma
        if(verifExaRult.isStatusHemograma() == true){
            setColorBtnExameCadReslt(btnHemograma);
        } else {
            restColorBtnExameCadReslt(btnHemograma);
        }
        // ExameBioquimica
        if(verifExaRult.isStatusBioquimica() == true){
            setColorBtnExameCadReslt(btnBioquimica);
        } else {
            restColorBtnExameCadReslt(btnBioquimica);
        }
        // Urina Rotina
        if(verifExaRult.isStatusUrinaRotina() == true){
            setColorBtnExameCadReslt(btnUrinaRotina);
        } else {
            restColorBtnExameCadReslt(btnUrinaRotina);
        }
        // Sangue Oculto
        if(verifExaRult.isStatusSangueOculto() == true){
            setColorBtnExameCadReslt(btnSangueOculto);
        } else {
            restColorBtnExameCadReslt(btnSangueOculto);
        }
    }
    
    private void divNaoInicia(){   
        // Paineis Divisorios que por padrão não inicia junto com o jFrame principal,
        // Para não causar conflitos na visão do usuario.
        divExame.setVisible(false);
        divCliente.setVisible(false);
        divConfigura.setVisible(false);
        divCadastraCliente.setVisible(false);
        divCadastraResultado.setVisible(false);
        divRelatorioExame.setVisible(false);
    }
    
    // Btn Colors; Transições de Cores
    private void setBtnColor(JToggleButton btn){
        btn.setBackground(new Color(0,128,200));
    }
    private void resetBtnColor(JToggleButton btn){
        btn.setBackground(new Color(0,167,230));
    }
    
    private void setCbxColor(JCheckBox check){   // Exame > CadastraExame > CheckBoxColors
        check.setBackground(new Color(75,190,73));
        check.setForeground(Color.white);
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 190, 73)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    private void restCbxColor(JCheckBox check){
        check.setBackground(Color.white);
        check.setForeground(new Color(35,59,77));
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35,59,77)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    
    private void setColorBtnExameCadReslt(JToggleButton check){
        check.setBackground(new Color(75,190,73));
        check.setForeground(Color.white);
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 190, 73)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    private void restColorBtnExameCadReslt(JToggleButton check){
        check.setBackground(Color.white);
        check.setForeground(new Color(35,59,77));
        check.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35,59,77)), 
                javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
    }
    // Fim Colors
    
    // Ações On Click Navegação
    private void clickMouseInicio(){
        setBtnColor(btnInicio);
        divInicio.setVisible(true);
        
        resetBtnColor(btnExame);
        resetBtnColor(btnCliente);
        resetBtnColor(btnConfigura);
        divExame.setVisible(false);
        divCliente.setVisible(false);
        divConfigura.setVisible(false);
    }
    private void clickMouseExame(){
        setBtnColor(btnExame);
        divExame.setVisible(true);
        
        resetBtnColor(btnInicio);
        resetBtnColor(btnCliente);
        resetBtnColor(btnConfigura);
        divInicio.setVisible(false);
        divCliente.setVisible(false);
        divConfigura.setVisible(false);
    }
    private void clickMouseCliente(){
        setBtnColor(btnCliente);
        resetBtnColor(btnInicio);
        resetBtnColor(btnExame);
        resetBtnColor(btnConfigura);
        divInicio.setVisible(!true);
        divExame.setVisible(!true);
        divCliente.setVisible(true);
        divConfigura.setVisible(!true);
    }
    private void clickMouseConfiguracao(){
        setBtnColor(btnConfigura);
        resetBtnColor(btnExame);
        resetBtnColor(btnInicio);
        resetBtnColor(btnCliente);
        divInicio.setVisible(!true);
        divCliente.setVisible(!true);
        divExame.setVisible(!true);
        divConfigura.setVisible(true);
    }
    
    private void clickMouseExamePedido(){
        setBtnColor(btnCadastraPedido);
        resetBtnColor(btnCadastraResultado);
        resetBtnColor(btnRelatorioExame);
        divCadastraExame.setVisible(true);
        divCadastraResultado.setVisible(!true);
        divRelatorioExame.setVisible(!true);
        txtExPedCodCliente.requestFocusInWindow();
    }
    private void clickMouseExameCadastra(){
        setBtnColor(btnCadastraResultado);
        resetBtnColor(btnCadastraPedido);
        resetBtnColor(btnRelatorioExame);
        divCadastraExame.setVisible(!true);
        divCadastraResultado.setVisible(true);
        divRelatorioExame.setVisible(!true);
        txtCodPedidoResult.requestFocusInWindow();
    }
    private void clickMouseExameRelatorio(){
        setBtnColor(btnRelatorioExame);
        resetBtnColor(btnCadastraPedido);
        resetBtnColor(btnCadastraResultado);
        divCadastraExame.setVisible(!true);
        divCadastraResultado.setVisible(!true);
        divRelatorioExame.setVisible(true);
    }
    private void clickMouseClienteConsulta(){
        divConsultaCliente.setVisible(true);
        divCadastraCliente.setVisible(!true);
        setBtnColor(btnconsultaCliente);
        resetBtnColor(btnCadastraCliente);
    }
    private void clickMouseClienteCadastra(){
        divConsultaCliente.setVisible(!true);
        divCadastraCliente.setVisible(true);
        setBtnColor(btnCadastraCliente);
        resetBtnColor(btnconsultaCliente);
        txtClienteNome.requestFocusInWindow();
    }
    private void clickMouseAtalhoCadClie(){
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
    private void clickMouseAtalhoExameCadsResult(){
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
    }
    private void clickMouseAtalhoConfRelatorio(){
        setBtnColor(btnConfigura);
        divConfigura.setVisible(true);
        
        resetBtnColor(btnExame);
        resetBtnColor(btnInicio);
        resetBtnColor(btnCliente);
        divInicio.setVisible(false);
        divCliente.setVisible(false);
        divExame.setVisible(false);
    }
    private void limparExamePedido(){
        txtExPedCodCliente.setText("");
        txtExPedNome.setText("");
        txtExPedDataPedido.setText("");
        txtExPedConvenio.setText("");
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

    private void btnconsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultaClienteActionPerformed
        clickMouseClienteConsulta();
    }//GEN-LAST:event_btnconsultaClienteActionPerformed

    private void btnCadastraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraClienteActionPerformed
        clickMouseClienteCadastra();
    }//GEN-LAST:event_btnCadastraClienteActionPerformed

    private void btnClienteCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteCadastraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteCadastraActionPerformed

    private void btnClienteLimparForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteLimparForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteLimparForActionPerformed

    private void btnExameExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExameExcluirActionPerformed

    private void btnExameEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExameEditActionPerformed

    private void btnExameDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameDetalheActionPerformed
        exameGeraRel.setVisible(true);
    }//GEN-LAST:event_btnExameDetalheActionPerformed
    
    // Inicio Cadastrar Pedidos 
    private void cbxGlicoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGlicoseActionPerformed
        
        if(cbxGlicose.isSelected()){
            setCbxColor(cbxGlicose);
        } else {
            restCbxColor(cbxGlicose);
        }
    }//GEN-LAST:event_cbxGlicoseActionPerformed

    private void cbxHemogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHemogramaActionPerformed
         
        if(cbxHemograma.isSelected()){
            setCbxColor(cbxHemograma);
        } else {
            restCbxColor(cbxHemograma);
        }
    }//GEN-LAST:event_cbxHemogramaActionPerformed

    private void cbxAcidoUricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAcidoUricoActionPerformed
        if(cbxAcidoUrico.isSelected()){
            setCbxColor(cbxAcidoUrico);
        } else {
            restCbxColor(cbxAcidoUrico);
        }
    }//GEN-LAST:event_cbxAcidoUricoActionPerformed

    private void cbxUreiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUreiaActionPerformed
        if(cbxUreia.isSelected()){
            setCbxColor(cbxUreia);
        } else {
            restCbxColor(cbxUreia);
        }
    }//GEN-LAST:event_cbxUreiaActionPerformed

    private void cbxCoatininaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCoatininaActionPerformed
        if(cbxCoatinina.isSelected()){
            setCbxColor(cbxCoatinina);
        } else {
            restCbxColor(cbxCoatinina);
        }
    }//GEN-LAST:event_cbxCoatininaActionPerformed

    private void cbxColesterolTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxColesterolTotalActionPerformed
        if(cbxColesterolTotal.isSelected()){
            setCbxColor(cbxColesterolTotal);
        } else {
            restCbxColor(cbxColesterolTotal);
        }
    }//GEN-LAST:event_cbxColesterolTotalActionPerformed

    private void cbxColesterolFracionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxColesterolFracionadoActionPerformed
        if(cbxColesterolFracionado.isSelected()){
            setCbxColor(cbxColesterolFracionado);
        } else {
            restCbxColor(cbxColesterolFracionado);
        }
    }//GEN-LAST:event_cbxColesterolFracionadoActionPerformed

    private void cbxTrigliceridesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTrigliceridesActionPerformed
        if(cbxTriglicerides.isSelected()){
            setCbxColor(cbxTriglicerides);
        } else {
            restCbxColor(cbxTriglicerides);
        }
    }//GEN-LAST:event_cbxTrigliceridesActionPerformed

    private void cbxTgoTgpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTgoTgpActionPerformed
        if(cbxTgoTgp.isSelected()){
            setCbxColor(cbxTgoTgp);
        } else {
            restCbxColor(cbxTgoTgp);
        }
    }//GEN-LAST:event_cbxTgoTgpActionPerformed

    private void cbxGamaGtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGamaGtActionPerformed
        if(cbxGamaGt.isSelected()){
            setCbxColor(cbxGamaGt);
        } else {
            restCbxColor(cbxGamaGt);
        }
    }//GEN-LAST:event_cbxGamaGtActionPerformed

    private void cbxBilirrubinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBilirrubinaActionPerformed
        if(cbxBilirrubina.isSelected()){
            setCbxColor(cbxBilirrubina);
        } else {
            restCbxColor(cbxBilirrubina);
        }
    }//GEN-LAST:event_cbxBilirrubinaActionPerformed

    private void cbxUrinaRotinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUrinaRotinaActionPerformed
        if(cbxUrinaRotina.isSelected()){
            setCbxColor(cbxUrinaRotina);
        } else {
            restCbxColor(cbxUrinaRotina);
        }
    }//GEN-LAST:event_cbxUrinaRotinaActionPerformed

    private void cbxEpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEpfActionPerformed
        if(cbxEpf.isSelected()){
            setCbxColor(cbxEpf);
        } else {
            restCbxColor(cbxEpf);
        }
    }//GEN-LAST:event_cbxEpfActionPerformed

    private void cbxSangueOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSangueOcultoActionPerformed
        if(cbxSangueOculto.isSelected()){
            setCbxColor(cbxSangueOculto);
        } else {
            restCbxColor(cbxSangueOculto);
        }
    }//GEN-LAST:event_cbxSangueOcultoActionPerformed

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
        clickMouseAtalhoExameCadsResult();
    }//GEN-LAST:event_btnInicioCadsResulExamActionPerformed

    private void btnConfBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfBackupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfBackupActionPerformed

    private void btnConfRestBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfRestBackupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfRestBackupActionPerformed

    private void btnConfAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfAddUserActionPerformed
        confAddUser.setVisible(true);
    }//GEN-LAST:event_btnConfAddUserActionPerformed

    private void btnConfEdtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfEdtUserActionPerformed
        confEdtUser.setVisible(true);
    }//GEN-LAST:event_btnConfEdtUserActionPerformed

    private void btnConfAplicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfAplicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfAplicActionPerformed

    private void btnConfRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfRelatorioActionPerformed

    private void btnHemoPedSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHemoPedSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHemoPedSalvarActionPerformed

    private void btnHemoPedCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHemoPedCancelarActionPerformed
        limparExamePedido();
    }//GEN-LAST:event_btnHemoPedCancelarActionPerformed

    private void btnClienteDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteDetalheActionPerformed
        clienteDetalhe.habilitaCampo(!true);
        clienteDetalhe.setVisible(true);
    }//GEN-LAST:event_btnClienteDetalheActionPerformed

    private void btnClienteEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteEditActionPerformed
        clienteDetalhe.habilitaCampo(true);
        clienteDetalhe.setVisible(true);
    }//GEN-LAST:event_btnClienteEditActionPerformed

    private void btnClienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteExcluirActionPerformed

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        setMouseBtnSMMoved(btnSair);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        resMouseBtnSMMoved(btnSair);
    }//GEN-LAST:event_btnSairMouseExited

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        setMouseBtnSMMoved(btnMinimizar);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        resMouseBtnSMMoved(btnMinimizar);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnInicioCadasClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioCadasClienteMouseEntered
        iconsBg = "/imgIcons/icons8_Registration_32px_1.png";
        setMouseBtnMoved(btnInicioCadasCliente, iconsBg);
    }//GEN-LAST:event_btnInicioCadasClienteMouseEntered

    private void btnInicioCadasClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioCadasClienteMouseExited
        iconsBg = "/imgIcons/icons8_Registration_32px.png";
        resMouseBtnMoved(btnInicioCadasCliente, iconsBg);
    }//GEN-LAST:event_btnInicioCadasClienteMouseExited

    private void btnInicioCadsResulExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioCadsResulExamMouseEntered
        iconsBg = "/imgIcons/icons8_Edit_File_32px_1.png";
        setMouseBtnMoved(btnInicioCadsResulExam, iconsBg);
    }//GEN-LAST:event_btnInicioCadsResulExamMouseEntered

    private void btnInicioCadsResulExamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioCadsResulExamMouseExited
        iconsBg = "/imgIcons/icons8_Edit_File_32px.png";
        resMouseBtnMoved(btnInicioCadsResulExam, iconsBg);
    }//GEN-LAST:event_btnInicioCadsResulExamMouseExited

    private void btnHemogramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHemogramaMouseEntered
        if(btnHemograma.isEnabled() == true){
            iconsBg = "";
            setMouseBtnMoved(btnHemograma, iconsBg);
        }
    }//GEN-LAST:event_btnHemogramaMouseEntered

    private void btnHemogramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHemogramaMouseExited
        if(btnHemograma.isEnabled() == true){
            iconsBg = "";
            resMouseBtnMoved(btnHemograma, iconsBg);
        }
    }//GEN-LAST:event_btnHemogramaMouseExited

    private void btnInicioConfRelatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioConfRelatMouseEntered
        iconsBg = "/imgIcons/icons8_Play_Graph_Report_32px_1.png";
        setMouseBtnMoved(btnInicioConfRelat, iconsBg);
    }//GEN-LAST:event_btnInicioConfRelatMouseEntered

    private void btnInicioConfRelatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioConfRelatMouseExited
        iconsBg = "/imgIcons/icons8_Play_Graph_Report_32px.png";
        resMouseBtnMoved(btnInicioConfRelat, iconsBg);
    }//GEN-LAST:event_btnInicioConfRelatMouseExited

    private void btnInicioConfRelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioConfRelatActionPerformed
        clickMouseAtalhoConfRelatorio();
    }//GEN-LAST:event_btnInicioConfRelatActionPerformed

    private void btnBioquimicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBioquimicaMouseEntered
        if(btnHemograma.isEnabled() == true){
            iconsBg = "";
            setMouseBtnMoved(btnBioquimica, iconsBg); 
        }
        
    }//GEN-LAST:event_btnBioquimicaMouseEntered

    private void btnBioquimicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBioquimicaMouseExited
        if(btnBioquimica.isEnabled() == true){
            iconsBg = "";
            resMouseBtnMoved(btnBioquimica, iconsBg);
        }
    }//GEN-LAST:event_btnBioquimicaMouseExited

    private void btnUrinaRotinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUrinaRotinaMouseEntered
        if(btnUrinaRotina.isEnabled() == true){
            iconsBg = "";
            setMouseBtnMoved(btnUrinaRotina, iconsBg);
        }
    }//GEN-LAST:event_btnUrinaRotinaMouseEntered

    private void btnUrinaRotinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUrinaRotinaMouseExited
        if(btnUrinaRotina.isEnabled() == true){
            iconsBg = "";
            resMouseBtnMoved(btnUrinaRotina, iconsBg);
        }
    }//GEN-LAST:event_btnUrinaRotinaMouseExited

    private void btnSangueOcultoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSangueOcultoMouseEntered
        if(btnSangueOculto.isEnabled() == true){
            iconsBg = "";
            setMouseBtnMoved(btnSangueOculto, iconsBg);
        }
    }//GEN-LAST:event_btnSangueOcultoMouseEntered

    private void btnSangueOcultoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSangueOcultoMouseExited
        if(btnSangueOculto.isEnabled() == true){
            iconsBg = "";
            resMouseBtnMoved(btnSangueOculto, iconsBg);
        }
    }//GEN-LAST:event_btnSangueOcultoMouseExited

    private void btnConfAddUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfAddUserMouseEntered
        iconsBg = "/imgIcons/icons8_Add_User_Male_32px_1.png";
        setMouseBtnMoved(btnConfAddUser, iconsBg);
    }//GEN-LAST:event_btnConfAddUserMouseEntered

    private void btnConfAddUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfAddUserMouseExited
        iconsBg = "/imgIcons/icons8_Add_User_Male_32px.png";
        resMouseBtnMoved(btnConfAddUser, iconsBg);
    }//GEN-LAST:event_btnConfAddUserMouseExited

    private void btnConfEdtUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfEdtUserMouseEntered
        iconsBg = "/imgIcons/icons8_Registration_32px_1.png";
        setMouseBtnMoved(btnConfEdtUser, iconsBg);
    }//GEN-LAST:event_btnConfEdtUserMouseEntered

    private void btnConfEdtUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfEdtUserMouseExited
        iconsBg = "/imgIcons/icons8_Registration_32px.png";
        resMouseBtnMoved(btnConfEdtUser, iconsBg);
    }//GEN-LAST:event_btnConfEdtUserMouseExited

    private void btnConfBackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfBackupMouseEntered
        iconsBg = "/imgIcons/icons8_Data_Protection_32px_1.png";
        setMouseBtnMoved(btnConfBackup, iconsBg);
    }//GEN-LAST:event_btnConfBackupMouseEntered

    private void btnConfBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfBackupMouseExited
        iconsBg = "/imgIcons/icons8_Data_Protection_32px.png";
        resMouseBtnMoved(btnConfBackup, iconsBg);
    }//GEN-LAST:event_btnConfBackupMouseExited

    private void btnConfRestBackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfRestBackupMouseEntered
        iconsBg = "/imgIcons/icons8_Data_Backup_32px_1.png";
        setMouseBtnMoved(btnConfRestBackup, iconsBg);
    }//GEN-LAST:event_btnConfRestBackupMouseEntered

    private void btnConfRestBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfRestBackupMouseExited
        iconsBg = "/imgIcons/icons8_Data_Backup_32px.png";
        resMouseBtnMoved(btnConfRestBackup, iconsBg);
    }//GEN-LAST:event_btnConfRestBackupMouseExited

    private void btnConfAplicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfAplicMouseEntered
        iconsBg = "/imgIcons/icons8_Maintenance_32px_1.png";
        setMouseBtnMoved(btnConfAplic, iconsBg);
    }//GEN-LAST:event_btnConfAplicMouseEntered

    private void btnConfAplicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfAplicMouseExited
        iconsBg = "/imgIcons/icons8_Maintenance_32px.png";
        resMouseBtnMoved(btnConfAplic, iconsBg);
    }//GEN-LAST:event_btnConfAplicMouseExited

    private void btnConfRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfRelatorioMouseEntered
        iconsBg = "/imgIcons/icons8_Play_Graph_Report_32px_1.png";
        setMouseBtnMoved(btnConfRelatorio, iconsBg);
    }//GEN-LAST:event_btnConfRelatorioMouseEntered

    private void btnConfRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfRelatorioMouseExited
        iconsBg = "/imgIcons/icons8_Play_Graph_Report_32px.png";
        resMouseBtnMoved(btnConfRelatorio, iconsBg);
    }//GEN-LAST:event_btnConfRelatorioMouseExited

    private void cbxGlicoseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGlicoseMouseEntered
        setMouseCbxMoved(cbxGlicose);
    }//GEN-LAST:event_cbxGlicoseMouseEntered

    private void cbxGlicoseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGlicoseMouseExited
        resMouseCbxMoved(cbxGlicose);
    }//GEN-LAST:event_cbxGlicoseMouseExited

    private void cbxAcidoUricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxAcidoUricoMouseEntered
        setMouseCbxMoved(cbxAcidoUrico);
    }//GEN-LAST:event_cbxAcidoUricoMouseEntered

    private void cbxAcidoUricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxAcidoUricoMouseExited
        resMouseCbxMoved(cbxAcidoUrico);
    }//GEN-LAST:event_cbxAcidoUricoMouseExited

    private void cbxUreiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxUreiaMouseEntered
        setMouseCbxMoved(cbxUreia);
    }//GEN-LAST:event_cbxUreiaMouseEntered

    private void cbxUreiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxUreiaMouseExited
        resMouseCbxMoved(cbxUreia);
    }//GEN-LAST:event_cbxUreiaMouseExited

    private void cbxCoatininaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCoatininaMouseEntered
        setMouseCbxMoved(cbxCoatinina);
    }//GEN-LAST:event_cbxCoatininaMouseEntered

    private void cbxCoatininaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCoatininaMouseExited
        resMouseCbxMoved(cbxCoatinina);
    }//GEN-LAST:event_cbxCoatininaMouseExited

    private void cbxHemogramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxHemogramaMouseEntered
        setMouseCbxMoved(cbxHemograma);
    }//GEN-LAST:event_cbxHemogramaMouseEntered

    private void cbxHemogramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxHemogramaMouseExited
        resMouseCbxMoved(cbxHemograma);
    }//GEN-LAST:event_cbxHemogramaMouseExited

    private void cbxColesterolTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxColesterolTotalMouseEntered
        setMouseCbxMoved(cbxColesterolTotal);
    }//GEN-LAST:event_cbxColesterolTotalMouseEntered

    private void cbxColesterolTotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxColesterolTotalMouseExited
        resMouseCbxMoved(cbxColesterolTotal);
    }//GEN-LAST:event_cbxColesterolTotalMouseExited

    private void cbxColesterolFracionadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxColesterolFracionadoMouseEntered
        setMouseCbxMoved(cbxColesterolFracionado);
    }//GEN-LAST:event_cbxColesterolFracionadoMouseEntered

    private void cbxColesterolFracionadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxColesterolFracionadoMouseExited
        resMouseCbxMoved(cbxColesterolFracionado);
    }//GEN-LAST:event_cbxColesterolFracionadoMouseExited

    private void cbxTrigliceridesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTrigliceridesMouseEntered
        setMouseCbxMoved(cbxTriglicerides);
    }//GEN-LAST:event_cbxTrigliceridesMouseEntered

    private void cbxTrigliceridesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTrigliceridesMouseExited
        resMouseCbxMoved(cbxTriglicerides);
    }//GEN-LAST:event_cbxTrigliceridesMouseExited

    private void cbxGamaGtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGamaGtMouseEntered
        setMouseCbxMoved(cbxGamaGt);
    }//GEN-LAST:event_cbxGamaGtMouseEntered

    private void cbxGamaGtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGamaGtMouseExited
        resMouseCbxMoved(cbxGamaGt);
    }//GEN-LAST:event_cbxGamaGtMouseExited

    private void cbxBilirrubinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxBilirrubinaMouseEntered
        setMouseCbxMoved(cbxBilirrubina);
    }//GEN-LAST:event_cbxBilirrubinaMouseEntered

    private void cbxBilirrubinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxBilirrubinaMouseExited
        resMouseCbxMoved(cbxBilirrubina);
    }//GEN-LAST:event_cbxBilirrubinaMouseExited

    private void cbxTgoTgpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTgoTgpMouseEntered
        setMouseCbxMoved(cbxTgoTgp);
    }//GEN-LAST:event_cbxTgoTgpMouseEntered

    private void cbxTgoTgpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTgoTgpMouseExited
        resMouseCbxMoved(cbxTgoTgp);
    }//GEN-LAST:event_cbxTgoTgpMouseExited

    private void cbxUrinaRotinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxUrinaRotinaMouseEntered
        setMouseCbxMoved(cbxUrinaRotina);
    }//GEN-LAST:event_cbxUrinaRotinaMouseEntered

    private void cbxUrinaRotinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxUrinaRotinaMouseExited
        resMouseCbxMoved(cbxUrinaRotina);
    }//GEN-LAST:event_cbxUrinaRotinaMouseExited

    private void cbxEpfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxEpfMouseEntered
        setMouseCbxMoved(cbxEpf);
    }//GEN-LAST:event_cbxEpfMouseEntered

    private void cbxEpfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxEpfMouseExited
        resMouseCbxMoved(cbxEpf);
    }//GEN-LAST:event_cbxEpfMouseExited

    private void cbxSangueOcultoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxSangueOcultoMouseEntered
        setMouseCbxMoved(cbxSangueOculto);
    }//GEN-LAST:event_cbxSangueOcultoMouseEntered

    private void cbxSangueOcultoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxSangueOcultoMouseExited
        resMouseCbxMoved(cbxSangueOculto);
    }//GEN-LAST:event_cbxSangueOcultoMouseExited
    
    
    
    
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
    private javax.swing.JPanel LogoTipo;
    private javax.swing.JPanel barNotifq;
    private javax.swing.JToggleButton btnBioquimica;
    private javax.swing.JToggleButton btnCadastraCliente;
    private javax.swing.JToggleButton btnCadastraPedido;
    private javax.swing.JToggleButton btnCadastraResultado;
    private javax.swing.JToggleButton btnCliente;
    private javax.swing.JToggleButton btnClienteCadastra;
    private javax.swing.JToggleButton btnClienteDetalhe;
    private javax.swing.JToggleButton btnClienteEdit;
    private javax.swing.JToggleButton btnClienteExcluir;
    private javax.swing.JToggleButton btnClienteLimparFor;
    private javax.swing.JToggleButton btnConfAddUser;
    private javax.swing.JToggleButton btnConfAplic;
    private javax.swing.JToggleButton btnConfBackup;
    private javax.swing.JToggleButton btnConfEdtUser;
    private javax.swing.JToggleButton btnConfRelatorio;
    private javax.swing.JToggleButton btnConfRestBackup;
    private javax.swing.JToggleButton btnConfigura;
    private javax.swing.JToggleButton btnExame;
    private javax.swing.JToggleButton btnExameDetalhe;
    private javax.swing.JToggleButton btnExameEdit;
    private javax.swing.JToggleButton btnExameExcluir;
    private javax.swing.JToggleButton btnHemoPedCancelar;
    private javax.swing.JToggleButton btnHemoPedSalvar;
    private javax.swing.JToggleButton btnHemograma;
    private javax.swing.JToggleButton btnInicio;
    private javax.swing.JToggleButton btnInicioCadasCliente;
    private javax.swing.JToggleButton btnInicioCadsResulExam;
    private javax.swing.JToggleButton btnInicioConfRelat;
    private javax.swing.JToggleButton btnMinimizar;
    private javax.swing.JToggleButton btnRelatorioExame;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JToggleButton btnSangueOculto;
    private javax.swing.JToggleButton btnUrinaRotina;
    private javax.swing.JToggleButton btnconsultaCliente;
    private javax.swing.JCheckBox cbxAcidoUrico;
    private javax.swing.JCheckBox cbxBilirrubina;
    private javax.swing.JComboBox<String> cbxClienteUf;
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
    private javax.swing.JPanel contMasq;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel jpnExames;
    private javax.swing.JLabel lblNivelAcesso;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JPanel nav;
    private javax.swing.JRadioButton rbClienteFemi;
    private javax.swing.JRadioButton rbClienteMasc;
    private javax.swing.ButtonGroup rbgSexo;
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
    private javax.swing.JTextField txtCodClienteResult;
    private javax.swing.JTextField txtCodPedidoResult;
    private javax.swing.JTextField txtConvenioResult;
    private javax.swing.JTextField txtDataPedidoResult;
    private javax.swing.JTextField txtExPedCodCliente;
    private javax.swing.JTextField txtExPedCodPedido;
    private javax.swing.JTextField txtExPedConvenio;
    private javax.swing.JTextField txtExPedDataPedido;
    private javax.swing.JTextField txtExPedNome;
    private javax.swing.JTextField txtNomeResult;
    // End of variables declaration//GEN-END:variables
}
