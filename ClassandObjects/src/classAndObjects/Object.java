package classAndObjects;

public class Object {
	public static void main(String[] args) {
		Classs tom =new Classs();
		Classs henry = new Classs();
		Classs ranga = new Classs();
		
		tom.firstname="tom";
		tom.lastname="try";
		tom.age=27;
		tom.accountBalance=13500;
		tom.testEligibility();
		System.out.println("Is Eligible for Credit Card: " + tom.eligibleforCreditCard);
		
		henry.firstname="henry;";
		henry.lastname="hen";
		henry.age=26;
		henry.accountBalance=15000;
		System.out.println("Is Eligible for Credit Card: " +henry.eligibleforCreditCard);
		
		ranga.firstname="Ranga";
		ranga.lastname="sree";
		ranga.age=26;
		ranga.accountBalance=20000;
		System.out.println("Is Eligible for Credit Card: " +ranga.eligibleforCreditCard);
		
	}

}
