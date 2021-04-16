import java.util.Scanner;
// import java.util.*;

public class ForEx4 {
    public static void main(String[] args) {

    // 4 - 11  기호문자를 임의의 개수만큼 출력했던[4-7]을 for문으로 작성
        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 개의 *를 표시할까요?: ");
        // int x = sc.nextInt();
        // for(int i = 0; i < x; i++){
        //     System.out.print("*");
        // }
        // if(x>=1)
        //     System.out.println();


    // 4 - 14 1부터 n까지의 합을 구하는 프로그램을 for문을 사용해 작성
        // Scanner sc = new Scanner(System.in);
        // System.out.print("1부터 n까지의 합을 구합니다. n의 값: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i <= n; i++) {
        //     sum += i;
        // } System.out.println("1부터 " + n + "까지의 합은 "+ sum +"입니다.");

    
    // 4 - 15  [4-14]의 결과뿐만아니라 계산식까지 표시
        // Scanner sc = new Scanner(System.in);
        // System.out.print("1부터 n까지의 합을 구합니다. \nn의 값: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i < n; i++) {
        //     sum += i;
        //     System.out.print(i+ " + ");
        // } System.out.println(n + " = "+ (sum +n) );


    // 4 - 16  신장별 표준 체중 대응표를 표시하는 프로그램 작성, 표시할 신장 범위(시작,종료,증가값는 정수
    // 표준체중 = (신장 - 100) * 0.9     --- for문
        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 cm부터: ");
        // int a = sc.nextInt();
        // System.out.print("몇 cm까지: ");
        // int b = sc.nextInt();
        // System.out.print("몇 cm단위: ");
        // int c = sc.nextInt();
        // System.out.println("신장 표준 체중 ");
        // System.out.println("--------------");
        // for(int i = a; i <= b; i = i+c) {
        //     System.out.println(i + " " + ((i-100)*0.9));
        // } 
    

    // 4 - 18  입력한 정숫값의 모든 약수와 그 개수를 표시하는 프로그램   --------중요-------약수 구하는 방법
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // int a = sc.nextInt();
        // int c = 0;
        // for(int i = 1; i <= a; i++){
        //     if(a % i == 0){
        //         System.out.print(i+" ");
        //         c++;
        //     }
        // }
        // System.out.println("\n의 약수는 "+ c +"개입니다.");


    // 4 - 19 1부터n까지의 정숫값에 각 값을 제곱해서 표시하는 프로그램 작성(n값을 입력받음)
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // int a = sc.nextInt();
        // int c = 0;
        // for(int i = 1; i <= a; i++) {
        //         c = i*i;
        //         System.out.println( a +"의 제곱은 "+ c + "입니다.");
        // }


    // 4 - 20 달을 정숫값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램 작성(do문 안에 do문이 들어가게)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("계절을 찾습니다. ");
        // int a;
        // int retry;
        // do{
        //     do {
        //         System.out.print("몇 월입니까?: ");
        //         a = sc.nextInt();
        //     } while(a < 0 || a > 12);

        //         if(a >= 3 && a <= 5 ) {
        //             System.out.println("봄입니다.");
        //         }
        //         else if (a >= 6 && a <= 8) {
        //             System.out.println("여름입니다.");
        //         } 
        //         else if (a >= 9 && a <= 11) {
        //             System.out.println("가을입니다.");
        //         } 
        //         else {
        //             System.out.println("겨울입니다.");
        //         } 
        //         System.out.print("다시 한번? 1-Yes / 0-No: ");
        //             retry = sc.nextInt();
        // } while(retry == 1);
        
      
        
    // 4 - 21 기호문자 '*'를 나열해서 n단의 정방형을 표시하는 프로그램 작성
        // Scanner sc = new Scanner(System.in);
        // System.out.println("정방형을 표시합니다.");
        // System.out.print("단수는: ");
        // int a = sc.nextInt();
            
        // for(int i = 0; i < a; i++) {      // 줄
        //     for(int j = 0; j < a; j++) {  // 줄마다 갯수
        //         System.out.print("*");  // if a=3, j=3
        //     }
        //     System.out.println();
        // }


    // 4 - 22 기호문자'*'를 나열해서 직각의 이등변 삼각형을 표시하는 프로그램작성  -  왼쪽 위
        // Scanner sc = new Scanner(System.in);
        // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는: ");
        // int a = sc.nextInt();
            
        // for(int i = 1; i <= a; i++) {      // 줄
        //     for(int j = 1; j <= i; j++) {  // 줄마다 갯수
        //         System.out.print("*");  // if a=3, j=3
        //     }
        //     System.out.println();
        // }


    // 4 - 22 -2             -- -  왼쪽 위
        // Scanner sc = new Scanner(System.in);
        // System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는: ");
        // int a = sc.nextInt();
            
        // for(int i = 1; i <= a; i++) {      // 줄
        //     for(int j = a; j >= i; j--) {  // 줄마다 갯수
        //         System.out.print("*");  // if a=3, j=3
        //     }
        //     System.out.println();
        // }


    // 4 - 22 -3             -- -  오른쪽 위
        // Scanner sc = new Scanner(System.in);
        // System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는: ");
        // int a = sc.nextInt();

        // for(int k = 1; k <= a; k++) {     // 빈칸
        //     for(int i = 1; i <= k-1; i++) { 
        //         System.out.print(" ");  // if 
        //     }

        //     for(int j = 1; j <= a-k+1; j++) {      // 별
        //         System.out.print("*");  
        //     }
        //     System.out.println();
        // }


    //4 - 23 계단 피라미드를 표시하는 프로그램 작성 i행번째에는 (i-1)*2+1개의 '*' 기호를 표시하고 마지막 행인 n번째행에는 (n-1)*2 +1 개의 '*'를 표시할 것
        // Scanner sc = new Scanner(System.in);
        // System.out.println("피라미드를 표시합니다.");
        // System.out.print("단수는: ");
        // int a = sc.nextInt();

        // for(int k = 1; k <= a; k++) {     // 빈칸
        //     for (int i = a-1 ; i>=k ; i--) { 
        //         System.out.print(" ");  // if 
        //     }

        //     for(int j = 1; j <= 2*k-1; j++) { // 별 -> 홀수로
        //         System.out.print("*");  
        //     }
        // }
        //     System.out.println();
            // 1줄 빈칸 4,별 1
            // 2줄 빈칸 3,별 3
            // 3줄 빈칸 2,별 5
            // 4줄 빈칸 1,별 7
            // 5줄 빈칸 x,별 9


    // 4 - 24  n단의 숫자 피라미드를 표시하는 프로그램 작성 i번째 행에는 i%10을 표시
        // Scanner sc = new Scanner(System.in);
        // System.out.println("숫자 피라미드를 표시합니다.");
        // System.out.print("단수는: ");
        // int a = sc.nextInt();

        // for(int k = 1; k <= a; k++) {     // 빈칸
        //    for (int i = a-1 ; i >= k ; i--) { 
        //         System.out.print(" ");  // if 
        //     }

        //     for(int j = 1; j <= 2*k-1; j++) { // 별 -> 홀수로
        //         System.out.print(k % 10);  
        //     }
        //     System.out.println();


    // 4 - 25  양의 정숫값을 읽어서 소수인지 판정하는 프로그램 작성, 소수란 2 이상 n미만인 수중 어떤 수로도 나누어지지 않는 정수값
        // Scanner sc = new Scanner(System.in);
        // System.out.print("2이상의 정숫값: ");
        // int a = sc.nextInt();
        // int i;
        // for(i = 2; i < a; i++) {
        //     if(a % i == 0)
        //         break;
        // }
        //     if(i == a)
        //         System.out.println("소수입니다.");
        //     else
        //         System.out.println("소수가 아닙니다.");
            
            
    // 4 - 26  정숫값을 연속해서 입력을 받아 합계와 평균을 구하는 프로그램을 작성하자(0 입력시 종료)
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?: ");
        int n = sc.nextInt();
        int i;
        int sum = 0;

        for(i = 0; i < n; i++) {
            System.out.print("정수(0으로 종료): ");
            int t =sc.nextInt();
            if(t==0) break;
            sum += t;
        }
        
        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + sum/i + "입니다.");
            
        

    }
}

