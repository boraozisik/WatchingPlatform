import java.util.Scanner;

public class ContestantUser implements CompetitionConditions{
	
	private boolean isMemberForTwoYears;
	private int competitionFee;
	
	public ContestantUser() {		
		Scanner input = new Scanner(System.in);
		System.out.println("The Fee that you paid?");
		this.competitionFee = input.nextInt();
		input.nextLine();
		System.out.println("Are you a MWL member for 2 years? (yes or no)");
		String answer = input.nextLine();
			if(answer.equals("yes")) {
				this.isMemberForTwoYears = true;
			}
			else {
				this.isMemberForTwoYears = false;
			}	
		
	}
				
	@Override
	public boolean isMemberForTwoYearsControl() {
		if(this.isMemberForTwoYears == true) {
			System.out.println("You are our member for over 2 years you can join the competition!");
			return true;
		}
		else {
			System.out.println("You are not our member for 2 years you cannot join the competition now but,maybe next time, you can join!");
			return false;
		}
	}

	@Override
	public boolean competitionFeeControl() {
		if(this.competitionFee < 20) {
			System.out.println("You must paid full of your competition fee for join the MWL's competition!!!");
			return false;
		}
		else {
			System.out.println("Competition fee has been paid");
			return true;
		}
	}

	
	

}
