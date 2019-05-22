package exam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean s1= false, s2= false;
		int cnt = 0;
		while(!(s1 || s2)){
			CardPack cp = new CardPack();
			//cp.show();
			ArrayList<Card> user = new ArrayList<Card>();
			ArrayList<Card> dealer = new ArrayList<Card>();
			for(int i=1; i<=7; i++){
				user.add(cp.give());
				dealer.add(cp.give());
			}
		
		
			//s1 = PockerRule.straight(user) == 3;
			//s1 = PockerRule.flush(user);
			//System.out.println(s1);
			//System.out.println(user);
			//System.out.println(PockerRule.pare(user));
			//System.out.println(user);
			//System.out.println(PockerRule.pare(dealer));
			//s2 = PockerRule.straight(dealer) == 2;
			//s2= PockerRule.flush(dealer);
			//System.out.println(s2);
			//System.out.println(dealer);
			
			s1 = PockerRule.fullHouse(user);
			System.out.println(s1);
			System.out.println(user);
			
			s2 = PockerRule.fullHouse(dealer);
			System.out.println(s2);
			System.out.println(dealer);
			cnt++;
		
		}
		System.out.println(cnt);
			
			
		
	}
	
	
}


/*���:�� ã�� �޼ҵ�
 *�Ű�����:ī�� ����Ʈ
 *����Ÿ��:0:�� ����,1:�����,2:�����(�� 2���̻�)
 * */
class PockerRule{
	public static int pare(ArrayList<Card> list){
		int pareCnt =0; //����� ����
		for(int i=0; i<list.size(); i++){
			int cnt = 0; //���� ������ ����
			for(int j=0; j<list.size();j++){
				if(list.get(i).getNum()==list.get(i).getNum()){
					cnt++;
				}
			}  
			if(cnt==2){
				pareCnt++;
			}
 		}
		return pareCnt/2;
	}
	public static int triple(ArrayList<Card>list){
		int tripleCnt = 0;
		for(int i=0; i<list.size();i++){
			int cnt = 0;
			for(int j=0; j<list.size();j++){
				if(list.get(i).getNum()==list.get(i).getNum()){
					cnt++;
				}
			}
			if(cnt==3){
				tripleCnt++;
			}
		}
		
		return tripleCnt/3;
	}
	//straight�� �޼ҵ� ���ӵ� ���ڰ� 5������ 
	/*�޼ҵ��:straight
	 * ���:���ӵȼ��ڰ� 5������ �Ǻ��ϴ� ���
	 * �Ű�����:ArrayList<Card>list
	 * ����Ÿ��: 
	 * */
	//0: ��Ʈ����Ʈ �ƴ�, 1: ��Ʈ����Ʈ,2:�齺Ʈ����Ʈ. 3:����ƾ
	public static int straight(ArrayList<Card>list){
		
		Collections.sort(list, new Comparator<Card>(){
			@Override
			public int compare(Card c1, Card c2){
				return c1.getNum()  - c2.getNum();
			}
			
		});
		//1�� �ִ��� üũ 
		boolean flag = false;
		boolean isStraight = false;
		for(int i=0; i<list.size()-3; i++){
			int straightCnt = 1;
			int std = list.get(i).getNum();
			if(std == 1){
			 flag = true;
			}
			for(int j=i+1; j<list.size();j++){
				if(std+straightCnt==list.get(j).getNum()){
					straightCnt++;
				}else if(std+straightCnt-1
					== list.get(j).getNum()){
					continue;
				}else{
					break;
				}
			}
			//����ƾ�� ���, 10,j,q,k
			if(straightCnt==4 && std==10 && flag){
				return 3;
			}
			if(straightCnt>=5 && std == 1)	return 2;
			if(straightCnt>=5) isStraight = true ;
		}
		if(isStraight){
			return 1;
		}
		return 0;
	}
	
	public static boolean flush(ArrayList<Card>list){
		int sCnt = 0;//�����̽� ����
		int cCnt = 0;//Ŭ�ι� ����
		int hCnt = 0;//��Ʈ ����
		int dCnt = 0;//���̾� ����
		for(int i=0; i<list.size();i++){
			if(list.get(i).getShape().equals("S")) sCnt++;
			else if(list.get(i).getShape().equals("H"))hCnt++;
			else if(list.get(i).getShape().equals("D"))dCnt++;
			else if(list.get(i).getShape().equals("C"))cCnt++;
		}
		if(sCnt >=5 || hCnt >=5 || dCnt >= 5 || cCnt >=5)
			return true;
		return false;
	}

		/*for(int shapeCnt =0, i=0; i<list.size();i++){
			for(int j=0; j<list.size()-1;j++){
				if(list.get(i).getShape().equals(list.get(j).getShape())){
					shapeCnt++;
				}
			}
				if(shapeCnt ==5) return true;
		}
			return false;
	}
	*/
		
	public static boolean fullHouse(ArrayList<Card>list){
		Collections.sort(list, new Comparator<Card>(){
			@Override
			public int compare(Card c1, Card c2){
				return c1.getNum()  - c2.getNum();
			}
			
		});
		if(pare(list)>=1 && triple(list) == 1)
			return true;
		if(triple(list) == 2)
				return true;
		return false;
	}
}

	


class CardPack{
	private ArrayList<Card> list = new ArrayList<Card>();

	public CardPack(){
		cardPackSetAll();
		shuffle();
	}
	/* ��� : ����� �־����� �ش� ����� 1��ī����� Kī����� �ѿ� �߰� */
	private void cardPackSet(String shape){
		for(int i=1; i<=13; i++){
			Card c = new Card();
			c.setNum(i);
			c.setShape(shape);
			list.add(c);
		}
	}
	public void cardPackSetAll(){
		list.clear();
		cardPackSet("S");
		cardPackSet("C");
		cardPackSet("H");
		cardPackSet("D");
	}
	public void show(){
		for(int i=0; i<list.size();i++){
			System.out.print(list.get(i) + " ");
			if( (i+1)% 10 == 0){
				System.out.println();
			}
		}
	}
	public void shuffle(){
		Collections.shuffle(list);
	}
	public Card give(){
		if(list.size() != 0){
			Card c = new Card(list.get(0));
			list.remove(0);
			return c;
		}else{
			return null;
		}
	}
}










class Card{
	private int num;
	private String shape;
	public int getNum() {
		return num;
	}
	public String getShape() {
		return shape;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		String s = new String();
		if(shape.equals("S")){
			s += "��";
		}else if(shape.equals("H")){
			s += "��";
		}else if(shape.equals("C")){
			s += "��";
		}else if(shape.equals("D")){
			s += "��";
		}

		if(num == 11)	s+="J";
		else if(num == 12)	s+="Q";
		else if(num == 13)	s+="K";
		else
			s+=num;
		return s;
	}
	public Card(){}
	public Card(Card c){
		this.num = c.num;
		this.shape = c.shape;
		
	}
}