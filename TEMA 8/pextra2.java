import java.util.Scanner;
import funciones.acciones;

/**
 * Cálculo del método d'Hondt, para calcular los escaños de varios partidos.
 * 
 * @author Alberto Gómez Peña (https://www.github.com/albertogomezp), Francisco José Romero Medina (https://www.github.com/fromero98)
 */
public class elecciones{
  
  private static void recorrerArrayString( String[] array ) {
    for ( String val: array ) {
      System.out.printf( " %s ", val );
    }
  }
  private static void recorrerArrayLong( long[] array ) {
    for ( long val: array ) {
      System.out.printf( " %d ", val );
    }
  }
  
  /**
   * Calcular un porcentaje.
   * @param valorEntrada número original.
   * @param porcentaje porcentaje que queremos obtener.
   * @return long que vale el porcentaje% de valorEntrada.
   */
  private static long calculoPorcentaje( int valorEntrada ) {
    return valorEntrada * 3 / 100;
  }
  
  /**
   * Calculo del porcentaje inverso. Devuelve un porcentaje.
   * @param valorEntrada número original
   * @param valorSobreEntrada número que queda tras hacer el porcentaje de la entrada.
   * @return double como porcentaje del valorSobreEntrada sobre el valorEntrada.
   */
  private static double calculoPorcentajeInverso( int valorEntrada, int valorSobreEntrada ) {
    return 100 * valorSobreEntrada / valorEntrada;
  }
  //--------------------------------------------------------------------------------------------------------> INICIO DEL CODIGO PRINCIPAL <-------------
  public static void main(String[] args) {
  Scanner MeterCosas = new Scanner(System.in);
  System.out.println("Introduzca el numero de partidos");
  String Introduccion = MeterCosas.nextLine();
  String [] nombrePartidos = new String[Introducccion];
	long [] VotosPorPartido = new long[Introducccion];
  long VotosTotales = 0;
  /*--> Como nos dan igual los nombre de los partidos, vamos a trabajar solo con sus votos. 
   * VotosPorPartido[0] = numero de votos del primer partido
   * VotosPorPartido[1] = numero de votos del segundo partido
   * VotosPorPartido[2] = numero de votos del tercer partido
   */
  long temp= 0;
  for(int i = 1; i <= Introduccion; i++){
    //--> As
    System.out.println("Introduzca el nombre del partido");
    PartidoVotos[i] = MeterCosas.nextLine();
    //--> Asignacion de votos
    System.out.println("Introduzca el numero de votos");
    temp = MeterCosas.nextLine();
    VotosPorPartido[i] = temp;
    VotosTotales += temp;
  }	
  int NumEsc = 55; //Numero de escanyos
  int calculoPorcentaje = 0;
  double calculoPorcentajeInverso = 0;
  for(int EscAct = 1;  EscAct <= NumEsc; EscAct++){
    
    
    
    
  }
  //funcion eliminar del reparto los partidos menos votados --- https://codeshare.io/21X9Jn
    
  //Funcion asignar escaños --> https://codeshare.io/axxEWD
  
  //f
	}
}