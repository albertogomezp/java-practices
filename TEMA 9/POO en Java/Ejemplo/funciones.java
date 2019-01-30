public class funciones{
  /**
   * Muestra las opciones
   */
  public void opciones(){
    System.out.println(""+
      "Elija una opcion \n"+
      "1. Crear una pistola (max 10)\n"+
      "2. Crear un fusil (max 10)\n"+
      "3. Seleccionar una pistola \n"+
      "4. Seleccionar un fusil\n"+
      "5. Salir"   
      );
  }

  /**
  * Crea una pistola
  * @param Pistolas Array de pistolas
  * @param contCreadorPistola Posicion 
  * @return una pistola en la posicion dada por contCreadorPistola
  */
  public Pistola[] crearPistola(Pistola[] Pistolas, int contCreadorPistola){
    System.out.println("Indique Nombre: ");
    Pistolas[contCreadorPistola].setNombre(System.console().readLine());
    System.out.println("Indique Municion: ");
    Pistolas[contCreadorPistola].setMunicion(Integer.parseInt(System.console().readLine()));
    System.out.println("Indique Calibre: ");
    Pistolas[contCreadorPistola].setCalibre(Integer.parseInt(System.console().readLine()));
    contCreadorPistola++;
    return Pistolas;
  }
  /**
  * Crea un fusil
  * @param Pistolas Array de fusiles
  * @param contCreadorPistola Posicion 
  * @return un fusil en la posicion dada por contCreadorPistola
  */
  public Fusil[] crearFusil(Fusil[] Fusiles, int contCreadorFusil){
    System.out.println("Indique Nombre: ");
        Fusiles[contCreadorFusil].setNombre(System.console().readLine());
        System.out.println("Indique Municion: ");
        Fusiles[contCreadorFusil].setMunicion(Integer.parseInt(System.console().readLine()));
        System.out.println("Indique Calibre: ");
        Fusiles[contCreadorFusil].setCalibre(Integer.parseInt(System.console().readLine()));
        System.out.println("Indique Tipo de disparo (1. Automatico 2. Normal): ");
        Fusiles[contCreadorFusil].setTipoDisparo(Integer.parseInt(System.console().readLine()));
        return Fusiles;
  }
}