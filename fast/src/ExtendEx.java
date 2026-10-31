

// 자바에서 상속(extends)
// 자바에서 상속의 대상은 기본적으로 class
// 특정 클래스 상석을 위해서 자바에서는 "extends" 문법을 사용
class MyA{
    int x = 10;
    public MyA() {
    }
    public MyA(int x) {
        this.x = x;
    }

    public void printX() {
        System.out.println( "x = " + x );
    }
}

class MyB extends MyA {
    int x = 10;
    public MyB(int x ) {
        // 상위 클래스 생성자에 있는 코드 복사 해서 붙여넣기
    }
}

public class ExtendEx {
    public static void main(String args[]) {
        // MyA 클래스 객체화(메모리에 올리기)
        // MyA a = new MyA(); // 생성자
        MyA a = new MyA( 5 );
        System.out.println( a.x );
        a.printX();

        //MyB b = new MyB();
        MyB b = new MyB( 15 );  // 생성자는 상속이 안됨
        System.out.println( b.x );

        b.x = 20;
        b.printX();


    }
}
