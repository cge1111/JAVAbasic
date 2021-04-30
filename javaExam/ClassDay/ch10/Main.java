package ch10;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {

    // 10 - 6 실수값을 읽어서 절댓값과 제곱근을 구하고, 해당 값을 반지름으로 하는 원의 면적을 구하자.
    Scanner sc = new Scanner(System.in);

    System.out.print("실수값:");
    double x = sc.nextDouble();

    System.out.println("절댓값:" + Math.abs(x));
    System.out.println("제곱근:" + Math.sqrt(x));
    System.out.println("면  적:" + Math.PI*x*x);


    }
    
}
