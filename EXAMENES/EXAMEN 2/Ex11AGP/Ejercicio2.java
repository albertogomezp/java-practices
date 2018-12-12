import java.util.Scanner;
import paquetes.funciones;
/*
* Ejercicio 2, OPCIÓN B del examen de programación del día 12/12/2018
* Falla la comprobación del ganador
* @author Alberto Gómez Peña
*/
public class Ejercicio2{ 
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("JUGADOR 1: X \nJUGADOR 2: O");
    String[][] Tablero = new String[3][3];
    // Generamos el tablero
    for(int x=0; x < 3 ;x++){
      for(int y=0 ; y < 3 ;y++){
        Tablero[x][y]=" ";
      }
    }
    //print del tablero
    boolean ganar = false;
    boolean empate = false;
    int cont = 1;
    int x = 0;
    int y = 0;
    boolean ocupado = false;
    String Jugador =" ";
    while(ganar !=true && empate!=true){
      System.out.println("-----------");
      funciones.PrintTablero(Tablero);
      if(cont%2 !=0){
        System.out.println("JUGADOR 1:");
        Jugador = "X";
      }
      else{
        System.out.println("JUGADOR 2:");
        Jugador = "O";
      }
      cont++;
      do{
        System.out.print("X:");
        x = scanner.nextInt();
        System.out.print("Y:");
        y = scanner.nextInt();
        if(x<3 && x>=0  && y<3 && y>=0){
          if(Tablero[x][y]==" "){
            ocupado = false;
          }
        }
        else{
          System.out.println("Metiste donde no debias, prueba otra vez");
          ocupado=true;
        }
        for(int cont1 = 1; cont1 <=8; cont1++){
          System.out.println("FIDFHIS");
          switch (cont1){
            case 1:
            if((Tablero[0][0]==Tablero[0][1])&&(Tablero[0][0]==Tablero[0][2])){
              System.out.println("GANA "+Tablero[0][0]);
            }
            break;
            case 2:
            if((Tablero[1][0]==Tablero[1][1])&&(Tablero[1][0]==Tablero[1][2])){
              System.out.println("GANA "+Tablero[1][0]);
            }
            break;
            case 3:
            if((Tablero[2][0]==Tablero[2][1])&&(Tablero[2][0]==Tablero[2][2])){
              System.out.println("GANA "+Tablero[2][0]);
            }
            break;
            case 4:
            if((Tablero[0][0]==Tablero[1][0])&&(Tablero[0][0]==Tablero[2][0])){
              System.out.println("GANA "+Tablero[0][0]);
            }
            break;
            case 5:
            if((Tablero[0][1]==Tablero[1][1])&&(Tablero[0][1]==Tablero[2][1])){
              System.out.println("GANA "+Tablero[0][1]);
            }
            break;
            case 6:
            if((Tablero[0][2]==Tablero[1][2])&&(Tablero[0][2]==Tablero[2][2])){
              System.out.println("GANA "+Tablero[0][2]);
            }
            break;
            case 7:
            if((Tablero[0][0]==Tablero[1][1])&&(Tablero[0][0]==Tablero[2][2])){
              System.out.println("GANA "+Tablero[1][1]);
            }
            break;
            case 8:
            if((Tablero[0][2]==Tablero[1][1])&&(Tablero[0][0]==Tablero[2][2])){
              System.out.println("GANA "+Tablero[1][1]);
            }
            break;
          }
        }
      } while (x>=3 || x<0 || ocupado==true || y>=3 || y<0);

      Tablero[x][y]= Jugador;
      ocupado = true;
      
    }
  }  
}
