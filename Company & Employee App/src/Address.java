public class Address {
    private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public Address(String street, String city, String state, String zipCode)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public Address(Address object2)
	{
		street = object2.street;
		city = object2.city;
		state = object2.state;
		zipCode = object2.zipCode;
	}
	public void setStreet(String street)
	{
		this.street = street;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public void setZip(String zipCode)
	{
		this.zipCode = zipCode;
	}
	public String getStreet()
	{
		return street;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getZipCode()
	{
		return zipCode;
	}
        @Override
	public String toString()
	{
			String address = street + "\n" + city + ", " + state + " " + zipCode + "\n";
			return address;
	}
	public boolean equals(Address object2)
	{
		return street.equals(object2.street) && city.equals(object2.city) && state.equals(object2.state) 
		&& zipCode.equals(object2.zipCode);
	}
}

