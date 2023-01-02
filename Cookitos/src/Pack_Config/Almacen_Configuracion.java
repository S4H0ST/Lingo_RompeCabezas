package Pack_Config;

import java.io.*;
import java.util.ArrayList;

/**
 * * @author sohaib
 */
public class Almacen_Configuracion implements Serializable {

    private int letras_jugador1; //5 o 6
    private int letras_partida2; //5 o 6
    private int numPalabras; //numero de palabras por partida
    private String pista; //si hay pista o no
    private ArrayList<String> palabras_jugador1; //las palabras que hay 
    private ArrayList<String> palabras_jugador2; //las palabras que hay 

    public Almacen_Configuracion() {
        this.palabras_jugador1 = new ArrayList<String>();
        this.palabras_jugador2 = new ArrayList<String>();
    }

    //CONSTRUCTOR COMPLETO 
    public Almacen_Configuracion(int letras1, int numPalabras, String pista, ArrayList palabras_jugador1, int letras2, ArrayList palabras_jugador2) {
        //INFORMACION QUE IRA DENTRO DEL FICHERO 
        this.letras_jugador1 = letras1;
        this.letras_partida2 = letras2;
        this.pista = pista;
        this.palabras_jugador2 = new ArrayList<String>();
        this.palabras_jugador1 = new ArrayList<String>();
        this.palabras_jugador1 = palabras_jugador1;
        this.palabras_jugador2 = palabras_jugador2;
        this.numPalabras = numPalabras;
    }

    //METODOS GET DE LAS VARIABLES
    public int getLetras_jugador2() {
        return letras_partida2;
    }

    //METODOS SET DE LAS VARIABLES
    public void setLetras_jugador2(int letras_jugador2) {
        this.letras_partida2 = letras_jugador2;
    }

    //METODOS GET DE LAS VARIABLES
    public String getPista() {
        return pista;
    }

    //METODOS SET DE LAS VARIABLES
    public void setPista(String pista) {
        this.pista = pista;
    }

    //METODOS GET DE LAS VARIABLES
    public int getNumPalabras() {
        return numPalabras;
    }

    //METODOS SET DE LAS VARIABLES
    public void setNumPalabras(int numPalabras) {
        this.numPalabras = numPalabras;
    }

    //METODOS GET DE LAS VARIABLES
    public int getLetras_jugador1() {
        return letras_jugador1;
    }

    //METODOS SET DE LAS VARIABLES
    public void setLetras_jugador1(int letras_jugador1) {
        this.letras_jugador1 = letras_jugador1;
    }

    //METODOS GET DE LAS VARIABLES
    public ArrayList<String> getPalabras_jugador1() {
        return palabras_jugador1;
    }

    //METODOS SET DE LAS VARIABLES
    public void setPalabras_jugador1(ArrayList<String> palabras_jugador1) {
        this.palabras_jugador1 = palabras_jugador1;
    }

    //METODOS GET DE LAS VARIABLES
    public ArrayList<String> getPalabras_jugador2() {
        return palabras_jugador2;
    }

    //METODOS SET DE LAS VARIABLES
    public void setPalabras_jugador2(ArrayList<String> palabras_jugador2) {
        this.palabras_jugador2 = palabras_jugador2;
    }

    //METODO toString DE LAS VARIABLES (este es importante)
    @Override
    public String toString() {
        return this.letras_jugador1 + " " + this.numPalabras + " " + this.pista + "\n" + palabras_jugador1 + "\n" + this.letras_partida2 + "\n" + palabras_jugador2;
    }

}
