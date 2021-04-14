package TBException;  // 48. Exception(예외처리) -try, catch, finally구문이용

public class ExceptionExam {
    public static void main(String[] args) {

        int i = 10;
        int j = 5;
        try {
            int k = i / j;
            System.out.println(k);
        } catch(ArithmeticException e) {  // e = 에러 메세지
            System.out.println("0으로 나눌 수 없습니다." + e.toString());
        } finally {
            System.out.println("예외와 상관없이 무조건 실행!");
        }
        System.out.println("main end!!");
    }
}

/*
try{
    수행할 코드, 예외 발생 가능성이 있는 블록
}catch (발생할 수 있는 예외 타입  변수명) {
    예외 처리 블록
}finally{
    예외 발생 여부와 상관없이 무조건 실행하는 블록(생략 가능)
}
*/