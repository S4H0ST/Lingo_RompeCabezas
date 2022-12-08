package cookitos;

import Pack_Palabra.Palabra;
import java.util.ArrayList;

import java.util.Scanner;


/**
 * @author sohaib, Jose, Laura
 */
public class Cookitos {

    public static void main(String[] args) {
        ArrayList<Enum> numLetras=null;
        char palabra[]=new char[6];
        boolean regalo_de_letra=false;
        
       Palabra l1;
      // l1=new Palabra(numLetras,palabra,regalo_de_letra);


        


        String hola = "Prueba";
        char c;  
        
        
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        for(int i =0; i<hola.length(); i++){
            if(name.charAt(i) == hola.charAt(i)){
                c = hola.charAt(i);
                System.out.println(c);
            }
            
            
        }
        
      
    }
}    

