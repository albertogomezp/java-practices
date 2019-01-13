public class Ave extends Animal{
  //Atributos de clase
  private static int cantidadAves = 0;
  //Atributos de instancia
  private  int mesesIncubacion = 0;
  private  int tiempoNido = 0;
  /**
   * Inicializa las Aves
   */
  public Ave(){
    super();
    Ave.cantidadAves++;
    this.mesesIncubacion = 0;
    this.tiempoNido = 0;
  } 
  /**
   * Devuelve los meses de incubacion del animal
   * @return mesesIncubacion
   */
  public int GetmesesIncubacion(){
    return this.mesesIncubacion;
  }
  /**
   * Genera los meses de incubacion
   * @param incubacion
   */
  void SetmesesIncubacion(int incubacion){
    this.mesesIncubacion = incubacion;
  }
  /**
   * Devuelve el tiempo en el nido del animal
   * @return tiempoNido.
   */
  public int Gettiempoido(){
    return this.tiempoNido;
  }
  /**
   * Obtiene cuantas aves hay
   * @return CantidadAves
   */
  public int GetNumeroAves(){
    return this.cantidadAves;
  }
  /**
   * General el tiempo que debe pasar en el nido hasta abandonarlo.
   * @param nido
   */
  void SettiempoNido(int nido){
    this.tiempoNido = nido;
  }






}