package TBinnercalss;  //  46. 내부 클래스 - 스태틱 클래스(static class) : 내부 클래스를 인스턴스 변수로 선언

public class InnerExam2 {
    static class Cal{
        int value = 0;
        public void plus() {
            value++;
        }
    }

    public static void main(String[] args) {
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
