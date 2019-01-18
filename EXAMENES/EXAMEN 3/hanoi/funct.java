package hanoi;
public class funct{
  /**
  * Iniciliza el numeor de aros
  * @return numero de aros
  */
  public static int numeroaros(){
    System.out.println("Introduzca la cantidad de aros");
    int cant = Integer.parseInt(System.console().readLine());
    return cant;
  }
  /**
  * Crea las respectivas barras
  * @param ancho 
  * @param Barra
  * @return
  */
  public static String[][] crearbarras(String[][] Barra,int ancho,int altura){
    for(int y = altura ; y >= 0 ; y--){
      for(int x = 0 ; x < ancho ; x++){
        if(x==11){
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
  public static String[][]InicializarBarra1(String[][] BarraI,int ancho, int alto){
    String[] aro1 ={" "," "," "," "," "," "," "," "," ","=","I","="," "," "," "," "," "," "," "," "," "};
    String[] aro2 ={" "," "," "," "," "," "," "," ","=","=","I","=","="," "," "," "," "," "," "," "," "};
    String[] aro3 ={" "," "," "," "," "," "," ","=","=","=","I","=","=","="," "," "," "," "," "," "," "};
    String[] aro4 ={" "," "," "," "," "," ","=","=","=","=","I","=","=","=","="," "," "," "," "," "," "};
    String[] aro5 ={" "," "," "," "," ","=","=","=","=","=","I","=","=","=","=","="," "," "," "," "," "};
    String[] aro6 ={" "," "," "," ","=","=","=","=","=","=","I","=","=","=","=","=","="," "," "," "," "};
    String[] aro7 ={" "," "," ","=","=","=","=","=","=","=","I","=","=","=","=","=","=","="," "," "," "};
    String[] aro8 ={" "," ","=","=","=","=","=","=","=","=","I","=","=","=","=","=","=","=","="," "," "};
    String[] aro9 ={" ","=","=","=","=","=","=","=","=","=","I","=","=","=","=","=","=","=","=","="," "};
    String[] aro10={"=","=","=","=","=","=","=","=","=","=","I","=","=","=","=","=","=","=","=","=","=",};
    String temp = " ";
    for(int y = alto ; y >= 0 ; y--){
      for(int x = 0 ; x < ancho ; x++){
        switch(y){
          case 10:
          temp = aro1[x];
          BarraI[x][y] = temp;
          break;
          case 9:
          temp = aro2[x];
          BarraI[x][y] = temp;
          break;
          case 8:
          temp = aro3[x];
          BarraI[x][y] = temp;
          break;
          case 7:
          temp = aro4[x];
          BarraI[x][y] = temp;
          break;
          case 6:
          temp = aro5[x];
          BarraI[x][y] = temp;
          break;
          case 5:
          temp = aro6[x];
          BarraI[x][y] = temp;
          break;
          case 4:
          temp = aro7[x];
          BarraI[x][y] = temp;
          break;
          case 3:
          temp = aro8[x];
          BarraI[x][y] = temp;
          break;
          case 2:
          temp = aro9[x];
          BarraI[x][y] = temp;
          break;
          case 1:
          temp = aro10[x];
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
  public static void imprimebarras(String[][] BarraI, String[][] BarraC, String[][] BarraD, int ancho, int alto){
    for(int y = alto ; y > 0 ; y--){
      for(int x = 0 ; x < ancho ; x++){
        System.out.print(BarraI[x][y]);
      }
      System.out.print(" ");
      for(int x = 0 ; x < ancho ; x++){
        System.out.print(BarraC[x][y]);
      }
      System.out.print(" ");
      for(int x = 0 ; x < ancho ; x++){
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
  public static int buscarAro(String[][] Barra,int ancho,int altura){
    int z =  altura;
    boolean encontrado = false;
    while(z!=0 && encontrado==false ){
      if((Barra[9][z]).equals("=")){
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
  public static String[][] moveraro(String[][] BarraOrigen, String[][] BarraDestino,int ancho, int altura){
    int posOrigen = buscarAro(BarraOrigen, ancho, altura);
    //System.out.println(posOrigen);
    int posDestino = buscarAro(BarraDestino, ancho,altura)+1;
    //System.out.println(posDestino);
    
    for(int z = 0; z<ancho; z++){
      if(BarraDestino[10][posDestino].equals(" ")){
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
  public static String [][] quitarAro(String[][] Barra,String[] Vacio,int ancho, int altura){
    int posAro = buscarAro(Barra, ancho,altura);
    for(int z = 0; z<ancho; z++){
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
    Origen = -1;
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
    Destino = -1;
    System.out.println("INDIQUE ARO DE DESTINO");
    while (Destino>3 || Destino<0){
      Destino = Integer.parseInt(System.console().readLine());
    }
    return Destino;
  }
}  