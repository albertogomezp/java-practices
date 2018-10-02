    import java.util.Scanner;
public class p456
{
    public static void main(String[] args)
    {
        //pide y almacena a
        System.out.println("Introduce la altura");
        String h;   
        h = System.console().readLine();
        double hint = Integer.parseInt(h);
        double t= Math.sqrt(2*hint/9.81);
        System.out.println(t);
    }
}