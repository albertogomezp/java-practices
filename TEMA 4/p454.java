    import java.util.Scanner;
public class p454
{
    public static void main(String[] args)
    {
        //pide y almacena el numero de horas trabajadas/dia
        System.out.println("Introduce las horas trabajadas a la semana");
        String horas;   
        int total;
        horas = System.console().readLine();
        int horasint = Integer.parseInt(horas);
        if(horasint<=40)
        {
        total = horasint*12; 
        }
        else
        {
            total = 480+((horasint-40)*16); 
        }
        System.out.println("El salario mensual es: "+total+" euros");  
                  
    }
}