import java.util.ArrayList;

public class Torre {
  private ArrayList<Disco> pilaDeDiscos = new ArrayList<Disco>();
  
  public Torre() {
  }
  
  public void apilaDisco(Disco x) {
    this.pilaDeDiscos.add(x);
  }

  public Disco sacaDisco() {
    Disco resultado = this.miraDisco();
    pilaDeDiscos.remove(pilaDeDiscos.size()-1);
    return resultado;
  }
  
  public Disco miraDisco() {
    Disco resultado = pilaDeDiscos.get(pilaDeDiscos.size()-1);
    return resultado;
  }
  
  public Disco miraDisco (int indice) {
    // indice entendido como indice real
    Disco resultado = pilaDeDiscos.get(indice);
    return resultado;
  }
  
  public int alturaTorre () {
    return pilaDeDiscos.size();
  }
}