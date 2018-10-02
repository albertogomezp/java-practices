public class p4525 {
    public static void main(String[] args)
    {
        //------------------------ INTRODUCCION DE DATOS ----------------------
        System.out.println("Bienvenido a la tienda online BanderaDeEspaña.es \n Vendemos banderas personalizadas de la maxima calidad");
        System.out.print("Por favor, introduzca la altura en cm ");
        double altura = Integer.parseInt(System.console().readLine());
        System.out.print("Por favor, introduzca el ancho en cm ");
        double ancho = Integer.parseInt(System.console().readLine());
        System.out.print("Desea incluir un escudo bordado por 2.50 euros (escriba 'SI' o 'NO'?) ");
        //------------------------ CUENTAS -------------------------------------
        double area = ancho*altura;
        String respuesta = (System.console().readLine());
        double precioporarea = area*0.01; //Calculo del precio por area en euros
        double precio = 0.00;
        String consin = " "; //variable que almacena el CON/SIN PARA EL PRINT DE LA BANDERA
        double consindouble = 0.00; //Lo mismo pero para el precio de la misma
        if (respuesta.equals("SI")){ //Basicamente este if y else if es para si se quiere o no escudo
             consindouble = 2.50;
             precio = precioporarea+2.50+3.25;
             consin =   "CON";
             } 
        else if(respuesta.equals("NO")){
            precio = precioporarea+3.25;
            consin = "SIN";
        }
        //----------------------- PRINTS ---------------------------------
        System.out.println("\n \n *****************************************");
        System.out.println("Gracias, aqui tiene el desglose de su compra");
        System.out.println("Bandera de "+area+"cm2: "+precioporarea+" euros");
        System.out.println(consin+" escudo  "+consindouble+" euros");
        System.out.println("GASTOS DE ENVIO: 3.50 euros");
        System.out.println("TOTAL "+precio+ " EUROS ");
    }
}
