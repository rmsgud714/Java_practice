class A{
    public void printA() {
    System.out.println("B 클래스 안에 있는 printA()");
    }
}

class B extends A{
    public void printB() {
        System.out.println("B");
    }
}

public class OOPEx2 {
    public static void main(String args[]) {
        A a = new A(); // a는 객체화된 A의 주소값을 가져감
        a.printA();

        B b = new B();
        b.printB();
        b.printA();

        A c = new B();
//        c.printB();    안됨
    }
}
