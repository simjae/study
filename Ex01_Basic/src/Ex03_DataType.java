/*
 1.�ڹٰ� �����ϴ� �⺻ Ÿ�� (�ý���Ÿ��) �ڷ���>>8���� 
 2.8���� �⺻Ÿ���� [���� ����]�ϴ� ����
 3.���� >> ���� >> [���� ���� , 0 , ��������) >> byte (-128 ~127)
 									  >> char (�ѹ��ڸ� ǥ���ϴ� Ÿ��) >> 'A','��'
 									  >> �ѱ� 1�� 2byte 
 									  >> ������ , Ư������ , ����1byte
 									  >> ���� >> char(2byte)(�ѱ�, ����, Ư������, ����) ������� �ѱ��� 
 									  >> ������ ���� (unicode)>>�ƽ�Ű �ڵ�ǥ
 									>> short(c����� ȣȯ�� 2byte)
 							  		>> int (-21�� ~ 21�� : 4byte) *** Java ������ ������ �⺻Ÿ��***
 									>>long (8byte)
 	>>�Ǽ�(�ε��Ҽ���) 					>>float (4byte)
 									>>double(8byte) >> ���е� (ǥ�������� ũ��)*** Java �Ǽ� ������ �⺻Ÿ���̴�.
 ��  >> ��, ���� ture, false 			>> boolean (���α׷��� ������ ǥ�� �帧����)
 
 								
 *** ���ڿ��� ǥ�� >> "ȫ�浿" , Hello"
 String name = "ȫ�浿"
 �׷����� �ұ��ϰ�... 
 �ٸ� �̾߱⸦ �ϱ������� String ���ڿ��� ������ �ִ� Ÿ�� 
 int, double ó�� ����ϼ���
 �׷��� ���� ����ؿ�.. ��а��� 									  
 						
 									  
�ڹٴ� ũ�� 
1.�� Ÿ��                  : 8���� �⺻Ÿ�� :int i =100; int j = i;                ->vlaue type
2.���� Ÿ��(�ּҰ�)   : Ŭ���� , �迭, ������ ���� ����Ǵ� ���� �ƴ϶� �ּҰ� ����(������) ->ref type 
 									  
 									  
 									  
 */
//class == ���赵 == Ÿ�� (type)
class Car{ //Car Type �̴�, Car ���赵�̴�. >> ��üȭ�� �깰 >> ��üȭ (�޸�)
	String color; //instance 
	int window;
}




public class Ex03_DataType {

	public static void main(String[] args) {
		String str = "ȫ�浿";
		int age =100;
		
		Car c;//c�� main �Լ��ȿ� �ִ� ���� ���� 
		//System.out.println(c); �������� �ʱ�ȭ  x
		// c��� ������ �ʱ�ȭ >> �ּҸ� ������ �ϴ°� >>new �����ڸ� ���ؼ� ������� �ּҰ� �Ҵ�ǰ� �ϴ°� 
		c = new Car();
		System.out.println(c);//Car@15db9742
		
		//����� �ʱ�ȭ 
		//�������� �ʱ�ȭ�� �ּҰ��� ���´�. 
		Car c2 =  new Car();
		c2.window = 100;
		c2.color = "blue";
		//System.out.println(c2);
		//System.out.println(c2.window);
		//System.out.println(c.window);
		
		int i = 10;
		int j = 20;
		j = 20;
		
		int k;
		k = j;//POINT[�� �Ҵ�]
		System.out.println("k:" + k );
		k = 300;
		System.out.println("k:" + j );
		System.out.println("j:" + j );
		
		
		//int p,g,q;
	
		// �̷������ Array :int[] arr = new int[3];
		
		//int(-21�� ~21�� )
		//Today Point
		//literal >>�ִ� �״�� 
		//���� ���ͷ� : [�⺻�� default int ����******] 
		//int p = 3100000000;
		long l = 3100000000L;// ���̻翩�� ����
		long l2 =100; // int ���� �������� ���� 
		
		//int p2 = 100000000L;  //Type mismatch: cannot convert from long to int(��ȯ�Ұ�)
		
		
		//char : 2byte ������ 
		//�ѹ��ڸ� ǥ���ϴ� �ڷ��� 
		//Today Point /
		//���ڿ� : "��", "ȫ�浿" >> String str  = "�����ٶ󸶹� "
		//���� (��):'A'	>> char ch = 'A'
		char single = '��';
		System.out.println(single);
		char ch = 'A';
		System.out.println(ch);	
		//char ���ڸ� ���������� ���������� �������� �������ִ� (�ƽ�Ű�ڵ�ǥ)
		//casting(Ÿ�Ժ�ȯ)
		int intch ='A';// ���������� �ڵ�(�Ͻ���)����ȯ
		System.out.println("intch : " + intch);
		
		System.out.println((int)ch);
		
		char ch2 ='a';
		System.out.println(ch2);
		int intch2  = (int)ch2;
		System.out.println(intch2);
		
		
		int intch3 = 65;
		char ch3 = (char)intch3;
		System.out.println(ch3);
		
		//��������[���� �������� ���� ������ Ÿ���� ����]
		//������ ����ȯ (����� ����ȯ) >> (char),(int)
		//Key Point : 65��� ���ڰ� char Ÿ�� ���ϴ� ��� (������ �ս� ���� �Ҵ�) 
		//int intch3 = 99999999;
		//ū���� ���������� ���� [������ �ս�]
		
		int intch4 = ch3; // ����ȯ..�ڵ�����.. �����Ϸ� 
		//�ڵ�����ȯ
		//int intch4 =(int)ch3 �����Ϸ��� �ڵ� �����
		System.out.println(intch4);
		
		
		
	}

}












