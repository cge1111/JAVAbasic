package thebookclass;  // 25. 필드선언

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        // Car라는 인스턴스가 메모리에 두 개 만들어집니다. 
        // 객체별로 name과 number라는 필드를 가집니다.


        // c1.name은 c1이 참조하는 객체의 name을 의미합니다.
        c1.name = "소방차";             // c1이 참조하는 객체의 name을 소방차로 설정 
        c1.number = 1234;              // c1이 참조하는 객체의 number를 1234로 설정 

        c2.name = "구급차";
        c2.number = 1111;

        System.out.println(c1.name);   // 콘솔에 c1이 참조하는 객체의 name을 출력 
        System.out.println(c1.number); // 콘솔에 c1이 참조하는 객체의 number를 출력 
        System.out.println(c2.name);
        System.out.println(c2.number);
    }
}


