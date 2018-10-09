public class p5430 {
  public static void main(String[] args){
    System.out.print(" POR FAVOR, INSERTE EL PRIMER DIA (1-7):  ");         
    int dia1 = Integer.parseInt(System.console().readLine()); //SE ALMACENA EL DIA1
    System.out.print(" POR FAVOR, INSERTE LA HORA (hh):  ");         
    int hora1 = Integer.parseInt(System.console().readLine());
    System.out.print(" POR FAVOR, INSERTE EL SEGUNDO DIA DIA (1-7):  ");         
    int dia2 = Integer.parseInt(System.console().readLine()); //SE ALMACENA EL DIA2
    System.out.print(" POR FAVOR, INSERTE LA HORA (hh):  ");     
    int hora2 = Integer.parseInt(System.console().readLine()); 
    int uno = (dia1*24)+hora1;
    int dos = (dia2*24)+hora2;
    int dif = 0;
    if((dia1<=7) && (dia2 <=7 ) && (hora1 <=24 ) && (hora2 <= 24) && (dia1 > 0) && (dia2 > 0) && (hora1 > 0) && (hora2 > 0)) {
      if (uno<dos){
      dif = dos-uno;
      System.out.println("La diferencia entre las "+hora1+":00 horas del dia "+dia1+" de la semana a las "+hora2+":00 horas del dia "+dia2+" de la semana es de "+dif+" horas");
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