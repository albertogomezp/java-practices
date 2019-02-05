import java.util.ArrayList;
/**
 * @author Alberto Gómez Peña
 */
public class Gestor{
  public static void main(String[] args) {
    ArrayList<String> Nombres = new ArrayList<String>();
    System.out.println("Introduce el nombre de 6 compas de clase");
    for(int x = 0; x <6; x++){
      System.out.println("Nombre "+(x+1)+"/6: ");
      Nombres.add(System.console().readLine());
    }
    for(String num : Nombres){
      System.out.println(num);
    }
  }
}