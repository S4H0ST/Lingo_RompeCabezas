package Pack_Jugador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; //Para mas tarde

<<<<<<< HEAD
/**
=======
/** 
 *
>>>>>>> 53e6b756e3a94cd1995c89c9370438fd37044f57
 * @author sohaib, Jose, Laura
 */


public class Almacen_de_jugadores implements Serializable {
    private final ArrayList<Jugador> jugadores=new ArrayList();  //arraylist de jugadores
    private Jugador administrador;   //jugador de tipo administrador
    private int contador_de_jugadores = 0;  //para asignar el numero de jugadores
    
    //Constructores
    public Almacen_de_jugadores(String clave){
        Jugador admin = new Jugador("admin", clave);
        jugadores.add(admin);
        System.out.println(admin.getNombre() + admin.getContraseña());   
    }
    
    /*
    public boolean autenticar (Jugador j){
        
   } */
    
    public boolean Admin(String clave) {
            if(administrador.getJugador()[1].equals(clave)) {
		return(true);
            }else {
		return(false);
            }
	}
    
    public ArrayList<Jugador> ranking_ordenado_por_victorias(){
        ArrayList<Jugador> array = (ArrayList<Jugador>)jugadores.clone();
        Collections.sort(array,new ComparaPartidasGanadas()); //hay que programarlo aun
        return(array);
    }
    
    
    public ArrayList<Jugador> ranking_ordenado_por_nombre(){
         ArrayList<Jugador> array = (ArrayList<Jugador>)jugadores.clone();
        Collections.sort(array,new comparar_nombre()); //hay que programarlo aun
        return(array);
    }
    
    public void alta(Jugador j){
        
    }
    
    public void baja(Jugador j){
        
    }
    
}
