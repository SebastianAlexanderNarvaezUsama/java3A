/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spinning_top;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Asus
 */
public class Tablero extends javax.swing.JFrame {
     //int turn=1;//variable turnos
     //int coinsp1=5,coinsp2=5,coinsp3=5,coinsp4=5;
     int Piri=0,Coins=0,P1,P2,P3,P4,Players=4,x,bank=0;
     int a=0;
    /**
     * Creates new form Tablero
     */

    public Tablero() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Icons/logo fin.png")).getImage()); 
        Coins=Integer.parseInt(ConfigZone.jComboBox1.getSelectedItem().toString());
        P1=Coins;
        P2=Coins;
        P3=Coins;
        P4=Coins;
        JLabelP1.setText(Integer.toString(P1)); 
        JLabelP2.setText(Integer.toString(P2)); 
        JLabelP3.setText(Integer.toString(P3)); 
        JLabelP4.setText(Integer.toString(P4)); 
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JLabelP2 = new javax.swing.JLabel();
        JLabelBank = new javax.swing.JLabel();
        JLabelP1 = new javax.swing.JLabel();
        JLabelTurnP = new javax.swing.JLabel();
        JLabelP4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        JLabelP3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonStop = new javax.swing.JButton();
        JLabelPiri = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Spinning Top - Tablero");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(829, 537));
        jPanel2.setLayout(null);

        JLabelP2.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        JLabelP2.setForeground(new java.awt.Color(70, 71, 62));
        JLabelP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelP2.setText("#");
        jPanel2.add(JLabelP2);
        JLabelP2.setBounds(220, 450, 130, 90);

        JLabelBank.setFont(new java.awt.Font("Old English Text MT", 0, 60)); // NOI18N
        JLabelBank.setForeground(new java.awt.Color(255, 255, 255));
        JLabelBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelBank.setText("0");
        jPanel2.add(JLabelBank);
        JLabelBank.setBounds(320, 30, 130, 120);

        JLabelP1.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        JLabelP1.setForeground(new java.awt.Color(70, 71, 62));
        JLabelP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelP1.setText("#");
        jPanel2.add(JLabelP1);
        JLabelP1.setBounds(30, 450, 130, 90);

        JLabelTurnP.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        JLabelTurnP.setForeground(new java.awt.Color(70, 71, 62));
        JLabelTurnP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelTurnP.setText("#");
        jPanel2.add(JLabelTurnP);
        JLabelTurnP.setBounds(260, 130, 100, 90);

        JLabelP4.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        JLabelP4.setForeground(new java.awt.Color(70, 71, 62));
        JLabelP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelP4.setText("#");
        jPanel2.add(JLabelP4);
        JLabelP4.setBounds(630, 450, 130, 90);

        jLabel19.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(70, 71, 62));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Player's turn:          ");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(80, 110, 270, 130);

        JLabelP3.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        JLabelP3.setForeground(new java.awt.Color(70, 71, 62));
        JLabelP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelP3.setText("#");
        jPanel2.add(JLabelP3);
        JLabelP3.setBounds(450, 450, 130, 90);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("$$$");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(120, 30, 120, 120);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Player 4.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(650, 290, 130, 160);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Player 2.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 290, 130, 160);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bank.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 60, 120, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Player1.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 290, 130, 160);

        jLabel18.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(70, 71, 62));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ACUMULATED");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(110, -30, 270, 130);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("X");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(220, 30, 120, 120);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Player 3.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(470, 290, 130, 160);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Table_piri.gif"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(540, 20, 210, 210);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/playert.png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(620, 450, 150, 80);
        jLabel12.getAccessibleContext().setAccessibleName("jLabel12");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/playert.png"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 450, 150, 80);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/playert.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(210, 450, 150, 80);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/playert.png"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(440, 450, 150, 80);

        jButtonStop.setBackground(new java.awt.Color(212, 175, 55));
        jButtonStop.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        jButtonStop.setText("Stop");
        jButtonStop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonStop);
