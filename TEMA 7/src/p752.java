import java.util.Scanner;
/*********************************
*                                *
*   Alberto Gomez Penya - 1DAW   *
*     IES Campanillas - PTA      *
*     TEMA 7 PRACTICA p752       *
*                                *
*********************************/

public class p752{
  public static void main(String[] args ) throws InterruptedException{
    int [][] Tables = new int[4][5];
    int PrintAdjust;
    int RelativeAdd = 0;
    int RelativeAdd2 = 0;
    int TotalAdd = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insert 20 (int) numbers");
    for(int ArrowRequest = 0; ArrowRequest <4; ArrowRequest++){
      for(int ColumnRequest = 0; ColumnRequest <5; ColumnRequest++){
        Tables[ArrowRequest][ColumnRequest] =(int)(Math.random()*20); // scanner.nextInt();    
      }
      //System.out.println("");
    }
    System.out.println(" _________________________________________________________");
    
    System.out.printf(" |%6s|  |%6s|  |%6s|  |%6s|  |%6s| ||%5s|\n", " C  0 "," C  1 "," C  2 "," C  3 "," C  4 ","ADD ");
    System.out.println(" ---------------------------------------------------------");
    for(int ArrowPrint = 0; ArrowPrint <4; ArrowPrint++){
      for(int ColumPrint = 0; ColumPrint <5; ColumPrint++){
        PrintAdjust = Tables[ArrowPrint][ColumPrint];
        RelativeAdd += PrintAdjust;
        TotalAdd +=PrintAdjust;
        System.out.printf(" |%5d%1s| ", PrintAdjust," ");
      }
      System.out.printf("||%5d|\n", RelativeAdd);
      RelativeAdd = 0;
    }

    System.out.println(" |------|--|------|--|------|--|------|--|------|-||-----|");
    for(int ColumPrint2 = 0; ColumPrint2 <5; ColumPrint2++){
      for(int ArrowPrint2 = 0; ArrowPrint2 <4; ArrowPrint2++){
        PrintAdjust = Tables[ArrowPrint2][ColumPrint2];
        RelativeAdd2 += PrintAdjust;
        TotalAdd +=PrintAdjust;
      }
      System.out.printf(" |%5d%1s| ", RelativeAdd2," ");
      RelativeAdd2 = 0;
    }
    System.out.printf("||%5d|\n", TotalAdd);
    System.out.println(" ---------------------------------------------------------");
  }
}

