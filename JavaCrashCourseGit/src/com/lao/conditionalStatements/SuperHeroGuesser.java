package com.lao.conditionalStatements;

public class SuperHeroGuesser {

	String super_hero = "Captain America";
	
	public static void main(String[] args) {
		SuperHeroGuesser obj = new SuperHeroGuesser();
		if (obj.super_hero.equals("Iron Man"))
		{
			System.out.println("Yes, Iron Man is a super hero");
		}
		
		else if (obj.super_hero.equals("Bat Man"))
		{
			System.out.println("Yes, Bat Man is a super hero");
		}
		
		else if (obj.super_hero.equals("Spiden Man"))
		{
			System.out.println("Yes, Spider Man is a super hero");
		}
		else
		{
			System.out.println("Sorry "+obj.super_hero+" is not a super hero");
		}
	}

}
