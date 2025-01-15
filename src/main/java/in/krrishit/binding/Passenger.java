package in.krrishit.binding;

import lombok.Data;

@Data
public class Passenger {
	private String fname;
	private String lname;
	private String to;
	private String from;
	private  String doj;
	private String trainNum;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Passenger [fname=" + fname + ", lname=" + lname + ", to=" + to + ", from=" + from + ", doj=" + doj
				+ ", trainNum=" + trainNum + "]";
	}
	
	
	

}
