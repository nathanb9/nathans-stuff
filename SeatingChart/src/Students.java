
public class Students {

	private String Name = null; 
	private Double gpa = 0.0; 
	

	public  Students(String name, double GPA){
		Name = name; 
		gpa = GPA; 
	}

	public String getName() {
		return Name;
	}
	public double getGpa(){
		return gpa; 
	}
}
