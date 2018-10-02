    import java.util.Scanner;
public class p347
{
    public static void main(String[] args)
    {
        //pide y almacena la base imponible
        System.out.println("Introduce la base imponible (precio sin IVA)");
        String base;   
        base = System.console().readLine();
        int baseint = Integer.parseInt(base);
        System.out.println("El coste total (IVA 21% incluido) es: "+(baseint+(baseint*0.21))+" euros");              
    }
}