package JavaInterviewPrograms;

public class PRIME 
{
	public static void main(String[] args) 
{
		int n=12;
		boolean flag=false;
		
	for(int i=2; i<= n/2; i++)
	{
		if(n % i==0)
		{
			flag=true;
			break;
		}
	}	 
	
	if(!flag)
	{
	 System.out.println("Is a PRIME");
	}
	else
	{
	System.out.println("Is not a PRIME Number");
	}
	
}
}
