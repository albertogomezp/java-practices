// Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
// utilizando un bucle do-while.
public class p546 {
    public static void main(String[] args)
    {
        int cont = 320;
        do {
            System.out.println(cont);
            cont = cont-20;
        } while (cont >=160);
    }
}