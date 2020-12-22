package leetcode1688;

public class LeetCode1688Solution {

	public static void main(String[] args) {
		int n = 14;
		System.out.println("Total number of matches : " + getNoOfMatches(n));
	}

	public static int getNoOfMatches(int noOfTeams) {
		int matchesPlayed = 0;
		int teamAdvanced = 0;
		int totalNoOfMatches = 0;
		boolean evenNoStatus = false;

		try {
			//Check noOfTeams is even or odd
			if(noOfTeams%2 == 0) 
				evenNoStatus = true;
			//Calculating total number of matches for odd number of teams
			if(!evenNoStatus) {
				while (noOfTeams > 0) {
					matchesPlayed = noOfTeams/2;
					teamAdvanced = noOfTeams-matchesPlayed;
					if ( teamAdvanced == 1)
						noOfTeams=0;
					else
						noOfTeams = teamAdvanced;
					totalNoOfMatches = totalNoOfMatches+matchesPlayed;
				}
			}
			else {
				//Calculating total number of matches for even number of teams
				while (noOfTeams > 0) {
					matchesPlayed = (noOfTeams - 1) / 2 + 1;
					teamAdvanced = noOfTeams-matchesPlayed;
					if ( teamAdvanced == 1)
						noOfTeams=0;
					else
						noOfTeams = teamAdvanced;
					totalNoOfMatches = totalNoOfMatches+matchesPlayed;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalNoOfMatches;

	}

}
