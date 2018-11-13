import java.util.Scanner;

public class p7415{
  public static void main(String[] args ) throws InterruptedException{
    int [] Tables = new int[10];
    Scanner scanner = new Scanner(System.in);
     //--> Filling the tables with random numbers
    for (int RandomAssing = 0; RandomAssing<=Tables.length-1;RandomAssing++){
      Tables[RandomAssing]=(int)(Math.random()*5);
    }


    //--> Starting system

    System.out.println("Starting system");
    for(int i = 0; i<=20;i++){
      System.out.print("- ");
      Thread.sleep(50);
    }
    //--> Adjusts and var creating
    int FilledTables = 0;
    int Diners = 1;
    int TableAssing = 12;
    int FreeTableSearch = 0;
    int TableTemp = 0;
    //--> System ready!
    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
    System.out.println("\n \n 2----------------------------------------------------------");
    for (int i = 0; i<= Tables.length-1; i++){
      System.out.print((i+1)+" ");
    }
    System.out.println("");
    for (int i = 0; i<= Tables.length-1; i++){
      System.out.print(Tables[i]+" ");
    }
    while ((FilledTables < 11) && (Diners > 0)){ //---> Filling system
      System.out.println("\n -----------------------------------------------------------");
      System.out.println("Welcome, how many diners are you going to be? (-1 for exit)"); //--> Introduce
      Diners = scanner.nextInt(); //--> Number instert
      while(Diners >4){ //--> If a non-valid number is introduced
        System.out.println("We can not attend more than 4 diners yet..."); //--> Error message
        System.out.println("\n -----------------------------------------------------------");
        System.out.println("Welcome, how many diners are you going to be? (-1 for exit)"); //--> Introduce
        Diners = scanner.nextInt(); //--> Number insert
      }

      //----> FIRST LOOKING FOR EMPTY TABLES
      while ((Tables[FreeTableSearch] != 0) && (FreeTableSearch <=Tables.length-2)){ 
        FreeTableSearch++;
        //--> If found, FreeTableSearch is the position of a Free table (logic)
      }
      //--> If an empty table is found, we assign the diners to that table
      if(Tables[FreeTableSearch] == 0){
        Tables[FreeTableSearch] = Diners;
        if(Tables[FreeTableSearch] == 4){ //--> If a Table is completely filled
          FilledTables++;
        }
        //--> Telling the Diners where to sit
        System.out.println("Please go to table #"+(FreeTableSearch+1));
      }


      //--> If a empty table is not found...
      else{
        int MinimunDiners;
        //--> Searching the table with less diners
        for(MinimunDiners = 1; MinimunDiners <=Tables.length-2; MinimunDiners++){
          if(Tables[MinimunDiners]>Tables[MinimunDiners-1]){
            TableAssing = MinimunDiners;
          }
          else{
            TableAssing = MinimunDiners-1;
          }
        }
        //--> if the Diners who are sat + the ones who are searching <= 4...
        if((Tables[TableAssing]+Diners)<=4  ){
          System.out.println("Sorry, but you have to share table, please go to table #"+(MinimunDiners+1)); //--> Just telling them...
          Tables[TableAssing] =Tables[TableAssing]+Diners; //--> We add the Diners
          if(Tables[TableAssing] == 4){ //--> If we have filled the table
            FilledTables++;
          }
        }
        else{
          System.out.println("Sorry, but we can not attend you at this moment");                                                                                     //bruh....
        }
      }




      //--> readjust
      FreeTableSearch = 0;
      TableAssing = 12;


      //--> Just for checking
      for (int i = 0; i<= Tables.length-1; i++){
        System.out.print((i+1)+" ");
      }
      System.out.println("");
      for (int i = 0; i<= Tables.length-1; i++){
        System.out.print(Tables[i]+" ");
      }





    }
  }
}  
