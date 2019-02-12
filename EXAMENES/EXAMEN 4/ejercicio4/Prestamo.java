import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author Alberto Gomez Peña
 */
public class Prestamo{
  static ArrayList<Libro> Libros = new ArrayList<Libro>();
  static ArrayList<Revista> Revistas = new ArrayList<Revista>();

  
  
  public static void main(String[] args) {
    Libros.add(new Libro());
    Libros.add(new Libro(1, "Un libro", 1233));
    Libros.add(new Libro(2, "Otro libro",2012));
    Revistas.add(new Revista());
    Revistas.add(new Revista(321, "Magazine", 2012, 1));
    Revistas.add(new Revista(1,"Nombre de revista", 2013, 2));

    Libro cambiador = Libros.get(0);
    cambiador.setPrestado();
    Libros.set(0, cambiador);
    System.out.println("----------------");
    System.out.println(Libros.get(0));
    System.out.println("----------------");
    System.out.println(Libros.get(1));
    System.out.println("----------------");
    System.out.println(Libros.get(2));
    System.out.println("----------------");
    System.out.println(Revistas.get(0));
    System.out.println("----------------");
    //(Items.get(2)).isPrestado();
    //(Items.get(1)).setNoPrestado();
    System.out.println("----------------");
    System.out.println(Libros.get(1));
    
    
  }
  
}
