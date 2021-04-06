객체 변수 (Instance variable)
package Object;
public class Animal {
    String name;
    public static void main(String args[]) {
        
        Animal cat = new Animal();
        System.out.println(cat.name); // 객체:cat, 객체변수: name
    }
}

예1)
setName메소드를 호출할 수 있도록 main메소드를 다음과 같이 수정해 보자.
public class Animal {
    String name;
    public void setName(String name) {
        this.name = name;  // cat.name = "boby"; , dog.name = "happy";
    }
    public static void main(String[] args) {
        
        Animal cat = new Animal();
        cat.setName("body");   // 메소드 호출

        Animal dog = new Animal();
        dog.setName("happy");

        System.out.println(cat.name);
        System.out.println(dog.name);   // body happy
    }
}
