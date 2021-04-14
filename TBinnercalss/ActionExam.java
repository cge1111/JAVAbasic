package TBinnercalss;  //  47. 내부 클래스 - 익명 클래스(anonymous class)

public class ActionExam {
    public static void main(String[] args) {
        //  Action은 추상 클래스이고, 추상 클래스는 완전한 클래스가 아니므로 객체를 생성할 수 없기 때문
        Action action =  new MyAction(){
            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();  // 익명 클래스 : 레퍼런스 변수.메서드명();
    }
}
