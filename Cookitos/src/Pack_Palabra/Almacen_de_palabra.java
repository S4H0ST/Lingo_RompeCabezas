package Pack_Palabra;

import java.io.*;
import java.util.ArrayList;
import Pack_Config.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Almacen_de_palabra implements Serializable {

    private Almacen_Configuracion infoConfig= new Almacen_Configuracion();

    public Almacen_de_palabra() {
       
    }

    public ArrayList<String> getPalabras_de_cinco() {
        
        return this.infoConfig.getPalabras_partida1();
    }
    

    public void cargar_Fichero(){
        try {       
            ObjectInputStream cargaFichero = new ObjectInputStream(new FileInputStream("Fichero_Configuracion.txt")); //para ver el contenido del fichero
             //(SE CARGA EL FICHERO) ---------------objeto de tipo Almacen de configuracion para sacar el contenido del fichero 
            this.infoConfig = (Almacen_Configuracion)cargaFichero.readObject(); //COMO EL FICHERO TIENE CONTANIDO DE TIPO ALMACEN DE CONFIGURACION HACEMOS UN CASTING PARA METERLO EN OTRO OBJETO Y SACARLO
            
             //System.out.println("\n"+infoConfig.toString()); //ver por consola el contenido del fichero
           /* System.out.println(this.infoConfig.getPalabras_partida2());
            System.out.println(this.infoConfig.getPalabras_partida1());*/
            
            cargaFichero.close();
        } catch (IOException ex) {
            Logger.getLogger(Almacen_de_palabra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Almacen_de_palabra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
