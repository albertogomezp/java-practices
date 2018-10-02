import java.util.Scanner;
public class ejextra3
{
    public static void main(String[] args)
    {
        //pide y almacena el radio del circulo
        System.out.println("Introduce el radio");
        double rad = Integer.parseInt(System.console().readLine());
        double pi =3.1415;
        double rad2 = rad*rad;
        double longi= 2*pi*rad;
        System.out.println("LA LONGITUD ES: "+longi);
    }
}