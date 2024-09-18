package lntroduction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();//--->equation 1
		names.add("Arav");
		names.add("Ashok");
		names.add("Vashu");
		names.add("Ansh");
		names.add("Dev");
		long d = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(d);	
		
//		Print all the name of string which size is greater than 4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
//		print all the element of array
		names.stream().forEach(s->System.out.println(s));		
		
//		Instead of creating a collection and convert in stream we can , we can directly create a stream with stream API
//		When we will declare  more than one lambda expression we will write in {}
		long x = Stream.of("Anand","Al-Khail","Dom","Patliputra","Amsterdam","Auckland").filter(s->
		{	
			return s.startsWith("A");	
		}).count();
		System.out.println(x);
		
//		we want to print only one name which has length greater than 4
		Stream.of("Ashi","Alakhya","Ashoka","Anjama").filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
//		MAP
		Stream.of("Arbha","Anuja","Anshi","Abhi").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
//		If there will be no any condition like last latter should be a, then we can use map directly for upperCase EX->
		Stream.of("Abhi","Surabhi","Aaman","Ambhi").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
//		We want to print array as sorted order start with "A" there is another terminal operation known as sorted() as we seen limit(1)
	     List<String> name = Arrays.asList("Atif","Surabhi","Ajrola","Ambhi");
	     name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
	     
//	     Print the values of list as sorted form (We want to sort all the value without any condition)
	     List<String> array = Arrays.asList("Volvo","BMW","Ford","Mazda");
	     array.stream().sorted().forEach(s->System.out.println(s));
	     
//	     There is one method in Stream with the help of that we can merge two Array {we will use name and array ArrayList to merge}
	     Stream.concat(name.stream(), array.stream()).forEach(s->System.out.println(s));
	     
//	     we can do like storing in a variable also , we can sort also
	     Stream<String> newStream = Stream.concat(name.stream(), array.stream());
//	     newStream.sorted().forEach(s->System.out.println(s));
	     
//	     So now we want to check weather BMW is present or not in concatenate array List , If present then return True otherwise false
	     boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("BMW"));
	     System.out.println(flag);//Print TRue
	     Assert.assertTrue(flag);//TestCase is Pass
//	     We can use Filter but the return type of filter is string not boolean and we want pass true or false value, Thats why used anyMatch()
//	     method instead of filter
	     
// If we want to print any string present in Array list then we can use filter but keep in mind without termination there is no meaning of filter
	   name.stream().filter(s->s.equalsIgnoreCase("Atif")).forEach(s->System.out.println(s));
//Thats why we used anyMatch for boolean if given string will match and present in array then it will return true and pass the test case
//If not present then , it will through False and fail the test case, But we we want to print given string which is present in array list then we
//we can use filter but if given string will not present in array list then filter will print nothing
	   
//	   COLLECT method (we have written in my noteBook for some information check that once also)
	   List<String> list = Stream.of("Arbha","Anuja","Anshi","Abhi").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
	     System.out.println(list.get(0));//print the first value of array (index 0)
//	     so we can do this with the terminal method limit(), after all the manipulation. limit(1) will print the first value
//	     trainer wants to aware to use about collect method 
	     
	     
//	     Interview question
//	    (3,2,2,7,5,9,1,8,5);
//	     1-> print unique nos of array 
//	     2->sort the array and print 3rd value of sorted array
	     
//	     first i will convert this array to list
	     List<Integer> unique = Arrays.asList(3,2,2,7,5,9,1,8,5);
//	    covert in stream and apply distinct method which is for unique value
	     unique.stream().distinct().forEach(s->System.out.println(s));
	     List<Integer> sort = unique.stream().distinct().sorted().collect(Collectors.toList());//for sort first we will distinct and then sort and then
//	     use collect method to convert in list again and will use get(index) for get 2rd index of sorted list
	     System.out.println(sort.get(2));
	     
	     
	}
	

}
