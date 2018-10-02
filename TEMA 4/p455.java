    import java.util.Scanner;
public class p455
{
    public static void main(String[] args)
    {
        //pide y almacena a
        System.out.println("Introduce el valor de a");
        String a;   
        a = System.console().readLine();
        double aint = Integer.parseInt(a);

        System.out.println("Introduce el valor de b");
        String b;
        b = System.console().readLine();
        double bint = Integer.parseInt(b);
        double x = (-bint)/aint;
        System.out.println("x= "+x);
    }
}