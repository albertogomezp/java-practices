public class p742{ 
  public static void main(String[] args){
    int [] Inverter = new int [10];
    for( int AskNumber = 0; AskNumber <Inverter.length; AskNumber++){
      System.out.print("Please, introduce a number: ("+AskNumber+"/10) ");
      Inverter[AskNumber] = Integer.parseInt(System.console().readLine());
    }
    for (int ShowNumbers = Inverter.length-1; ShowNumbers>=0; ShowNumbers--){
      System.out.println("RequestedNumber["+ShowNumbers+"] = "+Inverter[ShowNumbers]);
    }
   
  }
}