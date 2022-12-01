/*
 * @author sohaib
 */
package Pack_Palabra;
import java.util.ArrayList;

public abstract class Palabra {
    private ArrayList <Enum> numLetras; // Contiene 5 o 6 elementos
    private char palabra[];
    private boolean regalo_de_letra;

    //INICIALIZACION DE ATRIBUTOS-------------------------------------------------------
    public Palabra(ArrayList<Enum> numLetras, char[] palabra, boolean regalo_de_letra) {
        
        this.numLetras = numLetras;                                 // ENUMERADOR DE LETRAS               
        if(palabra.length==numLetras.size()){                      // PALABRA DEL TAMAÑO DEL NUMERO DE LETRAS
         this.palabra = palabra;                                  //PALABRA QUE SE VA A USAR
        }else{
         //BORRAR PARA QUE SEA DESDE LA INTERVAZ
        }                 
        this.regalo_de_letra = regalo_de_letra;                //COMPROBAR SI SE VA A DAR REGALO DE LETRA O NO 
    }
    
    //METODO GET TAMAÑO PALABRA
    public int getLongPalabra(){
        return this.palabra.length;
    }
    
    //METODO COMPROBAR COLOCADAS
    private void comprobar_colocadas(){
       
    // for(int i =0; i<numLetras.size();i++){
       /* if(caracter de la palabra entrada != caracter de la palabra origen_){
              boolean=true;
     }else{
              boolean =false;
         }*/
       
            
     }
    //METODO COMPROBAR Distinta posicion
    
    public 
       
       
       
            
        }
    }
    
    
    
    
    
}
