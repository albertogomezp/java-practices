    import java.util.Scanner;
public class p4516
{
    public static void main(String[] args)
    {
        int cont= 0;
        String respuesta;
        String verdadero ="verdadero";
        //pide y almacena 
        System.out.println("Test de posibilidad: Pareja infiel \n Responda 'verdadero' o 'verdadero' a las siguientes cuestiones");
        System.out.println("1. Tu pareja parece estar mas inquieta de lo normal sin ningun motivo aparente");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        System.out.println("3. Ha perdido el interes que mostraba anteriormente por ti");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        System.out.println("4. Ahora se afeita y se asea con ms frecuencia (si es hombre) o ahora se arregla el pelo y se asea con ms frecuencia (si es mujer)");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        System.out.println("5. No te deja que mires la agenda de su telefono movil");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando ests tu delante");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        System.out.println("7. ultimamente se preocupa ms en cuidar la linea y/o estar bronceado/a");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        System.out.println("8. Muchos dias viene tarde despues de trabajar porque dice tener mucho ms trabajo");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        System.out.println("9. Has notado que ultimamente se perfuma ms");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta = System.console().readLine();
        if (respuesta==verdadero){cont++;}
        cont = 3*cont;
        int x = 0;
        if(x<=cont && cont<=10)
        {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
        if(11<=cont && cont<=22)
        {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");;
        }
        if(23<=cont && cont<=30)
        {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");;
        }
    }
}