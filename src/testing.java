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
	
	@Test
	public void testInformationOver(){
		int roomNumber = 100;
		assertEquals("Out of Bounds", GetInfo.information(roomNumber));
	}
	
	@Test
	public void testInformationInside(){
		int roomNumber = 4;
		assertEquals("d (403)466-6233 ddddd@hotmail.com $400", GetInfo.information(roomNumber));
	}
	
	@Test
	public void testInformationUnder(){
		int roomNumber = 0;
		assertEquals("Out of Bounds", GetInfo.information(roomNumber));
	}
}
