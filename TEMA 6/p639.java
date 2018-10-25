public class p639{ 
  public static void main(String[] args){
    int RandomNumber = 0;
    int cont = 0;
    while (RandomNumber !=24){
      RandomNumber = (int)((Math.random()*100)+1);
      cont++;
      System.out.println("Number  #"+cont+": "+RandomNumber);
    }  
  }
}