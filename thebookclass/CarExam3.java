package thebookclass;  // 35. 생성자 오버로딩과 this

public class CarExam3 {
    public static void main(String[] args) {
        Car3 car1 = new Car3();
        Car3 car2 = new Car3("자동차");
        Car3 car3 = new Car3("자동차",1234);
    System.out.println(car1.name +" , "+car1.number);
    System.out.println(car2.name +" , "+car2.number);
    System.out.println(car3.name +" , "+car3.number);
    }
}
