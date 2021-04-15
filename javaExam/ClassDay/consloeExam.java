import java.util.*;

public class consloeExam {
    public static void main(String[] args) {
        // 2-5 키보드에서 입력한 정수값을 표시하는 프로그램을 작성하자.
        // case1
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값: ");
        // System.out.println(sc.next() + "를 입력했습니다.");

        // case2
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수값: ");
        // int x = sc.nextInt();
        // System.out.println(x + "를 입력했습니다.");

        // 2-6 키보드에서 입력한 정수값에 10을 더한 값과 10을 뺀 값을 출력하자.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // int a = sc.nextInt();
        // System.out.println("10을 더한 값은 " + (10 + a) +"입니다.");
        // System.out.println("10을 뺀 값은 " + (a - 10) +"입니다.");


        // 2-7 키보드에서 입력한 정수값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하는 프로그램을 작성해보자
        // cas1 = 문자열로 풀기
        // Scanner sc = new Scanner(System.in);
        // String n;
        // System.out.print("정수값:");
        // n = sc.next();
        // System.out.println("마지막 자릿수를 제외한 값은 " + n.substring(0,n.length()-1) + "입니다."); 
        // System.out.println("마지막 자릿수는 " + n.substring(n.length()-1, n.length()) + "입니다."); 

        // // cas2 = 숫자로 풀기
        // Scanner sc2 = new Scanner(System.in);
        // System.out.print("정수값:");
        // int x = sc2.nextInt();
        // System.out.println("마지막 자릿수를 제외한 값은 " + (x / 10) + "입니다."); 
        // System.out.println("마지막 자릿수는 " + (x % 10) + "입니다."); 

        // 2 - 9 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하자.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("삼각형의 넓이를 구합니다.");
        // System.out.print("밑변: ");
        // double x = sc.nextDouble();
        // System.out.print("높이: ");
        // double y = sc.nextDouble();
        // System.out.println("넓이는 " + (x*y)/2 + "입니다");

        // 2 - 10 구의 겉넓이와 부피를 구하는 프로그램을 작성하자.
        Scanner sc = new Scanner(System.in);
        System.out.println("구의 겉넓이와 부피를 구합니다.");
        System.out.print("반지름: ");

        double r = sc.nextDouble();
        double PI = 3.141592;
        
        System.out.println("겉넓이는 "+ (4 * PI *r *r) + "입니다.");  // 겉넓이: 4*pi*r^2
        System.out.println("부피는 "+(((4 * PI) * (r * r * r))/3.0)  + "입니다."); // 부피 : 4/3*pi*r^3

    }
}
