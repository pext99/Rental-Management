import java.util.Scanner;

public class TenantDatabase {
	//the variables below store information about each tenant
	static String name1 = "a";
	static String name2 = "b";
	static String name3 = "c";
	static String name4 = "d";
	static String name5 = "e";
	static String name6 = "f";
	static String name7 = "g";
	static String name8 = "h";
	
	static String number1 = "(403)166-6890";
	static String number2 = "(403)266-5588";
	static String number3 = "(403)346-6790";
	static String number4 = "(403)466-6233";
	static String number5 = "(403)566-9575";
	static String number6 = "(403)666-6688";
	static String number7 = "(403)766-0003";
	static String number8 = "(403)866-2462";
	
	static String email1 = "aaaaa@hotmail.com";
	static String email2 = "bbbbb@hotmail.com";
	static String email3 = "ccccc@hotmail.com";
	static String email4 = "ddddd@hotmail.com";
	static String email5 = "eeeee@hotmail.com";
	static String email6 = "fffff@hotmail.com";
	static String email7 = "ggggg@hotmail.com";
	static String email8 = "hhhhh@hotmail.com";
	
	static int price1 = 100;
	static int price2 = 200;
	static int price3 = 300;
	static int price4 = 400;
	static int price5 = 500;
	static int price6 = 600;
	static int price7 = 700;
	static int price8 = 800;
	
	public static void main(String[] args) {
		
		
		//read input
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
			int intSecond = Integer.parseInt(second);
			switch(intSecond){
			case 1:
				System.out.println("Name: " + name1);
				System.out.println("Number: " + number1);
				System.out.println("Email: " + email1);
				exit0();
				break;
			case 2:
				System.out.println("Name: " + name2);
				System.out.println("Number: " + number2);
				System.out.println("Email: " + email2);
				exit0();
				break;
			case 3:
				System.out.println("Name: " + name3);
				System.out.println("Number: " + number3);
				System.out.println("Email: " + email3);
				exit0();
				break;
			case 4:
				System.out.println("Name: " + name4);
				System.out.println("Number: " + number4);
				System.out.println("Email: " + email4);
				exit0();
				break;
			case 5:
				System.out.println("Name: " + name5);
				System.out.println("Number: " + number5);
				System.out.println("Email: " + email5);
				exit0();
				break;
			case 6:
				System.out.println("Name: " + name6);
				System.out.println("Number: " + number6);
				System.out.println("Email: " + email6);
				exit0();
				break;
			case 7:
				System.out.println("Name: " + name7);
				System.out.println("Number: " + number7);
				System.out.println("Email: " + email7);
				exit0();
				break;
			case 8:
				System.out.println("Name: " + name8);
				System.out.println("Number: " + number8);
				System.out.println("Email: " + email8);
				exit0();
				break;
			default:
				System.out.println("The number you have entered is out of range");
				exit0();
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
			exit0();
		}
		
		//gives a notice to tenants when the house sells
		if(first.equals("house") && second.equals("sold")){
			HouseHasSold notice = new HouseHasSold();
			notice.noticeToTenants();
			
		}
		
	}
	//exit prompt method
	public static void exit0(){
		System.out.println("Thank you for using Tenant Database Software!");
	}

}
