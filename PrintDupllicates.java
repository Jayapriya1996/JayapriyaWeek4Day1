package week3.day3;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrintDupllicates {

	public static void main(String[] args) {
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		Set<Integer> unique=new TreeSet<Integer>();
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				unique.add(arr[i]);
		}}
		System.out.println(unique);

}}