import java.util.Scanner;
// import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
    // 4 - 1 정수값의 부호를 판정해서 표시하는 sign프로그램을 [3-5]를 원하는 만큼 반복해서 입력 및 표시하도록 수정
    // Scanner sc = new Scanner(System.in);
    // int retry;
    // do {
        
    // System.out.print("정수값: ");
    // int a = sc.nextInt();

    // if(a > 0) {
    //     System.out.println("이 값이 양수입니다.");
    // } else if (a < 0) {
    //     System.out.println("값이 음수입니다.");
    // } else {
    //     System.out.println("값이 0입니다.");
    // }
    // System.out.println("다시 한번? 1-Yes / 0-No");
    // retry = sc.nextInt();

    // } while (retry == 1);


    // 4 - 2 3자리의 양의 정수값을 읽는 프로그램작성(100~999) 음의정수는 다시 입력
    // Scanner sc = new Scanner(System.in);
    // int n;
    // do {
    // System.out.print("세자리 정숫값: ");
    // n = sc.nextInt();
    // System.out.println("세자리 정숫값를 다시 입력하시오.");
    
    // } while (n < 100 || n > 999); {   // (n >= 100 && n <= 999) 이걸 뒤집어!
    //     System.out.println("입력한 값은 " + n + "입니다.");
    // }


    // 4 - 3  2자리 정수값을 맞추는 게임을 만들자, 난수 생성과 if문 그리고 do문을 사용할것
    // Scanner sc = new Scanner(System.in);
    // System.out.print("숫자 맞추기 게임 시작!\n10부터 99사이의 숫자를 맞추세요.\n");
    // Random rand = new Random();
    // int a = 10 + rand.nextInt(90);   // 정답 생성
    // do {
    //     System.out.print("어떤 숫자일까? : ");
    //     a = sc.nextInt();
        
    //     if(a < 10) {
    //         System.out.println("더 큰 숫자입니다.");
    //     } else if (a > 99) {
    //         System.out.println("더 작은 숫자입니다.");
    //     }
    // } while (a < 10 || a > 99); {
    //     System.out.println("정답입니다.");
    // }
    

    // 4 - 4  두 값을 읽어서 두 정수 사이에 있는 모든 정수값 작은 것부터 큰 순으로 표시
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수 A: ");
    // int a = sc.nextInt();
    // System.out.print("정수 B: ");
    // int b = sc.nextInt();

    // // 필요시 작은수에서 큰수로 위치 변환
    // if(a > b){
    //     int t = a;
    //     a = b;
    //     b = t;
    // } 
    // // a와 b 사이의 정수 출력
    // do {
    //     System.out.print(a + " ");
    //     a += 1;
    // } while (a <= b);
    

    // 4 - 5  입력받은 정수값부터 0까지 카운트다운하는 프로그램 작성. 카운트종료 후의 변수값을 확인할 수 있게
    // Scanner sc = new Scanner(System.in);
    // System.out.print("카운트다운 합니다. ");
    // int x;
    // do {
    // System.out.print("양의 정수값 : ");
    // x = sc.nextInt();
    // }while (x <= 0);
    // while (x>=0)  // 조건
    //   System.out.println(x--);
    // System.out.println("x의 값이 "+ x +"이 됐습니다. ");


    // 4 - 7 입력한 값의 개수만큼 '*'를 표시하는 프로그램 작성, 마지막에는 줄 바꿈 문자를 출력할 것
    // Scanner sc = new Scanner(System.in);
    // System.out.print("몇 개의 *를 표시할까요?: ");
    // int x = sc.nextInt();
    // int i = 0;
    // while(i < x) {
    //     System.out.print("*");
    //     i++;
    // }
    // if(x >= 1) 
    //     System.out.println();


    // 4 - 8  입력한 수만큼'*'와 '+'를 번갈아가면 작성하는 프로그램 출력
    // Scanner sc = new Scanner(System.in);
    // System.out.print("몇 개를 표시할까요?: ");
    // int x = sc.nextInt();
    // int i = 0;
    // while(i < x) {
    //     if ( i % 2 == 0)
    //         System.out.print("*");
    //     else
    //         System.out.print("+");
    //     i++;
    // }
    // if(x >= 1) 
    //     System.out.println();


    // 4 - 9 양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램 작성   
    // Scanner sc = new Scanner(System.in);
    // System.out.print("양의 정숫값의 자릿수를 표시합니다.");
    // System.out.print("양의 정숫값: ");
    // int x = sc.nextInt();
    // int y = 0;
    // while(x > 0)  {              // x가 0이 될 때 까지
    //     y++;                     // 1          2       3         4
    //     x = x/10;               // 125.(4)    12.(5)   1.(25)   end  -------------- 자릿수를 나누기로 표현
    // }
    // System.out.println("입력한 숫자는" + y + " 입니다.");


    // 4 - 10 양의 정수값 n을 읽어서 1부터 n까지의 곱을 구하는 프로그램을 작성
    Scanner sc = new Scanner(System.in);
    System.out.print("양의 정숫값: ");
    int x = sc.nextInt();
    int n = 1;
    int i = 1;   // 곱을 구하기 때문에 1부터 시작
    while(i <= x) {    // 1부터 n까지 적용하기 위해 i변수 넣음
        n = n * i;    //  자신을 곱함
        i++;
    }
    System.out.println("1부터 "+ x + "까지의 곱은" + n +"입니다");
    }
}
