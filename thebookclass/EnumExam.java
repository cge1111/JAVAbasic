package thebookclass;  // 31. 열거형

public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main(String[] args) {
        String gender1;
        // ‘gender1 = 클래스명 + 마침표 + 상수로 선언해놓은 MALE 혹은 FEMALE’.
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        Gender gender2;  // Gender == String와 같이 자료형이 됨
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
    }
}

// enum 열거형 이름 { 값1, 값2 }
// Enum 이름은 클래스 명명 규칙을 따르며, 세부 항목의 이름은 모두 대문자를 사용합니다.
// 특정값만 대입할 때 사용된다.
// 자바의 자료형은 크게 기본 자료형(int, float, char, ...)과 참조 자료형(class, ...)으로 나뉩니다.
//  enum은 참조 자료형에 속하며 enum형을 가진 형태의 클래스입니다.
enum Gender{
    MALE, FEMALE;
}