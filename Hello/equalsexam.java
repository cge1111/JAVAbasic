package Hello;

public class equalsexam {
    public static void main(String args[]) {
    
        String a = "hello";
        String b = "java" ;
        String c = "hello";  // 같은 사람 a = c
        String d = new String("hello");  // 동명이인 = 이름이 같은 두명이 됨 a != d
        System.out.println(a.equals(b));  // false
        System.out.println(a.equals(c));  // true
        System.out.println(a == c);  // true
        System.out.println(a == d);  // false
        System.out.println(a.equals(d));  // true
        System.out.println(a);  // hello
        System.out.println(d);  // hello
        System.out.println(System.identityHashCode(a)); // 주소 알려줌
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        
    }
}
