package Pack_Jugador;

/**
 *
 * @author sohaib, Jose, Laura
 */

public class Jugador {
    private String nombre;
    private String contrasena;
    //public boolean admin; 
    private int puntos;
     private int puntosVictoria, puntosVictoria2,puntosEmpate, puntosP;
    
    //CONSTRUCTORES
    public Jugador(String nom, String pass){
        this.nombre=nom;
        this.contrasena=pass;
    }
    
    public Jugador(){
    }
    
    //GET y SET
    public String getNombre(){
        return nombre;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }
    
//    public void setAdmin(){
//        this.admin=true;
//    }
//    
//    public boolean getAdmin(){
//        return(this.admin);
//    }
    
    public String[] getJugador() {
            String[] temp = {this.nombre,this.contrasena};
            return(temp);
	}
    
    //METODOS
//    public class partidas_contra_otro(Jugador j){
//        
//    }

  
}
