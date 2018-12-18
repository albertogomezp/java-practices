package funct;
import java.util.Scanner;
/**
 * @author Alberto Gómez Peña 1ºDAW
 */
public class system{  
  /**
  * Mete en un array el nº de personas y su respectivo peso
  * @return el array
  */
  public static int[] personas() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduzca el numero de personas que hay en el ascensor: ");
    int selection = scanner.nextInt();
    int[] personas = new int[selection];
    for(int cont = 0; cont <selection; cont++){
      System.out.print("Introduzca el peso de la persona "+(cont+1)+": ");
      
      personas[cont] = scanner.nextInt();
    }   
    return personas;
  }
  
  /***
  * 
  * @return Devuevle peso máximo y personas máximas
  */
  public static int[] Ascensor() {
    Scanner scanner = new Scanner(System.in);
    int[] Ascensor   = new int[2];
    System.out.print("Introduzca el peso maximo: ");
    Ascensor[0] = scanner.nextInt();
    System.out.print("Introduzca el numero maximo de personas: ");
    Ascensor[1] = scanner.nextInt();
    return Ascensor;
  }
  /**
  * 
  * @param Ascensor Array que indica peso y personas maximas
  * @param personas Array que indica el peso de cada persona
  * @return Si el ascensor asciende o no
  */
  public static boolean comparacion(int[] Ascensor,int[] personas) {
    boolean ascenso = true;
    int pesototal = 0;
    for(int cont = 0; cont <personas.length; cont++){
      pesototal += personas[cont];
    }
    if(pesototal>Ascensor[0] || (personas.length)>Ascensor[1]){
      System.out.print("NO SE PUEDE SUBIR");
      ascenso = false;
    }
    else{
      System.out.print("SE PUEDE SUBIR");
      ascenso =  true;
    }
    return ascenso;
  }
  /**
   * 
   * @param pantalla array de posiciones. Lo usaremos como indicador
   * @return devuelve las  posiciones al programa
   */
  public static char[] pantalla (char[] pantalla){
    Scanner scanner = new Scanner(System.in);
    int planta = PlantaActual(pantalla);
    System.out.print("\nPLANTA ACTUAL "+planta+"\nPLANTA DESTINO: ");
    int destino = scanner.nextInt();
    if(planta<destino){
      pantalla = subirPlanta(pantalla, planta, destino);
    }
    if(planta>destino){
      pantalla = bajarPlanta(pantalla, planta, destino);
    }
    if(planta==destino){
      System.out.println("ESTAS EN ESA PLANTA");
    }
    planta = GuardarPlanta(planta, destino);
    return pantalla;
  }
  /**
  * 
  * @param pantalla Array de plantas
  * @param planta Planta actual
  * @param destino planta destino
  * @return el array en la nueva posicion + impresion de la animación de subida
  * @throws InterruptedException
  */
  public static char[] subirPlanta (char[] pantalla,int planta,int destino) {
    //System.out.println("("+destino+")");
    for(int i = planta; i<destino; i++){
      pantalla[i]=' ';
      pantalla[(i+1)]='*';  
      System.out.println("3 ["+pantalla[3]+"]\n2 ["+pantalla[2]+"]\n1 ["+pantalla[1]+"] \n0 ["+pantalla[0]+"] (bajo)");
    }
    return pantalla;
  }
  /**
  * 
  * @param pantalla Array de plantas
  * @param planta Planta actual
  * @param destino planta destino
  * @return el array en la nueva posicion + impresion de la animacion de bajada
  * @throws InterruptedException
  */
  public static char[] bajarPlanta (char[] pantalla,int planta,int destino) {
    for(int i = planta; i>destino; i--){
      pantalla[i]=' ';
      pantalla[i-1]='*';  
      System.out.println("3 ["+pantalla[3]+"]\n2 ["+pantalla[2]+"]\n1 ["+pantalla[1]+"] \n0 ["+pantalla[0]+"] (bajo)");
    }
    return pantalla;
  }
  /**
  * 
  * @param pantalla array que indica donde esta el ascensor
  * @return sacamos en int la planta
  */
  public static int PlantaActual (char[] pantalla) {
    int planta  = 0;    
    for(int i = 0; i>pantalla.length; i++){
      if(pantalla[i] == '*'){
        planta = i;
      }
    }
    return planta;
  }
  /**
   * 
   * @param pantalla array de pantalla
   * @return Pantalla inicializada en la planta 0
   */
  public static char[] SetPlanta () {
    char[] pantalla = new char[4];
    pantalla[0]='*';
    for(int i = 1; i>pantalla.length;i++){
      pantalla[i] = ' ';
    }
    System.out.println("3 ["+pantalla[3]+"]\n2 ["+pantalla[2]+"]\n1 ["+pantalla[1]+"] \n0 ["+pantalla[0]+"] (bajo)");
    return pantalla;
  }
  public static int GuardarPlanta (int planta,int destino) {
    planta = destino;
    return planta;
  }
}
