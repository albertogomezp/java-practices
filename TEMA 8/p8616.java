import java.util.Scanner;
import mats.operaciones;
public class p8616{
	  public static void main(String[] args) {
		String NumberInserted ="";
		int NumberLength = 0;
	    
		for (int cont = 1; cont<=99999; cont++) {
			 NumberInserted = Integer.toString(cont);
		      char[] Numbers = NumberInserted.toCharArray();
		      NumberLength = NumberInserted.length();
		      if(mats.operaciones.EsCapicua(NumberInserted, Numbers,NumberLength) == true) {
			      System.out.println(" "+cont);
		      }
		}
	}
}