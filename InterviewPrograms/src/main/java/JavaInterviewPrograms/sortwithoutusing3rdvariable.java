package JavaInterviewPrograms;

/**
 * Hello world!
 *
 */
public class sortwithoutusing3rdvariable 
{
    public static void main( String[] args )
    {
	  		int a[]={10,3,4,23,2};
	  		
	  		int count=5;
	  		for(int i=0;i<count;i++)
	  		{
	  			for(int j=i+1;j<count;j++)
	  			{
	  				if(a[i]>a[j])
	  				{
	  					a[j]=a[i]-a[j]; //	7
	  					a[i]=a[i]-a[j];	//	3
	  					a[j]=a[i]+a[j];
	  				}
	  	//			System.out.print(a[j] + ", ");
	  			}
	  	//		System.out.print(a[i] + ", ");
	  		}
	        
	  		for (int i = 0; i < count ; i++) 
	        {
	            System.out.print(a[i] + ", ");
	        }
    }
}
