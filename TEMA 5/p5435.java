public class p5435 {  //PENDIENTE DE DOCUMENTAR
  public static void main(String[] args){
    //--------------------------iNTRODUCCION DE DATOS----------------------
    System.out.print(" POR FAVOR, INSERTE UN LA ALTURA:  ");         //INTRODUCE EL NUMERO
    int alt = Integer.parseInt(System.console().readLine()); //CONOCEREMOS LA ALTURA
    int alt2= (alt+1)/2; //nos sirve para poder hacer modificaciones del valor de la altura sin perderlo.
    int alt3= alt;
    String AnchoInt =""; //para calcula las distancias entre ambas lineas de la X
    String AnchoExt ="";
    int Anchocont = 0;
    int diferencia = 0;
    int cont2 = 2;
    int cont4 = 1;
    int context = 1;
    int contint = 1;
    //------------------------ OPERACIONES ----------------------------------------------
    if(alt>=3 && alt%2 !=0){ //comprueba que se cumplen las condiciones
      int AnchoIntIni = alt-2;
      int AnchoExtIni = 0;
      //----------------------------- PRINT DE LA PARTE SUPERIOR -----------------------
      for(int contarriba = 1; contarriba<alt2; contarriba++){  //ESPACIOS EXTERIORES
        for( context = 1; context<=AnchoExtIni; context++){
          AnchoExt = AnchoExt.concat(" ");
        }
        for( contint = 1; contint<=AnchoIntIni; contint++){ //ESPACIOS INTERIORES
          AnchoInt = AnchoInt.concat(" ");
        }
        System.out.println(AnchoExt+"*"+AnchoInt+"*"); //PRINT
        //--------------------------- AJUSTES PARA EL SIGUIENTE PASO ------------------
        AnchoIntIni=AnchoIntIni-2;
        AnchoExtIni++;  
        AnchoInt="";
        AnchoExt="";
      } 
      //------------------------- PRINT DE LA PARTE CENTRAL -------------------
      for( context = 1; context<alt2; context++){
          AnchoExt = AnchoExt.concat(" ");
        }     
      System.out.println(AnchoExt+"*");
      for (int continferior = alt; continferior<alt; continferior--){ //contador de la parte de abajo
      }
      AnchoIntIni = 1;
      AnchoExtIni = alt2-3;
      AnchoInt="";
      AnchoExt="";
      //----------------------------- PRINT DE LA PARTE INFERIOR -----------------------
      for(int contabajo = 1; contabajo<alt2; contabajo++){  //ESPACIOS EXTERIORES
        for( context = AnchoExtIni; context>=0; context--){
          AnchoExt = AnchoExt.concat(" ");
        }
        for( contint = 1; contint<=AnchoIntIni; contint++){ //ESPACIOS INTERIORES
          AnchoInt = AnchoInt.concat(" ");
        }
        System.out.println(AnchoExt+"*"+AnchoInt+"*"); //PRINT
        //--------------------------- AJUSTES PARA EL SIGUIENTE PASO ------------------
        AnchoIntIni=AnchoIntIni+2;
        AnchoExtIni--;  
        AnchoInt="";
        AnchoExt="";
      } 
    } 
    else{
      System.out.println("ERROR");
    }    
  }      
}
