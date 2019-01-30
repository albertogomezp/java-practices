public class Pistola extends Arma{
  public static int CantidadPistolas;
  public Pistola(String Nombre, int Municion, int Calibre){
    super(Nombre, Municion, Calibre);
    CantidadArmas++;
    CantidadPistolas++;
  }

  public Pistola() {
    super("Nombre", 0, 0);
    CantidadArmas++;
    CantidadPistolas++;
  }
  public Pistola(String Nombre){
    this.Nombre = Nombre;
  }
  
  @Override
  public String toString() {
    return "Nombre: "+this.getNombre()+" Calibre: "+this.getCalibre()+" Municion: "+this.getMunicion();
  }
  public void Recargar(int Recarga){
    this.Municion += Recarga;
  }
  public void Disparar(){
      this.Municion --;
      System.out.println("PIUM");
  }


}