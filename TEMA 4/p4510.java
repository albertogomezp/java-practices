    import java.util.Scanner;
public class p4510
{
    public static void main(String[] args)
    {
        //pide y almacena dia
        System.out.println("Introduce el dia");
        String dias;    //Dia + s (string)
        dias = System.console().readLine();
        int dia = Integer.parseInt(dias);
        //pide y almacena mes
        System.out.println("Introduce el mes");
        String mess;   
        mess = System.console().readLine();
        int mes = Integer.parseInt(mess);
        switch(mes)
        {
        case 1:
            if(dia>=20)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES ACUARIO"); 
            }
            if(dia<20)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES CAPRICORNIO"); 
            }
            break;
        case 2:
            if(dia>=19)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES PISCIS"); 
            }
            if(dia<19)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES ACUARIO"); 
            }    
            break;
        case 3:
            if(dia>=21)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES ARIES"); 
            }
            if(dia<21)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES PISCIS"); 
            }         
            break;
        case 4:
            if(dia>=20)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES TAURO"); 
            }
            if(dia<20)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES ARIES"); 
            }         
            break;  
        case 5:
            if(dia>=21)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES GEMINIS"); 
            }
            if(dia<21)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES TAURO"); 
            }         
            break;       
        case 6:
            if(dia>=21)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES CANCER"); 
            }
            if(dia<21)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES GEMINIS"); 
            }         
            break;     
        case 7:
            if(dia>=23)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES LEO"); 
            }
            if(dia<23)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES CANCER"); 
            }         
            break;  
        case 8:
            if(dia>=23)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES VIRGO"); 
            }
            if(dia<23)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES LEO"); 
            }         
            break;        
        case 9:
            if(dia>=23)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES LIBRA"); 
            }
            if(dia<23)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES VIRGO"); 
            }         
            break;               
        case 10:
            if(dia>=23)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES ESCOPRIO"); 
            }
            if(dia<23)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES LIBRA"); 
            }         
            break;               
        case 11:
            if(dia>=22)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES SAGITARIO"); 
            }
            if(dia<22)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES ESCORPIO"); 
            }         
            break;               
        case 12:
            if(dia>=22)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES CAPRICORNIO"); 
            }
            if(dia<22)
            {
               System.out.println("TU SIGNO DEL ZODIACO ES SAGITARIO"); 
            }         
            break;     
        default:
            {
                System.out.println("ERROR");
            }
        }              



    }
}