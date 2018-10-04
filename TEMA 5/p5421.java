public class p5421 { 
  public static void main(String[] args){
    //las variables declaradas a continuación con 0 y 1 es para que el bucle while se cumpla
    double num = 1;
    double sum = 0;
    double parmayor = 0;
    double cont = 0;
    
    while(num>0){
      System.out.print(" POR FAVOR, INSERTE UN NUMERO:  ");
      num = Integer.parseInt(System.console().readLine()); 
      if (num%2 !=0 ){ //SI EL NUMERO ES IMPAR
        cont++; //CUENTA LOS NUMEROS IMPARES
        sum=sum+num; //VA CALCULANDO LA SUMA DE LOS IMPARES
      } else if (parmayor < num){ //EL NUMERO ES PAR, SI ADEMAS EL NUM ES MAYOR QUE PARMAYOR, ESTE SERA EL MAYOR
          parmayor = num; //SI ES 
       }
    }
    System.out.println("LA MEDIA DE LOS IMPARES ES: "+(sum/cont)); //HACE LA MEDIA
    System.out.println("EL NUMERO PAR MAYOR ES: "+parmayor);

  }
}

