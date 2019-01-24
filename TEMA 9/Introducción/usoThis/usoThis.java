public class usoThis {
  
  public static void main (String[] args) {
    Caballo rocinante;
    Caballo clavilenio;
    
    rocinante = new Caballo("Rocinante","macho");
    clavilenio = new Caballo("Clavileño","macho");
  
    rocinante.setEdad(3);
    rocinante.setPeso(350);
    rocinante.setRaza("Español");
    clavilenio.setPeso(330);
    

    System.out.println(rocinante.getNombre());
  
    System.out.println(rocinante.getEdad());
    System.out.println();
    
    System.out.print(rocinante);
    System.out.println();
    System.out.print(clavilenio);
    
    System.out.println();
    
    
  }
}