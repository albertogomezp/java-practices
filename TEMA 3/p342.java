import java.util.Scanner;
public class p342
{
    public static void main(String[] args)
    {
        
        double conv =166.386; 
        System.out.println("Introduce los euros a convertir");
        String linea;   
        linea = System.console().readLine();
        int euro = Integer.parseInt(linea);
        if (euro>0)
        {
            double total = euro*conv;
            System.out.println("Son "+total+" pesetas");
        }
    }
}