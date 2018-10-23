 public class ejercicio4{ 
   //Ejercicio realizado por ALBERTO GOMEZ del curso 1DAW del IES Campanillas para el examen de programacion del dia 23/10/2018
  public static void main(String[] args){
    //---------------------------- INTRODUCCION DE DATOS -------------
    System.out.print(" -------------------------------------------------------- \n");
    System.out.print(" POR FAVOR, INSERTE LA CANTIDAD INICIAL  ");       
    String inicial = System.console().readLine();
    double ini = Double.parseDouble(inicial);
    System.out.print(" POR FAVOR, INSERTE LA RENTABILIDAD MENSUAL (sin el %):  ");       
    String rentabilidad = System.console().readLine();
    double rent = Double.parseDouble(rentabilidad);
    System.out.print(" POR FAVOR, INSERTE EL DINERO DESEADO:  ");         
    String deseado = System.console().readLine();
    double meta = Double.parseDouble(deseado);
    //--------------------------- DECIDE EL TIPO DE RENTABILIDAD
    System.out.print ("INDIQUE LA RENTABILIDAD DESEADA ('alfinal','compuesta'): ");
    String decision = System.console().readLine();
    System.out.print(" -------------------------------------------------------- \n");
    String op1 ="alfinal";
    String op2 ="compuesta";
    if(decision.equals(op1)){
      //---------------------------- CUENTAS INICIALES -------------
      double mensualidad1 =(ini/100)*rent; //el % que ira aumentando 
      double acumulador1 = ini;
      int cont = 0;
      //---------------------------- EJECUCION -------------
      while (acumulador1 <=meta){
        acumulador1 = acumulador1+mensualidad1;
        cont++;
      }
      //------------------------------ RESOLUCION ------------------------
      System.out.println("SERAN NECESARIO(S) "+cont+" MES(ES) PARA ALCANZAR LA META DESEADA");
    }
    else if (decision.equals(op2)){
      //---------------------------- CUENTAS INICIALES -------------
      double mensualidad2 = (ini/100)*rent;
      double acumulador2 = ini;
      int cont2 = 0;
      //---------------------------- EJECUCION -------------
      while (acumulador2 <=meta){
        acumulador2 = acumulador2+mensualidad2;
        cont2++;
        mensualidad2 = (acumulador2/100)*rent;
      }
      //------------------------------ RESOLUCION ------------------------
      System.out.println("SERAN NECESARIO(S) "+cont2+" MES(ES) PARA ALCANZAR LA META DESEADA");
    }

    
  }
} 