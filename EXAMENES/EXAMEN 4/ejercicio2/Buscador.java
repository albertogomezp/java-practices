import java.util.HashMap;
/**
 * @author Alberto Gómez Peña 1º-DAW
 * Actualmente el uso de la funcion println() esta desarrollada por mi persona, como metodo para ahorrar tiempo y espacio a la hora de programar
 * habrá quine diga que soy un vago, pero es eficiente (o no...?)
 */
public class Buscador{
  static HashMap<String, String> Frases = new HashMap<String, String>();
  static int entrada = 0;
  public static void main(String[] args) {
    while(entrada != 4){
      printMenu();
      selector();
    }
    
    
    
    
  }
  
  /**
  * Método revolucionaro para la simplificación y ahorro de memoria al realizar impresiones mediante la consola de la JVM 
  * Incluye la caracteristica de retorno de carro.
  * @param imp Lo deseado para su impresionante impresión por pantalla
  */
  public static void println(String imp){
    System.out.println(imp);
  }
  /**
  * Imprime el menu del gestor
  */
  public static void printMenu(){
    println("----------------------------");
    println("BUSCADOR DE PALABRAS Y FRASES V1.0 ");
    println("1. Buscar Frase");
    println("2. Borrar palabra y frase");
    println("3. Mostrar Diccionario");
    println("4. Salir del programa");
    println("----------------------------");
    entrada = Integer.parseInt(System.console().readLine()); 
  }
  public static void selector(){
    switch (entrada){
      case 1:
      buscapalabra();
      break;
      case 2:
      borraEntrada();
      break;
      case 3:
      MostrarDiccinario();
      break;
      case 4:
      println("Saliendo del buscador...");
      break;
      default:
      println("ERROR, ESE PROGRAMA NO EXISTE (eres tester?)");
      break;
    }
  }
  /**
  * Funcion que busca una frase a partir de una palabra
  * si no la encuentra, creara la entrada.
  */
  public static void buscapalabra(){
    println("Introduzca  una palabra");
    String Busqueda = System.console().readLine();
    String Resultado = Frases.get(Busqueda);
    if(Resultado !=null){
      System.out.println(Busqueda+" corresponde con: "+Resultado);
    }  
    else{
      println("Esa palabra no existe, introduzca una frase para añadirla al registro");
      String Nueva = System.console().readLine();
      Frases.put(Busqueda, Nueva);
    }
  }  
  /**
   * Borra una entrada a partir de la palabra
   */
  public static void borraEntrada(){
    println("Introduzca  una palabra");
    String Busqueda = System.console().readLine();
    String Resultado = Frases.get(Busqueda);
    if(Resultado !=null){
      System.out.println(Busqueda+" : "+Resultado);
    }  
    else{
      println("Esa palabra no existe");
    }
    println("Atencion, esta a punto de borrar esta entrada, por favor, introduzca de nuevo la palabra para confirmar la accion");
    String confirmacion = System.console().readLine();
    if(confirmacion.equals(Busqueda)){
      Frases.remove(Busqueda);
      println("Borrado ejecutado con exito.");
    }
    else{
      println("Error, las entradas no coinciden. Vuelva a intentarlo");
    }
  }
  
  public static void MostrarDiccinario(){
    System.out.println(Frases); //Esto podria ser mas bonito, si sobra tiempo, se arreglara
  }
  
}