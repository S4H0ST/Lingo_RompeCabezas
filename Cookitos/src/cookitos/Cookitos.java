package cookitos;

import java.util.Scanner;

/**
 * @author sohaib, Jose, Laura
 */
public class Cookitos {

    public static void main(String[] args) {
        


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