<<<<<<< HEAD
        jButtonStop.setBounds(540, 220, 200, 40);
=======
        jButtonStop.setBounds(540, 230, 200, 40);
>>>>>>> cbf34a714c5b982b950c4afd11e2264df1cf12aa

        JLabelPiri.setFont(new java.awt.Font("Algerian", 0, 28)); // NOI18N
        JLabelPiri.setForeground(new java.awt.Color(255, 255, 255));
        JLabelPiri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelPiri.setText("???");
        jPanel2.add(JLabelPiri);
        JLabelPiri.setBounds(310, 220, 180, 80);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pos..png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(300, 190, 200, 140);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BancoV.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(830, 160));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 480, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fondo_tablero.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-10, 0, 810, 550);

        jMenuBar1.setBackground(new java.awt.Color(203, 203, 203));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu1.setText("Start");

        jMenu3.setText("Pantalla");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Config Coins");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu1.add(jMenu3);

        jMenu5.setText("Config");

        jMenu6.setText("Songs");

        jMenuItem6.setText("On");
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Off");
        jMenu6.add(jMenuItem7);

        jMenu5.add(jMenu6);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Others");

        jMenu4.setText("Help");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Rules");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Original repository");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenu2.add(jMenu4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("About of");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MenuConfig MenuConfig = new MenuConfig();
        MenuConfig.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop =java.awt.Desktop.getDesktop();

            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://github.com/SebastianAlexanderNarvaezUsama/java3A/tree/master/GameDos/Spinning_Top");
                    desktop.browse(uri);
                }catch(URISyntaxException|IOException ex){}
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Aboutof Aboutof = new Aboutof();
        Aboutof.setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ConfigZone ConfigZone = new ConfigZone();
        ConfigZone.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopActionPerformed

  /*  if(P1>0){
     jLabel4.setIcon(new ImageIcon(getClass().getResource("/Icons/sombraiz.png")));   
     }   
     if(P2>0){
     jLabel5.setIcon(new ImageIcon(getClass().getResource("/Icons/sombraiz.png")));    
     }
     if(P3>0){
     jLabel7.setIcon(new ImageIcon(getClass().getResource("/Icons/sombrader.png")));    
     }
     if(P4>0){
     jLabel3.setIcon(new ImageIcon(getClass().getResource("/Icons/sombrader.png")));    
     }     */  
        if(x<Players){
        x++;      
        Random n=new Random();
        Piri=(int)(n.nextDouble()*6+1);
        switch (Piri) {
            case 1:
                JLabelPiri.setText("Pon 1");
                a=1;
                bank=bank+1;
                switch (x) {
                    case 1:
                        P1=P1-a;
                        break;
                    case 2:
                        P2=P2-a;
                        break;
                    case 3:
                        P3=P3-a;
                        break;
                    case 4:
                        P4=P4-a;                 
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                JLabelPiri.setText("Toma todo");
                a=bank;
                bank=bank-bank;
                switch (x) {
                    case 1:
                        P1=P1+a;
                        break;
                    case 2:
                        P2=P2+a;
                        break;
                    case 3:
                        P3=P3+a;
                        break;
                    case 4:
                        P4=P4+a;                
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                JLabelPiri.setText("Pon 2");
                a=2;
                bank=bank+2;
                switch (x) {
                    case 1:
                        P1=P1-a;
                        break;
                    case 2:
                        P2=P2-a;
                        break;
                    case 3:
                        P3=P3-a;
                        break;
                    case 4:
                        P4=P4-a;                
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                JLabelPiri.setText("Toma 1");
                a=1;
                bank=bank-1;
                switch (x) {
                    case 1:
                        P1=P1+a;
                        break;
                    case 2:
                        P2=P2+a;
                        break;
                    case 3:
                        P3=P3+a;
                        break;
                    case 4:
                        P4=P4+a;                
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                JLabelPiri.setText("Todos ponen");
                a=1;
                bank=bank+4;
                P1=P1-a;
                P2=P2-a;
                P3=P3-a;
                P4=P4-a;
                break;
            case 6:
                JLabelPiri.setText("Toma 2");
                a=2;
                bank=bank-2;
                switch (x) {
                    case 1:
                        P1=P1+a;
                        break;
                    case 2:
                        P2=P2+a;
                        break;
                    case 3:
                        P3=P3+a;
                        break;
                    case 4:
                        P4=P4+a;                
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;   
        }            
        JLabelBank.setText(Integer.toString(bank));
        JLabelTurnP.setText(Integer.toString(x));
        JLabelP1.setText(Integer.toString(P1));
        JLabelP2.setText(Integer.toString(P2));
        JLabelP3.setText(Integer.toString(P3));
        JLabelP4.setText(Integer.toString(P4));
        
        }else{
        x=1;      
        Random n=new Random();
        Piri=(int)(n.nextDouble()*6+1);
        switch (Piri) {
            case 1:
                JLabelPiri.setText("Pon 1");
                a=1;
                bank=bank+1;
                switch (x) {
                    case 1:
                        P1=P1-a;
                        break;
                    case 2:
                        P2=P2-a;
                        break;
                    case 3:
                        P3=P3-a;
                        break;
                    case 4:
                        P4=P4-a;                 
                        break;
                    default:
                        break;
                }
                break;
        //}                                           

            case 2:
                JLabelPiri.setText("Toma todo");
                a=bank;
                bank=bank-bank;
                switch (x) {
                    case 1:
                        P1=P1+a;
                        break;
                    case 2:
                        P2=P2+a;
                        break;
                    case 3:
                        P3=P3+a;
                        break;
                    case 4:
                        P4=P4+a;                
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                JLabelPiri.setText("Pon 2");
                a=2;
                bank=bank+2;
                switch (x) {
                    case 1:
                        P1=P1-a;
                        break;
                    case 2:
                        P2=P2-a;
                        break;
                    case 3:
                        P3=P3-a;
                        break;
                    case 4:
                        P4=P4-a;                
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                JLabelPiri.setText("Toma 1");
                a=1;
                bank=bank-1;
                switch (x) {
                    case 1:
                        P1=P1+a;
                        break;
                    case 2:
                        P2=P2+a;
                        break;
                    case 3:
                        P3=P3+a;
                        break;
                    case 4:
                        P4=P4+a;                
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                JLabelPiri.setText("Todos ponen");
                a=1;
                bank=bank+4;
                P1=P1-a;
                P2=P2-a;
                P3=P3-a;
                P4=P4-a;
                break;
            case 6:
                JLabelPiri.setText("Toma 2");
                a=2;
                bank=bank-2;
                switch (x) {
                    case 1:
                        P1=P1+a;
                        break;
                    case 2:
                        P2=P2+a;
                        break;
                    case 3:
                        P3=P3+a;
                        break;
                    case 4:
                        P4=P4+a;                
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;   
      
            JLabelBank.setText(Integer.toString(bank));
            JLabelTurnP.setText(Integer.toString(x));
            JLabelP1.setText(Integer.toString(P1));
            JLabelP2.setText(Integer.toString(P2));
            JLabelP3.setText(Integer.toString(P3));
            JLabelP4.setText(Integer.toString(P4)); 
        }        
    }
        
        
        
    }//GEN-LAST:event_jButtonStopActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelBank;
    public static javax.swing.JLabel JLabelP1;
    public static javax.swing.JLabel JLabelP2;
    public static javax.swing.JLabel JLabelP3;
    public static javax.swing.JLabel JLabelP4;
    private javax.swing.JLabel JLabelPiri;
<<<<<<< HEAD
    private javax.swing.JLabel JLabelTurnP;
=======
    public static javax.swing.JLabel JLabelTurnP;
>>>>>>> cbf34a714c5b982b950c4afd11e2264df1cf12aa
    private javax.swing.JButton jButtonStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
