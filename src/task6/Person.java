package task6;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age ){
		this.name=name;
		this.age=age ;
		}
	public String getname() {
		return this.name;
		
	}
	
	public int getage() {
		return this.age;
	}
	
	public static void main (String[] args) {
		Person obj = new Person("Aswath",23);
		
		System.out.println("The name  of the person is " +obj.getname());
		
		System.out.println("The  age  of the person is " +obj.getage());
				
	}
	
	

}
