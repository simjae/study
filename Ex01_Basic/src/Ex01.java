
public class Ex01 {

	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		//����
		int lv = 100;//local
		System.out.println("lv �������� :" + lv);
		
		//Ex02_Variable 
		//javac Exo2_Variable.java >> Exo2_Variable.class ����
		//java Exo2_Variable ����
		//��Ŭ���� ���� ������ (ctrl +F11 ������ >>���� )
		//1.���������� �ݵ�� �ʱ�ȭ�� �ϰ� ���(������ ó������ �Ҵ� �ʱ�ȭ)
		//2.���>> main�� �Լ���(main�ȿ� ���� ������ �ʱ�ȭ�ʿ�) >>�ʱ�ȭ 

		int number = 0;//����� ���ÿ� �ʱ�ȭ 
		number = 100;
		number = 200; 
		System.out.println("number :" + number);
		
		int a ;// ���� 
		
		
		
	}
}


/* ������ ����Ǵ� ��ġ ( scope : ��ȿ���� )
1. instance variable :��ü���� >> class person {int age }
2. local varialbe �����߼� (���� : �Լ���) >> class person {public void run() {int speed }}
3. �Լ��ȿ� if �� , for ���ȿ� �ִ� ������ ���ȿ� ���� 
*

*/
class Test{
	int lv;//�ʱ�ȭ > 100
		//instance variable
		//�̺����� �ʱ�ȭ�� ���� �ʾƵ� �ȴ�(���������� �⺻�� : default)
	int window; //�⺻�� > 0
	//�ʱ�ȭ :������ ó�� ���� ���°� (�Ҵ��� ���ؼ�)
	//���� : window ������ �ʱ�ȭ�� �����ʾƵ� ��밡��???
	//window ����Ʈ�� â���� ���� 
	//hint ���赵�� �ϳ� ... ���赵�� ������� ����Ʈ�� ������ ... ����Ʈ ���� â���� ������ �ٸ� �� �ִ�
	//����Ʈ���� (��ü) â���� ������ �ٸ��� �������ڴ�. 
	
	//Test �Ｚ����Ʈ = new Test();
	//�Ｚ����Ʈ.window = 4;
	
	//Test �Ｚ����Ʈ = new Test();
	//�Ｚ����Ʈ.window = 2;
	
	
	Test(){// ������ �Լ�(Ư���� �Լ�) ��ü�� �����ɶ� �ڵ����� ȣ��Ǵ� �Լ� : ��ü������ ���ÿ� : constructor
		System.out.println("���� ������");
	
	}
	Test(int data){//�����ε� : overloading : �ϳ��� �̸����� �������� ����� ����
				   //�ڵ����� ȣ��Ǵ� �Լ� : ����Ʈ�� �������� 	
		window = data;//â���� ���� ���� �ʱ�ȭ 
		
	}
	void write() {//��� ���� method 
		int num;//����
		// local variable
		//The local variable num may not have been initialized
		//����� ���࿡ ���������� ����ϰ� �ʹٸ� ���� �ݵ�� �ʱ�ȭ�� �ض� ..
		//write �Լ��� ȣ��Ǹ� �����ǰ� �Լ��� ����Ǹ� �޸𸮰� ��������. 
		num = 100;
		System.out.println(num);
		
		int age =15; 
		//���������� ����ϱ����� �ݵ�� �ʱ�ȭ(���� �Ҵ��ϴ�����)�� �ؾ��Ѵ�.
		
	
	}
	
	void print() {
		//�ȿ��� age ������� (���Ұ�) �ٸ��Լ� .. ���ٺҰ� 
		//System.out.println(age);
		System.out.println(window);
	
	}
}
	
	
