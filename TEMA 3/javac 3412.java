    import java.util.Scanner;
public class p3412
{
    public static void main(String[] args)
    {
        //pide y almacena el 1er valor, 
        System.out.println("*************************************************");
        System.out.println("*                                               *");
        System.out.println("*   Calculador de notas de Programacion (DAW)   *");
        System.out.println("*      (Introduzca nota del primer examen)      *");
        System.out.println("*************************************************");
        String nota1;   
        nota1 = System.console().readLine();
        double nota1int = Integer.parseInt(nota1);
        System.out.println("Introduzca nota media deseada");
        String notades;
        notades = System.console().readLine();
        double notadesint = Integer.parseInt(notade);
        double notanec= (2*notadesint)-nota1int;       
        System.out.println("Necesitas sacar un: "+notanec);       
    }
}