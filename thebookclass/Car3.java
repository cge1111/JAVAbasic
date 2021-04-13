package thebookclass;  // 생성자 오버로딩과 this

public class Car3 {
    String name;
    int number;    
    
    public Car3() {
        // this.name = "이름없음";
        // this.number = 0;
        this("이름없음",0);
    }

    public Car3(String name) {
        // this.name = name;  // 이름 o
        // this.number = 0;   // 숫자 x
        this(name, 0);
    }

    public Car3(String name, int number) {
        this.name = name;       // 이름 o,생성자 호출 -> 최종 생성
        this.number = number;   // 숫자 o
    }
}

/* 
생성자 오버로딩과 this 실습
https://thebook.io/006889/ch06/35/01/
*/