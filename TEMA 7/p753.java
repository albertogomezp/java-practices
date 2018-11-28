import java.util.Scanner;
/*********************************
*                                *
*   Alberto Gomez Penya - 1DAW   *
*     IES Campanillas - PTA      *
*     TEMA 7 PRACTICA p753       *
*                                *
*********************************/
public class p753{
  public static void main(String[] args ) throws InterruptedException{
    //-->Set-up
    int [][] Tables = new int[4][5];
    int PrintAdjust;
    int RelativeAdd = 0;
    int RelativeAdd2 = 0;
    int TotalAdd = 0;
    //-->Request
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insert 20 (int) numbers");
    for(int columnRequest = 0; columnRequest <4; columnRequest++){
      for(int RowRequest = 0; RowRequest <5; RowRequest++){
        Tables[columnRequest][RowRequest] =(int)(Math.random()*900)+100; //--> Inserting into the array    
      }
    }
    System.out.println(" _________________________________________________________");  //--> Cuteness
    System.out.printf(" |%6s|  |%6s|  |%6s|  |%6s|  |%6s| ||%5s|\n", " C  0 "," C  1 "," C  2 "," C  3 "," C  4 ","ADD ");
    System.out.println(" ---------------------------------------------------------");
    //-->Printing and also adding (just horizontaly)
    for(int columnPrint = 0; columnPrint <4; columnPrint++){
      for(int RowPrint = 0; RowPrint <5; RowPrint++){
        PrintAdjust = Tables[columnPrint][RowPrint];
        RelativeAdd += PrintAdjust; //--> For the relative add
        TotalAdd +=PrintAdjust; //-->
        System.out.printf(" |%5d%1s| ", PrintAdjust," "); //-> printing
      }
      System.out.printf("||%5d|\n", RelativeAdd);
      RelativeAdd = 0; //-->reset
    }
    System.out.println(" |------|--|------|--|------|--|------|--|------|-||-----|");  //--> Cuteness
    for(int RowPrint2 = 0; RowPrint2 <5; RowPrint2++){ //--> Check and add the vertical add
      for(int columnPrint2 = 0; columnPrint2 <4; columnPrint2++){
        PrintAdjust = Tables[columnPrint2][RowPrint2];
        RelativeAdd2 += PrintAdjust;
      }
      System.out.printf(" |%5d%1s| ", RelativeAdd2," "); //--> print the add
      RelativeAdd2 = 0;
    }
    System.out.printf("||%5d|\n", TotalAdd); //--> total add
    System.out.println(" ---------------------------------------------------------");
  }
}

