package fronteira;

import entidade.Helper;
import entidade.Hemograma;
import entidade.Pedido;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.HemogramaDAO;

/**
 *
 * @author Elisson
 */
public final class ExameHemograma extends javax.swing.JFrame {
    
    Helper helper = new Helper();
    
    private int idExame;
    
    public ExameHemograma(int h) {
        initComponents();
        formConfig();
        listarExame(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contMasq = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtHemacias = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtHemoglobina = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtVcm = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtHematocrito = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtRdw = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtHcm = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtChcm = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtLeucocitos = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtBastonetes = new javax.swing.JTextField();
        txtSegmentados = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtNeutrofilos = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtContagemPlaquetas = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtLeucocitos1 = new javax.swing.JTextField();
        txtNeutrofilos1 = new javax.swing.JTextField();
        txtSegmentados1 = new javax.swing.JTextField();
        txtBastonetes1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtEosinofilos = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtEosinofilos1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtBasofilos = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtBasofilos1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtLinfocitos = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtLinfocitos1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtMonocitos = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtMonocitos1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hemograma");
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
        jLabel3.setText("Hemograma");
        jPanel6.add(jLabel3, new java.awt.GridBagConstraints());

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 520, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtHemacias.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtHemacias.setForeground(new java.awt.Color(11, 19, 25));
        txtHemacias.setToolTipText("");
        txtHemacias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtHemacias.setName(""); // NOI18N
        txtHemacias.setOpaque(false);
        txtHemacias.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(11, 19, 25));
        jLabel45.setText("Hemácias");

        txtHemoglobina.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtHemoglobina.setForeground(new java.awt.Color(11, 19, 25));
        txtHemoglobina.setToolTipText("");
        txtHemoglobina.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtHemoglobina.setName(""); // NOI18N
        txtHemoglobina.setOpaque(false);
        txtHemoglobina.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(11, 19, 25));
        jLabel46.setText("Hemoglobina");

