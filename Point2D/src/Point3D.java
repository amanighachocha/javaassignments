
public class Point3D extends Point2D{
    public float z = 0.0f;
    
    public Point3D(float x, float y, float z){
    	super(x,y);
    	this.setZ(z);
    }

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x, float y, float z){
		setXY(x,y);
		setZ(z);
	}
	
	public String toString(){
		return "("+super.getX()+","+super.getY()+","+this.z+")";
	}
    
}
