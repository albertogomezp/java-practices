public class p7413{ 
	public static void main(String[] args) throws InterruptedException {
		int [] Numbers =  new int[100];
		//---> Generating numbers
		int MaximunNumber = 0;
		int MinumNumber = 501;
		System.out.println("\n \n -----------------------------------------------------");
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
		for (int PrintNumbers = 0 ; PrintNumbers <= Numbers.length-1 ; PrintNumbers++){ //---> This prints the numbers
			if (Answer == 1){ //---> If we select MaximunNumber
				if(Numbers[PrintNumbers] == MaximunNumber){ 
					System.out.print("["+Numbers[PrintNumbers]+"] "); //--> Print just the number
				}
				else {
					System.out.print(Numbers[PrintNumbers]+" "); //--> The remaining numbers
				}
			}
			else if (Answer == 0){ //---> If we select MinimunNumber
				if(Numbers[PrintNumbers] == MinumNumber){
					System.out.print("["+Numbers[PrintNumbers]+"] "); //--> Print just the number
				}
				else {
					System.out.print(Numbers[PrintNumbers]+" "); //-->  the remaining numbers
				}
			}
			else {
				System.out.println("ERROR");
				break;
			}
			Thread.sleep(50); //--> It is not relevant, but this makes the practise more cute
		}
	}
}