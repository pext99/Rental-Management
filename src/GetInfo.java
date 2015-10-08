//returns the tenant's information for a room
public class GetInfo extends TenantDatabase{
	
	public GetInfo(int roomNumber) {

	}

	public static String information(int roomNumber){
		if(roomNumber > 8 || roomNumber < 1){
			return "Out of Bounds";
		}else{
			String name = nameArray[roomNumber - 1];
			String number = numberArray[roomNumber - 1];
			String email = emailArray[roomNumber - 1];
			String price = priceArray[roomNumber - 1];
			return name + " " + number + " " + email + " $" + price;
		
		}
	}

}
