public class Canario extends Ave{
  //atributos  de clase
  private static int cantidadCanarios = 0;
  //atributos de instancia
  private String color = "";
  private String tamano = ""; //S,M,L,XL
  /**
   * Devuelve el color
   * @return color
   */
  public String getColor(){
    return this.color;
  }
  /**
   * Gestiona el color 
   */
  void SetColor(String Color){
    this.color = Color;
  }
  /**
   * Devuelve el tamanno
   * @return tamanno (S,M,L,XL)
   */
  public String GetTamano(){
    return this.tamano;
  }
  /**
   * Crea/cambia el tamano
   * @param tamano
   */
  void Settamano(String tamano){
    this.tamano = tamano;
  }
  /**
   * Crea la ficha 
   * @param edad (meses)
   * @param Nombre
   */
  
  public Canario(int edad,String Nombre){
    super();
    cantidadCanarios++;
    SetEdad(edad);
    SetNombre(Nombre);
    SetSonido("Pio pio");
    SetColor("");
    Settamano("");
    SettiempoNido(4); //semanas
    SetmesesIncubacion(28); //dias
    
  }
  /**
   * Mete en ficha los datos del canario
   * (no se incluyen los elementos genericos del canario)
   */
  public String toString() {
    String ficha;
    String s ="\n";
    ficha = "Nombre: " + this.GetNombre()+s;
    ficha +="Edad: " +this.getEdad()+" meses"+s;
    ficha +="Tamano: "+ this.GetTamano()+" (S,M,L,XL)"+s;
    ficha +="Color: "+ this.getColor()+s;
    ficha +="Peso: "+ this.GetPeso()+" gramos"+s;
    ficha +="Distancia recorrida: "+ this.GetKilometrosRecorridos()+" metros"+s;
    return ficha;
  }
}