
public class Circle extends Shape{
	private double radius = 1.0;
	
	public Circle(double radius){
		setRadius(radius);
	}
	
	public Circle(double radius, String color, boolean filled){
		super(color,filled);
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter(){
		return 2*Math.PI*this.radius;
	}
	
	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}
	
	public String toString(){
		return "Circle(radius = "+this.radius+")";
	}
}
