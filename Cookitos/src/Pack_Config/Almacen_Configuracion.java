
package Pack_Config;

import java.io.*;
import java.util.ArrayList;

/** * @author sohaib
 */
public class Almacen_Configuracion implements Serializable {
    private int letras_jugador1; //5 o 6
    private int letras_jugador2; //5 o 6
    private int numPalabras; //numero de palabras por partida
    private String pista; //si hay pista o no
    private ArrayList <String> palabras_partida1=new ArrayList <String>(); //las palabras que hay 
    private ArrayList <String> palabras_partida2=new ArrayList <String>(); //las palabras que hay 

    
    //this.infoConfig=new Almacen_Configuracion(this.letras,this.numPalabras,this.pista,this.palabras_partidaCinco,this.palabras_partidaSeis);
    //CONSTRUCTOR COMPLETO 
    public Almacen_Configuracion(int letras1,int numPalabras, String pista, ArrayList palabras_partida1,int letras2 , ArrayList palabras_partida2) {
        this.letras_jugador1 = letras1;
        this.letras_jugador2=letras2; 
        this.pista = pista;
        this.palabras_partida1 = palabras_partida1 ;
        this.numPalabras = numPalabras;
        this.palabras_partida2=palabras_partida2;
    }
    
   //CONSTRUCTOR BASICO (para el jugador 2)
    public Almacen_Configuracion(int letras1, ArrayList palabras_partidaCinco,ArrayList palabras_partidaSeis) {
        this.letras_jugador1=letras1;
        this.palabras_partida1=palabras_partidaCinco;
        this.palabras_partida2=palabras_partidaSeis;
    }
       
    
    
    
    
    //METODOS GET DE LAS VARIABLES
    public  int getLetras() {
        return letras_jugador1;
    }
   //METODOS SET DE LAS VARIABLES
    public void setLetras(int letras) {
        this.letras_jugador1 = letras;
    }

    
    //METODOS GET DE LAS VARIABLES
    public int getLetras_jugador2() {
        return letras_jugador2;
    }
    
    
    //METODOS SET DE LAS VARIABLES
    public void setLetras_jugador2(int letras_jugador2) {
        this.letras_jugador2 = letras_jugador2;
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
    public ArrayList<String> getPalabras_partida() {
        return palabras_partida1;
    }
     //METODOS SET DE LAS VARIABLES
    public void setPalabras_partida(ArrayList palabras_partida) {
        this.palabras_partida1 = palabras_partida;
    }
    //METODOS GET DE LAS VARIABLES
    public int getNumPalabras() {
        return numPalabras;
    }
    
    //METODOS SET DE LAS VARIABLES
    public void setNumPalabras(int numPalabras) {
        this.numPalabras = numPalabras;
    }
    
    
    
    //METODOS toString DE LAS VARIABLES

    @Override
    public String toString() {
        return this.letras_jugador1 +this.numPalabras  + this.pista + "\n" + palabras_partida1 + "\n"+this.letras_jugador2 +"\n"+ palabras_partida2 + '}';
    }


    
}
