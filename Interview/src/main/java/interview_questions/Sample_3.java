package interview_questions;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample_3 {

	/*
	  @Test(invocationCount = 3) //Run without loops
	   public void run3Times() {
	 System.out.println("Hi"); 
	 }
	 */


	/*@Test(timeOut = 2000)
	public void timeoutSample() throws InterruptedException
	//It fails bze of time consumption
	{ 
		Thread.sleep(3000);
		System.out.println("Is it pass or fail"); 
	}
	
	@Test(dependsOnMethods = "timeoutSample" , alwaysRun = true)
	public void timeinSample()
	{
		System.out.println("Hai");
	}
*/

/*
	@Test(timeOut = 2000 , expectedExceptions =org.testng.internal.thread.ThreadTimeoutException .class) 
	public void timeoutSample1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Is it pass"); }
*/

//---------------------------------Assert vs Verify--------------------------
	/* @Test
	 public void assertEg()
	{
		System.out.println("before");
		Assert.fail();
		System.out.println("after");
	} */
	
	@Test
	public void VerifyEg()
	{
		SoftAssert sa=new SoftAssert();
		System.out.println("before");
		sa.fail();
		System.out.println("after");
	}
	
}
