import java.util.*;

class Bsrch
{
	public static void status(int a[],int n)
	{
		int i;
		System.out.println("\nStatus:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");	
		}
	}
	public static void main(String arr[])
	{
		while(true)
		{
			
		System.out.println("\nENTER YOUR CHOICE:");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for User\nenter 2 for Random \n");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("NUMBER OF ELEMENTS:");
				int n=sc.nextInt();
				int[] a=new int[100000];
				System.out.println("ENTER ELEMENTS:\n");
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
					
				}
				
				status(a,n);
//				Arrays.sort(a);
                           for(int i=0;i<n;i++)
			   {
				   for(int j=i+1;j<n;j++)
				   {
					   if(a[i]>a[j])
					   {
						   int temp=a[i];
						   a[i]=a[j];
						   a[j]=temp;
					   }
				   }
			   }
				status(a,n);
				
				System.out.println("ENTER THE ELEMENT YOU WANT TO SEARCH:\n");
				int k=sc.nextInt();
				
		int low,high;
		int flag=0;
		low=0;high=n-1;
		int count=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			count++;
			if(k>a[mid])
			{
				
				low=mid+1;
			}
			else if(k<a[mid])
			{
				
				high=mid-1;
			}
			else if(a[mid]==k)
			{

				System.out.println("\nvalue lies at pos"+(mid+1));
				flag=1;
			     break;
			}
			
				
		}
		if(flag==0)
		{
		     System.out.println("NOT FOUND\n");
		}
		System.out.println("Total comparisons:"+count);
		}
		else if(choice==2)
		{
			System.out.println("NUMBER OF ELEMENTS:");
				int n=sc.nextInt();
				int[] a=new int[100000];
				System.out.println("ENTER ELEMENTS:\n");
				for(int i=0;i<n;i++)
				{
					Random rand = new Random();
					a[i] = rand.nextInt(100);
					
				}
				status(a,n);
			//	Arrays.sort(a);
			for(int i=0;i<n;i++)
			   {
				   for(int j=i+1;j<n;j++)
				   {
					   if(a[i]>a[j])
					   {
						   int temp=a[i];
						   a[i]=a[j];
						   a[j]=temp;
					   }
				   }
			   }
			   System.out.println("Status after sorting:\n");
				status(a,n);
				System.out.println("ENTER THE ELEMENT YOU WANT TO SEARCH:\n");
				int k=sc.nextInt();
				
		     int low,high;
	    	 int flag=0;
		     low=0;high=n-1;
			 int count=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			count++;
			if(k>a[mid])
			{
				low=mid+1;
			}
			else if(k<a[mid])
			{	
				high=mid-1;
			}
			else if(a[mid]==k)
			{
				System.out.println("value lies at pos"+(mid+1));
				flag=1;
			     break;
			}
			
				
		}
		if(flag==0)
		{
		     System.out.println("NOT FOUND");
		}
		System.out.println("Total Comparisons:"+count);
		}
		System.out.println("DO YOU WANT TO ENTER MORE\n");
		String ch;
		ch=sc.next();
		String str="y";
		if(str.equals(ch))
			continue;
		else
			break;
		}
	}
}