
public class Circle {
   private double radius = 1.0;
   private String color = "Red";
   
   public Circle(){}
   
   public Circle(double radius, String color){
	   
   }

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}
	
	public String toString(){
		return "Circle[r="+this.radius+", color="+this.color+"]";
	}
}
