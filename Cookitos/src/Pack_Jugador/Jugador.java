package Pack_Jugador;

/**
 *
 * @author sohaib, Jose, Laura
 */
public class Jugador {
    private String nombre;
    private String contraseña;
    
    public Jugador(String nom, String pass){
        this.nombre = nom;
        this.contraseña = pass;
         
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
//    public class partidas_contra_otro(Jugador j){
//        
//    }
}
