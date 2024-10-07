import java.util.*;
class reversestring
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str,revstr=" ";
		int i;
		char c;
		System.out.print("Enter the String:");
		str=in.nextLine();
		for(i=0 ; i<str.length(); i++)
		{
			ch=str.charAt(i);
			revstr=c+revstr;
		}
		System.out.print(revstr);
	}
	
}
