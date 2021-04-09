package thebook;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {

        // 삼항연산자를 사용하여 1이면 1st 2이면 2nd 3이면 3rd 4이면 4th를 출력하는 프로그램 작성
        Scanner sc = new Scanner(System.in);  // 객체입력
        System.out.print("1~4까지 입력하세요.");
        
        int a = sc.nextInt();
        String num;

        num = (a == 1) ? "1st" :
              (a == 2) ? "2nd" :
              (a == 3) ? "3rd" :
              (a == 4) ? "4th" : "1~4까지 입력하세요.";

        System.out.println(num);
   }
}



// boolean isFun = true;
// char c ='f';              // 작은따옴표를 사용해야 합니다.
// int x = 59;
// long big = 3456789L;      // 뒤에 소문자 l이나 대문자 L을 붙여야 합니다.
// float f = 32.5f           // 뒤에 소문자 f나 대문자 F를 붙여야 합니다. 
// double d = 23.34;

// System.out.println(y);
/* int y = x; --이렇게 묵시적으로 수행하면 컴파일러는 에러를 발생시킵니다.
int y = (int) x;   반드시 명시적으로 형을 바꿔줘야 합니다.  */


// int i1 = -5;
// int i2 = +i1; // -5
// int i3 = -i1; // 5   
// int i4 = ++i3; // 6, i3 = 6
// int i5 = i3++; // 6, i3 = 7  

// System.out.println("i1: "+i1);
// System.out.println("i2: "+i2);     //  ‘+’는 부호 비트를 그대로 유지, ‘-’는 음수를 양수로, 양수를 음수로 변경
// System.out.println("i3: "+i3);
// System.out.println("i4: "+i4);
// System.out.println("i5: "+i5);