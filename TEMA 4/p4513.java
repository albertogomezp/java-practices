    import java.util.Scanner;
public class p4513
{
    public static void main(String[] args)
    {
        //pide y almacena a
        System.out.println("Introduce el primer numero");
        String as;   
        as = System.console().readLine();
        double a = Integer.parseInt(as);
        //pide y almacena b
        System.out.println("Introduce el segundo numero");
        String bs;   
        bs = System.console().readLine();
        double b = Integer.parseInt(bs);
        System.out.println("Introduce el tercer numero");
        String cs;
        cs = System.console().readLine();
        double c = Integer.parseInt(cs);
        double n1; //MAYOR
        double n2; //INTERMEDIO
        double n3; //MENOR
        if(a>b)
        {
         n1 = a; //n1 - 1
         n3 = b; //n2 - 3
         n2 = c; //n3 - 2
        }
        else
        {   
         n3 = a; //n1 - 3   
         n1 = b; //n2 - 1
         n2 = c; //n3 - 2

        }
        if (n1<c)
        {
         
         n2 = n1; //2do  
         n1 = c;  //1ro
        }
        else
        {
         c = n2; //2do
         //n1 = n1
        }
        if (n2<n3)
        {
         double x = n2; //variables para el cambio
         double y = n3; //variables para el cambio
         n3 = x;
         n2 = y;
        }
        System.out.print("EL PRIMER NUMERO ES: "+n1+"\n EL SEGUNDO NUMERO ES: "+n2+"\n EL TERCER NUMERO ES: "+n3);
    }
}