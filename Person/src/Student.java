
public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name,String address,String program, int year, double fee){
		super(name,address);
		setProgram(program);
		setYear(year);
		setFee(fee);
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String toString(){
		return "Student[name="+this.name+", address="+super.getAddress()+", program="+this.program+", year="+this.year+", fee="+this.fee+"]";
	}
}
