
// 생성자 : 클래스가 객체화 될 때 단 한번 호출되는 친구
// 생성자 문법은 매소드와 유사하나 리턴형이 없고 이름이 클래스명과 같아야함
// 생성자를 쓰는 가장 큰 목적은 맴버변수 초기화

class MyCon {
    int age;
    String name;

    public  MyCon( ) {
        age = 20;
        name = "홍길동";
    }
    // 생성자
    public  MyCon( int a , String n) {
        age = a;
        name = n;
        System.out.println("생성자 호출");
    }
    public  MyCon(String n, int a) {
        age = a;
        name = n;
    }
}

public class ConstructorEx {
    public static void main(String args[]) {
        MyCon m1 = new MyCon(10, "김길동");
        System.out.println(m1.name);

        MyCon m2 = new MyCon("박길동", 30);
        System.out.println(m2.name);


    }
}
