import java.util.Scanner;
/*********************************
*                                *
*   Alberto Gomez Penya - 1DAW   *
*     IES Campanillas - PTA      *
*     TEMA 7 PRACTICA p757       *
*                                *
*********************************/
public class p757{
  public static void main(String[] args ) throws InterruptedException{
    //-->Set-up
    // 1 - EMPTX | 2 - BOMB | 3 - GOAL | 4 - NULL |
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please, select the Size (Squared) ");
    int Field1Size = scanner.nextInt();
    int [][] Field1 = new int[Field1Size][Field1Size];
    int [][] Field2 = new int[Field1Size][Field1Size];
    //--> Generate the Goal position
    int GoalPositionY = (int)(Math.random()*(Field1Size));
    int GoalPositionX = (int)(Math.random()*(Field1Size));
    //DEBUG ONLY System.out.println("Y "+GoalPositionY+" X "+GoalPositionX);
    //--> Setting up the level
    System.out.print("Please, select the level (1- Easy | 10- impossible) ");
    int Level = scanner.nextInt();
    //--> Setting up the break points.
    boolean Win = false;
    boolean Loose = false;
    int SpawnObject;
    //--> Generate the Field1
    for (int Y = 0; Y <=Field1Size-1;Y++){
      for (int X = 0; X<=Field1Size-1;X++){
        if((Y == GoalPositionY)&&(X == GoalPositionX)){ //--> Setting up the goal position
          Field1[Y][X] = 3;
          // DEBUG ONLY: System.out.print("["+Field1[Y][X]+"] ");
        }
        else{
          SpawnObject = (int)((Math.random()*10)+1); //--> Spawn
          if(SpawnObject <=Level){  //-->  bomb spawns (depends of the Level)
            Field1[Y][X] = 2; //--> Sets
            // DEBUG ONLY:  System.out.print("["+Field1[Y][X]+"] ");
          }
          else{ //--> EmptX Space spawn
            Field1[Y][X] = 1;
            // DEBUG ONLY: System.out.print("["+Field1[Y][X]+"] ");
          }
        }     
      }
      //DEBUG ONLY System.out.println("");
    }
    int Hints = 0;
    int HintY = 0;
    int HintX = 0;
    while ((Hints<6)&&(Win==false)&&(Loose==false)){
      do{
        System.out.print("X: ");
        HintX = scanner.nextInt();
      }  while(HintX >=Field1Size ||  HintX <0);
      do{
        System.out.print("Y: ");
        HintY = scanner.nextInt();
      }  while(HintY >=Field1Size ||  HintY <0);
      
      if(Field1[HintY][HintX] == 2){
        Loose = true;
        System.out.println("YOU LOST");
      }
      if(Field1[HintY][HintX] == 3){
        Win = true;
        System.out.println("YOU WON");
      }
      if(Field1[HintY][HintX] == 1){
        Hints++;
        System.out.println("EMPTY, TRY AGAIN");
        System.out.println("Hints remaining: "+(6-Hints));
        try{ //--> In case we get an ArrayIndexOutOfBoundsException while checking the surrounding positions of a x/y = 0
          if(
          (Field1[HintY-1][HintX]==2)||
          (Field1[HintY-1][HintX-1]==2)||
          (Field1[HintY-1][HintX+1]==2)||
          (Field1[HintY+1][HintX]==2)||
          (Field1[HintY][HintX-1]==2)||
          (Field1[HintY][HintX+1]==2)||
          (Field1[HintY+1][HintX+1]==2)||
          (Field1[HintY+1][HintX-1]==2)  ){
          }
        }
        catch(ArrayIndexOutOfBoundsException ex){}
        System.out.println("WATCH OUT! BOMBS ARE CLOSE!!");
        Field2[HintY][HintX] = Field1[HintY][HintX];
        
        
        System.out.print("  ");
        for (int Y = 0; Y <=Field1Size-1;Y++){
          System.out.print(" "+Y+"  ");
        }
        System.out.println("");
        for (int Y = 0; Y <=Field1Size-1;Y++){
          System.out.print(Y+" ");
          for (int X = 0; X<=Field1Size-1;X++){
            System.out.print("["+Field2[Y][X]+"] ");    
          }
          System.out.println("");
        } 
        System.out.println("Please, remember: | 0 -  UNKNOWN | 1 - EMPTY | 2 - BOMB | 3 - GOAL |");
      }
      else{
        System.out.print("  ");
        for (int Y = 0; Y <=Field1Size-1;Y++){
          System.out.print(" "+Y+"  ");
        }
        System.out.println("");
        for (int Y = 0; Y <=Field1Size-1;Y++){
          System.out.print(Y+" ");  
          for (int X = 0; X<=Field1Size-1;X++){
            System.out.print("["+Field1[Y][X]+"] ");    
          }
          System.out.println("");
        } 
        System.out.println("Please, remember: | 0 -  UNKNOWN | 1 - EMPTY | 2 - BOMB | 3 - GOAL |");
      }
    }
    if(Hints==6 && Win==false){
      System.out.println("YOU LOST");
    } 
  }
}

