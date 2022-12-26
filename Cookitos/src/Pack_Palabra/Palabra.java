package Pack_Palabra;

import Interfaz.*; // por si acaso
import java.io.*; // para usar serializable
import java.util.*; //no se para que lo he puesto
/*
 * @author sohaib
 */
public class Palabra extends Almacen_de_palabra implements Serializable {

    private int numLetras;
    private char palabra[]; //palabra que metemos
    private boolean regalo_de_letra; // comprobar si se va a dar la pista o no
    private ArrayList <String> palabras_jugador1=new ArrayList <String> ();
    private Almacen_de_palabra almacen = new Almacen_de_palabra();

    
    
    //INICIALIZACION DE ATRIBUTOS-------------------------------------------------------
    public Palabra(int numLetras, char[] palabra, boolean regalo_de_letra) {
        this.numLetras = numLetras;
        this.palabra = palabra;
        this.regalo_de_letra = regalo_de_letra;
        
    
    }
    
    public Palabra(){
        almacen.cargar_Fichero();
        this.palabras_jugador1 = almacen.getPalabras_de_cinco();
    }

    //-----------------------------------METODOS DE LA CLASE------------------------------------------------------------------
    //METODO GET NUMERO DE ELEMENTOS
    //METODO COMPROBAR COLOCADAS
    public boolean comprobar_colocadas(int posicion,String palabra_introducida) {
        String palabra_original = palabras_jugador1.get(posicion);
        System.out.println(palabra_introducida);
        if(palabra_original.equals(palabra_introducida)){
            //System.out.println("Son iguales");
            return true;
        }
        else{
            //System.out.println("No son iguales");
            return false;
        }
            
        
    }

    //METODO COMPROBAR Distinta posicion
    private boolean comprobar_distinta_posicion() {

        return false; // devuelve verdadero y se pone amarillo en la posicion
    }

    //METODO MOSTRAR INTENTO RESUELTO
    public String intento_resuelto() {
        //devolver el numero del intento y la palabra del intento
        return "El intento número" + "nºintento" + "nombre palabra";
    }

    //METODO PUNTOS_OBTENIDOS
    public int puntos_Obtenidos() {

        return 0; //devuelve los puntos obtenidos
    }

    //SACAR PALABRA ALEATORIA DEL FICHERO
    public String sacar_palabra_aleatoria() {

        return "palabra aleatoria"; //devuelve una palabra aleatoria del fichero
    }

    //SECUENCIA DE RESULTADOS
}
