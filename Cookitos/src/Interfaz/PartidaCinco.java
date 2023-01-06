
package Interfaz;

import Pack_Palabra.Palabra;
import Pack_Palabra.Pista_de_Letra;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sohaib
 */
public class PartidaCinco extends javax.swing.JPanel {

    private int contTeclado;
    //las filas de los bloques donde se va a escribir
    private char[] fila1 = new char[5]; //array para la fila 1
    private char[] fila2 = new char[5]; //array para la fila 2
    private char[] fila3 = new char[5]; //array para la fila 3
    private char[] fila4 = new char[5]; //array para la fila 4
    private char[] fila5 = new char[5]; //array para la fila 5
    //private char[][] matriz_filas = new char[5][5];
    private int turno;      //dependiendo del valor, jugará j1 o j2
    //Dos variables independientes para cada jugador pues puede que cada uno vaya por distintos puntos de la partida
    private int ronda_j1;   //variable para la ronda del jugador 1
    private int ronda_j2;   //variable para la ronda del jugador 2
    private String palabraRandom; //palabra random
    private JLabel[] array_casillas = new JLabel[25]; //array de casillas
    private JLabel[] array_casillas_pista = new JLabel[5];
    private Palabra palabra_random;
    private boolean comprobar_palabra = false;
    private boolean permiso = true;

    private Pista_de_Letra sacar_pista = new Pista_de_Letra(); // para conceder la pista de la letra

