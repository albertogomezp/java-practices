import java.util.Scanner;
import mats.operaciones;
public class p8617{
  public static void main(String[] args) {
    Scanner BinEs = new Scanner(System.in);
    System.out.println("Please, insert a binary number");
		String NumStrng = BinEs.nextLine();
		System.out.println(mats.operaciones.BinToDec(NumStrng));
	}
}