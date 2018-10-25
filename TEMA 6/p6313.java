 public class p6313{ 
  public static void main(String[] args){
    int dice1 = 0;
    int dice2 = 7;
    int cont = 0;
    while (dice1 != dice2){
      dice1 = (int)((Math.random()*6)+1);
      dice2 = (int)((Math.random()*6)+1);
      cont++;
      if(cont <10){
        System.out.println("TIRADA #0"+cont+" DADO #1: "+dice1+" DADO #2: "+dice2);
      }
      else{
        System.out.println("TIRADA #"+cont+" DADO #1: "+dice1+" DADO #2: "+dice2);
      }
    }
  }
} 