//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).
public class p637{ 
  public static void main(String[] args){
    String Result ="";
    String adjust ="";
    int victory = 0;
    for(int bet = 1 ; bet <= 3 ; bet++){
      System.out.print("              APUESTA #"+bet+"            ");
    }
    System.out.println("");
    for (int bet2 =  1; bet2 <= 15; bet2++){
      for (int cont = 1; cont <=3; cont++){
        victory = (int)((Math.random()*3)+1);
        if (victory == 1){
          Result ="1";
        }
        if (victory == 2){
          Result ="2";
        }
        if (victory == 3){
          Result ="x";
        }
        if(bet2 <10){
          adjust="0";
        }
        else{
          adjust="";
        }
        if(bet2 <=14){
          System.out.print("      EQUIPO #"+adjust+bet2+" - EQUIPO #"+(29-bet2)+" ["+Result+"]   ");
        }
        else{
          System.out.print("PLENO EQUIPO #"+29+" - EQUIPO #"+(30)+" ["+Result+"]   ");
        }
      } 
      System.out.println(""); 
    }
  }
}