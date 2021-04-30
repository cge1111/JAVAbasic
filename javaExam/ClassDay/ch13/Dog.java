package ch13;

class Dog extends Animal{
    String type; // 개 종류
    public Dog(String name, String type) {
        super(name); this.type = type;

    }
    public void bark() {
        System.out.println("멍멍!");
    }
}



