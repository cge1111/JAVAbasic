package thebook;  // for(변수 초기화; 조건식; 증감식) { 실행할 문장들; }

public class ForExam {  // 프로그램의 시작점
    public static void main(String[] args) {
        int total = 0;
        for(int i =1; i <= 100; i++) {
            if (i % 2 ==0) {        // 짝수 출력
                System.out.println(i);
            } 
        } 
    }
}


/*
int total = 0;
for (int i = 1; i <= 100; i++) {
    if(i%2 != 0) {  // 홀수 값의 합
        continue;
    }
    total += i;
}
System.out.println(total);
*/

/*
int total = 0;
for(int i = 1; i <=100; i++) {
    total = total + i;
if(i == 50) {     // 1부터 50까지의 합만 출력
    break;        for문도 break가능
}
}
System.out.println(total);
*/