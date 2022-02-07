
public class MainForCompetition {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("WELCOME TO MWL WATCHING QUESTION COMPETITION");
		String conditions = "Competition Joining Conditions...\n"
							   + "You must be our member for over 2 years.\n"
							   + "You must pay your fee fully.";
		
		String message = "You must complete all the conditions for join the competition";
		
			while(true) {
				System.out.println("***************************");
				System.out.println(conditions);
				System.out.println("***************************");
				
				ContestantUser contestantUser = new ContestantUser();
				System.out.println("Your competition fee is controlling...");
				Thread.sleep(3000);
				if(contestantUser.competitionFeeControl() == false) {
					System.out.println(message);
					continue;
				}
				System.out.println("Your membership situation is controlling...");
				Thread.sleep(3000);
				if(contestantUser.isMemberForTwoYearsControl() == false) {
					System.out.println(message);
					continue;
				}
				
				System.out.println("Your conditions are fully completed,You can join the competition!!!");
				break;
				
				
			}
		
		
		
		
		
		
		
	}
		
		
	
		
	
}
