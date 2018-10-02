import java.util.Scanner;
public class p4520
{
    public static void main(String[] args)
    {
        //pide y almacena 
        System.out.println("Introduce el numero");
        String num = System.console().readLine();
        int n = Integer.parseInt(num);
        boolean check = false;
        if((0<=n && n<=9 )|| (-9<=n  &&  0<=n))
            {if((n/10)==(n%10));
            check = true;}
        else
        {
            if((9<=n && n<=100 )|| (-100<=n  && -9<=n))
            {if((n/100)==(n%100)); 
            check = true;}
            else
            {
                if((99<=n && n<=1000 )|| (-1000<=n  && -99<=n))
                {if((n/1000)==(n%1000)); 
                check = true;}
                else
                {
                    if((999<=n && n<=10000 )|| (-10000<=n  && -999<=n))
                    {if((n/10000)==(n%10000));
                     check = true;}
                    else
                    {
                      if((9999<=n && n<=100000 )|| (-100000<=n  && -9999<=n))
                          {if((n/100000)==(n%100000)); 
                           check = true;}   
                    }
                }
            }    
        }
        System.out.print(check);
    }
}