package week3.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
			
		}
		System.out.println("The set is" +set);
		List<Integer> lst=new ArrayList<Integer>(set);
		System.out.println("The list is" +lst);	
		Collections.sort(lst);
		System.out.println(lst);
	for(int j=0;j<lst.size();j++)
	{
	if(lst.get(j)!=j+1)
	{
		System.out.println(j+1);
		break;
	}
		

		
}}}