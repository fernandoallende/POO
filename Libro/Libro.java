
package Libro;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
*/
public class Libro {
    // Atributos 
   private Integer ISBN;
   private String titulo;
   private  String autor;
   private  Integer numeroDePagina ;
   
    //Metodo contructo vacio 
    public Libro() {
    }
    //Metodo contructor por parametro 
    public Libro(Integer ISBN, String titulo, String autor, Integer numeroDePagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePagina = numeroDePagina;
    }
        //Metodos gett y sett
    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(Integer numeroDePagina) {
        this.numeroDePagina = numeroDePagina;
    }
        
    
   
   
    
    
}
