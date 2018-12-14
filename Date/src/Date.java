
public class Date {
    private int year;
    private int month;
    private int day;
    
    public Date(int year, int month, int day){
    	this.year = year;
    	this.month = month;
    	this.day = day;
    }
    
    public int getYear(){
    	return this.year;
    }
    
    public int getMonth(){
    	return this.month;
    }
    
    public int getDay(){
    	return this.day;
    }
    
    public void setYear(int year){
    	this.year = year;
    }
    
    public void setMonth(int month){
    	this.month = month;
    }
    
    public void setDay(int day){
    	this.day = day;
    }
    
    public String toString(){
    	String string = "";
		if(this.month < 10){
			string += "0"+this.month;
		}else{
			string += this.month;
		}
		if(this.day < 10){
			string += "/0"+this.day;
		}else{
			string += "/"+this.day;
		}
		if(this.year < 10){
			string += "/0"+this.year;
		}else{
			string += "/"+this.year;
		}
		return string;
    }
    
    public void setDate(int year, int month, int day){
    	this.year = year;
    	this.month = month;
    	this.day = day;
    }
}
