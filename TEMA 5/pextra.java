public class pextra { 
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
   
    int J[][] = new int [1][2]; //--> Left MAX, right FILLED  (1 for J1 (7) 2 for J2 (4))
    J1[0][0]= 7;
    J1[1][0]= 4;
    while (J[0][0] != J[0][1] && J[1][0] !=[1][1]){
      System.out.println("SELECT AN ACTION \n1.- Fill J1 \n2.- Fill J2 \n3.- Transfer J1 -> J2 \n4.- Transfer J2 -> J1 \n5.- Empty J1 \n6.- Empty J2 ");
      int selection = scanner.nextInt();
      switch(selection){
        case 1: //F J1
        J[0][1] = FillJ1(J[0][0],J[0][1]); 
        break;
        case 2: //F J2
        J[0][1] = FillJ2(J[1][1]); 
        break;
        case 3: //T J1->J2
        break;
        case 4: //T J2->J1
        break;
        case 5: //E J1
        break;
        case 6: //E J2  
        break;
      }
    } 
    System.out.println("YOU WON!");
  }
  public static long FillJ1(int MAX, int FILLED) { 
    FILLED = MAX;
    return FILLED;
  }
}
