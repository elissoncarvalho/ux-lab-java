
package fronteira;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import entidade.VerifExaRult;

public class Hemograma extends javax.swing.JFrame {
    
    
    VerifExaRult    verifExaRult    = new VerifExaRult();

    public Hemograma() {
        initComponents();
        
        //Icone do Sistema
        URL url = this.getClass().getResource("/imgIcons/icon.png");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
        // Posicionamento do Frame
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtConvenio18 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtConvenio19 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtConvenio20 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtConvenio21 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtConvenio23 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtConvenio24 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtConvenio25 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtConvenio22 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtConvenio32 = new javax.swing.JTextField();
        txtConvenio26 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtConvenio31 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtConvenio29 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        txtConvenio34 = new javax.swing.JTextField();
        txtConvenio35 = new javax.swing.JTextField();
        txtConvenio36 = new javax.swing.JTextField();
        txtConvenio37 = new javax.swing.JTextField();
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
        txtConvenio42 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtConvenio43 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtConvenio44 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtConvenio45 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtConvenio46 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtConvenio47 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtConvenio48 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtConvenio49 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hemograma");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 59, 77), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(61, 186, 244));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel3.setBackground(new java.awt.Color(240, 249, 253));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 247, 253));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hemograma");
        jPanel6.add(jLabel3, new java.awt.GridBagConstraints());

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 520, 40));

        jPanel1.setBackground(new java.awt.Color(240, 249, 253));

        txtConvenio18.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio18.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio18.setToolTipText("");
        txtConvenio18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio18.setName(""); // NOI18N
        txtConvenio18.setOpaque(false);
        txtConvenio18.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(11, 19, 25));
        jLabel45.setText("Hemácias");

        txtConvenio19.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio19.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio19.setToolTipText("");
        txtConvenio19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio19.setName(""); // NOI18N
        txtConvenio19.setOpaque(false);
        txtConvenio19.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(11, 19, 25));
        jLabel46.setText("Hemoglobina");

        txtConvenio20.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio20.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio20.setToolTipText("");
        txtConvenio20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio20.setName(""); // NOI18N
        txtConvenio20.setOpaque(false);
        txtConvenio20.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(11, 19, 25));
        jLabel47.setText("VCM");

        txtConvenio21.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio21.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio21.setToolTipText("");
        txtConvenio21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio21.setName(""); // NOI18N
        txtConvenio21.setOpaque(false);
        txtConvenio21.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(11, 19, 25));
        jLabel48.setText("Hematócrito");

        txtConvenio23.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio23.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio23.setToolTipText("");
        txtConvenio23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio23.setName(""); // NOI18N
        txtConvenio23.setOpaque(false);
        txtConvenio23.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(11, 19, 25));
        jLabel50.setText("RDW");

        txtConvenio24.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio24.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio24.setToolTipText("");
        txtConvenio24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio24.setName(""); // NOI18N
        txtConvenio24.setOpaque(false);
        txtConvenio24.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(11, 19, 25));
        jLabel51.setText("HCM");

        txtConvenio25.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio25.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio25.setToolTipText("");
        txtConvenio25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio25.setName(""); // NOI18N
        txtConvenio25.setOpaque(false);
        txtConvenio25.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(11, 19, 25));
        jLabel52.setText("CHCM");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(11, 19, 25));
        jLabel49.setText("Leucócitos");

        txtConvenio22.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio22.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio22.setToolTipText("");
        txtConvenio22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio22.setName(""); // NOI18N
        txtConvenio22.setOpaque(false);
        txtConvenio22.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(11, 19, 25));
        jLabel54.setText("Neutrófilos");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(11, 19, 25));
        jLabel55.setText("Eosinófilos");

        txtConvenio32.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio32.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio32.setToolTipText("");
        txtConvenio32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio32.setName(""); // NOI18N
        txtConvenio32.setOpaque(false);
        txtConvenio32.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtConvenio26.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio26.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio26.setToolTipText("");
        txtConvenio26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio26.setName(""); // NOI18N
        txtConvenio26.setOpaque(false);
        txtConvenio26.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(11, 19, 25));
        jLabel56.setText("Segmentados");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(11, 19, 25));
        jLabel58.setText("Bastonetes");

        txtConvenio31.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio31.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio31.setToolTipText("");
        txtConvenio31.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio31.setName(""); // NOI18N
        txtConvenio31.setOpaque(false);
        txtConvenio31.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(11, 19, 25));
        jLabel60.setText("Basófilos");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(11, 19, 25));
        jLabel57.setText("Monócitos");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(11, 19, 25));
        jLabel59.setText("Linfócitos");

        txtConvenio29.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio29.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio29.setToolTipText("");
        txtConvenio29.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio29.setName(""); // NOI18N
        txtConvenio29.setOpaque(false);
        txtConvenio29.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(11, 19, 25));
        jLabel53.setText("Contagem de plaquetas");

        btnSalvar.setBackground(new java.awt.Color(40, 124, 162));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
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

        btnCancelar.setBackground(new java.awt.Color(190, 75, 73));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
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

        txtConvenio34.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio34.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio34.setToolTipText("");
        txtConvenio34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio34.setName(""); // NOI18N
        txtConvenio34.setOpaque(false);
        txtConvenio34.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtConvenio35.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio35.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio35.setToolTipText("");
        txtConvenio35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio35.setName(""); // NOI18N
        txtConvenio35.setOpaque(false);
        txtConvenio35.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtConvenio36.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio36.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio36.setToolTipText("");
        txtConvenio36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio36.setName(""); // NOI18N
        txtConvenio36.setOpaque(false);
        txtConvenio36.setSelectionColor(new java.awt.Color(35, 59, 77));

        txtConvenio37.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio37.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio37.setToolTipText("");
        txtConvenio37.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio37.setName(""); // NOI18N
        txtConvenio37.setOpaque(false);
        txtConvenio37.setSelectionColor(new java.awt.Color(35, 59, 77));

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

        txtConvenio42.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio42.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio42.setToolTipText("");
        txtConvenio42.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio42.setName(""); // NOI18N
        txtConvenio42.setOpaque(false);
        txtConvenio42.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel26.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(11, 19, 25));
        jLabel26.setText("%");

        txtConvenio43.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio43.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio43.setToolTipText("");
        txtConvenio43.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio43.setName(""); // NOI18N
        txtConvenio43.setOpaque(false);
        txtConvenio43.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel27.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(11, 19, 25));
        jLabel27.setText("/mm³");

        txtConvenio44.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio44.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio44.setToolTipText("");
        txtConvenio44.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio44.setName(""); // NOI18N
        txtConvenio44.setOpaque(false);
        txtConvenio44.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel28.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(11, 19, 25));
        jLabel28.setText("%");

        txtConvenio45.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio45.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio45.setToolTipText("");
        txtConvenio45.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio45.setName(""); // NOI18N
        txtConvenio45.setOpaque(false);
        txtConvenio45.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel29.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(11, 19, 25));
        jLabel29.setText("/mm³");

        txtConvenio46.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio46.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio46.setToolTipText("");
        txtConvenio46.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio46.setName(""); // NOI18N
        txtConvenio46.setOpaque(false);
        txtConvenio46.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel30.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(11, 19, 25));
        jLabel30.setText("%");

        txtConvenio47.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio47.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio47.setToolTipText("");
        txtConvenio47.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio47.setName(""); // NOI18N
        txtConvenio47.setOpaque(false);
        txtConvenio47.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel31.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(11, 19, 25));
        jLabel31.setText("/mm³");

        txtConvenio48.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio48.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio48.setToolTipText("");
        txtConvenio48.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio48.setName(""); // NOI18N
        txtConvenio48.setOpaque(false);
        txtConvenio48.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel32.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(11, 19, 25));
        jLabel32.setText("%");

        txtConvenio49.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConvenio49.setForeground(new java.awt.Color(11, 19, 25));
        txtConvenio49.setToolTipText("");
        txtConvenio49.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 59, 77)));
        txtConvenio49.setName(""); // NOI18N
        txtConvenio49.setOpaque(false);
        txtConvenio49.setSelectionColor(new java.awt.Color(35, 59, 77));

        jLabel33.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(11, 19, 25));
        jLabel33.setText("/mm³");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
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
                                    .addComponent(txtConvenio19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtConvenio18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel45))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtConvenio22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConvenio34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtConvenio31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConvenio35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtConvenio42, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConvenio43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtConvenio44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConvenio45, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtConvenio26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtConvenio36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel58)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtConvenio32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtConvenio37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtConvenio46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtConvenio47, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel57)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtConvenio48, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtConvenio49, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtConvenio29, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(txtConvenio23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtConvenio25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtConvenio24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtConvenio20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtConvenio21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(txtConvenio22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtConvenio34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel18)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConvenio18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel54))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtConvenio19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConvenio35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtConvenio31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel48))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConvenio21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtConvenio26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtConvenio36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel58))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConvenio20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtConvenio32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtConvenio37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConvenio24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtConvenio43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConvenio42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)))
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConvenio25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtConvenio45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConvenio44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)))
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConvenio23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtConvenio47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConvenio46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)))
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConvenio49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConvenio48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConvenio29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 40, 520, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 522, 595));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Faz a validação dos campos, se foram preenchidos corretamente 
    private void hemogramaVerificaSalvar()
    {
        if(1/*CONDICAO VERDADE AQUI*/ == 1)
        {   
            verifExaRult.setStatusHemograma(true);
            //principal.verificaStatus();
        }
        else
        {
            verifExaRult.setStatusHemograma(!true);
           // principal.verificaStatus();
        }
        this.setVisible(false);
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        hemogramaVerificaSalvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


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
            java.util.logging.Logger.getLogger(Hemograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hemograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hemograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hemograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hemograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnSalvar;
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
    private javax.swing.JTextField txtConvenio18;
    private javax.swing.JTextField txtConvenio19;
    private javax.swing.JTextField txtConvenio20;
    private javax.swing.JTextField txtConvenio21;
    private javax.swing.JTextField txtConvenio22;
    private javax.swing.JTextField txtConvenio23;
    private javax.swing.JTextField txtConvenio24;
    private javax.swing.JTextField txtConvenio25;
    private javax.swing.JTextField txtConvenio26;
    private javax.swing.JTextField txtConvenio29;
    private javax.swing.JTextField txtConvenio31;
    private javax.swing.JTextField txtConvenio32;
    private javax.swing.JTextField txtConvenio34;
    private javax.swing.JTextField txtConvenio35;
    private javax.swing.JTextField txtConvenio36;
    private javax.swing.JTextField txtConvenio37;
    private javax.swing.JTextField txtConvenio42;
    private javax.swing.JTextField txtConvenio43;
    private javax.swing.JTextField txtConvenio44;
    private javax.swing.JTextField txtConvenio45;
    private javax.swing.JTextField txtConvenio46;
    private javax.swing.JTextField txtConvenio47;
    private javax.swing.JTextField txtConvenio48;
    private javax.swing.JTextField txtConvenio49;
    // End of variables declaration//GEN-END:variables
}
