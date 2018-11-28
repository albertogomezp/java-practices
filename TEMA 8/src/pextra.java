import java.util.Scanner;

public class pextra { 
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int J[][] = new int [2][2]; //--> Left MAX, right FILLED  (1 for J1 (7) 2 for J2 (4))
    J[0][0]= 7;
    J[1][0]= 5;
    int Ret = 0;
    while (J[0][1] !=1 || J[1][1] != 1){
      System.out.println("-----------------------------");
      System.out.println(" J1: ("+J[0][1]+"/"+J[0][0]+") \n J2: ("+J[1][1]+"/"+J[1][0]+")");
      System.out.println("SELECT AN ACTION \n7.- Fill J1 \n8.- Fill J2 \n4.- Transfer J1 -> J2 \n5.- Transfer J2 -> J1 \n1.- Empty J1 \n2.- Empty J2 ");
      int selection = scanner.nextInt();
      switch(selection){
        case 7: //F J1
        J[0][1] = Fill(J[0][0],J[0][1]); 
        break;
        case 8: //F J2
        J[1][1] = Fill(J[1][0],J[1][1]);        
        break;
        case 4: //T J1->J2
          Ret = transfer(J[0][1],J[0][0],J[1][1],J[1][0]);
          J[0][1]= Ret/10;
            J[1][1]= Ret%10;
        break;
        case 5: //T J2->J1
          Ret = transfer(J[1][1],J[1][0],J[0][1],J[0][0]);
          J[1][1]= Ret/10;
          J[0][1]= Ret%10;
        break;
        case 1: //E J1
        J[0][1] = empty(J[0][1]); 
        break;
        case 2: //E J2
        J[1][1] = empty(J[1][1]); 
        break;
      }
    } 
    System.out.println("YOU WON!");
  }
  public static int Fill(int MAX, int FILLED) { 
    FILLED = MAX;
    return FILLED;
  }
  public static int empty(int FILLED) { 
    FILLED = 0;
    return FILLED;
  }
  public static int transfer(int ORIGIN, int MAXO,  int DESTINY, int MAXD) {
    DESTINY =  DESTINY + ORIGIN;
    ORIGIN = 0;
    if(DESTINY>MAXD){
      ORIGIN = DESTINY-MAXD;
      DESTINY = MAXD;
    }

    int Ret = (ORIGIN*10)+DESTINY;
    return Ret;
  }
}
