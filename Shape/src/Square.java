
public class Square extends Rectangle{

	public Square(){}
	
	public Square(double side){
		super.setWidth(side);
		super.setHeight(side);
	}
	
	public Square(double side, String color, boolean filled){
		super(side,side,color,filled);
	}
	
	public double getSide(){
		return super.getHeight();
	}
	
	public void setSide(double side){
		super.setWidth(side);
		super.setHeight(side);
	}
	
	public void setWidth(double side){
		super.setWidth(side);
	}
	
	public void setLength(double side){
		super.setHeight(side);
	}
	
	public String toString(){
		return "Square[side = "+this.getSide()+"]";
	}
}
