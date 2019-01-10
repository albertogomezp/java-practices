public class Bicicleta extends Vehiculo{
  private int pinones;  //Atributo; numero de piñones.
  public   Bicicleta(int p) {
    super(); //Hace llamada a la clase principal, pues Bicicleta es subclase de Vehiculo.
    this.pinones = p;   //Iguala pinones a p.
  }
  /**
   * Como no devuelve nada, es void.
   * Tampoco trae ningún parámetro.
   */
  public void hazCaballito() { 
    System.out.println("Estoy haciendo el caballito");
    
  }
}