import java.util.*;


public class Ex6 {   // 배열예제 중요
    public static void main(String[] args) {
    
        // 6 - 1 자료형은 double이고 요소 수가 5인 배열을 생성하고 이 배열의 모든 요소 표시
        // double[] a = new double[5];
        // for(int i = 0; i <= a.length; i++)
        //     System.out.println("a[" + i + "] = " + a[i]);

        
        // 6 - 2 요소 개수가 5인 int형 배열에 순서대로 5,4,3,2,1을 대입하는 프로그램 작성
        // int[] a = new int[5];

        // for(int j = 0; j < a.length; j++)
        //     a[j] = 5 - j;                     # 결과 값: 5,4,3,2,1
        // for(int i = 0; i <= a.length; i++)
        //     System.out.println("a[" + i + "] = " + a[i]);  # a[0]~a[4]


        // 6 - 6 배열의 요소 수와 개별 요소의 값을 입력 받아서 표시하는 프로그램, 표시형식은 배열 초기값과 같은 형식, 각 요소값 쉼표 연결 {}감싼형태
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수:");
        // int n = sc.nextInt();
    
        //   int[] a = new int[n];
    
        //   for (int j = 0; j < n ; j++){
        //     System.out.print("a[" + j + "] = ");
        //     a[j]= sc.nextInt();
        //   }
    
        //   System.out.print("a = {"); // 첫번째 만 따로 빼기
        //   for (int i = 0 ; i < n - 1; i++)
        //     System.out.print(a[i] + ", ");
        //   System.out.println(a[n-1] + "}"); // 마지막, 빼기 위해서 따로 뺴줌 암기!!!!!
    

        // 6 - 7 시험 점수의 합계, 평균, 최고점, 최저점을 구하는 프로그램, 사람수와 점수는 입력 받을 것
        // Scanner sc = new Scanner(System.in);
        // System.out.print("사람 수:");
        // int n = sc.nextInt();
        // System.out.println("점수를 입력하세요.");
        //     int[] a = new int[n];
        //     int sum = 0;
        //     for(int i = 0; i < n; i++) {
        //         System.out.print((i+1) + "번의 점수: ");
        //         a[i] = sc.nextInt();
        //         sum += a[i];  // for문 안에서 값을 가지고 나옴
        //     }

        //     int max = a[0];
        //     int min = a[0];
        //     for(int i = 1; i <n; i++) {
        //         if (a[i] > max) max = a[i];
        //         if (a[i] < min) max = a[i];
        //     }
        
        // System.out.println("합계는 "+ sum + "점입니다.");
        // System.out.println("평균은 "+ (double)sum/n + "점입니다.");
        // System.out.println("최고점은 "+ max + "점입니다.");
        // System.out.println("최저점은 "+ min + "점입니다.");
    

        // 6 - 8 배열에서 특정 값을 가지는 요소를 찾아라.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수: ");
        // int n = sc.nextInt();

        //     int[] a = new int[n];
        //     for(int i = 0; i < n; i++) {
        //         System.out.print("a["+i+"] = " );
        //         a[i] = sc.nextInt();
        //     }

        // System.out.print("찾을 숫자: ");
        // int s = sc.nextInt();

        //     for(int i = 0; i < n; i++) {
        //         if(a[i] == s) {
        //             System.out.println("그 값은 a["+ i +"]에 있습니다.");
        //             break;
        //         }
        //     }


        // 6 - 10 요소의 형이 int형인 배열을 만들어서 1~10의 난수 대입
        // Scanner sc = new Scanner(System.in);
        // Random rand = new Random();
        // System.out.print("요소 수: ");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        //     for(int i = 0; i < n; i++) {
        //         System.out.print("a["+i+"] = " );
        //         int x = 1 + rand.nextInt(10); 
        //         System.out.println(x);
        //     }


        // 6 - 11 인접하는 요소가 동일한 값을 가지지 않도록 [6-10]수정
        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수:");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // a[0] = 1 + rand.nextInt(10);

        // for (int j = 1; j < n ; j++){
        //     do {
        //         a[j] = 1 + rand.nextInt(10);
        //     } while(a[j] == a[j-1]);
        // }
        // for (int j = 0; j < n ; j++){
        //     System.out.println("a["+j+"] = " + a[j]);
        // }


        // 6 - 12 서로 다른 요소가 동일한 값을 지니지 않도록 [6-10]수정
        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
    
        // int n = 0;
        // do {
        //   System.out.print("요소 수:");
        //   n = sc.nextInt();
        // }while(n>10);
    
        // int[] a = new int[n];
    
        // //a[0]= 1+ rand.nextInt(10);
    
        //   for (int i = 0; i < n ; i++){
        //     int j;
        //     do {
        //       j = 0;
        //       a[i] = 1+ rand.nextInt(10);
        //         for (j = 0 ; j < i ; j++){
        //           if (a[j] == a[i]) break;
        //         }
        //     } while(j < i);
        //   }
        //   for (int j = 0; j < n ; j++){
        //       System.out.println("a["+j+"] = " + a[j]);
        //   }


          // 6 - 13 배열의 나열순서를 섞는 프로그램 작성
        //   Random rand = new Random();
        //   Scanner sc = new Scanner(System.in);
        //   System.out.print("요소 수:");
        //   int n = sc.nextInt();
        //   int[] a = new int[n];
      
        //     for (int j = 0; j < n ; j++){
        //       System.out.print("a["+j+"] = ");
        //       a[j]= sc.nextInt();
        //     }
      
        //   System.out.println("요소를 섞었습니다.");
      
        //     for (int i = 0 ; i < n ; i++) {
        //       int x = rand.nextInt(n);
        //       int y = rand.nextInt(n);
        //       int t = a[x];
        //       a[x] = a[y];
        //       a[y] = t;
        //     }
      
        //     for (int j = 0; j < n ; j++){
        //         System.out.println("a["+j+"] = " + a[j]);
        //     }
      

        // 6 - 14 배열 a의 모든 요소를 역순으로 배열 b에 복사하는 프로그램작성, 두 배열 요소 수는 동일
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수:");
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // int[] b = new int[n];
    
        //   for (int j = 0; j < n ; j++){
        //     System.out.print("a["+j+"] = ");
        //     a[j]= sc.nextInt();
        //   }
        // System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
        // for (int i = 0; i < n ; i++){
        //     b[i] = a[n-i-1]; 
        //   }
    
        //   for (int j = 0; j < n ; j++){
        //       System.out.println("b["+j+"] = " + b[j]);
        //   }
    

        // 6 - 15 월을 1~12의 숫자로 표시하고 해당 월의 영어 단어를 입력
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] months= {
          "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
        };
        int re = 0;
        System.out.println("해당월의 영어 단어를 입력하시오.\n세 글자로 잛게 첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
    
        do {
        int month = 1 + rand.nextInt(12);
    
        while(true){
        System.out.print(month + "월 :");
        String s = sc.next();
        
        if (s.equals(months[month -1])) break;
        System.out.println("틀렸습니다.");
        }
          System.out.print("정답입니다.");
          System.out.print("다시 한번?1...Yes/0...No:0  :");
          re = sc.nextInt();
        } while (re == 1);
    

        






    }
}
