public abstract class  Terminal{
  //Atributos de clase
  private static int cantidadTerminales;
  //Atributos de instancia
  public String numero;
  public int minutos;
  /**
  * Inicializa el terminal
  * @param Number
  
  public Terminal(String Number){
    this.numero = Number;
    minutos = 0;
  }
  */
  /**
  * Hace una llamada y registra los minutos a ambos terminales
  * @param destino
  * @param tiempo
  */
  public void llama(Terminal destino,int tiempo){
    this.minutos += tiempo;
    destino.minutos += tiempo;
  }
  /**
  * Devuelve el numero
  * @return numero
  */
  public String Getnumero(){
    return this.numero;
  }
  /**
  * Devuleve los minutos
  * @return minutos
  */
  /**
  * Perimite crear el numero
  * @param numero
  */
  public String Setnumero(String numero){
    this.numero = numero;
    return this.numero;
  }
  public int Getminutos(){
    return this.minutos;
  }  
}