    //private int contador_Puntos; //se usará para contar los puntos
    /*
    * 5 puntos acierto en 1º intento
    * 4 puntos acierto en 2º intento
    * 3 puntos acierto en 3º intento
    * 2 puntos acierto en 4º intento
    * 1 puntos acierto en 5º intento
    * 0 puntos ningun acierto
     */
    public void MostrarPanelCinco(JPanel p) {
        this.removeAll();
        p.setSize(610, 380);
        p.setLocation(0, 0);
        this.add(p, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
        p.setFocusable(true);
        p.grabFocus();
    }

    public PartidaCinco(Palabra palabra) {

        initComponents();
        this.setSize(610, 380);   //fijar tamaño default
        this.setLocation(0, 0);        //fijar ubicacion default 
        this.palabra_random = palabra;
        this.contTeclado = 0;
        this.turno = 0;
        Next.setEnabled(false);
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

        array_casillas_pista[0] = bloque26;
        array_casillas_pista[1] = bloque27;
        array_casillas_pista[2] = bloque28;
        array_casillas_pista[3] = bloque29;
        array_casillas_pista[4] = bloque30;

        System.out.println(this.palabra_random.getPalabraRandom());
        //this.contador_Puntos=0;
    }

    public void colorearLetras(boolean aciertas, int comienzo) {
        int aux = comienzo + 5;             //unicamente sirve para el siguiente for.  

        //SI SE ACIERTAN TODAS LAS LETRAS SE PONE EL TEXTO EN VERDE Y SE PASA A LA SIGUIENTE LETRA.
        if (aciertas) {
            this.permiso = false;
            Next.setEnabled(true);
            contTeclado = -1;
            for (int i = comienzo; i < aux; i++) {
                array_casillas[i].setForeground(Color.GREEN); //Se colorea de verde

            }
            Next.setVisible(true);

        } //SI NO SE ACIERTAN LAS LETRAS PODRÍA SER QUE ALGUNAS ESTÉN MAL COLOCADAS, NO ESTÉN, O QUE ESTÉN BIEN.
        else {
            int[] colorear_palabra = palabra_random.getArrayPalabra();
            for (int i = 0; i < (colorear_palabra.length); i++) {
                //QUE NO ESTÉN BIEN:
                if (colorear_palabra[i] == 0) {
                    array_casillas[i + comienzo].setForeground(Color.RED);
                    //QUE ESTÉN BIEN:
                } else if (colorear_palabra[i] == 1) {
                    array_casillas[i + comienzo].setForeground(Color.GREEN);
                } else {
                    //QUE ESTÉN MAL COLOCADAS:
                    array_casillas[i + comienzo].setForeground(Color.ORANGE);
                }
            }

        }
    }

    public char[] getFila1() {
        return fila1;
    }

    public char[] getFila2() {
        return fila2;
    }

    public char[] getFila3() {
        return fila3;
    }

    public char[] getFila4() {
        return fila4;
    }

    public char[] getFila5() {
        return fila5;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Next = new javax.swing.JButton();
        PistaLetra = new javax.swing.JButton();
        verPalabras = new javax.swing.JButton();
        TituloPuntos = new javax.swing.JLabel();
        TituloJugador = new javax.swing.JLabel();
        TituloPartida = new javax.swing.JLabel();
        NumPartida = new javax.swing.JLabel();
        NomJugador = new javax.swing.JLabel();
        NumPuntos = new javax.swing.JLabel();
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
        bloque13 = new javax.swing.JLabel();
        bloque14 = new javax.swing.JLabel();
        bloque15 = new javax.swing.JLabel();
        bloque16 = new javax.swing.JLabel();
        bloque17 = new javax.swing.JLabel();
        bloque18 = new javax.swing.JLabel();
        bloque19 = new javax.swing.JLabel();
        bloque20 = new javax.swing.JLabel();
        bloque21 = new javax.swing.JLabel();
        bloque22 = new javax.swing.JLabel();
        bloque23 = new javax.swing.JLabel();
        bloque24 = new javax.swing.JLabel();
        bloque25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bloque26 = new javax.swing.JLabel();
        bloque27 = new javax.swing.JLabel();
        bloque28 = new javax.swing.JLabel();
        bloque29 = new javax.swing.JLabel();
        bloque30 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(610, 380));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        Next.setText("NEXT");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        PistaLetra.setText("Pista?");
        PistaLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PistaLetraActionPerformed(evt);
            }
        });

        verPalabras.setText("VER PALABRAS");
        verPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPalabrasActionPerformed(evt);
            }
        });

        TituloPuntos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloPuntos.setText("Puntos : ");

        TituloJugador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloJugador.setText("Jugador : ");

        TituloPartida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloPartida.setText("Partida: ");

        NumPartida.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NomJugador.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NumPuntos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Panel1.setBackground(new java.awt.Color(255, 255, 255));

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

        bloque13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bloque18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloque18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addComponent(bloque21, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(bloque6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloque11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloque16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloque17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(bloque1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloque2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloque23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bloque18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloque13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloque8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(bloque3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(bloque24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque25, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bloque9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bloque10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bloque3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bloque7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bloque8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bloque6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bloque12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloque11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addComponent(bloque13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bloque18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloque17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloque16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bloque4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloque5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloque9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(bloque10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bloque14, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(bloque15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bloque19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloque20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloque21, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(bloque22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloque25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Pista:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloque26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bloque27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bloque28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bloque29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bloque30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloque30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(verPalabras)
                        .addGap(110, 110, 110)
                        .addComponent(PistaLetra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Next)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 76, Short.MAX_VALUE)
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TituloPuntos)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(TituloPartida)
                        .addGap(34, 34, 34)
                        .addComponent(NumPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(TituloJugador)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TituloPartida)
                            .addComponent(NumPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TituloJugador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NumPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TituloPuntos)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Next)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(verPalabras)
                        .addComponent(PistaLetra)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        System.out.println(this.palabra_random.getPalabraRandom());
        for (int i = 0; i < this.array_casillas.length; i++) {
            this.array_casillas[i].setText(String.valueOf(""));
        }
        PartidaCinco p5 = new PartidaCinco(palabra_random); // CREO UN OBEJTO PANEL DE PARTIDA_CINCO
        this.MostrarPanelCinco(p5); //MUESTRO POR PANTALLA AL PULSAR EL BOTON LA PARTIDA_CINCO
    }//GEN-LAST:event_NextActionPerformed

    private void verPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPalabrasActionPerformed
        System.out.println(String.valueOf(fila1).toUpperCase());
        System.out.println(fila2);
        System.out.println(fila3);
        System.out.println(fila4);
        System.out.println(fila5);
    }//GEN-LAST:event_verPalabrasActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println("gfddsfdsfdsfdsfs");
        if (permiso) {
            int key = evt.getKeyChar(); //key recibe lo que se ha escrito por teclado
            boolean mayusculas = key >= 65 && key <= 90; //LIMITAMOS  PARA QUE SALGAN MAYUSCULAS
            boolean minusculas = key >= 97 && key <= 122; //LIMITAMOS  PARA QUE SALGAN MINUSCULAS

            //OBLIGAR A QUE SOLO SE PUEDE INGRESAR MINUSCULAR O MAYUSCULAS (CARACTERES)    
            if ((minusculas || mayusculas)) {
                evt.consume(); //lo que hace es que cumple con la funcion de forma estricta 

                //clase_palabra.comprobar_colocadas(String.valueOf(fila1));
                if (contTeclado <= 4) {
                    switch (contTeclado) {
                        case 0 -> {
                            char c1 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C1
                            fila1[0] = c1;                     //C1 LO METEMOS EN UN ARRAY[0]
                            bloque1.setText(String.valueOf(c1).toUpperCase());  //colocamos c1 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 1 -> {
                            char c2 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C2
                            fila1[1] = c2;                     //C2 LO METEMOS EN UN ARRAY[1]
                            bloque2.setText(String.valueOf(c2).toUpperCase()); //colocamos c2 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 2 -> {
                            char c3 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C3
                            fila1[2] = c3;                     //C3 LO METEMOS EN UN ARRAY[2]
                            bloque3.setText(String.valueOf(c3).toUpperCase());  //colocamos c3 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 3 -> {
                            char c4 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C4
                            fila1[3] = c4;                     //C4 LO METEMOS EN UN ARRAY[3]
                            bloque4.setText(String.valueOf(c4).toUpperCase()); //colocamos c4 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 4 -> {
                            char c5 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C5
                            fila1[4] = c5;                     //C5 LO METEMOS EN UN ARRAY[4]
                            bloque5.setText(String.valueOf(c5).toUpperCase());  //colocamos c5 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                            comprobar_palabra = true;
                        }
                    }
                    //Cuando se introduce la quinta letra, entra en este método. Si devuelve true la palabra es correcta, en caso contrario será inválida.
                    if (comprobar_palabra) {
                        boolean aciertas = palabra_random.comprobar_colocadas(0, String.valueOf(fila1).toUpperCase(), turno);
                        this.colorearLetras(aciertas, 0);
                        comprobar_palabra = false;
                    }
                }

                if (contTeclado > 4 && contTeclado <= 9) {
                    switch (contTeclado) {
                        case 5 -> {
                            char c6 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C6
                            fila2[0] = c6;                     //C6 LO METEMOS EN UN ARRAY2[0]
                            bloque6.setText(String.valueOf(c6).toUpperCase()); //colocamos c6 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 6 -> {
                            char c7 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C7
                            fila2[1] = c7;                     //C7 LO METEMOS EN UN ARRAY2[1]
                            bloque7.setText(String.valueOf(c7).toUpperCase()); //colocamos c7 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 7 -> {
                            char c8 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C07
                            fila2[2] = c8;                     //C07 LO METEMOS EN UN ARRAY2[0]
                            bloque8.setText(String.valueOf(c8).toUpperCase()); //colocamos c07 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 8 -> {
                            char c9 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C8
                            fila2[3] = c9;                     //C8 LO METEMOS EN UN ARRAY2[0]
                            bloque9.setText(String.valueOf(c9).toUpperCase()); //colocamos c8 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 9 -> {
                            char c10 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C9
                            fila2[4] = c10;                     //C9 LO METEMOS EN UN ARRAY2[1]
                            bloque10.setText(String.valueOf(c10).toUpperCase()); //colocamos c9 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                            comprobar_palabra = true;
                        }
                    }
                    if (comprobar_palabra) {
                        boolean aciertas = palabra_random.comprobar_colocadas(0, String.valueOf(fila2).toUpperCase(), turno);
                        this.colorearLetras(aciertas, 5);
                        comprobar_palabra = false;
                    }
                }
                if (contTeclado > 9 && contTeclado <= 14) {
                    switch (contTeclado) {
                        case 10 -> {
                            char c10 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C10
                            fila3[0] = c10;                     //C10 LO METEMOS EN UN ARRAY2[1]
                            bloque11.setText(String.valueOf(c10).toUpperCase()); //colocamos c10 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 11 -> {
                            char c11 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C11
                            fila3[1] = c11;                     //C11 LO METEMOS EN UN ARRAY2[0]
                            bloque12.setText(String.valueOf(c11).toUpperCase()); //colocamos c11 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 12 -> {
                            char c12 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C12
                            fila3[2] = c12;                     //C12 LO METEMOS EN UN ARRAY2[1]
                            bloque13.setText(String.valueOf(c12).toUpperCase()); //colocamos c12 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 13 -> {
                            char c13 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C13
                            fila3[3] = c13;                     //C13 LO METEMOS EN UN ARRAY2[0]
                            bloque14.setText(String.valueOf(c13).toUpperCase()); //colocamos c13 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 14 -> {
                            char c14 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C14
                            fila3[4] = c14;                     //C14 LO METEMOS EN UN ARRAY2[1]
                            bloque15.setText(String.valueOf(c14).toUpperCase()); //colocamos c14 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                            comprobar_palabra = true;
                        }
                    }
                    if (comprobar_palabra) {
                        boolean aciertas = palabra_random.comprobar_colocadas(0, String.valueOf(fila3).toUpperCase(), turno);
                        this.colorearLetras(aciertas, 10);
                        comprobar_palabra = false;
                    }
                }
                if (contTeclado > 14 && contTeclado <= 19) {
                    switch (contTeclado) {
                        case 15 -> {
                            char c15 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C15
                            fila4[0] = c15;                     //C15  LO METEMOS EN UN ARRAY2[0]
                            bloque16.setText(String.valueOf(c15).toUpperCase()); //colocamos c15  en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 16 -> {
                            char c16 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C16
                            fila4[1] = c16;                     //C16  LO METEMOS EN UN ARRAY2[1]
                            bloque17.setText(String.valueOf(c16).toUpperCase()); //colocamos c16  en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 17 -> {
                            char c17 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C17
                            fila4[2] = c17;                     //C17 LO METEMOS EN UN ARRAY2[1]
                            bloque18.setText(String.valueOf(c17).toUpperCase()); //colocamos c17 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 18 -> {
                            char c18 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C18
                            fila4[3] = c18;                     //C18 LO METEMOS EN UN ARRAY2[0]
                            bloque19.setText(String.valueOf(c18).toUpperCase()); //colocamos c18 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 19 -> {
                            char c19 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C19
                            fila4[4] = c19;                     //C19 LO METEMOS EN UN ARRAY2[1]
                            bloque20.setText(String.valueOf(c19).toUpperCase()); //colocamos c19 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                            comprobar_palabra = true;
                        }
                    }
                    if (comprobar_palabra) {
                        boolean aciertas = palabra_random.comprobar_colocadas(0, String.valueOf(fila4).toUpperCase(), turno);
                        this.colorearLetras(aciertas, 15);
                        comprobar_palabra = false;
                    }
                }
                if (contTeclado > 19 && contTeclado <= 24) {
                    switch (contTeclado) {
                        case 20 -> {
                            char c20 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C20
                            fila5[0] = c20;                     //C20 LO METEMOS EN UN ARRAY2[0]
                            bloque21.setText(String.valueOf(c20).toUpperCase()); //colocamos c20 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 21 -> {
                            char c21 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C21
                            fila5[1] = c21;                     //C21 LO METEMOS EN UN ARRAY2[1]
                            bloque22.setText(String.valueOf(c21).toUpperCase()); //colocamos c21 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 22 -> {
                            char c22 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C22
                            fila5[2] = c22;                     //C22 LO METEMOS EN UN ARRAY2[0]
                            bloque23.setText(String.valueOf(c22).toUpperCase()); //colocamos c22 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 23 -> {
                            char c23 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C23
                            fila5[3] = c23;                     //C23 LO METEMOS EN UN ARRAY2[1]
                            bloque24.setText(String.valueOf(c23).toUpperCase()); //colocamos c23 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                        }
                        case 24 -> {
                            char c24 = evt.getKeyChar(); //GUARDAMOS EL CARACTER PRESIONADO EN C24
                            fila5[4] = c24;                     //C24 LO METEMOS EN UN ARRAY2[1]
                            bloque25.setText(String.valueOf(c24).toUpperCase()); //colocamos c24 en el bloque1, String.ValueOf = char--> String , toUpperCase() --> mayuscula siempre
                            comprobar_palabra = true;
                            Next.setEnabled(true);
                        }
                    }
                    if (comprobar_palabra) {
                        boolean aciertas = palabra_random.comprobar_colocadas(0, String.valueOf(fila5).toUpperCase(), turno);
                        this.colorearLetras(aciertas, 20);
                        //EN LA ÚLTIMA FILA, SI FALLAS, PASA A LA SIGUIENTE PALABRA.
                        comprobar_palabra = false;
                    }
                }
                ++contTeclado;//contamos cuantas veces tecleamos para ir colocando cada vez que se hace
            }
        }

    }//GEN-LAST:event_formKeyPressed

    private void PistaLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PistaLetraActionPerformed
        this.sacar_pista.regalar_letra(this.palabra_random.getPalabraRandom());    // usa la palabra de la partida para sacar un caracter pista
//        System.out.println(this.sacar_pista.letraRandom());
        char pista = this.sacar_pista.letraRandom();
        int posicion = this.sacar_pista.getPosicion_en_Palabra();
        array_casillas_pista[posicion].setText(String.valueOf(pista).toUpperCase());
        PistaLetra.setEnabled(false);
    }//GEN-LAST:event_PistaLetraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next;
    private javax.swing.JLabel NomJugador;
    private javax.swing.JLabel NumPartida;
    private javax.swing.JLabel NumPuntos;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton PistaLetra;
    private javax.swing.JLabel TituloJugador;
    private javax.swing.JLabel TituloPartida;
    private javax.swing.JLabel TituloPuntos;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton verPalabras;
    // End of variables declaration//GEN-END:variables
}
