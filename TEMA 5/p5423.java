public class p5423 {
  public static void main(String[] args){
    int suma = 0;
    int num =  0;
    int cont = 0;
    int numanterior =0;
    while(suma <10000){
      System.out.print(" POR FAVOR, INSERTE UN NUMERO:  ");
    num = Integer.parseInt(System.console().readLine());   
    suma=num+numanterior;
    numanterior=num;
    cont++;
    }
    System.out.print("suma total: "+suma +"\n MEDIA: "+(suma/cont));
  }
}