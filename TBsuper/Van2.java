package TBsuper;  // 42. 클래스 형변환

public class Van2 extends Car2 {
    // 상속 관계란 ‘is a 관계’ = ‘Van은 Car다’
    // 부모 타입으로 자식 객체를 참조하게 되면 부모가 가진 메서드만 사용

    public void ppangppang() {
        System.out.println("빵빵");
    }
}
