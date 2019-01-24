public class Mamifero extends Animal{
  //Atributos de clase
  private static int cantidadMamiferos = 0;
  //Atributos de instancia
  private  int mesesGestacion = 0;
  private  int tiempoLactancia = 0;
  /**
   * Inicializa los mamiferos
   */
  public Mamifero(){
    super();
    Mamifero.cantidadMamiferos++;
    this.mesesGestacion = 0;
    this.tiempoLactancia = 0;
  } 
  /**
   * Devuelve los meses de gestacion del animal
   * @return mesesGestacion
   */
  public int GetmesesGestacion(){
    return this.mesesGestacion;
  }
  /**
   * Genera los meses de gestacion
   * @param meses
   */
  void SetmesesGestacion(int meses){
    this.mesesGestacion = meses;
  }
  /**
   * Devuelve el tiempo de lactancia del animal
   * @return tiempoLactancia.
   */
  public int GettiempoLactancia(){
    return this.tiempoLactancia;
  }
  /**
   * Obtiene cuantos mamiferos hay 
   * @return cantidadMamiferos.
   */
  public int GetcantidadMamiferos(){
    return this.cantidadMamiferos;
  }
  /**
   * Genera el tiempo de lactancia para el tipo de animal
   */
  void SettiempoLactancia(int lactancia){
    this.tiempoLactancia = lactancia;
  }






}