package Hello;

public class toUpperCaseExam {
    public static void main(String args[]) {

        String b = "Hello Java";
        System.out.println(b.toUpperCase()); // HELLO JAVA
        //  문자열을 모두 대문자로 변경하고자 할 때 사용

        String a = "Hello Java";

        System.out.println(a.indexOf("Java"));
        System.out.println(a.replaceAll("Java", "World"));
        System.out.println(a.substring(0, 4));
        System.out.println(a.toUpperCase());

    }
    
}
