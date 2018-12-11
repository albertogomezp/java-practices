import java.util.Scanner;
import conversores.funciones;
public class p8619{
  public static void main(String[] args) {
    Scanner Number = new Scanner(System.in);
    System.out.println("Introduzca el numero");
	String Introduccion = Number.nextLine();

    Scanner Base = new Scanner(System.in);
    System.out.println("Indique la base (1.- Binario \n2.- Decimal \n3.- Hexagesimal \n4.- Octal");
	int base = BinEs.nextLine();

    String Solucion ="";
    switch(base){
        case 1: //binaria
        Scanner NumberBin = new Scanner(System.in);
        Solucion = conversores.funciones.BinBase(Introduccion);
        break;
        case 2: //Decimal
        break;
        case 3: //Hexagesimal
        case 4: //octal
        break;
        default:
        System.out.println("ERROR");
        break;
    }
		System.out.println(Solucion);
	}
}