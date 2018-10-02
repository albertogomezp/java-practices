    import java.util.Scanner;
public class p348
{
    public static void main(String[] args)
    {
        //pide y almacena el numero de horas trabajadas/dia
        System.out.println("Introduce las horas trabajadas/dia");
        String horas;   
        horas = System.console().readLine();
        int horasint = Integer.parseInt(horas);
        int total = horasint*240; //OJO: Suponiendo que se trabajan 5 dias/semana (horas*dinero*dias trabajados al mes)
        System.out.println("El salario mensual es: "+total+" euros");              
    }
}