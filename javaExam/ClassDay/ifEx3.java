import java.util.Scanner;

public class ifEx3 {

    public static void main(String[] args) {


    // 3 - 1 if문
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수값: ");
    // int a = sc.nextInt();

    // if(a < 0) {
    //     System.out.println("이 값은 음의 값입니다.");
    // } 


    // 3 - 2 절댓값
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수값: ");
    // int a = sc.nextInt();
    // if(a < 0) {
    //     System.out.println("절댓값은 " + (-a) + "입니다.");
    // } else {
    //     System.out.println("절댓값은 " + a + "입니다.");
    // }


    // 3 - 3 2개의 양의 정수값을 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다."라고 표시하고, 그렇지 않으면
    // "B는 A의 약수가 아니다."라고 표시하는 프로그램 작성
    // Scanner sc = new Scanner(System.in);
    // System.out.print("변수 A: ");
    // int a = sc.nextInt();
    // System.out.print("변수 B: ");
    // int b = sc.nextInt();
    // if(a % b == 0) {
    //     System.out.println("B는 A의 약수이다.");
    // } else {
    //     System.out.println("B는 A의 약수가 아니다.");
    // }


    // 3 - 4 [3-3]프로그램을 논리 부정연산자(!)를 사용해서 수정하자.
    // Scanner sc = new Scanner(System.in);
    // System.out.print("변수 A: ");
    // int a = sc.nextInt();
    // System.out.print("변수 B: ");
    // int b = sc.nextInt();
    // if(a % b != 0) {   // (!(a % b == 0))
    //     System.out.println("B는 A의 약수가 아니다.");
    // } else {
    //     System.out.println("B는 A의 약수이다.");
    // }


    // 3 - 5 정수값을 읽어 부호(양수/음수/0)을 판정하는 프로그램을 작성하자
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수값: ");
    // int a = sc.nextInt();

    // if(a < 0) {
    //     System.out.println("값이 음수입니다.");
    // } else if (a > 0) {
    //     System.out.println("값이 양수입니다.");
    // } else {
    //     System.out.println("값이 0입니다.");
    // }


    // 3 - 7 2개의 변수a,b에 값을 읽어서 a,b의 대소 관계를 다음과 같이 표시하는 프로그램 작성
    // Scanner sc = new Scanner(System.in);
    // System.out.print("변수 a: ");
    // int a = sc.nextInt();
    // System.out.print("변수 b: ");
    // int b = sc.nextInt();
    // if(a > b) 
    //     System.out.println("a가 크다");
    // else if(a < b)  
    //     System.out.println("b가 크다");
    // else
    //     System.out.println("a와 b가 같다");


    // 3 - 9 배수 구하기
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수값: ");
    // int a = sc.nextInt();
    // if(a < 0) {
    //     System.out.println("음의 정수값을 입력했습니다.");
    // } else if(a % 10 == 0) {
    //     System.out.println("이 값은 10의 배수입니다.");
    // } else {
    //     System.out.println("이 값은 10의 배수가 아닙니다.");
    // }


    // 3 - 11 수 90/우 80/미 70/양 60/가 
    // Scanner sc = new Scanner(System.in);
    // System.out.print("점수: ");
    // int s = sc.nextInt();

    // if(s > 100) {
    //     System.out.println("잘못된 점수입니다.");
    // } else if(s >= 90) {
    //     System.out.println("수");
    // } else if(s >= 80) {
    //     System.out.println("우");
    // } else if(s >= 70) {
    //     System.out.println("미");
    // } else if(s >= 60) {
    //     System.out.println("양");
    // } else {
    //     System.out.println("가");
    // }

    
    // 3 - 13 두 값의 차 구함
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수 a: ");
    // int a = sc.nextInt();
    // System.out.print("정수 b: ");
    // int b = sc.nextInt();
    // int c = a - b;

    // if(c > 0) {
    //     System.out.println("두 값의 차는 " + c +"입니다.");
    // } else {
    //     System.out.println("두 값의 차는 " + -c +"입니다.");
    // }
    
    // Quiz. if를 사용하지 않고 프로그램을 작성하시오.
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수 a: ");
    // int a = sc.nextInt();
    // System.out.print("정수 b: ");
    // int b = sc.nextInt();
    // int c = a - b;

    // // System.out.println((a>b) ? "두 값의 차는 " + c +"입니다.":
    // // (b > a ) ? "두 값의 차는 " + -c +"입니다." : "a와 b는 같다.");

    // int d;
    // d = (a > b) ? a - b : b - a;
    // System.out.println("두 값의 차는" +c+ "입니다.");


    // 3 - 15 3개의 정수 중 최소값을 구하는 프로그램을 작성   ------------ 중요 암기 --------------------
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수 a:");
    // int a = sc.nextInt();
    // System.out.print("정수 b:");
    // int b = sc.nextInt();
    // System.out.print("정수 c:");
    // int c = sc.nextInt();
    
    // int min = a;

    // if(b < min) min = b;
    // if(c < min) min = c;
    // System.out.println("최솟값은 "+ min + "입니다.");

    // 3 - 16 입력한 3개의 정수값 중 중앙값 구하는 법          ----- 중앙값 찾는 법 -----
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수 a: ");
    // int a = sc.nextInt();
    // System.out.print("정수 b: ");
    // int b = sc.nextInt();
    // System.out.print("정수 c: ");
    // int c = sc.nextInt();
    // int mid = 0;

    // if ((b >= a && c <= a) || (b <= a && c >= a))  
    //     mid = a;  // b > a > c           c > a > b
    // else if ((a >= b && c <= b) || (a <= b && c >= b))  
    //     mid = b;
    // else
    //     mid = c;
    // System.out.println("중앙값은 " + mid + "입니다.");
    

    // 3 - 18 2개의 정수값을 내림차순(큰 순)으로 정렬하는 프로그램 작성
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수 a: ");
    // int a = sc.nextInt();
    // System.out.print("정수 b: ");
    // int b = sc.nextInt();

    // System.out.println("a >= b가 되도록 정렬했습니다.");
    // if (a < b) {           13 15
    //     int t = a;       13
    //     a = b;           13 15
    //     b = t;        15
    // }       
    // System.out.println("변수 a는" + a + "입니다.");
    // System.out.println("변수 b는" + b + "입니다.");
    

    // 3 - 19 3개의 정수값을 오림차순(작은 순)으로 정렬하는 프로그램 작성
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 a: ");
    int a = sc.nextInt();
    System.out.print("정수 b: ");
    int b = sc.nextInt();
    System.out.print("정수 c: ");
    int c = sc.nextInt();

    System.out.println("a <= b <= c가 되도록 정렬했습니다.");
    if (a > b ) {
        int t = a; a = b; b = t;  
    } 
    if (b > c ) {
        int t = b; b = c; c = t;  
    }
    if (a > b ) {
        int t = a; a = b; b = t;  
    }
         
    System.out.println("변수 a는" + a + "입니다.");
    System.out.println("변수 b는" + b + "입니다.");
    System.out.println("변수 c는" + c + "입니다.");

    }
}

