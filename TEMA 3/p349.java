    import java.util.Scanner;
public class p349
{
    public static void main(String[] args)
    {
        //pide y almacena el 1er valor, el radio
        System.out.println("Introduce el radio del cono");
        String num1;   
        num1 = System.console().readLine();
        int numint1 = Integer.parseInt(num1);
        //pide y almacena el 2do valor, la altura
        System.out.println("Introduce la altura");
        String num2;   
        num2 = System.console().readLine();
        double numint2 = Integer.parseInt(num2);
        double vol = ((numint1*numint1)*3.14*numint2)/3;
        System.out.println("El volumen del cono es: "+vol);
              
    }
}