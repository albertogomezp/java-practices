import java.util.Scanner;

public class pextra { 
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int J[][] = new int [2][2]; //--> Left MAX, right FILLED  (1 for J1 (7) 2 for J2 (4))
    J[0][0]= 7;
    J[1][0]= 4;
    boolean exit = false;
    while( (J[0][1] !=1 || J[1][0] != 1)||(exit==true)){
      System.out.println("-----------------------------");
      System.out.println(" J1: ("+J[0][1]+"/"+J[0][0]+") \n J2: ("+J[1][1]+"/"+J[1][0]+")");
      System.out.println("SELECT AN ACTION \n1.- Fill J1 \n2.- Fill J2 \n3.- Transfer J1 -> J2 \n4.- Transfer J2 -> J1 \n5.- Empty J1 \n6.- Empty J2 \n9.- exit ");
      int selection = scanner.nextInt();
      switch(selection){
        case 1: //F J1
        J[0][1] = Fill(J[0][0],J[0][1]); 
        break;
        case 2: //F J2
        J[1][1] = Fill(J[1][0],J[1][1]);        
        break;
        case 3: //T J1->J2
        break;
        case 4: //T J2->J1
        break;
        case 5: //E J1
        J[0][1] = empty(J[0][1]); 
        break;
        case 6: //E J2  
        J[1][1] = empty(J[1][1]); 
        break;
        case 9:
        exit = true;
        break;
      }
    } 
    System.out.println("YOU WON!");
  }
  public static int Fill(int MAX, int FILLED){ 
    FILLED = MAX;
    return FILLED;
  }
  public static int empty(int FILLED) { 
    FILLED = 0;
    return FILLED;
  }
  public static int transfer(int ORIGIN,int DESTINY) { 
    FILLED = 0;
    return FILLED;
  }
}
