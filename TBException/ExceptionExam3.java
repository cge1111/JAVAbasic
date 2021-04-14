package TBException;  // 50. Exception 발생시키기

public class ExceptionExam3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        int k = divide(i, j);
        System.out.println(k);
    }
    public static int divide(int i, int j) {
        if(j == 0) {
            System.out.println("두 번째 매개변수는 0이면 안 됩니다.");
            return 0;
        }
        int k = i / j;
        return k;
    }
}
