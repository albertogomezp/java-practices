    import java.util.Scanner;
public class p3410
{
    public static void main(String[] args)
    {
        //pide y almacena el 1er valor, los Mb deseados
        System.out.println("Introducir cantidad de Mb a convertir");
        String Mb;   
        Mb = System.console().readLine();
        int Mbint = Integer.parseInt(Mb);
        System.out.println(Mbint+" Mb son: "+(Mbint*1024)+" Kb");              
    }
}