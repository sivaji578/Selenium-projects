package TestData.JobTrack360Maven;

import org.testng.annotations.Test;

public class CreateNewProposalTest extends CreateNewProposal {
	@Test
	public void right() throws InterruptedException
	{
		Basic b=new Basic();
		b.first();
		//newData();
		propertyAddress();
		architechEngineer();
	}

}
