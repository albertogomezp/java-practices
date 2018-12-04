package mats;
public class operaciones{
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
  public static int BinToDec (String NumStrng) {
		char ar[] = NumStrng.toCharArray();
		int Numlength = NumStrng.length();
		int Exponent = 1;
		int BinNumber = 0;
		for (int cont = Numlength-1; cont>=0;cont--) {
			BinNumber = BinNumber+( (ar[cont]-48)*Exponent );
			//System.out.println("BinNumber "+BinNumber+"  Ar[cont] "+ar[cont]+"  Exponent "+Exponent+"    "+((ar[cont])-48));
			Exponent *= 2;
		}
    return BinNumber;	
    }
} 