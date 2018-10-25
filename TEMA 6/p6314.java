/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. 
El programa intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades.
En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir. */
public class p6314{ 
  public static void main(String[] args){
    int RandomNumber = 0;
    System.out.println("PIENSE EN UN NUMERO");
    int Hints = 1;
    boolean Answer = false;
    String pregunta = "";
    while(Hints <=5 || Answer == true)
      RandomNumber = (int)(Math.random()*101);
      System.out.println("ES EL "+RandomNumber+"? ('true' - 'false') ");
      Answer = Boolean.parseBoolean(System.console().readLine());
      if(Answer == false){
        System.out.println("EL NUMERO "+RandomNumber+" ES MAYOR O MENOR QUE TU NUMERO ('mayor' - 'menor') ");
        pregunta = System.console().readLine();
        if()
      }
    }



  }
}  