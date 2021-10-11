package com.gamegun;

public class Player1 {
	private String name;
	private String weapon;
	private int health;
	public Player1(String name, String weapon, int health) {
		super();
		this.name = name;
		this.weapon = weapon;
		if (health<0 || health >100) {
			this.health=100;
		}else this.health=health;
	}
	
	public void damageByGun1()
	{
	    this.health -=30;
	     if (this.health <=0) {
	    	 this.health=0;
			
		}
	     System.out.println("got hit by gun 1. health is reduced by 30 " + "new health is " +this.health);
	     if (this.health==0) {
	    	 System.out.println(getName()+ " is dead");
			
		}
	}
	public void damageByGun2()
	{
		
	     this.health -=50;
	     if (this.health <=0) {
	    	 this.health=0;
			
		}
	     System.out.println("got hit by gun 2. health is reduced by 50" + "new health is" +this.health);
	     if (this.health==0) {
	    	 System.out.println(getName()+" is dead");
			
		}
	}
	
	
	public void heal()
	{
		if (this.health <=0) 
		System.out.println("player  is dead . HEAL not possible");
		else {  
			this.health=100;
		System.out.println("health is "+ this.health);
		}
		
	}

	public String getName() {
		return name;
	}

	

	public String getWeapon() {
		return weapon;
	}

	
	public int getHealth() {
		return health;
	}

	
	

}
