package com.ty.mainimp;

public class Mobileshop {
	private String operating_system;
	private int ram_size;
	private int memory;
	private double price;
	private int rating;
	public String getOperating_system() {
		return operating_system;
	}
	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}
	public int getRam_size() {
		return ram_size;
	}
	public void setRam_size(int ram_size) {
		this.ram_size = ram_size;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Mobileshop [operating_system=" + operating_system + ", ram_size=" + ram_size + ", memory=" + memory
				+ ", price=" + price + ", rating=" + rating + "]";
	}
	
	
}
