public class SeatingChart { 

	private Students[][] seats;


	public SeatingChart(String[]names, double gpa[]) {
		seats = new Students[5][6];
		int count = 0; 
		for (int col = 0; col < 5; col++) {
			for (int row = 0; row < 6; row++) {
				seats[col][row] = new Students(names[count],gpa[count]);

			}
		}

	}


	public String toString() {
		String out = "";
		for (int row = 0; row < seats.length; row++) {
			for (int col = 0; col < seats[row].length; col++) {
				out +=  seats[row][row].getName() + " "+seats[row][row].getGpa() + "\n";
			}


			
		}

		return out;
	}
	
	
}


