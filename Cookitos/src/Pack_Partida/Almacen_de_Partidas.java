package Pack_Partida;
 import java.util.ArrayList;
/**
 *
 * @author sohaib, Jose, Laura
 */
public class Almacen_de_Partidas {
    ArrayList<Partida> partidas = new ArrayList<Partida>();
    
    public Almacen_de_Partidas(){
        
    }
    
    
    public void añadirPartida(Partida p){
        partidas.add(p);    
    }
    public void info_partidas(){}
    
}
