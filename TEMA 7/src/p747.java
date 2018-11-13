public class p747{ 
  public static void main(String[] args) throws InterruptedException {
    int [] Numbers =  new int[100];
    //---> Generating numbers
    for (int GenerateNumbers = 0; GenerateNumbers <Numbers.length-1; GenerateNumbers++){
      Numbers[GenerateNumbers] = (int)(Math.random()*21);
      System.out.print(Numbers[GenerateNumbers]+" ");
      Thread.sleep(50);
    }
    //---> Asking for the Wanted Number and also the number we are going to replace for it
    System.out.print("\n Please, insert a number: ");
    int WantedNumber = Integer.parseInt(System.console().readLine());
    System.out.print(" Please, the new number: ");
    int Replacer = Integer.parseInt(System.console().readLine());
    //--> Replace and print
    System.out.println("Looking for "+WantedNumber+" and replace for "+Replacer);
    for (int ReplaceNumbers = 0 ; ReplaceNumbers <= Numbers.length-1 ; ReplaceNumbers++){
      if(Numbers[ReplaceNumbers] == WantedNumber){ //---> If this numbers == the number we are looking for..
        Numbers[ReplaceNumbers] = Replacer; //---> Replace the number
        System.out.print("["+Numbers[ReplaceNumbers]+"] "); //---> print and adding [ ] in order to show the replaced numbers 
      }
      else{
        System.out.print(Numbers[ReplaceNumbers]+" "); //---> print
      }
      Thread.sleep(50);
    }
  }
}