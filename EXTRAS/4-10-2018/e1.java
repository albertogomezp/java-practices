public class e1 { 
  public static void main(String[] args){
    System.out.print("\n \n \n \n \n \n POR FAVOR, INSERTE UN DIA:  ");
    String correcto ="INCORRECTA";
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("POR FAVOR, INTRODUZCA UN MES (numeros):  ");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.print("POR FAVOR, INSERTE UN anyo:  ");
    int anyo = Integer.parseInt(System.console().readLine());
    if (mes==2 && (dia>28 ||dia<1)){
    } 
    if (mes==2 && (dia<=28 &&dia>0)){
      correcto="CORRECTA";
    } 
    if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 ||mes== 12)&&(dia<=31 && dia>0)&&(anyo>0)){
      correcto="CORRECTA";
    }
    if((mes==4 || mes==6 || mes==9 || mes==11 )&&(dia<=30 && dia>0)&&(anyo>0)){
      correcto="CORRECTA";
    }
    System.out.println("LA FECHA ES "+correcto);
  }
} //DEBIDO AL ESFUERZO POR SIMPLIFICAR EL CODIGO CONSIDERO QUE NO HACE FALTA DOCUMENTAR EL MISMO
