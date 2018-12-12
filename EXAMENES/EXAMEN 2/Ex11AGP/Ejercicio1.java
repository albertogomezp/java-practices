import java.util.Scanner;
/*
* Ejercicio 1 del examen de programación del día 12/12/2018
*
* @author Alberto Gómez Peña
*/
public class Ejercicio1{ 
  public static void main(String[] args) {
    /**
    * Primero almacenaremos las palabras en un String de palabras y generaremos un numero al azar 0-9 
    * Con esto ya tendremos el programa preparado para el manejo de datos con el usuario
    */
    String[] PalabrasString = new String[10];
    PalabrasString[0] = "HOLA";
    PalabrasString[1] = "ESTOY";
    PalabrasString[2] = "OCIOSO";
    PalabrasString[3] = "PUES";
    PalabrasString[4] = "HOY";
    PalabrasString[5] = "TENEMOS";
    PalabrasString[6] = "EXAMEN";
    PalabrasString[7] = "PARA";
    PalabrasString[8] = "JUAN";
    PalabrasString[9] = "ANTONIO";
    int SelPalabra = (int)(Math.random()*10); 
    //System.out.println(PalabrasString[SelPalabra]);
    char[] PalabraOculta = (PalabrasString[SelPalabra]).toCharArray();
    int LongPalabra = (PalabrasString[SelPalabra]).length();
    //System.out.println(LongPalabra);
    char[] PalabraMostrar = new char [LongPalabra];
    for(int x = 0; x>PalabraOculta.length; x++){
      PalabraMostrar[x] =' ';
    }
    Scanner scanner = new Scanner(System.in);
    
    /**
    * Ahora, imprimiremos por pantalla los espacios que hay en la palabra, el numero de intentos  y menu con las teclas que se pueden pulsar
    * Esto será la cabecera del bucle que haremos durante todo el ejercicio.
    *
    * Condiciones del while:   >5 intentos, no se pulse 0, que las palarbras no coincidan 
    */
    boolean Ganar;
    Ganar = false;
    int Errores = 0;
    int intganar = 0;
    int comprobar = 0;
    String letraString;
    char[] LetracharAr;
    char letra =' ';
    int contiguales =-1;
    while(Errores<5 && letra !='0' && Ganar==false){
      
      for(int Print = 0; Print <LongPalabra; Print++){
        System.out.print(PalabraMostrar[Print]);
        if(Print <LongPalabra-1){
          System.out.print("-");
        }
        
      }
      if(Errores>0){
        System.out.println("\n Errores: "+Errores+"/5");
      }
      /**
      * Una vez hecha la presentación de la situación, pasaremos a la introducción de intento por parte del usuario
      * 
      */
      System.out.print("\nCARACTER A INTRODUCIR: ");
      letraString = scanner.next();
      letraString = letraString.toUpperCase();
      LetracharAr = letraString.toCharArray();
      letra = LetracharAr[0];
      //System.out.println(letra);
      /**
      * Ahora comprobaremos si el caracter introducido corresponde a la palabra del array
      */

      for(int Busqueda = 0; Busqueda<PalabraOculta.length;Busqueda++){
        //System.out.println("letra---> "+letra+"   pos "+PalabraOculta[Busqueda]);
        if(letra == PalabraOculta[Busqueda]){
          PalabraMostrar[Busqueda] = PalabraOculta[Busqueda];
          contiguales++;
        }
        else{
          comprobar++;
        }
      }
      if(comprobar!=LongPalabra-1 && contiguales<0){
        Errores++;
      }
      contiguales=-1;
      comprobar=0;
      for (int CmpGanar = 0; CmpGanar <PalabraMostrar.length; CmpGanar++){
        //System.out.println(PalabraMostrar[CmpGanar]+" "+PalabraOculta[CmpGanar]);
        if(PalabraMostrar[CmpGanar]==PalabraOculta[CmpGanar]){
          intganar++;
        }
      }
      //System.out.println(intganar+" "+PalabraMostrar.length);
      if(intganar==LongPalabra){
        Ganar=true;
      } 
      intganar=0;
    }   
      System.out.println("LA PALABRA ERA: "+PalabrasString[SelPalabra]);
  }  
}
