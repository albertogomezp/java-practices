// Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y que muestre a 
// continuación un diagrama de barras horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
// de asteriscos o cualquier otro carácter.
public class p748{ 
  public static void main(String[] args){
    int [] Months =  new int[12];
    for (int Temperatures = 0; Temperatures <= Months.length-1; Temperatures++ ){
      System.out.print("Month #"+(Temperatures+1)+" -> Temperature: ");
      Months[Temperatures] = Integer.parseInt(System.console().readLine());
    }
    for (int PrintTemperatures = 0; PrintTemperatures < 12; PrintTemperatures++){
      for (int Counter = 0; Counter < (Months[PrintTemperatures]-1); Counter++ ){
        System.out.print("=");
      } 
      System.out.println(">");
    }
  }
}