public class Pinguino extends Ave{
  //atributos  de clase
  private static int cantidadPinguinos = 0;
  //atributos de instancia
  private String tipo = "";
  private String tamano = ""; //S,M,L,XL
  /**
   * Devuelve el tipo
   * @return tipo
   */
  public String GetTipo(){
    return this.tipo;
  }
  /**
   * Gestiona el tipo 
   */
  void SetTipo(String Tipo){
    this.tipo = Tipo;
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
  
  public Pinguino(int edad,String Nombre){
    super();
    cantidadPinguinos++;
    SetEdad(edad);
    SetNombre(Nombre);
    SetSonido("sonido de pinguino");
    SetTipo("");
    Settamano("");
    SettiempoNido(4); //semanas
    SetmesesIncubacion(28); //dias
    
  }
  /**
   * Mete en ficha los datos del pinguino
   * (no se incluyen los elementos genericos del pinuino)
   */
  public String toString() {
    String ficha;
    String s ="\n";
    ficha = "Nombre: " + this.GetNombre()+s;
    ficha +="Edad: " +this.getEdad()+" meses"+s;
    ficha +="Tamano: "+ this.GetTamano()+" (S,M,L,XL)"+s;
    ficha +="Tipo: "+ this.GetTipo()+s;
    ficha +="Peso: "+ this.GetPeso()+" gramos"+s;
    ficha +="Distancia recorrida: "+ this.GetKilometrosRecorridos()+" metros"+s;
    return ficha;
  }
}