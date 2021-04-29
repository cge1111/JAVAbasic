import java.util.*;

public class Ex7 {   // 메서드
  public static void main(String[] args) {
  
  // 7 - 1 입력한 int형 정숫값이 음수이면 -1을, 0이면 0을. 양수이면 1을 반환하는 signOf메서드를 작성
  // Scanner sc = new Scanner(System.in);
  // System.out.print("정수 x:");
  // int x = sc.nextInt();
  
  // int s = signOf(x);
  // System.out.println("signOf(x)는"+s+"입니다");
  // }  //main 닫기
  
  // static int signOf(int n){
  //   if (n > 0)
  //     return 1;
  //   else if (n < 0)
  //     return -1;
  //   else 
  //     return 0;
  // }


  // 7 - 2 3개의 int형 인수 a, b, c중 최솟값을 구하는 min메소드를 작성하자.
  // Scanner sc = new Scanner(System.in);
  // System.out.print("정수 a: ");
  // int a = sc.nextInt();
  // System.out.print("정수 b: ");
  // int b = sc.nextInt();
  // System.out.print("정수 c: ");
  // int c = sc.nextInt();

  // int s = min(a, b, c);
  // System.out.println("최솟값은 "+ s +"입니다.");
  // } // main 닫기
  // /* 정답  --------------------------------------------최소값, 최대값 비교하는 방법 추천
  // System.out.println("최솟값은 "+ min(a,b,c) +"입니다.");  여기서 바로 메서드 던져~
  // static int min(int a, int b, int c) {
  //   int min == a;
  //   if(b < min) min = b;
  //   if(c < min) min = c;
  //   return min;
  //  } */
  // static int min(int a, int b, int c) {
  //   if( a < b && a < c) {
  //     return a;
  //   } else if (b < a && a < c) {
  //     return b;
  //   } else {
  //     return c;
  //   }
  // }


  // 7 - 3 3개의 int형 인수 a, b, c에서 중간값을 구하는 med 메서드를 작성
  // Scanner sc = new Scanner(System.in);
  // System.out.print("정수 a: ");   int a = sc.nextInt();
  // System.out.print("정수 b: ");   int b = sc.nextInt();
  // System.out.print("정수 c: ");   int c = sc.nextInt();

  // System.out.print("중간값은 "+ med(a, b, c)+ "입니다.");
  // }  // main닫기

  // static int med(int a, int b, int c) {
    // 첫번째 방법
    // if(a >= b)
    //   if(b >= c)
    //     return b;
    //   else if(a <= c)
    //     return a;
    //   else 
    //     return c;
    // else if(a > c)
    //   return a;
    // else if(b > c)
    //   return c;
    // else
    //   return b;

    //  두번째 방법
    // int med = a;
    // if((b >= c && c >= a ) || ( a >= c && a >= b)) med = c;
    // if((a >= b && b >= c ) || ( c >= b && b >= a)) med = b;
    // return med;

    // 세번째 방법 ----------------------------배열 사용
    // int[] num = {a, b, c};
    // Arrays.sort(num);  // import java.util.Array; -> import필요
    // return num[1];
    

    // 7 - 4 1부터 n까지의 정수의 합을 구해서 반환하는 메서드 작성
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("1부터 x까지의 합을 구하자.");
  //   System.out.print("x의 값: ");     int x = sc.nextInt();
  //   System.out.println("1부터 "+ x + "까지의 합은 " + sumUp(x) + "입니다.");
  // }// main닫기
  // static int sumUp(int n) {
  //   int sum = 0;
  //   for(int i = 1; i <= n; i++)
  //     sum += i;
  //   return sum;
  // }
  

  // 7 - 6 인수 m에 지정한 달의 계절을 표시하는 printSeason 메서드 작성. m값에 봄~겨울 표시
  // Scanner sc = new Scanner(System.in);
  // System.out.print("몇 월입니까(1~12):"); int m = sc.nextInt();
  // System.out.println("해당 월의 계절은 " + printSeason(m) +"입니다.");
  // // String answer = printSeason(sc.nextInt());
  // // System.out.println(answer);
  // } // main닫기

  // static String printSeason(int m) {
  //   // String season = ((m < 6 && m > 2) ? "봄":
  //   //                 ((m < 9 ) ? "여름" :
  //   //                 ((m < 12 ) ? "가을" :
  //   //                 ((m == 12 || m < 3 ) ? "겨울" : " "))));
  //   // return "해당 월의 계절은 " + season +"입니다.";           
  //   String n ="";
  //   switch(m) {
  //     case 3:
  //     case 4:
  //     case 5: n = "봄";
  //       break;
  //     case 6:
  //     case 7:
  //     case 8: n = "여름";
  //       break;
  //     case 9:
  //     case 10:
  //     case 11: n = "가을";
  //       break;
  //     case 12:
  //     case 1:
  //     case 2: n = "겨울";
  //       break;
  //   }
  //   return n;
  // }
  

  // 7 - 7 문자 c를 n개 표시하는 putChar 메서드와 이 메서드를 내부에서 호출해서 문자'*'를 n개 연속으로 표시하는 직각삼각형 프로그램
  // Scanner sc = new Scanner(System.in);
  // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
  // System.out.print("단수는: ");   int n = sc.nextInt();
  
  // for(int i = 1; i <= n; i++) {
  //   putStart(i); // 옆으로 찍는 함수
  //   System.out.println() ;
  // }
  // } // main닫기

  // static void putStart(int n) {  // return 필요없으면 void
  //   putChars('*', n);
  // }
  // static void putChars(char c, int n) {
  //   while(n-- > 0) {
  //     System.out.print(c);
  //   }
  // }


  // 7 - 8 난수(a =< 난수 =< b)를 생성해서 반환하는 random메서드 작성, 
  // Scanner sc = new Scanner(System.in);
  // System.out.println("난수를 생성합니다.");
  // System.out.print("하한값:");  int a = sc.nextInt();
  // System.out.print("상한값:");  int b = sc.nextInt();
  // System.out.println("생성한 난수는 "+ random(a, b)+ "입니다.");
  // } // main 닫기

  // static int random(int a, int b) {
  //   if(b <= a) {
  //     return a;
  //   } else {
  //     Random rand = new Random();
  //     return a + rand.nextInt(b - a + 1); 
  //   }
  // }


  // 7 - 9 "양의 정숫값: "이라는 메세지에 정숫값을 입력하면 값을 거꾸로 반환하는 readPlusInt작성.0이나 음수는 재입력 할 것
//   Scanner sc = new Scanner(System.in);
//   int x = 0;
//   do{
//     int n = readPlusInt();

//     System.out.print("반대로 읽으면 ");
//     while(n > 0) {
//       System.out.print(n%10);  // ex)521이면 나머지 1만 출력
//       n = n / 10;  // 몫만 
//     }
//     System.out.print("입니다.");
  
//   do {
//     System.out.print("다시 한 번?<Yes...1/ No...0>:");
//     x = sc.nextInt();
//   } while(x != 0 && x != 1);  // 0이나 1만 실행가능 -> 다시 한 번?<Yes...1/ No...0>:
// }while(x == 1);  // 1이면 메서드 다시 실행
// } // main 닫기

// static int readPlusInt() {
//   Scanner sc = new Scanner(System.in);
//   int x;
//   do{
//     System.out.print("양의 정수값:");  x = sc.nextInt();
//   } while(x <= 0);
//   return x;
//   }


  // 7 - 10  다음 4개의 계산 문제 중 하나를 무작위로 출제하는 암산 훈련 프로그램 작성 x, y, z 3지리 정숫값 난수 생성 (총 난수 4개)
//   Scanner sc = new Scanner(System.in);
//   Random rand = new Random();
//   do{
//     // 난수발생
//     int x = rand.nextInt(900) + 100;  // 3자리수
//     int y = rand.nextInt(900) + 100; 
//     int z = rand.nextInt(900) + 100;  
//     int p = rand.nextInt(4);  // 문제유형

//     int answer = 0;
//     switch (p) {
//       case 0: answer = x + y + z;  break;
//       case 1: answer = x + y - z;  break;
//       case 2: answer = x - y + z;  break;
//       case 3: answer = x - y - z;  break; 
//     } while(true) {
//       System.out.print(x + ((p < 2) ? "+": "-") + y + ((p % 2 == 0) ? "+": "-") + z + "=");
//       int k = sc.nextInt();
//       if(k == answer)
//         break;
//       System.out.println("틀렸습니다!");
//     }

//   } while(retry());
// }  // main 닫기
//   static boolean retry() {
//     Scanner sc = new Scanner(System.in);
//     int cond;
//     do{
//       System.out.print("다시 한 번?<Yes...1/ No...0>:");
//       cond = sc.nextInt();
//     } while(cond != 0 && cond != 1);
//     return cond == 1;
//   }
  

  // 7 - 19  배열 a[idx]부터 n개의 요소를 삭제하는 aryRmnN()메소드를 작성
  Scanner sc = new Scanner(System.in);
  System.out.print("요소 수:"); int n = sc.nextInt();
  int[] a = new int[n];

  for(int i = 0; i < n; i++) {
    System.out.print("a["+ i + "]:"); 
    a[i] = sc.nextInt();
  }
 
  System.out.print("삭제를 시작할 인덱스:");
  int d = sc.nextInt();
  System.out.print("삭제할 요소의 수:");
  int e = sc.nextInt();

  aryRmnN(a, d, e);
    for(int i = 0; i < n; i++) {
      System.out.println("a["+ i + "] = " + a[i]);
    }
}// main 닫기

  static void aryRmnN(int[] a, int d, int e) {
    if(e > 0 && d >= 0 && d + e < a.length) {
      int d2 = d + e - 1;
      if(d2 > a.length - e -1)
      d2 = a.length - e - 1 ;
      for(int i = d; i <= d2; i++) {
        a[i] = a[i+e];
      }
    }
  }







  
} // class 닫기
