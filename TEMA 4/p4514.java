    import java.util.Scanner;
public class p4514
{
    public static void main(String[] args)
    {
        //pide y almacena 
        System.out.println("Introduce el numero");
        String nums;   
        nums = System.console().readLine();
        double num = Integer.parseInt(nums);
        if(num%2 == 0)
        {
            System.out.println(num+" ES PAR");
        }
        else
        {
            System.out.println(num+" ES IMPAR");
        }
        if(num%5 == 0)
        {
            System.out.println(num+" ES DIVISIBLE ENTRE 5");
        }
        else
        {
            System.out.println(num+" NO ES DIVISIBLE ENTRE 5");
        }
        
    }
}