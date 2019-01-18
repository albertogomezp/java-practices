package functaros1;
public class functaros{
  /**
  * Crea las respectivas barras
  * @param Barra
  * @return
  */
  public static String[][] crearbarras(String[][] Barra){
    for(int y = 3 ; y >= 0 ; y--){
      for(int x = 0 ; x < 7 ; x++){
        if(x==3){
          Barra[x][y]="I";
        }
        else{
          Barra[x][y]=" ";
        }
      }
    }
    return Barra;
  }
  /**
  * Mete los aros en la barraI
  * @param BarraI
  * @return
  */
  public static String[][]InicializarBarra1(String[][] BarraI){
    String[] Grande =  {"*","*","*","I","*","*","*"};
    String[] Mediano = {" ","*","*","I","*","*"," "};
    String[] Pequeno = {" "," ","*","I","*"," "," "};
    String temp = " ";
    for(int y = 3 ; y >= 0 ; y--){
      for(int x = 0 ; x < 7 ; x++){
        switch(y){
          case 3:
          temp = Pequeno[x];
          BarraI[x][y] = temp;
          break;
          case 2:
          temp = Mediano[x];
          BarraI[x][y] = temp;
          break;
          case 1:
          temp = Grande[x];
          BarraI[x][y] = temp;
        }
      }
    } 
    return BarraI;
  }
  /**
  * Imprime las tres barras
  * @param BarraI
  * @param BarraC
  * @param BarraD
  */
  public static void imprimebarras(String[][] BarraI, String[][] BarraC, String[][] BarraD){
    for(int y = 3 ; y > 0 ; y--){
      for(int x = 0 ; x < 7 ; x++){
        System.out.print(BarraI[x][y]);
      }
      System.out.print(" ");
      for(int x = 0 ; x < 7 ; x++){
        System.out.print(BarraC[x][y]);
      }
      System.out.print(" ");
      for(int x = 0 ; x < 7 ; x++){
        System.out.print(BarraD[x][y]);
      }
      System.out.println(" ");
    }
  }
  /**
   * Busca el aro mas alto en la barra
   * @param Barra
   * @return posicion
   */
  public static int buscarAro(String[][] Barra,int altura){
    int z =  altura;
    boolean encontrado = false;
    while(z!=0 && encontrado==false ){
      if(Barra[2][z].equals("*")){
        encontrado = true;
      }
      else{
        z--;
      }
    }
    return z;
  }
  /**
   * Guarda en destino el aro de origen, necesita la funcion quitarAro.
   * @param BarraOrigen
   * @param BarraDestino
   * @return Barra sin aro
   */
  public static String[][] moveraro(String[][] BarraOrigen, String[][] BarraDestino,int altura){
    int posOrigen = buscarAro(BarraOrigen,altura);
    //System.out.println(posOrigen);
    int posDestino = buscarAro(BarraDestino,altura)+1;
    //System.out.println(posDestino);

    for(int z = 0; z<7; z++){
      if(BarraDestino[2][posDestino].equals(" ")){
        BarraDestino[z][posDestino] = BarraOrigen[z][posOrigen];
      }
      else{
        BarraDestino[z][posDestino] = BarraOrigen[z][posOrigen];
      }
    }
    return BarraDestino;
  }

  /**
   * Quita el aro de la barra de origen
   * @param Barra
   * @param Vacio
   * @return Barra sin aro
   */
  public static String [][] quitarAro(String[][] Barra,String[] Vacio,int altura){
    int posAro = buscarAro(Barra, altura);
    for(int z = 0; z<7; z++){
      Barra[z][posAro]=Vacio[z];
    }  
    return Barra;
  }
  /**
   * Define el aro de origen
   * @param Origen
   * @return
   */
  public static int origen(int Origen){
    Origen = -2;
    while (Origen>3 || Origen<0){
      System.out.println("INDIQUE ARO DE ORIGEN");
      Origen = Integer.parseInt(System.console().readLine());
    }
    return Origen;
  }
  /**
   * Define el aro de destino
   * @param Destino
   * @return
   */
  public static int destino(int Destino){
    Destino = -2;
    System.out.println("INDIQUE ARO DE DESTINO");
    while (Destino>3 || Destino<0){
      Destino = Integer.parseInt(System.console().readLine());
    }
    return Destino;
  }
}
