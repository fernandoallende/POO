
package servicio;

import Libro.Libro;
import java.util.Scanner;


public class LibroServicio {
   
    public Libro CreaLibro(){
        
      Libro l1 =new Libro(); 
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
        System.out.println(" ingrese ISBN");
        l1.setISBN(leer.nextInt());
        System.out.println(" ingrese titulo");
        l1.setTitulo(leer.next());
        System.out.println(" ingrese autor");
        l1.setAutor(leer.next());
        System.out.println("ingrese numero de pagina ");
        l1.setNumeroDePagina(leer.nextInt());
         
        
        return l1;
  
        
} 
    
    //metodos
    public void info(Libro l1){
        
        System.out.println(" el ISBM del libro es: " +l1.getISBN());
        System.out.println(" el titular del libro es: "+l1.getTitulo());
        System.out.println(" el autor es: "+l1.getAutor());
        System.out.println(" la cantidad de pagina es de: "+l1.getNumeroDePagina());
        System.out.println(" \n");
    
}
    
     
     

 
     
}
