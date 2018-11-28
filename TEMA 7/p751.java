import java.util.Scanner;
/*********************************
 *                                *
 *   Alberto Gomez Penya - 1DAW   *
 *     IES Campanillas - PTA      *
 *     TEMA 7 PRACTICA p751       *
 *                                *
 *********************************/

public class p751{
  public static void main(String[] args ) throws InterruptedException{
    int [][] Tables = new int[3][6];
    int PrintAdjust;
    Scanner scanner = new Scanner(System.in);
    for(int ArrowPrint = 0; ArrowPrint <3; ArrowPrint++){
      for(int ColumPrint = 0; ColumPrint <6; ColumPrint++){
        Tables[ArrowPrint][ColumPrint] =0;
        PrintAdjust = Tables[ArrowPrint][ColumPrint];
        System.out.printf(" |%4d| ", PrintAdjust);
        //System.out.print(" ["+Tables[ArrowPrint][ColumPrint]+"] ");
      }
      System.out.println("");
    }



  }
}

