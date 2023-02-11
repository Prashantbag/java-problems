package com.ty.fruitlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FruitsListService {

	
	public static List addFruitsToList(String fruits) {
		
		String[] fruitSplit= fruits.split(",");
		
		boolean status=true;
		List fruitList= new ArrayList();
		
		for(int i=0;i<fruitSplit.length;i++) {
			if(!fruitList.contains(fruitSplit[i])) {
				
					fruitList.add(fruitSplit[i]);
				
			}else {
				System.out.println("Duplicate not allowed");
				break;
			}
			
		}
		System.out.println(fruitList);
		return fruitList;
	}
	
	public static int searchFruitInList(List fruitsList, String fruit) {
		boolean match=false;
		
		for(int i =0;i<fruitsList.size();i++) {
			String theStr=(String) fruitsList.get(i);
			char[] strSplit=theStr.toCharArray();
			
			for(int j=0;j<strSplit.length;j++) {
				if(strSplit[j]==fruit.charAt(j)){
					if(Character.isLowerCase(strSplit[j]) && Character.isLowerCase(fruit.charAt(j))) {
						System.out.println(theStr.charAt(j));
						System.out.println("true");
						match=true;
					}else if(Character.isUpperCase(strSplit[j]) && Character.isUpperCase(fruit.charAt(j))){
						System.out.println(theStr.charAt(j));
						match=true;
						System.out.println("true");
					
					}
					
				}else {
					match=false;
					break;
				}
			}
			
			
				if(match==false) {
					 continue;
				}else {
					
					return i;
				}
		}
		return -1;
	}
	
	public static int searchFruitInListIgnoreCase(List fruitsList, String fruit) {
		int index=0;
		for(int i =0;i<fruitsList.size();i++) {
			String str=(String) fruitsList.get(i);
				if(str.toLowerCase().equals(fruit.toLowerCase())) {
					index=i;
				}else {
					
					index=-1;
				}
		}
		return index;
	}
	
	
	public static void main(String[] args) {
		FruitsListService obj= new FruitsListService();
	
		String str="aPple,mango,Appale";
		List fruitsList =new ArrayList(Arrays.asList("apple","orange","guava"));
		//System.out.println(obj.addFruitsToList(str));
		//System.out.println(obj.searchFruitInList(fruitsList, "gUaVa"));
		System.out.println(obj.searchFruitInListIgnoreCase(fruitsList, "gUava"));
	}
}
