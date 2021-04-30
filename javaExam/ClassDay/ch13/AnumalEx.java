package ch13;


abstract class AnimalEx{
  private String name;
  public AnimalEx(String name){
  this.name = name;
  }
  public abstract void bark();

  public String getName() {
    return name;
  }
  public void introduce() {
    System.out.print(toString()+"이다. ");
    bark();

  }
  
}

class Dogs extends AnimalEx{
  private String type;  //개 종류
  public Dogs(String name, String type){ // 생성자
    super(name);this.type = type;
  }
  public void bark() {
    System.out.println("멍멍!");  //짖기
  }
  public String toString() {
    return type + "의 "+getName();
  }

}

class Cats extends AnimalEx{
  int age;                          // 고양이의 나이
  public Cats(String name, int age){ // 생성자
    super(name);this.age = age;
  }
    public void bark() {             //짖기
    System.out.println("냐옹!");
  }
    public String toString() {
    return age + "의 "+getName();
  }


}
class Mains{
    public static void main(String[] args){
      // Animal x = new Animal(); // 추상 클래스는 인스턴스르 생성할 수 없다. 
    
      AnimalEx[] a = new AnimalEx[2];
      a[0] = new Dogs("뭉치","치와와");
      a[1] = new Cats("마이클",7);
    
      for (int i = 0 ; i <a.length ; i++) {
        System.out.println("a["+i+"] =" + a[i]);
      }
      for (int i = 0 ; i <a.length ; i++) {
        System.out.print("a["+i+"] =");
        a[i].introduce();
      }
    }
}
    
