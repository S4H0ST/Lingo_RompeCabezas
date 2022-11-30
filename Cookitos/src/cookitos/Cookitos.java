package cookitos;
<<<<<<< HEAD
import Pack_Palabra.Palabra;
import java.util.ArrayList;
=======

import java.util.Scanner;
>>>>>>> 62aa386038fba8e9966be78130c9bcc0003d736f

/**
 * @author sohaib, Jose, Laura
 */
public class Cookitos {

    public static void main(String[] args) {
<<<<<<< HEAD
        ArrayList<Enum> numLetras=null;
        char palabra[]=new char[6];
        boolean regalo_de_letra=false;
        
       Palabra l1;
       l1=new Palabra(numLetras,palabra,regalo_de_letra);

       
=======
        


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
        
        
>>>>>>> 62aa386038fba8e9966be78130c9bcc0003d736f
    }
}    

