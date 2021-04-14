package TBinnercalss;  //  46. 내부 클래스 - 지역 클래스(local class) : 메서드 안에 선언

public class InnerExam3 {
    public void exec() {
        class Cal{
            int value = 0;
            public void plus() {
                value++;
            }
        }
        Cal cal = new Cal();  // 메서드 안에서 Cal 객체를 생성
        cal.plus();  // Cal 객체가 가진 메서드를 호출
        System.out.println(cal.value);  // Cal이 가진 value를 호출해 사용
    }

    // 호출할 때 내부적으로 Cal 클래스를 하나 생성하고, Cal 클래스에 정의한 부분을 실행
    public static void main(String[] args) {  // InnerExam3 객체가 가진 메서드를 호출
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}
