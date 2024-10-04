package Week04;

public class CarExample2 {

	public static void main(String[] args) {
		//Car 객체 생성
		Car2 car = new Car2();
		
		System.out.println("제작회사: " + car.company);
		System.out.println("모델명: " + car.model);
		System.out.println("색깔: " + car.color);
		System.out.println("최고속도: " + car.maxSpeed);
		System.out.println("현재속도: " + car.speed);
		//car객체의 필드값 변경
		car.speed = 60;
		System.out.println("수정된 속도: " + car.speed);
	}

}
