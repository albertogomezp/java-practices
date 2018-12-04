import java.util.Scanner;
import mats.operaciones;
public class p86_1_to_14{ 
  public static void main(String[] args) {
    //--> Setup (common vars)
    String NumberInserted;
    boolean solutionBoolean;
    int NumberLength;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, select which program do you want to run: \n1  - EsCapicua\n2  - EsPrimo"+
    "\n3  - SiguientePrimo \n4  - potencia \n5  - digitos \n6  - voltea \n7  - DigitoN \n8  - posicionDeDigito  "+
    "\n9  - quitaPorDetras \n10 - quitaPorDelante \n11 - pegaPorDetras \n12 - pegaPorDelante \n13 - trozoDeNumero "+
    "\n14 - juntaNumeros");
    int selection = scanner.nextInt();
    switch(selection){
      case 1:
      //esCapicua: Devuelve verdadero si el numero que se pasa como parametro es capicua y falso en caso contrario.
      Scanner EsCap = new Scanner(System.in);
      System.out.println("Please, insert a number (i'll tell you if is a palindrome): ");
      NumberInserted = EsCap.nextLine();
      char[] Numbers = NumberInserted.toCharArray();
      NumberLength = NumberInserted.length();
      solutionBoolean = mats.operaciones.EsCapicua(NumberInserted, Numbers,NumberLength);
      System.out.println("RESULT: "+solutionBoolean);
      break;
      case 2:
      // esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
      Scanner EsPri = new Scanner(System.in);
      System.out.println("Please, insert a number (i'll tell you if is prime): ");
      long NumbLong = EsPri.nextLong();
      solutionBoolean = mats.operaciones.EsPrimo(NumbLong);
      System.out.println("RESULT: "+solutionBoolean);
      break;
      case 3:
      // siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
      Scanner EsPri2= new Scanner(System.in);
      System.out.println("Please, insert a number (i'll tell you which is the next prime): ");
      long Numb = EsPri2.nextLong();
      System.out.print("RESULT: "+ mats.operaciones.SiguientePrimo(Numb) );
      break;
      case 4:
      // Potencia: Dada una base y un exponenete devuelve la potencia
      Scanner Potencia= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int base = Potencia.nextInt();
      System.out.println("Please, insert a exponent: ");
      int exponent = Potencia.nextInt();
      System.out.print("RESULT: "+mats.operaciones.potencia(base, exponent) );
      break;
      case 5:
      // digitos: Cuenta el numero de digitos de un numero entero
      Scanner LongitudNumero= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      long NumLongCalc = LongitudNumero.nextInt();
      System.out.print("RESULT: "+mats.operaciones.digitos(NumLongCalc));
      break;
      case 6:
      // voltea: le da la vuelta a un numero
      Scanner VoltearNum= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      long VoltNum = VoltearNum.nextLong();
      System.out.print("RESULT: "+mats.operaciones.voltea(VoltNum));
      break;
      case 7:
      // digitoN: Devuelve el digito de la posicion indicada
      Scanner digitoN= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      long NumDig = digitoN.nextLong();
      System.out.println("Please, insert a position (0-N): ");
      int PosDig = digitoN.nextInt();
      System.out.print("RESULT: "+mats.operaciones.digitoN(NumDig,PosDig));
      break;
      case 8:
      // posicionDeDigito: Da  posición de la 1ra ocurrencia de un dígito  de un número entero. Si no se encuentra, devuelve -1.
      Scanner DigPos= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      long DigNum = DigPos.nextLong();
      System.out.println("Please, insert a digit: ");
      int DigWanted = DigPos.nextInt();
      System.out.print("RESULT: "+(mats.operaciones.posicionDeDigito(DigNum,DigWanted)));
      break;
      case 9:
      // quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
      Scanner QuitBack= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int NumbQuit = QuitBack.nextInt();
      System.out.println("Please, insert how many numbers you wanna quit: ");
      int Numb2Quit = QuitBack.nextInt ();
      System.out.print("RESULT: "+(mats.operaciones.quitaPorDetras(NumbQuit,Numb2Quit)));
      break;
      case 10:
      // quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
      Scanner QuitFront= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int aNumbQuit = QuitFront.nextInt();
      System.out.println("Please, insert how many numbers  you wanna quit: ");
      int aNumb2Quit = QuitFront.nextInt ();
      System.out.print("RESULT: "+(mats.operaciones.quitaPorDelante(aNumbQuit,aNumb2Quit)));
      break;
      case 11:
      // pegaPorDetras: Añade un dígito a un número por detrás.
      Scanner AddBack= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int Numadd = AddBack.nextInt();
      System.out.println("Please, insert the numbers  you wanna add: ");
      int Num2add = AddBack.nextInt ();
      System.out.print("RESULT: "+(mats.operaciones.pegaPorDetras(Numadd,Num2add)));
      break;
      case 12:
      // pegaPorDelante: Añade un dígito a un número por delante.
      Scanner AddFront= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int Numadd2 = AddFront.nextInt();
      System.out.println("Please, insert the numbers  you wanna add: ");
      int Num2add2 = AddFront.nextInt ();
      System.out.print("RESULT: "+(mats.operaciones.pegaPorDelante(Numadd2,Num2add2)));
      break;
      case 13:
      // trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
      Scanner Chop= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int NumbChop = Chop.nextInt();
      System.out.println("Please, insert the initial position: ");
      int NumbIni = Chop.nextInt ();
      System.out.println("Please, insert the initial position: ");
      int NumbEnd = Chop.nextInt ();
      System.out.print("RESULT: "+mats.operaciones.trozoDeNumero(NumbChop, NumbIni, NumbEnd));
      break;
      case 14:
      //juntaNumeros: Pega dos números para formar uno.      
      Scanner JoinNumber= new Scanner(System.in);
      System.out.println("Please, insert the first number: ");
      int firstJoin = JoinNumber.nextInt ();
      System.out.println("Please, insert the second number: ");
      int secondJoin = JoinNumber.nextInt ();
      System.out.print("RESULT: "+mats.operaciones.juntaNumeros(firstJoin, secondJoin));
      break;
    }
  }
}  

