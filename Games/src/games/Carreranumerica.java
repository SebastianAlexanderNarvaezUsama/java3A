package games;

import java.util.Random;
//import java.util.Scanner;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.applet.AudioClip;

/**
 *
 * @author Sebastian Alexander Narvaez Usamá
 */
public class Carreranumerica extends javax.swing.JFrame {
    String Playerstex="",Leveltex="";//Numero de jugadores y nivel de dificultad seleccionados por el usuario
    int Players=0,Level=0;//Numero de jugadores y nivel de dificultad
    int D1,D2;//Dados
    int i,P;//contador de icos y pares 
    AudioClip DadosT=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Dados_Movimiento.wav"));
    AudioClip DadosS=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Dados_Tirar.wav"));
    public Carreranumerica() {
        initComponents();
        setLocationRelativeTo(null);
        inicio();
    }
    public void value(){
    Playerstex="";//Numero de jugadores seleccionado por el usuario
    Leveltex="";//Nivel seleccionado por el usuario
    Players=0;//Numero de jugadores
    Level=0;//nivel de dificultad 
    D1=0;//Dado1
    D2=0;//Dado2
    i=0;//contador de icos
    }
    public void inicio(){
       setIconImage(new ImageIcon(getClass().getResource("/Icons/dados6.png")).getImage());
        jLabelD1.setIcon(new ImageIcon(getClass().getResource("/Icons/DADO_.gif")));
        jLabelD2.setIcon(new ImageIcon(getClass().getResource("/Icons/DADO_.gif")));  
       jButtonROLLDICE.setEnabled(false);
       jButtonSTOP.setEnabled(false);
       jComboBox1.setEnabled(false);  
       jComboBox2.setEnabled(false);  
       jButtonTRYAGAIN.setEnabled(false);
       jLabel6.setText("");
    }
    public void dados(){
        switch (D1) {
            case 1:
                jLabelD1.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-1.png.png")));
                break;
            case 2:
                jLabelD1.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-2.png.png")));
                break;
            case 3:
                jLabelD1.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-3.png.png")));
                break;
            case 4:
                jLabelD1.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-4.png.png")));
                break;
            case 5:
                jLabelD1.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-5.png.png")));
                break;
            case 6:
                jLabelD1.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-6.png.png")));
                break;
            default:
                break;
        }
       
        switch (D2) {
            case 1:
                jLabelD2.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-1.png.png")));
                break;
            case 2:
                jLabelD2.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-2.png.png")));    
                break;
            case 3:
                jLabelD2.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-3.png.png")));
                break;
            case 4:
                jLabelD2.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-4.png.png")));
                break;
            case 5:
                jLabelD2.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-5.png.png")));
                break;
            case 6:
                jLabelD2.setIcon(new ImageIcon(getClass().getResource("/Icons/dados-6.png.png")));
                break;
            default:
                break;
        }
        if(D1==D2){
            P++;
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelD2 = new javax.swing.JLabel();
        jLabelD1 = new javax.swing.JLabel();
        jButtonPLAY = new javax.swing.JButton();
        jButtonROLLDICE = new javax.swing.JButton();
        jButtonSTOP = new javax.swing.JButton();
        jButtonTRYAGAIN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelTitulo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNumeroJugador = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelNumeroJugador1 = new javax.swing.JLabel();
        jLabelNumeroJugador2 = new javax.swing.JLabel();
        jLabelNumeroJugador3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelTitulo3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number race");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(9, 0, 88));

        jLabelTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo1.setText("NUMBER RACE");

        jPanel2.setBackground(new java.awt.Color(9, 0, 88));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Dices", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabelD2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelD2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelD2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dados.gif"))); // NOI18N
        jLabelD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabelD1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelD1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dados.gif"))); // NOI18N
        jLabelD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButtonPLAY.setBackground(new java.awt.Color(102, 102, 255));
        jButtonPLAY.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonPLAY.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPLAY.setText("PLAY");
        jButtonPLAY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonPLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPLAYActionPerformed(evt);
            }
        });

        jButtonROLLDICE.setBackground(new java.awt.Color(102, 102, 255));
        jButtonROLLDICE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonROLLDICE.setForeground(new java.awt.Color(255, 255, 255));
        jButtonROLLDICE.setText("ROLL DICE");
        jButtonROLLDICE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonROLLDICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonROLLDICEActionPerformed(evt);
            }
        });

        jButtonSTOP.setBackground(new java.awt.Color(102, 102, 255));
        jButtonSTOP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonSTOP.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSTOP.setText(" STOP");
        jButtonSTOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonSTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSTOPActionPerformed(evt);
            }
        });

        jButtonTRYAGAIN.setBackground(new java.awt.Color(102, 102, 255));
        jButtonTRYAGAIN.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonTRYAGAIN.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTRYAGAIN.setText("TRY AGAIN?");
        jButtonTRYAGAIN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonTRYAGAIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTRYAGAINActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.setMaximumSize(new java.awt.Dimension(102, 102));
        jLabel6.setMinimumSize(new java.awt.Dimension(102, 102));
        jLabel6.setPreferredSize(new java.awt.Dimension(102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonPLAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTRYAGAIN))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelD1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelD2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSTOP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonROLLDICE, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelD1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelD2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonROLLDICE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSTOP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTRYAGAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.setBackground(new java.awt.Color(0, 0, 102));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1.setName(""); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelTitulo2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setText("Number of players:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Turn player: ");

        jLabelNumeroJugador.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNumeroJugador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroJugador.setText("#");

        jPanel3.setBackground(new java.awt.Color(9, 0, 88));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Scores", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Points: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Missing:");

        jLabelNumeroJugador1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNumeroJugador1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroJugador1.setText("#");

        jLabelNumeroJugador2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNumeroJugador2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroJugador2.setText("#");

        jLabelNumeroJugador3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNumeroJugador3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroJugador3.setText("#");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumeroJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNumeroJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNumeroJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroJugador3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(9, 0, 88));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Pairs", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("#");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/iconmel.png"))); // NOI18N

        jLabelTitulo3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo3.setText("Level:");

        jComboBox2.setBackground(new java.awt.Color(0, 0, 102));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic[50]", "Intermediato[100]", "Advanced[150]" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox2.setName(""); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(568, 568, 568)
                .addComponent(jButton1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitulo2)
                        .addGap(4, 4, 4)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelTitulo3)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabelNumeroJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel7)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addGap(8, 8, 8)
                .addComponent(jLabelTitulo1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo3)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelNumeroJugador))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonROLLDICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonROLLDICEActionPerformed
     jLabelD1.setIcon(new ImageIcon(getClass().getResource("/Icons/DADO3DV2.0.gif")));
     jLabelD2.setIcon(new ImageIcon(getClass().getResource("/Icons/DADO3DV2.0.gif")));
     jButtonSTOP.setEnabled(true);
     jButtonROLLDICE.setEnabled(false);
     jButtonPLAY.setEnabled(false);
     DadosT.loop();  
    }//GEN-LAST:event_jButtonROLLDICEActionPerformed

    private void jButtonSTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSTOPActionPerformed
        Random n=new Random();
        D1=(int)(n.nextDouble()*6+1);
        D2=(int)(n.nextDouble()*6+1);        
        dados();       
        jLabel6.setText(Integer.toString(D1+D2));
        jButtonROLLDICE.setEnabled(true);
        jButtonSTOP.setEnabled(false);
        DadosT.stop();  
        DadosS.play();         
    }//GEN-LAST:event_jButtonSTOPActionPerformed

    private void jButtonTRYAGAINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTRYAGAINActionPerformed
     jButtonTRYAGAIN.setEnabled(false);
     inicio();
     jButtonPLAY.setEnabled(true);  
     
    }//GEN-LAST:event_jButtonTRYAGAINActionPerformed

    private void jButtonPLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPLAYActionPerformed
       value();
       jComboBox1.setEnabled(true);
       jComboBox2.setEnabled(true);  
       jButtonTRYAGAIN.setEnabled(true);    
    }//GEN-LAST:event_jButtonPLAYActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Playerstex = jComboBox1.getSelectedItem().toString();
        Players = Integer.parseInt(Playerstex);
       System.out.println(Players);
        jComboBox1.setEnabled(false);
        if(Players!=0&&Level>=50){
        jButtonROLLDICE.setEnabled(true);
        } 
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        Leveltex = jComboBox2.getSelectedItem().toString();         
        jComboBox2.setEnabled(false); 
        switch (Leveltex){
        case "Basic[50]":Level=50;break;
        case "Intermediato[100]":Level=100;break;
        case "Advanced[150]":Level=150;break; }
        System.out.println(Level);
        if(Players!=0&&Level>=50){
        jButtonROLLDICE.setEnabled(true);
        } 
    }//GEN-LAST:event_jComboBox2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carreranumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carreranumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carreranumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carreranumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carreranumerica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPLAY;
    private javax.swing.JButton jButtonROLLDICE;
    private javax.swing.JButton jButtonSTOP;
    private javax.swing.JButton jButtonTRYAGAIN;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelD1;
    private javax.swing.JLabel jLabelD2;
    private javax.swing.JLabel jLabelNumeroJugador;
    private javax.swing.JLabel jLabelNumeroJugador1;
    private javax.swing.JLabel jLabelNumeroJugador2;
    private javax.swing.JLabel jLabelNumeroJugador3;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelTitulo3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
