public class Ex2 {
    public static void main(String[] args) {
        // 1-4 홍길동 각각 출력
        // System.out.println("홍");
        // System.out.println("길");
        // System.out.println("동");

        // System.out.println("홍\n길\n동");

        // 1-5 한줄에 한글자씩 자신의 이름을 표시하는 프로그램 작성 : 홍 길동
        // System.out.println("홍");
        // System.out.println("");
        // System.out.println("길");
        // System.out.println("동");

        // System.out.println("홍\n\n길\n동");

        // 1-6 정수 82와 17의 합과 차를 구하는 프로그램을 다양한 방법으로 작성해보자.
        // case1
        // System.out.println("82 + 17 = " + (82+17));  // 괄호가 먼저 계산 -> 숫자인식 후 문자로 출력
        // System.out.println("82 - 17 = " + (82-17));

        // case2
        // char a = 82;    // 단일 문자 = char
        // char b = 17;
        // System.out.println("82 + 17 = " + (a + b));
        // System.out.println("82 - 17 = " + (a - b));

        // 2-2 2개의 변수 x와 y의 합과 평균을 구하자. x와 y에는 적당한 값을 대입해서 사용
        // case1
        // int x = 63;
        // int y = 18;
        // System.out.println("x값은 " + x + " 입니다.");
        // System.out.println("y값은 " + y + " 입니다.");
        // System.out.println("합계는 " + (x + y) + " 입니다.");
        // System.out.println("평균은 " + (x + y)/2  + " 입니다.");

        // 2-3 2개의 변수 x와 y의 합과 평균을 구하자. x와 y에는 실수값을 대입하고 결과 알아보자.
        // case1
        // float x = 63.4f;     // float은 변수뒤에 f를 꼭 붙여야 한다.
        // double y = 18.3;
        // System.out.println("x값은 " + x + " 입니다.");
        // System.out.println("y값은 " + y + " 입니다.");
        // System.out.println("합계는 " + (x + y) + " 입니다.");
        // System.out.println("평균은 " + (x + y)/2  + " 입니다.");


        // 2-4 3개의 int변수에 각각 값을 대입해서 합계와 평균을 구하는 프로그램을 작성하자.
        int x = 63;
        int y = 18;
        int z = 52;
        int  sum = x + y + z;
        System.out.println("x값은 " + x + " 입니다.");
        System.out.println("y값은 " + y + " 입니다.");
        System.out.println("z값은 " + z + " 입니다.");
        System.out.println("합계는 " + sum + " 입니다.");
        System.out.println("평균은 " + sum/3  + " 입니다.");
        
    }
}
