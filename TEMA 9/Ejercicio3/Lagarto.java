public class Lagarto extends Animal{
  //atributos  de clase
  private static int cantidadLagartos = 0;
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
  
  public Lagarto(int edad,String Nombre){
    super();
    cantidadLagartos++;
    SetEdad(edad);
    SetNombre(Nombre);
    SetSonido("sonido de Lagarto");
    SetTipo("");
    Settamano("");
    //SettiempoNido(4); //semanas
    //SetmesesIncubacion(28); //dias
    
  }
  /**
   * Mete en ficha los datos del lagarto
   * (no se incluyen los elementos genericos del lagarto)
   */
  public String toString() {
    String ficha;
    String s ="\n";
    ficha = "Nombre: " + this.GetNombre()+s;
    ficha +="Edad: " +this.getEdad()+" meses"+s;
    ficha +="Tamano: "+ this.GetTamano()+" (S,M,L,XL)"+s;
    ficha +="Tipo: "+ this.GetTipo()+s;
    ficha +="Peso: "+ this.GetPeso()+" Kilogramos"+s;
    ficha +="Distancia recorrida: "+ this.GetKilometrosRecorridos()+" metros"+s;
    return ficha;
  }
}