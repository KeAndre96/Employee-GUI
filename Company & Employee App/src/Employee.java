public abstract class Employee {
    private String name;
	private String department;
	
	public Employee(String name, String department) throws InputException
	{
		String[] NameTokens = name.split(" ");
		if(NameTokens.length < 2)
		{
			throw new InputException();
		}
		this.name = name;
		this.department = department;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public String getName()
	{
		return name;
	}
	public String getDepartment()
	{
		return department;
	}
        @Override
	public String toString()
	{
		return "Name: " + name + "\nDepartment: " + department;
	}
	public abstract double getWeeklyPay();
}
