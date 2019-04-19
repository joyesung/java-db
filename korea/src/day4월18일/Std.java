package day4월18일;

public class Std {
	private String Sname = "";
	private String major = "";
	private double avr;
	private String id = "";
	private String name = "";
	public String getSname() {
		return Sname;
	}
	public String getMajor() {
		return major;
	}
	public double getAvr() {
		return avr;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAvr(double avr) {
		if(avr>0 || avr<4.5)
			return;
		this.avr = avr;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "학생 [대학교명=" + Sname + ", 전공명=" + major + ", 점수=" + avr + ", 학번=" + id + ", 이름=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Std other = (Std) obj;
		if (id ==null) {
			if(other.id != null)
				return false;	
		} else if (!id.equals(id))
			return false;
		return true;
	}
	
	
	public Std(){}
	
	
	public Std(Std s){
		this(s.name, s.Sname, s.major, s.id, s.avr);
	}
	
	
	
	public Std(String name, String Sname, String id, String major, double avr){
		this.avr = avr;
		this.id = id;
		this.major = major;
		this.name = name;
		this.Sname = Sname;
	}

	
	
	
	
	

	
	
	
	
}
