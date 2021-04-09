package thebook;  // While 은 선 판정

public class WhileExam {
    public static void main(String[] args) {
        int i = 1;

        while (i < 11) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        
    }
}