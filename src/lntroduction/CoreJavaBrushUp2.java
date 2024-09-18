package lntroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
//		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//		we want to print multiple of 2--->
//		for (int i =0; i<arr2.length; i++)
//		{
//			if(arr2[i] % 2 == 0)
//			{
//				System.out.println(arr2[i]);
//			}
//			else
//			{
//				System.out.println(arr2[i]+" is not multiple of 2");
//			}
//		}
		
//		We want to check is there any multiple of 2 is variable in arr2 or not-->
		
//		for (int i =0; i<arr2.length; i++)
//		{
//			if(arr2[i] % 2 == 0)
//			{
//				System.out.println(arr2[i]+" Yes this array has multiple values of 2");
//				break;
//			}
//	}
		
//		other way to define array dynamically---------------->
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("shetty");
		a.add("academy");
		a.add("Selenium");
//		System.out.println(a);
//		output->[Rahul,shetty,academy]
		
//		To extract element from array--->
//		System.out.println(a.get(2));
//		output->academy

//		To remove element from array---->
//		a.remove(0);
//		System.out.println(a);
//		output->[shetty,academy]
		
//		For loop on ArrayList class--->
//		for (int i=0 ; i<a.size() ; i++)
//		{
//			System.out.println(a.get(i));
//		}
		
//		Enhanced for loop---->
//		for (String val : a)
//		{
//			System.out.println(val);
//		}
		
//		To check any iteam present in array or not--->
//		System.out.println(a.contains("Selenium"));
//		output--> true
		
//		Convert Array to Arraylist----->
		String[] name = {"Rahul","Shetty","Academy","Selenium"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Selenium"));
//		output-> true
		
//		System.out.println(nameArrayList.get(1));
//		output-> Shetty
		
//		System.out.println(nameArrayList);
//		output->[Rahul, Shetty, Academy, Selenium]
		
//		for (int i = 0 ; i<nameArrayList.size(); i++)
//		{
//			System.out.println(nameArrayList.get(i));
//		}
//		output->Rahul
//		Shetty
//		Academy
//		Selenium

		
}
}