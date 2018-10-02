import java.util.Scanner;
public class p344
{
    public static void main(String[] args)
    {
        //pide y almacena el 1er numero
        System.out.println("Introduce el primer numero");
        String num1;   
        num1 = System.console().readLine();
        int numint1 = Integer.parseInt(num1);
        //pide y almacena el 2do numero
        System.out.println("Introduce el segundo numero");
        String num2;   
        num2 = System.console().readLine();
        int numint2 = Integer.parseInt(num2);
        System.out.println("La suma de ambos es: "+(numint1+numint2));
        System.out.println("La resta de ambos es: "+(numint1-numint2));
        System.out.println("La multiplicacion de ambos es: "+(numint1*numint2));
        System.out.println("La division de ambos es: "+(numint1/numint2));
              
    }
}