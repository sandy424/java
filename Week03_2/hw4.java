package Week03_2;

import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] scores = new int[2][3];
		
		for(int i=0; i<scores.length; i++) {
			for(int k=0; k<scores[i].length; k++) {
				System.out.print("scores[" + i + "][" + k + "] 입력하시오:");
				scores[i][k] = scan.nextInt();
			}
		}
		System.out.println();
		
		int max = scores[0][0];
		int min = scores[0][0];
		
		int totalStudent = 0;
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores.length;
			for(int k=0; k<scores[i].length; k++) {
				sum += scores[i][k];
				
				if(scores[i][k] > max) {
                    max = scores[i][k];
                }
                
                // 최소값 구하기
                if(scores[i][k] < min) {
                    min = scores[i][k];
                }
			}
		}
		double avg = (double) sum/ totalStudent;
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
