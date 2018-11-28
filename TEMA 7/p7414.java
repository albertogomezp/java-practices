// Escribe un programa que pida 8 palabras y las almacene en un array. A continuación,
// las palabras correspondientes a colores se deben almacenar al comienzo y las que no son colores a continuación.
// Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa deben estar en otro array y
// son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.
public class p7414{
  public static void main(String[] args){
    String [] Words =  new String[8];
    String [] Colors ={"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
    String [] WordsAux = new String[8];
    int WordInt = 0;
    System.out.println("Please, introduce 8 spanish words");
    for(int Request = 0; Request <= Words.length-1; Request++){
      System.out.print("word #"+(Request+1)+" = ");
      Words[Request] = (System.console().readLine());
    }
    System.out.println("-----------------------");
    for (int WordsCompare = 0; WordsCompare <=Words.length-1; WordsCompare++){
      for (int ColorsCompare = 0; ColorsCompare <=Colors.length-1; ColorsCompare++){
        if(Words[WordsCompare] == Colors[ColorsCompare]){
          WordsAux[WordInt] = Words[WordsCompare];
          WordInt++;
        }
      }
    }
    for(int WordsAuxPrint = 0; WordsAuxPrint <= Words.length-1; WordsAuxPrint++){
      System.out.print(WordsAux[WordsAuxPrint]+" ");
    }



  }
}
