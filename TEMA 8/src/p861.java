import java.util.Scanner;
public class p861{ 
  public static void main(String[] args) {
    //--> Setup (common vars)
    String NumberInserted;
    boolean solutionBoolean;
    int NumberLength;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, select which program do you want to run: \n1 - EsCapicua\n2 - EsPrimo"+
    "\n3 - SiguientePrimo");
    int selection = scanner.nextInt();
    switch(selection){
      case 1:
      //esCapicua: Devuelve verdadero si el numero que se pasa como parametro es capicua y falso en caso contrario.
      Scanner EsCap = new Scanner(System.in);
      System.out.println("Please, insert a number (i'll tell you if is a palindrome): ");
      NumberInserted = EsCap.nextLine();
      char[] Numbers = NumberInserted.toCharArray();
      NumberLength = NumberInserted.length();
      solutionBoolean = EsCapicua(NumberInserted, Numbers,NumberLength);
      System.out.println(solutionBoolean);
      break;
      case 2:
      // esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
      Scanner EsPri = new Scanner(System.in);
      System.out.println("Please, insert a number (i'll tell you if is prime): ");
      long NumbLong = EsPri.nextLong();
      solutionBoolean = EsPrimo(NumbLong);
      System.out.println(solutionBoolean);
      case 3:
      // siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
      Scanner EsPri2= new Scanner(System.in);
      System.out.println("Please, insert a number (i'll tell you which is prime): ");
      long Numb = EsPri2.nextLong();
      System.out.print( SiguientePrimo(Numb) );
      break;
    }
    
    
  }
  public static boolean EsCapicua (String Cad1, char[]ar1,int Longi){
    boolean Confirmacion = false;
    int temp = 0;
    int cont1 = 0; //--> Every pair of numbers which are equals, +1
    for(int cont = 0; cont < Longi; cont++){
      temp = (Longi-1)-cont;
      if(ar1[cont] == ar1[temp]){
        cont1++;   
      }
    }
    //---> TEST ONLY System.out.println(cont1);
    if (cont1==Longi || cont1==Longi-1){
      Confirmacion = true;
    }
    return Confirmacion;
  }
  public static boolean EsPrimo (long Number){
    long Divider = 0;
    boolean Confirmacion = false;
    for(long Cont = 2; Cont < Number; Cont++){
      if(Number%Cont == 1){
        Divider++;
      }
    }
    if(Divider <=2){
      Confirmacion = true;
    }
    return Confirmacion;
  }
  public static long SiguientePrimo (long Numb){
    long checking = Numb;
    do{
      checking++;
    }while(EsPrimo((checking))==false);
    long Confirmacion1 =checking;
    return Confirmacion1;
  }
}
  
  