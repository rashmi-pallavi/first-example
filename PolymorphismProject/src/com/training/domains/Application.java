package com.training.domains;

import java.util.Scanner;

import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		
		ShowRoom showRoom = new ShowRoom();
		Automobile polyAuto = null;
		int key = 0;
		
		Scanner s = new Scanner(System.in);
		
		do{
		System.out.println("Enter your choice:");
		System.out.println("1. Passenger Car");
		System.out.println("2. Luxury Car");
		System.out.println("3. Sports Car");
		System.out.println("4. Exit");
		key = s.nextInt();
		if(key<3){
		polyAuto = showRoom.getItem(key);
		showRoom.printQuote(polyAuto);
		}
		else if(key==4)
			System.out.println("Thanks for visiting!");
		else
			System.out.println("Invalid Option!");
		}while(key<=4);
		
		

	}

}
