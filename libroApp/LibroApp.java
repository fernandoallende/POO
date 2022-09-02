
package libroApp;

import Libro.Libro;
import servicio.LibroServicio;


public class LibroApp {

   
    public static void main(String[] args) {
      
        LibroServicio ej1 = new LibroServicio();
        
        Libro l1 = ej1.CreaLibro();
        
        ej1.info(l1);
        
        
    }
    
}
