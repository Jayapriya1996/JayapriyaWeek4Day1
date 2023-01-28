package week3.day3;

public class RemoveDuplicatesSet {

	public static void main(String args[])
	{
		String text="We learn java basics as part of java sessions in java week1";
		int count=1;
		text=text.toLowerCase();
		String text1="";
		String words[]=text.split(" ");
		for(int i=0;i<words.length;i++)
		{
	
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i]==(words[j]))
				{
					text1=words[i];
					count++;
					
				}
			}
			
		}
	if(count>1)
	{
		System.out.println(text.replace(text1, ""));
	}
	}}


