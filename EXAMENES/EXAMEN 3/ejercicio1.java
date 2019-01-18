import hanoi.*;
/**
 * Torres de Hanoi
 * @author Alberto Gómez Peña 1º DAW
 */
public class ejercicio1{
  public static void main(String[] args) {
    int alto = funct.numeroaros();
    int ancho = 21;
    String[] Vacio={" "," "," "," "," "," "," "," "," "," ","I"," "," "," "," "," "," "," "," "," "," "};
    String[] aro10 ={" "," "," "," "," "," "," "," "," ","=","I","="," "," "," "," "," "," "," "," "," "};
    String[] aro9 ={" "," "," "," "," "," "," "," ","=","=","I","=","="," "," "," "," "," "," "," "," "};
    String[] aro8 ={" "," "," "," "," "," "," ","=","=","=","I","=","=","="," "," "," "," "," "," "," "};
    String[] aro7 ={" "," "," "," "," "," ","=","=","=","=","I","=","=","=","="," "," "," "," "," "," "};
    String[] aro6 ={" "," "," "," "," ","=","=","=","=","=","I","=","=","=","=","="," "," "," "," "," "};
    String[] aro5 ={" "," "," "," ","=","=","=","=","=","=","I","=","=","=","=","=","="," "," "," "," "};
    String[] aro4 ={" "," "," ","=","=","=","=","=","=","=","I","=","=","=","=","=","=","="," "," "," "};
    String[] aro3 ={" "," ","=","=","=","=","=","=","=","=","I","=","=","=","=","=","=","=","="," "," "};
    String[] aro2 ={" ","=","=","=","=","=","=","=","=","=","I","=","=","=","=","=","=","=","=","="," "};
    String[] aro1={"=","=","=","=","=","=","=","=","=","=","I","=","=","=","=","=","=","=","=","=","=",};
    String[][] BarraI = new String[ancho][alto+1];
    String[][] BarraC = new String[ancho][alto+1];
    String[][] BarraD = new String[ancho][alto+1];
    int Origen = -1;
    int Destino = -1;
    
    //Prepara las barras
    BarraI = funct.crearbarras(BarraI,ancho,(alto));
    BarraC = funct.crearbarras(BarraC,ancho,(alto));
    BarraD = funct.crearbarras(BarraD,ancho,(alto));
    //Mete todos los aros en la barraI
    BarraI = funct.InicializarBarra1(BarraI,ancho,alto);
    //bucle

    
    while(funct.buscarAro(BarraD,ancho, alto)!=alto || Origen!=-1 || Destino !=-1){
      funct.imprimebarras(BarraI, BarraC, BarraD,ancho,alto);
      Origen = funct.origen(Origen);
      Destino = funct.destino(Destino);
      switch (Origen){
        case 1:
        switch (Destino){
          case 2:
          BarraC = funct.moveraro(BarraI,BarraC,ancho, alto);
          break;
          case 3:
          BarraD = funct.moveraro(BarraI,BarraD,ancho, alto);
          break;
        }
        if(Destino!=1){
          BarraI = funct.quitarAro(BarraI, Vacio, ancho, alto);
        }
        break;
        
        case 2:
        switch (Destino){
          case 1:
          BarraI = funct.moveraro(BarraC,BarraI,ancho, alto);
          break;
          case 3:
          BarraD = funct.moveraro(BarraC,BarraD,ancho, alto);
          break;
        }
        if(Destino!=2){
          BarraC = funct.quitarAro(BarraC, Vacio, ancho, alto);
        }
        
        break;
        
        case 3:
        switch (Destino){
          case 1:
          BarraI = funct.moveraro(BarraD,BarraI,ancho, alto);
          break;
          case 2:
          BarraC = funct.moveraro(BarraD,BarraC,ancho, alto);
          break;
        }
        if(Destino!=3){
          BarraD = funct.quitarAro(BarraD, Vacio, ancho, alto);
        }
        break; 
      }
    }  
    funct.imprimebarras(BarraI, BarraC, BarraD,ancho,alto);
  }
}