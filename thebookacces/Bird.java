package thebookacces;   // 39. 추상클래스

public abstract class Bird {
    public abstract void sing();  
    // 추상 클래스는 부모 클래스로 사용할 수는 있지만, 객체를 생성할 수는 없다
    public void fly() {
        System.out.println("날다.");
    }

}


