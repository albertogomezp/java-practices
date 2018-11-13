public class p746{ 
  public static void main(String[] args){
    int [] Request =  new int[15];
    int [] Adjust = new int[15];
    System.out.println("Please, insert 15 numbers ");
    // --> Numbers request
    for (int AskNumbers = 0; AskNumbers <= Request.length-1; AskNumbers++){ 
      System.out.print("Request["+AskNumbers+"] = ");
      Request[AskNumbers] = Integer.parseInt(System.console().readLine());
    }
    //--> setting the arrays 
    for (int AdjustNumbers = 0; AdjustNumbers <= Request.length-2; AdjustNumbers++){
      Adjust[(AdjustNumbers+1)] = Request[AdjustNumbers];
    }
    //--> Print
    Adjust[0] = Request[Request.length-1];
    for (int ShowNumbers = 0; ShowNumbers<=Request.length-1; ShowNumbers++){
      System.out.println("Request["+ShowNumbers+"] = "+Adjust[ShowNumbers]);
    }
    //In fact, we are able to do this using just one array
    //En realidad, esto se puede usar empleando solo un array


  }
}