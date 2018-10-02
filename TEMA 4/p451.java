    import java.util.Scanner;
public class p451
{
    public static void main(String[] args)
    {
        System.out.println("Introduzca un dia de la semana");
        //pide y almacena el dia de la semana, 
        String dia = System.console().readLine();
        System.out.print("A primera hora toca: ");
        switch (dia)
        {
        case "lunes":
            System.out.print("Sistemas informaticos");
            break;
        case "martes":
            System.out.print("Programacion");
            break;
        case "miercoles":
            System.out.print("Entornos de desarrollo");
            break;
        case "jueves":
            System.out.print("Entornos de desarrollo");
            break;
        case "viernes":
            System.out.print("Sistemas informaticos");
            break;    
        default:
            System.out.println("ERROR");         

        }              
    }
}