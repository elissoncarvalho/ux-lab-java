
package fronteira;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import entidade.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import persistencia.ClienteDAO;
import persistencia.PedidoDAO;

public class Principal extends javax.swing.JFrame {
    
    Helper              helper          = new Helper();
    ExameGeraRelatorio  exameGeraRel    = new ExameGeraRelatorio();
    ConfAddUser         confAddUser     = new ConfAddUser();
    ConfEdtUser         confEdtUser     = new ConfEdtUser();
    ConfNewBackup       confNewBackup   = new ConfNewBackup();
    ConfRestBackup      confRestBeckup  = new ConfRestBackup();
    ConfAplicacao       confAplicacao   = new ConfAplicacao();
    ConfRelatorio       confRelatorio   = new ConfRelatorio();

    private String iconsBg;
    
    private final String[] colunaCliente = new String[]{"Código", "Nome", "CPF", "RG", "Telefone"};
    private final String[] colunaExame = new String[]{"Código", "Cód. Cliente", "Nome Completo", "CPF", "Status"};
    private final DefaultTableModel tmCliente = new DefaultTableModel(null, colunaCliente);
    private final DefaultTableModel tmExame = new DefaultTableModel(null, colunaExame);
    private List<Cliente> listaCliente;
    private List<Pedido> listarPedido;
    private ListSelectionModel lsmCliente;
    private ListSelectionModel lsmExame;
    
