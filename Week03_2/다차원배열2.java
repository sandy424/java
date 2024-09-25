package Week03_2;

public class task05 {

	public static void main(String[] args) {
		int[][] mathScores= new int[2][3];
		
		for(int i= 0; i< mathScores.length; i++) { //반의수만큼반복
		for(int k= 0; k< mathScores[i].length; k++) { // 해당반의학생수만큼반복
		System.out.println("mathScores["+ i+ "]["+ k+ "]: "+ mathScores[i][k]);
		}
		}
		System.out.println();
		
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		//전체학생의수학평균구하기
		int totalStudent= 0;
		int totalMathSum= 0;
		for(int i= 0; i< mathScores.length; i++) {
		totalStudent+= mathScores[i].length;
		for(int k= 0; k< mathScores[i].length; k++) {
		totalMathSum+= mathScores[i][k];
		}
		}
		double totalMathAvg= (double) totalMathSum/ totalStudent;
		System.out.println("전체학생의수학평균점수: "+ totalMathAvg);
		System.out.println();

	}

}
