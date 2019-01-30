/**
* @author ALberto Gómez Peña
* Gestor
*/
public class Gestor {
  public static void main(String[] args) {
    System.out.println("Indique el numero de aros: ");
    int aros = Integer.parseInt(System.console().readLine());
    int ancho = (aros*2)+1;
    String[] rellenar = new String[aros+1];
    String[] rellenar2 = new String[aros+1];
    String centro = "|";
    String espacios ="";
    String relleno ="";
    //Crea los prints futuros
    for(int cont = 0; cont <=aros; cont++){
      espacios = espacios.concat(" ");
      for(int cont2= 1; cont2<=(aros-cont);cont2++){
        relleno = relleno.concat("=");
      }
      rellenar[cont]=(espacios+relleno+centro+relleno+espacios);
      //System.out.println(rellenar[cont]);
      relleno="";
    }
    for(int x = 0; x<=aros; x++){
      rellenar2[x] = rellenar[aros-x];
    }
    // Inicializa el tablero
    System.out.println("Indique el numero de Torres: ");
    int numerotorres = Integer.parseInt(System.console().readLine());
    Torre[] torres = new Torre[numerotorres];
    for(int x = 0; x < numerotorres; x++){
      torres[x] = new Torre(aros);
    }
    //Mete los aros en la primera torre
    for(int cont = 0; cont <aros; cont++){
      torres[0].setRelleno(aros-cont,cont);
      torres[0].setAlturaRelativa(cont+1);
    }
    
    
    //Pre-bucle
    int origen = 0;
    int destino = 0;
    boolean ganar = false;
    //Bucle
    while (origen !=-1 && destino !=-1 && ganar == false){
      for(int x = aros-1; x>=0; x--){
        for(int parte = 0; parte <numerotorres; parte++){
          System.out.print(rellenar2[torres[parte].Relleno[x]]);
        }
        System.out.println(" ");
      }
      System.out.println("Indique Aro de Origen (-1 para salir)");
      origen = Integer.parseInt(System.console().readLine());
      System.out.println("Indique Aro de Destino (-1 para salir)");
      destino = Integer.parseInt(System.console().readLine());
      torres[origen-1].moverAro(torres[destino-1]);      
      if(torres[numerotorres-1].getAlturaRelativa()==aros){
        ganar = true;
        System.out.println("VICTORIA MAGISTRAL");
      }




    }  
    
  }
}