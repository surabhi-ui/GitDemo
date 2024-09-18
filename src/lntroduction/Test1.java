package lntroduction;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WE are printing all that element of array which are staring from "A";
//		Agenda is same code we can write with the help of stream and it will looks more optimize than this(Test2.Java File) 
		ArrayList<String> names = new ArrayList<String>();
		names.add("Arav");
		names.add("Ashok");
		names.add("Vashu");
		names.add("Ansh");
		names.add("Dev");
//		
		int count = 0;
//		
		for(int i = 0; i<names.size(); i++) {
			String actual = names.get(i);
			if(actual.startsWith("A")) {
				count++;
//				
			}
			
		}
		System.out.println(count);
		
	}	
}
