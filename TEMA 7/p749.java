public class p749{ 
  public static void main(String[] args){
    int [] Numbers =  new int[8];
    System.out.println("Please, introduce 8 (int) numbers");
    for(int Request = 0; Request <= Numbers.length-1; Request++){
      System.out.print("Number #"+(Request+1)+" = ");
      Numbers[Request] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("-----------------------");
    for(int Print = 0; Print <= Numbers.length-1; Print++){
      System.out.print("Numbers["+(Print)+"] = "+Numbers[Print]);
      if (Numbers[Print]%2 == 0){
        System.out.println(" (even)");
      }
      else{
        System.out.println(" (odd)");
      }
    }
    

  }
}