package Week05_2;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "김자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//final이 아닌 필드는 값 변경 가능
		k1.name = "김자반";
		System.out.println(k1.name);
	}

}
