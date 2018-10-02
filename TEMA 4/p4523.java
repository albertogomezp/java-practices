public class p4523
{
    public static void main(String[] args)
    {
        //------------------------ BASE ----------------------
        System.out.print("Por favor, introduzca la base imponible: ");
        double base = Double.parseDouble(System.console().readLine());
        //------------------------ IVA ------------------
        System.out.print("Introduzca tipo de iva (general, reducido, superreducido) ");
        String iva = System.console().readLine();
        String gen ="general";
        String redd ="reducido";
        String sup ="superreducido";
        double ivai = 0;
        
        /*
        Dependiendo del tipo de iva desado, el valor ivai sera distinto
        general = 21%
        reducido = 10%
        superreducido = 4%
        */
        int ivaint = 0;
        if(iva.equals(gen))
        {
            ivai = base*0.21;
            ivaint = 21;
        }
        if(iva.equals(redd))
        {
            ivai = base*0.1;
            ivaint = 10;
        }
        if(iva.equals(sup))
        {
            ivai = base*0.04;
            ivaint =4;
        }
        //------------------------ DESCUENTOS -------------------------
        System.out.print("Introduzca tipo de descuento (nopro, mitad, meno5,5porc) ");
        String desc = System.console().readLine();
        String mitadS ="mitad";
        String desc5e ="meno5";
        String cincoporc ="5porc";
        double descuento =0;
        String cod=" ";
        /*
        Dependiendo del tipo de descuento desado, el valor descuento sera distinto
        mitad = 50% descuento 
        meno5 = 5euros de descuento
        5porc = 5%
        */
        double precio = base+ivai;
        if(desc.equals(mitadS))
        {
            descuento = precio/2;
            cod ="mitad";
        }
        if(desc.equals(desc5e))
        {
            descuento = 5;
            cod ="5euros";
        }
        if(desc.equals(cincoporc))
        {
            descuento = precio*0.05;
            cod ="5%";
        } 
        //----------------------------
        System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
        System.out.println(" BASE IMPONIBLE: "+base+" euros \n IVA("+ivaint+"%): "+ivai+"\n PRECIO CON IVA: "+(base+ivai)+" euros \n CODIGO PROMOCIONAL: "+cod+"\n TOTAL: "+(precio-descuento)+" euros");  
    }
}

    