package problems;
 
    // s = 

public class Valid_PalinDrome_String {
	
	
	
	

	public boolean isPalindrome(String s) {
		int left=0;
		int right=s.length()-1;
		
		while(left<right) 
		{
			while(left<right&&!Character.isLetterOrDigit(s.charAt(left)))left++;
			while(right>left&&!Character.isLetterOrDigit(s.charAt(right)))right--;
			if(Character.isLowerCase(s.charAt(left))!=Character.isLowerCase(s.charAt(right))) 
				return false;
			left++;
			right--;
			}
		return true;
	}
	
	
	
	public static void xorOperation(int n,int start)
	{
		int xor=0;

		for(int i=0;i<n;i++)
		{

			xor^=(start+2*i);

		}
		System.out.println(xor);

	}
	public static void main(String[] args) {
//		String s="A man, a plan, a canal: Panama";
//		
//		Valid_PalinDrome_String ob=new Valid_PalinDrome_String();
//		
//		
//		ob.isPalindrome(s);\
	
		
		xorOperation(12,1);
		
		
		
		
		
		
		
			
		
		
	}

}


class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        if(n<=1)
            return true;
        int i=0;
        int j=n-1;
        while(i<j) {
            char first = s.charAt(i);
            char second = s.charAt(j);
            if(!Character.isLetterOrDigit(first)){
                i++;
            }
            else if(!Character.isLetterOrDigit(second)) {
                j--;
            }
            else {
                if(Character.toLowerCase(first) != Character.toLowerCase(second)){
                    return false;
                }
                else {
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}


