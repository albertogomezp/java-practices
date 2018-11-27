import java.util.Scanner;
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
      case 7:
      // digitoN: Devuelve el digito de la posicion indicada
      Scanner digitoN= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      long NumDig = digitoN.nextLong();
      System.out.println("Please, insert a position (0-N): ");
      int PosDig = digitoN.nextInt();
      System.out.print("RESULT: "+digitoN(NumDig,PosDig));
      break;
      case 8:
      // posicionDeDigito: Da  posición de la 1ra ocurrencia de un dígito  de un número entero. Si no se encuentra, devuelve -1.
      Scanner DigPos= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      long DigNum = DigPos.nextLong();
      System.out.println("Please, insert a digit: ");
      int DigWanted = DigPos.nextInt();
      System.out.print("RESULT: "+(posicionDeDigito(DigNum,DigWanted)));
      break;
      case 9:
      // quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
      Scanner QuitBack= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int NumbQuit = QuitBack.nextInt();
      System.out.println("Please, insert how many numbers you wanna quit: ");
      int Numb2Quit = QuitBack.nextInt ();
      System.out.print("RESULT: "+(quitaPorDetras(NumbQuit,Numb2Quit)));
      break;
      case 10:
      // quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
      Scanner QuitFront= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int aNumbQuit = QuitFront.nextInt();
      System.out.println("Please, insert how many numbers  you wanna quit: ");
      int aNumb2Quit = QuitFront.nextInt ();
      System.out.print("RESULT: "+(quitaPorDelante(aNumbQuit,aNumb2Quit)));
      break;
      case 11:
      // pegaPorDetras: Añade un dígito a un número por detrás.
      Scanner AddBack= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int Numadd = AddBack.nextInt();
      System.out.println("Please, insert the numbers  you wanna add: ");
      int Num2add = AddBack.nextInt ();
      System.out.print("RESULT: "+(pegaPorDetras(Numadd,Num2add)));
      break;
      case 12:
      // pegaPorDelante: Añade un dígito a un número por delante.
      Scanner AddFront= new Scanner(System.in);
      System.out.println("Please, insert a number: ");
      int Numadd2 = AddFront.nextInt();
      System.out.println("Please, insert the numbers  you wanna add: ");
      int Num2add2 = AddFront.nextInt ();
      System.out.print("RESULT: "+(pegaPorDelante(Numadd2,Num2add2)));
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
      System.out.print("RESULT: "+trozoDeNumero(NumbChop, NumbIni, NumbEnd));
      break;
      case 14:
      //juntaNumeros: Pega dos números para formar uno.      
      Scanner JoinNumber= new Scanner(System.in);
      System.out.println("Please, insert the first number: ");
      int firstJoin = JoinNumber.nextInt ();
      System.out.println("Please, insert the second number: ");
      int secondJoin = JoinNumber.nextInt ();
      System.out.print("RESULT: "+juntaNumeros(firstJoin, secondJoin));
      break;
      
      
    }
  }
  
  //----------> FUNCIONES 
  
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
  public static long digitoN(long Number,int Position) {
    long div = 10;
    String NumString = String.valueOf(Number);
    int longi = NumString.length();
    long temp = 0;
    long ar[] = new long [longi];
    for (int cont = (longi-1); cont >=0; cont--){
      ar[cont] = ((Number%div)-temp);
      if(cont<longi-1){
        ar[cont] =  (ar[cont])/(div/10);
      }
      temp = temp+ar[cont];
      div *=10;
    }
    long Sol = ar[Position];
    return Sol;    
  }
  public static long posicionDeDigito(long Number,int Digit) {
    long div = 10;
    String NumString = String.valueOf(Number);
    int longi = NumString.length();
    long temp = 0;
    long ar[] = new long [longi];
    for (int cont = 0; cont <=(longi-1); cont++){
      ar[cont] = ((Number%div)-temp);
      if(cont>0){
        ar[cont] =  (ar[cont])/(div/10);
      }
      temp = temp+ar[cont];
      div *=10;
      //System.out.println(" "+ar[cont]+" ");
    }
    int cont2 = -1;
    do { 
      
      cont2++;
      temp = ar[cont2];
    }while(cont2<=longi-1 && temp != Digit  );
    long Sol = 0;
    if(cont2 == longi && ar[cont2] != Digit){
      Sol = -1;
    }
    else{ 
      Sol = ar[cont2];
    }
    return Sol;     
  }
  public static long quitaPorDetras(int Number,int QuitNumber) {
    int cont = 1;
    int i = 0;
    for (i = 1; i<=QuitNumber; i++){ cont*=10; }
    return (int)(Number/cont); 
  }
  public static long quitaPorDelante(int Number,int QuitNumber) { 
    int longi = (Integer.toString(Number)).length();
    int cont = 1;
    int i = 0;
    for (i = 1; i<=(longi-QuitNumber); i++){ cont*=10; }
    int temp =  (int)(Number/cont); 
    temp = temp*cont;
    return Number-temp;
  }
  public static long pegaPorDetras(int Number,int AddNumber) { 
    int longi = (Integer.toString(AddNumber)).length();
    int i = 0;
    int cont = 1;
    for (i = 1; i<=longi; i++){ cont*=10; }
    int temp =  (int)(Number*cont); 
    return AddNumber+temp;
  }
  public static long pegaPorDelante(int Number,int AddNumber) { 
    int longi = (Integer.toString(Number)).length();
    int i = 0;
    int cont = 1;
    for (i = 1; i<=longi; i++){ cont*=10; }
    int temp =  (int)(AddNumber*cont); 
    return Number+temp;
  }
  public static long trozoDeNumero(int Number,int Initial, int Final) { 
    int longi = (Integer.toString(Number)).length();
    int ar[] = new int [longi]; 
    int temp = 0;
    int cont = longi-1;
    do{
      ar[cont] = Number%10;
      Number /= 10;
      cont--;
    } while  (Number > 0);
    int cont2 = 1;
    temp = 0;
    for (int i = Initial-1; i<=Final-1; i++){
      if(i == Final-2){
        temp = ((temp)*10)+ar[i];
      }
      else{
        temp = ((temp)*10)+ar[i];
      }
      System.out.println(temp+" "+cont2+" "+ar[i]);
    }
    return temp;
  }
  public static long juntaNumeros(int Number1,int Number2) { 
    String Num1 = Integer.toString(Number1);
    String Num2 = Integer.toString(Number2);
    String Sol = Num1.concat(Num2);
    int SolInt = Integer.parseInt(Sol);
    return SolInt;
  }
}  

