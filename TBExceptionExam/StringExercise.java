package TBExceptionExam;  // 53. 가운데 글자 가져오기

public class StringExercise {
    String getMiddle(String word) {
        // 글자의 개수로 홀수 짝수 파악
        int num = word.length()/2;
        if(word.length() % 2 == 0) {  // 짝수케이스
            return word.substring(num-1, num+1);  // 글자 자르기 (가운데 2개 출력)
        } else {   // 홀수케이스
            return word.substring(num, num+1);  // 글자 자르기 (소수점빼고 1개 출력)
        }
    }
    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
        System.out.println(se.getMiddle("test"));
    }
}
