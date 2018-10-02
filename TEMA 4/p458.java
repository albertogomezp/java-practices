    import java.util.Scanner;
public class p458
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
        if(media<5)
        {
            System.out.println("INSUFICIENTE");
        }
        else
        {
            if(media >=5 && media <6)
            {
                System.out.print("SUFICIENTE");
            }
            else
            {
                 if(media>=6 && media<7)
                {
                     System.out.println("BIEN");
                } 
                else
                {   
                    if(media >=7 && media<9)
                    {
                    System.out.print("NOTABLE");
                    }
                    else
                    {
                    if(media >=9 && media<10)
                        {
                        System.out.println("SOBRESALIENTE");
                        }
                    else
                        {
                            System.out.println("ERROR");
                        }
                    }
                }
            }
        }
    }
}