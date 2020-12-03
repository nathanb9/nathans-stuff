package employee.com;

public class BasePlusCommissionCompensationModel extends CommissionCompensationModel{
	

	private double baseSalary;

	public BasePlusCommissionCompensationModel(double GROSSSALE, double COMMISSIONRATE,double baseSalary) {
		super(GROSSSALE, COMMISSIONRATE);
		this.baseSalary = baseSalary;
	}

	@Override
	public double earning() {

		return super.earning() + this.baseSalary; 
	}

	@Override
	public String toString() {

		return "Base Salary of " +this.baseSalary+ "\n";
	}

	@Override
	public void setCommissionRate(double commissionRate) {
		// TODO Auto-generated method stub
		super.setCommissionRate(commissionRate);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	


}
