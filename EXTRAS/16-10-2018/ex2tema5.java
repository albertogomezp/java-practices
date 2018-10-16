public class ex2tema5 {
  public static void main(String[] args) {
    int x = 1104; //el numero a adivinar
    int num = 0;
    int sup = 0;
    int inf = 0;
    while (num != x){ //MIENTRAS QUE EL NUMERO SEA DISTINTO
      System.out.print("ADIVINE EL NUMERO ");
      num = Integer.parseInt(System.console().readLine());
      if(num>x){
        System.out.println("El numero insertado es mayor que el requerido");
          sup = num;
      }
      else{
        System.out.println("El numero insertado es menor que el requerido");
        inf = num;
      }
      if(sup!=0 && inf!=0){
        System.out.println("EL NUMERO REQUERIDO ESTA ENTRE "+inf+" Y "+sup);
      }
    }
    //CUANDO SE ACIERTE
    System.out.println("Has acertado!");

   
    
  }
}