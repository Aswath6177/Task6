package task6;

public class Circle {
double radius;
double pi=3.14;
double d;
double c;


public Circle()
{
	radius=2;
	
}

public Circle(double radius) {
	this.radius=radius;
	
}

public double circumference() {
	return 2*pi*radius;
}

public static void main(String[] args) {
	Circle obj=new Circle();
	System.out.println("Radius without arguments"+obj.circumference());
	
	Circle obj2=new Circle(3.0);
	System.out.println("Radius with arguments"+obj2.circumference());

	
}
}
