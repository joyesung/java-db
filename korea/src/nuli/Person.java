package nuli;

public class Person {
	//이름, 나이, 생일,성별,주소,국적,

	private String name;
	private int age;
	private String birthsDay;
	private String gender;
	private String Nationality;
	private String Address;
	public String getAddress() {
		return Address;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBirthsDay() {
		return birthsDay;
	}
	public String getGender() {
		return gender;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age>=0)
		this.age = age;
	}
	public void setBirthsDay(String birthDay) {
		if(birthDay == null || birthDay.length()!=8)
			return;
		//yyyyMMDD
		//substring : 부분 문자열 추출로 4번지와 5번지를 추출
		String sMonth = birthDay.substring(4,6);//subString은 부분 문자열을 호출하는것이다.
		//Integer는 정수형 클래스이다. 문자열 12를 정수 12로변경
		Integer month= Integer.parseInt(sMonth);
		if(month>=1 && month <=12)
		this.birthsDay = birthDay;
	}
	public void setGender(String gender) throws Exception {
		if(gender == null)
			throw new Exception("객체가 null값 입니다.");
		if(gender != null &&(gender.equals("남자")
			|| gender.equals("여자")))
		this.gender = gender;
	}
	public void setAddress(String address) {
		Address = address;
	} 
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public Person(){
	//이름,나이,생일,성별,주소,국적	
		this("","","","남자","20000101",1);
	}
	public Person(Person p){
		this(p.name,p.Address,p.Nationality,p.gender,p.birthsDay,p.age);
	}
	public Person(String name,String address,String nationality,
			String gender,String birthday,int age){
		this.name=name; this.Address=address;
		this.Nationality=nationality; this.age=age;
		try{
			setGender(gender);
		}catch (Exception e) {
			this.gender = "남자";
		}
		setBirthsDay(birthday);
	}
}
