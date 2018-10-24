public class p634{  //extra: indica tambien cuantas veces se genera el numero 1
  public static void main(String[] args){
    int print = 0;
    int cont2 = 0;
   for(int cont = 1; cont<=200; cont++){
     print =(int)((Math.random()*10)+1);
     if(print ==1){
      cont++;
     }
     System.out.print(print+" ");
   } 
   System.out.print("\n"+cont2+" ");


  }
} 