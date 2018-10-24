import java.util.Random;
 public class p636{ 
  public static void main(String[] args){
    int RandomNumber = (int)((Math.random())*100);
    int Maxi = 100;
    int Mini = 0;
    System.out.println(RandomNumber);
    for (int cont = 5; cont >=1; cont--){
      System.out.print("Adivina el numero (1-100): ");
      int Hint = Integer.parseInt(System.console().readLine());
      if (Hint == RandomNumber){
        cont = 0;
        System.out.print("NUMERO CORRECTO, ");
      } 
      else{
        System.out.println(" TE QUEDAN "+cont+" INTENTOS");
        if(Hint < RandomNumber){
          Mini = Math.max(Mini, Hint);
        }
        else if(Hint > RandomNumber){
          Maxi = Math.min(Maxi,Hint);
        }
      System.out.println("El numero esta entre "+Mini+" y "+Maxi);  
      }
    }
    System.out.println("EL NUMERO ERA "+RandomNumber);
  }
 }