package Pack_Jugador;

/**
 *
 * @author sohaib, Jose, Laura
 */

public class Jugador {
    private String nombre;
    private String contraseña;
    public boolean admin; 
    
    //CONSTRUCTORES
    public Jugador(String nom, String pass){
        if("admin".equals(getNombre())){
            this.nombre = nom;
            this.contraseña = pass;
            this.admin=false;
        }else{
        
        }   
    }
    
    public Jugador(){
    }
    
    //GET y SET
    public String getNombre(){
        return nombre;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void setAdmin(){
        this.admin=true;
    }
    
    public boolean getAdmin(){
        return(this.admin);
    }
    
    //METODOS
//    public class partidas_contra_otro(Jugador j){
//        
//    }

  
}
