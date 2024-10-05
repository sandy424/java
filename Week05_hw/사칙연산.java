package Week05_hw;

public class Calcul {
	//덧셈
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	//뺄셈
	int minus(int x, int y) {
		int result;
		if(x>y) {
			result = x - y;
		} else {
			result = y - x;
		}
		return result;
	}
	//곱셈
	int multi(int x, int y) {
		int result = x * y;
		return result;
	}
	//나눗셈
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
}
