/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarnombre;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;





/**
 *
 * @author Asus
 */
public class Menu extends javax.swing.JFrame {
String Nombre="",Mayus="",Minus="",Completo=Nombre,letraf="";
 int contador=0,conspa=0,fin=0,buscar=0,i;
 int letrabuscar=0;
 char Letra=' ',letra=Letra,may=' ';
 int letrainicial=0,x=0;
 char Buscarletra [];/**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        jButtonENG.setEnabled(false);
        jButtonMAY.setEnabled(false);  
        jButtonMIN.setEnabled(false);  
        jButtonRESET.setEnabled(false);  
        jButtonSEARCH.setEnabled(false);  
        jButtonSHOW.setEnabled(false);    
        
            /*
jButtonSHOW.setBackground(Color.red);*/
    }
    public void Botones(){
    if (!jTextFieldNombre.getText().isEmpty()){  
      jButtonRESET.setEnabled(true);  
      jButtonSEARCH.setEnabled(true);  
      jButtonSHOW.setEnabled(true);
      jButtonMAY.setEnabled(false);  
      jButtonMIN.setEnabled(false);  
    }else{
      jButtonRESET.setEnabled(false);  
      jButtonSEARCH.setEnabled(false);  
      jButtonSHOW.setEnabled(false);  
      jButtonMAY.setEnabled(false);  
      jButtonMIN.setEnabled(false);      
    }   
    }

    
    public String characters(String parametro){
       for (i=0;i<parametro.length();i++){
           letra=parametro.charAt(i);
           if(i==0){
             letra=Character.toUpperCase(letra);  
           }
           if(i>=1){
             letra=Character.toLowerCase(letra);  
           }
           if(letra==' '){             
             letrainicial=i+1;
             letra=Character.toLowerCase(letra);
           }
           if(letrainicial==i){
             letra=Character.toUpperCase(letra);
             
           }
           contador++;
           Completo+=letra;
       }
       fin=contador;
       return Completo;  
    }

     public String buscar(String palabra){
    
    Buscarletra = Nombre.toCharArray();
    for ( x=1;x<Nombre.length();x++){
        if((letrabuscar-1)==x){
        Character.toString(Buscarletra [x]);
        letraf=Integer.toString(Buscarletra [x]);
        
        }
        }
    letraf+=letra;
    return letraf; // TODO code application logic here
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPantalla1 = new javax.swing.JPanel();
        jButtonESP = new javax.swing.JButton();
        jButtonENG = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonSHOW = new javax.swing.JButton();
        jButtonRESET = new javax.swing.JButton();
        jPanelPantalla2 = new javax.swing.JPanel();
        jLabelSubTitulo = new javax.swing.JLabel();
        jLabelSubTitulo1 = new javax.swing.JLabel();
        jLabelSubTitulo2 = new javax.swing.JLabel();
        jLabelSubTitulo3 = new javax.swing.JLabel();
        jLabelSubTitulo4 = new javax.swing.JLabel();
        jLabelMostrarNombrea = new javax.swing.JLabel();
        jLabelMostrarNombreb = new javax.swing.JLabel();
        jLabelMostrarNombree = new javax.swing.JLabel();
        jLabelMostrarNombrec = new javax.swing.JLabel();
        jLabelMostrarNombred = new javax.swing.JLabel();
        jPanelPantalla3 = new javax.swing.JPanel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jTextFieldbuscar = new javax.swing.JTextField();
        jButtonSEARCH = new javax.swing.JButton();
        jLabelLetra = new javax.swing.JLabel();
        jButtonMAY = new javax.swing.JButton();
        jButtonMIN = new javax.swing.JButton();
        jLabelTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPantalla1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPantalla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButtonESP.setBackground(new java.awt.Color(0, 0, 204));
        jButtonESP.setForeground(new java.awt.Color(255, 255, 255));
        jButtonESP.setText("ESP");
        jButtonESP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonESPActionPerformed(evt);
            }
        });

        jButtonENG.setBackground(new java.awt.Color(247, 148, 0));
        jButtonENG.setForeground(new java.awt.Color(255, 255, 255));
        jButtonENG.setText("ENG");
        jButtonENG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENGActionPerformed(evt);
            }
        });

        jTextFieldNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
        });

        jButtonSHOW.setBackground(new java.awt.Color(212, 0, 0));
        jButtonSHOW.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonSHOW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSHOW.setText("SHOW");
        jButtonSHOW.setFocusPainted(false);
        jButtonSHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSHOWActionPerformed(evt);
            }
        });

        jButtonRESET.setBackground(new java.awt.Color(0, 118, 0));
        jButtonRESET.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonRESET.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRESET.setText("RESET");
        jButtonRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRESETActionPerformed(evt);
            }
        });

        jPanelPantalla2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPantalla2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanelPantalla2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabelSubTitulo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelSubTitulo.setText("Your name is :");

        jLabelSubTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelSubTitulo1.setText("Your name in MAY :");

        jLabelSubTitulo2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelSubTitulo2.setText("Your name in MIN :");

        jLabelSubTitulo3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelSubTitulo3.setText("Total characters :");

        jLabelSubTitulo4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelSubTitulo4.setText("Initial caption letters :");

        jLabelMostrarNombrea.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabelMostrarNombreb.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabelMostrarNombree.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabelMostrarNombrec.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabelMostrarNombred.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jPanelPantalla3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPantalla3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Letter finder", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        jLabelTitulo2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelTitulo2.setText("Type a number:");

        jTextFieldbuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldbuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTextFieldbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldbuscarKeyReleased(evt);
            }
        });

        jButtonSEARCH.setBackground(new java.awt.Color(204, 255, 0));
        jButtonSEARCH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonSEARCH.setText("SEARCH");
        jButtonSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSEARCHActionPerformed(evt);
            }
        });

        jLabelLetra.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLetra.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabelLetra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLetra.setText("?");

        jButtonMAY.setBackground(new java.awt.Color(0, 0, 204));
        jButtonMAY.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMAY.setText("MAY");
        jButtonMAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMAYActionPerformed(evt);
            }
        });

        jButtonMIN.setBackground(new java.awt.Color(255, 153, 0));
        jButtonMIN.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMIN.setText("MIN");
        jButtonMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPantalla3Layout = new javax.swing.GroupLayout(jPanelPantalla3);
        jPanelPantalla3.setLayout(jPanelPantalla3Layout);
        jPanelPantalla3Layout.setHorizontalGroup(
            jPanelPantalla3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPantalla3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPantalla3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPantalla3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldbuscar, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonSEARCH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanelPantalla3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonMAY, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jButtonMIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanelPantalla3Layout.setVerticalGroup(
            jPanelPantalla3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPantalla3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPantalla3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPantalla3Layout.createSequentialGroup()
                        .addComponent(jLabelTitulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSEARCH)
                        .addGap(22, 22, 22))
                    .addGroup(jPanelPantalla3Layout.createSequentialGroup()
                        .addGroup(jPanelPantalla3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPantalla3Layout.createSequentialGroup()
                                .addComponent(jButtonMAY, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 39, Short.MAX_VALUE))
                            .addComponent(jLabelLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanelPantalla2Layout = new javax.swing.GroupLayout(jPanelPantalla2);
        jPanelPantalla2.setLayout(jPanelPantalla2Layout);
        jPanelPantalla2Layout.setHorizontalGroup(
            jPanelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPantalla2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPantalla3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPantalla2Layout.createSequentialGroup()
                        .addGroup(jPanelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSubTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSubTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSubTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSubTitulo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSubTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMostrarNombrea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMostrarNombrec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMostrarNombred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMostrarNombree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMostrarNombreb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelPantalla2Layout.setVerticalGroup(
            jPanelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPantalla2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPantalla2Layout.createSequentialGroup()
                        .addComponent(jLabelSubTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSubTitulo1)
                        .addGap(17, 17, 17)
                        .addComponent(jLabelSubTitulo2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSubTitulo3)
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addComponent(jLabelSubTitulo4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPantalla2Layout.createSequentialGroup()
                        .addComponent(jLabelMostrarNombrea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMostrarNombreb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabelMostrarNombrec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMostrarNombred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMostrarNombree, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanelPantalla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelTitulo1.setText("Your name:");

        javax.swing.GroupLayout jPanelPantalla1Layout = new javax.swing.GroupLayout(jPanelPantalla1);
        jPanelPantalla1.setLayout(jPanelPantalla1Layout);
        jPanelPantalla1Layout.setHorizontalGroup(
            jPanelPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPantalla1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPantalla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPantalla1Layout.createSequentialGroup()
                        .addComponent(jLabelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonESP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonENG, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonRESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSHOW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre))
                .addContainerGap())
        );
        jPanelPantalla1Layout.setVerticalGroup(
            jPanelPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPantalla1Layout.createSequentialGroup()
                .addGroup(jPanelPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPantalla1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPantalla1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonESP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonENG, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)))
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSHOW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRESET)
                .addGap(18, 18, 18)
                .addComponent(jPanelPantalla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPantalla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPantalla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSHOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSHOWActionPerformed
     
     if (!jTextFieldNombre.getText().isEmpty()){
      Nombre=jTextFieldNombre.getText();
     jLabelMostrarNombrea.setText(Nombre);
     String Mayus = Nombre.toUpperCase();
     jLabelMostrarNombreb.setText(Mayus);
     String Minus = Nombre.toLowerCase();
     jLabelMostrarNombrec.setText(Minus);
     characters(Nombre);
     jLabelMostrarNombred.setText(Integer.toString(fin));
     jLabelMostrarNombree.setText(Completo);
     i=0;Completo="";fin=0;conspa=0;contador=0;
    }else{
     jTextFieldNombre.setText("");
     jLabelMostrarNombrea.setText("");
     jLabelMostrarNombreb.setText("");
     jLabelMostrarNombrec.setText("");
     jLabelMostrarNombred.setText("");
     jLabelMostrarNombree.setText("");  
    }
     
    }//GEN-LAST:event_jButtonSHOWActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
    Botones();        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jButtonRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRESETActionPerformed
     jTextFieldNombre.setText("");
     Botones();
     /*
     jLabelMostrarNombrea.setText("");
     jLabelMostrarNombreb.setText("");
     jLabelMostrarNombrec.setText("");
     jLabelMostrarNombred.setText("");;
     jLabelMostrarNombree.setText("");*/
    }//GEN-LAST:event_jButtonRESETActionPerformed

    private void jButtonSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSEARCHActionPerformed
      
        if (jTextFieldbuscar.getText().isEmpty()){
      String o=jLabelTitulo1.getText();
           if (o=="Your name:") {   
           JOptionPane.showMessageDialog(this,"Please do not leave empty spaces.","Message",WARNING_MESSAGE);
           }else{
           JOptionPane.showMessageDialog(this,"Favor No dejar espacios vacios.","Mensaje",WARNING_MESSAGE);    
           }
           
      }else{
      letraf="";
      letrabuscar=0;
      Letra=' ';letra=Letra;
      letrainicial=0;x=letrabuscar;
       jLabelLetra.setText("");
       letraf="";  
      
       letrabuscar=Integer.parseInt(jTextFieldbuscar.getText());
       buscar(Nombre);
       letraf=Character.toString(Buscarletra [(letrabuscar-1)]);
       if (Buscarletra [(letrabuscar-1)]==' '){
       jLabelLetra.setText("_");
        jButtonMIN.setEnabled(false);
        jButtonMAY.setEnabled(false);       
       }else{
       jLabelLetra.setText(letraf);
       }

      if (Character.isUpperCase(Buscarletra [(letrabuscar-1)])){
          jButtonMAY.setEnabled(false);
           jButtonMIN.setEnabled(true);
      }else{
          jButtonMIN.setEnabled(false);
           jButtonMAY.setEnabled(true);
      }
     
    }//GEN-LAST:event_jButtonSEARCHActionPerformed
    }
    private void jButtonESPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonESPActionPerformed
        jLabelTitulo1.setText("Tu nombre:");// TODO add your handling code here:
        jLabelSubTitulo.setText("Tu nombre es:");// TODO add your handling code here:
        jLabelSubTitulo1.setText("Tu nombre en MAY:");// TODO add your handling code here:
        jLabelSubTitulo2.setText("Tu nombre en MIN:");// TODO add your handling code here:
        jLabelSubTitulo3.setText("Caracteres totales:");// TODO add your handling code here:
        jLabelSubTitulo4.setText("Letras iniciales de subtítulos:");// TODO add your handling code here:
        jLabelTitulo2.setText("Escribe un número:");// TODO add your handling code here:
        jButtonSHOW.setText("MOSTRAR");
        jButtonRESET.setText("REINICIAR");
        jButtonSEARCH.setText("BUSCAR");
        jPanelPantalla2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPantalla2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Informacion", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanelPantalla2.setFont(new java.awt.Font("Times New Roman", 0, 11)); 
        jPanelPantalla3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPantalla3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "buscador de letras", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jButtonESP.setEnabled(false);
        jButtonENG.setEnabled(true);
    }//GEN-LAST:event_jButtonESPActionPerformed

    private void jButtonENGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENGActionPerformed
        jLabelTitulo1.setText("Your name:");// TODO add your handling code here:
        jLabelSubTitulo.setText("Your name is:");// TODO add your handling code here:
        jLabelSubTitulo1.setText("Your name in MAY:");// TODO add your handling code here:
        jLabelSubTitulo2.setText("Your name in MIN:");// TODO add your handling code here:
        jLabelSubTitulo3.setText("Total characters ::");// TODO add your handling code here:
        jLabelSubTitulo4.setText("Initial caption letters :");// TODO add your handling code here:
        jLabelTitulo2.setText("Type a number:");// TODO add your handling code here:
        jButtonSHOW.setText("SHOW");
        jButtonRESET.setText("RESET");
        jButtonSEARCH.setText("SEARCH");
        jPanelPantalla2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPantalla2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanelPantalla2.setFont(new java.awt.Font("Times New Roman", 0, 11)); 
        jPanelPantalla3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPantalla3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Letter finder", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jButtonESP.setEnabled(true);
        jButtonENG.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonENGActionPerformed

    private void jButtonMAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMAYActionPerformed
       if (Buscarletra [(letrabuscar-1)]==' '){
       jLabelLetra.setText("_");
        jButtonMIN.setEnabled(false);
        jButtonMAY.setEnabled(false);       
       }else{
        String M = letraf.toUpperCase();
           jLabelLetra.setText(M);
          jButtonMAY.setEnabled(false);
           jButtonMIN.setEnabled(true);
       }

    }//GEN-LAST:event_jButtonMAYActionPerformed
    private void jButtonMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMINActionPerformed
       if (Buscarletra [(letrabuscar-1)]==' '){
       jLabelLetra.setText("_");
        jButtonMIN.setEnabled(false);
        jButtonMAY.setEnabled(false);       
       }else{
        String N = letraf.toLowerCase();
           jLabelLetra.setText(N);
          jButtonMIN.setEnabled(false);
           jButtonMAY.setEnabled(true);
       }
      
    }//GEN-LAST:event_jButtonMINActionPerformed

    private void jTextFieldbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldbuscarKeyReleased

    }//GEN-LAST:event_jTextFieldbuscarKeyReleased

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonENG;
    private javax.swing.JButton jButtonESP;
    private javax.swing.JButton jButtonMAY;
    private javax.swing.JButton jButtonMIN;
    private javax.swing.JButton jButtonRESET;
    private javax.swing.JButton jButtonSEARCH;
    private javax.swing.JButton jButtonSHOW;
    private javax.swing.JLabel jLabelLetra;
    private javax.swing.JLabel jLabelMostrarNombrea;
    private javax.swing.JLabel jLabelMostrarNombreb;
    private javax.swing.JLabel jLabelMostrarNombrec;
    private javax.swing.JLabel jLabelMostrarNombred;
    private javax.swing.JLabel jLabelMostrarNombree;
    private javax.swing.JLabel jLabelSubTitulo;
    private javax.swing.JLabel jLabelSubTitulo1;
    private javax.swing.JLabel jLabelSubTitulo2;
    private javax.swing.JLabel jLabelSubTitulo3;
    private javax.swing.JLabel jLabelSubTitulo4;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JPanel jPanelPantalla1;
    private javax.swing.JPanel jPanelPantalla2;
    private javax.swing.JPanel jPanelPantalla3;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldbuscar;
    // End of variables declaration//GEN-END:variables
}
