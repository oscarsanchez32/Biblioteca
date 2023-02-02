package programacion.tema6.biblioteca;

/**
 *
 * @author oscar
 */
public class TestLibro {
    Libro libro1 = new Libro("Don Quijote","Miguel Cervantes", 128, 0 );
    
    libro1.setTitulo ("El Quijote");
    
    libro1.setAutor ("Miguel de Cervantes");
    
    libro1.setNumeroEjemplares (141);
    
    libro1.setNumeroPrestados(21);
    
    libro1.prestamo();
    
    libro1.devolucion();
    
    libro1.toString();
 
    
}
