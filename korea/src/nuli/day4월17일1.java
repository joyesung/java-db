package nuli;

public class day4월17일1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Fruit> fBox = new FruitBox<>();
		//과일이 아닌 문자열 String이 들어가서 제한되기 때문에 안된다.
		//FruitBox<String> fBox2 = new FruitBox<>();
		
	}

}
//과일 클래스
class Fruit implements Eat{}
//과일 클래스를 상속받은 사과 클래스
class Apple extends Fruit{}
//과일 박스 지네릭 클래스
//Eat 인터페이스를 구현하고 Fruit클래스를 상속받은 클래스만
//타입변수 T로 올수 있다.
class FruitBox<T extends Fruit & Eat>{}

interface Eat{}


