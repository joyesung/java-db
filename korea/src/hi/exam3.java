package hi;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� 7�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���.
		int num =7;
		int i;
		//�Ҽ��� ����� 1�� �ڱ��ڽŸ� �ִ� ��
		//���� ����� 1�� �ڱ��ڽ��� �����ϸ� 0���̴�
		for(i=2; i<num; i++){
			if(num%i==0){
				break;
			}
		}
		if(i!=num){
			System.out.println(num+"��  �Ҽ��� �ƴմϴ�");
		}else{
			System.out.println(num+"�� �Ҽ�");
		}
	}

}
