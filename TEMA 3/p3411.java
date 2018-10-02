    import java.util.Scanner;
public class p3411
{
    public static void main(String[] args)
    {
        //pide y almacena el 1er valor, los Kb deseados
        System.out.println("Introducir cantidad de Kb a convertir");
        String Kb;   
        Kb = System.console().readLine();
        double Kbint = Integer.parseInt(Kb);
        System.out.println(Kbint+" Kb son: "+(Kbint/1024)+" Mb");              
    }
}