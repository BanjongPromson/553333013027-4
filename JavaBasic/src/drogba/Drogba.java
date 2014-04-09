package drogba;

import java.util.Arrays;

public class Drogba {

	private String name;
	private String position;
	private String friend[];
	
public static void main(String[] args) {
		
		Drogba na = new Drogba();
		
		String name = na.getname();
		String position = na.getposition();
		String friend[] = na.getfriend();
		
		System.out.println("Name     : "+name);
		System.out.println("Position : "+position);
		System.out.println("friend   : "+Arrays.toString(friend));
		
}
	

	   
	public Drogba(){
		name = "Drogba";
		position = "cf";
		friend = new String[]{"Yaya Toure , Wesley Sneijder , Michael Essien"};
	}
	public String getname(){
		return name;
	}
	public String getposition(){
		return position;
	}
	public String[] getfriend(){
		return friend;
		
	}
	
	
}