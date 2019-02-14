public class Gestor{
  public static void main(String[] args) {
    println("Introduzca la altura del reloj de arena a pintar");
    int altura = Integer.parseInt(System.console().readLine());
    Reloj.imprime(altura);
  }

  /**
  * Método revolucionaro para la simplificación y ahorro de memoria al realizar impresiones mediante la consola de la JVM 
  * Incluye la caracteristica de retorno de carro.
  * @param imp Lo deseado para su impresionante impresión por pantalla
  */
  public static void println(String imp){
    System.out.println(imp);
  }
}