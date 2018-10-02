public class p5410 {
    public static void main(String[] args){
        int num = 1;
        double cont = 0; // este contador ira guardando la suma
        int cont2 = 0; // este ira aumentando a medida que el bucle avance, por cada numero introducido.
        while  (num>0){
            System.out.println("POR FAVOR, UN UN NUMERO (para finalizar bucle inserte un numero negativo) ");
            num = Integer.parseInt(System.console().readLine());
            if(num>0){
                cont = cont+num;
                cont2++;
            }
        } 

        System.out.print("LA MEDIA ES "+(cont/cont2));
    }
}