public class p547 {
    public static void main(String[] args)
    {
        int cont =1 ;
        int contra = 1104;
        do{
            System.out.println("POR FAVOR, INDRODUZCA LA CONTRASEÑA ");
            int password = Integer.parseInt(System.console().readLine());
            cont++;
            if(password == contra){
                cont = 50;
                }
            } while (cont<=4);

        if (cont == 50){
            System.out.println("contrasenya correcta");
        } else{
            System.out.println("Contrasenya incorrecta");
        }
    }
}