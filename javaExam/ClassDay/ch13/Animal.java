package ch13;

// 13 - 1 개와 고양이 클래스 각각 작성하고 Animal에서 파생시킬 것, 동물 이름필드, 게터, 짖기 메서드
abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void bark();  // 짖기

    public String getName() {  // 이름가져오기
        return name;
    }

    public static void main(String args[]) {
        Dog dog = new Dog("뭉치", "멍멍");
        Cat cat = new Cat("마이클", 5);
        
        System.out.print(dog.name + " ");
        dog.bark();
        System.out.print(cat.name + " ");
        cat.bark();
        
    }
}

  