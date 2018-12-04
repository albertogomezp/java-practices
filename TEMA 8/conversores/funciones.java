package conversores;
import java.util.Scanner;
public class funciones{  
	public static String BinBase (String NumberBinBase) {
		char ar[] = NumberBinBase.toCharArray();
		int Numlength = NumberBinBase.length();
		int Exponent = 1;
		int BinNumber = 0;
		String NumbConvertido ="";
		System.out.println("Introduzca la base a la que quiere convertir (1.DEC 2.OCT 3.HEX");
		Scanner BaseDes = new Scanner(System.in);
		string BaseIntSel = BaseDes.nextLine();
		switch (BaseIntSel){
			case 1: //to DEC
			NumbConvertido = BinToDec(NumberBinBase);
			break;
			case 2: //to OCT
			break;
			case 3: //to HEX
			break;
		}
    return NumbConvertido;	
  }
  public static String BinToDec (String NumStrng) {
		char ar[] = NumStrng.toCharArray();
		int Numlength = NumStrng.length();
		int Exponent = 1;
		int BinNumber = 0;
		for (int cont = Numlength-1; cont>=0;cont--) {
			BinNumber = BinNumber+( (ar[cont]-48)*Exponent );
			//System.out.println("BinNumber "+BinNumber+"  Ar[cont] "+ar[cont]+"  Exponent "+Exponent+"    "+((ar[cont])-48));
			Exponent *= 2;
		}
    return (BinNumber.toString());	
  }
	public static int BintoOct (String NumStrng) {
		char ar[] = NumStrng.toCharArray();
		int Numlength = NumStrng.length();
		int Exponent = 1;
		int OctNumber = 0;
		int Splitter = 1;
		for (int cont = Numlength-1; cont>=0;cont--) {
			if(Splitter<=3){
				OctNumber = OctNumber+( (ar[cont]-48)*Exponent );
				Exponent *= 2;
				Splitter++;
			}
			if(Splitter==3){
				Splitter=1;
				OctNumber=OctNumber*10;
			} 
		}
    return OctNumber.toString();	
  }
}