public class Gato extends Mamifero{
  //atributos  de clase
  private static int cantidadGatos = 0;
  //atributos de instancia
  private int vidas = 7;
  private String raza = "";
  /**
   * Devuelve las vidas restantes
   * @return vidas
   */
  public int GetVida(){
    return this.vidas;
  }
  /**
   * Gestiona las vidas del gato
   */
  void SetVidas(int vidas){
    this.vidas = vidas;
  }
  /**
   * Devuelve la raza del gato
   * @return
   */
  public String GetRaza(){
    return this.raza;
  }
  /**
   * Crea/cambia la raza del gato
   * @param Raza
   */
  void SetRaza(String Raza){
    this.raza = Raza;
  }
  /**
   * Crea la ficha 
   * @param edad (meses)
   * @param Nombre
   */
  
  public Gato(int edad,String Nombre){
    super();
    cantidadGatos++;
    SetEdad(edad);
    SetNombre(Nombre);
    SetSonido("Miaau");
    SetVidas(7);
    SettiempoLactancia(5); //semanas
    SetmesesGestacion(65); //meses
    
  }
  /**
   * Mete en ficha los datos del gato: Nombre, raza, vidas, peso, distancia recorrida
   * (no se incluyen los elementos genericos del gato)
   */
  public String toString() {
    String ficha;
    String s ="\n";
    ficha = "Nombre: " + this.GetNombre()+s;
    ficha +="Edad: " +this.getEdad()+" meses"+s;
    ficha +="Raza: "+ this.GetRaza()+s;
    ficha +="Vidas: "+ this.GetVida()+s;
    ficha +="Peso: "+ this.GetPeso()+" gramos"+s;
    ficha +="Distancia recorrida: "+ this.GetKilometrosRecorridos()+" metros"+s;
    return ficha;
  }
}