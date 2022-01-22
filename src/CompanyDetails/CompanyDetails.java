package CompanyDetails;


public class CompanyDetails 
{

	private void CompName()
	{
		System.out.println("company name is : infoysis");
	}
	
	
	//method 2
	private void CompId()
	{
		System.out.println("Company Id is : 1256");
	}
	
	// method 3
	private void CompAddress()
	{
		System.out.println("Addres is: Chennai");
	}
	//main methods
	
	public static void main (String[]arg) 
	{
		//objects
		
		CompanyDetails C= new CompanyDetails();
		
		//methods calls
		C.CompAddress();
		C.CompId();
		C.CompName();
		
	}
	
}

