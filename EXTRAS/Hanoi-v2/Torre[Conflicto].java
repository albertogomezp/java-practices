public class Torre{
  public static int NumeroAros = 0;
  public int Altura;
  public int Aros;
  public int[] Relleno;
  public int AlturaRelativa;
  public Torre(int altura, int aros){
    this.Altura = altura;
    this.Aros = aros;
    this.Relleno = new int[altura];
    this.AlturaRelativa = 0;
    NumeroAros++;
  }
  
  public Torre() {
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
  
  public void setRelleno(int[] Relleno) {
    this.Relleno = Relleno;
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
  public moverAro(Torre Destino){
    if( Destino.Relleno[AlturaRelativa] > this.Relleno[AlturaRelativa]){
      Destino.Relleno[AlturaRelativa+1]  = this.Relleno[AlturaRelativa];
      this.set
    }

    
  }
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
    return "{" +
    " Altura='" + getAltura() + "'" +
    ", Aros='" + getAros() + "'" +
    ", Relleno='" + getRelleno() + "'" +
    ", AlturaRelativa='" + getAlturaRelativa() + "'" +
    "}";
  }
  
  
  
  
  
  
}