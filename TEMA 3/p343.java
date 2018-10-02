import java.util.Scanner;
public class p343
{
    public static void main(String[] args)
    {
        
        double conv =166.386; 
        System.out.println("Introduce las pesetas a convertir");
        String linea;   
        linea = System.console().readLine();
        int pta = Integer.parseInt(linea);
        if (pta>0)
        {
            double total = pta/conv;
            System.out.println("Son "+total+" euros");
        }
    }
}