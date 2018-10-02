public class p5412 {
    public static void main(String[] args){
        System.out.println("POR FAVOR, INSERTE UN NUMERO ");
        int num = Integer.parseInt(System.console().readLine());
        int siguiente; //proximo numero
        int actual=1; //primer numero 
        int anterior=0; //el guardado en cada suma
        //PARA QUE SE PUEDAN REALIZAR LOS CALCULOS, EL NUMERO ANTERIOR = 0 DEBIDO A QUE TIENE QUE TENER UN INICIO
        //PARA NO QUEDARNOS EN 0+NADA EL NUMERO ACTUAL SERA 1, PARA QUE INICIE LA SUCESION
       System.out.println("SUCESION DE FIBONACCI");
        // anterior -> ACTUAL -> SIGUIENTE

        for (int cont = 1; cont <=num; cont++)
            {
                siguiente = actual+anterior; //CALCULA EL NUMERO SUMANDO EL VALOR ACTUAL Y EL ANTERIOR
                System.out.print(siguiente+" ");
                anterior = actual; //EL NUMERO ANTERIOR AL IMPRESO POR PANTALLA SE CONVIERTE EN EL ANTIGUO
                actual = siguiente; //EL NUMERO EL NUMERO IMPRESO EN PANTALL SE CONVIERTE EN EL ANTERIOR
                
            }            
            
    
    }
}