package Week03_2;

public class hw2 {

	public static void main(String[] args) {
		
		int total = 0;
		int sum = 0;
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}};
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				total++;
			}
		}
		double avg = (double)sum/total;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

}
