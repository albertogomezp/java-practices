    import java.util.Scanner;


public class p453
{
    public static void main(String[] args)
    {
        System.out.println("Introduzca un numero");
        //pide y almacena el numero introducido
        String numero = System.console().readLine();
        int numeroint = Integer.parseInt(numero);
        switch (numeroint)
        {    
            case 1:
                numeroint=1;
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves"); 
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR"); 
                break;                        
        }            
    }
}