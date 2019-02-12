/**
 * @author Alberto Gomez Peña
 */
public class Persona{
  public static int Personas = 0;
  private String DNI = "00000000X";
  private String Nombre = "Nombre Generico";


  public Persona() {
   Personas++;
  }

  public Persona(String Nombre) {
    this.Nombre = Nombre;
    Personas++;
   }

  public Persona(String DNI, String Nombre) {
    this.DNI = DNI;
    this.Nombre = Nombre;
    Personas++;
  }

  public String getDNI() {
    return this.DNI;
  }

  public void setDNI(String DNI) {
    this.DNI = DNI;
  }

  public String getNombre() {
    return this.Nombre;
  }

  public void setNombre(String Nombre) {
    this.Nombre = Nombre;
  }





  @Override
  public String toString() {
    return "PERSONA: "+this.Nombre+"\nDNI: "+this.DNI;
  }

}