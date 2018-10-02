import java.util.Scanner;
public class p4522
{
    public static void main(String[] args)
    {
        //pide y almacena dia
        System.out.println("Introduce el dia (solo dia)");
        int dia = Integer.parseInt(System.console().readLine());
        //pide y almacena hora
        System.out.println("Introduce la hora (solo horas)");
        int hora = Integer.parseInt(System.console().readLine());
        //pide y almacena minutos
        System.out.println("Introduce minutos (solo minutos)");
        int minuto = Integer.parseInt(System.console().readLine());

        double tiempo = (dia*24*60)+(hora*60)+minuto;
        double finde = (5*24*60)+(15*60);
        double diferencia = finde-tiempo;
       if(diferencia>60)
        {
            diferencia =diferencia/60;
            String format = "QUEDAN %8.2f HORAS PARA EL FIN DE SEMANA";
            System.out.printf(format, diferencia);
        }
        //System.out.println("QUEDAN "+diferencia+" HORAS PARA EL FIN DE SEMANA");
        String format = "QUEDAN %8.2f MINUTOS PARA EL FIN DE SEMANA";
        System.out.printf(format, diferencia);
    }
}