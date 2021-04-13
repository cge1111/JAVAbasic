package thebookacces;    // 40. super와 부모 생성자

public class TruckExam {
    public static void main(String[] args) {
        Truck t = new Truck();  
        // Truck이 인스턴스화될 때 부모인 Car 객체도 인스턴스화
        /*생성자는 객체를 초기화합니다.
        생성자가 호출될 때 자동으로 부모의 생성자가 호출되면서 부모 객체를 초기화합니다.
        부모의 생성자를 호출할 때는 부모 객체를 나타내는 super라는 키워드를 사용합니다. 
        super()를 붙이면 부모 생성자가 호출 */
    }
}
