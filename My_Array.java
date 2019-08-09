public class My_Array
{
	 
	public static void main(String args[])
	{
		int i;
		int []array1=new int[4];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		System.out.print("INPUT:");
		for(i=0;i<array1.length;i++)
		{
			
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		System.out.print("OUTPUT:");
		for(i=0;i<4;i++)
		{
			if(i==2)
			{
				System.out.print(5+" ");
			}
			else
			{
				System.out.print(array1[i]+" ");
			}
		}
	}
}