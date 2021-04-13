package thebookacces;  // 38. 접근제한자

public class AccessObj {
    public int p = 3;      // 접근 제한자
    protected int p2 = 4;  // 접근 제한자
    // protected : 같은 패키지인 경우만 접근을 허용, 다른 패키지라도 상속받은 경우에는 접근을 허용
    private int  i = 1;   // 접근 제한자, 이름 그대로 자기 자신만 접근
    int k = 2;

}


/*

public > protected > private > default : 접근제한자의 범위가 넓은 순서

public :    모든 접근을 허용
protected : 같은 패키지 & 상속을 받은 다른 패키지의 접근을 허용
private :   자기 자신의 접근만 허용
default :   자기 자신 & 자기 자신과 같은 패키지 안에서 접근을 허용

*/

/*
접근 제한자 실습
https://thebook.io/006889/ch07/38/01/
*/