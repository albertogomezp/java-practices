/*
* Conversor binario - decimal
*
* @author Alberto Gómez Peña - 1º DAW
*
*/


import java.util.Scanner;
import conversores.funciones;
public class p8618{
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        System.out.println("Introduzca el numero binario");
        String Introduccion = Number.nextLine();
        String Solucion ="";
        Scanner NumberBin = new Scanner(System.in);
        Solucion = conversores.funciones.BinBase(Introduccion);
		System.out.println(Solucion);
	}
}