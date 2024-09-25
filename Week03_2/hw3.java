package Week03_2;

public class hw3 {

	public static void main(String[] args) {
		
		int[][] scores = new int[2][3];
		
		scores[0][0] = 80;
		scores[0][1] = 83;
		scores[0][2] = 85;
		scores[1][0] = 86;
		scores[1][1] = 90;
		scores[1][2] = 92;
		
		for(int i=0; i<scores.length; i++) {
			for(int k=0; k<scores[i].length; k++) {
				System.out.println("scores[" + i + "][" + k + "] : " + scores[i][k]);
			}
		}
		System.out.println();
		int max = scores[0][0];
		int min = scores[0][0];
		
		int totalStudent = 0;
		int scoreSum = 0;
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++) {
				scoreSum += scores[i][k];	
				
				if(scores[i][k] > max) {
                    max = scores[i][k];
                }
                
                // 최소값 구하기
                if(scores[i][k] < min) {
                    min = scores[i][k];
                }
			}
			
		}
		
		double avg = (double)scoreSum / totalStudent;
		System.out.println("합: " + scoreSum);
		System.out.println("평균점수: " + avg);
		
		System.out.println("최대 점수: " + max);
		System.out.println("최소 점수: " + min);
		
	}

}
