class A{
    public A() {
        System.out.println("A 객체화 됨");
    }
}
class B extends A{
    public B() {
        // 상위 클래스에 생성자에 있는 코드 복자 해서 붙여넣기 안해도됨
        super();
    }
}
public class OOPEx2 {
    public static void main(String args[]) {
        new B(); //  왜 A가 출력되지 객체화만 했는데
//        A a = new A();
//        B b = new B();
//
//        A c = new B(); // 권장되는 코드
//        B d = new A(); // 불가능한 코드

    }
}
