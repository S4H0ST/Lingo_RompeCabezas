package Pack_Partida;

import java.util.ArrayList;

/**
 *
 * @author Jose Manuel
 */
public class Marcador {

    private String nombre_j1;                      //CONSERVAR
    private String nombre_j2;                      //CONSERVAR

    private int puntos_j1;                      //CONSERVAR
    private int puntos_j2;                      //CONSERVAR
    private int ronda_j1;
    private int ronda_j2;

    private int turno;

    private boolean cambio_j1 = false;
    private boolean cambio_j2 = false;

    private boolean pediste_ayuda_palabra_j1;
    private boolean pediste_ayuda_palabra_j2;

    private ArrayList<Integer> puntos_palabra1 = new ArrayList<Integer>(); // Create an ArrayList object
    private ArrayList<Integer> puntos_palabra2 = new ArrayList<Integer>(); 
    private ArrayList<String> palabra_marcador1 = new ArrayList<String>();
    private ArrayList<String> palabra_marcador2 = new ArrayList<String>();

    public Marcador() {
        this.puntos_j1 = 0;
        this.puntos_j2 = 0;
        this.ronda_j1 = 0;
        this.ronda_j2 = 0;

        this.nombre_j1 = "jose";
        this.nombre_j2 = "laura";

        this.turno = 0;
        this.pediste_ayuda_palabra_j1 = false;
        this.pediste_ayuda_palabra_j2 = false;
    }

    public int getPuntosJ1() {
        return this.puntos_j1;
    }

    public int getPuntosJ2() {
        return this.puntos_j2;
    }

    public int getRondaJ1() {
        return this.ronda_j1;
    }

    public int getRondaJ2() {
        return this.ronda_j2;
    }

    public int getTurno() {
        return this.turno;
    }

    public void setPuntos_j1(int puntos_j1) {
        this.puntos_j1 += puntos_j1;
    }

    public void setPuntos_j2(int puntos_j2) {
        this.puntos_j2 += puntos_j2;
    }

    public void setRonda_j1(int ronda_j1) {
        this.ronda_j1 += ronda_j1;
    }

    public void setRonda_j2(int ronda_j2) {
        this.ronda_j2 += ronda_j2;
    }

    public void set_cambio_j1() {
        this.cambio_j1 = true;
    }

    public void set_cambio_j2() {
        this.cambio_j2 = true;
    }

    public boolean get_Cambio_j1() {
        return this.cambio_j1;
    }

    public boolean get_Cambio_j2() {
        return this.cambio_j2;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public boolean get_pedir_ayuda_p_j1() {
        return this.pediste_ayuda_palabra_j1;
    }

    public boolean get_pedir_ayuda_p_j2() {
        return this.pediste_ayuda_palabra_j2;
    }

    public void set_pedir_ayuda_palabra_j1() {
        this.pediste_ayuda_palabra_j1 = true;
    }

    public void set_pedir_ayuda_palabra_j2() {
        this.pediste_ayuda_palabra_j2 = true;
    }

    public void set_añadir_puntos_palabra(int puntuacion) {
        if(this.turno==0){
            this.puntos_palabra1.add(puntuacion);
        }
        else{
            this.puntos_palabra2.add(puntuacion);
        }
    }

    public void set_añadir_palabra(String palabra) {
        if (this.turno == 0) {
            this.palabra_marcador1.add(palabra);
        } else {
            this.palabra_marcador2.add(palabra);
        }
    }

    public ArrayList<Integer> getArray_puntos1() {
        return this.puntos_palabra1;
    }
    public ArrayList<Integer> getArray_puntos2() {
        return this.puntos_palabra2;
    }

    public ArrayList<String> getArray_palabras1() {
        return this.palabra_marcador1;
    }

    public ArrayList<String> getArray_palabras2() {
        return this.palabra_marcador2;
    }

    public String get_nombre_j1() {
        return this.nombre_j1;
    }

    public String get_nombre_j2() {
        return this.nombre_j2;
    }

    public void set_nombre_j1(String nombre) {
        this.nombre_j1 = nombre;
    }

    public void set_nombre_j2(String nombre) {
        this.nombre_j2 = nombre;
    }
}
