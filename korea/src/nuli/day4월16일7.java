package nuli;

import java.util.HashSet;

public class day4월16일7 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		HashSet set = new HashSet();//해시셋은 해당하는 객체의 이콜스를 호출한다.
		//set에서 중복 확인은 해당하는 객체의 이콜스에서 
		// 해당객체에 이콜스가 없으면 오브젝트에의 이콜스를 호출한다
		//이콜스의객체는 주소를 비교한다.
		// 문자열 abc를  set에 여러번 추가하면 추가할때마다
		//String 클래스의 오버라이딩된 equals()와 hashCode()가
		// 호출이 되어 같은지 다른지 비교하여 같은 문자열이면
		// 추가를 하지 않음
		set.add("abc");
		set.add("abc");
		//동일한 값을 가지는 person 클래스의 객체를 여러개 만드어서
		//추가하면 Person클래스에 오버라이딩된 equals()와
		//hashCode()를 차즌데 없으면 Object클래스에 있는
		//equals()와 hashCode()를 찾아 사용한다.
		//이때 Object 클래스의 equals()는 주소값이 같아야
		// 같은 객체로 판별하므로 아래 예제처럼 갑이 같은 두 객체라도
		// 다른 객체로 판별해서 set에 각각 저장된다.
		set.add(new Person1("David",10));
		set.add(new Person1("David",10));
		
		System.out.println(set);
	}

}
class Person1{
	String name ;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person1 other = (Person1) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	int age;
	
	Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name + ":" + age;
	}
}