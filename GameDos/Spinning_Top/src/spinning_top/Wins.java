/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spinning_top;

/**
 *
 * @author Asus
 */
public class Wins extends javax.swing.JFrame {

    /**
     * Creates new form Wins
     */
    public Wins() {
        initComponents();
        //String f=Tablero.JLabelTurnP.getText();
        //jLabelwinerall.setText("Player "+f+" thanks for playing.");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonTry = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        JLabelBank = new javax.swing.JLabel();
        jLabelplayerwin = new javax.swing.JLabel();
        jLabelwinerall = new javax.swing.JLabel();
        jLabelTCoins = new javax.swing.JLabel();
        jLabelwinerall2 = new javax.swing.JLabel();
        jLabelwinerall3 = new javax.swing.JLabel();
        jLabelTBank = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jButtonTry.setBackground(new java.awt.Color(212, 175, 55));
        jButtonTry.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        jButtonTry.setText("Try again");
        jButtonTry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonTry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTryActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTry);
        jButtonTry.setBounds(270, 220, 120, 30);

        jButtonInicio.setBackground(new java.awt.Color(212, 175, 55));
        jButtonInicio.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        jButtonInicio.setText("Inicio");
        jButtonInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonInicio);
        jButtonInicio.setBounds(150, 220, 110, 30);

        JLabelBank.setFont(new java.awt.Font("Old English Text MT", 0, 60)); // NOI18N
        JLabelBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelBank.setText("Winner");
        jPanel1.add(JLabelBank);
        JLabelBank.setBounds(10, 40, 440, 60);

        jLabelplayerwin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Player1.png"))); // NOI18N
        jPanel1.add(jLabelplayerwin);
        jLabelplayerwin.setBounds(30, 100, 150, 160);

        jLabelwinerall.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        jLabelwinerall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelwinerall.setText("#");
        jPanel1.add(jLabelwinerall);
        jLabelwinerall.setBounds(10, 80, 440, 60);

        jLabelTCoins.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        jLabelTCoins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTCoins.setText("#");
        jPanel1.add(jLabelTCoins);
        jLabelTCoins.setBounds(280, 130, 150, 50);

        jLabelwinerall2.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        jLabelwinerall2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelwinerall2.setText("Total Coins:");
        jPanel1.add(jLabelwinerall2);
        jLabelwinerall2.setBounds(120, 120, 240, 70);

        jLabelwinerall3.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        jLabelwinerall3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelwinerall3.setText("Bank:");
        jPanel1.add(jLabelwinerall3);
        jLabelwinerall3.setBounds(80, 160, 260, 50);

        jLabelTBank.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        jLabelTBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTBank.setText("#");
        jPanel1.add(jLabelTBank);
        jLabelTBank.setBounds(280, 160, 150, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Wins.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 460, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTryActionPerformed
    ConfigZone ConfigZone=new ConfigZone();
    ConfigZone.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButtonTryActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
    MenuConfig MenuConfig=new MenuConfig();
    MenuConfig.setVisible(true);
    this.setVisible(false);  
    }//GEN-LAST:event_jButtonInicioActionPerformed

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
            java.util.logging.Logger.getLogger(Wins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelBank;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonTry;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabelTBank;
    public static javax.swing.JLabel jLabelTCoins;
    public static javax.swing.JLabel jLabelplayerwin;
    public static javax.swing.JLabel jLabelwinerall;
    public static javax.swing.JLabel jLabelwinerall2;
    public static javax.swing.JLabel jLabelwinerall3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
