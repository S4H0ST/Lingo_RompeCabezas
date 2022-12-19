package Pack_Jugador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/** 
 *
 * @author sohaib, Jose, Laura
 */


public class Almacen_de_jugadores implements Serializable {
    private final ArrayList<Jugador> jugadores=new ArrayList();  //arraylist de jugadores
    private Jugador administrador;
    private int contador_jugadores = 0;
    
    //Constructores
    public Almacen_de_jugadores(String clave){
        Jugador admin = new Jugador("admin", clave);
        jugadores.add(admin);
        System.out.println(admin.getNombre() + admin.getContraseña());   
    }
    
    public boolean autenticar (Jugador j){
        return false; //borrar, solo puesto para q no de error
   }
    
    public ArrayList<Jugador> ranking_ordenado_por_victorias(){
        ArrayList<Jugador> array = (ArrayList<Jugador>)jugadores.clone();
        Collections.sort(array,new ComparaPartidasGanadas()); //hay que programarlo aun
        return(array);
    }
    
    public void ranking_ordenado_por_nombre(){
        
    }
    
    public void alta(Jugador j){
        
    }
    
    public void baja(Jugador j){
        
    }
    
}
