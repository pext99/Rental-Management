public class RentalProblems {
	//variables that stores the amount of damage deposit
	String name1 = "a";
	String name2 = "b";
	String name3 = "c";
	String name4 = "d";
	String name5 = "e";
	String name6 = "f";
	String name7 = "g";
	String name8 = "h";
	
	String deposit1 = "$10";
	String deposit2 = "$20";
	String deposit3 = "$30";
	String deposit4 = "$40";
	String deposit5 = "$50";
	String deposit6 = "$60";
	String deposit7 = "$70";
	String deposit8 = "$80";
	
	//first and second word (used as parameters)
	public String first = null;
	public String second = null;
	
	public RentalProblems (String first, String second){
		this.first = first;
		this.second = second;
	}
	
	//message prompt which tells the user the name of the person who is responsible for the damage and their
	//deposit amount
	void damagedProperty1(){
		System.out.println(name1 + " is not getting their deposit of " + deposit1 + " back.");
	}
	void damagedProperty2(){
		System.out.println(name2 + " is not getting their deposit of " + deposit2 + " back.");
	}
	void damagedProperty3(){
		System.out.println(name3 + " is not getting their deposit of " + deposit3 + " back.");
	}
	void damagedProperty4(){
		System.out.println(name4 + " is not getting their deposit of " + deposit4 + " back.");
	}
	void damagedProperty5(){
		System.out.println(name5 + " is not getting their deposit of " + deposit5 + " back.");
	}
	void damagedProperty6(){
		System.out.println(name6 + " is not getting their deposit of " + deposit6 + " back.");
	}
	void damagedProperty7(){
		System.out.println(name7 + " is not getting their deposit of " + deposit7 + " back.");
	}
	void damagedProperty8(){
		System.out.println(name8 + " is not getting their deposit of " + deposit8 + " back.");
	}
	
}