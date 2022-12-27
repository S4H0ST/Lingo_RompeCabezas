package Pack_Partida;
/**
 *
 * @author sohaib, Jose, Laura
 */
import Pack_Jugador.*;
import Pack_Palabra.*;


public class Partida {
    private int identificador;
    private int numPalabras;
    private boolean regalo_de_palabra;
    private boolean primeraLetra;
    
    private Jugador j1,j2;
    
    
    private int puntosJ1;
    private int puntosJ2;
    
    Almacen_de_Partidas almacen;
    
    private boolean turno_j1;
    private boolean turno_j2;
    
    
    public Partida(Jugador j_1, Jugador j_2,int numPa, boolean p_Letra, Almacen_de_Partidas almacenar){
        
        this.j1 = j_1;
        this.j2 = j_2;
        this.numPalabras = numPa;
        this.primeraLetra = p_Letra;
        this.almacen = almacenar;
        
        
    }
    
    public void cambiarTurno(){
       if(turno_j1){
            turno_j1 = false;
            turno_j2 = true;
       }
       else{
            turno_j1 = true;
            turno_j2 = false;
        }
    }
    
    public boolean usar_Pista_de_Letra(boolean pistaL){
        
        return false;
        
    }
    
    public boolean usar_Pista_de_Palabra(boolean pistaP){
        return false;
    }
    public void actualizarMarcador(){
        Marcador m = new Marcador(puntosJ1, puntosJ2);
        //"Se han actualizado los marcadores."
    }
    
    public void info_Partida(){}
}

