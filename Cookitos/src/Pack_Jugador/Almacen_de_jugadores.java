package Pack_Jugador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; //Para mas tarde

/** 
 *
 * @author sohaib, Jose, Laura
 */


public class Almacen_de_jugadores implements Serializable {
    
    private String nombreFichero;
    private final ArrayList<Jugador> jugadores=new ArrayList();  //arraylist de jugadores
    //private Jugador administrador;   //jugador de tipo administrador
    private int contador_de_jugadores = 0;  //para asignar el numero de jugadores
    
    
    
    //Constructores
    public Almacen_de_jugadores(String clave){
      //  Jugador admin = new Jugador("admin", clave);
      //  jugadores.add(admin);
      //  System.out.println(admin.getNombre() + admin.getContraseña());   
    }
    
  
    
    public boolean autenticar (Jugador j){
        if(encontrarJugador(nombre,clave)!=null){
            
        }else{
            jugadores.add(new Jugador(nombre,clave)); //Si el usuario no existe, se añadirá al ArrayList de jugadores
            contador_de_jugadores++;
        }        
   } 
    
//    public boolean Admin(String clave) {
//            if(administrador.getJugador()[1].equals(clave)) {
//		return(true);
//            }else {
//		return(false);
//            }
//	}
    
    //Fichero
    public void serializar(String name) throws ClassNotFoundException{
        try{
            ObjectOutputStream entrada = new ObjectOutputStream(new FileOutputStream(name));

            entrada.writeObject(this.jugadores);

            entrada.close();
            System.out.println("Guardado correctamente");
        }catch (IOException e) {
            System.out.println("ERROR de escritura!!!"); 
        }
    }
    
      public void deserializar(String nombre) throws ClassNotFoundException{
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreFichero));

            ArrayList<Jugador> objetoLeido = (ArrayList<Jugador>) entrada.readObject();
        
            this.jugadores.addAll(objetoLeido);
            System.out.println("Cargado correctamente");
            
        }catch(IOException e){
            System.out.println("Error de lectura");
        }
    }
      
      //Para buscar al jugador
      public Jugador encontrarJugador(String nombre,String clave){
		Jugador j = null;
		for(int i=0;i<jugadores.size();i++) {
			if(jugadores.get(i).getJugador()[1].equals(clave) && jugadores.get(i).getJugador()[0].equals(nombre)) {
				j=jugadores.get(i);
			}
		}
		return(j);
	}
      
     
    
    
    
    public void alta(Jugador j){
        if (){
            
        }
    }
    
    public void baja(Jugador j){
        
    }
    
    
    
    public ArrayList<Jugador> ranking_ordenado_por_victorias(){
        ArrayList<Jugador> array = (ArrayList<Jugador>)jugadores.clone();
        //Collections.sort(array,new ComparaPartidasGanadas()); //hay que programarlo aun
        return(array);
    }
    
    
    public ArrayList<Jugador> ranking_ordenado_por_nombre(){
         ArrayList<Jugador> array = (ArrayList<Jugador>)jugadores.clone();
        //Collections.sort(array,new comparar_nombre()); //hay que programarlo aun
        return(array);
    }
    
}
