public abstract class Animal{
  //Atributos de clase
  private static int cantidadDeAnimales = 0;
  private static int kilometrosTotales = 0;
  //Atributos de instancia
  private  int peso = 0;
  private  int edad = 0;
  private  int kilometrosRecorridos = 0;
  private boolean descendencia = false; // false = ave; true = mamifero
  private String sonido ="";
  private String nombre ="";
  /**
  * Inicializa los atributos de cada animal que se cree
  */
  public Animal(){
    Animal.cantidadDeAnimales++; //esto se puede hacer?
    this.peso = 0;
    this.edad = 0;
    this.kilometrosRecorridos = 0;
    this.descendencia = true;
    this.sonido = "";
    this.nombre = "";
  }
  /**
  * Devuelve la edad
  * @return edad
  */
  public int getEdad(){
    return this.edad;
  }
  /**
   * Setea la edad
   * @param edad
   */
   void SetEdad(int edad){
    this.edad = edad;
  }
  /**
  * Devuelve el peso
  * @return peso
  */
  public int GetPeso(){
    return this.peso;
  }
  /**
   * Introduce el peso
   * @param peso
   */
  void SetPeso(int peso){
    this.peso = peso;
  }
  /** 
   * Reproduce el sonido del animal
   * @return sonido
   */
  public String GetSonido(){
    return this.sonido;
  }
  /**
   * Crea el sonido
   * @param Sonido
   */
  void SetSonido(String Sonido){
    this.sonido = Sonido;
  }
  public String GetNombre(){
    return this.nombre;
  }
  /**
   * Crea el nombre
   * @param Nombre
   */
  void SetNombre(String Nombre){
    this.nombre = Nombre;
  }

  /**
   * Dice el tipo de descencia
   * @return true = aves ; false = mamiferos 
   */
  public String GetDescenciendia(){
    if(descendencia == true){
      return "Pone huevos";
    }
    else{
      return "Gestacion";
    }
  }
  /**
  * Devuelve los kilometros recorridos por el animal
  * @return KilometrosRecorridos.
  */
  public int GetKilometrosRecorridos(){
    return this.kilometrosRecorridos;
  }
  /**
  * Devuelve los kilometros recorridos por todas las especies
  * @return Kilometrostotales
  */
  public int GetKilometrosTotales(){
    return Animal.kilometrosTotales;
  }
  /**
   * Obtiene cuantos animales hay
   * @return cantidadDeAnimales
   */
  public int GetnumeroAnimales(){
    return Animal.cantidadDeAnimales;
  }
  /**
   * Hace que el animal ande
   * @param x los kilometros que va a recorrer
   */
  public void recorre(int x){
    Animal.kilometrosTotales +=x;
    this.kilometrosRecorridos +=x;
  }

}