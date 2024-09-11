package Week02_2;

import java.util.Scanner;

public class task07 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요: ");
		System.out.println("프로그램ㅇ르 종료하려면 q를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String intString;
		
		do {
			System.out.print(">");
			intString = scan.nextLine();
			System.out.println(intString);
		} while( ! intString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");

	}

}
