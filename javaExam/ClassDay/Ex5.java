import java.util.*;

public class Ex5 {
    public static void main(String[] args) {

        // 5 - 4 논리형 변수에 true나 false를 대입해서 표시하는 프로그램 작성
        // boolean b1 = true;
        // boolean b2 = false;
        // System.out.println("b1 = "+ b1+ "\nb2 = " +b2);


        // 5 - 5 3개의 정수값을 읽어서 합계와 평균을 구하는 프로그램 작성, 평균을 실수로 표시
        // Scanner sc = new Scanner(System.in);
        // System.out.println("정숫값 x, y, z의 평균을 구합시다.");

        // System.out.print("x값: ");
        // int x = sc.nextInt();
        // System.out.print("y값: ");
        // int y = sc.nextInt();
        // System.out.print("z값: ");
        // int z = sc.nextInt();

        // double avg = (x + y + z)/3;
        // System.out.println("x, y, z의 평균은 " + avg + "입니다.");

        
        // 5 - 6 3개의 정수값을 읽어서 합계와 평균을 구하는 프로그램 작성, 평균은 캐스트 연산자 이용
        // Scanner sc = new Scanner(System.in);
        // System.out.println("정숫값 x, y, z의 평균을 구합시다.");

        // System.out.print("x값: ");
        // int x = sc.nextInt();
        // System.out.print("y값: ");
        // int y = sc.nextInt();
        // System.out.print("z값: ");
        // int z = sc.nextInt();

        // double avg = (x + y + z)/3.0;      // 캐스트 연산자(실수로 인식 = 3.0) -> 소숫점 x.0을 넣자
        // // double avg = (x + y + z)/3;    // 정수로 인식
        // // double avgs = (double) avg;   // 캐스트 연산자 = 강제 형변환
        // System.out.println("x, y, z의 평균은 " + avg + "입니다.");

        
        // 5 - 7 int형 변환에 실수값을 대입해서 표시하는 프로그램 작성
        // int a;
        // // a = 10.0; -- 에러
        // a = (int) 10.0;
        // System.out.print("a = " + a);


        // 5 - 8 float형의 변수 0.0부터 1.0까지 0.001씩 증가시키며 표시, 그 옆 int형 변수 0부터 1000까지 1씩증가시켜 1000으로 나눈값
        System.out.println("float\tint");
        System.out.println("------------");
        float x = 0.0f;
        for(int i = 0; i <= 1000; i++, x += 0.001f) {
            System.out.printf("%10.7f   %10.7f%n", x,(float)i/1000);
        }

    }
}
