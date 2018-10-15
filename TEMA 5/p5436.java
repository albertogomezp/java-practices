public class p5436 {
  public static void main(String[] args) {
    //--------------------       INTRODUCCION DEL NUMERO   --------------------
    System.out.print("INTRODUZCA EL NUMERO CON LAS CONDICIONES: \n -Que sea positivo \n -que sea entero \n");
    long num = Long.parseLong(System.console().readLine());
    long inverso = 0; //ALMACENARA num AL REVES
    long cont = num; //ESTE CONTADOR NOS SERVIRA PARA IR AVANZANDO EN LOS DIGITOS
    //--------------------             OPERACIONES ------------------------
    while (cont > 0) {  //BUCLE QUE NOS HARA LA INVERSION
      inverso = (inverso * 10) + (cont % 10);  //VA INTRODUCIENDO DIGITOS
      cont = cont/10; //AL LLEGAR A 0 ACABARA EL BUCLE
    }     
    if (inverso != num) {  //RESOLUCION
      System.out.println(num+" NO ES CAPICUA");
    } else {
      System.out.println(num+" ES CAPICUA");
    }
  }
}