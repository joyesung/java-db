package day4월18일;
import java.util.*;
public class StdManager {

	private HashSet <Std> list = new HashSet<Std>();
	
	
	public boolean insert(Std s){
		Std tmp = new Std(s);
		return list.add(tmp);
	}
	
	public Std search(Std s){
		Iterator <Std> it = list.iterator();
		while(it.hasNext()){
			Std tmp = (Std)it.next();
			
			if(tmp.equals(s))
				return tmp;
		}
		
		return null;
	}
	
	public boolean delete(Std s){
		Std tmp = search(s);
		
		
		
		return list.remove(tmp);
	}
	
	
	
	
	public boolean update(Std s){
		if(!delete(s))
			return false;
		
			return insert(s);
		
	}
	
	
	public void print(){
		Iterator <Std> it = list.iterator();
		while(it.hasNext()){
			Std tmp = (Std)it.next();
			System.out.println(tmp);
		}
	
	}
	
	
	public void printMenu(){
		System.out.println("-------------");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 정보 수정");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 출력");
		System.out.println("5. 종료");
		System.out.println("-------------");
		System.out.println("메뉴를 입력해 주세요.");
	}
	
	public Std inputId(Scanner scan){
		System.out.println("정보를 입력하세요.");
		System.out.println("학번 : ");
		String id = scan.next().trim();
		Std tmp = new Std();
		tmp.setId(id);
		return tmp;
		
	}
	
	public Std inputStd(Scanner scan){
		Std tmp = inputId(scan);
		System.out.println("이름:");
		String name = scan.next();
		System.out.println("학교이름 :");
		String sName = scan.next();
		System.out.println("전공:");
		String major = scan.next();
		System.out.println("평점:");
		double avr = scan.nextDouble();
		System.out.println("-------------");
		tmp.setName(name);
		tmp.setSname(sName);
		tmp.setMajor(major);
		tmp.setAvr(avr);
		return tmp;
		
	}
	
	
}
