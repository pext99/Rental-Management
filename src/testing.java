import static org.junit.Assert.*;
import org.junit.Test;

public class testing {
	
	@Test
	public void testExit0(){
		assertEquals("Thank you for using Tenant Database Software!", TenantDatabase.exit0());
	}
	
	@Test
	public void testNoticeToTenants(){
		assertEquals("The house has been sold! You have been given a 3 month notice to move out!", TenantDatabase.noticeToTenants());
	}
	
}
