public class p5412 {
    public static void main(String[] args){
        int num = 1;
        int cont;
        int cuadrado;
        int cubo;
        System.out.println("POR FAVOR, INSERTE UN NUMERO ");
        num = Integer.parseInt(System.console().readLine());
        System.out.println("\n \n \n \n \n \n");
        for (cont = num; cont<=(num+5);cont++){
            cuadrado=cont*cont; //realiza el cuadrado
            cubo=cont*cont*cont; //realiza el cubo
            System.out.println("--------------------------------");
            System.out.println("Numero: "+cont+" Cuadrado: "+cuadrado+" Cubo: "+cubo);
            
            }   
    
    }
}