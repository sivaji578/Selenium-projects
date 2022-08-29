package First;

public class StringReverseStringBuffer {
	public static void main(String[] args)
	{
	String s="Sivaji";
	String s1="";
	//char[] b=s.toCharArray();
	for(int i=s.length()-1;i>=0;i--)
	{
	 char c = s.charAt(i);
	 s1=s1+c;
	 
	}
	System.out.println(s1);
	}

}
