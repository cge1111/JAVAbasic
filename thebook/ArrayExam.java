package thebook;

public class ArrayExam {
    public int[] makeArray() {
        // array가 1부터 5까지 값을 가지는, 길이가 5인 int 배열을 만들어보세요.
        int [] array = {1,2,3,4,5};
        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        return array;
    }
    public static void main(String[] args) {
        ArrayExam exam = new ArrayExam();
        int [] array = exam.makeArray();
        if(array.length==5 &&
            array[0] ==1 &&
            array[1] ==2 &&
            array[2] ==3 &&
            array[3] ==4 &&
            array[4] ==5) {
            System.out.println("정답입니다.");
}
        else{
            System.out.println("틀렸습니다.");
}

    }
}

/*
int[] array2 = new int[] {1,2,3,4};
int[] array3 = {1,2,3,4};

int value = array3[0];
System.out.println(value);
*/