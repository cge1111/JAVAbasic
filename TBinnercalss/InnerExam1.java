package TBinnercalss;  // 46. 내부 클래스 - 인스턴스 클래스(instance class)

public class InnerExam1 {
    
    class Cal{
        int value = 0;
        public void plus() {
            value++;
        }  
    }

    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1();   // 바깥쪽 클래스 타입.내부 타입 ->객체 생성
        // t.new Cal();
        InnerExam1.Cal cal =  t.new Cal(); // 객체 생성
        cal.plus();
        System.out.println(cal.value);
    }
    
}


/*
• 인스턴스 클래스(instance class)
• 스태틱 클래스(static class)
• 지역 클래스(local class)
• 익명 클래스(anonymous class)
*/