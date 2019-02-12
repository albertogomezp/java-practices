/**
 * @author Alberto Gomez Peña
 */
public abstract class Item{
  private static int StockTotal = 0;
  private int Codigo = 0;
  private String Titutlo ="Titulo generico";
  private int Anyo = 0;

  public Item() {
    this.Codigo= 0;
    this.Titutlo ="Titulo generico";
    this.Anyo=2000;
  }

  public Item(int Codigo, String Titutlo, int Anyo) {
    this.Codigo = Codigo;
    this.Titutlo = Titutlo;
    this.Anyo = Anyo;
    StockTotal++;
  }

  public int getCodigo() {
    return this.Codigo;
  }

  public void setCodigo(int Codigo) {
    this.Codigo = Codigo;
  }

  public String getTitutlo() {
    return this.Titutlo;
  }

  public void setTitutlo(String Titutlo) {
    this.Titutlo = Titutlo;
  }

  public int getAnyo() {
    return this.Anyo;
  }

  public void setAnyo(int Anyo) {
    this.Anyo = Anyo;
  }

  public Item Codigo(int Codigo) {
    this.Codigo = Codigo;
    return this;
  }

  public Item Titutlo(String Titutlo) {
    this.Titutlo = Titutlo;
    return this;
  }

  public Item Anyo(int Anyo) {
    this.Anyo = Anyo;
    return this;
  }

}