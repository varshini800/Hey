import java.util.*;
class s
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] brr=new int[n];
		int c=0;
		for(int i=0;i<n/2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[j]>0)
				{
					brr[c]=arr[j];
					c++;
					for(int k=j;k<n-1;k++)
						arr[k]=arr[k+1];
					n--;
					j--;
				}
			}
			for(int j=0;j<n;j++)
			{
				if(arr[j]<0)
				{
					brr[c]=arr[j];
					c++;
					for(int k=j;k<n-1;k++)
						arr[k]=arr[k+1];
					n--;
					j--;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(brr[i]+" ");
	}
}