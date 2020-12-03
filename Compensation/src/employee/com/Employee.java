package employee.com;
public class Employee {
	//instance variables 
	private String firstName; 
	private String lastName; 
	private String SSN; 
	private CommissionCompensationModel componsationModel;  
	//constructors 
	public Employee(String FIRSTNAME, String LASTNAME, String SSN, CommissionCompensationModel commissionModel) {
		
		this.firstName = FIRSTNAME; 
		this.lastName = LASTNAME; 
		this.SSN = SSN;
		this.componsationModel = commissionModel; 
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	public CommissionCompensationModel getCommissionModel() {
		return componsationModel;
	}

	public void setCommissionModel(CommissionCompensationModel commissionModel) {
		this.componsationModel = commissionModel;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//setters and getters 
	public String getFirstName() {
		return firstName; 
	}

	@Override
	public String toString() {

		return this.firstName+ " " +this.lastName+ "\n Social Security: "+this.SSN+" " +this.componsationModel.getGrossSale()+ " "+ this.componsationModel.getCommissionRate()+" \n";
	}

	public double earnings() {

		return this.componsationModel.earning();
	}

	public void setCompensation(CommissionCompensationModel basePlusCommissionModelNew) {
		this.componsationModel = basePlusCommissionModelNew;
		
	}

	


}
