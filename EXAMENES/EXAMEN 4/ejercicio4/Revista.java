/**
 * @author Alberto Gomez Peña
 */
public class Revista extends Item{
  private static int CantidadRevistas = 0;
  private int Numero = 0;
  
  public Revista() {
    super();
    CantidadRevistas++;
  }
  public Revista(int Numero){
    super();
    this.Numero = Numero;
    CantidadRevistas++;
  }
  public Revista(int Codigo, String titulo, int Anyo, int numero){
    super();
    this.setCodigo(Codigo);
    this.setAnyo(Anyo);
    this.setTitutlo(titulo);
    this.Numero = numero;
    CantidadRevistas++;
  }
  public int getNumero(){
    return this.Numero;
  }
  @Override
  public String toString() {
    return  "Codigo: "+this.getCodigo()+"\nTitulo:  "+this.getTitutlo()+"\nAnyo: "+this.getAnyo()+"\nNumero: "+this.getNumero();
    
  }
  
  
  
}
