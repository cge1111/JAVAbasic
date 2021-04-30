package ch10;

// 10 - 7 배열의 값 중에서 최소값과 최대값을 구하는 메소드를 모은 유틸리티 클래스작성.
import java.util.*;

class MinMax {
    //2개중 최소값 찾기 매서드  (매서드 오버로딩)
   public static int min(int a, int b) {   
    return a < b ? a : b;
  }
  
  public static int min(int a, int b, int c) {
   int min = a;
   if(b<a) min=b;
   if(c<min) min=c;
   return min;
  }

  public static int min(int[] a) {  // 배열 최소값 구하는 클래스
    int min = a[0];  //a[0]이 제일 작다고 기준 잡는다
    for(int i = 1; i < a.length; i++) { // 0과 1비교
        if(a[i] < min) min = a[i];
    }
    return min;
   }

  public static int max(int a, int b) {
    return a > b ? a : b;
   }

  public static int max(int a, int b, int c) {
   int max = a;
   if(b>max) max=b;
   if(c>max) max=c;
   return max;
  }

  public static int max(int[] a) {   // 배열 최대값 구하는 클래스
    int max = a[0];  //a[0]이 제일 크다고 기준 잡는다
    for(int i = 1; i < a.length; i++) { // 0과 1비교
        if(a[i] > max) max = a[i];
    }
    return max;
   }

   // 배열에서 최소값을 가지는 모든 요소의 인덱스를 저장한 배열 구하기
   public static int[] minIndexArr(int[] a) {
    int min = min(a);
    int count = 0;
    for(int i = 0 ; i < a.length ; i++){
      if(a[i] == min)
      count++;
    }

    int[] c = new int[count--];
    for (int i = a.length-1; count >=0;i--){
      if (a[i]== min){
        c[count--]= i;
      }
    }
    return c;
  }


  

    public static void main(String args[]) {    
        Scanner sc = new Scanner(System.in);


        System.out.print("x값:"); int x = sc.nextInt();
        System.out.print("y값:"); int y = sc.nextInt();
        System.out.print("z값:"); int z = sc.nextInt();

        System.out.print("배열 a의 요소 수:"); int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n ; i++){
            System.out.print("a[" + i + "] : ");
            a[i]= sc.nextInt();
        }
        System.out.println();

        System.out.println("x, y의 최소값은 "+ min(x, y)+ "입니다.");
        System.out.println("x, y의 최대값은 "+ max(x, y)+ "입니다.");
        System.out.println("x, y, z의 최소값은 "+ min(x, y, z)+ "입니다.");
        System.out.println("x, y, z의 최대값은 "+ max(x, y, z)+ "입니다.");

        System.out.println();

        System.out.println("배열 a의 최소값은 " + min(a) + "입니다.");

        System.out.print("인덱스는 { ");
        int xmin[] =  minIndexArr(a);
        for(int i = 0; i < xmin.length; i++)
            System.out.print(xmin[i]+" ");
        System.out.println("}입니다.");

        System.out.println("배열 a의 최대값은 " + max(a) + "입니다.");
        // System.out.println("인덱스는 {" + +" "+ + "}입니다.");


    }
}
