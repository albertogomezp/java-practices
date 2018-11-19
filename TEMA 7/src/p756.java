import java.util.Scanner;
/*********************************
*                                *
*   Alberto Gomez Penya - 1DAW   *
*     IES Campanillas - PTA      *
*     TEMA 7 PRACTICA p756       *
*                                *
*********************************/
public class p756{ //This code is quite easy to read, i consider that it is not necessary to explain it
  public static void main(String[] args ) throws InterruptedException{
    //-->Set-up
    int [][] Tables = new int[6][10];
    int PrintAdjust;
    int MaxNumber = 0;
    int MinNumber = 1001;
    int MaxPositionX = 0;
    int MaxPositionY = 0;
    int MinPositionX = 0;
    int MinPositionY = 0;
    System.out.printf(" |%4s%1s|  |%5d%1s|  |%5d%1s|  |%5d%1s|  |%5d%1s|  |%5d%1s|  |%5d%1s|  |%5d%1s|  |%5d%1s|  |%5d%1s|  |%5d%1s|\n"," "," ",0," ",1," ",2," ",3," ",4," ",5," ",6," ",7," ",8," ",9," "); //-> printings
    //System.out.println(" -----------------------------------------------------------------------------------------------------------");
    for(int columnRequest = 0; columnRequest <6; columnRequest++){
      for(int RowRequest = 0; RowRequest <10; RowRequest++){
        Tables[columnRequest][RowRequest] =(int)(Math.random()*1001); //--> Inserting into the array    
      }
    }
    //-->Printing and comparing
    for(int columnPrint = 0; columnPrint <6; columnPrint++){
      System.out.println(" -----------------------------------------------------------------------------------------------------------");
      System.out.printf(" |%3d%2s| ", columnPrint," "); //-> printing
      for(int RowPrint = 0; RowPrint <10; RowPrint++){
        PrintAdjust = Tables[columnPrint][RowPrint];
        System.out.printf(" |%5d%1s| ", PrintAdjust," "); //-> printing
        if(PrintAdjust>MaxNumber){ 
          MaxPositionX = columnPrint;
          MaxPositionY = RowPrint;
          MaxNumber = PrintAdjust;
        }
        if(PrintAdjust<MinNumber){
          MinPositionX = columnPrint;
          MinPositionY = RowPrint;
          MinNumber = PrintAdjust;
        }
      }
      System.out.println("");
    }
    System.out.println("The maximun number is located at ["+MaxPositionX+"] ["+MaxPositionY+"]");
    System.out.println("The minimun number is located at ["+MinPositionX+"] ["+MinPositionY+"]");
  }
}

