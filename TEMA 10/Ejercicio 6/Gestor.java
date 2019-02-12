import java.util.HashMap;

/**
* @author Alberto Gómez Peña 1º -DAW
*/
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
public class Gestor{
  public  static HashMap<String, String> Usuarios = new HashMap<String,String>();
  public  static boolean mantenerse = true;
  public  static int intentos = 1;
  public  static String[] parametros = new String[2];

  public  static void main(String[] args) {
    
    while(mantenerse == true){
      imprimeln("Introduzca usuario");
      parametros[0] = System.console().readLine();
      imprimeln("Introduzca contrasenya");
      parametros[1] = System.console().readLine();
      comprobar();
      if(mantenerse == true){
        
      }
    }
    int cont = 1;
  }
  /**
  * Soy vagoo
  * @param imprime el string 
  */
  public static void imprimeln(String imprime){
    System.out.println(imprime);
  }
  public static void comprobar(){
    if(Usuarios.containsKey(parametros[0]) == true){
      if(Usuarios.get(parametros[0]) == parametros[1]){
        mantenerse = false;
        imprimeln("CORRECTO");
      }
    }
    else{
      intentos++;
      mantenerse = true;
      System.out.print("ERROR \n Te queda(n) "+(3-intentos)+" intentos");
    }
    
    
    
  }
}