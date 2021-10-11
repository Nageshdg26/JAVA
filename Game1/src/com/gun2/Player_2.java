package com.gun2;

public class Player_2  extends Player_1{
	private boolean armour;
	private int health;
	public Player_2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		this.armour = armour;
		this.health=health;
	}

	
	public void gun1() {
		if (armour) 
			this.health -=20;
		if (this.health <=0)
			this.health=0;
		else
			System.out.println("armour is on, got hit gun 1. health is reduced by 20 ." + " new health is "+ this.health);
		
		
		
		if (!armour) {
			this.health -=30;
			if (this.health <=0) 
			this.health=0;	
			else 
				System.out.println("armour is on, got hit gun 1. health is reduced by 30 ." + " new health is "+ this.health);
			}
		
		if (this.health==0) {
			System.out.println(getName()+" is dead");
		}
		
		}
	
	
	public void gun2() {
	if (armour) 
		this.health -=40;
	if (this.health <=0)
		this.health=0;
	else
		System.out.println("armour is on, got hit gun 1. health is reduced by 40 ." + " new health is "+ this.health);
	
	
	
	if (!armour) {
		this.health -=50;
		if (this.health <=0) 
		this.health=0;	
		else 
			System.out.println("armour is on, got hit gun 1. health is reduced by 50 ." + " new health is "+ this.health);
		}
	
	if (this.health==0) {
		System.out.println(getName()+" is dead");
	}
	
	}


	@Override
	public void heal() {
		// TODO Auto-generated method stub
		super.heal();
	}
		
		
	
	
	

}
