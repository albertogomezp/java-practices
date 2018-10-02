import java.util.Scanner;
public class p4512
{
    public static void main(String[] args)
    {
        int cont=0;
        //------------------------------------------------------------------
        System.out.printf("Que es java? \n 1) Una app de Android \n 2) Un lenguaje de programacion \n 3) Un videojuego \n"); 
        String respuesta = System.console().readLine();
        int resp = Integer.parseInt(respuesta);
        if(resp==2){cont++;}
        //------------------------------------------------------------------
        System.out.printf("Como se define un numero decimal? \n 1) int numero; \n 2) double numero; \n 3) String numero; \n"); 
        respuesta = System.console().readLine();
        resp = Integer.parseInt(respuesta);
        if(resp==2){cont++;}
        //------------------------------------------------------------------
        System.out.printf("Es lo mismo = que ==? \n 1) Si \n 2) No, pero solo los jueves \n 3) No \n"); 
        respuesta = System.console().readLine();
        resp = Integer.parseInt(respuesta);
        if(resp==3){cont++;}
        //------------------------------------------------------------------
        System.out.printf("Que es System.out.print? \n 1) Un sentencia que imprime por pantalla \n 2) Manda a imprimir a la impresora local \n 3) Apaga Windows \n"); 
        respuesta = System.console().readLine();
        resp = Integer.parseInt(respuesta);
        if(resp==1){cont++;}
        //------------------------------------------------------------------
        System.out.printf("Que es compilar? \n 1) Hacer pilas \n 2) Pasar a lenguaje de java un programa \n 3) Una actividad cultural \n"); 
        respuesta = System.console().readLine();
        resp = Integer.parseInt(respuesta);
        if(resp==2){cont++;}
        //------------------------------------------------------------------
        System.out.printf("Para que sirve el ;? \n 1) para separar sentencias \n 2) No tiene uso en Java \n 3) Separar palabras \n"); 
        respuesta = System.console().readLine();
        resp = Integer.parseInt(respuesta);
        if(resp==1){cont++;}
        //------------------------------------------------------------------
        System.out.printf("Selecciona el correcto \n 1) int = numero 2 \n 2) int numero = 2 \n 3) int numero = 2; \n"); 
        respuesta = System.console().readLine();
        resp = Integer.parseInt(respuesta);
        if(resp==2){cont++;}
        //------------------------------------------------------------------
        System.out.printf("Cual usa Java? \n 1) Android \n 2) Un reloj  \n 3) Todo usa Java \n"); 
        respuesta = System.console().readLine();
        resp = Integer.parseInt(respuesta);
        if(resp==1){cont++;}
        //------------------------------------------------------------------
        System.out.printf("Que es la terminal? \n 1) Donde acaba el codigo \n 2) Donde se escribe el codigo \n 3) Donde se ejecuta un programa de java, por ejemplo \n"); 
        respuesta = System.console().readLine();
        resp = Integer.parseInt(respuesta);
        if(resp==2){cont++;}
        //------------------------------------------------------------------
        System.out.printf("Como se guarda un archivo de Java? \n 1) .java \n 2) .class \n 3) no se guardan \n"); 
        respuesta = System.console().readLine();
        resp = Integer.parseInt(respuesta);
        if(resp==1){cont++;}
        //-------------------------------------------------------------------
        if(resp==10){System.out.print("ERES UN EXPERTO EN JAVA!");}
        else{System.out.println("TU PUNTUACION ES "+cont);}

    }
}