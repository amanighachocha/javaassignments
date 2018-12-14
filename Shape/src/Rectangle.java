
public class Rectangle extends Shape{
	private double width = 1.0;
	private double height = 1.0;
	
	public Rectangle(){}
	
	public Rectangle(double width, double height){
		setWidth(width);
		setHeight(height);
	}
	
	public Rectangle(double width, double height, String color, boolean filled){
		super(color,filled);
		setWidth(width);
		setHeight(height);
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getPerimeter(){
		return 2*(this.width + this.height);
	}
	
	public double getArea(){
		return this.width*this.height;
	}
	
	public String toString(){
		return "Rectangle(width = "+this.width+", height = "+this.height+")";
	}
}
