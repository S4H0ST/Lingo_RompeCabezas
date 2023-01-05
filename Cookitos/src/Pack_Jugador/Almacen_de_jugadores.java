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
import java.util.Iterator;

/** 
 *
 * @author sohaib, Jose, Laura
 */


public class Almacen_de_jugadores implements Serializable {

   
    
    private String nombreFichero;
    private final ArrayList<Jugador> jugadores=new ArrayList();  //arraylist de jugadores
    //private Jugador administrador;   //jugador de tipo administrador
    private int contador_de_jugadores = 0;  //para asignar el numero de jugadores
    
    
    
     public Almacen_de_jugadores(){
        this.nombreFichero="JugadoresBinario";//Nombre del objeto
    }
    
    //Constructores
    public Almacen_de_jugadores(String clave){
      //  Jugador admin = new Jugador("admin", clave);
      //  jugadores.add(admin);
      //  System.out.println(admin.getNombre() + admin.getContraseña());   
    }
   
    //iniciar sesion
//    public boolean autenticar (Jugador j){
//        for (Jugador j : this.jugadores) {
//            if(encontrarJugador(j.getNombre(),j.getContraseña())!=null){
//                
//            }else{
//                
//            }   
//        }
//        return false;
//
//   } 
    
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
            System.out.println("Error de escritura"); 
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
      
    //Dar de alta a un jugador
    public void alta(Jugador j){
        if(encontrarJugador(j.getNombre(),j.getContraseña())!=null){
            System.out.println("Ya existe el usuario");
        }else{
            jugadores.add(new Jugador(j.getNombre(),j.getContraseña())); //Si el usuario no existe, se añadirá al ArrayList de jugadores
            contador_de_jugadores++;
        }
    }
    
    //Dar de baja a un jugador
    public void baja(Jugador j){
        if(encontrarJugador(j.getNombre(),j.getContraseña())!=null){
            jugadores.remove(encontrarJugador(j.getNombre(),j.getContraseña()));
            contador_de_jugadores--;
        }else{
            System.out.println("Error: No existe el usuario, por lo que no se puede eliminar");
        }
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
    
    //comparar puntps j1 y j2
//     public int compare(Jugador j1,Jugador j2){
//            if(j1.getPuntos()>j2.getPuntos()){
//                return 0;
//            }else{
//                return 1;
//            }
//        }
    
}
