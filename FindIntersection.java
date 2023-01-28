package week3.day3;

public class FindIntersection {

	public static void main(String[] args) {
		int[] array= {3,2,11,4,6,7};
		int[] array1= {1,2,8,4,9,7};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				if(array[i]==array1[j])
				{
					System.out.println(array[i]);
				}
			}
		}

	}

}
