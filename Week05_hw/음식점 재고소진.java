package Week05_hw;

import java.util.Scanner;

public class Store {
	//필드 선언
	int food;
	//리턴값이 없는 메소드
	void setStore(int food) {
		this.food = food;
	}
	
	boolean Open() {
		if(food == 0) {
			System.out.println("재고 소진으로 매장 문 닫습니다.");
			return false;
		}
		System.out.println("정상영업합니다.");
		return true;
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		
		while (food>0) {
			System.out.println("현재 재고량: " + food);
			System.out.print("몇 개를 구입하시겠어요? : ");
			int sell = scan.nextInt();
			
			if(sell>food) {
				System.out.println("재고가 부족합니다. 다시 입력해주세요.");
			} else {
				food -= sell;
				System.out.println("판매 완료 (남은 재고량: " + food + ")");
			}
			
		}
	}
}
