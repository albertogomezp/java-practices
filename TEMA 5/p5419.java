public class p5419 { 
  public static void main(String[] args){
    System.out.print("\n \n \n \n \n \n POR FAVOR, INSERTE LA ALTURA:  ");
    int alt = Integer.parseInt(System.console().readLine()); 
    System.out.print(" POR FAVOR, INSERTE EL CARACTER:  ");
    String s = System.console().readLine(); //CARACTER INTRODUCIDO
    int ancho = 1; //LA ANCHURA DE LA PIRAMIDE POR CADA LINEA
    int esp = alt-1; //LOS ESPACIOS QUE TENDRA LA PIRAMIDE COMO MAXIMO POR LINEA
    int alt2 = 1; //LA ALTURA QUE IRA AUMENTANDO HASTA ALNCANZAR LA INDICADA
    
    
    while (alt2 <= alt) { //ESTE BUCLE IRA REALIZANDO DOS SUBBUCLES PARA IR IMPRIMIENDO LINEA POR LINEA
      
      for (int cont = 1; cont <= esp; cont++) {
        System.out.print(" "); //ESTE FOR METE LOS ESPACIOS
      }

      for (int cont2 = 1; cont2 <= ancho; cont2++) {
        System.out.print(s); //ESTE FOR INSERTA LOS ELEMENTOS DE LA PIRAMIDE
      }
      esp--; //ESTO DISMINUYE LOS ESPACIOS QUE VAMOS INSERTANDO
      ancho = ancho+2; //ESTO AUMENTA EN DOS EL ANCHO DE LA BASE
      alt2++; //ESTO AUMENTA LA ALTURA QUE LLEVAMOS POR FILA 
      System.out.println(); //SALTO DE LINEA PARA LA SIGUIENTE LINEA

      
    }
  }
}
