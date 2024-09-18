package lntroduction;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
//		If we don't want to declare object then we have to use static keyword
		// TODO Auto-generated method stub
		 MethodsDemo3.getData();
//		 output->Surabhi Singh
		 
		 String name = MethodsDemo3.getUserData();
		 System.out.println(name);
//		 output->I will become a successful QA oneDay
	}

	public static void getData() {
		// TODO Auto-generated method stub
		System.out.println("Surabhi Singh");
	}
	
	public static String getUserData() {
		return "I will become a successful QA OneDay";
	}

}
