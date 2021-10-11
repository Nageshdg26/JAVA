package com.gun2;
public class Player_1 
{	
private String name;
private String weapon;
private int health;
public Player_1(String name, String weapon, int health) {
	super();
	this.name = name;
	this.weapon = weapon;
	this.health = health;
	
	if (health<0 || health>100) 
		this.health=100;
	else 
			this.health=health;
			
	
}

public void gun1()
{
	this.health -=30;
	if (this.health<=0) {
		this.health=0;
	}
	System.out.println("gun 1 shoted health reduced by 30" +" new health is "+ this.health);
	
if (this.health==0) {
	System.out.println(getName()+" is dead");
	
}

}
public void gun2()
{
	this.health -=40;
	if (this.health<=0) {
		this.health=0;
	}
	System.out.println("gun 2 shoted health reduced by 40" +" new health is "+ this.health);
	
if (this.health==0) {
	System.out.println(getName()+" is dead");
	
}
}

public void heal()
{
	if (this.health<=0) 
		System.out.println("Player is Dead!!!. heal not possible");
	else
		this.health=100;
	System.out.println("health is "+ this.health);
		
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
