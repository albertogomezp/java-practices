public class item{
  // Variables de clase
  private static int articulos = 0;
  private static int stocktotal = 0;
  // Variables de instancia
  private int Referencia;
  private String Descripcion ="Breve descripicion del articulo";
  private double PrecioProv = 0;
  private double PrecioVenta = 0;
  private int stock = 0;

  public item() {
    this.stock++;
    item.stocktotal ++;
  }
  /**
   * Crea objeto
   * @param Referencia codigo
   * @param Descripcion detalles
   * @param PrecioProv precio obtenido
   * @param PrecioVenta precio publico
   * @param stock cantidad de articulos
   */
  public item(int Referencia, String Descripcion, double PrecioProv, double PrecioVenta, int stock) {
    this.Referencia = Referencia;
    this.Descripcion = Descripcion;
    this.PrecioProv = PrecioProv;
    this.PrecioVenta = PrecioVenta;
    this.stock = stock;
    item.stocktotal++;
    item.articulos++;
  }

  public item(int Referencia, String Descripcion, double PrecioProv, double PrecioVenta) {
    this.Referencia = Referencia;
    this.Descripcion = Descripcion;
    this.PrecioProv = PrecioProv;
    this.PrecioVenta = PrecioVenta;
    this.stock++;
    item.stocktotal++;
    item.articulos++;
  }

  
  public item(int Referencia, String Descripcion) {
    this.Referencia = Referencia;
    this.Descripcion = Descripcion;
    this.stock++;
    item.stocktotal ++;
    item.articulos++;
  }

  public int getReferencia() {
    return this.Referencia;
  }

  public void setReferencia(int Referencia) {
    this.Referencia = Referencia;
  }

  public String getDescripcion() {
    return this.Descripcion;
  }

  public void setDescripcion(String Descripcion) {
    this.Descripcion = Descripcion;
  }

  public double getPrecioProv() {
    return this.PrecioProv;
  }

  public void setPrecioProv(double PrecioProv) {
    this.PrecioProv = PrecioProv;
  }

  public double getPrecioVenta() {
    return this.PrecioVenta;
  }

  public void setPrecioVenta(double PrecioVenta) {
    this.PrecioVenta = PrecioVenta;
  }

  public int getStock() {
    return this.stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public void subirStock(int stock){
    this.stock +=stock;
  }
  
  public void bajarStock(int stock){
    this.stock -=stock;
  }
  public static int getStockTotal() {
    return item.stocktotal;
  }
  public static int getArticulos() {
    return item.articulos;
  }
  @Override
  public String toString() {
    return "\n"+
      " Referencia: " + getReferencia() + "\n" +
      " Descripcion: " + getDescripcion() + "\n" +
      " PrecioProv: " + getPrecioProv() + "\n" +
      " PrecioVenta: " + getPrecioVenta() + "\n" +
      " stock: " + getStock() + "\n";
  }









}