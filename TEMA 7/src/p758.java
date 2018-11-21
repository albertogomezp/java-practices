import java.util.Scanner;

import com.sun.glass.ui.Size;
/*********************************
*                                *
*   Alberto Gomez Penya - 1DAW   *
*     IES Campanillas - PTA      *
*     TEMA 7 PRACTICA p758       *
*                                *
*********************************/
public class p758 {
  public static void main(String[] args) throws InterruptedException {
    //----------------------------------------------------------------->Set-up
    int Size = 100;
    System.out.println("Please, select the Size (Only odd numbers) ");
    //while (Size % 2 == 0) {
      //int Size = scanner.nextInt();
      Size = 12;
   // }
    int HalfSize = Size / 2;
    int[][] Cuadro1 = new int[Size][Size];
    int[][] Cuadro2 = new int[Size][Size];
    int temp = 0;
    System.out.printf("%3s", " ");
    for (int x = 0; x < 12; x++) {
      System.out.printf(" %3d", x);
    }
    System.out.println("");

    for (int y = 0; y < 12; y++) {
      System.out.printf("%3d ", y);
      for (int x = 0; x < 12; x++) {
        Cuadro1[y][x] = (int)(Math.random() * 101);
        temp = Cuadro1[y][x];
        System.out.printf("|%3d", temp);
      }
      System.out.println("");
    }
    //---------------------------------------------------------> moving numbers (CLOCKWISE)
    //--> We are setting for 2(0,0) the ones from 1(1,0)...
    //--> For 1(0,1) the ones from 1(0,0)
    //---------> SETTING UP
   int EndingPoint = 11;   //--> JUST FOR BEGGINING

    int StartertPoint1 = 1;
    int EndingPoint1 = 11;

    int StartertPoint2 = 1;
    int EndingPoint2 = 11;

    int StartertPoint3 = 10;
    int EndingPoint3 = 0;

    int StartertPoint4 = 10;
    int EndingPoint4 = 0;

    int Swap = 1; //--> Will be used to increase/decrease values
    int TempX = 0;
    int TempY = 0;

    int Constant1 = 0;
    int Constant2 = 11;
    int Constant3 = 11;
    int Constant4 = 0;

    int Run = 1;

    for (int Lap = 1; Lap <=HalfSize; Lap++) { //---> 1st circle (external)

      for (int MoveDirection = 1; MoveDirection <= 4; MoveDirection++) { //--> Sets direction
         
        do{  //--> Do the run
          switch(MoveDirection){
            case 1:
              TempX = Run-1;
              Cuadro2[Constant1][Run] = Cuadro1[Constant1][TempX];
              Run += Swap;
            break;
            case 2:
              TempY = Run-1;
              Cuadro2[Run][Constant2] = Cuadro1[TempY][Constant2];
              Run += Swap;
            break;
            case 3:
              TempX = Run+1;
              Cuadro2[Constant3][Run] = Cuadro1[Constant3][TempX];
              Run += Swap;
            break;
            case 4:
              TempY = Run+1;
              Cuadro2[Run][Constant4] = Cuadro1[TempY][Constant4];
              Run += Swap;
            break;
          }
        } while ( ((Run != EndingPoint1+1)&& MoveDirection ==1) || ((Run != EndingPoint+1)&& MoveDirection ==2) || ((Run != EndingPoint-1)&& MoveDirection ==3) || ((Run != EndingPoint-1)&& MoveDirection ==4)    );
        switch (MoveDirection) { //--> Setting the NEXT 'run'
          case 1: //--> Going top-bottom 
            Constant1++;
            EndingPoint1--;
            StartertPoint1++;
            EndingPoint = EndingPoint2;
            Run = StartertPoint2;
            Swap = 1;
            break;
          case 2: //-- Going bottom-top
            Constant2--;
            EndingPoint2--;
            StartertPoint2++;
            EndingPoint = EndingPoint3;
            Run = StartertPoint3;
            Swap = -1;
            break;
          case 3: //--> Going right-left
            Constant3--;  
            EndingPoint3++;
            StartertPoint3--;
            EndingPoint = EndingPoint4;
            Run = StartertPoint4;
            Swap = -1;
            break;
          case 4: //--> Going left-right
            Constant4++;
            EndingPoint4++;
            StartertPoint4--;
            EndingPoint = EndingPoint1;
            Run = StartertPoint1;
            Swap = 1;
            break;
        }
      }
    }
    System.out.printf("%3s", " ");
    for (int x = 0; x < 12; x++) {
      System.out.printf(" %3d", x);
    }
    System.out.println("");

    for (int y = 0; y < 12; y++) {
      System.out.printf("%3d ", y);
      for (int x = 0; x < 12; x++) {
        temp = Cuadro2[y][x];
        System.out.printf("|%3d", temp);
      }
      System.out.println("");
    }
  }
}