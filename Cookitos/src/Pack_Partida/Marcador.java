package Pack_Partida;

/**
 *
 * @author Jose Manuel
 */
public class Marcador {
    private int puntos_j1;
    private int puntos_j2;
    
    public Marcador(int p1,int p2){
        this.puntos_j1 = p1;
        this.puntos_j2 = p2;
    }
    
    public int getPuntosJ1(){
        return this.puntos_j1;
    }
    
    public int getPuntosJ2(){
        return this.puntos_j2;
    }
    
}
