public class Gestor{
  public static void main(String[] args) {
    System.out.println("Vamos a crear un array de gatitos!");
    Gato[] Argatos = new Gato[4];
    int edad = 0;
    String nombre = "";
    for(int x = 0; x<4; x++){
      Argatos[x] = new Gato();
      System.out.println("Introduzca el nombre del gato");
      nombre = System.console().readLine();
      Argatos[x].setNombreGato(nombre);
      System.out.println("Introduzca la edad del gato");
      edad = Integer.parseInt(System.console().readLine());
      Argatos[x].setEdad(edad);
      System.out.println(Argatos[x]);   
    } 
  }
}