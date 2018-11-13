public class p7410{ 
  public static void main(String[] args){
    //--> Setting up the program
    int [] RandomNumbers =  new int[20];
    int [] EvenNumbers = new int[20];
    int [] OddNumbers = new int[20];
    int EvenCounter = 0;
    int OddCounter = 0;
    int NumbersMoving = 0;
    int EvenMoving = 0;
    int OddMoving = 0;
    //-- > Generating the Random Numbers
    for (int GenerateNumbers = 0; GenerateNumbers <=RandomNumbers.length-1; GenerateNumbers++){
      RandomNumbers[GenerateNumbers] = (int)((Math.random())*101);
      System.out.println("RandomNumbers["+GenerateNumbers+"] = "+RandomNumbers[GenerateNumbers]);
      EvenNumbers[GenerateNumbers] = 999; //kinda cheat; There is an easy way to adjust this, by the way, this also works.
      OddNumbers[GenerateNumbers] = 999; //kinda cheat; There is an easy way to adjust this, by the way, this also works.
    } 
    System.out.println("-----------------------"); //--> Print
    for (int MovingNumbers = 0; MovingNumbers <= RandomNumbers.length-1; MovingNumbers++){ //--> This gets the Even numbers out of the array
      if(RandomNumbers[MovingNumbers]%2 == 0){
        EvenNumbers[EvenCounter] = RandomNumbers[MovingNumbers];
        EvenCounter++;
      }
      else{ //--> This gets the Odds numbers out of the array
        OddNumbers[OddCounter] = RandomNumbers[MovingNumbers];
        OddCounter++;
      }
    }
    while (EvenNumbers[EvenMoving] != 999){ //--> This introduces the Even Numbers into the RandomNumbers[] array
      RandomNumbers[NumbersMoving] = EvenNumbers[EvenMoving];
      EvenMoving++;
      NumbersMoving++;
    }
    while (OddNumbers[OddMoving] != 999){  //--> This introduces the Odd Numbers into the RandomNumbers[] array
      RandomNumbers[NumbersMoving] = OddNumbers[OddMoving];
      OddMoving++;
      NumbersMoving++;
    }
    for (int Print = 0; Print <=RandomNumbers.length-1; Print++){ //--> Print
      System.out.println("RandomNumbers["+Print+"] = "+RandomNumbers[Print]);
    } 
  }
}