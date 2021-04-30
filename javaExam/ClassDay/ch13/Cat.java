package ch13;

class Cat extends Animal{
    int age;   // 고양이 나이

    public Cat(String name, int age) {
        super(name); this.age = age;  // 부모에게 상속받음
    }

    public void bark() {
        System.out.println("냐옹!");
    }
}



