package TBsuper;  // 42. 클래스 형변환

public class VanExam2 {
    public static void main(String[] args) {
        Car2 c = new Van2();  //  Car형 변수 c가 Van의 인스턴스를 나타냄, Car는 Van보다 상위 개념
        // c는 Car형이기 때문에 그보다 작은 Van형이 가리킬 수는 없다.

        c.run();

        // c.ppangppang();
        // 부모 타입으로 자식을 가리킬 수는 있지만 부모 타입으로 자식을 가리켰을 때는 부모가 가진 메서드만 사용

        Van2 van = (Van2) c;  //  Car가 참조하는 변수가 원래 Van, Van이었기 때문에 Van으로 타입을 바꿈
        van.run();
        van.ppangppang();
    }
}


/*
클래스끼리도 형변환 가능
부모가 자식을 가리킬 수 있으나 부모가 가리키고 있을 때는 부모가 알고 있는 메서드까지만 접근할 수 있기 때문
이때 형변환으로 객체가 가진 모든 부분을 사용


클래스 형변환 실습
https://thebook.io/006889/ch07/42/01/
*/