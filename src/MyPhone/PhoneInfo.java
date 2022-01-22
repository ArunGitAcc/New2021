package MyPhone;

public class PhoneInfo
{

	private void PhoneName()
	{
		System.out.println("phone name is: Iphone");
	}
	
	
	//method 2
	private void PhoneMieiNum()
	{
		System.out.println("Phone im num is :15646497");
	}
	
	// method 3
	private void Camera()
	{
		System.out.println("phone camera is :24Pixel");
	
	}
	private void storage()
	{
		System.out.println("Phone storage is :128SD");
	
	}
	private void osName()
	{
		System.out.println("Phone Os is :Win 10");
	
	}
	//main methods
	
	public static void main (String[]arg) 
	{
		//objects
		
		PhoneInfo C= new PhoneInfo();
		
		//methods calls
		C.Camera();
		C.PhoneName();
		C.storage();
		C.PhoneMieiNum();
		C.osName();
	}
	
}
