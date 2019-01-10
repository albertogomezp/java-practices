public abstract class Vehiculo{ //Al ser una clase generica, es abstracta.
  //Atributos de clase, solo para la clase
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  //Atributos de Instancia, lo que heredan las subclases.
  private  int kilometrosRecorridos;
  /**
   * Inicializa los kilometros recorridos al crear un vehiculo
   */
  public Vehiculo(){
    this.kilometrosRecorridos = 0;
  } 
  /**
   * Print
   * @return Los kilometros recorridos por un determinado vehiculo.
   */
  public int getKilometrosRecorridos(){
    return this.kilometrosRecorridos;
  }
  /**
   * Print
   * @return Los kilometros recorridos por todos los vehiculos.
   */
  public static int getKilometrosTotales(){
    return Vehiculo.kilometrosTotales;
  }
  /**
   * Hace que un vehículo recorra una distancia determinada.
   * <p>
   * Cuando un vehículo recorre una distancia <code>k</code>, se
   * incrementan su propio cuentakilómetros, es decir, su atributo
   * <code>kilometrosRecorridos</code> y también se incrementa la cuenta
   * global de kilómetros que recorren todos los vehículos, es decir, el
   * atributo de clase <code>kilometrosTotales</code>.
   * @param k Kilometros que se recorren.
   */
  public void recorre(int k){
    this.kilometrosRecorridos +=k;
    Vehiculo.kilometrosTotales +=k;
  }
}