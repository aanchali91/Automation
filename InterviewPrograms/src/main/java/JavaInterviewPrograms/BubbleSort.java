package JavaInterviewPrograms;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int n=6, a[]= {3, 4 ,5, 2, 5, 1};
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[j-1]>a[j])
				{
					int temp;
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				System.out.println(a[j]);
			}
			System.out.println("~~~~~~~~~~~~~~~");
			
			//System.out.println(a[i]);
		}		
	}
}

