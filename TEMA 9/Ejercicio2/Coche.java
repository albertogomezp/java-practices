public class Coche extends Vehiculo{
  private int cilindrada; //La cilindrada del motor, en centimetros cubicos
  public Coche (int c){
    super(); //llama a la clase principal (Vehiculo)
    this.cilindrada = c;
  }
  /**
   * Print
   * Hace el sonido de quemar rueda
   */
  public void quemaRueda(){
    System.out.println("Fffshhhhhhhhhhh");
  }
}