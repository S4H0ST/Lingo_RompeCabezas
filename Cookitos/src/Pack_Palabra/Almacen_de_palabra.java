package Pack_Palabra;

import java.io.*;
import java.util.ArrayList;
import Pack_Config.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Almacen_de_palabra implements Serializable {

    
    private Almacen_Configuracion almacen;

    public Almacen_de_palabra() {
       
    }

    public ArrayList<String> getPalabras_de_cinco() {
        return almacen.getPalabras_partida1();
    }
    
    public void cargar_Fichero() {
        try {
            ObjectInputStream cargaFichero = new ObjectInputStream(new FileInputStream("Fichero_Configuracion.txt"));
            almacen = (Almacen_Configuracion) cargaFichero.readObject();
            //System.out.println(almacen.toString());
            //almacen.getPalabras_partida1();
            for (int i = 0; i <= almacen.getPalabras_partida1().size(); i++) {
                if (almacen.getPalabras_partida1().size() == 5) {

                }

            }

        } catch (IOException ex) {
            Logger.getLogger(Almacen_de_palabra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Almacen_de_palabra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
