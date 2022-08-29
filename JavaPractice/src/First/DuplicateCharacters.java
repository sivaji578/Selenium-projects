package First;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String a="cucumber";
		int count;
		char[] string=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			count=1;
			for(int j=i+1;j<a.length();j++)
			{
				if(string[i]==string[j])
				{
					count++;
				}
			}
		 if(count>1)
		 {
			 System.out.println(string[i]);
		 }
		}
		
	}

}
