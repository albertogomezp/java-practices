public class p7412{ 
  public static void main(String[] args) throws InterruptedException {
    int [] Numbers =  new int[10];
    int [] NumbersAux = new int[10];
    //---> Asking for numbers
    System.out.println(" Insert 10 numbers ");
    for (int Introducing = 0; Introducing <= Numbers.length-1 ; Introducing++ ){
      System.out.print(" ("+Introducing+"/9) = ");
      Numbers[Introducing] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("--------------------------------");

    System.out.print("Insert the initial number: "); //---> This number will be inserted in the position of the FinalNumber
    int InitialNumber = Integer.parseInt(System.console().readLine());
    System.out.print("Insert the last number "); //---> This is the position where Initialnumber will be inserted
    int FinalNumber =  Integer.parseInt(System.console().readLine());
    if( (InitialNumber < FinalNumber)  && (InitialNumber>=0) && (InitialNumber<9) && (FinalNumber>=1) && (FinalNumber<=9)  ){ //---> Checking numbers
      //---------------------ADJUST ZONE-----------
      int bridge = Numbers[FinalNumber]; //---> saves the value
      NumbersAux[FinalNumber] = Numbers[InitialNumber]; //---> Sets the Initialnumber into the FinalNumber
      NumbersAux[FinalNumber+1] = bridge; //---> Sets the old FinalNumber into FinalNumber+1
      int Maxi = Numbers.length; //---> just for patching
      Maxi = Maxi-2; //---> also
      //-------------------END OF ADJUST ZONE------
      //--> Adjust numbers between FinalNumber+2 and Numbers.lenght-1
      for ( int MovingNumbers = FinalNumber+3 ; MovingNumbers <= Numbers.length-1 ; MovingNumbers++){
          NumbersAux[(MovingNumbers)] = Numbers[MovingNumbers-1]; 
      }
      //---> Adjust NumbersAux[0]
      NumbersAux[Numbers.length-1] = Numbers[(Numbers.length-2)];
      NumbersAux[0] = Numbers[Numbers.length-1]; 
      //---> Adjust numbers between 1 and InitialNumber-1
      for (int MovingNumbers2 = 1; MovingNumbers2 < InitialNumber ; MovingNumbers2++){
        NumbersAux[MovingNumbers2] = Numbers[(MovingNumbers2-1)];
      } 
      //---> Adjust numbers betweeen InitialNumber and Final
      NumbersAux[InitialNumber] = Numbers[InitialNumber-1];
      for (int MovingNumbers3 = InitialNumber+1; MovingNumbers3 < FinalNumber ; MovingNumbers3++){
        NumbersAux[MovingNumbers3] = Numbers[(MovingNumbers3)];
      }
      //---> Print
      for (int Printing = 0; Printing <= Numbers.length-1 ; Printing++ ){
        System.out.println(" ("+(Printing)+"/9) = "+NumbersAux[Printing]);
      }
    }
    else{
      System.out.println("ERROR #0 : The initial number is not smaller than the Final Number");
    }
  }
}