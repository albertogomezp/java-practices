    import java.util.Scanner;
public class p4515
{
    public static void main(String[] args)
    {
        //pide y almacena 
        System.out.println("Introduce el caracter");
        String n;   
        String h=" ";
        n = System.console().readLine();

        System.out.println("Quiere el vertice arriba o abajo? Responda EXACTAMENTE 'arriba' o 'abajo' (sin comillas) ");
        String res;   
        res = System.console().readLine();
        String ar="arriba";
        String ab="abajo";
        if(res.equals(ar))
        {
            System.out.println("    "+n+"    ");
            System.out.println("   "+n+h+n+"   ");
            System.out.println("  "+n+h+h+h+n+"  ");
            System.out.println(" "+n+h+n+h+n+h+n+" ");
        }
        if(res.equals(ab))
        {
            System.out.println(" "+n+h+n+h+n+h+n+" ");
            System.out.println("  "+n+h+h+h+n+"  ");
            System.out.println("   "+n+h+n+"   ");
            System.out.println("    "+n+"    ");    
        }
    }
}