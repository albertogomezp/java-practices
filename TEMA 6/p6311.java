/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma: 
suspenso, suficiente, bien, notable o sobresaliente.
 Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc. */

public class p6311{ 
  public static void main(String[] args){
    int Score = 0;
    int ContSus = 0;
    int ContSuf = 0;
    int ContBien = 0;
    int ContNot = 0;
    int ContSob = 0;
    String ScoreString ="";
    for (int Pals = 1; Pals <= 20; Pals++){
      Score=(int) ((Math.random()*10)+1);
      if (Score <= 4){
        Score = 1;
      }
      switch (Score){
        case 1:
          ScoreString ="SUSPENSO";
          ContSus++;
          break;
        case 5:
          ScoreString="SUFICIENTE";
          ContSuf++;
          break;
        case 6:
          ScoreString="BIEN";
          ContBien++;
          break;
        case 7:
        case 8:
          ScoreString="NOTABLE";
          ContNot++;
          break;
        case 9:
        case 10:
          ScoreString="SOBRESALIENTE";
          ContSob++;
          break;
      }
      if(Pals <10){
        System.out.println("ALUMNO #0"+Pals+" NOTA: "+ScoreString);

      }
      else{
        System.out.println("ALUMNO #"+Pals+" NOTA: "+ScoreString);
      }
    }
    System.out.print(" SOBRESALIENTES: "+ContSob+"\n NOTABLES: "+ContNot+" \n BIEN: "+ContBien+" \n SUFICIENTE: "+ContSuf+" \n SUSPENSOS: "+ContSus);





  }
}