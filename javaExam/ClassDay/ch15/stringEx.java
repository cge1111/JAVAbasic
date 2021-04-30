package ch15;

import java.util.*;

public class stringEx {
    public static void main(String args[]) {

    // 15 - 4 문자열을 읽어서 그 문자열을 역순으로 표시하는 프로그램을 작성하자.
    // Scanner sc = new Scanner(System.in);
    // System.out.print("문자열:");
    // String s = sc.next();
    // System.out.print("반대로 읽으면 ");
    // for(int i = s.length()-1 ; i >= 0;i--){
    //   System.out.print(s.charAt(i));
    // }
    // System.out.print("입니다. ");


    // 15 - 6 문자열 s1안에 문자열 s2가 포함됐는지 확인하는 프로그램작성, 포함돼 있지 않으면 "s1안에 s2가 포함돼 있지 않습니다."표시, 일치하는 부분을 위아래 정렬
    Scanner sc = new Scanner(System.in);
    System.out.print("문자열 s1:");   String s1 = sc.next();
    System.out.print("문자열 s2:");   String s2 = sc.next();
    
    int idx = s1.indexOf(s2);   // 포함되어있는지 유무
    if(idx == -1)
        System.out.println("s1안에 s2가 포함돼 있지 않습니다.");
    else {
        System.out.println(s1);
        for(int i = 0; i < idx; i++) 
            System.out.print(" ");
        System.out.println(s2);
    }
 
    
    


    
  
  }
}
