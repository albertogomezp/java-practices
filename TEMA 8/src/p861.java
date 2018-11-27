import java.util.Scanner;
public class p861{ 
  public static void main(String[] args) {
    //--> Setup (common vars)
    String NumberInserted;
    boolean solutionBoolean;
    int NumberLength;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, select which program do you want to run: \n1 - EsCapicua\n2 - EsPrimo"+
    "\n3 - SiguientePrimo \n4 - potencia \n5 - digitos \n6 - voltea ");
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
      System.out.println("RESULT: "+solutionBoolean);
      break;
      case 2:
      // esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
      Scanner EsPri = new Scanner(System.in);
      System.out.println("Please, insert a number (i'll tell you if is prime): ");
      long NumbLong = EsPri.nextLong();
      solutionBoolean = EsPrimo(NumbLong);
      System.out.println("RESULT: "+solutionBoolean);
      break;
      case 3:
      // siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
      Scanner EsPri2= new Scanner(System.in);
      System.out.println("Please, insert a number (i'll tell you which is the next prime): ");
      long Numb = EsPri2.nextLong();
      System.out.print("RESULT: "+ SiguientePrimo(Numb) );
      break;
      case 4:
      // Potencia: Dada una base y un exponenete devuelve la potencia
      Scanner Potencia= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int base = Potencia.nextInt();
      System.out.println("Please, insert a exponent: ");
      int exponent = Potencia.nextInt();
      System.out.print("RESULT: "+potencia(base, exponent) );
      break;
      case 5:
      // digitos: Cuenta el numero de digitos de un numero entero
      Scanner LongitudNumero= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      long NumLongCalc = LongitudNumero.nextInt();
      System.out.print("RESULT: "+digitos(NumLongCalc));
      break;
      case 6:
      // voltea: le da la vuelta a un numero
      Scanner VoltearNum= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      long VoltNum = VoltearNum.nextLong();
      System.out.print("RESULT: "+voltea(VoltNum));
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
    boolean primo = true;
    int cont2 = 0; 
    if(Number<=2){
      primo = false;
    }
    else{
      for (int cont = 2; cont <=Number; cont++){  
        if((Number%cont) == 0){
          cont2++; 
        }
      } 
    }
    if(primo != false && (cont2<2)){
      primo = true;
    } else{
      primo = false;
    }
    
    return primo;
  }
  public static long SiguientePrimo (long Numb){
    long checking = Numb;
    do{
      checking++;
    }while(EsPrimo((checking))==false);
    long Confirmacion1 =checking;
    return Confirmacion1;
  }
  public static int potencia (int base,int potencia){
    int basecont = base; 
    for (int cont = potencia; cont > 1;cont--){
      basecont = basecont*base; 
    }
    return basecont;
  }
  public static int digitos (long NumLong){
    long NumLong2 = NumLong;
    int longitud = 0;
    do {
      NumLong2 /= 10; 
      longitud++; 
    } while (NumLong2 > 0);
    return longitud;
  }
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }
    long volteado = 0;
    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    return volteado;
  }
}  

