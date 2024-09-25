package Week03_2;

import java.util.Scanner;

public class hw6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int stu = 0;
		int[] scores = null;
		
		while(true) {
		
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
		
			System.out.println("선택> ");
			int choice = scan.nextInt();
		
			switch(choice) {
			
			case 1 :
				System.out.println("학생수> ");
				stu = scan.nextInt();
				scores = new int[stu];
				break;
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "] 입력:" );
					scores[i] = scan.nextInt();
			}
			case 3: 
				for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "] : " + scores[i]);
                }
            	break;
            case 4:
            	int max = scores[0];
                int min = scores[0];
                int sum = 0;
                
                for (int score : scores) {
                    if (score > max) {
                        max = score;
                    }
                    if (score < min) {
                        min = score;
                    }
                    sum += score;
                }
                
                double avg = (double) sum / scores.length;
                System.out.println("최고 점수: " + max);
                System.out.println("최저 점수: " + min);
                System.out.println("평균 점수: " + avg);
                break;
            case 5:
            	System.out.println("프로그램을 종료");
            	break;
            	
		}
			
		}
	}
	}
