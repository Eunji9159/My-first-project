package ch03;

public class Ex3_3 {

	public static void main(String[] args) {
		// 1���� if���� else if�� else���� ���� �� �ִµ�
		// else if���� 0�� �̻�
		// else���� 0 �Ǵ� 1�� 
		// 1���� ������ �����ϴ� ���� ������ �ϰ� ����������
		
		// su=5; 
		// su�� ����̸� "����Դϴ�"���
		// su�� �����̸� "�����Դϴ�"���
		int su=10;
		if(su>0){
		System.out.println("����Դϴ�");
		}
		if(!(su>0)){
		System.out.println("�����Դϴ�");
		}
		System.out.println("------------------------");
		if(su>0){
			System.out.println("0����Ů�ϴ�");
		}else{
			System.out.println("0����Ů�ϴٰ� �����Դϴ�");
		}
		System.out.println("------------------------");
		if(su>0){
			System.out.println("0����Ů�ϴ�");
		}
		//���� ������ �������� �ʰ� �׸��� su>-1�� �����ϴ�
		if( !(su>0) && su>-1){
			System.out.println("0�Դϴ�");
		}
		if(su<0){
			System.out.println("0���� �۽��ϴ�");
		}
		System.out.println("------------------------");
		if(su>0){
			System.out.println("0����Ů�ϴ�");
		}else if(su>-1){
			System.out.println("0�Դϴ�");
		}else{
			System.out.println("0�����۽��ϴ�");
		}
	}
}
