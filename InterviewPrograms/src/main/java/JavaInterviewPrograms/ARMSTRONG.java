package JavaInterviewPrograms;

public class ARMSTRONG 
{
	public static void main(String[] args) 
	{
		int input=153, rem,sum=0;
		int temp=input;
		while(input!=0)
		{
		 	rem=input%10;
		 	sum=sum +rem*rem*rem;
		 	input=input/10;
		}
		System.out.println(sum);
	
	if(temp == sum)
	{
		System.out.println("Is an Armstrong Number");
	}
	else
	{
		System.out.println("Is not an Armstrong Number");	
	}
}
}
