package TBExceptionExam;  // 52. 나누어 떨어지는 숫자 배열

import java.util.Arrays;

public class Divisible  {
    public int[] divisible(int[] array, int divisor) {

        // array 개수 파악해서 뺌
        int resultArratSize = 0; // 결괏값 배열의 크기를 알아낼 변수 선언
        for(int i = 0; i < array.length; i++) {
            if(array[i] % divisor == 0)  // 결과에 해당하는 값을 찾으면
                resultArratSize++;      // resultArraySize를 1 증가시킴
        }
        // ret에 array에 포함된 정수 중 divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        int[] ret = new int [resultArratSize]; // 결괏값을 담을 배열 생성(새로운 배열 생성)
        int index = 0; // 결괏값 배열 인덱스를 위한 변수
        for(int i = 0; i <array.length; i++) {
            if(array[i] % divisor == 0)  // 조건에 맞는 값을 찾으면
                ret[index++] = array[i]; // 결괏값 배열에 담아준다.
        }
        return ret;
        }
        // 아래는 테스트로 출력해보기 위한 코드입니다.
        public static void main(String[] args) {
            Divisible div = new Divisible();
            int[] array = {5, 9, 7, 10};
            System.out.println( Arrays.toString( div.divisible(array, 5) ));
        }
}
