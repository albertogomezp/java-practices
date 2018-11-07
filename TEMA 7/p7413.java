public class p7413{ 
	public static void main(String[] args) throws InterruptedException {
		int [] Numbers =  new int[100];
		//---> Generating numbers
		int MaximunNumber = 0;
		int MinumNumber = 501;
		for (int GenerateNumbers = 0; GenerateNumbers <Numbers.length-1; GenerateNumbers++){
			Numbers[GenerateNumbers] = (int)(Math.random()*501);
			System.out.print(Numbers[GenerateNumbers]+" ");
			MaximunNumber = Math.max(Numbers[GenerateNumbers], MaximunNumber);
			MinumNumber = Math.min(Numbers[GenerateNumbers], MinumNumber);
			//Thread.sleep(50);
		}
		System.out.print("\n \n -----------------------------------------------------");

		System.out.print("\n Do you wanna indicate the maxiumn number or the minimun (1 = Max ; 0 = Min): ");
		int Answer = Integer.parseInt(System.console().readLine());
		for (int PrintNumbers = 0 ; PrintNumbers <= Numbers.length-1 ; PrintNumbers++){



			if (Answer == 1){
				if(Numbers[PrintNumbers] == MaximunNumber){ 
					System.out.print("["+Numbers[PrintNumbers]+"] ");
				}
				else {
					System.out.print(Numbers[PrintNumbers]+" ");
				}
			}
			else if (Answer == 0){
				if(Numbers[PrintNumbers] == MinumNumber){
					System.out.print("["+Numbers[PrintNumbers]+"] "); 	
				}
				else {
					System.out.print(Numbers[PrintNumbers]+" ");
				}
			}
			Thread.sleep(50);
		}
	}
}