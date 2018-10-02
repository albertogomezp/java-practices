    import java.util.Scanner;
public class p452
{
    public static void main(String[] args)
    {
        System.out.println("Que hora es?");
        //pide y almacena la hora
        String hora = System.console().readLine();
        double horaint = Integer.parseInt(hora);
        if(6<=horaint && horaint<=12)
          {
            System.out.println("Buenos dias :)");
          }
        else
         {
            if(12<horaint && horaint<=20)
                {
                  System.out.println("Buenas tardes");
                }
            else
                {  
                System.out.println("Buenas noches");
                }
         }
                     
    }
}