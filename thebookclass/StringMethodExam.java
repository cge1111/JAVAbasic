package thebookclass;  // 29. String 클래스의 메서드

public class StringMethodExam {
    public static void main(String[] atgs) {
        // String str = new String("hello"); = String str = "hello"
        String str = "hello";
        System.out.println(str.length());  // 글자 수 셈(공백도 글자다!)
        System.out.println(str.concat(" world"));   // concat은 문자열과 문자열을 결합
        System.out.println(str);  // hello

        str = str.concat(" world");
        System.out.println(str);

        // substring 메서드는 원하는 부분까지 문자열을 잘라낼 수 있는 메서드(공백까지 포함)
        System.out.println(str.substring(3));     // lo world
        System.out.println(str.substring(3,6));  // lo :(공백까지 포함)
        System.out.println(str.substring(0,3));  // hel
    }
}


// String 클래스의 메서드 실습
// https://thebook.io/006889/ch05/29/01/