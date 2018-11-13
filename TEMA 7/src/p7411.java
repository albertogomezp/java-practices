public class p7411{ 
  public static void main(String[] args) throws InterruptedException {
    //--> Setting up the program
    int [] RandomNumbers =  new int[20];
    int [] primeNumbers = new int[20];
    int [] RestNumbers = new int[20];
    int primeCounter = 0;
    int RestCounter = 0;
    int NumbersMoving = 0;
    int primeMoving = 0;
    int RestMoving = 0;
    int Checker = 0;
    //-- > Generating the Random Numbers
    for (int GenerateNumbers = 0; GenerateNumbers <=RandomNumbers.length-1; GenerateNumbers++){
      RandomNumbers[GenerateNumbers] = (int)((Math.random())*101);
      System.out.println("RandomNumbers["+GenerateNumbers+"] = "+RandomNumbers[GenerateNumbers]);
      primeNumbers[GenerateNumbers] = 999; //kinda cheat; There is an easy way to adjust this, by the way, this also works.
      RestNumbers[GenerateNumbers] = 999; //kinda cheat; There is an easy way to adjust this, by the way, this also works.
    } 
    System.out.println("-----------------------"); //--> Print
    for (int MovingNumbers = 0; MovingNumbers <= RandomNumbers.length-1; MovingNumbers++){ //--> This gets the prime numbers out of the array
      for(int SearchingFor = 1; SearchingFor <= RandomNumbers[MovingNumbers]; SearchingFor++)
      {
          if((RandomNumbers[MovingNumbers] % SearchingFor) == 0)
          {
              Checker++;
          }
      }
      if((Checker <= 2)&& RandomNumbers[MovingNumbers] >2 ){
        primeNumbers[primeCounter] = RandomNumbers[MovingNumbers];
        primeCounter++;
      }
      else{ //--> This gets the Rests numbers out of the array
        RestNumbers[RestCounter] = RandomNumbers[MovingNumbers];
        RestCounter++;
      }
      Checker = 0;
    }
    while (primeNumbers[primeMoving] != 999){ //--> This introduces the prime Numbers into the RandomNumbers[] array
      RandomNumbers[NumbersMoving] = primeNumbers[primeMoving];
      primeMoving++;
      NumbersMoving++;
    }
    while (RestNumbers[RestMoving] != 999){  //--> This introduces the Rest Numbers into the RandomNumbers[] array
      RandomNumbers[NumbersMoving] = RestNumbers[RestMoving];
      RestMoving++;
      NumbersMoving++;
    }
    for (int Print = 0; Print <=RandomNumbers.length-1; Print++){ //--> Print
      Thread.sleep(50);
      System.out.println("RandomNumbers["+Print+"] = "+RandomNumbers[Print]);
    } 
  }
}