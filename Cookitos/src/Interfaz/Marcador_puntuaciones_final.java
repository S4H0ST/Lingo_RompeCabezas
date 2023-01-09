package Interfaz;

import Pack_Partida.Marcador;
import java.util.ArrayList;
import java.lang.StringBuilder;

/**
 *
 * @author Jose Manuel
 */
public class Marcador_puntuaciones_final extends javax.swing.JPanel {

    private Marcador marcador;
    private PartidaCinco partida_cinco;
    private Partida_seis partida_seis;
    private ArrayList<Integer> puntos_palabra1 = new ArrayList<Integer>(); // Create an ArrayList object
    private ArrayList<Integer> puntos_palabra2 = new ArrayList<Integer>();
    private ArrayList<String> palabras_marcador1 = new ArrayList<String>();
    private ArrayList<String> palabras_marcador2 = new ArrayList<String>();
    private StringBuilder texto1 = new StringBuilder();
    private StringBuilder texto2 = new StringBuilder();

    public Marcador_puntuaciones_final(PartidaCinco partida_cinco) {
        initComponents();
        this.partida_cinco = partida_cinco;
        this.puntos_palabra1 = this.partida_cinco.getMarcador_jugadores().getArray_puntos1();
        this.puntos_palabra2 = this.partida_cinco.getMarcador_jugadores().getArray_puntos2();
        this.palabras_marcador1 = this.partida_cinco.getMarcador_jugadores().getArray_palabras1();
        this.palabras_marcador2 = this.partida_cinco.getMarcador_jugadores().getArray_palabras2();
        nombreJ1.setText(this.partida_cinco.getMarcador_jugadores().get_nombre_j1());
        nombreJ2.setText(this.partida_cinco.getMarcador_jugadores().get_nombre_j2());

        for (int i = 0; i < this.palabras_marcador1.size(); i++) {
            texto1 = texto1.append(this.palabras_marcador1.get(i)).append("                         ").append(this.puntos_palabra1.get(i).toString()).append("\n");
        }
        for (int i = 0; i < this.palabras_marcador2.size(); i++) {
            texto2 = texto2.append(this.palabras_marcador2.get(i)).append("                         ").append(this.puntos_palabra2.get(i).toString()).append("\n");
        }
        Palabras_puntos_J1.setText(texto1.toString());
        Palabras_puntos_J2.setText(texto2.toString());
    }
     public Marcador_puntuaciones_final(Partida_seis partida_seis) {
        initComponents();
        this.partida_seis= partida_seis;
        this.puntos_palabra1 = this.partida_seis.getMarcador_jugadores().getArray_puntos1();
        this.puntos_palabra2 = this.partida_seis.getMarcador_jugadores().getArray_puntos2();
        this.palabras_marcador1 = this.partida_seis.getMarcador_jugadores().getArray_palabras1();
        this.palabras_marcador2 = this.partida_seis.getMarcador_jugadores().getArray_palabras2();
        nombreJ1.setText(this.partida_seis.getMarcador_jugadores().get_nombre_j1());
        nombreJ2.setText(this.partida_seis.getMarcador_jugadores().get_nombre_j2());

        for (int i = 0; i < this.palabras_marcador1.size(); i++) {
            texto1 = texto1.append(this.palabras_marcador1.get(i)).append("                         ").append(this.puntos_palabra1.get(i).toString()).append("\n");
        }
        for (int i = 0; i < this.palabras_marcador2.size(); i++) {
            texto2 = texto2.append(this.palabras_marcador2.get(i)).append("                         ").append(this.puntos_palabra2.get(i).toString()).append("\n");
        }
        Palabras_puntos_J1.setText(texto1.toString());
        Palabras_puntos_J2.setText(texto2.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreJ1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreJ2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Palabras_puntos_J1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Palabras_puntos_J2 = new javax.swing.JTextArea();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FINAL DE LA PARTIDA");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Tabla de puntuaciones:");

        jLabel3.setText("Nombre:");

        nombreJ1.setText("Aquí ira el nombre");

        jLabel4.setText("Nombre:");

        nombreJ2.setText("Aquí ira el nombre");

        Palabras_puntos_J1.setColumns(20);
        Palabras_puntos_J1.setRows(5);
        jScrollPane1.setViewportView(Palabras_puntos_J1);

        Palabras_puntos_J2.setColumns(20);
        Palabras_puntos_J2.setRows(5);
        jScrollPane2.setViewportView(Palabras_puntos_J2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Palabras_puntos_J1;
    private javax.swing.JTextArea Palabras_puntos_J2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombreJ1;
    private javax.swing.JLabel nombreJ2;
    // End of variables declaration//GEN-END:variables
}
