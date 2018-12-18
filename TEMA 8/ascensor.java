import funct.*;
/**
*  Programa simulador de ascensores
*  @author Alberto Gómez Peña 1ºDAW
*/
public class ascensor{
  public static void main(String[] args) {
    char[] display = system.SetPlanta(); //Seteamos el ascensor y mostramos la pantalla inicial
    //int[] ascensor = system.Ascensor(); //Seteamos la configuración del ascensor
    //int[] personas  = system.personas(); //En futuras versiones podremos hacer que las personas se bajen y se suban en cada planta, hasta entonces habrá que meter siempre manualmente cuantos son. Eliminar esto y el comprobador para no tenerlos en cuenta al presentar el codigo
    //boolean comparativa = system.comparacion(ascensor,personas); //para saber si el ascensor puede levantar el peso
    for(int i = 0; i<(100);i++){
      if(true == true){ //si puede levantar el peso, comenzaremos a subir y a bajarlo.
        display = system.pantalla(display); //Vease descripción de la funcion
      }
      else{
        System.out.println("SOBREPESO");
      }
    }
    System.out.println("ASCENSOR AVERIADO");
  }
}
