package lntroduction;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);

//		getUserData method called form MethodsDemo2 class
		MethodsDemo2 d1 = new MethodsDemo2();
		String name1 = d1.getUserData();
		System.out.println(name1);

	}

	public String getData() {
		System.out.println("Hello World");
		return "Rahul Shetty";
	}

}
