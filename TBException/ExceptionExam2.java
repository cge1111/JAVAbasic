package TBException;   // 49. Throws
// 내가 처리하지 않고 호출한 쪽에서 처리하라고 넘길 수 있는 키워드가 바로 throws

public class ExceptionExam2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch(ArithmeticException e) {
            System.out.println(e.toString());
        }
        
    }
    
    public static int divide(int i, int j) throws ArithmeticException {  // ‘throws + 발생할 예외’
        int k = i/j;
        return k;
    }
}
