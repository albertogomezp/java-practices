public class p4521
{
    public static void main(String[] args)
    {
    System.out.print("Por favor, introduzca su nota del primer examen: ");
    double e1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la nota del segundo examen: ");
    double e2 = Double.parseDouble(System.console().readLine());
    double media1 = (e1+e2)/2;
    if(media1>=5)
        {
            System.out.println("ENHORABUENA, ESTAS APRBOBADO CON UN: "+media1+" DE MEDIA");
        }
    else
        {
            System.out.println("Introduzca el resultado del examen de recuperacion (APTO/NO APTO)");
            String rec = System.console().readLine();
            String apto ="APTO";
            String noapto ="NO APTO";
            if (rec.equals(apto))
            {
                double media2 = (media1+5)/2;
                System.out.println("ENHORABUENA, ESTAS APROBADO");
            }
            if (rec.equals(noapto))
            {
                System.out.print("TU NOTA FINAL ES "+media1);
            }
        }


}
    }
    