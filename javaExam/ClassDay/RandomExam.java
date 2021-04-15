// import java.util.Random;
// import java.util.Scanner;

public class RandomExam {
    public static void main(String[] args) {
        // 2 - 11 난수 생성
        // Random rand = new Random();

        // int x = 1 + rand.nextInt(9);   // 9미만, 1을 더해야지 0이 안나온다 = 8 + 1 = 9  , 1 + 0 = 1, 1 + 8 = 9
        // int y = -1 - rand.nextInt(9);  //  -1 - 0 = -1, -1 - 8 = -9
        // int z = 10 + rand.nextInt(90); // 10 + 0 = 10 ,  10+ 89 = 99

        // System.out.println("3개의 난수를 생성했습니다.");
        // System.out.println("한 자리의 양의 정수: " + x);
        // System.out.println("한 자리의 음의 정수: " + y);
        // System.out.println("두 자리의 양의 정수: " + z);

        // 2 - 12 
        // Scanner sc = new Scanner(System.in);
        // Random rand = new Random();

        // System.out.print("정수값:");
        // int x = sc.nextInt();

        // System.out.println("입력값의 5의 범위의 난수를 생성했습니다."); 
        // System.out.println("값은 " + (x - 5 + rand.nextInt(11)) + "입니다."); // 7 - 5 = 2

        // 2 - 15
        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("성: ");
        // String x = sc.next();
        // System.out.print("이름: ");
        // String y = sc.next();
        // System.out.println("안녕하세요. "+ x + y + "씨.");


        // 2 - 16
        String s1 = "ABC";  // 초기화
        String s2 = "XYZ";  // 초기화

        System.out.println("문자열 s1은 " +s1+ " 입니다.");
        System.out.println("문자열 s2은 " +s2+ " 입니다.");

        s1 = "FBI";  // 대입(값을 변경)
        System.out.println("문자열 s1은 " +s1+ " 입니다.");
        System.out.println("문자열 s2은 " +s2+ " 입니다.");
    }
    
}

