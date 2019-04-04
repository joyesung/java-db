
public class dat4월4일6 {
// public은 접근제한자 
//클래스에 public을 붙일 수 있는 경우는  단 하나다.
//클래스명과 파일명이 일치하는 경우에만 public을 붙일 수 있다.
// 접근제한자 : default
// 접근제한자 default 는 default라는 키워드를  쓴 것이 아니라 클래스나 메소드에 
// 접근제한자를 명시하지않은 경우를  default라한다.
// default는 같은 패키지안에서만 접근 가능하다.

	// 접근 제한자 - private
	// 일반적으로 맴버 메소드나 멤버 변수에 붙이고
	// 자신(해당맴버 멧드를 포함하는 클래스)을 제외한 다른 클래스에서 사용할 수 없다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = null;
		t= new Tv();// Tv()라는 생성자를 호출해서 객체를 생성 
		t.printvolumn();
		t.volumnDown();
		t.printvolumn();
		t.channelDown();
		t.channelUp();
		t.setchannel(0);
		
		
	
	}

}
class Tv{
	//일반적으로 맴버 변수는 접근제한자를 private로 설정하여
	//맴버 변수를 직적 수정할 수 없게 하고, 멤버 메소드를 통해 수정하도록 한다.
	//맴버 변수: 부품, 요소
	private int channel;
	private int volumn;
	private final int Max_CHANNEL = 100;
	private final int MAX_VOLUMN = 100;
	
	//맴버 메소드: 기능 
	//일반적으로 멤버 메소드는 접근제한자를 public으로 많이한다.
	//기능 :맴버변수 volumn의 크기를 하나 증가하는 메소드
	//매개변수 : 없다. => void (써도 되고 안써도 된다.매개변수가 없는경우)
	//리턴타입: 없다. => void
	//볼륨업
	//볼륨다운
	//채널업
	//채널다운
	//채널변경
	//
	
	
	
	public void volumnUp(){	
		if(MAX_VOLUMN > volumn)
		volumn ++ ;	
		}
		
	public void volumnDown(){	
		if(volumn>0)
		volumn -- ;	
	
	}
	public void printvolumn(){
		System.out.println(volumn);
	}
	
	
	
	
	
	
	public void channelUp(){
		if(channel <Max_CHANNEL )
			channel ++;
	}
	
	
	
	
	public void channelDown(){
		if(channel >0 )
			channel --;
	}
	
	
	
	
	public void setchannel(int ch){
		channel = ch;
	}
	
	
	
	
	
	
	
	
} 