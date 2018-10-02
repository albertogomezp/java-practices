public class p4524 {
    public static void main(String[] args)
    {
        //------------------------ BASE ----------------------
        System.out.print("Por favor, introduzca el cargo (1- prog Jr, 2 prog Senior, 3 Jefe de proyecto): ");
        int cargo = Integer.parseInt(System.console().readLine());
        System.out.print("Por favor, introduzca el numero de dias que ha estado de viaje visitando clientes durante el mes): ");
        int dias = Integer.parseInt(System.console().readLine());
        System.out.print("Por favor, introduzca el estado civil (1- Soltero 2- Casado): ");
        double estado = Integer.parseInt(System.console().readLine());
        double salario = 0;
        switch  (cargo)
        {
            case 1:
                salario = 950;
                break;
            case 2:
                salario = 1200;
                break;
            case 3:
                salario = 1600;
                break;
        }
        double dietas = dias*30;
        double sueldo =salario+dietas;
        double irpf = 0;
        String irp ="0";
        if(estado == 1)
        {
            irp = "25%";
            irpf = sueldo*0.25;
        } 
        if(estado == 2)
        {
            irp = "20%";
            irpf  = sueldo*0.20;
        }
        System.out.println("\n \n \n \n \n \n \n");
        System.out.print(" SUELDO BASE: "+salario+" euros \n DIETAS ("+dias+" viajes) "+dietas+" euros \n"+" SUELDO BRUTO: "+sueldo+" euros \n RETENCION IRPF ("+irp+")  "+irpf+" euros \n SUELDO NETO: "+(sueldo - irpf)+" euros");;
             
    }
}