    public Principal(){
        initComponents();
        setLocationRelativeTo(null);
        //Icone do Sistema
        URL url = this.getClass().getResource("/imgIcons/icon.png");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
        
        divNaoInicia();    
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
        txtExPedDataPedido = new javax.swing.JFormattedTextField();
        divCadastraResultado = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtCodPedidoResult = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtDataPedidoResult = new javax.swing.JFormattedTextField();
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
        tblExame = new javax.swing.JTable();
        btnExameDetalhe = new javax.swing.JToggleButton();
        btnExameEdit = new javax.swing.JToggleButton();
        btnExameExcluir = new javax.swing.JToggleButton();
        divCliente = new javax.swing.JPanel();
        divNavCliente = new javax.swing.JPanel();
        btnconsultaCliente = new javax.swing.JToggleButton();
        btnCadastraCliente = new javax.swing.JToggleButton();
        divConsultaCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnClienteDetalhe = new javax.swing.JToggleButton();
        btnClienteEdit = new javax.swing.JToggleButton();
        btnClienteExcluir = new javax.swing.JToggleButton();
        divCadastraCliente = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rbClienteMasc = new javax.swing.JRadioButton();
        rbClienteFemi = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtClienteEnder = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txtClienteBairro = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        txtClienteCidade = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        cbxClienteUf = new javax.swing.JComboBox<>();
        btnClienteLimparFor = new javax.swing.JToggleButton();
        btnClienteCadastra = new javax.swing.JToggleButton();
        txtClienteDataNasc = new javax.swing.JFormattedTextField();
        txtClienteCPF = new javax.swing.JFormattedTextField();
        txtClienteTel = new javax.swing.JFormattedTextField();
        txtClienteCEP = new javax.swing.JFormattedTextField();
        txtClienteRG = new javax.swing.JFormattedTextField();
        divConfigura = new javax.swing.JPanel();
        btnConfAddUser = new javax.swing.JToggleButton();
        btnConfEdtUser = new javax.swing.JToggleButton();
        btnConfBackup = new javax.swing.JToggleButton();
        btnConfRestBackup = new javax.swing.JToggleButton();
        btnConfAplic = new javax.swing.JToggleButton();
        btnConfRelatorio = new javax.swing.JToggleButton();

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
        btnInicioCadsResulExam.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)), javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1)));
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
        txtExPedCodCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExPedCodClienteFocusLost(evt);
            }
        });

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

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(35, 59, 77));
        jLabel23.setText("Convênio");

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

        btnHemoPedSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnHemoPedSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHemoPedSalvar.setForeground(new java.awt.Color(0, 128, 200));
        btnHemoPedSalvar.setText("Salvar");
        btnHemoPedSalvar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 128, 200)));
        btnHemoPedSalvar.setContentAreaFilled(false);
        btnHemoPedSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHemoPedSalvar.setFocusPainted(false);
        btnHemoPedSalvar.setNextFocusableComponent(btnCadastraResultado);
        btnHemoPedSalvar.setOpaque(true);
        btnHemoPedSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHemoPedSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHemoPedSalvarMouseExited(evt);
            }
        });
        btnHemoPedSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHemoPedSalvarActionPerformed(evt);
            }
        });

        btnHemoPedCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnHemoPedCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHemoPedCancelar.setForeground(new java.awt.Color(190, 75, 73));
        btnHemoPedCancelar.setText("Cancelar");
        btnHemoPedCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(190, 75, 73)));
        btnHemoPedCancelar.setContentAreaFilled(false);
        btnHemoPedCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHemoPedCancelar.setFocusPainted(false);
        btnHemoPedCancelar.setNextFocusableComponent(btnCadastraResultado);
        btnHemoPedCancelar.setOpaque(true);
        btnHemoPedCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHemoPedCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHemoPedCancelarMouseExited(evt);
            }
        });
        btnHemoPedCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHemoPedCancelarActionPerformed(evt);
            }
        });

        txtExPedDataPedido.setEditable(false);
        txtExPedDataPedido.setBackground(new java.awt.Color(255, 255, 255));
        txtExPedDataPedido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtExPedDataPedido.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtExPedDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtExPedDataPedido.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

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
                        .addComponent(jpnExames, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(divCadastraExameLayout.createSequentialGroup()
                            .addComponent(txtExPedCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtExPedCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtExPedNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtExPedDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtExPedConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(divCadastraExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExPedCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExPedCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExPedNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExPedConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExPedDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        divCadastraResultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(35, 59, 77));
        jLabel24.setText("Cód. Pedido");
        divCadastraResultado.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 50, -1, -1));

        txtCodPedidoResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCodPedidoResult.setForeground(new java.awt.Color(35, 59, 77));
        txtCodPedidoResult.setToolTipText("");
        txtCodPedidoResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtCodPedidoResult.setName(""); // NOI18N
        txtCodPedidoResult.setOpaque(false);
        txtCodPedidoResult.setSelectionColor(new java.awt.Color(35, 59, 77));
        txtCodPedidoResult.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodPedidoResultFocusLost(evt);
            }
        });
        divCadastraResultado.add(txtCodPedidoResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 66, 100, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(35, 59, 77));
        jLabel27.setText("Data do Pedido");
        divCadastraResultado.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 50, -1, -1));

        txtDataPedidoResult.setEditable(false);
        txtDataPedidoResult.setBackground(new java.awt.Color(255, 255, 255));
        txtDataPedidoResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtDataPedidoResult.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtDataPedidoResult.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataPedidoResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        divCadastraResultado.add(txtDataPedidoResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 66, 120, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(35, 59, 77));
        jLabel28.setText("Convênio");
        divCadastraResultado.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 50, -1, -1));

        txtConvenioResult.setEditable(false);
        txtConvenioResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenioResult.setForeground(new java.awt.Color(35, 59, 77));
        txtConvenioResult.setToolTipText("");
        txtConvenioResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenioResult.setName(""); // NOI18N
        txtConvenioResult.setOpaque(false);
        txtConvenioResult.setSelectionColor(new java.awt.Color(35, 59, 77));
        divCadastraResultado.add(txtConvenioResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 66, 150, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(35, 59, 77));
        jLabel25.setText("Cód. Cliente");
        divCadastraResultado.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 50, -1, -1));

        txtCodClienteResult.setEditable(false);
        txtCodClienteResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCodClienteResult.setForeground(new java.awt.Color(35, 59, 77));
        txtCodClienteResult.setToolTipText("");
        txtCodClienteResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtCodClienteResult.setName(""); // NOI18N
        txtCodClienteResult.setOpaque(false);
        txtCodClienteResult.setSelectionColor(new java.awt.Color(35, 59, 77));
        divCadastraResultado.add(txtCodClienteResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 66, 100, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(35, 59, 77));
        jLabel26.setText("Nome Completo");
        divCadastraResultado.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 118, -1, -1));

        txtNomeResult.setEditable(false);
        txtNomeResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNomeResult.setForeground(new java.awt.Color(35, 59, 77));
        txtNomeResult.setToolTipText("");
        txtNomeResult.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtNomeResult.setName(""); // NOI18N
        txtNomeResult.setOpaque(false);
        txtNomeResult.setSelectionColor(new java.awt.Color(35, 59, 77));
        divCadastraResultado.add(txtNomeResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 134, 536, 30));

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
        divCadastraResultado.add(btnHemograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 224, 130, 60));

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
        divCadastraResultado.add(btnBioquimica, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 224, 130, 60));

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
        divCadastraResultado.add(btnUrinaRotina, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 334, 130, 60));

        btnSangueOculto.setBackground(new java.awt.Color(255, 255, 255));
        btnSangueOculto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSangueOculto.setForeground(new java.awt.Color(35, 59, 77));
        btnSangueOculto.setText(" EPF / Sangue Oculto");
        btnSangueOculto.setActionCommand(" EPF / Sangue Oculto");
        btnSangueOculto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 59, 77)));
        btnSangueOculto.setContentAreaFilled(false);
        btnSangueOculto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSangueOculto.setEnabled(false);
        btnSangueOculto.setFocusPainted(false);
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
        divCadastraResultado.add(btnSangueOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 334, 130, 60));

        divExame.add(divCadastraResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 520));

        divRelatorioExame.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        tblExame.setAutoCreateRowSorter(true);
        tblExame.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tblExame.setForeground(new java.awt.Color(18, 12, 30));
        tblExame.setModel(tmExame);
        tblExame.setGridColor(new java.awt.Color(255, 255, 255));
        tblExame.setRowHeight(25);
        tblExame.setRowMargin(2);
        tblExame.setSelectionBackground(new java.awt.Color(0, 128, 200));
        tblExame.setShowHorizontalLines(false);
        tblExame.setShowVerticalLines(false);
        tblExame.getTableHeader().setReorderingAllowed(false);
        tblExame.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmExame = tblExame.getSelectionModel();
        lsmExame.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(! e.getValueIsAdjusting()){
                    //tblExameLinhaSelecionada(tblExame);
                }
            }
        });
        jScrollPane2.setViewportView(tblExame);

        btnExameDetalhe.setBackground(new java.awt.Color(255, 255, 255));
        btnExameDetalhe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExameDetalhe.setForeground(new java.awt.Color(0, 128, 200));
        btnExameDetalhe.setText("Gerar Relatório");
        btnExameDetalhe.setActionCommand("<html><p style=\"text-decoration: underline\">Gerar Relatório<p>");
        btnExameDetalhe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 124, 162), 2));
        btnExameDetalhe.setBorderPainted(false);
        btnExameDetalhe.setContentAreaFilled(false);
        btnExameDetalhe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExameDetalhe.setFocusPainted(false);
        btnExameDetalhe.setFocusable(false);
        btnExameDetalhe.setNextFocusableComponent(btnCadastraResultado);
        btnExameDetalhe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExameDetalheMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExameDetalheMouseExited(evt);
            }
        });
        btnExameDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExameDetalheActionPerformed(evt);
            }
        });

        btnExameEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnExameEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExameEdit.setForeground(new java.awt.Color(0, 128, 200));
        btnExameEdit.setText("Editar");
        btnExameEdit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 128, 200)));
        btnExameEdit.setContentAreaFilled(false);
        btnExameEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExameEdit.setFocusPainted(false);
        btnExameEdit.setNextFocusableComponent(btnCadastraResultado);
        btnExameEdit.setOpaque(true);
        btnExameEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExameEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExameEditMouseExited(evt);
            }
        });
        btnExameEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExameEditActionPerformed(evt);
            }
        });

        btnExameExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExameExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExameExcluir.setForeground(new java.awt.Color(190, 75, 73));
        btnExameExcluir.setText("Excluir");
        btnExameExcluir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(190, 75, 73)));
        btnExameExcluir.setContentAreaFilled(false);
        btnExameExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExameExcluir.setFocusPainted(false);
        btnExameExcluir.setNextFocusableComponent(btnCadastraResultado);
        btnExameExcluir.setOpaque(true);
        btnExameExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExameExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExameExcluirMouseExited(evt);
            }
        });
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

        tblCliente.setAutoCreateRowSorter(true);
        tblCliente.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tblCliente.setForeground(new java.awt.Color(18, 12, 30));
        tblCliente.setModel(tmCliente);
        tblCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tblCliente.setRowHeight(25);
        tblCliente.setRowMargin(2);
        tblCliente.setSelectionBackground(new java.awt.Color(0, 128, 200));
        tblCliente.setSelectionForeground(new java.awt.Color(232, 230, 236));
        tblCliente.setShowHorizontalLines(false);
        tblCliente.setShowVerticalLines(false);
        tblCliente.getTableHeader().setResizingAllowed(false);
        tblCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmCliente = tblCliente.getSelectionModel();
        lsmCliente.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(! e.getValueIsAdjusting()){
                    //tblClienteLinhaSelecionada(tblCliente);
                }
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        btnClienteDetalhe.setBackground(new java.awt.Color(255, 255, 255));
        btnClienteDetalhe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClienteDetalhe.setForeground(new java.awt.Color(0, 128, 200));
        btnClienteDetalhe.setText("Detalhes");
        btnClienteDetalhe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 124, 162), 2));
        btnClienteDetalhe.setBorderPainted(false);
        btnClienteDetalhe.setContentAreaFilled(false);
        btnClienteDetalhe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteDetalhe.setFocusPainted(false);
        btnClienteDetalhe.setFocusable(false);
        btnClienteDetalhe.setNextFocusableComponent(btnCadastraResultado);
        btnClienteDetalhe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteDetalheMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteDetalheMouseExited(evt);
            }
        });
        btnClienteDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteDetalheActionPerformed(evt);
            }
        });

        btnClienteEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnClienteEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClienteEdit.setForeground(new java.awt.Color(0, 128, 200));
        btnClienteEdit.setText("Editar");
        btnClienteEdit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 128, 200)));
        btnClienteEdit.setContentAreaFilled(false);
        btnClienteEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteEdit.setFocusPainted(false);
        btnClienteEdit.setNextFocusableComponent(btnCadastraResultado);
        btnClienteEdit.setOpaque(true);
        btnClienteEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteEditMouseExited(evt);
            }
        });
        btnClienteEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteEditActionPerformed(evt);
            }
        });

        btnClienteExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnClienteExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClienteExcluir.setForeground(new java.awt.Color(190, 75, 73));
        btnClienteExcluir.setText("Excluir");
        btnClienteExcluir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(190, 75, 73)));
        btnClienteExcluir.setContentAreaFilled(false);
        btnClienteExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteExcluir.setFocusPainted(false);
        btnClienteExcluir.setNextFocusableComponent(btnCadastraResultado);
        btnClienteExcluir.setOpaque(true);
        btnClienteExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteExcluirMouseExited(evt);
            }
        });
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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 59, 77));
        jLabel13.setText("CPF");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 59, 77));
        jLabel14.setText("RG");

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
        btnClienteLimparFor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteLimparForMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteLimparForMouseExited(evt);
            }
        });
        btnClienteLimparFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteLimparForActionPerformed(evt);
            }
        });

        btnClienteCadastra.setBackground(new java.awt.Color(255, 255, 255));
        btnClienteCadastra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClienteCadastra.setForeground(new java.awt.Color(0, 128, 200));
        btnClienteCadastra.setText("Cadastrar");
        btnClienteCadastra.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 128, 200)));
        btnClienteCadastra.setContentAreaFilled(false);
        btnClienteCadastra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteCadastra.setFocusPainted(false);
        btnClienteCadastra.setNextFocusableComponent(btnCadastraResultado);
        btnClienteCadastra.setOpaque(true);
        btnClienteCadastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteCadastraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteCadastraMouseExited(evt);
            }
        });
        btnClienteCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteCadastraActionPerformed(evt);
            }
        });

        txtClienteDataNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteDataNasc.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteDataNasc.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        txtClienteCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCPF.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteCPF.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        txtClienteTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteTel.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteTel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        txtClienteCEP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteCEP.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteCEP.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        txtClienteRG.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtClienteRG.setForeground(new java.awt.Color(35, 59, 77));
        try {
            txtClienteRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteRG.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        javax.swing.GroupLayout divCadastraClienteLayout = new javax.swing.GroupLayout(divCadastraCliente);
        divCadastraCliente.setLayout(divCadastraClienteLayout);
        divCadastraClienteLayout.setHorizontalGroup(
            divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, divCadastraClienteLayout.createSequentialGroup()
                                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divCadastraClienteLayout.createSequentialGroup()
                                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel82)
                                            .addComponent(txtClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel81)
                                            .addComponent(cbxClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel18)
                                    .addComponent(txtClienteEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
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
                                        .addComponent(jLabel12)
                                        .addGap(77, 77, 77))
                                    .addComponent(txtClienteDataNasc))
                                .addGap(18, 18, 18)
                                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addComponent(txtClienteNome)
                            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnClienteLimparFor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClienteCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                        .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbClienteFemi)))
                                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                        .addComponent(jLabel16)
                                        .addGap(206, 206, 206))
                                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(txtClienteTel)))))
                        .addGap(147, 147, 147))))
        );
        divCadastraClienteLayout.setVerticalGroup(
            divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divCadastraClienteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(divCadastraClienteLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(30, 30, 30))))
                .addGap(22, 22, 22)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbClienteMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbClienteFemi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(0, 0, 0)
                        .addComponent(txtClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel82)
                    .addGroup(divCadastraClienteLayout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(divCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClienteLimparFor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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

    // Ações On Click Navegação
    private void navMenu(int opcaoMenu){
        switch (opcaoMenu){
            case 1:
                helperMenuDesabilita();

                helper.setBtnColor(btnInicio);
                divInicio.setVisible(true);

                break;
                
            case 2:
                helperMenuDesabilita();
                buscaNumeroPedido();
                
                helper.setBtnColor(btnExame);
                divExame.setVisible(true);
               
                break;
                
            case 3:
                helperMenuDesabilita();
                
                helper.setBtnColor(btnCliente);
                divCliente.setVisible(true);
                clickMouseClienteConsulta();
                
                break;
                
            case 4:
                helperMenuDesabilita();
                
                helper.setBtnColor(btnConfigura);
                divConfigura.setVisible(true);
                
                break;
        }
    }
    private void helperMenuDesabilita(){
        helper.resetBtnColor(btnInicio);
        helper.resetBtnColor(btnExame);
        helper.resetBtnColor(btnCliente);
        helper.resetBtnColor(btnConfigura);
        divInicio.setVisible(false);
        divExame.setVisible(false);
        divCliente.setVisible(false);
        divConfigura.setVisible(false);
    }
    private void clickMouseExamePedido(){
        helper.setBtnColor(btnCadastraPedido);
        helper.resetBtnColor(btnCadastraResultado);
        helper.resetBtnColor(btnRelatorioExame);
        divCadastraExame.setVisible(true);
        divCadastraResultado.setVisible(!true);
        divRelatorioExame.setVisible(!true);
        buscaNumeroPedido();
        txtExPedCodCliente.requestFocusInWindow();
    }
    private void clickMouseExameCadastra(){
        helper.setBtnColor(btnCadastraResultado);
        helper.resetBtnColor(btnCadastraPedido);
        helper.resetBtnColor(btnRelatorioExame);
        divCadastraExame.setVisible(!true);
        divCadastraResultado.setVisible(true);
        divRelatorioExame.setVisible(!true);
        txtCodPedidoResult.requestFocusInWindow();
    }
    private void clickMouseExameRelatorio(){
        helper.setBtnColor(btnRelatorioExame);
        helper.resetBtnColor(btnCadastraPedido);
        helper.resetBtnColor(btnCadastraResultado);
        divCadastraExame.setVisible(!true);
        divCadastraResultado.setVisible(!true);
        mostrarExames();
        divRelatorioExame.setVisible(true);
    }
    private void clickMouseClienteConsulta(){
        divConsultaCliente.setVisible(true);
        divCadastraCliente.setVisible(!true);
        helper.setBtnColor(btnconsultaCliente);
        helper.resetBtnColor(btnCadastraCliente);
        mostrarClientes();
    }
    private void clickMouseClienteCadastra(){
        divConsultaCliente.setVisible(!true);
        divCadastraCliente.setVisible(true);
        helper.setBtnColor(btnCadastraCliente);
        helper.resetBtnColor(btnconsultaCliente);
        txtClienteNome.requestFocusInWindow();
    }
    private void clickMouseAtalhoCadClie(){
        helper.setBtnColor(btnCliente);
        divCliente.setVisible(true);
        
        helper.resetBtnColor(btnExame);
        helper.resetBtnColor(btnInicio);
        helper.resetBtnColor(btnConfigura);
        divInicio.setVisible(false);
        divExame.setVisible(false);
        divConfigura.setVisible(false);
        
        divConsultaCliente.setVisible(false);
        divCadastraCliente.setVisible(true);
        helper.setBtnColor(btnCadastraCliente);
        helper.resetBtnColor(btnconsultaCliente);
    }
    private void clickMouseAtalhoExameCadsResult(){
        helper.setBtnColor(btnExame);
        divExame.setVisible(true);
        
        helper.resetBtnColor(btnInicio);
        helper.resetBtnColor(btnCliente);
        helper.resetBtnColor(btnConfigura);
        divInicio.setVisible(false);
        divCliente.setVisible(false);
        divConfigura.setVisible(false);
        
        helper.setBtnColor(btnCadastraResultado);
        helper.resetBtnColor(btnCadastraPedido);
        helper.resetBtnColor(btnRelatorioExame);
        divCadastraExame.setVisible(!true);
        divCadastraResultado.setVisible(true);
        divRelatorioExame.setVisible(!true);
    }
    private void clickMouseAtalhoConfRelatorio(){
        helper.setBtnColor(btnConfigura);
        divConfigura.setVisible(true);
        
        helper.resetBtnColor(btnExame);
        helper.resetBtnColor(btnInicio);
        helper.resetBtnColor(btnCliente);
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
    private void limparClienteCadastro(){
        txtClienteNome.setText("");
        txtClienteDataNasc.setText("");
        txtClienteCPF.setText("");
        txtClienteRG.setText("");
        txtClienteTel.setText("");
        txtClienteEnder.setText("");
        txtClienteBairro.setText("");
        txtClienteCEP.setText("");
        txtClienteCidade.setText("");
        cbxClienteUf.setSelectedIndex(12);
        //resetar radio buttons
    }
    //Lista, Cadastra, Detalhes, Cliente.
    public void mostrarClientes(){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        listaCliente = clienteDAO.listarClientes();
              
        while(tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }
        
        if(listaCliente.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum cliente foi encontrado!");
        }else{
            for(int i = 0; i < listaCliente.size(); i++){
                tmCliente.addRow(colunaCliente);
                tmCliente.setValueAt(listaCliente.get(i).getIdCliente(), i, 0);
                tmCliente.setValueAt(listaCliente.get(i).getNome(), i, 1);
                tmCliente.setValueAt(listaCliente.get(i).getCpf(), i, 2);
                tmCliente.setValueAt(listaCliente.get(i).getRg(), i, 3);
                tmCliente.setValueAt(listaCliente.get(i).getTelefone(), i, 4);
            }
        }
    }
    
    private void tblClienteLinhaSelecionada(JTable tbl, boolean habilita){
        
        int linhaSelecionada = tbl.getSelectedRow();
        
        if(linhaSelecionada != -1){
            
            Cliente cliente = new Cliente();
            
            cliente.setIdCliente(listaCliente.get(linhaSelecionada).getIdCliente());
            cliente.setNome(listaCliente.get(linhaSelecionada).getNome());
            cliente.setData_nasc(listaCliente.get(linhaSelecionada).getData_nasc());
            cliente.setCpf(listaCliente.get(linhaSelecionada).getCpf());
            cliente.setRg(listaCliente.get(linhaSelecionada).getRg());
            cliente.setTelefone(listaCliente.get(linhaSelecionada).getTelefone());
            cliente.setEndereco(listaCliente.get(linhaSelecionada).getEndereco());
            cliente.setBairro(listaCliente.get(linhaSelecionada).getBairro());
            cliente.setCep(listaCliente.get(linhaSelecionada).getCep());
            cliente.setCidade(listaCliente.get(linhaSelecionada).getCidade());
            cliente.setUf(listaCliente.get(linhaSelecionada).getUf());
            cliente.setSexo(listaCliente.get(linhaSelecionada).isSexo());
            
            ClienteDetalhe      clienteDetalhe  = new ClienteDetalhe();
            clienteDetalhe.consultaCliente(cliente);
            
            clienteDetalhe.habilitaCampo(habilita);
            clienteDetalhe.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente.");
        }
    }
    private void clienteCadastrar(){
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dataAtual = new java.util.Date(txtClienteDataNasc.getText().trim());
        Date dataFormatada = Date.valueOf(formato.format(dataAtual));
        boolean sexo;
        sexo = !rbClienteMasc.isSelected();
        
        Cliente cliente = new Cliente();
    
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
        
        if(clienteDAO.cadastra(cliente)){
            limparClienteCadastro();
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falha no Cadastro");
        }
    }
    private void desabilitaCliente(JTable tbl){
        if(tbl.getSelectedRow() != -1){
            if(JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o cliente [" +
                listaCliente.get(tblCliente.getSelectedRow()).getNome() + "] ?", 
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                
                Cliente cliente = new Cliente();
                cliente.setIdCliente(listaCliente.get(tblCliente.getSelectedRow()).getIdCliente());
                ClienteDAO clienteDAO = new ClienteDAO();
                clienteDAO.delet(cliente);
                JOptionPane.showMessageDialog(this, "Cliente excluido com sucesso");
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente para ser excluido!");
        }
    }
    private void buscaNumeroPedido(){
        PedidoDAO pedidoDAO = new PedidoDAO();
        txtExPedCodPedido.setText(String.valueOf(pedidoDAO.buscaNumeroPedido() + 1));
    }
    private void buscaClienteExame(){
        if(!txtExPedCodCliente.getText().isEmpty()){
            //buscando a data atual
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date dataString = new java.util.Date();
            String dataFormatada = String.valueOf(formato.format(dataString));
            txtExPedDataPedido.setText(dataFormatada);

            PedidoDAO pedidoDAO = new PedidoDAO();

            txtExPedNome.setText(pedidoDAO.buscaCliente(Integer.valueOf(txtExPedCodCliente.getText().trim())));
        }
    }
    // Novo Exame
    private void novoExame(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dataAtual = new java.util.Date(txtExPedDataPedido.getText().trim());
        Date dataFormatada = Date.valueOf(formato.format(dataAtual));
        
        Pedido pedido = new Pedido();
        pedido.setIdPedido(Integer.valueOf(txtExPedCodCliente.getText().trim()));
        pedido.setIdCliente(Integer.valueOf(txtExPedCodCliente.getText().trim()));
        pedido.setDataPedido(dataFormatada);
        pedido.setConvenio(txtExPedConvenio.getText().trim());
        if (cbxHemograma.isSelected()){
            pedido.setActiveHemograma(true);
        }else{
            pedido.setActiveHemograma(false);
        }
        if (cbxUrinaRotina.isSelected()) {
            pedido.setActiveUrinaRotina(true);
        }else{
            pedido.setActiveUrinaRotina(false);
        }
        
        if (cbxSangueOculto.isSelected() || cbxEpf.isSelected()) {
            pedido.setActiveSangueOculto(true);
        }else{
            pedido.setActiveSangueOculto(false);
        }
        if (cbxGlicose.isSelected() || cbxAcidoUrico.isSelected() || cbxGamaGt.isSelected() || 
            cbxColesterolTotal.isSelected() || cbxBilirrubina.isSelected() || cbxUreia.isSelected() ||
            cbxColesterolFracionado.isSelected() || cbxTgoTgp.isSelected() || cbxCoatinina.isSelected() ||
            cbxTriglicerides.isSelected()) 
        {
            pedido.setActiveBioquimica(true);
        }else{
            pedido.setActiveBioquimica(false);
        }
        
        PedidoDAO pedidoDAO = new PedidoDAO();
        
        if(pedidoDAO.geraPedido(pedido)){
            JOptionPane.showMessageDialog(rootPane, "Pedido gerado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falha no Cadastro do pedido");
        }
        
        
    }
    // Fim Novo Exame
    // Listar Pedidos
    public void mostrarExames(){
        
        PedidoDAO pedidoDAO = new PedidoDAO();
        listarPedido = pedidoDAO.listarPedidos();
              
        while(tmExame.getRowCount() > 0) {
            tmExame.removeRow(0);
        }
        
        if(listarPedido.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum Exame foi encontrado!");
        }else{
            for(int i = 0; i < listarPedido.size(); i++){
                tmExame.addRow(colunaExame);
                tmExame.setValueAt(listarPedido.get(i).getIdPedido(), i, 0);
                tmExame.setValueAt(listarPedido.get(i).getIdCliente(), i, 1);
                tmExame.setValueAt(listarPedido.get(i).getNome(), i, 2);
                tmExame.setValueAt(listarPedido.get(i).getCpf(), i, 3);
                tmExame.setValueAt(listarPedido.get(i).isStatus(), i, 4);
                
            }
        }
    }
    // Fim Listar Pedidos
    // Inicio Busca Pedido Exame
    private void buscaPedidoExame(){
        if(!txtCodPedidoResult.getText().isEmpty()){
            
            Pedido pedido = new Pedido();
            pedido.setIdPedido(Integer.valueOf(txtCodPedidoResult.getText().trim()));
            PedidoDAO pedidoDAO = new PedidoDAO();
            pedidoDAO.buscaPedidoExame(pedido);
            
            Date data = pedido.getDataPedido();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date dataString = (java.util.Date) data;
            String dataFormatada = String.valueOf(formato.format(dataString));
            
            txtCodClienteResult.setText(String.valueOf(pedido.getIdCliente()));
            txtDataPedidoResult.setText(dataFormatada);
            txtConvenioResult.setText(pedido.getConvenio());
            txtNomeResult.setText(pedido.getNome());
            
            helper.verificaActive(btnHemograma, btnBioquimica, btnUrinaRotina, btnSangueOculto, pedido);
            helper.verificaStatus(btnHemograma, btnBioquimica, btnUrinaRotina, btnSangueOculto);
            
        }
    }
    
    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConfiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguraActionPerformed
        //clickMouseConfiguracao();
        navMenu(4);
    }//GEN-LAST:event_btnConfiguraActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        //clickMouseCliente();
        navMenu(3);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameActionPerformed
        //clickMouseExame();
        navMenu(2);
    }//GEN-LAST:event_btnExameActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        //clickMouseInicio();
        navMenu(1);
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
        clienteCadastrar();
    }//GEN-LAST:event_btnClienteCadastraActionPerformed

    private void btnClienteLimparForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteLimparForActionPerformed
        limparClienteCadastro();
    }//GEN-LAST:event_btnClienteLimparForActionPerformed

    private void btnExameExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameExcluirActionPerformed
        JOptionPane.showConfirmDialog(rootPane, "Você realmente deseja realizar essa ação!?", "confirmar", WIDTH);
    }//GEN-LAST:event_btnExameExcluirActionPerformed

    private void btnExameEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameEditActionPerformed
        clickMouseExameCadastra();
    }//GEN-LAST:event_btnExameEditActionPerformed
    
    // Inicio Cadastrar Pedidos 
    private void cbxGlicoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGlicoseActionPerformed
        
        if(cbxGlicose.isSelected()){
            helper.setCbxColor(cbxGlicose);
        } else {
            helper.restCbxColor(cbxGlicose);
        }
    }//GEN-LAST:event_cbxGlicoseActionPerformed

    private void cbxHemogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHemogramaActionPerformed
         
        if(cbxHemograma.isSelected()){
            helper.setCbxColor(cbxHemograma);
        } else {
            helper.restCbxColor(cbxHemograma);
        }
    }//GEN-LAST:event_cbxHemogramaActionPerformed

    private void cbxAcidoUricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAcidoUricoActionPerformed
        if(cbxAcidoUrico.isSelected()){
            helper.setCbxColor(cbxAcidoUrico);
        } else {
            helper.restCbxColor(cbxAcidoUrico);
        }
    }//GEN-LAST:event_cbxAcidoUricoActionPerformed

    private void cbxUreiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUreiaActionPerformed
        if(cbxUreia.isSelected()){
            helper.setCbxColor(cbxUreia);
        } else {
            helper.restCbxColor(cbxUreia);
        }
    }//GEN-LAST:event_cbxUreiaActionPerformed

    private void cbxCoatininaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCoatininaActionPerformed
        if(cbxCoatinina.isSelected()){
            helper.setCbxColor(cbxCoatinina);
        } else {
            helper.restCbxColor(cbxCoatinina);
        }
    }//GEN-LAST:event_cbxCoatininaActionPerformed

    private void cbxColesterolTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxColesterolTotalActionPerformed
        if(cbxColesterolTotal.isSelected()){
            helper.setCbxColor(cbxColesterolTotal);
        } else {
            helper.restCbxColor(cbxColesterolTotal);
        }
    }//GEN-LAST:event_cbxColesterolTotalActionPerformed

    private void cbxColesterolFracionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxColesterolFracionadoActionPerformed
        if(cbxColesterolFracionado.isSelected()){
            helper.setCbxColor(cbxColesterolFracionado);
        } else {
            helper.restCbxColor(cbxColesterolFracionado);
        }
    }//GEN-LAST:event_cbxColesterolFracionadoActionPerformed

    private void cbxTrigliceridesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTrigliceridesActionPerformed
        if(cbxTriglicerides.isSelected()){
            helper.setCbxColor(cbxTriglicerides);
        } else {
            helper.restCbxColor(cbxTriglicerides);
        }
    }//GEN-LAST:event_cbxTrigliceridesActionPerformed

    private void cbxTgoTgpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTgoTgpActionPerformed
        if(cbxTgoTgp.isSelected()){
            helper.setCbxColor(cbxTgoTgp);
        } else {
            helper.restCbxColor(cbxTgoTgp);
        }
    }//GEN-LAST:event_cbxTgoTgpActionPerformed

    private void cbxGamaGtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGamaGtActionPerformed
        if(cbxGamaGt.isSelected()){
            helper.setCbxColor(cbxGamaGt);
        } else {
            helper.restCbxColor(cbxGamaGt);
        }
    }//GEN-LAST:event_cbxGamaGtActionPerformed

    private void cbxBilirrubinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBilirrubinaActionPerformed
        if(cbxBilirrubina.isSelected()){
            helper.setCbxColor(cbxBilirrubina);
        } else {
            helper.restCbxColor(cbxBilirrubina);
        }
    }//GEN-LAST:event_cbxBilirrubinaActionPerformed

    private void cbxUrinaRotinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUrinaRotinaActionPerformed
        if(cbxUrinaRotina.isSelected()){
            helper.setCbxColor(cbxUrinaRotina);
        } else {
            helper.restCbxColor(cbxUrinaRotina);
        }
    }//GEN-LAST:event_cbxUrinaRotinaActionPerformed

    private void cbxEpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEpfActionPerformed
        if(cbxEpf.isSelected()){
            helper.setCbxColor(cbxEpf);
        } else {
            helper.restCbxColor(cbxEpf);
        }
    }//GEN-LAST:event_cbxEpfActionPerformed

    private void cbxSangueOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSangueOcultoActionPerformed
        if(cbxSangueOculto.isSelected()){
            helper.setCbxColor(cbxSangueOculto);
        } else {
            helper.restCbxColor(cbxSangueOculto);
        }
    }//GEN-LAST:event_cbxSangueOcultoActionPerformed

    private void btnBioquimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBioquimicaActionPerformed
        ExameBioquimica bioquimica = new ExameBioquimica();
        bioquimica.setVisible(true);
    }//GEN-LAST:event_btnBioquimicaActionPerformed

    private void btnHemogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHemogramaActionPerformed
        
        ExameHemograma exameHemograma = new ExameHemograma(Integer.valueOf(txtCodPedidoResult.getText().trim()));
        exameHemograma.setVisible(true);
        
    }//GEN-LAST:event_btnHemogramaActionPerformed

    private void btnUrinaRotinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrinaRotinaActionPerformed
        ExameUrinaRotina urinaRotina = new ExameUrinaRotina(Integer.valueOf(txtCodPedidoResult.getText().trim()));
        urinaRotina.setVisible(true);
    }//GEN-LAST:event_btnUrinaRotinaActionPerformed

    private void btnSangueOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSangueOcultoActionPerformed
        ExameSangueOculto sangueOculto = new ExameSangueOculto(Integer.valueOf(txtCodPedidoResult.getText().trim()));
        sangueOculto.setVisible(true);
    }//GEN-LAST:event_btnSangueOcultoActionPerformed

    private void btnInicioCadasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioCadasClienteActionPerformed
        clickMouseAtalhoCadClie();
    }//GEN-LAST:event_btnInicioCadasClienteActionPerformed

    private void btnInicioCadsResulExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioCadsResulExamActionPerformed
        clickMouseAtalhoExameCadsResult();
    }//GEN-LAST:event_btnInicioCadsResulExamActionPerformed

    private void btnConfBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfBackupActionPerformed
        confNewBackup.setVisible(true);
    }//GEN-LAST:event_btnConfBackupActionPerformed

    private void btnConfRestBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfRestBackupActionPerformed
        confRestBeckup.setVisible(true);
    }//GEN-LAST:event_btnConfRestBackupActionPerformed

    private void btnConfAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfAddUserActionPerformed
        confAddUser.setVisible(true);
    }//GEN-LAST:event_btnConfAddUserActionPerformed

    private void btnConfEdtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfEdtUserActionPerformed
        confEdtUser.setVisible(true);
    }//GEN-LAST:event_btnConfEdtUserActionPerformed

    private void btnConfAplicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfAplicActionPerformed
        confAplicacao.setVisible(true);
    }//GEN-LAST:event_btnConfAplicActionPerformed

    private void btnConfRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfRelatorioActionPerformed
        confRelatorio.setVisible(true);
    }//GEN-LAST:event_btnConfRelatorioActionPerformed

    private void btnHemoPedSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHemoPedSalvarActionPerformed
        novoExame();
    }//GEN-LAST:event_btnHemoPedSalvarActionPerformed

    private void btnHemoPedCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHemoPedCancelarActionPerformed
        limparExamePedido();
    }//GEN-LAST:event_btnHemoPedCancelarActionPerformed

    private void btnClienteDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteDetalheActionPerformed
        tblClienteLinhaSelecionada(tblCliente, false);
    }//GEN-LAST:event_btnClienteDetalheActionPerformed

    private void btnClienteEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteEditActionPerformed
        tblClienteLinhaSelecionada(tblCliente, true);
        mostrarClientes();
    }//GEN-LAST:event_btnClienteEditActionPerformed

    private void btnClienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteExcluirActionPerformed
        desabilitaCliente(tblCliente);
        mostrarClientes();
    }//GEN-LAST:event_btnClienteExcluirActionPerformed

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        helper.setMouseBtnSMMoved(btnSair);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        helper.resMouseBtnSMMoved(btnSair);
    }//GEN-LAST:event_btnSairMouseExited

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        helper.setMouseBtnSMMoved(btnMinimizar);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        helper.resMouseBtnSMMoved(btnMinimizar);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnInicioCadasClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioCadasClienteMouseEntered
        iconsBg = "/imgIcons/icons8_Registration_32px_1.png";
        helper.setMouseBtnMoved(btnInicioCadasCliente, iconsBg);
    }//GEN-LAST:event_btnInicioCadasClienteMouseEntered

    private void btnInicioCadasClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioCadasClienteMouseExited
        iconsBg = "/imgIcons/icons8_Registration_32px.png";
        helper.resMouseBtnMoved(btnInicioCadasCliente, iconsBg);
    }//GEN-LAST:event_btnInicioCadasClienteMouseExited

    private void btnInicioCadsResulExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioCadsResulExamMouseEntered
        iconsBg = "/imgIcons/icons8_Edit_File_32px_1.png";
        helper.setMouseBtnMoved(btnInicioCadsResulExam, iconsBg);
    }//GEN-LAST:event_btnInicioCadsResulExamMouseEntered

    private void btnInicioCadsResulExamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioCadsResulExamMouseExited
        iconsBg = "/imgIcons/icons8_Edit_File_32px.png";
        helper.resMouseBtnMoved(btnInicioCadsResulExam, iconsBg);
    }//GEN-LAST:event_btnInicioCadsResulExamMouseExited

    private void btnHemogramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHemogramaMouseEntered
        if(btnHemograma.isEnabled() == true){
            iconsBg = "";
            helper.setMouseBtnMoved(btnHemograma, iconsBg);
        }
    }//GEN-LAST:event_btnHemogramaMouseEntered

    private void btnHemogramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHemogramaMouseExited
        if(btnHemograma.isEnabled() == true){
            iconsBg = "";
            helper.resMouseBtnMoved(btnHemograma, iconsBg);
        }
    }//GEN-LAST:event_btnHemogramaMouseExited

    private void btnInicioConfRelatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioConfRelatMouseEntered
        iconsBg = "/imgIcons/icons8_Play_Graph_Report_32px_1.png";
        helper.setMouseBtnMoved(btnInicioConfRelat, iconsBg);
    }//GEN-LAST:event_btnInicioConfRelatMouseEntered

    private void btnInicioConfRelatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioConfRelatMouseExited
        iconsBg = "/imgIcons/icons8_Play_Graph_Report_32px.png";
        helper.resMouseBtnMoved(btnInicioConfRelat, iconsBg);
    }//GEN-LAST:event_btnInicioConfRelatMouseExited

    private void btnInicioConfRelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioConfRelatActionPerformed
        clickMouseAtalhoConfRelatorio();
    }//GEN-LAST:event_btnInicioConfRelatActionPerformed

    private void btnBioquimicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBioquimicaMouseEntered
        if(btnHemograma.isEnabled() == true){
            iconsBg = "";
            helper.setMouseBtnMoved(btnBioquimica, iconsBg); 
        }
        
    }//GEN-LAST:event_btnBioquimicaMouseEntered

    private void btnBioquimicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBioquimicaMouseExited
        if(btnBioquimica.isEnabled() == true){
            iconsBg = "";
            helper.resMouseBtnMoved(btnBioquimica, iconsBg);
        }
    }//GEN-LAST:event_btnBioquimicaMouseExited

    private void btnUrinaRotinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUrinaRotinaMouseEntered
        if(btnUrinaRotina.isEnabled() == true){
            iconsBg = "";
            helper.setMouseBtnMoved(btnUrinaRotina, iconsBg);
        }
    }//GEN-LAST:event_btnUrinaRotinaMouseEntered

    private void btnUrinaRotinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUrinaRotinaMouseExited
        if(btnUrinaRotina.isEnabled() == true){
            iconsBg = "";
            helper.resMouseBtnMoved(btnUrinaRotina, iconsBg);
        }
    }//GEN-LAST:event_btnUrinaRotinaMouseExited

    private void btnSangueOcultoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSangueOcultoMouseEntered
        if(btnSangueOculto.isEnabled() == true){
            iconsBg = "";
            helper.setMouseBtnMoved(btnSangueOculto, iconsBg);
        }
    }//GEN-LAST:event_btnSangueOcultoMouseEntered

    private void btnSangueOcultoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSangueOcultoMouseExited
        if(btnSangueOculto.isEnabled() == true){
            iconsBg = "";
            helper.resMouseBtnMoved(btnSangueOculto, iconsBg);
        }
    }//GEN-LAST:event_btnSangueOcultoMouseExited

    private void btnConfAddUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfAddUserMouseEntered
        iconsBg = "/imgIcons/icons8_Add_User_Male_32px_1.png";
        helper.setMouseBtnMoved(btnConfAddUser, iconsBg);
    }//GEN-LAST:event_btnConfAddUserMouseEntered

    private void btnConfAddUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfAddUserMouseExited
        iconsBg = "/imgIcons/icons8_Add_User_Male_32px.png";
        helper.resMouseBtnMoved(btnConfAddUser, iconsBg);
    }//GEN-LAST:event_btnConfAddUserMouseExited

    private void btnConfEdtUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfEdtUserMouseEntered
        iconsBg = "/imgIcons/icons8_Registration_32px_1.png";
        helper.setMouseBtnMoved(btnConfEdtUser, iconsBg);
    }//GEN-LAST:event_btnConfEdtUserMouseEntered

    private void btnConfEdtUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfEdtUserMouseExited
        iconsBg = "/imgIcons/icons8_Registration_32px.png";
        helper.resMouseBtnMoved(btnConfEdtUser, iconsBg);
    }//GEN-LAST:event_btnConfEdtUserMouseExited

    private void btnConfBackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfBackupMouseEntered
        iconsBg = "/imgIcons/icons8_Data_Protection_32px_1.png";
        helper.setMouseBtnMoved(btnConfBackup, iconsBg);
    }//GEN-LAST:event_btnConfBackupMouseEntered

    private void btnConfBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfBackupMouseExited
        iconsBg = "/imgIcons/icons8_Data_Protection_32px.png";
        helper.resMouseBtnMoved(btnConfBackup, iconsBg);
    }//GEN-LAST:event_btnConfBackupMouseExited

    private void btnConfRestBackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfRestBackupMouseEntered
        iconsBg = "/imgIcons/icons8_Data_Backup_32px_1.png";
        helper.setMouseBtnMoved(btnConfRestBackup, iconsBg);
    }//GEN-LAST:event_btnConfRestBackupMouseEntered

    private void btnConfRestBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfRestBackupMouseExited
        iconsBg = "/imgIcons/icons8_Data_Backup_32px.png";
        helper.resMouseBtnMoved(btnConfRestBackup, iconsBg);
    }//GEN-LAST:event_btnConfRestBackupMouseExited

    private void btnConfAplicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfAplicMouseEntered
        iconsBg = "/imgIcons/icons8_Maintenance_32px_1.png";
        helper.setMouseBtnMoved(btnConfAplic, iconsBg);
    }//GEN-LAST:event_btnConfAplicMouseEntered

    private void btnConfAplicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfAplicMouseExited
        iconsBg = "/imgIcons/icons8_Maintenance_32px.png";
        helper.resMouseBtnMoved(btnConfAplic, iconsBg);
    }//GEN-LAST:event_btnConfAplicMouseExited

    private void btnConfRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfRelatorioMouseEntered
        iconsBg = "/imgIcons/icons8_Play_Graph_Report_32px_1.png";
        helper.setMouseBtnMoved(btnConfRelatorio, iconsBg);
    }//GEN-LAST:event_btnConfRelatorioMouseEntered

    private void btnConfRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfRelatorioMouseExited
        iconsBg = "/imgIcons/icons8_Play_Graph_Report_32px.png";
        helper.resMouseBtnMoved(btnConfRelatorio, iconsBg);
    }//GEN-LAST:event_btnConfRelatorioMouseExited

    private void cbxGlicoseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGlicoseMouseEntered
        helper.setMouseCbxMoved(cbxGlicose);
    }//GEN-LAST:event_cbxGlicoseMouseEntered

    private void cbxGlicoseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGlicoseMouseExited
        helper.resMouseCbxMoved(cbxGlicose);
    }//GEN-LAST:event_cbxGlicoseMouseExited

    private void cbxAcidoUricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxAcidoUricoMouseEntered
        helper.setMouseCbxMoved(cbxAcidoUrico);
    }//GEN-LAST:event_cbxAcidoUricoMouseEntered

    private void cbxAcidoUricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxAcidoUricoMouseExited
        helper.resMouseCbxMoved(cbxAcidoUrico);
    }//GEN-LAST:event_cbxAcidoUricoMouseExited

    private void cbxUreiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxUreiaMouseEntered
        helper.setMouseCbxMoved(cbxUreia);
    }//GEN-LAST:event_cbxUreiaMouseEntered

    private void cbxUreiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxUreiaMouseExited
        helper.resMouseCbxMoved(cbxUreia);
    }//GEN-LAST:event_cbxUreiaMouseExited

    private void cbxCoatininaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCoatininaMouseEntered
        helper.setMouseCbxMoved(cbxCoatinina);
    }//GEN-LAST:event_cbxCoatininaMouseEntered

    private void cbxCoatininaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCoatininaMouseExited
        helper.resMouseCbxMoved(cbxCoatinina);
    }//GEN-LAST:event_cbxCoatininaMouseExited

    private void cbxHemogramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxHemogramaMouseEntered
        helper.setMouseCbxMoved(cbxHemograma);
    }//GEN-LAST:event_cbxHemogramaMouseEntered

    private void cbxHemogramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxHemogramaMouseExited
        helper.resMouseCbxMoved(cbxHemograma);
    }//GEN-LAST:event_cbxHemogramaMouseExited

    private void cbxColesterolTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxColesterolTotalMouseEntered
        helper.setMouseCbxMoved(cbxColesterolTotal);
    }//GEN-LAST:event_cbxColesterolTotalMouseEntered

    private void cbxColesterolTotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxColesterolTotalMouseExited
        helper.resMouseCbxMoved(cbxColesterolTotal);
    }//GEN-LAST:event_cbxColesterolTotalMouseExited

    private void cbxColesterolFracionadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxColesterolFracionadoMouseEntered
        helper.setMouseCbxMoved(cbxColesterolFracionado);
    }//GEN-LAST:event_cbxColesterolFracionadoMouseEntered

    private void cbxColesterolFracionadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxColesterolFracionadoMouseExited
        helper.resMouseCbxMoved(cbxColesterolFracionado);
    }//GEN-LAST:event_cbxColesterolFracionadoMouseExited

    private void cbxTrigliceridesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTrigliceridesMouseEntered
        helper.setMouseCbxMoved(cbxTriglicerides);
    }//GEN-LAST:event_cbxTrigliceridesMouseEntered

    private void cbxTrigliceridesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTrigliceridesMouseExited
        helper.resMouseCbxMoved(cbxTriglicerides);
    }//GEN-LAST:event_cbxTrigliceridesMouseExited

    private void cbxGamaGtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGamaGtMouseEntered
        helper.setMouseCbxMoved(cbxGamaGt);
    }//GEN-LAST:event_cbxGamaGtMouseEntered

    private void cbxGamaGtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGamaGtMouseExited
        helper.resMouseCbxMoved(cbxGamaGt);
    }//GEN-LAST:event_cbxGamaGtMouseExited

    private void cbxBilirrubinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxBilirrubinaMouseEntered
        helper.setMouseCbxMoved(cbxBilirrubina);
    }//GEN-LAST:event_cbxBilirrubinaMouseEntered

    private void cbxBilirrubinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxBilirrubinaMouseExited
        helper.resMouseCbxMoved(cbxBilirrubina);
    }//GEN-LAST:event_cbxBilirrubinaMouseExited

    private void cbxTgoTgpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTgoTgpMouseEntered
        helper.setMouseCbxMoved(cbxTgoTgp);
    }//GEN-LAST:event_cbxTgoTgpMouseEntered

    private void cbxTgoTgpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTgoTgpMouseExited
        helper.resMouseCbxMoved(cbxTgoTgp);
    }//GEN-LAST:event_cbxTgoTgpMouseExited

    private void cbxUrinaRotinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxUrinaRotinaMouseEntered
        helper.setMouseCbxMoved(cbxUrinaRotina);
    }//GEN-LAST:event_cbxUrinaRotinaMouseEntered

    private void cbxUrinaRotinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxUrinaRotinaMouseExited
        helper.resMouseCbxMoved(cbxUrinaRotina);
    }//GEN-LAST:event_cbxUrinaRotinaMouseExited

    private void cbxEpfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxEpfMouseEntered
        helper.setMouseCbxMoved(cbxEpf);
    }//GEN-LAST:event_cbxEpfMouseEntered

    private void cbxEpfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxEpfMouseExited
        helper.resMouseCbxMoved(cbxEpf);
    }//GEN-LAST:event_cbxEpfMouseExited

    private void cbxSangueOcultoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxSangueOcultoMouseEntered
        helper.setMouseCbxMoved(cbxSangueOculto);
    }//GEN-LAST:event_cbxSangueOcultoMouseEntered

    private void cbxSangueOcultoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxSangueOcultoMouseExited
        helper.resMouseCbxMoved(cbxSangueOculto);
    }//GEN-LAST:event_cbxSangueOcultoMouseExited

    private void btnHemoPedSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHemoPedSalvarMouseEntered
        helper.setMouseBtnFormMoved(btnHemoPedSalvar, 1, null);
    }//GEN-LAST:event_btnHemoPedSalvarMouseEntered

    private void btnHemoPedSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHemoPedSalvarMouseExited
        helper.resMouseBtnFormMoved(btnHemoPedSalvar, 1, null);
    }//GEN-LAST:event_btnHemoPedSalvarMouseExited

    private void btnHemoPedCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHemoPedCancelarMouseEntered
        helper.setMouseBtnFormMoved(btnHemoPedCancelar, 2, null);
    }//GEN-LAST:event_btnHemoPedCancelarMouseEntered

    private void btnHemoPedCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHemoPedCancelarMouseExited
        helper.resMouseBtnFormMoved(btnHemoPedCancelar, 2, null);
    }//GEN-LAST:event_btnHemoPedCancelarMouseExited

    private void btnExameDetalheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExameDetalheMouseEntered
        helper.setMouseBtnFormMoved(btnExameDetalhe, 3, "Gerar Relatório");
    }//GEN-LAST:event_btnExameDetalheMouseEntered

    private void btnExameDetalheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExameDetalheMouseExited
        helper.resMouseBtnFormMoved(btnExameDetalhe, 3, "Gerar Relatório");
    }//GEN-LAST:event_btnExameDetalheMouseExited

    private void btnExameEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExameEditMouseEntered
        helper.setMouseBtnFormMoved(btnExameEdit, 1, null);
    }//GEN-LAST:event_btnExameEditMouseEntered

    private void btnExameEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExameEditMouseExited
        helper.resMouseBtnFormMoved(btnExameEdit, 1, null);
    }//GEN-LAST:event_btnExameEditMouseExited

    private void btnExameExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExameExcluirMouseEntered
        helper.setMouseBtnFormMoved(btnExameExcluir, 2, null);
    }//GEN-LAST:event_btnExameExcluirMouseEntered

    private void btnExameExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExameExcluirMouseExited
        helper.resMouseBtnFormMoved(btnExameExcluir, 2, null);
    }//GEN-LAST:event_btnExameExcluirMouseExited

    private void btnClienteDetalheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteDetalheMouseEntered
        helper.setMouseBtnFormMoved(btnClienteDetalhe, 3, "Detalhes");
    }//GEN-LAST:event_btnClienteDetalheMouseEntered

    private void btnClienteDetalheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteDetalheMouseExited
        helper.resMouseBtnFormMoved(btnClienteDetalhe, 3, "Detalhes");
    }//GEN-LAST:event_btnClienteDetalheMouseExited

    private void btnClienteEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteEditMouseEntered
        helper.setMouseBtnFormMoved(btnClienteEdit, 1, null);
    }//GEN-LAST:event_btnClienteEditMouseEntered

    private void btnClienteEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteEditMouseExited
        helper.resMouseBtnFormMoved(btnClienteEdit, 1, null);
    }//GEN-LAST:event_btnClienteEditMouseExited

    private void btnClienteExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteExcluirMouseEntered
        helper.setMouseBtnFormMoved(btnClienteExcluir, 2, null);
    }//GEN-LAST:event_btnClienteExcluirMouseEntered

    private void btnClienteExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteExcluirMouseExited
        helper.resMouseBtnFormMoved(btnClienteExcluir, 2, null);
    }//GEN-LAST:event_btnClienteExcluirMouseExited

    private void btnClienteLimparForMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteLimparForMouseEntered
        helper.setMouseBtnFormMoved(btnClienteLimparFor, 3, "Limpar Formulário");
    }//GEN-LAST:event_btnClienteLimparForMouseEntered

    private void btnClienteLimparForMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteLimparForMouseExited
        helper.resMouseBtnFormMoved(btnClienteLimparFor, 3, "Limpar Formulário");
    }//GEN-LAST:event_btnClienteLimparForMouseExited

    private void btnClienteCadastraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteCadastraMouseEntered
        helper.setMouseBtnFormMoved(btnClienteCadastra, 1, null);
    }//GEN-LAST:event_btnClienteCadastraMouseEntered

    private void btnClienteCadastraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteCadastraMouseExited
        helper.resMouseBtnFormMoved(btnClienteCadastra, 1, null);
    }//GEN-LAST:event_btnClienteCadastraMouseExited

    private void btnExameDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameDetalheActionPerformed
        exameGeraRel.setVisible(true);
    }//GEN-LAST:event_btnExameDetalheActionPerformed

    private void txtExPedCodClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExPedCodClienteFocusLost
        buscaClienteExame();
    }//GEN-LAST:event_txtExPedCodClienteFocusLost

    private void txtCodPedidoResultFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodPedidoResultFocusLost
        buscaPedidoExame();
    }//GEN-LAST:event_txtCodPedidoResultFocusLost
    
    
    
    
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jpnExames;
    private javax.swing.JLabel lblNivelAcesso;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JPanel nav;
    private javax.swing.JRadioButton rbClienteFemi;
    private javax.swing.JRadioButton rbClienteMasc;
    private javax.swing.ButtonGroup rbgSexo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblExame;
    private javax.swing.JTextField txtClienteBairro;
    private javax.swing.JFormattedTextField txtClienteCEP;
    private javax.swing.JFormattedTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteCidade;
    private javax.swing.JFormattedTextField txtClienteDataNasc;
    private javax.swing.JTextField txtClienteEnder;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JFormattedTextField txtClienteRG;
    private javax.swing.JFormattedTextField txtClienteTel;
    private javax.swing.JTextField txtCodClienteResult;
    private javax.swing.JTextField txtCodPedidoResult;
    private javax.swing.JTextField txtConvenioResult;
    private javax.swing.JFormattedTextField txtDataPedidoResult;
    private javax.swing.JTextField txtExPedCodCliente;
    private javax.swing.JTextField txtExPedCodPedido;
    private javax.swing.JTextField txtExPedConvenio;
    private javax.swing.JFormattedTextField txtExPedDataPedido;
    private javax.swing.JTextField txtExPedNome;
    private javax.swing.JTextField txtNomeResult;
    // End of variables declaration//GEN-END:variables
}
