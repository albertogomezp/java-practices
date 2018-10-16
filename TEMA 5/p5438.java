public class p5438 {  
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE UN LA ALTURA:  ");         //INTRODUCE EL NUMERO
    int alt = Integer.parseInt(System.console().readLine()); //CONOCEREMOS LA ALTURA
    int alt2= (alt+1)/2; //nos sirve para poder hacer modificaciones del valor de la altura sin perderlo.
    String relleno =""; //para calcula las distancias entre ambas lineas de la X
    String AnchoExt ="";
    int context = 1;
    int contint = 1;
    //------------------------ OPERACIONES ----------------------------------------------
    if(alt>=3 && alt%2 !=0){ //comprueba que se cumplen las condiciones
      int rellenoIni = alt-2;
      int AnchoExtIni = 0;
      //----------------------------- PRINT DE LA PARTE SUPERIOR -----------------------
      for(int contarriba = 1; contarriba<alt2; contarriba++){  //ESPACIOS EXTERIORES
        for( context = 1; context<=AnchoExtIni; context++){
          AnchoExt = AnchoExt.concat(" ");
        }
        for( contint = 1; contint<=rellenoIni; contint++){ //ESPACIOS INTERIORES
          relleno = relleno.concat("*");
        }
        System.out.println(AnchoExt+"*"+relleno+"*"); //PRINT
        //--------------------------- AJUSTES PARA EL SIGUIENTE PASO ------------------
        rellenoIni=rellenoIni-2;
        AnchoExtIni++;  
        relleno="";
        AnchoExt="";
      } 
      //------------------------- PRINT DE LA PARTE CENTRAL -------------------
      for( context = 1; context<alt2; context++){
          AnchoExt = AnchoExt.concat(" ");
        }     
      System.out.println(AnchoExt+"*");
      for (int continferior = alt; continferior<alt; continferior--){ //contador de la parte de abajo
      }
      rellenoIni = 1;
      AnchoExtIni = alt2-3;
      relleno="";
      AnchoExt="";
      //----------------------------- PRINT DE LA PARTE INFERIOR -----------------------
      for(int contabajo = 1; contabajo<alt2; contabajo++){  //ESPACIOS EXTERIORES
        for( context = AnchoExtIni; context>=0; context--){
          AnchoExt = AnchoExt.concat(" ");
        }
        for( contint = 1; contint<=rellenoIni; contint++){ //ESPACIOS INTERIORES
          relleno = relleno.concat("*");
        }
        System.out.println(AnchoExt+"*"+relleno+"*"); //PRINT
        //--------------------------- AJUSTES PARA EL SIGUIENTE PASO ------------------
        rellenoIni=rellenoIni+2;
        AnchoExtIni--;  
        relleno="";
        AnchoExt="";
      } 
    } 
    else{
      System.out.println("ERROR");
    }    
  }      
}
