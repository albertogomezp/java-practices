public class Disco {
  private int radio=0;
  
  public Disco (int rad) {
    this.radio = rad;
  }
  
  public int getRadio () {
    return this.radio;
  }
  
  public String toString() {
    String salida = "";
    for (int i=0; i<=this.radio*2; i++) {
      salida += "=";
    }
    return salida;      
  }
}