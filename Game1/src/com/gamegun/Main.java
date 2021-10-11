package com.gamegun;

public class Main {

	public static void main(String[] args) {
		
		Player1 player= new Player1("kamy","sword" , 200);
//		System.out.println(player.getName());
//		System.out.println(player.getHealth());
//		System.out.println(player.getWeapon());

		
		player.damageByGun1();
		player.damageByGun2();
		player.damageByGun2();
		player.heal();
//		
		
//	Player2  proPlayer=new Player2("akshay", "MachineDescription gun", 80, false);	
//				proPlayer.damageByGun1();
//		Player2  proPlayer=new Player2("akshay", "MachineDescription gun", 80, true);	
//     	proPlayer.damageByGun1();
////     	proPlayer.damageByGun1();
////     	proPlayer.damageByGun1();
////     	
//     	proPlayer.heal();
//		
//     	
	}

}
