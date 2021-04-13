package thebookclass;  // 34. 메서드 오버로딩

public class MyClass2 {
    public int plus (int x, int y) {
        return x + y;
    }

    public int plus (int x, int y, int z) {
        return x + y + z;
    }

    public String plus (String x, String y) {  // 반환 String
        return x + y;
    }

}
