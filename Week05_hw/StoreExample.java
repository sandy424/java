package Week05_hw;

import java.util.Scanner;

public class StoreExample {

	public static void main(String[] args) {
		Store myStore = new Store();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("오늘 음식 재고량을 입력하세요: ");
		int num = scan.nextInt();
		
		myStore.setStore(num);
		
		if(myStore.Open()) {
			myStore.run();
		}
		System.out.println("판매 종료합니다.");
	}

}
