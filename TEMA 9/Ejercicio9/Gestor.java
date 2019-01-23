/**
 * Ejercicio 8 del libro
 * @author Alberto Gomez Peña
 */
public class Gestor{
  public static void main(String[] args) {
    Movil t1 = new Movil("678 11 22 33",1);
    Movil t2 = new Movil("644 74 44 69",3);
    Movil t3 = new Movil("622 32 89 09",2);
    Movil t4 = new Movil("664 73 98 18",1);
    System.out.println(t1);
    System.out.println(t2);
    t1.llama(t2, 320);
    t1.llama(t3, 200);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);
    
  }
}