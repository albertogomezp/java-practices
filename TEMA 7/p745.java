 public class p745{ 
  public static void main(String[] args){
    int MaxPos = 0;
    int MinPos = 0;
    int [] Numbers = new int [10];
    // ---> Previous Adjust
    System.out.print("Please, introduce a number: (1/10) ");
    Numbers[0] = Integer.parseInt(System.console().readLine());
    int MaxNumber = Numbers[0];
    int MinNumber = Numbers[0];
    // ---> Asking for numbers and comparing 
    for( int AskNumber = 1; AskNumber <=9; AskNumber++){
      System.out.print("Please, introduce a number: ("+(AskNumber+1)+"/10) ");
      Numbers[AskNumber] = Integer.parseInt(System.console().readLine());

      if (Numbers[AskNumber] > MaxNumber){ // ---> In case this number is the Maximun (relative)
        MaxNumber = Numbers[AskNumber];
        MaxPos = AskNumber;
      }
      if (Numbers[AskNumber] < MinNumber){ // ---> In case this number is the Minimun (relative)
        MinNumber = Numbers[AskNumber];
        MinPos = AskNumber;
      }
    }
    // ---> Print
    for (int ShowNumbers = 0; ShowNumbers <= Numbers.length-1; ShowNumbers++){
      if(ShowNumbers != MaxPos && ShowNumbers != MinPos){ // ---> Normal
       System.out.println("RequestedNumber["+ShowNumbers+"] = "+Numbers[ShowNumbers]);
      }
       if (ShowNumbers == MinPos){ // ---> Print of the minimun number
        System.out.println("RequestedNumber["+ShowNumbers+"] = "+Numbers[ShowNumbers]+" Minimun Number");
      }
      if (ShowNumbers == MaxPos){ // ---> Print of the maximun number
        System.out.println("RequestedNumber["+ShowNumbers+"] = "+Numbers[ShowNumbers]+" Maximun Number");
      }
    }
   
  }
}