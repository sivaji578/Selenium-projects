import org.testng.Assert;
import org.testng.annotations.Test;

import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class sumValidation {
	@Test
	public void sumOfCourses()
	{
		JsonPath js=new JsonPath(PayLoad.coursePrice());
		int count=js.getInt("courses.size()");
		int amount=0;
		for(int i=0;i<count;i++)
		{
			int prices=js.get("courses["+i+"].price");
			int copiess=js.get("courses["+i+"].copies");
			int totalAmount=prices * copiess;
			System.out.println(totalAmount);
			amount=amount+totalAmount;
		}
		System.out.println(amount);
		int purchaseAmount=js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(amount, purchaseAmount);
		
	}

}
