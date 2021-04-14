package TBException; // 49. Throws 예제

public class ExamExam {
    public static void main(String[] args) {
        ExamException ex = new ExamException();      
        int num = ex.get50thItem(new int[100]);
        System.out.println("array 배열의 50번째 요소의 값 : "+ num);

        ExamException ex2 = new ExamException(); 
        int num2 = ex2.get50thItem(new int[30]);
        System.out.println("array 배열의 50번째 요소의 값 : "+ num2);  // 에러남
    }
}
