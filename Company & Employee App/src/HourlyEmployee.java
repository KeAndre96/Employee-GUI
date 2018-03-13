public class HourlyEmployee extends Employee {
    private double hourlyWage;
	private double hours;
	
	public HourlyEmployee(String name, String department, double wage, double hours) throws InputException
	{
		super(name, department);
		hourlyWage = wage;
		this.hours = hours;
	}
        @Override
	public double getWeeklyPay()
	{
		return hourlyWage * hours;
	}
}
