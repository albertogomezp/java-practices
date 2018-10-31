public class p744{ 
  public static void main(String[] args){
    int [] Numero = new int [20];
    int [] Cuadrado = new int [20];
    int [] Cubo = new int [20];
    for (int IntroduceNumbers = 0; IntroduceNumbers <= Numero.length; IntroduceNumbers++){
      Numero[IntroduceNumbers] = (int)(Math.random()*101);
      System.out.print("Numero #"+IntroduceNumbers+" = "+Numero[IntroduceNumbers]+"          ");
      Cuadrado[IntroduceNumbers] = Numero[IntroduceNumbers]*Numero[IntroduceNumbers];
      System.out.print("Cuadrado = "+Cuadrado[IntroduceNumbers]+"          ");
      Cubo[IntroduceNumbers] = Numero[IntroduceNumbers]*Numero[IntroduceNumbers]*Numero[IntroduceNumbers];
      System.out.println("Cubo =  "+Cubo[IntroduceNumbers]+"          ");
    }
  }
}