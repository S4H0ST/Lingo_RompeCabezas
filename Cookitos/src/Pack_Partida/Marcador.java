package Pack_Partida;

/**
 *
 * @author Jose Manuel
 */
public class Marcador {

    private int puntos_j1;
    private int puntos_j2;
    private int ronda_j1;
    private int ronda_j2;

    private boolean pediste_ayuda_palabra_j1;
    private boolean pediste_ayuda_palabra_j2;
    
    public Marcador(int p1, int p2) {
        this.puntos_j1 = p1;
        this.puntos_j2 = p2;
        this.ronda_j1 = 1;
        this.ronda_j2 = 1;

        this.pediste_ayuda_palabra_j1 = false;
        this.pediste_ayuda_palabra_j2 = false;
    }

    public int getPuntosJ1() {
        return this.puntos_j1;
    }

    public int getPuntosJ2() {
        return this.puntos_j2;
    }

    public int getRondaJ1() {
        return this.ronda_j1;
    }

    public int getRondaJ2() {
        return this.ronda_j2;
    }

    public void setPuntos_j1(int puntos_j1) {
        this.puntos_j1 += puntos_j1;
    }

    public void setPuntos_j2(int puntos_j2) {
        this.puntos_j2 += puntos_j2;
    }

    public void setRonda_j1(int ronda_j1) {
        this.ronda_j1 += ronda_j1;
    }

    public void setRonda_j2(int ronda_j2) {
        this.ronda_j2 += ronda_j2;
    }
    
    public boolean get_pedir_ayuda_p_j1(){
        return this.pediste_ayuda_palabra_j1;
    }
    public boolean get_pedir_ayuda_p_j2(){
        return this.pediste_ayuda_palabra_j2;
    }
    public void set_pedir_ayuda_palabra_j1(){
        this.pediste_ayuda_palabra_j1 = true;
    }
    public void set_pedir_ayuda_palabra_j2(){
        this.pediste_ayuda_palabra_j2 = true;
    }
}
