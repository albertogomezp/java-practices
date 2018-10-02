public class p5411 {
    public static void main(String[] args){
        int num = 1;
        int cont;
        int cuadrado;
        int cubo;
        System.out.println("POR FAVOR, UN UN NUMERO ");
        num = Integer.parseInt(System.console().readLine());
        for (cont = num; cont<=(num+5);cont++){
            cuadrado=cont*cont;
            cubo=cont*cont*cont;
            System.out.printf("%-3s,  %3s", "    ",cuadrado,cubo);

            }   
    
    }
}