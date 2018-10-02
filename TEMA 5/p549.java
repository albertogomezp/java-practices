public class p549 {
    public static void main(String[] args){
        System.out.println("POR FAVOR, INDRODUZCA UN NUMERO ");
        long num = Integer.parseInt(System.console().readLine());
        long cont = 1; // este contador ira comparando el numero introducido y el numero referencia (10)
        int cont2 = 0; // este ira aumentando a medida que el bucle avance, por cada vuelta se suma 1, cuenta los digitos
        while  (num>=cont){
            cont = cont*10;
            cont2++;
        } 
        System.out.print("EL NUMERO TIENE "+cont2+" CIFRAS");
    }
}