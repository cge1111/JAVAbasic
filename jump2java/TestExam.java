package jump2java;

public class TestExam {  // 메소드에서는 try, catch구문 두번 실행 됨
    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();  // 강제로 에러 발생
            // fool"이라는 입력값으로 sayNick 메소드 실행 시 다음과 같은 예외가 발생
            }
            System.out.println("당신의 별명은 " + nick + " 입니다."); // fool이 아니라면 출력
    } 

    public static void main(String[] args) { // 메인 메소드
        TestExam test = new TestExam();
        try {
            test.sayNick("fool");   // 에러 발생해서 catch 구문으로 실행
            test.sayNick("genious"); // 실행안됨 위에서 에러 발생했기 때문
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");  // 표준에러
        }
    }
}
