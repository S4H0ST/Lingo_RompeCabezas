package Interfaz;
/**
 *
 * @author Jose Manuel
 */
import Pack_Palabra.Almacen_de_palabra;
import Pack_Palabra.Palabra;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;


public class Partida_seis extends javax.swing.JPanel {
    
    private int contTeclado;
    //las filas de los bloques donde se va a escribir
    private char[] fila1 = new char[6]; //array para la fila 1
    private char[] fila2 = new char[6]; //array para la fila 2
    private char[] fila3 = new char[6]; //array para la fila 3
    private char[] fila4 = new char[6]; //array para la fila 4
    private char[] fila5 = new char[6]; //array para la fila 5
    //private char[][] matriz_filas = new char[5][5];
    private int turno;      //dependiendo del valor, jugará j1 o j2
    
    //Dos variables independientes para cada jugador pues puede que cada uno vaya por distintos puntos de la partida
    private int ronda_j1;   //variable para la ronda del jugador 1
    private int ronda_j2;   //variable para la ronda del jugador 2
    
    private JLabel[] array_casillas = new JLabel[30];

    private Palabra clase_palabra = new Palabra();
    boolean comprobar_palabra = false;
    
    public Partida_seis() {
        initComponents();
        this.setSize(500, 380);   //fijar tamaño default
        this.setLocation(0, 0);        //fijar ubicacion default 
        this.contTeclado = 0;
        this.turno = 0;
        array_casillas[0] = bloque1;
        array_casillas[1] = bloque2;
        array_casillas[2] = bloque3;
        array_casillas[3] = bloque4;
        array_casillas[4] = bloque5;

        array_casillas[5] = bloque6;
        array_casillas[6] = bloque7;
        array_casillas[7] = bloque8;
        array_casillas[8] = bloque9;
        array_casillas[9] = bloque10;

        array_casillas[10] = bloque11;
        array_casillas[11] = bloque12;
        array_casillas[12] = bloque13;
        array_casillas[13] = bloque14;
        array_casillas[14] = bloque15;

        array_casillas[15] = bloque16;
        array_casillas[16] = bloque17;
        array_casillas[17] = bloque18;
        array_casillas[18] = bloque19;
        array_casillas[19] = bloque20;

        array_casillas[20] = bloque21;
        array_casillas[21] = bloque22;
        array_casillas[22] = bloque23;
        array_casillas[23] = bloque24;
        array_casillas[24] = bloque25;
        
        array_casillas[25] = bloque26;
        array_casillas[26] = bloque27;
        array_casillas[27] = bloque28;
        array_casillas[28] = bloque29;
        array_casillas[29] = bloque30;

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        bloque1 = new javax.swing.JLabel();
        bloque2 = new javax.swing.JLabel();
        bloque3 = new javax.swing.JLabel();
        bloque4 = new javax.swing.JLabel();
        bloque5 = new javax.swing.JLabel();
        bloque6 = new javax.swing.JLabel();
        bloque7 = new javax.swing.JLabel();
        bloque8 = new javax.swing.JLabel();
        bloque9 = new javax.swing.JLabel();
        bloque10 = new javax.swing.JLabel();
        bloque11 = new javax.swing.JLabel();
        bloque12 = new javax.swing.JLabel();
        bloque14 = new javax.swing.JLabel();
        bloque15 = new javax.swing.JLabel();
        bloque16 = new javax.swing.JLabel();
        bloque17 = new javax.swing.JLabel();
        bloque19 = new javax.swing.JLabel();
        bloque20 = new javax.swing.JLabel();
        bloque21 = new javax.swing.JLabel();
        bloque22 = new javax.swing.JLabel();
        bloque23 = new javax.swing.JLabel();
        bloque24 = new javax.swing.JLabel();
        bloque25 = new javax.swing.JLabel();
        bloque13 = new javax.swing.JLabel();
        bloque18 = new javax.swing.JLabel();
        bloque26 = new javax.swing.JLabel();
        bloque27 = new javax.swing.JLabel();
        bloque28 = new javax.swing.JLabel();
        bloque29 = new javax.swing.JLabel();
        bloque30 = new javax.swing.JLabel();
        verPalabras = new javax.swing.JButton();
        PistaLetra = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Panel1KeyTyped(evt);
            }
        });

        bloque1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque22.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque25.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque29.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                                .addComponent(bloque19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloque20, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                                .addComponent(bloque13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloque14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(bloque7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloque8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                                .addComponent(bloque1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloque2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloque21, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bloque9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloque3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloque15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)))
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bloque16, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(bloque22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bloque17, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(bloque23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bloque4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(bloque10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bloque11, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(bloque5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(8, 8, 8)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bloque12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(bloque18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(bloque25, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque26, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque27, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque29, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque30, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloque6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloque7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(bloque8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloque13, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(bloque14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bloque23, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(bloque21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloque19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloque20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloque22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bloque24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloque30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bloque25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(bloque26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloque27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloque28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloque29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        verPalabras.setText("VER PALABRAS");
        verPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPalabrasActionPerformed(evt);
            }
        });

        PistaLetra.setText("Pista?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(verPalabras)
                .addGap(111, 111, 111)
                .addComponent(PistaLetra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verPalabras)
                    .addComponent(PistaLetra))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Panel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Panel1KeyTyped

    }//GEN-LAST:event_Panel1KeyTyped

    private void verPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPalabrasActionPerformed
        System.out.println(String.valueOf(fila1).toUpperCase());
        System.out.println(fila2);
        System.out.println(fila3);
        System.out.println(fila4);
        System.out.println(fila5);
    }//GEN-LAST:event_verPalabrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton PistaLetra;
    private javax.swing.JLabel bloque1;
    private javax.swing.JLabel bloque10;
    private javax.swing.JLabel bloque11;
    private javax.swing.JLabel bloque12;
    private javax.swing.JLabel bloque13;
    private javax.swing.JLabel bloque14;
    private javax.swing.JLabel bloque15;
    private javax.swing.JLabel bloque16;
    private javax.swing.JLabel bloque17;
    private javax.swing.JLabel bloque18;
    private javax.swing.JLabel bloque19;
    private javax.swing.JLabel bloque2;
    private javax.swing.JLabel bloque20;
    private javax.swing.JLabel bloque21;
    private javax.swing.JLabel bloque22;
    private javax.swing.JLabel bloque23;
    private javax.swing.JLabel bloque24;
    private javax.swing.JLabel bloque25;
    private javax.swing.JLabel bloque26;
    private javax.swing.JLabel bloque27;
    private javax.swing.JLabel bloque28;
    private javax.swing.JLabel bloque29;
    private javax.swing.JLabel bloque3;
    private javax.swing.JLabel bloque30;
    private javax.swing.JLabel bloque4;
    private javax.swing.JLabel bloque5;
    private javax.swing.JLabel bloque6;
    private javax.swing.JLabel bloque7;
    private javax.swing.JLabel bloque8;
    private javax.swing.JLabel bloque9;
    private javax.swing.JButton verPalabras;
    // End of variables declaration//GEN-END:variables
}
