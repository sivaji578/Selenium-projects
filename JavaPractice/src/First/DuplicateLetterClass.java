package First;

public class DuplicateLetterClass {

	public static void main(String[] args) {
		String s="sivaji";
		int n=0;
		int i=0;
		for(i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					n++;
				}
			
			}
			
			System.out.println(s.charAt(i)+"=="+n);
		
		}
         
	}

}
