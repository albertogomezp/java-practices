package funciones;
/**
 * @author Alberto Gomez Peña 1º - DAW
 */
public class funct1{
  /**
   * Genera el numero de partidas
   * @return El numero
   */
  public static int partidas(){
    System.out.println("Cuantas partidas jugamos al tres en raya?");
    int partidas = Integer.parseInt(System.console().readLine());
    return partidas;
  }
  /**
   * Genera el juego
   * @return Array con las puntuaciones
   */
  public static int[] juego(){
    int eleccion = 0;
    int maquina = 0;
    int comparador = 0;
    int partidas = partidas();
    int[] resultados = {0,0};
    for(int rondas = 1; rondas <=partidas; rondas++){
      System.out.println("------------------ \nRonda "+rondas+"/"+partidas);
      System.out.println("  1.- Piedra \n  2.- Papel \n  3.- Tijeras");
      eleccion = Integer.parseInt(System.console().readLine());
      maquina = maquina();
      comparador = 0;
      comparador =  (eleccion*10)+maquina;
      resultados = comparar(comparador, resultados);
    }
    resultado(resultados);
    return resultados;
  }
  /**
   * Genera la eleccion de la maquina
   * @return Eleccion aleatoria
   */
  public static int maquina(){
    int maquina = (int)((Math.random())*4);
    //System.out.println(maquina);
    switch(maquina){
      case 1:
      System.out.println("Maquina: piedra");
      break;
      case 2:
      System.out.println("Maquina: papel");
      break;
      case 3:
      System.out.println("Maquina: tijeras");
      break;
    }
    return maquina;
  }
  /**
   * compara las elecciones y guarda quien gana
   * @param comparador eleccion jugador *10 + eleccion maquina
   * @param resultados un array con quien va ganando
   * @return quien ha ganado esta ronda (ya sumada en su posicion del array)
   */
  public static int[] comparar(int comparador,int[] resultados){
    switch(comparador){
      case 11:
      case 22:
      case 33:
      System.out.println("Empate");
      break;
      case 12:
      case 23:
      case 31:
      System.out.println("Has perdido esta ronda :)");
      resultados[1]++;
      break;
      case 13:
      case 32:
      case 21:
      System.out.println("Has ganado esta ronda :(");
      resultados[0]++;
      break;
    }   
    System.out.println("------------------");
    return resultados;
  }
  /**
   * Imprime por pantalla quien gana
   * @param vicJugador
   * @param vicMaquina
   */
  public static void resultado(int[] resultados){
    int vicJugador = resultados[0];
    int vicMaquina = resultados[1];
    if(vicJugador>vicMaquina){
      System.out.println("Me has ganado, que suerte...");
    }
    if (vicMaquina>vicJugador){
      System.out.println("Te he ganado, eres muy malo!");
    }
    if(vicMaquina==vicJugador){
      System.out.println("Hemos empatado...");
    }
  }
}