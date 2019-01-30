public class Gato{
  private static int CantidadGatos;
  private int Edad = 0 ; 
  private String NombreGato ="Gato";
  /**
   * Crea la clase gato
   */

  public Gato() {
  }

  public Gato(int Edad, String NombreGato) {
    this.Edad = Edad;
    this.NombreGato = NombreGato;
  }

  public int getEdad() {
    return this.Edad;
  }

  public void setEdad(int Edad) {
    this.Edad = Edad;
  }

  public String getNombreGato() {
    return this.NombreGato;
  }

  public void setNombreGato(String NombreGato) {
    this.NombreGato = NombreGato;
  }

  public Gato Edad(int Edad) {
    this.Edad = Edad;
    return this;
  }

  public Gato NombreGato(String NombreGato) {
    this.NombreGato = NombreGato;
    return this;
  }

  @Override
  public String toString() {
    return "{" +
      " Edad='" + getEdad() + "'" +
      ", NombreGato='" + getNombreGato() + "'" +
      "}";
  }
   
  
}