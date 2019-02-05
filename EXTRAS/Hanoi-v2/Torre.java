public class Torre{
  public static int NumeroAros = 0;
  public int Altura;
  public int Aros;
  public int[] Relleno;
  public int AlturaRelativa;
  /**
  * Crea las torres
  * @param Altura altura maxima
  * @param aros Numero de aros
  */
  public Torre(int aros){
    this.Altura = aros-1;
    this.Aros = aros;
    this.Relleno = new int[aros];
    this.AlturaRelativa = 0;
    NumeroAros++;
  }
  
  public int getAltura() {
    return this.Altura;
  }
  
  public void setAltura(int Altura) {
    this.Altura = Altura;
  }
  
  public int getAros() {
    return this.Aros;
  }
  
  public void setAros(int Aros) {
    this.Aros = Aros;
  }
  
  public int[] getRelleno() {
    return this.Relleno;
  }
  public String printRelleno(){
    String relleno ="";
    for(int x = 0; x <= this.getAltura(); x++ ){
      relleno +=("  "+this.Relleno[x]+"  ");
    }
    return relleno;
  }
  
  public void setRelleno(int relleno, int altura) {
    this.Relleno[altura] = relleno;
  }
  public void quitarUltima(int altura){
    this.Relleno[altura] = 0;
  }
  public int getAlturaRelativa() {
    return this.AlturaRelativa;
  }
  
  public void setAlturaRelativa(int AlturaRelativa) {
    this.AlturaRelativa = AlturaRelativa;
  }
  
  public void aumentarAlturaRelativa(int AlturaRelativa) {
    this.AlturaRelativa ++;
  }
  public void disminuirAlturaRelativa(int AlturaRelativa) {
    this.AlturaRelativa --;
  }
  public void moverAro(Torre Destino){
    int variable = 0;
    boolean mover = false;
    if((this.getAlturaRelativa())-1 >= 0){
      mover = true;
    }
    else{
      mover = false;
    }

    
    switch (Destino.AlturaRelativa){
      case 0:
      if(mover==true && Destino.Relleno[Destino.AlturaRelativa] <= this.Relleno[AlturaRelativa-1] ){
        Destino.setRelleno(this.Relleno[this.AlturaRelativa-1],Destino.AlturaRelativa); 
        Destino.aumentarAlturaRelativa(Destino.AlturaRelativa);
        this.setRelleno(0, this.AlturaRelativa-1);
        this.disminuirAlturaRelativa(this.AlturaRelativa);
      }
      break;
      default:
      //System.out.println("d     O:"+this.Relleno[AlturaRelativa-1]+" D:"+Destino.Relleno[Destino.AlturaRelativa-1]);
      variable = this.Relleno[AlturaRelativa];
      if(variable >0){
        variable--;
      }
      if(variable >0){
        variable--;
      }
      //System.out.println("0     O:"+this.Relleno[AlturaRelativa-1]+" D:"+Destino.Relleno[variable]);
      if( Destino.Relleno[variable] > this.Relleno[AlturaRelativa-1]){
        Destino.setRelleno(this.Relleno[this.AlturaRelativa-1],Destino.AlturaRelativa); 
        Destino.aumentarAlturaRelativa(Destino.AlturaRelativa);
        this.setRelleno(0, this.AlturaRelativa-1);
        this.disminuirAlturaRelativa(this.AlturaRelativa);
      }
    }
  }
  @Override
  public String toString() {
    return "{" +
    " Altura= " + getAltura() + "'" +
    ", Aros= " + getAros() + "'" +
    ", Relleno= " + printRelleno() +
    ", AlturaRelativa= " + getAlturaRelativa() + "'" +
    "}";
  }
}