    import java.util.Scanner;
public class p457
{
    public static void main(String[] args)
    {
        //pide y almacena el primer numero
        System.out.println("Introduce el primer numero");
        String prim;   
        prim = System.console().readLine();
        double primint = Integer.parseInt(prim);
        //pide y almacena b
        System.out.println("Introduce el segundo numero");
        String seg;   
        seg = System.console().readLine();
        double segint = Integer.parseInt(seg);
        //pide y almacena el tercer numero
        System.out.println("Introduce el tercer numero");
        String ter;   
        ter = System.console().readLine();
        double terint = Integer.parseInt(ter);  
        double media =(primint+segint+terint)/3;
        System.out.println("La media de los tres numeros es: "+media);  
    }
}