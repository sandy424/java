package Week05_hw;

public class ArrayExample {

	public static void main(String[] args) {
		
		Array myArr = new Array();
		
		int result1 = myArr.sum(2,4,6,8,10);
		System.out.println("도트 연산자 제공: " + result1);
		
		int[] values = {3,6,9,12,15};
		int result2 = myArr.sum(values);
		System.out.println("배열 항목 제공: " + result2);
		
		int result3 = myArr.sum(new int[] {1,3,5,7,9});
		System.out.println("배열 항목 제공 방법2: " + result3);
	}

}
