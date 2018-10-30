
public class p6316{ 
  public static void main(String[] args){
  int RandomNumber = 0;
  int hearts = 0;
  int diamonds = 0;
  int horses = 0;
  int bells = 0;
  int lemonds = 0;
    for(int position = 1; position <= 3; position++){
      RandomNumber = (int)(Math.random()*5);
      switch(RandomNumber){
        case 0: //hearts
          hearts++;
          System.out.print("| corazon | ");
          break;
        case 1: //diamonds
          diamonds++;
          System.out.print("| diamante | ");
          break;
        case 2: //horses
          horses++;
          System.out.print("| herradura | ");
          break;
        case 3: //bells
          bells++;
          System.out.print("| campana | ");
          break;
        case 4: //lemonds
          lemonds++;
          System.out.print("| limon | ");
          break;
      }
    }
    int solution = Math.max(hearts,diamonds);
    solution = Math.max(solution,horses);
    solution = Math.max(solution,bells);
    solution = Math.max(solution,lemonds);
    switch (solution){
      case 1:
        System.out.print("\n Lo siento, ha perdido");
        break;
      case 2:
        System.out.print("\n Bien, ha recuperado la moneda");
        break;
      case 3:
        System.out.print("\n Enhorabuena, ha ganado 10 monedas");
        break;
    }
  }
}