import java.util.Scanner;


public class TenantDatabase {
	//the variables below store information about each tenant
	public static String[] nameArray = {"a","b","c","d","e","f","g","h"};
	static String name1 = "a";
	static String name2 = "b";
	static String name3 = "c";
	static String name4 = "d";
	static String name5 = "e";
	static String name6 = "f";
	static String name7 = "g";
	static String name8 = "h";
	
	public static String[] numberArray = {"(403)166-6890","(403)266-5588","(403)346-6790","(403)466-6233","(403)566-9575","(403)666-6688","(403)766-0003","(403)866-2462"};
	static String number1 = "(403)166-6890";
	static String number2 = "(403)266-5588";
	static String number3 = "(403)346-6790";
	static String number4 = "(403)466-6233";
	static String number5 = "(403)566-9575";
	static String number6 = "(403)666-6688";
	static String number7 = "(403)766-0003";
	static String number8 = "(403)866-2462";
	
	public static String[] emailArray = {"aaaaa@hotmail.com","bbbbb@hotmail.com","ccccc@hotmail.com","ddddd@hotmail.com","eeeee@hotmail.com","fffff@hotmail.com","ggggg@hotmail.com","hhhhh@hotmail.com"};
	static String email1 = "aaaaa@hotmail.com";
	static String email2 = "bbbbb@hotmail.com";
	static String email3 = "ccccc@hotmail.com";
	static String email4 = "ddddd@hotmail.com";
	static String email5 = "eeeee@hotmail.com";
	static String email6 = "fffff@hotmail.com";
	static String email7 = "ggggg@hotmail.com";
	static String email8 = "hhhhh@hotmail.com";
	
	public static String[] priceArray = {"100","200","300","400","500","600","700","800"};
	static int price1 = 100;
	static int price2 = 200;
	static int price3 = 300;
	static int price4 = 400;
	static int price5 = 500;
	static int price6 = 600;
	static int price7 = 700;
	static int price8 = 800;
	
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
				System.out.println("Price: " + arrayInfo[3]);
			}
		}
		
		//this will tell you the amount of their deposit
		if(first.equals("damaged") && second.equals("1")){
			RentalProblems deduction = new RentalProblems(first,second);
			deduction.damagedProperty1();
		}else if(first.equals("damaged") && second.equals("2")){
			RentalProblems deduction = new RentalProblems(first,second);
			deduction.damagedProperty2();
		}else if(first.equals("damaged") && second.equals("3")){
			RentalProblems deduction = new RentalProblems(first,second);
			deduction.damagedProperty3();
		}else if(first.equals("damaged") && second.equals("4")){
			RentalProblems deduction = new RentalProblems(first,second);
			deduction.damagedProperty4();
		}else if(first.equals("damaged") && second.equals("5")){
			RentalProblems deduction = new RentalProblems(first,second);
			deduction.damagedProperty5();
		}else if(first.equals("damaged") && second.equals("6")){
			RentalProblems deduction = new RentalProblems(first,second);
			deduction.damagedProperty6();
		}else if(first.equals("damaged") && second.equals("7")){
			RentalProblems deduction = new RentalProblems(first,second);
			deduction.damagedProperty7();
		}else if(first.equals("damaged") && second.equals("8")){
			RentalProblems deduction = new RentalProblems(first,second);
			deduction.damagedProperty8();
		}
		
		//outputs the total income per month
		if(first.equals("monthly") && second.equals("income")){ //move to new class and reduce parameters
			int incomePerMonth = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8;
			System.out.println("Your monthly income is: " + incomePerMonth);
		}
		
		
		//gives a notice to tenants when the house sells
		if(first.equals("house") && second.equals("sold")){
			System.out.println(noticeToTenants());
			
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
		String exitPrompt = "Thank you for using Tenant Database Software!";
		return exitPrompt;
	}

}
