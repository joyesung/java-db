package korea;

public  class  Tv {
	//일반 맴버 변수 , 객체 멤버 변수 
	private int channel;
	private int volunm;
	private final int MAX_CHANNEL = 500;
	private final int MAX_VOLUNM = 100;
	
	//static이 붙으면 클래스 멤버 메소드 ,멤버변수
	public static final String BRAND = "삼성";
	
	
	//일반 맴버 메소드, 객체 맴버 메소드
	public void channelUp(){
		if(channel < MAX_CHANNEL)
			channel++;
	}
	public void channelDown(){
		if(channel>1)
			channel--;
	}
	public void setChannel(int ch){
		if(ch == 0)
			channel = 1;
		else if(ch > MAX_CHANNEL)
			channel = MAX_CHANNEL;
		else
			channel = ch;
	}
	
	public void volunmUp(){
		if(MAX_VOLUNM > volunm)
			volunm++;
	}
	public void volunmDown(){
		if(volunm > 0)
			volunm --;
	}
	public void printVolunm(){
		System.out.println("현재 소리 크기 : +volunm");
	}
	public void printChannel(){
		System.out.println("현재 채널 번호 : + channel");
		
		
		
	}
}
