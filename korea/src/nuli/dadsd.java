package nuli;

public class dadsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new A(){
			public void test(){
				System.out.println("test");
			}
		
		});
	}
	public static void print(A a){
		a.test();
	}
}
interface A{
	void test();
}
class B implements A{
	public void test(){}
}
