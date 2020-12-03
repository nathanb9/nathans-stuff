
public class SeatingChartDriver {

	public static void main(String[] args) {
		String[] names = {"name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name","name"};
		double[] gpa = {3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0,3.0};

		SeatingChart chart = new SeatingChart(names,gpa);
		System.out.print(chart.toString());
	}
}