        txtVcm.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtVcm.setForeground(new java.awt.Color(11, 19, 25));
        txtVcm.setToolTipText("");
        txtVcm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtVcm.setName(""); // NOI18N
        txtVcm.setOpaque(false);
        txtVcm.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(11, 19, 25));
        jLabel47.setText("VCM");

        txtHematocrito.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtHematocrito.setForeground(new java.awt.Color(11, 19, 25));
        txtHematocrito.setToolTipText("");
        txtHematocrito.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtHematocrito.setName(""); // NOI18N
        txtHematocrito.setOpaque(false);
        txtHematocrito.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(11, 19, 25));
        jLabel48.setText("Hematócrito");

        txtRdw.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtRdw.setForeground(new java.awt.Color(11, 19, 25));
        txtRdw.setToolTipText("");
        txtRdw.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtRdw.setName(""); // NOI18N
        txtRdw.setOpaque(false);
        txtRdw.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(11, 19, 25));
        jLabel50.setText("RDW");

        txtHcm.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtHcm.setForeground(new java.awt.Color(11, 19, 25));
        txtHcm.setToolTipText("");
        txtHcm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtHcm.setName(""); // NOI18N
        txtHcm.setOpaque(false);
        txtHcm.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(11, 19, 25));
        jLabel51.setText("HCM");

        txtChcm.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtChcm.setForeground(new java.awt.Color(11, 19, 25));
        txtChcm.setToolTipText("");
        txtChcm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtChcm.setName(""); // NOI18N
        txtChcm.setOpaque(false);
        txtChcm.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(11, 19, 25));
        jLabel52.setText("CHCM");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(11, 19, 25));
        jLabel49.setText("Leucócitos");

        txtLeucocitos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLeucocitos.setForeground(new java.awt.Color(11, 19, 25));
        txtLeucocitos.setToolTipText("");
        txtLeucocitos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtLeucocitos.setName(""); // NOI18N
        txtLeucocitos.setOpaque(false);
        txtLeucocitos.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(11, 19, 25));
        jLabel54.setText("Neutrófilos");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(11, 19, 25));
        jLabel55.setText("Eosinófilos");

        txtBastonetes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtBastonetes.setForeground(new java.awt.Color(11, 19, 25));
        txtBastonetes.setToolTipText("");
        txtBastonetes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtBastonetes.setName(""); // NOI18N
        txtBastonetes.setOpaque(false);
        txtBastonetes.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtSegmentados.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSegmentados.setForeground(new java.awt.Color(11, 19, 25));
        txtSegmentados.setToolTipText("");
        txtSegmentados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtSegmentados.setName(""); // NOI18N
        txtSegmentados.setOpaque(false);
        txtSegmentados.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(11, 19, 25));
        jLabel56.setText("Segmentados");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(11, 19, 25));
        jLabel58.setText("Bastonetes");

        txtNeutrofilos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNeutrofilos.setForeground(new java.awt.Color(11, 19, 25));
        txtNeutrofilos.setToolTipText("");
        txtNeutrofilos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtNeutrofilos.setName(""); // NOI18N
        txtNeutrofilos.setOpaque(false);
        txtNeutrofilos.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(11, 19, 25));
        jLabel60.setText("Basófilos");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(11, 19, 25));
        jLabel57.setText("Monócitos");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(11, 19, 25));
        jLabel59.setText("Linfócitos");

        txtContagemPlaquetas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtContagemPlaquetas.setForeground(new java.awt.Color(11, 19, 25));
        txtContagemPlaquetas.setToolTipText("");
        txtContagemPlaquetas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtContagemPlaquetas.setName(""); // NOI18N
        txtContagemPlaquetas.setOpaque(false);
        txtContagemPlaquetas.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(11, 19, 25));
        jLabel53.setText("Contagem de plaquetas");

        txtLeucocitos1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLeucocitos1.setForeground(new java.awt.Color(11, 19, 25));
        txtLeucocitos1.setToolTipText("");
        txtLeucocitos1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtLeucocitos1.setName(""); // NOI18N
        txtLeucocitos1.setOpaque(false);
        txtLeucocitos1.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtNeutrofilos1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNeutrofilos1.setForeground(new java.awt.Color(11, 19, 25));
        txtNeutrofilos1.setToolTipText("");
        txtNeutrofilos1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtNeutrofilos1.setName(""); // NOI18N
        txtNeutrofilos1.setOpaque(false);
        txtNeutrofilos1.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtSegmentados1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSegmentados1.setForeground(new java.awt.Color(11, 19, 25));
        txtSegmentados1.setToolTipText("");
        txtSegmentados1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtSegmentados1.setName(""); // NOI18N
        txtSegmentados1.setOpaque(false);
        txtSegmentados1.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtBastonetes1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtBastonetes1.setForeground(new java.awt.Color(11, 19, 25));
        txtBastonetes1.setToolTipText("");
        txtBastonetes1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtBastonetes1.setName(""); // NOI18N
        txtBastonetes1.setOpaque(false);
        txtBastonetes1.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 19, 25));
        jLabel1.setText("g/dL");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 19, 25));
        jLabel2.setText("/mm³");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(11, 19, 25));
        jLabel4.setText("g/dL");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(11, 19, 25));
        jLabel5.setText("%");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(11, 19, 25));
        jLabel6.setText("fL");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(11, 19, 25));
        jLabel7.setText("pg");

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(11, 19, 25));
        jLabel8.setText("%");

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(11, 19, 25));
        jLabel9.setText("%");

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(11, 19, 25));
        jLabel10.setText("%");

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(11, 19, 25));
        jLabel11.setText("%");

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(11, 19, 25));
        jLabel12.setText("%");

        jLabel17.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(11, 19, 25));
        jLabel17.setText("milhões/mm³");

        jLabel18.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 19, 25));
        jLabel18.setText("/mm³");

        jLabel19.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(11, 19, 25));
        jLabel19.setText("/mm³");

        jLabel20.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(11, 19, 25));
        jLabel20.setText("/mm³");

        jLabel21.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(11, 19, 25));
        jLabel21.setText("/mm³");

        txtEosinofilos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtEosinofilos.setForeground(new java.awt.Color(11, 19, 25));
        txtEosinofilos.setToolTipText("");
        txtEosinofilos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtEosinofilos.setName(""); // NOI18N
        txtEosinofilos.setOpaque(false);
        txtEosinofilos.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel26.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(11, 19, 25));
        jLabel26.setText("%");

        txtEosinofilos1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtEosinofilos1.setForeground(new java.awt.Color(11, 19, 25));
        txtEosinofilos1.setToolTipText("");
        txtEosinofilos1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtEosinofilos1.setName(""); // NOI18N
        txtEosinofilos1.setOpaque(false);
        txtEosinofilos1.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel27.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(11, 19, 25));
        jLabel27.setText("/mm³");

        txtBasofilos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtBasofilos.setForeground(new java.awt.Color(11, 19, 25));
        txtBasofilos.setToolTipText("");
        txtBasofilos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtBasofilos.setName(""); // NOI18N
        txtBasofilos.setOpaque(false);
        txtBasofilos.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel28.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(11, 19, 25));
        jLabel28.setText("%");

        txtBasofilos1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtBasofilos1.setForeground(new java.awt.Color(11, 19, 25));
        txtBasofilos1.setToolTipText("");
        txtBasofilos1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtBasofilos1.setName(""); // NOI18N
        txtBasofilos1.setOpaque(false);
        txtBasofilos1.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel29.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(11, 19, 25));
        jLabel29.setText("/mm³");

        txtLinfocitos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLinfocitos.setForeground(new java.awt.Color(11, 19, 25));
        txtLinfocitos.setToolTipText("");
        txtLinfocitos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtLinfocitos.setName(""); // NOI18N
        txtLinfocitos.setOpaque(false);
        txtLinfocitos.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel30.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(11, 19, 25));
        jLabel30.setText("%");

        txtLinfocitos1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLinfocitos1.setForeground(new java.awt.Color(11, 19, 25));
        txtLinfocitos1.setToolTipText("");
        txtLinfocitos1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtLinfocitos1.setName(""); // NOI18N
        txtLinfocitos1.setOpaque(false);
        txtLinfocitos1.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel31.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(11, 19, 25));
        jLabel31.setText("/mm³");

        txtMonocitos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtMonocitos.setForeground(new java.awt.Color(11, 19, 25));
        txtMonocitos.setToolTipText("");
        txtMonocitos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtMonocitos.setName(""); // NOI18N
        txtMonocitos.setOpaque(false);
        txtMonocitos.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel32.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(11, 19, 25));
        jLabel32.setText("%");

        txtMonocitos1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtMonocitos1.setForeground(new java.awt.Color(11, 19, 25));
        txtMonocitos1.setToolTipText("");
        txtMonocitos1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtMonocitos1.setName(""); // NOI18N
        txtMonocitos1.setOpaque(false);
        txtMonocitos1.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel33.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(11, 19, 25));
        jLabel33.setText("/mm³");

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
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtHemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtHemacias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel45))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtLeucocitos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLeucocitos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtNeutrofilos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNeutrofilos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtEosinofilos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEosinofilos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtBasofilos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBasofilos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSegmentados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSegmentados1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel58)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBastonetes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBastonetes1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtLinfocitos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLinfocitos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel57)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtMonocitos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMonocitos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtContagemPlaquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel51)
                                .addComponent(jLabel52)
                                .addComponent(jLabel50)
                                .addComponent(jLabel48)
                                .addComponent(jLabel47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtRdw, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtChcm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtHcm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtVcm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtHematocrito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel49))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLeucocitos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLeucocitos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel18)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHemacias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel54))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNeutrofilos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNeutrofilos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel48))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHematocrito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtSegmentados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtSegmentados1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel58))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVcm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtBastonetes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtBastonetes1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHcm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtEosinofilos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEosinofilos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)))
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChcm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtBasofilos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBasofilos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)))
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRdw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtLinfocitos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLinfocitos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)))
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonocitos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonocitos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContagemPlaquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)))
                .addGap(25, 25, 25))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 40, 500, 550));

        javax.swing.GroupLayout contMasqLayout = new javax.swing.GroupLayout(contMasq);
        contMasq.setLayout(contMasqLayout);
        contMasqLayout.setHorizontalGroup(
            contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
            .addGroup(contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contMasqLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        contMasqLayout.setVerticalGroup(
            contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(contMasqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contMasqLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(contMasq, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void listarExame(int h){
        List<Hemograma> listaExame;
        
        HemogramaDAO hemogramaDAO = new HemogramaDAO();
        listaExame = hemogramaDAO.listarHemo(h);
        if(listaExame.isEmpty()){
            JOptionPane.showMessageDialog(this, "Exame não encontrado.");
        }else{
            idExame = h;
            txtHemacias.setText(String.valueOf(listaExame.get(0).getHemacias()));
            txtHemoglobina.setText(String.valueOf(listaExame.get(0).getHemoglobina()));
            txtHematocrito.setText(String.valueOf(listaExame.get(0).getHematocrito()));
            txtVcm.setText(String.valueOf(listaExame.get(0).getVcm()));
            txtHcm.setText(String.valueOf(listaExame.get(0).getHcm()));
            txtChcm.setText(String.valueOf(listaExame.get(0).getChcm()));
            txtRdw.setText(String.valueOf(listaExame.get(0).getRdw()));
            txtLeucocitos.setText(String.valueOf(listaExame.get(0).getLeucocitos()));
            txtLeucocitos1.setText(String.valueOf(listaExame.get(0).getLeucocitos1()));
            txtNeutrofilos.setText(String.valueOf(listaExame.get(0).getNeutrofilos()));
            txtNeutrofilos1.setText(String.valueOf(listaExame.get(0).getNeutrofilos1()));
            txtSegmentados.setText(String.valueOf(listaExame.get(0).getSegmentados()));
            txtSegmentados1.setText(String.valueOf(listaExame.get(0).getSegmentados1()));
            txtBastonetes.setText(String.valueOf(listaExame.get(0).getBastonetes()));
            txtBastonetes1.setText(String.valueOf(listaExame.get(0).getBastonetes1()));
            txtEosinofilos.setText(String.valueOf(listaExame.get(0).getEosinofilos()));
            txtEosinofilos1.setText(String.valueOf(listaExame.get(0).getEosinofilos1()));
            txtBasofilos.setText(String.valueOf(listaExame.get(0).getBasofilos()));
            txtBasofilos1.setText(String.valueOf(listaExame.get(0).getBasofilos1()));
            txtLinfocitos.setText(String.valueOf(listaExame.get(0).getLinfocitos()));
            txtLinfocitos1.setText(String.valueOf(listaExame.get(0).getLinfocitos1()));
            txtMonocitos.setText(String.valueOf(listaExame.get(0).getMonocitos()));
            txtMonocitos1.setText(String.valueOf(listaExame.get(0).getMonocitos1()));
            txtContagemPlaquetas.setText(String.valueOf(listaExame.get(0).getContagemPlaquetas()));
        }
    }
    private void salvaExame(){
        Hemograma hemograma = new Hemograma();
        hemograma.setCodigoH(idExame);
        hemograma.setHemacias(Double.valueOf(txtHemacias.getText().trim()));
        hemograma.setHemoglobina(Double.valueOf(txtHemoglobina.getText().trim()));
        hemograma.setHematocrito(Double.valueOf(txtHematocrito.getText().trim()));
        hemograma.setVcm(Double.valueOf(txtVcm.getText().trim()));
        hemograma.setHcm(Double.valueOf(txtHcm.getText().trim()));
        hemograma.setChcm(Double.valueOf(txtChcm.getText().trim()));
        hemograma.setRdw(Double.valueOf(txtRdw.getText().trim()));
        hemograma.setLeucocitos(Double.valueOf(txtLeucocitos.getText().trim()));
        hemograma.setLeucocitos1(Double.valueOf(txtLeucocitos1.getText().trim()));
        hemograma.setNeutrofilos(Double.valueOf(txtNeutrofilos.getText().trim()));
        hemograma.setNeutrofilos1(Double.valueOf(txtNeutrofilos1.getText().trim()));
        hemograma.setSegmentados(Double.valueOf(txtSegmentados.getText().trim()));
        hemograma.setSegmentados1(Double.valueOf(txtSegmentados1.getText().trim()));
        hemograma.setBastonetes(Double.valueOf(txtBastonetes.getText().trim()));
        hemograma.setBastonetes1(Double.valueOf(txtBastonetes1.getText().trim()));
        hemograma.setEosinofilos(Double.valueOf(txtEosinofilos.getText().trim()));
        hemograma.setEosinofilos1(Double.valueOf(txtEosinofilos1.getText().trim()));
        hemograma.setBasofilos(Double.valueOf(txtBasofilos.getText().trim()));
        hemograma.setBasofilos1(Double.valueOf(txtBasofilos1.getText().trim()));
        hemograma.setLinfocitos(Double.valueOf(txtLinfocitos.getText().trim()));
        hemograma.setLinfocitos1(Double.valueOf(txtLinfocitos1.getText().trim()));
        hemograma.setMonocitos(Double.valueOf(txtMonocitos.getText().trim()));
        hemograma.setMonocitos1(Double.valueOf(txtMonocitos1.getText().trim()));
        hemograma.setContagemPlaquetas(Double.valueOf(txtContagemPlaquetas.getText().trim()));
        
        HemogramaDAO hemogramaDAO = new HemogramaDAO();
        if(hemogramaDAO.salvarHemo(hemograma)){
            JOptionPane.showMessageDialog(this, "Exame Salvo com Sucesso!");
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Falha ao salvar o Exame");
        }
    }
    // Faz a validação dos campos, se foram preenchidos corretamente 
    private void  verificaSalvar(){
        Pedido pedido = new Pedido();
        if(1/*CONDICAO VERDADE AQUI*/ == 1)
        {   
            pedido.setStatusHemograma(true);
            //principal.verificaStatus();
        }
        else
        {
            pedido.setStatusHemograma(!true);
           // principal.verificaStatus();
        }
        this.setVisible(false);
    }    
    private void formConfig(){
        //Icone do Sistema
        URL url = this.getClass().getResource("/imgIcons/icon.png");  
        Image iconeTitulo;
        iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        
        this.setBackground(new Color(255,255,255,150));
        
        // Posicionamento do Frame
        setLocationRelativeTo(null);
    }
    
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
        salvaExame();
    }//GEN-LAST:event_btnSalvarActionPerformed
    
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
            java.util.logging.Logger.getLogger(ExameHemograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExameHemograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExameHemograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExameHemograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExameHemograma(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JPanel contMasq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtBasofilos;
    private javax.swing.JTextField txtBasofilos1;
    private javax.swing.JTextField txtBastonetes;
    private javax.swing.JTextField txtBastonetes1;
    private javax.swing.JTextField txtChcm;
    private javax.swing.JTextField txtContagemPlaquetas;
    private javax.swing.JTextField txtEosinofilos;
    private javax.swing.JTextField txtEosinofilos1;
    private javax.swing.JTextField txtHcm;
    private javax.swing.JTextField txtHemacias;
    private javax.swing.JTextField txtHematocrito;
    private javax.swing.JTextField txtHemoglobina;
    private javax.swing.JTextField txtLeucocitos;
    private javax.swing.JTextField txtLeucocitos1;
    private javax.swing.JTextField txtLinfocitos;
    private javax.swing.JTextField txtLinfocitos1;
    private javax.swing.JTextField txtMonocitos;
    private javax.swing.JTextField txtMonocitos1;
    private javax.swing.JTextField txtNeutrofilos;
    private javax.swing.JTextField txtNeutrofilos1;
    private javax.swing.JTextField txtRdw;
    private javax.swing.JTextField txtSegmentados;
    private javax.swing.JTextField txtSegmentados1;
    private javax.swing.JTextField txtVcm;
    // End of variables declaration//GEN-END:variables
}
