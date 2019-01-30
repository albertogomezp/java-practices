public abstract class  Arma{
  public static int CantidadArmas;
  public String Nombre;
  public int Municion;
  public int Calibre;

  public Arma() {
    this("",0,0);
  }

  public Arma(String Nombre, int Municion, int Calibre) {
    this.Nombre = Nombre;
    this.Municion = Municion;
    this.Calibre = Calibre;
  }

  public String getNombre() {
    return this.Nombre;
  }

  public void setNombre(String Nombre) {
    this.Nombre = Nombre;
  }

  public int getMunicion() {
    return this.Municion;
  }

  public void setMunicion(int Municion) {
    this.Municion = Municion;
  }

  public int getCalibre() {
    return this.Calibre;
  }

  public void setCalibre(int Calibre) {
    this.Calibre = Calibre;
  }

  public Arma Nombre(String Nombre) {
    this.Nombre = Nombre;
    return this;
  }

  public Arma Municion(int Municion) {
    this.Municion = Municion;
    return this;
  }
  public Arma Calibre(int Calibre) {
    this.Calibre = Calibre;
    return this;
  }

  

  @Override
  public String toString() {
    return 
      " Nombre='" + getNombre() + "'" +
      ", Municion='" + getMunicion() + "'" +
      ", Calibre='" + getCalibre();
  }



}