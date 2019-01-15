import functaros1.functaros;
public class juego{
  public static void main(String[] args) {
    String[] Grande =  {"*","*","*","I","*","*","*"};
    String[] Mediano = {" ","*","*","I","*","*"," "};
    String[] Pequeno = {" "," ","*","I","*"," "," "};
    String[] Vacio =   {" "," "," ","I"," "," "," "};
    String[][] BarraI = new String[7][4];
    String[][] BarraC = new String[7][4];
    String[][] BarraD = new String[7][4];
    int Origen = -1;
    int Destino = -1;
    
    //Prepara las barras
    BarraI = functaros.crearbarras(BarraI);
    BarraC = functaros.crearbarras(BarraC);
    BarraD = functaros.crearbarras(BarraD);
    //Mete todos los aros en la barraI
    BarraI = functaros.InicializarBarra1(BarraI);
    //bucle
    while(functaros.buscarAro(BarraD)!=3){
      
      functaros.imprimebarras(BarraI, BarraC, BarraD);
      Origen = functaros.origen(Origen);
      Destino = functaros.destino(Destino);
      switch (Origen){
        case 1:
        switch (Destino){
          case 2:
          BarraC = functaros.moveraro(BarraI,BarraC);
          break;
          case 3:
          BarraD = functaros.moveraro(BarraI,BarraD);
          break;
        }
        if(Destino!=1){
          BarraI = functaros.quitarAro(BarraI, Vacio);
        }
        break;
        
        case 2:
        switch (Destino){
          case 1:
          BarraI = functaros.moveraro(BarraC,BarraI);
          break;
          case 3:
          BarraD = functaros.moveraro(BarraC,BarraD);
          break;
        }
        if(Destino!=2){
          BarraC = functaros.quitarAro(BarraC, Vacio);
        }
        
        break;
        
        case 3:
        switch (Destino){
          case 1:
          BarraI = functaros.moveraro(BarraD,BarraI);
          break;
          case 2:
          BarraC = functaros.moveraro(BarraD,BarraC);
          break;
        }
        if(Destino!=3){
          BarraD = functaros.quitarAro(BarraD, Vacio);
        }
        break; 
      }
    }  
    functaros.imprimebarras(BarraI, BarraC, BarraD);
  
  }
}
