public class SalariedEmployee extends Employee {
    private double yearlySalary;
	private double salary;
	
	public SalariedEmployee(String name, String department, double salary) throws InputException
	{
		super(name, department);
		yearlySalary = salary;
	}
        @Override
	public double getWeeklyPay()
	{
		return yearlySalary / 52;
	}
}
