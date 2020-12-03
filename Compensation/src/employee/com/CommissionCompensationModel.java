package employee.com;

public class CommissionCompensationModel {
	 
	private double grossSale; 
	private double commissionRate;

	public CommissionCompensationModel(double GROSSSALE, double COMMISSIONRATE) {
		this.grossSale = GROSSSALE; 
		this.commissionRate = COMMISSIONRATE; 
	}
	public double earning() {
		return this.commissionRate*this.grossSale; 
	}
	public double getGrossSale() {
		return grossSale;
	}
	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	public String toString() {
		return this.grossSale +" "+ this.commissionRate;
	}
	
}
