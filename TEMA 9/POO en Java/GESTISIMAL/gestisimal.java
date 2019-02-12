import java.util.ArrayList;
import java.util.HashMap;


public class gestisimal{
  /**
  * GESTISIMAL
  * @author Alberto Gómez Peña 1º DAW
  */
  static int OpcMen = 0;
  static ArrayList<item> Almacen = new ArrayList<item>();
  public static void main(String[] args) {
    while(OpcMen != 7){
      printMenu();
      selectormenu();
    }
    
    
  }
  
  /**
  * Método revolucionaro para la simplificación y ahorro de memoria al realizar impresiones mediante la consola de la JVM 
  * Incluye la caracteristica de retorno de carro.
  * @param imp Lo deseado para su impresionante impresión por pantalla
  */
  public static void println(String imp){
    System.out.println(imp);
  }
  /**
  * Imprime el menu del gestor
  */
  public static void printMenu(){
    println("----------------------------");
    println("GESTISIMAL V1.0 ");
    println("1. Listado");
    println("2. Alta");
    println("3. Baja");
    println("4. Modificacion");
    println("5. Entrada de mercancia");
    println("6. Salida de mercancia");
    println("7. Salir");
    println("----------------------------");
    OpcMen = Integer.parseInt(System.console().readLine()); 
  }
  
  public static void selectormenu(){
    switch (OpcMen){
      case 1:
      imprimeAlmacen();
      break;
      case 2:
      crearItem();
      break;
      case 3:
      borrarItem();
      break;
      case 4:
      modificarItem();
      break;
      case 5:
      entradaMercancia();
      break;
      case 6:
      salidaMercancia();
      break;
      case 7:
      println("Saliendo de GESTISIMAL");
      break;
      default:
      println("ERROR EN EL SISTEMA");
      break;
    }
  }
  //------------------------------------
  public static void imprimeAlmacen(){
    println("LISTADO DE ITEMS");
    for(int x = 0; x < Almacen.size(); x++){
      System.out.println(Almacen.get(x));
    }
    
    
  }
  //------------------------------------
  public static void crearItem(){
    println("Introduzca Descripcion");
    String descipcion = System.console().readLine();
    println("Introduzca precio del proveedor");
    double preprov = Double.parseDouble(System.console().readLine());
    println("Introduzca precio de venta");
    double preven =  Double.parseDouble(System.console().readLine());
    Almacen.add(new item((item.getArticulos()+1), descipcion, preprov, preven));
  }
  //------------------------------------
  public static void borrarItem(){
    println("Introduzca la referencia del articulo que desea borrar");
    Almacen.get(Integer.parseInt((System.console().readLine()))-1);
    println("Esta seguro que desea borrar este item? vuelva a introducir la referencia para confirmar");
    Almacen.remove(Integer.parseInt((System.console().readLine()))-1);  
  }
  //------------------------------------
  public static void modificarItem(){
    String seleccion;
    println("Introduzca la referencia del articulo que desea modificar");
    int ref = Integer.parseInt(System.console().readLine())-1;
    item bunny = Almacen.get(ref);
    
    println("introduzca nueva descripcion (vacio para no modificar)");
    String desc = System.console().readLine();
    if(desc !=""){
      bunny.setDescripcion(desc);
    }
    println("introduzca nuevo precio del proveedor? (vacio para no modificar)");
    seleccion = System.console().readLine();
    if(seleccion !=""){
      double PrePro = Double.parseDouble(seleccion);
      bunny.setPrecioProv(PrePro);
    }
    println("introduzca nuevo precio de venta? (vacio para no modificar)");
    seleccion = System.console().readLine();
    if(seleccion !=""){
      double PreVen = Double.parseDouble(seleccion);
      bunny.setPrecioVenta(PreVen);
    }
    println("introduzca nuevo stock? (vacio para no modificar, se recomienda usar entrada y salida de mercancia en lugar de esta funcion...)");
    seleccion = System.console().readLine();
    if(seleccion !=""){
      int stock = Integer.parseInt(seleccion);
      bunny.setStock(stock);
    }
    Almacen.set(ref, bunny);
  }
  //------------------------------------
  public static void entradaMercancia(){
    
    String seleccion;
    println("Introduzca la referencia del articulo que ha recibido stock");
    int ref = Integer.parseInt(System.console().readLine())-1;
    item bunny = Almacen.get(ref);

    seleccion = System.console().readLine();
    if(seleccion !=""){
      println("Introduzca cuanto stock ha entrado");
      int stock = Integer.parseInt(seleccion);
      bunny.subirStock(stock);
    }
    Almacen.set(ref, bunny);
  }
  //------------------------------------
  public static void salidaMercancia(){
    
    String seleccion;
    println("Introduzca la referencia del articulo que ha sacado stock");
    int ref = Integer.parseInt(System.console().readLine())-1;
    item bunny = Almacen.get(ref);
    println("Introduzca cuanto stock ha salido");
    seleccion = System.console().readLine();
    if(seleccion !=""){
      int stock = Integer.parseInt(seleccion);
      if(bunny.getStock()-stock >= 0){
        bunny.bajarStock(stock);
      }
      else{
        println("ERROR, NO PUEDE HABER STOCK NEGATIVO");
      }
    }
    Almacen.set(ref, bunny);
  }
  //------------------------------------
  
}