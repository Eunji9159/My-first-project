package ch03;

public class Ex3_4 {

	public static void main(String[] args) {
		int su=98;
		switch(su){
			case 3:
				System.out.println("2입니다");
				break;
			case 2:
				System.out.println("1입니다");
				break;
			case 1:
				System.out.println("0입니다");
				break;
			default :
				System.out.println("2~0사이의 값이 아닙니다");
		}
	}
}
