package JavaInterviewPrograms;

public class Palllindrome 
{
	public static void main(String[] args) 
	{
		String name= "NITIN";
		String reverse="";
		char arr[]=name.toCharArray();
		
		   for(int j=name.length()-1; j>=0; j--)
		   {
			   reverse=reverse + arr[j];
		   }
		   System.out.println("Reverse string is " + reverse);
		   
		   if(name.equals(reverse))
			   System.out.println("IS PALLINDROME");
		   else
			   System.out.println("NOT A PALLINDROME");
			   
	}
	
	
}
