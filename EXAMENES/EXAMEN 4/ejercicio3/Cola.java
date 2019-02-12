import java.util.ArrayList;
import java.util.HashMap;
public class Cola{
  /**
  * @author Alberto Gómez Peña 1º-DAW
  * Actualmente el uso de la funcion println() esta desarrollada por mi persona, como metodo para ahorrar tiempo y espacio a la hora de programar
  * habrá quine diga que soy un vago, pero es eficiente (o no...?)
  */
  static ArrayList<Persona> Cola = new ArrayList<Persona>();
  static int selector = 0 ;
  public static void main(String[] args) {
    while(selector != 4){
      printMenu();
      selectormenu();
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
    println("Gestor de cola V1.0 ");
    println("1. Llegar a la cola");
    println("2. Ateneder Persona");
    println("3. Revisar Cola");
    println("4. salir");
    println("----------------------------");
    selector = Integer.parseInt(System.console().readLine()); 
  }
  
  public static void selectormenu(){
    switch (selector){
      case 1:
      LlegarCola();
      break;
      case 2:
      AtenderPersona();
      break;
      case 3:
      ImprimirCola();
      break;
      case 4:
      println("Saliendo del programa gestor de cola");
      break;
      default:
      println("ERROR EN EL SISTEMA");
      break;
    }
  }
  //------------------------------------
  public static void ImprimirCola(){
    println("ORDEN DE COLA");
    for(int x = 0; x < Cola.size(); x++){
      if(Cola.get(x)!=null){
        System.out.println(Cola.get(x));
      }
    }
    
  }
  //------------------------------------
  public static void LlegarCola(){
    println("Introduzca Nombre");
    String Nombre = System.console().readLine();
    println("Introduzca DNI");
    String DNI = System.console().readLine();
  
    if(Nombre.equals("")){
      println("Evite crear una persona sin nombre, por favor.");
    }
    else{
      if(DNI.equals("")){
        Cola.add(new Persona(Nombre));
      }
      else{
        Cola.add(new Persona(DNI, Nombre));
      }
    }
  }
  public static void AtenderPersona(){
    if(Cola.size()!=0){
      println("Le toca a:");
      System.out.println(Cola.get(0));
      Cola.remove(0);
      println("Por favor, el siguiente");
    }
    else{
      println("NO QUEDA NADIE EN COLA");
    }
  }
}