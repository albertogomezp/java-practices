import java.util.Scanner;
public class entrada
{
    public static void main(String[] args)
    {
        String nombre;
        System.out.println("dime tu nombre");
        nombre = System.console().readLine();
        System.out.println("Hola, "+nombre);
    }
}