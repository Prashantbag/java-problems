package com.ty.mainimp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MobileShopMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of mObiles in shop:\n");
		int spec=sc.nextInt();
		
		List<Mobileshop> allMobile=new ArrayList<Mobileshop>();


		for (int mobile=0;mobile<spec;mobile++) {
			Mobileshop mobileSpec= new Mobileshop();
			System.out.println("Enter phone specifications: \n");
			System.out.println("Operating System");
			mobileSpec.setOperating_system(sc.next());
			System.out.println("Mobile RAM size");
			mobileSpec.setRam_size(sc.nextInt());
			System.out.println("Mobile Memory");
			mobileSpec.setMemory(sc.nextInt());
			System.out.println("Mobile price");
			mobileSpec.setPrice(sc.nextDouble());
			System.out.println("Mobile Rating");
			mobileSpec.setRating(sc.nextInt());
			
			allMobile.add(mobileSpec);
		}
		System.out.println("=========================");
		
		System.out.println("Enter number of user specifications per mobile:\n");
		int userSpec=sc.nextInt();
		List<UserRequirement> userSpecList=new ArrayList<UserRequirement>();
		
		for(int mobile=0;mobile<userSpec;mobile++) {
			UserRequirement userRequirement= new UserRequirement();
			System.out.println("Enter user requirement:\n");
			
			System.out.println("Operating System");
			userRequirement.setOperating_system(sc.next());
			System.out.println("Mobile RAM size");
			userRequirement.setRam_size(sc.nextInt());
			System.out.println("Mobile Memory");
			userRequirement.setMemory(sc.nextInt());
			System.out.println("Mobile price");
			userRequirement.setPrice(sc.nextDouble());
			
			userSpecList.add(userRequirement);
		}
		
		
			for (UserRequirement userRequirement2 : userSpecList) {
				for (Mobileshop mobileshop : allMobile) {
				if(mobileshop.getOperating_system().equals(userRequirement2.getOperating_system())  && mobileshop.getRam_size()==userRequirement2.getRam_size() && mobileshop.getMemory()==userRequirement2.getMemory()) {
					if(mobileshop.getPrice()<=userRequirement2.getPrice()) {
						System.out.println(mobileshop.getPrice());
						break;
					}
					
				}else {
					System.out.println(-1);
					break;
				}
			}
			
		}
		
		
		
	}
}
