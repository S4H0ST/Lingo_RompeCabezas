package Pack_Palabra;

import java.io.*;
import java.util.ArrayList;
import Pack_Config.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Almacen_de_palabra implements Serializable {

    private Almacen_Configuracion infoConfig = new Almacen_Configuracion(); //VARIBLE DE TIPO CONFIGURACION PARA SACAR LOS DATOS Y USAR LOS METODOS DE CONFIGURACION

//CONSTRUCTOR QUE CARGA EL FICHERO
    public Almacen_de_palabra() { //AL INICIAR ESTA CLASE SE CARGA EL FICHERO ENTERO
        try {
            //(SE CARGA EL FICHERO) ---------------objeto de tipo Almacen de configuracion para sacar el contenido del fichero 

            ObjectInputStream cargaFichero = new ObjectInputStream(new FileInputStream("Fichero_Configuracion.txt")); //para ver el contenido del fichero
            this.infoConfig = (Almacen_Configuracion) cargaFichero.readObject();                                            //COMO EL FICHERO TIENE CONTANIDO DE TIPO ALMACEN DE CONFIGURACION HACEMOS UN CASTING PARA METERLO EN OTRO OBJETO Y SACARLO
            cargaFichero.close();

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Almacen_de_palabra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //METODO QUE DEVUELVE PALABRAS
    public ArrayList<String> getPalabras_de_array(int jugador) { //devolver la cadena de palabras de cada jugador
        if (jugador == 1) {
            return this.infoConfig.getPalabras_jugador1(); //DEVUELVE LAS PALABRAS DEL PRIMER JUGADOR
        } else {
            return this.infoConfig.getPalabras_jugador2(); //DEVUELVE LAS PALABRAS DEL SEGUNDO JUGADOR
        }

    }

    //METODO QUE DEVUELVE LA CONFIRMACION SI SE ENVIA PISTA O NO 
    public boolean confirmacionPista() {
        return "SI".equals(this.infoConfig.getPista()); //devuelve true si esto es cierto, es decir TRANSFORMA EL SI EN TRUE, NO EN FALSE
    }

}
