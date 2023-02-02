package programacion.tema6.biblioteca;

/**
 *
 * @author oscar
 */
public class Libro {
    private String tituloLibro;
    private String autor;
    private int numeroEjemplares;
    private int numeroPrestados;
    
    Libro () {
        }
    
    Libro (String tituloLibro, String autor, int numeroEjemplares, int numeroPrestados){
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroPrestados = numeroPrestados;
    }
    
    public void setTitulo (String setTituloLibro){
        this.tituloLibro = setTituloLibro;
    }
    
    public void setAutor (String setAutorLibro){
        this.autor = setAutorLibro;
    }
    
    public void setNumeroEjempleares (int setNumeroEjemplaresExisten){
        this.numeroEjemplares = setNumeroEjemplaresExisten;
    }
    
    public void setNumeroPrestados (int setNumeroLibrosPrestados){
        this.numeroPrestados = setNumeroLibrosPrestados;
    }
    
    public String getTitulo () {
        return this.tituloLibro;
    }
    
    public String getAutor () {
        return this.autor;
    }
    
    public int getNumeroEjemplares () {
        return this.numeroEjemplares;
    }
    
    public int getNumeroEjemplaresPrestados () {
        return this.numeroPrestados;
    }
    
    public boolean prestamo () {
        boolean res = false;
        if (this.numeroEjemplares != 0){
            res = true;
            this.numeroPrestados ++;
        }
        return res;
    }
    
    public boolean devolucion () {
        boolean res = false;
        if (this.numeroPrestados != 0){
            res = true;
            this.numeroPrestados --;
        }
        return res;
    }
    
    public String toString (){
        String res = "Libro: " + this.tituloLibro + ", Autor = " + this.numeroEjemplares + ", Número Ejemplares existentes: " + this.numeroEjemplares + ",  Número Ejemplares Prestados: " + this.numeroPrestados;
        System.out.println (this.tituloLibro + this.autor + this.numeroEjemplares + this.numeroPrestados);
        return res;
    }
}
