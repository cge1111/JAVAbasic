package TBException;  // 51. 사용자 정의 Exception

public class BizExam {
    public static void main(String[] args) {
        BizService biz = new BizService();
        biz.bizMethod(5);
        try{
            biz.bizMethod(-3);
        }catch(Exception e) {
            e.printStackTrace();
        }
        biz.bizMethod(-3);
        System.out.println("프로그램 종료");
    }
}
