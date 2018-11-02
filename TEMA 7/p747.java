// Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios.
// El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias del primer valor por 
// el segundo en la lista generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
public class p747{ 
  public static void main(String[] args){
    int [] Numbers =  new int[100];
    for (int GenerateNumbers = 0; GenerateNumbers <Numbers.length-1; GenerateNumbers++){
      Numbers[GenerateNumbers] = (int)(Math.random()*21);
      System.out.print(Numbers[GenerateNumbers]+" ");
   }
   System.out.print("\n Please, insert a value: ");
   int FirstValue = Integer.parseInt(System.console().readLine());
   System.out.print(" Please, another value: ");
   int SecondValue = Integer.parseInt(System.console().readLine());
  }
}