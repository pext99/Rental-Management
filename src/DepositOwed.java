
public class DepositOwed extends TenantDatabase{
	public DepositOwed(int roomNumber) {
		
	}

	public static String damagedRoom(int roomNumber){
		if(roomNumber > 8 || roomNumber < 1){
			return "Out of Bounds";
		}else{
			String deposit = depositArray[roomNumber - 1];
			return deposit;
		}
	}
}
