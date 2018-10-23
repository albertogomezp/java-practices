public class p633{ 
  public static void main(String[] args){
    int palo = (int)(Math.random()*4)+1;
    int numero =(int)(Math.random()*6)+1;
    System.out.print("CARTA ALEATORIA: ");
    if(numero<11 && numero>1){
      System.out.print(numero);
    }
    if (numero == 11){
      System.out.print("SOTA");
    }
    if (numero == 12){
      System.out.print("CABALLO");
    }
    if (numero == 13){
      System.out.print("REY");
    }
    if (numero == 1){
      System.out.print("AS");
    }
    switch (palo){
      case 1:
        System.out.println(" OROS");
        break;
      case 2:
        System.out.println(" ESPADAS");
        break;
      case 3:
        System.out.println(" COPAS");
        break;
      case 4:
        System.out.println(" BASTOS");
    }


  }
} 