package ch03;

public class Ex3_3 {

	public static void main(String[] args) {
		// 1개의 if문은 else if문 else문을 갖을 수 있는데
		// else if문은 0개 이상
		// else문은 0 또는 1개 
		// 1개의 조건을 만족하는 순간 실행을 하고 빠져나간다
		
		// su=5; 
		// su가 양수이면 "양수입니다"출력
		// su가 음수이면 "음수입니다"출력
		int su=10;
		if(su>0){
		System.out.println("양수입니다");
		}
		if(!(su>0)){
		System.out.println("음수입니다");
		}
		System.out.println("------------------------");
		if(su>0){
			System.out.println("0보다큽니다");
		}else{
			System.out.println("0보다큽니다가 거짓입니다");
		}
		System.out.println("------------------------");
		if(su>0){
			System.out.println("0보다큽니다");
		}
		//위에 조건을 만족하지 않고 그리고 su>-1를 만족하는
		if( !(su>0) && su>-1){
			System.out.println("0입니다");
		}
		if(su<0){
			System.out.println("0보다 작습니다");
		}
		System.out.println("------------------------");
		if(su>0){
			System.out.println("0보다큽니다");
		}else if(su>-1){
			System.out.println("0입니다");
		}else{
			System.out.println("0보다작습니다");
		}
	}
}
