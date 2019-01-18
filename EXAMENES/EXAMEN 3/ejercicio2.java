public class ejercicio2{
  public static void main(String[] args) {
    System.out.println("Introduzca el primer numero entero positivo");
    long mayor = Long.parseLong(System.console().readLine());
    long mayorguardado = mayor;
    long longitudmayor = 0;
    long divmay = 1;
    while(mayorguardado>0){
      mayorguardado= mayorguardado/10;
      longitudmayor++;
      divmay = divmay*10;
    }
    divmay = divmay/10;
    System.out.println("Introduzca le segundo numero entero positivo");
    long menor = Long.parseLong(System.console().readLine());
    long menorguardado = menor;
    long longitudmenor = 0;
    long divmen = 1;
    while(menorguardado>0){
      menorguardado= menorguardado/10;
      longitudmenor++;
      divmen = divmen*10;
    }
    divmen = divmen/10;
    long coincidencias = 0;
    long menortemp = menor;
    long mayortemp = mayor;
    long restmen = 1;
    long restmay = 1;
    
    for(long menor2 = 1; menor2 <longitudmenor; menor2++){
      if(menor2!=1){
        menortemp = (menor%restmen)/divmen;
      }
      else{
        menortemp = (menor%restmen)/(divmen/10);
      }
      for(long mayor2 = 1; mayor2 <longitudmayor; mayor2++){
        mayortemp = (mayor/divmay)%restmay;
        System.out.println((1234/100) -(1234/1000));
        System.out.println("mayor: "+mayortemp+" menor: "+menortemp);
          System.out.println(divmay+" "+restmay+"  "+divmen+" "+restmen);
        if(menortemp == mayortemp){
          
          coincidencias++;
          
        }
        mayortemp = mayor;
        divmay = divmay/10;
        restmay = restmay*10;
      }
      divmen = divmen/10;
      restmen =  restmen*10;
    }
    System.out.println(coincidencias);
    
  }
}