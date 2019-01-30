public class Fusil extends Arma{
  public static int CantidadFusiles;
  public int TipoDisparo; //1. Automatico 2. Normal  
  public Fusil(String Nombre, int Municion, int Calibre, int TipoDisparo){
    super(Nombre, Municion, Calibre);
    this.TipoDisparo = TipoDisparo;
    CantidadArmas++;
    CantidadFusiles++;
  }

  public Fusil() {
  }

  public Fusil(int TipoDisparo) {
    this.TipoDisparo = TipoDisparo;
  }
  public Fusil(String Nombre){
    this.Nombre = Nombre;
  }
  public int getTipoDisparo() {
    return this.TipoDisparo;
  }
  /**
   * 1. Automatico 2. Normal  
   * @param TipoDisparo
   */
  public void setTipoDisparo(int TipoDisparo) {
    this.TipoDisparo = TipoDisparo;
  }

  public Fusil TipoDisparo(int TipoDisparo) {
    this.TipoDisparo = TipoDisparo;
    return this;
  }
  @Override
  public String toString() {
    return " Nombre "+this.getNombre()+" Calibre"+this.getCalibre()+" Municion "+this.getMunicion()+" Tipo Disparo: "+getTipoDisparo();
  }
  public void Recargar(int Recarga){
    this.Municion += Recarga;
  }
  public void Disparar(){
    if(this.getTipoDisparo() ==1 && this.getMunicion() >=50){
      this.Municion -= 5;
      System.out.println("PIUM PIUM PIUM PIUM PIUM");
    }
    else{
      this.Municion --;
      System.out.println("PIUM");
    }
  }


}