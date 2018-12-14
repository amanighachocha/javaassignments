
public class Time {
    private int second = 0;
    private int minute = 0;
    private int hour = 0;
    
    public Time(){}
    
    public Time(int second, int minute, int hour){
    	this.setSecond(second);
    	this.setMinute(minute);
    	this.setHour(hour);
    }

	public int getSecond() {
		return second;
	}

	public int getMinute() {
		return minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public String toString(){
		String string = "";
		if(this.hour < 10){
			string += "0"+this.hour;
		}else{
			string += this.hour;
		}
		if(this.minute < 10){
			string += ":0"+this.minute;
		}else{
			string += ":"+this.minute;
		}
		if(this.hour < 10){
			string += ":0"+this.second;
		}else{
			string += ":"+this.second;
		}
		return string;
	}
	
	public void setTime(int second, int minute, int hour){
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	public Time nextSecond(){
		return new Time(this.second + 1, this.minute, this.hour);
	}
}
