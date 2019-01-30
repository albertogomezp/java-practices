import funct.*;
ublic class Gestor{
  public static void main(String[] args) {
    boolean Exit = false;
    int Eleccion = 0;
    Fusil[] Fusiles = new Fusil[10];
    int contCreadorFusil = 0;
    Pistola[] Pistolas = new Pistola[10];
    int contCreadorPistola = 0;
    int AccSec = 0;
    int PisSec = 0;
    while(Exit == false){
      System.out.println(""+
      "Elija una opcion \n"+
      "1. Crear una pistola (max 10)\n"+
      "2. Crear un fusil (max 10)\n"+
      "3. Seleccionar una pistola \n"+
      "4. Seleccionar un fusil\n"+
      "5. Salir"   
      );
      Eleccion = Integer.parseInt(System.console().readLine());
      switch (Eleccion){
        case 1:
        Pistolas[contCreadorPistola] = new Pistola();
        crearPistola(Pistolas[contCreadorPistola], contCreadorPistola);
        contCreadorPistola++;
        break;
        case 2:
        Fusiles[contCreadorFusil] = new Fusil();
        crearFusil(Fusiles, contCreadorFusil);
        contCreadorFusil++;
        break;
        case 3:
        System.out.println("Seleccione una pistola:");
        for (int x = 0; x <Pistolas.length; x++){
          System.out.println("Pistola "+(x+1)+" :"+Pistolas[x]);
        }
        PisSec = Integer.parseInt(System.console().readLine())-1;
        System.out.println("Accion:\n"+
        "1. Disparar \n"+
        "2. Recargar \n"+
        "3. Pegarme un tiro \n"+
        "4. Salir");
        AccSec = Integer.parseInt(System.console().readLine());
        switch(AccSec){
          case 1:
          Pistolas[PisSec].Disparar();
          break;
          case 2:
          Pistolas[PisSec].Recargar(10);
          break;
          case 3:
          System.out.println("WASTED");
          Exit = true;
          break;
          default:
          System.out.println("...");
        }        
        break;
        case 4:
        System.out.println("Seleccione un Fusil:");
        for (int x = 0; x <Fusiles.length; x++){
          System.out.println("Fusil "+(x+1)+" :"+Fusiles[x]);
        }
        PisSec = Integer.parseInt(System.console().readLine())-1;
        System.out.println("Accion:\n"+
        "1. Disparar \n"+
        "2. Recargar \n"+
        "3. Pegarme un tiro \n"+
        "4. Cambiar tipo de disparo \n"+
        "5. Salir");
        AccSec = Integer.parseInt(System.console().readLine());
        switch(AccSec){
          case 1:
          Fusiles[PisSec].Disparar();
          break;
          case 2:
          Fusiles[PisSec].Recargar(10);
          break;
          case 3:
          System.out.println("WASTED");
          Exit = true;
          break;
          case 4:
          if (Fusiles[PisSec].getTipoDisparo() == 1){
            Fusiles[PisSec].setTipoDisparo(2);
          }
          else{
            Fusiles[PisSec].setTipoDisparo(1);
          }
          break;
          default:
          System.out.println("...");
        }
        
        break;
        default:
        Exit = true;
      }
    }
  }
}