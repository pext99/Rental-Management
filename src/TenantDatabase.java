import java.util.Scanner;


public class TenantDatabase {
	//the variables below store information about each tenant
	public static String[] nameArray = {"a","b","c","d","e","f","g","h"};
	public static String[] numberArray = {"(403)166-6890","(403)266-5588","(403)346-6790","(403)466-6233","(403)566-9575","(403)666-6688","(403)766-0003","(403)866-2462"};
	public static String[] emailArray = {"aaaaa@hotmail.com","bbbbb@hotmail.com","ccccc@hotmail.com","ddddd@hotmail.com","eeeee@hotmail.com","fffff@hotmail.com","ggggg@hotmail.com","hhhhh@hotmail.com"};
	public static String[] priceArray = {"100","200","300","400","500","600","700","800"};
	public static int[] rentArray = {100, 200, 300, 400, 500, 600, 700, 800};
	public static String[] depositArray = {"10","20","30","40","50","60","70","80"};
	
	public static void main(String[] args) {
		
		System.out.println("Input: ");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		
		//detects spaces. if more than 1, output an error
		int numberOfSpaces = input.length() - input.replaceAll(" ", "").length();
		if(numberOfSpaces > 1){
			System.out.println("Please enter 2 words!");
			exit0();
		}
		
		//stores the first and second word of the user's input
		int i = input.indexOf(' ');
		String first = input.substring(0, i);
		String second = input.substring(i+1);
		
		//output's tenants information if first word is 'info' and second word
		//is from 1-8(which is their room number
		if(first.equals("info")){
			int roomNumber = Integer.parseInt(second);
			if(roomNumber > 8 || roomNumber < 1){
				System.out.println("Number is Out of Bounds.");
			}else{
				GetInfo tenantInfo = new GetInfo(roomNumber);
				String gotInfo = tenantInfo.information(roomNumber);
				String[] arrayInfo = gotInfo.split(" ");
				System.out.println("Name: " + arrayInfo[0]);
				System.out.println("Number: " + arrayInfo[1]);
				System.out.println("Email: " + arrayInfo[2]);
				System.out.println("Price: " + arrayInfo[3]+exit0());
			}
		}
		
		if(first.equals("damaged")){
			int roomNumber = Integer.parseInt(second);
			if(roomNumber < 9 && roomNumber > 0){
				DepositOwed depositReduction = new DepositOwed(roomNumber);
				
				System.out.println(nameArray[roomNumber - 1] + " is not getting their deposit of " + depositReduction.damagedRoom(roomNumber) +" back."+exit0());
			}else{
				System.out.println("Number is Out of Bounds.");
			}
			
		}

		//outputs the total income per month
		if(first.equals("monthly") && second.equals("income")){ //move to new class and reduce parameters
			int incomePerMonth = 0;
			for (i = 0; i != 8; i++){
				incomePerMonth = incomePerMonth + rentArray[i];
			}
			System.out.println("Your monthly income is: " + incomePerMonth+exit0());
		}
		
		
		//gives a notice to tenants when the house sells
		if(first.equals("house") && second.equals("sold")){
			System.out.println(noticeToTenants()+exit0());
			
		}
		exit0();
		
	}
	
	//notice to tenants after house sells
	public static String noticeToTenants(){
		String notice = "The house has been sold! You have been given a 3 month notice to move out!";
		return notice;
	}
	//exit prompt method
	public static String exit0(){
		String exitPrompt = "\nThank you for using Tenant Database Software! GoodBye!";
		return exitPrompt;
	}

}
