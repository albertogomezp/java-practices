public class p548 {
    public static void main(String[] args){
        System.out.println("POR FAVOR, INDRODUZCA UN NUMERO ");
        int num = Integer.parseInt(System.console().readLine());
        for(int cont = 1; cont <= 10; cont++){    
            System.out.println(num+" x "+cont+" = "+(num*cont));
        }
    }
}