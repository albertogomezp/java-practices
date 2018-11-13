import java.util.Scanner;

public class p74152{
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
    int TableSearch = 0;
    int TableTemp = 0;
    int Filled = 0;
    int CheckRemaining = 0;
    int cont = 0;
    int cheat =0;
    //--> System ready!
    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
    System.out.println("\n \n ----------------------------------------------------------");
    for (int i = 0; i<= Tables.length-1; i++){
      System.out.print((i+1)+" ");
    }
    System.out.println("");
    for (int i = 0; i<= Tables.length-1; i++){
      System.out.print(Tables[i]+" ");
    }
    while ((FilledTables < 11) && (Diners != -1)) { //---> Filling system
      System.out.println("\n -----------------------------------------------------------");
      System.out.println("Welcome, how many diners are you going to be? (-1 for exit)"); //--> Introduce
      Diners = scanner.nextInt(); //--> Number instert
      while (Diners > 4) { //--> If a non-valid number is introduced
        System.out.println("We can not attend more than 4 diners yet..."); //--> Error message
        System.out.println("\n -----------------------------------------------------------");
        System.out.println("Welcome, how many diners are you going to be? (-1 for exit)"); //--> Introduce
        Diners = scanner.nextInt(); //--> Number insert
      }
      
      //----> FIRST LOOKING FOR EMPTY TABLES, THEN, WITH 1 DINER,...

      while(TableSearch<=8 && Tables[TableSearch]!=Filled){
        TableTemp = Tables[TableSearch];
        if(Filled<=TableTemp){
          cont++;
        }
        TableSearch++;
      }
      TableTemp = (Tables[TableSearch]+Diners);
      if(TableTemp <= 4){
        Tables[TableSearch]=TableTemp;
        
        System.out.println("please go to table #"+(TableSearch+1));
      }
      else{
        System.out.println("We are sorry, we can not attend you at this moment");
      }
      TableSearch=0;
      if(cont==9){
        Filled++;
      }
      cont = 0;


      //--> Just for checking
      for (int i = 0; i <= Tables.length - 1; i++) {
        System.out.print((i + 1) + " ");
      }
      System.out.println("");
      for (int i = 0; i <= Tables.length - 1; i++) {
        System.out.print(Tables[i] + " ");
      } 
    }
  }
}

