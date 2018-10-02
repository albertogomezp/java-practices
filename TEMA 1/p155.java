public class p155 // Horario
{
	public static void main(String[] args)
	{
		String sinf="SIN \033[31m";
		String prog="PRO \033[32m";
		String eed="EED \033[33m";
		String lm="LMM \033[34m";
		String bbdd="BDD \033[35m";
		String fol="FOL \033[36m";


	System.out.println("LUN MAR MIE JUE VIE");	
	System.out.println(sinf+prog+eed+eed+sinf);
	System.out.println(sinf+prog+lm+prog+sinf);
	System.out.println(sinf+prog+lm+prog+sinf);
	System.out.println("------------------------------------------");
	System.out.println(fol+bbdd+prog+bbdd+eed);
	System.out.println(fol+bbdd+prog+bbdd+lm);
	System.out.println(fol+bbdd+prog+bbdd+lm);
	}
}

