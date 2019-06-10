package exam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean s1=false, s2 = false;
		int cnt = 0;
		
		while( cnt < 10){
			CardPack cp = new CardPack();
			ArrayList<Card> user = new ArrayList<Card>();
			ArrayList<Card> dealer = new ArrayList<Card>();
			for(int i=1; i<=7; i++){
				user.add(cp.give());
				dealer.add(cp.give());
			}
			//System.out.println(PockerRule.pare(user));
			//s1 = PockerRule.straight(user) == 3;
			//s1 = PockerRule.flush(user);
			s1 = PokerRule.straightflush(user) >= 1;
			//s1 = PokerRule.straightFlush(user) >= 1;
			//s1 = PokerRule.poker(user);
			System.out.println(s1);
			System.out.println(user);
			//s1 = PokerRule.top(user);
			//System.out.println(s1);
			System.out.println("���� ī�� :" + user);

			//System.out.println(PockerRule.pare(dealer));
			//s2 = PockerRule.straight(dealer) == 3;
			//s2 = PockerRule.flush(dealer);
			s2 = PokerRule.straightflush(dealer) >= 1;
			//s2 = PokerRule.straightFlush(dealer) >= 1;
			//s2 = PokerRule.poker(dealer);
			System.out.println(s2);
			System.out.println(dealer);
			//s2 = PokerRule.top(dealer);
			//System.out.println(s2);
			System.out.println("���� ī�� :" + dealer);
			int win = PokerRule.whoIsWin(user, dealer); 
			if(win == 1){
				System.out.println("���� �¸�!");
			}else if(win == -1){
				System.out.println("���� �¸�!");
			}else{
				System.out.println("���º�!");
			}
			cnt++;
			System.out.println("-----------------------------");
		}
		System.out.println(cnt);
	}
}


/*���:�� ã�� �޼ҵ�
 *�Ű�����:ī�� ����Ʈ
 *����Ÿ��:0:�� ����,1:�����,2:�����(�� 2���̻�)
 * */
class PokerRule{
	private static int sameCnt(ArrayList<Card> list, int count){
		int sCnt = 0; //����� ����
		for(int i=0; i<list.size(); i++){
			int cnt = 0;	//���� ������ ����
			for(int j=0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == count){
				sCnt++;
			}
		}
		return sCnt/count;
	}
	/* ��� : �� ã�� �޼ҵ�
	 * �Ű����� : ī�� ����Ʈ
	 * ����Ÿ�� : 0 : ������, 1 : �����, 2 : �����(�� 2���̻�)
	 * */
	public static int triple(ArrayList<Card> list){
		return sameCnt(list,3);
	}
	public static int pare(ArrayList<Card> list){
		return sameCnt(list,2);
	}
	public static boolean poker(ArrayList<Card>list){
		if(sameCnt(list,4) == 1)
			return true;
		return false;
	}


	
	// 0:��Ʈ����Ʈ �ƴ�, 1 : ��Ʈ����Ʈ, 2 : �齺Ʈ����Ʈ, 3:����ƾ
	public static int straight(ArrayList<Card>list){
		//ī�� ����Ʈ�� ���� 
		Collections.sort(list, new Comparator<Card>(){
			@Override
			public int compare(Card c1, Card c2) {
				return c1.getNum()  - c2.getNum();
			}
		});
	
		boolean flag = false; //1�� �ִ��� üũ�ϴ� ����
		boolean isStraight = false;
		for(int i=0; i<list.size()-3; i++){
			int straightCnt = 1;
			int std = list.get(i).getNum();
			if(std == 1){
				flag = true;
			}
				
			for(int j=i+1; j<list.size(); j++){
				if(std+straightCnt == list.get(j).getNum()){
					straightCnt++;
				}else if(std+straightCnt-1 
						== list.get(j).getNum()){
					continue;
				}else{
					break;
				}
			}
			//����ƾ�� ���, 10,j,q,k
			if(straightCnt == 4 && std == 10 && flag){
				return 3;
			}
			if(straightCnt >= 5 && std == 1 ) return 2;
			if(straightCnt >= 5 ) isStraight = true; 
		}
		if(isStraight){
			return 1;
		}
		return 0;
	}
	public static String flush(ArrayList<Card> list){
		int sCnt = 0;//�����̽� ����
		int cCnt = 0;//Ŭ�ι� ����
		int hCnt = 0;//��Ʈ ����
		int dCnt = 0;//���̾� ����
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getShape().equals("S")) sCnt++;
			else if(list.get(i).getShape().equals("H")) hCnt++;
			else if(list.get(i).getShape().equals("D")) dCnt++;
			else if(list.get(i).getShape().equals("C")) cCnt++;
		}
		if(sCnt >= 5) return "S";
		if(hCnt >= 5) return "C";
		if(dCnt >= 5) return "D";
		if(cCnt >= 5) return "H";
			return null;
		
	}
	public static boolean fullHouse(ArrayList<Card>list){
		if(pare(list)>=1 && triple(list) == 1)
			return true;
		if(triple(list) == 2)
			return true;
		return false;
	}
	public static int straightflush(ArrayList<Card>list){
		String s = flush(list);
		ArrayList<Card> tmp = new ArrayList<>();
		//ī�帮��Ʈ�� �÷��ð� �ƴϸ� ��Ƽ���� ���̻� ���� �ʿ䰡 ����.
		if(s == null)
			return 0;
		//ī�� ����Ʈ�� ���� => �÷��ð� �ƴ� ī����� �����ؾ��ϱ� ������
		tmp.addAll(list);
		//����:0 ������:6 ��������:++
		//����:6 ������:0 ��������:--
		for(int i=tmp.size()-1; i>=0; i--){
			if(!tmp.get(i).getShape().equals(s)){
				tmp.remove(i);
			}
		}
		return straight(tmp);
	}
	public static boolean top(ArrayList<Card>list){
		//�����, �����, Ʈ����, Ǯ�Ͽ콺, ��Ŀ üũ
		if(sameCnt(list,1)!=7) return false;
		// ��Ʈ����Ʈ üũ
		if(straight(list)!=0)  return false;
		//�÷��� üũ
		if(flush(list)!=null)  return false;
		
		return true;// top�̴ٶ�� �˷��ִ� ��
	}
	public static int score(ArrayList<Card>list){
		if(straightflush(list) == 3) 	return 1;
		if(straightflush(list) == 2) 	return 2;
		if(straightflush(list) == 1) 	return 3;
		if(poker(list))					return 4;
		if(fullHouse(list))				return 5;
		if(flush(list)!= null)			return 6;
		if(straight(list)==3)			return 7;
		if(straight(list)==2)			return 8;
		if(straight(list)==1)			return 9;
		if(triple(list) >= 1)			return 10;
		if(pare(list)>=2)				return 11;
		if(pare(list)==1)				return 12;
		return 13;
	}
	public static int whoIsWin(ArrayList<Card> user1, ArrayList<Card> user2){
		int u1 = score(user1);
		int u2 = score(user2);
		if( u1 < u2 )	return 1;
		if( u1 > u2)	return -1;
		return 0;
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
 











