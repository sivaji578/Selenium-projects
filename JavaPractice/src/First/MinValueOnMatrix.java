package First;

public class MinValueOnMatrix {

	public static void main(String []args)
	{
		int a[][]= {{3,5,7},{8,5,4},{2,5,7}};
		int min=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			
		}
		System.out.println(min);
	}
}
