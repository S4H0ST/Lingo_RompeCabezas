package Pack_Palabra;
import Pack_Interfaz.*;
/*
 * @author sohaib
 */
public abstract class Palabra {
    private int num;           // Contiene 5 o 6 elementos,
    private char numLetras[]; //  palabra adivinar
    private char palabra[]; //palabra que metemos
    private  boolean regalo_de_letra;

    //INICIALIZACION DE ATRIBUTOS-------------------------------------------------------
    public Palabra(char numLetras[], char[] palabra, boolean regalo_de_letra) {
        numLetras=new char[num];
        this.numLetras = numLetras;                                 // array DE LETRAS 
        if(palabra.length==numLetras.length){                      // PALABRA DEL TAMAÑO DEL NUMERO DE LETRAS
            
         this.palabra = palabra;                                  //PALABRA QUE SE VA A USAR
        }else{
            //exit(0) o repetir la palabra
        }             
       this.regalo_de_letra = regalo_de_letra;                //COMPROBAR SI SE VA A DAR REGALO DE LETRA O NO 
    }
    
   //METODOS DE LA CLASE------------------------------------------------------------------
    //METODO GET NUMERO DE ELEMENTOS
     public int getNum() {
        return num;
    }
    //Metodo SET NUM (para saber cuantas letras tiene la palabra
    public int setNum(int numero){
        if(numero==6 || numero==5){
        this.num=numero;
        }else{
           //inserta otra vez el numero o salir
        }
    return num;
    }
    
    //METODO COMPROBAR COLOCADAS
    private boolean comprobar_colocadas(){
       boolean iguales;
       
    for(int i =0; i<numLetras.length;i++){ //comprobar si cada caracter de la palabra que hemos metido es diferente o igual
        if(numLetras[i] != palabra[i]){
              iguales=false;
     }else{
              iguales =true;
         }
       return iguales;   
    }
    
    
    //METODO COMPROBAR Distinta posicion
    /*    private boolean DistinaPos(){
    for(int i=0;i<num;i++){
        
    }
        return false;

    }*/

   
   
    
    
    
    
    
