public class Perro extends Mamifero{
  //atributos  de clase
  private static int cantidadPerros = 0;
  //atributos de instancia
  private int altura = 0; 
  private String raza = "";
  /**
   * Devuelve la altura
   * @return altura
   */
  public int GetAltura(){
    return this.altura;
  }
  /**
   * Gestiona la altura
   */
  void SetAltura(int altura){
    this.altura = altura;
  }
  /**
   * Devuelve la raza del perro
   * @return
   */
  public String GetRaza(){
    return this.raza;
  }
  /**
   * Crea/cambia la raza del perro
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
  
  public Perro(int edad,String Nombre,int altura){
    super();
    cantidadPerros++;
    SetEdad(edad);
    SetNombre(Nombre);
    SetSonido("Guau!");
    SetAltura(altura);
    SettiempoLactancia(5); //semanas
    SetmesesGestacion(65); //meses
    
  }
  /**
   * Mete en ficha los datos del perro: Nombre, raza, altura, peso, distancia recorrida
   * (no se incluyen los elementos genericos del gato)
   */
  public String toString() {
    String ficha;
    String s ="\n";
    ficha = "Nombre: " + this.GetNombre()+s;
    ficha +="Edad: " +this.getEdad()+" meses"+s;
    ficha +="Raza: "+ this.GetRaza()+s;
    ficha +="Altura: "+ this.GetAltura()+s;
    ficha +="Peso: "+ this.GetPeso()+" gramos"+s;
    ficha +="Distancia recorrida: "+ this.GetKilometrosRecorridos()+" metros"+s;
    return ficha;
  }
}