import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Company {
    private String name;
    private Address address;
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
    public Company(String name, Address address)
	{
		this.name = name;
		this.address = new Address(address);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(Address address)
	{
		this.address = new Address(address);
	}
	public String getName()
	{
		return name;
	}
	public Address getAddress()
	{
		return new Address(address);
	}
	public String toString()
	{
		return "\n" + name + "\n" + address;
	}
	public void addEmployeeFile() throws IOException
	{
		FileWriter outputFile = new FileWriter("employee_info.txt");
		PrintWriter writer = new PrintWriter(outputFile);
		for(int i = 0; i < employeeList.size(); i++)
		{
		    writer.println(employeeList.get(i));
		    writer.println(String.format("$%.2f", employeeList.get(i).getWeeklyPay()));
		}
		outputFile.close();
	}
        public void addEmployee(Employee e)
        {
            employeeList.add(e);
        }
}