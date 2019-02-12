/**
 * @author Alberto Gomez Peña
 */
public class Libro extends Item{
  private static int CantidadLibros = 0;
  private boolean prestado = false;


  public Libro() {
    super();
    CantidadLibros++;
  }
  public Libro(int Codigo, String titulo, int Anyo){
    super();
    this.setCodigo(Codigo);
    this.setTitutlo(titulo);
    this.setAnyo(Anyo);
  }
  public boolean isPrestado() {
    return this.prestado;
  }

  public boolean getPrestado() {
    return this.prestado;
  }

  public void setPrestado() {
    this.prestado = true;
  }
  public void setNoPrestado() {
    this.prestado = false;
  }




  @Override
  public String toString() {
    String ficha = "Codigo: "+this.getCodigo()+"\nTitulo:  "+this.getTitutlo()+"\nAnyo: "+this.getAnyo()+"\nEstado: ";
    if(this.getPrestado()==true){
      ficha +="prestado";
    }
    else{
      ficha +="Disponible";
    }
    return ficha;
    
  }


  
}