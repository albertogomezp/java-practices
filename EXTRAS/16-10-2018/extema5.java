public class extema5 {
  public static void main(String[] args) {
    int x = 1104; //el numero a adivinar
    int num = 0;
    while (num != x){ //MIENTRAS QUE EL NUMERO SEA DISTINTO
      System.out.print("ADIVINE EL NUMERO ");
      num = Integer.parseInt(System.console().readLine());
      if(num>x){
        System.out.println("El numero insertado es mayor que el requerido");
      }
      else{
        System.out.println("El numero insertado es menor que el requerido");
      }
    }
    //CUANDO SE ACIERTE
    System.out.println("Has acertado!");

   
    
  }
}