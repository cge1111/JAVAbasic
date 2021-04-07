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
// 05_1_클래스_예제
package Object;

public class Animal {  
    String name;
    public void setName(String name) {
        this.name = name;  // cat.name = "boby"; , dog.name = "happy";
    }
    // 객체 : horse,  이름 :nabi 부여 추가
    // 객체 : rabbit, 이름 :mija 부여 추가
    public static void main(String[] args) {
        
        Animal cat = new Animal();
        cat.setName("body");   // 메소드 호출

        Animal dog = new Animal();
        dog.setName("happy");

        Animal horse = new Animal();
        horse.setName("nabi");

        Animal rabbit = new Animal();
        rabbit.setName("mija");

        System.out.println(cat.name);
        System.out.println(dog.name);
        System.out.println(horse.name);
        System.out.println(rabbit.name);
    }
}
