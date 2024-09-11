package Week02_2;

public class task08 {

	public static void main(String[] args) {
		int i=2;
		
		do {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" +(i*j) + "\t");
				j++;
			} while(j<=9);
				i++;
				System.out.println();
		} while(i<=9);

	}

}
