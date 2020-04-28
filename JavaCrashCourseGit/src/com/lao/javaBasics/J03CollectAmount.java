// Java Crash course | 03 | Return Types Explained | Java for Automation

package com.lao.javaBasics;

public class J03CollectAmount {
	
	int collected_amount = 1000;
	
	/* Without return
	public void collectAmountAndGiveItToMe()
	{
		System.out.println("Daddy, I have collected amount "+collected_amount);
	}
	*/
	
	// With return
	public int collectAmountAndGiveItToMe()
	{
		System.out.println("Daddy, I have collected amount "+collected_amount);
		return collected_amount;
	}

	public static void main(String[] args) {
		
		J03CollectAmount mySon = new J03CollectAmount();
		mySon.collectAmountAndGiveItToMe();
	}

}
