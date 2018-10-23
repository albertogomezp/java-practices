/* Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. 
Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. 
Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 
2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una 
cadena de caracteres podemos usar  String.valueOf(n). */ 
public class p632{ 
  public static void main(String[] args){
    int palo = (int)(Math.random()*4)+1;
    int numero =(int)(Math.random()*14)+1;
    System.out.print("CARTA ALEATORIA: ");
    if(numero<11 && numero>1){
      System.out.print(numero);
    }
    if (numero == 11){
      System.out.print("J");
    }
    if (numero == 12){
      System.out.print("Q");
    }
    if (numero == 13){
      System.out.print("K");
    }
    if (numero == 1){
      System.out.print("A");
    }
    switch (palo){
      case 1:
        System.out.println(" CORAZONES");
        break;
      case 2:
        System.out.println(" PICAS");
        break;
      case 3:
        System.out.println(" DIAMANTES");
        break;
      case 4:
        System.out.println(" TREBOLES");
    }


  }
} 