public class Ameba{
  //Atributo de clase

  //Atributo de instancia
  private int peso;
  
  public Ameba(){
    this.peso = 3;
  }  
  public void come(int comida){
    this.peso += comida;
    this.peso--;
  }
  public void come(Ameba otraAmeba){
    this.peso += otraAmeba.getPeso();
    otraAmeba.setPeso(0);
    this.peso--;
  }
  int getPeso(){
    return this.peso;
  }
  void setPeso(int peso1){
    this.peso = peso1;
  }




  public String toString(){
    return "Soy una ameba y peso "+this.peso+" microgramos";
  }


}