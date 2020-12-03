package employee.com;

public class MainApp {

	public static void main(String[] args) {
		CommissionCompensationModel commissionModel = new CommissionCompensationModel(2000.00, 0.04);
		BasePlusCommissionCompensationModel basePlusCommissionModel = new BasePlusCommissionCompensationModel(2000.00, 0.05, 600.00);

		Employee employee1 = new Employee("John", "Smith", "111-11-1111", commissionModel);
		Employee employee2 = new Employee("Sue", "Jones", "222-22-2222", basePlusCommissionModel);

		
		System.out.printf("%s%n%s%n&", employee1, employee2);
		System.out.printf("%s%s%s%s%s%8.2f%n%n", "Earnings for ", employee1.getFirstName(), " ", employee1.getLastName(), ": ", employee1.earnings());
			
				CommissionCompensationModel commissionModelNew = new CommissionCompensationModel(5000.00, 0.04);
				BasePlusCommissionCompensationModel basePlusCommissionModelNew = new BasePlusCommissionCompensationModel(4000.00, 0.05, 800.00);
				
				employee1.setCompensation(basePlusCommissionModelNew);
				employee2.setCompensation(commissionModelNew);
				
			System.out.printf("%s%n%s%n", employee1, employee2);

	
			
	}

}
