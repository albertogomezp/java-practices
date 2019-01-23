public class Movil extends Terminal{
  //atributos de clase
  //atributos de instancia
  private int Tarifa;
  private String tipoTarifa;
  private double Coste;
  /**
   * Crea el movil
   * @param Tarifa (1. Rata, 2. Mono, 3. Bisonte)
   */
  public Movil(String Number, int Tarifa){
    super();
    Setnumero(Number);
    this.Tarifa = Tarifa;
    switch (Tarifa){
      case 1:
      this.tipoTarifa ="rata";
      this.Coste = 0.06;
      break;
      case 2:
      this.tipoTarifa ="mono";
      
      this.Coste = 0.12;
      break;
      case 3:
      this.tipoTarifa ="bisonte";
      this.Coste = 0.30;
      break;
    }
  }
  /**
  * Devuelve la tarifa del numero
  * @return la tarifa que posee
  */
  public int Gettarifa(){
    return this.Tarifa;
  }
  /**
  * Devuelve el coste/minuto de su tarifa
  * @return coste
  */
  public double Getcoste(){
    return this.Coste;
  }
  public String toString(){
    return "Numero: " + this.Getnumero() + " Minutos: "+this.Getminutos()+" Tarifa"+this.Gettarifa()+" Coste: "+((this.Getminutos()/60)*this.Getcoste());
  }
  
}