package First;

public class ReverseWord {

	public static void main(String[] args) {
		String name="this is sivaji i want to reverse this one";
		String word[]=name.split(" ");
		String wordreverse="";
		for(int i=0;i<word.length;i++)
		{
			String words=word[i];
		  String stringreverse="";
		  for(int j=words.length()-1;j>=0;j--)
		  {
			  stringreverse=stringreverse+words.charAt(j);
			  
		  }
		  wordreverse=wordreverse+stringreverse+" ";
		}
		System.out.println(wordreverse);
		
	}

}