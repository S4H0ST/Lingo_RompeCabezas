package Pack_Palabra;

import Interfaz.*; // por si acaso
import java.io.*; // para usar serializable
import java.util.*; //no se para que lo he puesto
/*
 * @author sohaib
 */
public class Palabra extends Almacen_de_palabra implements Serializable {

    private int numpalabras; //numero de letras
   
    private ArrayList<String> palabras_jugador1 = new ArrayList<String>(); //almacen de palabras del jugador 1
    private ArrayList<String> palabras_jugador2 = new ArrayList<String>(); //almacen de palabras del jugador 2
    private Almacen_de_palabra almacen = new Almacen_de_palabra(); //con este objeto sacamos los datos cargados del fichero y usar los metodos de configuracion
    private int numRandom; // es la posicion del arraylist que sera la palabra entera
    private String palabraRandom; //es la palabra aleatoria que se saca cuando se quiera
    //INICIALIZACION DE ATRIBUTOS-------------------------------------------------------
   

    public Palabra() {
        this.palabras_jugador1 = almacen.getPalabras_de_array(1); //LO QUE HAGO ES SACAR LAS PALABRAS DEL JUGADOR 1 Y GUARDARLAS EN OTRA VARIABLE
        this.palabras_jugador2 = almacen.getPalabras_de_array(2); //LO QUE HAGO ES SACAR LAS PALABRAS DEL JUGADOR 2 Y GUARDARLAS EN OTRA VARIABLE
        this.numpalabras=almacen.getPalabras_de_array(1).size(); // guardamos el numero de palabras que tienen los arraylist, como ambos van a TENER EL MISMO TAMANIO DA IGUAL QUE JUGADOR COJA 
    }                                               //NOTA: LO DE QUE SEA EL JUGADOR 1 O 2 PARA EL NUMPALABRAS ES INDIFERENTE

    //-----------------------------------METODOS DE LA CLASE------------------------------------------------------------------
    //METODO GET NUMERO DE ELEMENTOS
    //METODO COMPROBAR COLOCADAS
    public boolean comprobar_colocadas(int posicion, String palabra_introducida) {
        String palabra_original = palabras_jugador1.get(posicion);
        System.out.println(palabra_introducida); //escribe por consola la palabra de esa linea

        if (palabra_original.equals(palabra_introducida)) {
            System.out.println("Son iguales");
            //que se pongan todas en verde
            //que se termine la partida
            return true;
        } else {
            System.out.println("No son iguales");
            comprobar_distinta_posicion(posicion, palabra_introducida);
            return false;
        }

    }

    //METODO COMPROBAR Distinta posicion
    private boolean comprobar_distinta_posicion(int posicion, String palabra_introducida) {

        this.palabras_jugador1.get(posicion).charAt(1);
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
    public String sacar_palabra_aleatoria(int jugador) {
      this.numRandom=(int) (Math.random() * this.numpalabras); //cojo una palabra aleatoria en ese rango [0-arraylist jugador (1o2).size[])
      this.palabraRandom=almacen.getPalabras_de_array(jugador).get(this.numRandom); //elijo una palabra aleatorio del jugador que quiera  
      return this.palabraRandom; //devuelve una palabra aleatoria del fichero
    }

    //SECUENCIA DE RESULTADOS
}
