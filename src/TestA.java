import org.testng.annotations.Test;

public class TestA {
@Test
public void testA() throws InterruptedException
{
	System.out.println(" a starts");
	Thread.sleep(3000);
	System.out.println(" a ends");
}
}
