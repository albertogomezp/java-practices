public class p6310{ 
  public static void main(String[] args){
  int Caracter = 0;
  int PrintLenght = 0;
  String PrintCaracter = "";
  for( int Row = 1 ; Row <= 10; Row++){
    Caracter = (int)((Math.random()*7)+1);
    switch (Caracter){
      case 1:
        PrintCaracter = "*";
        break;
      case 2:
        PrintCaracter = "-";
        break;
      case 3:
        PrintCaracter = "=";
        break;
      case 4:
        PrintCaracter = ".";
        break;
      case 5:
        PrintCaracter = "|";
        break;
      case 6:
        PrintCaracter = "@";
        break;
    
    }
    PrintLenght = (int)((Math.random()*41)+1);
    System.out.print(" FILA #"+Row+": ");
    for (int cont = 1; cont <= PrintLenght; cont++){
      System.out.print(PrintCaracter);
    }
    System.out.println(" ");
  }


  }
}