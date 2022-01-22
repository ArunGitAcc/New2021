package LanguageDetails;

public class StateDetails {
	

	public void southIndia()
	{
		System.out.println("southIndia is food is GOOD");
		
	}
	
public void northIndia() 
	
	{
		System.out.println("northIndia food is BAD");
		
	}

	
	
	public static void main (String [] args) 
	{
		StateDetails  S= new StateDetails ();
		
		//methods calls
		S.southIndia();
		S.northIndia();
		
		
		LanguageInfo C=new LanguageInfo ();
		C.englishLanguage();
		C.hindiLanguage();
		C.tamilLanguage();
		
	}


	
	
}
