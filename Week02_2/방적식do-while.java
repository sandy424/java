package Week02_2;

public class task11 {

	public static void main(String[] args) {
		double a = 1;
		double b = -9;
		double c = 14;
		
		double discriminant = b*b - 4*a*c;
		int i = 0;
		
		do {
			double root = (-b + (i == 0 ? 1:-1) * Math.sqrt(discriminant)) /  ( 2*a );
			System.out.println("x" + (i+1) + ": " + root);
			i++;
		} while(i<2);
		
		
	}

}
