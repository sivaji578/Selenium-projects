package First;

public class StringReplace {
	public static void main(String[] args)
	{
		String s="[Sivaji]";
		s=s.replaceAll("\\[|\\]", "");
		System.out.println(s);
	}

}
