public class p5430 {
  public static void main(String[] args){
    //--------------------------- PEDIR VALORES --------------------------------
    System.out.print(" POR FAVOR, INSERTE EL PRIMER DIA (1-7):  ");         
    int dia1 = Integer.parseInt(System.console().readLine()); //SE ALMACENA EL DIA1
    System.out.print(" POR FAVOR, INSERTE LA HORA (hh):  ");         
    int hora1 = Integer.parseInt(System.console().readLine());
    System.out.print(" POR FAVOR, INSERTE EL SEGUNDO DIA DIA (1-7):  ");         
    int dia2 = Integer.parseInt(System.console().readLine()); //SE ALMACENA EL DIA2
    System.out.print(" POR FAVOR, INSERTE LA HORA (hh):  ");     
    int hora2 = Integer.parseInt(System.console().readLine()); 
    //--------------------------- OPERACIONES 
    int uno = (dia1*24)+hora1; //CALCULA CUANTAS HORAS RESTAMOS A HORA2
    int dos = (dia2*24)+hora2; //CALCULA CUANTA HORAS TIENE HORA2
    int dif = 0; 
    if((dia1<=7) && (dia2 <=7 ) && (hora1 <=24 ) && (hora2 <= 24) && (dia1 > 0) && (dia2 > 0) && (hora1 > 0) && (hora2 > 0)) {
      // SI LOS DATOS INTRODDUCIDOS SON CORRECTOS:
      if (uno<dos){ //Y ADEMAS SI EL SEGUNDO DIA ES MAYOR QUE EL PRIMERO
      dif = dos-uno; //LA DIFERENCIA SERA EL 2DO MENOS EL PRIMERO, SINO, ERROR.
      System.out.print("La diferencia entre las "+hora1+":00 horas del dia "+dia1+" de la semana a las "+hora2+":00 horas del dia "+dia2+" de la semana es de "+dif+" hora");
      // ^^ REALIZA EL PRINT DE LA DIFERENCIA ^^ 
      if(dif>1){ 
        System.out.print("s"); //por tener concordancia entre las hora y el "hora(s)" final
      }
    }
    else{ 
      System.out.println("ERROR");
    }
  }
  else{
    System.out.println("ERROR");
  }  

  }
}