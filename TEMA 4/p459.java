    import java.util.Scanner;
public class p459
{
    public static void main(String[] args)
    {
        //pide y almacena a
        System.out.println("Introduce el valor de a");
        String a;   
        a = System.console().readLine();
        double aint = Integer.parseInt(a);
        //pide y almacena b
        System.out.println("Introduce el valor de b");
        String b;   
        b = System.console().readLine();
        double bint = Integer.parseInt(b);
        System.out.println("Introduce el valor de c");
        String c;
        c = System.console().readLine();
        double cint = Integer.parseInt(c);
        //interior de la raiz:
        double raiz = Math.sqrt((bint*bint)-4*aint*cint);  
        System.out.println(raiz);
        // divisor
        double div = 2*aint;
        //valor positivo
        System.out.println("RESULTADO POSITIVO "+((-bint+raiz)/div));
        //Valor negativo
        System.out.println("RESULTADO NEGATIVO "+((-bint-raiz)/div));
            
    }
}