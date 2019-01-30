import java.util.ArrayList;

public class TableroTorres {
  private ArrayList<Torre> torres = new ArrayList<Torre>();
  /* el índice de cada torre va a representar el nº de torre -1 */
  
  public TableroTorres (int numDiscos) {
    Disco discoAuxiliar;
    Torre torreAuxiliar;
    
    int radio = numDiscos;
    
    torreAuxiliar = new Torre();
    
    for (int i=0; i<numDiscos; i++) {
      discoAuxiliar = new Disco(radio);
      torreAuxiliar.apilaDisco(discoAuxiliar);
      radio--;
    }
    
    this.torres.add(torreAuxiliar);
    
    for (int i=0; i<2; i++) {
      torreAuxiliar = new Torre ();
      this.torres.add(torreAuxiliar);
    }
    
  }
  
  public boolean intentaMover (int posteOrigen, int posteDestino) {
    boolean sePuede = true;
    
    /* el disco se podrá mover si va a parar a un poste vacío) */
    if (this.torres.get(posteOrigen-1).alturaTorre() > 0) {
      if (this.torres.get(posteDestino-1).alturaTorre() == 0) {
        Disco discoAuxiliar;
        discoAuxiliar = this.torres.get(posteOrigen-1).sacaDisco();
        this.torres.get(posteDestino-1).apilaDisco(discoAuxiliar);
      } else {
        /* hay que comprobar que va a caer sobre un disco de radio mayor */
        if (this.torres.get(posteDestino-1).miraDisco().getRadio() > this.torres.get(posteOrigen-1).miraDisco().getRadio()) {
          Disco discoAuxiliar;
          discoAuxiliar = this.torres.get(posteOrigen-1).sacaDisco();
          this.torres.get(posteDestino-1).apilaDisco(discoAuxiliar);       
        } else {
          sePuede = false;
        }
      }
    } else {
      sePuede = false;
    }
    
    return sePuede;
    
  }
  
  public boolean checkHanoi () {
    boolean resuelto = false;
    if ((this.torres.get(0).alturaTorre() == 0) && (this.torres.get(1).alturaTorre() == 0)) {
      resuelto = true;
    }
    
    return resuelto;
  }
  
  
  public void muestraTorres () {
    int altura = 0;
    
    for (int i=0; i<3; i++) {
      altura += this.torres.get(i).alturaTorre();
    }


    System.out.println();
    /* linea inicial de varillas */
    for (int j=0; j<3; j++) {
      for (int k=0; k<altura; k++) {
        System.out.print(" ");
      }
      System.out.print("|");
      for (int k=0; k<altura; k++) {
        System.out.print(" ");
      }
      
      for (int k=0; k<4; k++) {
        System.out.print(" ");
      }
    }
    System.out.println();
  
    
    /* cuerpo de las torres */
    for (int i=altura; i>0; i--) {
      for (int j=0; j<3; j++) {
        int radio = 0;
        if (this.torres.get(j).alturaTorre() >= i) {
          radio = this.torres.get(j).miraDisco(i-1).getRadio();
        }
        for (int k=0; k<altura-radio; k++) {
          System.out.print(" ");
        }
        if (radio==0) {
          System.out.print("|");
        } else {
          System.out.print(this.torres.get(j).miraDisco(i-1));
        }
        for (int k=0; k<altura-radio; k++) {
          System.out.print(" ");
        }
        
        for (int k=0; k<4; k++) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    /* linea final de varillas */
    for (int j=0; j<3; j++) {
      for (int k=0; k<altura; k++) {
        System.out.print("─");
      }
      System.out.print("┴");
      for (int k=0; k<altura; k++) {
        System.out.print("─");
      }
      
      for (int k=0; k<4; k++) {
        System.out.print(" ");
      }
    }
    System.out.println();
    
    /* colocación de nº de postes */
    for (int j=0; j<3; j++) {
      for (int k=0; k<altura-1; k++) {
        System.out.print(" ");
      }
      System.out.print("Pº"+(j+1));
      for (int k=0; k<altura-1; k++) {
        System.out.print(" ");
      }
      
      for (int k=0; k<4; k++) {
        System.out.print(" ");
      }
    }
    System.out.println();
    System.out.println();
  }
  
}