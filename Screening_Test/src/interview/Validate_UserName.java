package interview;

public class Validate_UserName {

	

	public static void main(String[] args) {
		
		validateUserName("I love india");
		
	
	}

	private static boolean validateUserName(String string) {
		if(string.length()>=8&&string.endsWith("_job"))
		{
			return true;
			
		}
		return false;
		
		
	}

}
