    import java.util.Scanner;
public class p4519
{
    public static void main(String[] args)
    {
        //pide y almacena 
        System.out.println("Introduce el numero");
        String num = System.console().readLine();
        int n = Integer.parseInt(num);

        if((0<=n && n<=9 )|| (-9<=n  &&  0<=n))
        {System.out.println("El numero tiene una cifra");}
        else
        {
            if((9<=n && n<=100 )|| (-100<=n  && -9<=n))
            {System.out.println("el numero tiene dos cifras");}
            else
            {
                if((99<=n && n<=1000 )|| (-1000<=n  && -99<=n))
                {System.out.println("el numero tiene tres cifras");}
                else
                {
                    if((999<=n && n<=10000 )|| (-10000<=n  && -999<=n))
                    {System.out.println("el numero tiene cuatro cifras");}
                    else
                    {
                      if((9999<=n && n<=100000 )|| (-100000<=n  && -9999<=n))
                        {System.out.println("el numero tiene cinco cifras");}
                    }
                }
            }    
        }
    }
}