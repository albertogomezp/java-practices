import java.util.Scanner;
public class p4511
{
    public static void main(String[] args)
    {
        //pide y almacena hora
        System.out.println("Introduce la hora (solo horas)");
        String horas;   
        horas = System.console().readLine();
        int hora = Integer.parseInt(horas);
        //pide y almacena minutos
        System.out.println("Introduce minutos (solo minutos)");
        String minutos;   
        minutos = System.console().readLine();
        int minuto = Integer.parseInt(minutos);
        double tiempo = (hora*60)+minuto;
        double medianoche = 24*60;
        double diferencia = medianoche-tiempo;
        diferencia =   diferencia/60;
        //System.out.println("QUEDAN "+diferencia+" HORAS PARA MEDIANOCHE");
        String format = "QUEDAN  HORAS %8.2f HORAS PARA MEDIANOCHE";
        System.out.printf(format, diferencia);
    }
}