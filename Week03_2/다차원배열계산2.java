package Week03_2;

public class task06 {

	public static void main(String[] args) {
		int[][] englishScores= new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		//배열항목초기값출력
		for(int i= 0; i< englishScores.length; i++) { //반의수만큼반복
		for(int k= 0; k< englishScores[i].length; k++) { // 해당반의학생수만큼반복
		System.out.println("englishScores["+ i+ "]["+ k+ "]: "+ englishScores[i][k]);
		}
		}
		System.out.println();
		//배열항목값변경
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		int totalStudent= 0;
		int totalEnglishSum= 0;
		for(int i= 0; i< englishScores.length; i++) { //반의수만큼반복
		totalStudent+= englishScores[i].length; //반의학생수합산
		for(int k= 0; k< englishScores[i].length; k++) { // 해당반의학생수만큼반복
		totalEnglishSum+= englishScores[i][k]; //학생점수합산
		}
		}
		double totalEnglishAvg= (double) totalEnglishSum/ totalStudent;
		System.out.println("전체학생의영어평균점수: "+ totalEnglishAvg);

	}

}
