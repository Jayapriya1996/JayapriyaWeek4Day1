package week3.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		Set<Integer> unique=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			unique.add(data[i]);
		}
		System.out.println(unique);
		System.out.println(unique.size());
		List<Integer> lst=new ArrayList<Integer>(unique);
		System.out.println(lst);	
		System.out.println(lst.get(lst.size()-2));
			
		}
		

	

}
