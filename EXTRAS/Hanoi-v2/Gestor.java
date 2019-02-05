/**
* @author ALberto Gómez Peña
* Gestor
*/
public class Gestor {
  public static void main(String[] args) {
    int origen = 0;
    int destino = 0;
    boolean ganar = false;
    int aros;
    int ancho;
    int numerotorres;
    //Preparar el relleno
    System.out.println("Indique el numero de aros: ");
    aros = Integer.parseInt(System.console().readLine());
    ancho = (aros*2)+1;
    String[] rellenar2 = new String[aros+1];
    rellenar2=rellenoTorres(aros);
    // Inicializa el tablero
    System.out.println("Indique el numero de Torres: ");
    numerotorres = Integer.parseInt(System.console().readLine());
    Torre[] torres = new Torre[numerotorres];
    for(int x = 0; x < numerotorres; x++){
      torres[x] = new Torre(aros);
    }
    
    //Mete los aros en la primera torre
    for(int cont = 0; cont <aros; cont++){
      torres[0].setRelleno(aros-cont,cont);
      torres[0].setAlturaRelativa(cont+1);
    }   
    //Bucle
    while (origen !=-1 && destino !=-1 && ganar == false){
      for(int x = aros-1; x>=0; x--){
        for(int parte = 0; parte <numerotorres; parte++){
          System.out.print(rellenar2[torres[parte].Relleno[x]]);
        }
        System.out.println(" ");
      }
      System.out.print("Torre de Origen - ");
      origen = introducirValor();

      System.out.print("Torre de Destino - ");
      destino = introducirValor();
      
      torres[origen-1].moverAro(torres[destino-1]);      
      ganar = checkHanoi(torres, numerotorres, aros, ganar);
    }  
  }
  /**
   * Genera los aros para la primera torre
   * @param aros El numero de aros que tendrá nuestro juego
   */
  public static String[] rellenoTorres(int aros){
    String[] rellenar = new String[aros+1];
    String[] rellenar2 = new String[aros+1];
    String centro = "|";
    String espacios ="";
    String relleno ="";
    //Crea los prints futuros
    for(int cont = 0; cont <=aros; cont++){
      espacios = espacios.concat(" ");
      for(int cont2= 1; cont2<=(aros-cont);cont2++){
        relleno = relleno.concat("=");
      }
      rellenar[cont]=(espacios+relleno+centro+relleno+espacios);
      //System.out.println(rellenar[cont]);
      relleno="";
    }
    for(int cont = 0; cont <=aros; cont++){
      rellenar2[cont]=rellenar[aros-cont];
    }
    return rellenar2;
  }
  /**
   * Comrpueba si se ha ganado
   * @param torres array de torres
   * @param numerotorres cuantas torres hay
   * @param aros cuantos aros hay
   * @param ganar
   * @return ganar si se cumple la condicion
   */
  public static boolean checkHanoi(Torre[] torres, int numerotorres, int aros, boolean ganar){
    if(torres[numerotorres-1].getAlturaRelativa()==aros){
      ganar = true;
      System.out.println("VICTORIA MAGISTRAL");
    }
    return ganar;
  }
  public static int introducirValor(){
    boolean correcto = false;
    int valor = 0;
    while(correcto == false){
      System.out.println("introduzca un valor: ");
      String introduccion = System.console().readLine();
      if(introduccion.equals("1") ==true || introduccion.equals("-1") ==true || introduccion.equals("2") ==true || introduccion.equals("3") ==true){
        valor = Integer.parseInt(introduccion);
        correcto = true;
      }
    }
    return valor;
  }
}