import files.PayLoad;
import files.ReUsable;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParseClass {
	public static void main(String[] args)
	{
		JsonPath js=new JsonPath(PayLoad.coursePrice());
		//Print Number of Courses is there in Array
	int courseCount=js.getInt("courses.size()");
	System.out.println(courseCount);
	//Print the Purchase Amount
	int purchaseAmount=js.getInt("dashboard.purchaseAmount");
	System.out.println(purchaseAmount);
	String titleFirstCourse=js.get("courses[0].title");
	System.out.println(titleFirstCourse);
	//Print all courses and Respective prices
	for(int i=0;i<courseCount;i++)
	{
		String allTitles=js.get("courses["+i+"].title");
		System.out.println(js.get("courses["+i+"].price").toString());
		System.out.println(allTitles);
		
	}
	String text=js.getString("courses[2].title");
	System.out.println(text);
	String line=js.get("courses[1].title");
	System.out.println(line);
	
	}

}
