package Week03;

public class task02 {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; //쓰레기
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;   //쓰레기 아님
		System.out.println("kind2: " + kind2);

	}

}
