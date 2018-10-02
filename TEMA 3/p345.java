    import java.util.Scanner;
public class p345
{
    public static void main(String[] args)
    {
        //pide y almacena el 1er valor, la base
        System.out.println("Introduce el la base");
        String num1;   
        num1 = System.console().readLine();
        int numint1 = Integer.parseInt(num1);
        //pide y almacena el 2do valor, la altura
        System.out.println("Introduce la altura");
        String num2;   
        num2 = System.console().readLine();
        int numint2 = Integer.parseInt(num2);
        System.out.println("El area del rectangulo es: "+(numint1*numint2));
              
    }
}