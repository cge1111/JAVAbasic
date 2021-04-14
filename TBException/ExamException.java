package TBException; // 49. Throws 예제

public class ExamException {
    public int get50thItem(int []array) throws ArrayIndexOutOfBoundsException {
        return array[49];
    }
}
