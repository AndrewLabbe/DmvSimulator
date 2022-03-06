
public class DmvSimulator {

	public static void main(String[] args) {
		System.out.println("Welcome to the DMV, please wait for your number to be called");
		long randomNum = Math.round(Math.random() * (200) + 1);
		System.out.println("Your number is " + randomNum);
		
		long currentNum = randomNum + 1;
		while(currentNum != randomNum) {
			if(currentNum > 200) {
				currentNum = 1;
			}
			else {
				System.out.println("Now serving number " + currentNum);
				currentNum += 1;
			}
		}
		
		System.out.println("Now serving number " + currentNum);
		System.out.println("You don't even have your paperwork! Do you just want to waste everyone's time?!? \n GET OUT!!!"
				+ "\nHA!HA!HA!HA! *laughs evily*");
	}
	
}
