package com.lao.conditionalStatements;

public class SuperHero {

	String hero = "Captain America";
	
	public void superHeroFinder()
	{
		switch (hero) {
		case "Iron Man":
			System.out.println("Iron Man is a super hero");
			break;
			
		case "Bat Man":
			System.out.println("Bat Man is a super hero");
			break;
			
		case "Spider Man":
			System.out.println("Spider Man is a super hero");
			break;
			
		case "Thor":
			System.out.println("Thor is a super hero");
			break;

		default:
			System.out.println("Sorry Captain America is not a super man");
		}
	}
	
	public static void main(String[] args) {
		
		SuperHero obj = new SuperHero();
		obj.superHeroFinder();

	}

}
