public class p5424 { 
  public static void main(String[] args){
    //------------------PREPARATIVOS-----------------
    System.out.print(" POR FAVOR, INSERTE LA ALTURA:  ");
    int num = Integer.parseInt(System.console().readLine()); // num = altura
    int numcont = num;                                       // numcont = altura que controla los espacios
    int ancho = 0;                                           // ancho = controla el ancho de la piramide
    for(int x = 1; x<=num; x++){
      ancho = ancho + 2;
    }
    String esp = "";                                         // esp=""
       /*esp: Ya que cada vez tenemos menos espacios antes de los numeros a imprimir, habra que controlar
              cuantos espacios vamos imprimiendo. De manera que se usa la sentencia concat para calcular
              el nº de espacios. siendo en la primera linea la altura-1, en la segunda altura-2,...       */
    //------------------CUENTAS-----------------------
    for (int alt = 1; alt <=num; alt++ ){ //INT ALT DA LA ALTURA DE LA PIRAMIDE Y VA MARCANDO LA LINEA A PRINTEAR
      for(int cont=1; cont<=numcont; cont++){ //COLOCA LOS ESPACIOS DE LA PIRAMIDE
        esp = esp.concat(" "); //ESP VA ALMACENANDO LOS ESPACIOS DE LA PIRAMIDE
      /*  P.E) Si introducimos altura 4, obtendremos:
          |   1   | ----> 3 y 3 espacios = 6  numeros = 1 total = 7
          |  121  | ----> 2 y 2 espacios = 4  numeros = 3 total = 7
          | 12321 | ----> 1 y 1 espacios = 2  numeros = 5 total = 7
          |1234321| ---->   0   espacios = 0  numeros = 7 total = 7
          como podemos observar, a memida que aumentan los numeros, disminuyen los espacios pero siempre
          tendremos 7 caracteres por fila.      */
      }       
      numcont--; //Baja en 1 el numero de espacios que nos encontramos. siendo num-1,num-2,...num-n
      //-----------------PRINT---------------
      System.out.print(esp);
      for(int cont2=1; cont2<=alt; cont2++){ //COLOCA EL RELLENO DE LA PIRAMIDE
        esp = esp.concat(" "); //ESP VA ALMACENANDO LOS ESPACIOS DE LA PIRAMIDE
      }  

      for (int cont3=1; concleaclt3<alt; cont3++){
        System.out.print(cont3);
      }     
      //System.out.print(alt);
      for (int cont4=alt; cont4>0; cont4--){
        System.out.print(cont4);
      }    

      System.out.println(esp);    
      esp ="";
      //-----------------RESET---------------
    }
  }
}