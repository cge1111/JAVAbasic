package thebook;  // 후판정 , 조건에 상관없이 무조건 한 번은 실행

import java.util.*;

public class doWhileExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int value = 0;
        int sum = 0;

        do {
            value = scan.nextInt();
            System.out.print("숫자 입력: ");
            sum += value;
        } while (value < 100 );
        System.out.println("sum: "+sum);
    }
}

/*
int value = 0;
Scanner scan = new Scanner(System.in);  // 키보드를 의미, System.in = 생성자 
//  스캐너 객체생성
System.out.print("숫자 입력: ");

do{
    value = scan.nextInt(); // nextInt()는 Scanner 객체가 가진 메서드
    System.out.println("입력받은 값: "+value);
    System.out.print("숫자 입력: ");
} while (value != 10);
System.out.println("반복문 종료!!");
*/